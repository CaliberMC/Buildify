package com.calibermc.buildify.mixin;

import com.calibermc.buildify.networking.ModNetworking;
import com.calibermc.buildify.networking.ServerUpdateSlots;
import com.calibermc.buildify.util.IInvScreenExtended;
import com.calibermc.buildify.util.player.IPlayerExtended;
import com.mojang.blaze3d.vertex.PoseStack;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.client.gui.screens.inventory.EffectRenderingInventoryScreen;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.InventoryMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import org.apache.commons.compress.utils.Lists;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(InventoryScreen.class)
public abstract class InventoryScreenMixin extends EffectRenderingInventoryScreen<InventoryMenu> implements IInvScreenExtended {

    @Unique
    private int buildify$lineOfSlots = -1;

    public InventoryScreenMixin(InventoryMenu pMenu, Inventory pPlayerInventory, Component pTitle) {
        super(pMenu, pPlayerInventory, pTitle);
    }

    @Override
    public int buildify$lineOfSlots() {
        return this.buildify$lineOfSlots;
    }

    @Inject(method = "mouseReleased", at = @At("HEAD"), cancellable = true)
    public void mixin$mouseReleased(double pMouseX, double pMouseY, int pButton, CallbackInfoReturnable<Boolean> cir) {
        try {
            if (pButton == 0 && this.buildify$lineOfSlots != -1) {
                boolean b = false;
                for (int i = 0; i < 4; i++) {
                    int y = 83 + i * 19 - 1;
                    if (i == 3) {
                        y = 142;
                    }
                    if (this.isHovering(176, y, 13, 19, pMouseX, pMouseY)) {
                        var oldSlots = this.buildify$hoveredSlots();
                        this.buildify$lineOfSlots = i;
                        var newSlots = this.buildify$hoveredSlots();
                        List<ItemStack> list = com.google.common.collect.Lists.newArrayListWithCapacity(this.menu.slots.size());

                        for (Slot slot : this.menu.slots) {
                            list.add(slot.getItem().copy());
                        }
                        Int2ObjectMap<ItemStack> map = new Int2ObjectOpenHashMap<>();
                        for (int k = 0; k < newSlots.size(); k++) {
                            ItemStack newStack = newSlots.get(k).getItem();
                            newSlots.get(k).set(oldSlots.get(k).getItem());
                            oldSlots.get(k).set(newStack);
                        }
                        for (int j = 0; j < list.size(); ++j) {
                            ItemStack itemstack = list.get(j);
                            ItemStack itemstack1 = this.menu.slots.get(j).getItem();
                            if (!ItemStack.matches(itemstack, itemstack1)) {
                                map.put(j, itemstack1.copy());
                            }
                        }
                        this.buildify$lineOfSlots = -1;
                        ModNetworking.INSTANCE.sendToServer(new ServerUpdateSlots(this.menu.containerId, this.menu.getStateId(), map));
                        cir.setReturnValue(true);
                    } else {
                        b = true;
                    }
                }
                if (b) {
                    this.buildify$lineOfSlots = -1;
                }
            }
        } catch (Exception ignored) {
        }
    }

    @Inject(method = "mouseClicked", at = @At("HEAD"))
    public void mixin$mouseClicked(double pMouseX, double pMouseY, int pButton, CallbackInfoReturnable<Boolean> cir) {
        if (pButton == 0) {
            for (int i = 0; i < 4; i++) {
                int y = 83 + i * 19 - 1;
                if (i == 3) {
                    y = 142;
                }
                if (this.isHovering(176, y, 13, 19, pMouseX, pMouseY)) {
                    this.buildify$lineOfSlots = i;
                }
            }
        }
    }
}