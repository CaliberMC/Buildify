package com.calibermc.buildify.util;

import com.calibermc.buildify.Buildify;
import com.calibermc.buildify.config.CommonConfigs;
import com.google.common.collect.Maps;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.JsonOps;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.BlockFamilies;
import net.minecraft.data.BlockFamily;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.SimpleJsonResourceReloadListener;
import net.minecraft.util.profiling.ProfilerFiller;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

import java.util.*;
import java.util.function.Supplier;

public class BlockPickerStatesJson extends SimpleJsonResourceReloadListener {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();
    private static BlockPickerStatesJson INSTANCE;
    public Map<Block, Supplier<List<ItemStack>>> registeredBlockStates = Maps.newHashMap();

    public BlockPickerStatesJson() {
        super(GSON, "blockpicker");
        INSTANCE = this;
    }

    @Override
    protected void apply(Map<ResourceLocation, JsonElement> map, ResourceManager iResourceManager, ProfilerFiller iProfiler) {
        for (Map.Entry<ResourceLocation, JsonElement> entry : map.entrySet()) {
            ResourceLocation resourcelocation = entry.getKey();
            try {
                JsonObject o = entry.getValue().getAsJsonObject();
                Block block = BuiltInRegistries.BLOCK.get(new ResourceLocation(o.get("main_block").getAsString()));
                List<ItemStack> itemStacks = new ArrayList<>();
                for (JsonElement blocks : o.getAsJsonArray("blocks")) {
                    if (blocks.isJsonObject()) {
                        itemStacks.add(ItemStack.CODEC.parse(JsonOps.INSTANCE, blocks).getOrThrow(false, errMessage -> {}));
                    } else {
                        itemStacks.add(new ItemStack(BuiltInRegistries.ITEM.get(new ResourceLocation(blocks.getAsString()))));
                    }
                }
                this.registeredBlockStates.put(block, () -> itemStacks);
            } catch (Exception e) {
                Buildify.LOGGER.error("Parsing error loading blockstates for {}", resourcelocation, e);
            }
        }
        Buildify.LOGGER.info("Loaded {} custom blockstates for block-picker", this.registeredBlockStates.size());
    }

    public static Map<Block, Supplier<List<ItemStack>>> getBlockStates() {
        Map<Block, Supplier<List<ItemStack>>> blockStates = Maps.newHashMap();
        blockStates.putAll(BLOCKS_STATES);
        for (Map.Entry<Block, Supplier<List<ItemStack>>> e : getInstance().registeredBlockStates.entrySet()) {
            List<ItemStack> otherVariants = blockStates.containsKey(e.getKey()) ? blockStates.get(e.getKey()).get() : new ArrayList<>();
            blockStates.put(e.getKey(), () -> {
                List<ItemStack> itemStacks = new ArrayList<>(e.getValue().get());
                itemStacks.addAll(otherVariants);
                return itemStacks;
            });
        }
        return blockStates;
    }

    public static BlockPickerStatesJson getInstance() {
        return INSTANCE == null ? new BlockPickerStatesJson() : INSTANCE;
    }

    protected static final HashMap<Block, Supplier<List<ItemStack>>> BLOCKS_STATES = new HashMap<>();

    public static void registerBlockFamily(Block block, Supplier<List<ItemStack>> items) {
        List<ItemStack> otherVariants = BLOCKS_STATES.containsKey(block) ? BLOCKS_STATES.get(block).get() : new ArrayList<>();
        BLOCKS_STATES.put(block, () -> {
            List<ItemStack> itemStacks = new ArrayList<>(items.get());
            for (ItemStack itemStack : otherVariants) {
                if (items.get().stream().noneMatch(stack -> stack.getItem().equals(itemStack.getItem()))) {
                    itemStacks.add(itemStack);
                }
            }
            return itemStacks;
        });
    }

    static {
        Map<Block, Supplier<List<ItemStack>>> map = new HashMap<>();
        Set<Block> processedBaseBlocks = new HashSet<>();
        boolean useVanillaBlockFamilies = CommonConfigs.USE_VANILLA_BLOCK_FAMILIES.get();

//        for (ModBlockFamily modBlockFamily : ModBlockFamilies.getAllFamilies().toList()) {
//            processedBaseBlocks.add(modBlockFamily.getBaseBlock());
//
//            // Process modBlockFamily and add it to the map
//            List<ItemStack> otherVariants = map.containsKey(modBlockFamily.getBaseBlock()) ?
//                    map.get(modBlockFamily.getBaseBlock()).get() : Lists.newArrayList();
//            map.put(modBlockFamily.getBaseBlock(), () -> {
//                List<ItemStack> itemStacks = new ArrayList<>(modBlockFamily.getVariants().values().stream()
//                        .map(block -> block.asItem().getDefaultInstance()).toList());
//                itemStacks.addAll(otherVariants);
//                return itemStacks;
//            });
//        }

        if (useVanillaBlockFamilies) {
            for (BlockFamily blockFamily : BlockFamilies.getAllFamilies().toList()) {
                Block baseBlock = blockFamily.getBaseBlock();

                // Check if baseBlock has already been processed
                if (!processedBaseBlocks.contains(baseBlock)) {
                    map.put(baseBlock, () -> blockFamily.getVariants().entrySet().stream()
                            .filter(p -> !p.getKey().equals(BlockFamily.Variant.WALL_SIGN))
                            .map(p -> p.getValue().asItem().getDefaultInstance()).toList());
                }
            }
        }

        BLOCKS_STATES.putAll(map);
    }
}
