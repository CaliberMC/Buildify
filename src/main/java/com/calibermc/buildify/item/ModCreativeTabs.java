package com.calibermc.buildify.item;

import com.calibermc.buildify.Buildify;
import com.calibermc.buildify.config.CommonConfigs;
import com.calibermc.buildify.util.ModTags;
import com.google.common.collect.Lists;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.tags.ITagManager;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;


public class ModCreativeTabs {
    private static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Buildify.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BUILDIFY_TAB = CREATIVE_TABS.register("buildify",
            () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.buildify"))
                    .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
                    .icon(() -> new ItemStack(Blocks.STONE))
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.HAMMER.get());
                        pOutput.accept(ModItems.NAILS.get());
                    }))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_TABS.register(eventBus);
    }

    // ------------------------------------------------------
    // Sorting thing
    // ------------------------------------------------------

    // TODO: Add back Brewing and Misc Tabs

    static {
        //boolean loadedCaliber = ModList.get().isLoaded("caliber");
        BiFunction<String, Block, Supplier<ItemStack>> caliberBlocks = (s, b) -> () -> new ItemStack(ForgeRegistries.BLOCKS.getHolder(
                new ResourceLocation("caliber:%s".formatted(s))
        ).orElse(Holder.direct(b)).get());

        ResourceKey<CreativeModeTab> beforeTab = CreativeModeTabs.BUILDING_BLOCKS;

        beforeTab = createTab(beforeTab, "cobble_brick", caliberBlocks.apply("cobbled_dark_limestone", Blocks.COBBLESTONE), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : tags.getTag(ModTags.Items.cobbleBricksTab)) {
                    pOutput.accept(new ItemStack(item));
                }
            }
        });
        beforeTab = createTab(beforeTab, "planks_beams", () -> new ItemStack(Blocks.OAK_PLANKS), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : tags.getTag(ModTags.Items.planksBeamsTab)) {
                    pOutput.accept(new ItemStack(item));
                }
            }
        });
        beforeTab = createTab(beforeTab, "roofing", caliberBlocks.apply("acacia_shingle_roof_45", Blocks.ACACIA_PLANKS), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : tags.getTag(ModTags.Items.roofingTab)) {
                    pOutput.accept(new ItemStack(item));
                }
            }
        });
        beforeTab = createTab(beforeTab, "plaster_stucco", caliberBlocks.apply("beige_plaster", Blocks.SAND), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : tags.getTag(ModTags.Items.plasterStuccoTab)) {
                    pOutput.accept(new ItemStack(item));
                }
            }
        });
//        beforeTab = createTab(beforeTab, "half_timbered_walls", () -> new ItemStack(ModBlocks.TUDOR_DARK_OAK_BEIGE_PLASTER.get(ModBlockFamily.Variant.CROSS))) {
        beforeTab = createTab(beforeTab, "half_timbered_walls", caliberBlocks.apply("tudor_acacia_beige_plaster_left", Blocks.ACACIA_SLAB), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : tags.getTag(ModTags.Items.halfTimberedWallTab)) {
                    pOutput.accept(new ItemStack(item));
                }
            }
        });
        beforeTab = createTab(beforeTab, "tiles_flooring", () -> new ItemStack(Blocks.BROWN_GLAZED_TERRACOTTA), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : tags.getTag(ModTags.Items.tilesFlooringTab)) {
                    pOutput.accept(new ItemStack(item));
                }
            }
        });
        beforeTab = createTab(beforeTab, "glass_windows", () -> new ItemStack(Blocks.GLASS), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : tags.getTag(ModTags.Items.glassWindowsTab)) {
                    pOutput.accept(new ItemStack(item));
                }
            }
        });
        beforeTab = createTab(beforeTab, "lighting", () -> new ItemStack(Blocks.LANTERN), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : tags.getTag(ModTags.Items.lightingTab)) {
                    pOutput.accept(new ItemStack(item));
                }
            }
        });
        beforeTab = createTab(beforeTab, "crafting", () -> new ItemStack(Items.CRAFTING_TABLE), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : tags.getTag(ModTags.Items.craftingTab)) {
                    pOutput.accept(new ItemStack(item));
                }
            }
        });
        beforeTab = createTab(beforeTab, "stone", () -> new ItemStack(Blocks.STONE), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : tags.getTag(ModTags.Items.stoneTab)) {
                    pOutput.accept(new ItemStack(item));
                }
            }
        });
        beforeTab = createTab(beforeTab, "sand_gravel", () -> new ItemStack(Blocks.SAND), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : tags.getTag(ModTags.Items.sandGravelTab)) {
                    pOutput.accept(new ItemStack(item));
                }
            }
        });
        beforeTab = createTab(beforeTab, "grass_dirt", () -> new ItemStack(Blocks.GRASS_BLOCK), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : tags.getTag(ModTags.Items.grassDirtTab)) {
                    pOutput.accept(new ItemStack(item));
                }
            }
        });
        beforeTab = createTab(beforeTab, "metals_ores", () -> new ItemStack(Blocks.GOLD_ORE), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : tags.getTag(ModTags.Items.metalsOresTab)) {
                    pOutput.accept(new ItemStack(item));
                }
            }
        });
