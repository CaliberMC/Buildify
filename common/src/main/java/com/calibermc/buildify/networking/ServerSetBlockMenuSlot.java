package com.calibermc.buildify.networking;

import com.calibermc.buildify.world.inventory.BlockPickerMenu;
import net.mehvahdjukaar.moonlight.api.platform.network.ChannelHandler;
import net.mehvahdjukaar.moonlight.api.platform.network.Message;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.ItemStack;

public class ServerSetBlockMenuSlot implements Message {
    private final int slotNum;
    private final ItemStack itemStack;

    public ServerSetBlockMenuSlot(int pSlotNum, ItemStack pItemStack) {
        this.slotNum = pSlotNum;
        this.itemStack = pItemStack.copy();
    }

    public ServerSetBlockMenuSlot(FriendlyByteBuf buffer) {
        this.slotNum = buffer.readShort();
        this.itemStack = buffer.readItem();
    }

    @Override
    public void writeToBuffer(FriendlyByteBuf buf) {
        buf.writeShort(this.slotNum);
        buf.writeItem(this.itemStack);
    }

    @Override
    public void handle(ChannelHandler.Context context) {
        if (context.getSender() instanceof ServerPlayer sender) {
            boolean flag = this.slotNum < 0;
            boolean flag2 = this.itemStack.isEmpty() || this.itemStack.getDamageValue() >= 0 && this.itemStack.getCount() <= 64 && !this.itemStack.isEmpty();
            if (sender.containerMenu instanceof BlockPickerMenu && flag2) {
                if (!flag) {
                    sender.containerMenu.getSlot(slotNum).set(this.itemStack);
                    sender.containerMenu.broadcastChanges();
                    sender.inventoryMenu.broadcastChanges();
                } else {
                    sender.drop(this.itemStack, true);
                }
            }
        }
    }
}