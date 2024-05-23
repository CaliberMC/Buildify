package com.calibermc.buildify.networking;

import com.calibermc.buildify.world.inventory.ModMenuTypes;
import net.mehvahdjukaar.moonlight.api.platform.PlatHelper;
import net.mehvahdjukaar.moonlight.api.platform.network.ChannelHandler;
import net.mehvahdjukaar.moonlight.api.platform.network.Message;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;

public class ServerOpenBlockPickerMenu implements Message {

    public ServerOpenBlockPickerMenu() {}

    public ServerOpenBlockPickerMenu(FriendlyByteBuf buffer) {
    }

    public void toBytes(FriendlyByteBuf buffer) {
    }

    @Override
    public void writeToBuffer(FriendlyByteBuf buf) {

    }

    @Override
    public void handle(ChannelHandler.Context ctx) {
        Player sender = ctx.getSender();
        if (sender instanceof ServerPlayer player) {
            var menuProvider = new SimpleMenuProvider((id, playerInventory, entity) ->
                    ModMenuTypes.BLOCK_TYPE.get().create(id, playerInventory),
                    Component.translatable("screen.buildify.block_picker"));
            PlatHelper.openCustomMenu(player, menuProvider, b -> {});
        }
    }
}