package com.calibermc.buildify.networking;

import com.calibermc.buildify.util.player.IPlayerExtended;
import net.mehvahdjukaar.moonlight.api.platform.network.ChannelHandler;
import net.mehvahdjukaar.moonlight.api.platform.network.Message;
import net.minecraft.client.Minecraft;
import net.minecraft.network.FriendlyByteBuf;

import java.util.UUID;

public class ClientSetTime implements Message {

    public final UUID playerUUID;
    public final long dayTime;
    public final boolean shouldTick, reset;

    public ClientSetTime(UUID playerUUID, long dayTime, boolean shouldTick) {
        this(playerUUID, dayTime, shouldTick, false);
    }

    public ClientSetTime(UUID playerUUID) {
        this(playerUUID, 0, false, true);
    }

    private ClientSetTime(UUID playerUUID, long dayTime, boolean shouldTick, boolean reset) {
        this.playerUUID = playerUUID;
        this.dayTime = dayTime;
        this.shouldTick = shouldTick;
        this.reset = reset;
    }

    public ClientSetTime(FriendlyByteBuf buffer) {
        this.playerUUID = buffer.readUUID();
        this.dayTime = buffer.readLong();
        this.shouldTick = buffer.readBoolean();
        this.reset = buffer.readBoolean();
    }

    @Override
    public void writeToBuffer(FriendlyByteBuf buffer) {
        buffer.writeUUID(this.playerUUID);
        buffer.writeLong(this.dayTime);
        buffer.writeBoolean(this.shouldTick);
        buffer.writeBoolean(this.reset);
    }

    @Override
    public void handle(ChannelHandler.Context context) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.level != null && mc.level.getPlayerByUUID(this.playerUUID) instanceof IPlayerExtended ex) {
            if (this.reset) {
                ex.buildify$resetDayTime();
            } else {
                ex.buildify$setDayTime(this.dayTime, this.shouldTick);
            }
        }
    }
}