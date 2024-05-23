package com.calibermc.buildify.networking;

import com.calibermc.buildify.util.player.IPlayerExtended;
import net.mehvahdjukaar.moonlight.api.platform.network.ChannelHandler;
import net.mehvahdjukaar.moonlight.api.platform.network.Message;
import net.minecraft.client.Minecraft;
import net.minecraft.network.FriendlyByteBuf;

import java.util.UUID;

public class ClientSetRaining implements Message {

    public final UUID playerUUID;
    public final boolean isRaining, clear;

    public ClientSetRaining(UUID playerUUID, boolean isRaining) {
        this(playerUUID, isRaining, false);
    }

    public ClientSetRaining(UUID playerUUID) {
        this(playerUUID, false, true);
    }

    private ClientSetRaining(UUID playerUUID, boolean isRaining, boolean clear) {
        this.playerUUID = playerUUID;
        this.isRaining = isRaining;
        this.clear = clear;
    }

    public ClientSetRaining(FriendlyByteBuf buffer) {
        this.playerUUID = buffer.readUUID();
        this.isRaining = buffer.readBoolean();
        this.clear = buffer.readBoolean();
    }

    @Override
    public void writeToBuffer(FriendlyByteBuf buffer) {
        buffer.writeUUID(this.playerUUID);
        buffer.writeBoolean(this.isRaining);
        buffer.writeBoolean(this.clear);
    }

    @Override
    public void handle(ChannelHandler.Context context) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.level != null && mc.level.getPlayerByUUID(this.playerUUID) instanceof IPlayerExtended ex) {
            if (this.clear) {
                ex.buildify$clearRaining();
            } else {
                ex.buildify$setRaining(this.isRaining);
            }
        }
    }
}