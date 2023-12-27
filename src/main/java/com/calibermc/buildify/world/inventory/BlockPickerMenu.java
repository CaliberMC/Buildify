package com.calibermc.buildify.world.inventory;

import com.calibermc.buildify.util.BlockPickerStatesJson;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

import java.util.*;
import java.util.function.Supplier;

public class BlockPickerMenu extends AbstractContainerMenu {

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
        Supplier<List<ItemStack>> supplier = BlockPickerStatesJson.getBlockStates().get(Block.byItem(this.stack.getItem()));
        if (supplier != null) {
            List<ItemStack> stacks = supplier.get();
            pContainer = new SimpleContainer(stacks.size());
            for (int i = 0; i < stacks.size(); i++) {
                pContainer.setItem(i, stacks.get(i));
            }
        } else {
            for (Map.Entry<Block, Supplier<List<ItemStack>>> e : BlockPickerStatesJson.getBlockStates().entrySet()) {
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
