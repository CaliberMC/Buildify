package com.calibermc.buildify.networking;

import com.calibermc.buildify.util.player.IPlayerExtended;
import net.mehvahdjukaar.moonlight.api.platform.network.ChannelHandler;
import net.mehvahdjukaar.moonlight.api.platform.network.Message;
import net.minecraft.network.FriendlyByteBuf;

public class ServerPressAdditionalKey implements Message {

    private final boolean press;

    public ServerPressAdditionalKey(boolean press) {
        this.press = press;
    }

    public ServerPressAdditionalKey(FriendlyByteBuf buffer) {
        this.press = buffer.readBoolean();
    }

    @Override
    public void writeToBuffer(FriendlyByteBuf buf) {
        buf.writeBoolean(this.press);
    }

    @Override
    public void handle(ChannelHandler.Context context) {
        if (context.getSender() instanceof IPlayerExtended ex) {
            ex.buildify$pressAdditional(this.press);
        }
    }
}