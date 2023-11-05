package com.calibermc.caliber.world.inventory;

import com.calibermc.caliber.data.ModBlockFamilies;
import com.calibermc.caliber.data.ModBlockFamily;
import com.calibermc.caliber.block.ModBlocks;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import net.minecraft.data.BlockFamilies;
import net.minecraft.data.BlockFamily;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;

import java.util.*;
import java.util.function.Supplier;

public class BlockPickerMenu extends AbstractContainerMenu {

    protected static final ImmutableMap<Block, Supplier<List<ItemStack>>> BLOCKS_STATES;

    static {
        Map<Block, Supplier<List<ItemStack>>> map = new HashMap<>();

        Set<Block> processedBaseBlocks = new HashSet<>();

        for (ModBlockFamily modBlockFamily : ModBlockFamilies.getAllFamilies().toList()) {
            processedBaseBlocks.add(modBlockFamily.getBaseBlock());

            // Process modBlockFamily and add it to the map
            List<ItemStack> otherVariants = map.containsKey(modBlockFamily.getBaseBlock()) ?
                    map.get(modBlockFamily.getBaseBlock()).get() : Lists.newArrayList();
            map.put(modBlockFamily.getBaseBlock(), () -> {
                List<ItemStack> itemStacks = new ArrayList<>(modBlockFamily.getVariants().values().stream()
                        .map(block -> block.asItem().getDefaultInstance()).toList());
                itemStacks.addAll(otherVariants);
                return itemStacks;
            });
        }

        for (BlockFamily blockFamily : BlockFamilies.getAllFamilies().toList()) {
            Block baseBlock = blockFamily.getBaseBlock();

            // Check if baseBlock has already been processed
            if (!processedBaseBlocks.contains(baseBlock)) {
                map.put(baseBlock, () -> blockFamily.getVariants().values().stream()
                        .map(block -> block.asItem().getDefaultInstance()).toList());
            }
        }

        var builder = new ImmutableMap.Builder<Block, Supplier<List<ItemStack>>>();
        builder.putAll(map);
        BLOCKS_STATES = builder.build();
    }

    public final ItemStack stack;

    public BlockPickerMenu(int pContainerId, Inventory pPlayerInventory) {
        this(pContainerId, pPlayerInventory, new SimpleContainer(0));
    }

    public BlockPickerMenu(int pContainerId, Inventory pPlayerInventory, Container pContainer) {
        super(ModMenuTypes.BLOCK_TYPE.get(), pContainerId);

        this.stack = pPlayerInventory.player.getMainHandItem().copy();
        // set count to 1, for render main slot
        this.stack.setCount(1);



        // getting from map item stacks that will be displayed in slots
        Supplier<List<ItemStack>> supplier = BLOCKS_STATES.get(Block.byItem(this.stack.getItem()));
        if (supplier != null) {
            List<ItemStack> stacks = supplier.get();
            pContainer = new SimpleContainer(stacks.size());
            for (int i = 0; i < stacks.size(); i++) {
                pContainer.setItem(i, stacks.get(i));
            }
        } else {
            for (Map.Entry<Block, Supplier<List<ItemStack>>> e : BLOCKS_STATES.entrySet()) {
                Supplier<List<ItemStack>> sup = e.getValue();
                if (sup.get().stream().anyMatch(i -> i.is(this.stack.getItem()))) {
                    List<ItemStack> stacks = new ArrayList<>(sup.get());
                    stacks.removeIf(p -> p.is(this.stack.getItem()));
                    stacks.add(new ItemStack(e.getKey()));

                    pContainer = new SimpleContainer(stacks.size());
                    for (int i = 0; i < stacks.size(); i++) {
                        pContainer.setItem(i, stacks.get(i));
                    }
                }
            }
        }

        pContainer.startOpen(pPlayerInventory.player);

        this.addSlot(new BlockPickerSlot(new SimpleContainer(this.stack), 0, 0, 0, 2F));

        for (int i = 0; i < pContainer.getContainerSize(); i++) {
            this.addSlot(new BlockPickerSlot(pContainer, i, i * 20, 40, 1F));
        }

        for (int i = 0; i < 9; ++i) {
            this.addSlot(new Slot(pPlayerInventory, i, i * 20, 190));
        }
    }

    @Override
    public void setRemoteCarried(ItemStack pRemoteCarried) {
        super.setRemoteCarried(pRemoteCarried);
        this.setCarried(pRemoteCarried);
    }

    @Override
    public boolean stillValid(Player pPlayer) {
        return !this.stack.isEmpty() && ItemStack.isSame(pPlayer.getMainHandItem(), this.stack);
    }


}
