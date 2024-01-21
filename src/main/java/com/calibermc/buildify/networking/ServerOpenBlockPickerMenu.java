package com.calibermc.buildify.networking;

import com.calibermc.buildify.world.inventory.ModMenuTypes;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.network.NetworkHooks;

import java.util.function.Supplier;

public class ServerOpenBlockPickerMenu {

    public ServerOpenBlockPickerMenu() {}

    public ServerOpenBlockPickerMenu(FriendlyByteBuf buffer) {
    }

    public void toBytes(FriendlyByteBuf buffer) {
    }

    public void handle(Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {
            ServerPlayer sender = ctx.get().getSender();
            if (sender != null) {
                NetworkHooks.openScreen(sender, new SimpleMenuProvider((id, playerInventory, entity) ->
                        ModMenuTypes.BLOCK_TYPE.get().create(id, playerInventory),
                        Component.translatable("screen.buildify.block_picker")));
            }
        });
        ctx.get().setPacketHandled(true);
    }

}