//            @Override
//            public void fillItemList(NonNullList<ItemStack> pOutput) {
//                for(Item item : ModifiedTab.getItems()) {
//                    if (Block.byItem(item) instanceof OreBlock
//                            ) {
//                        pOutput.accept(new ItemStack(item));
//                    }
//                }
//            }
        beforeTab = createTab(beforeTab, "logs", () -> new ItemStack(Blocks.OAK_LOG), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : tags.getTag(ModTags.Items.logsTab)) {
                    pOutput.accept(new ItemStack(item));
                }
            }
        });
        beforeTab = createTab(beforeTab, "leaves", () -> new ItemStack(Blocks.ACACIA_LEAVES), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : tags.getTag(ModTags.Items.leavesTab)) {
                    pOutput.accept(new ItemStack(item));
                }
            }
        });
        beforeTab = createTab(beforeTab, "flowers_plants", () -> new ItemStack(Blocks.POPPY), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : tags.getTag(ModTags.Items.flowersPlantsTab)) {
                    pOutput.accept(new ItemStack(item));
                }
            }
        });
        beforeTab = createTab(beforeTab, "crops", () -> new ItemStack(Blocks.WHEAT), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : tags.getTag(ModTags.Items.cropsTab)) {
                    pOutput.accept(new ItemStack(item));
                }
            }
        });
        beforeTab = createTab(beforeTab, "decor", () -> new ItemStack(Blocks.BLUE_BANNER), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : tags.getTag(ModTags.Items.decorTab)) {
                    pOutput.accept(new ItemStack(item));
                }
            }
        });
        beforeTab = createTab(beforeTab, "furniture", () -> new ItemStack(Blocks.BROWN_BED), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : tags.getTag(ModTags.Items.furnitureTab)) {
                    pOutput.accept(new ItemStack(item));
                }
            }
        });
        beforeTab = createTab(beforeTab, "storage", () -> new ItemStack(Blocks.CHEST), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : tags.getTag(ModTags.Items.storageTab)) {
                    pOutput.accept(new ItemStack(item));
                }
            }
        });
        beforeTab = createTab(beforeTab, "redstone", () -> new ItemStack(Items.REDSTONE), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : tags.getTag(ModTags.Items.redstoneTab)) {
                    pOutput.accept(new ItemStack(item));
                }
            }
        });
        beforeTab = createTab(beforeTab, "food", () -> new ItemStack(Items.APPLE), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : tags.getTag(ModTags.Items.foodTab)) {
                    pOutput.accept(new ItemStack(item));
                }
            }
        });
        beforeTab = createTab(beforeTab, "tools_weapons", () -> new ItemStack(Items.IRON_SWORD), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : tags.getTag(ModTags.Items.toolsWeaponsTab)) {
                    pOutput.accept(new ItemStack(item));
                }
            }
        });
//            @Override
//            public void fillItemList(NonNullList<ItemStack> pOutput) {
//                for(Item item : ForgeRegistries.ITEMS) {
//                    if (!(item instanceof ArmorItem || item instanceof EnchantedBookItem)) {
//                        item.fillItemCategory(TAB_COMBAT, pOutput);
//                        item.fillItemCategory(TAB_TOOLS, pOutput);
//                    }
//                }
//                    });
        beforeTab = createTab(beforeTab, "armor", () -> new ItemStack(Items.IRON_CHESTPLATE), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : tags.getTag(ModTags.Items.armorTab)) {
                    pOutput.accept(new ItemStack(item));
                }
            }
        });
    }

    public static List<CreativeModeTab> setupCreativeTabs(List<CreativeModeTab> tabsOld) {
        boolean removeMCTabs;
        try {
            removeMCTabs = CommonConfigs.CUSTOM_CREATIVE_INVENTORY.get();
        } catch (Throwable e) {
            removeMCTabs = false;
        }
        List<CreativeModeTab> tabs = Lists.newArrayList(tabsOld);
        // copy mc tabs
        if (removeMCTabs) {
            for (CreativeModeTab tab : BuiltInRegistries.CREATIVE_MODE_TAB) {
                if (BuiltInRegistries.CREATIVE_MODE_TAB.getKey(tab).getNamespace().equals("minecraft")) {
                    tabs.remove(tab);
                }
            }
        }

        for (CreativeModeTab tab : Lists.newArrayList(tabs)) {
            if (tab.getDisplayItems().isEmpty()) {
                tabs.remove(tab); // remove tabs that empty
            }
        }

        return tabs;
    }

    public static ResourceKey<CreativeModeTab> createTab(ResourceKey<CreativeModeTab> key, String label, Supplier<ItemStack> iconStack, CreativeModeTab.DisplayItemsGenerator displayItems) {
        return CREATIVE_TABS.register(label, () -> CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.%s".formatted(label)))
                .withTabsBefore(key)
                .icon(iconStack).displayItems(displayItems).build()).getKey();
    }

}
