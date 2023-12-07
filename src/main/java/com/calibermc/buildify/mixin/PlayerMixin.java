package com.calibermc.buildify.mixin;

import com.calibermc.buildify.networking.ClientSetRaining;
import com.calibermc.buildify.networking.ClientSetTime;
import com.calibermc.buildify.networking.ModNetworking;
import com.calibermc.buildify.util.player.IPlayerExtended;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.network.PacketDistributor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(Player.class)
public class PlayerMixin implements IPlayerExtended {

    @Unique private boolean buildify$additionalPressed;

    @Unique private boolean buildify$shouldTick;
    @Unique private boolean buildify$playerDayTime;
    @Unique private long buildify$dayTime;

    @Unique private boolean buildify$playersRaining;
    @Unique private boolean buildify$isRaining;

    @Unique private float buildify$oRainLevel;
    @Unique private float buildify$rainLevel;

    @Unique private final CompoundTag buildify$tag = new CompoundTag();

    @Override
    public CompoundTag buildify$getTag() {
        return this.buildify$tag;
    }

    @Override
    public boolean buildify$additionalPressed() {
        return this.buildify$additionalPressed;
    }

    @Override
    public void buildify$pressAdditional(boolean pressed) {
        this.buildify$additionalPressed = pressed;
    }

    @Override
    public void buildify$setDayTime(long dayTime, boolean shouldTick) {
        if (dayTime < 0L) {
            dayTime = -dayTime;
        }
        this.buildify$dayTime = dayTime;
        this.buildify$shouldTick = shouldTick;
        this.buildify$playerDayTime = true;
        if (((Player) (Object) this) instanceof ServerPlayer player) {
            ModNetworking.INSTANCE.send(PacketDistributor.PLAYER.with(() -> player), new ClientSetTime(player.getUUID(), this.buildify$dayTime, this.buildify$shouldTick));
        }
    }

    @Override
    public void buildify$resetDayTime() {
        this.buildify$playerDayTime = false;
        if (((Player) (Object) this) instanceof ServerPlayer player) {
            ModNetworking.INSTANCE.send(PacketDistributor.PLAYER.with(() -> player), new ClientSetTime(player.getUUID()));
        }
    }

    @Override
    public long buildify$getDayTime() {
        return this.buildify$dayTime;
    }

    @Override
    public boolean buildify$shouldTick() {
        return this.buildify$shouldTick;
    }

    @Override
    public boolean buildify$playersDayTime() {
        return this.buildify$playerDayTime;
    }

    @Override
    public boolean buildify$isRaining() {
        return this.buildify$isRaining;
    }

    @Override
    public void buildify$setRaining(boolean raining) {
        this.buildify$isRaining = raining;
        this.buildify$playersRaining = true;
        if (((Player) (Object) this) instanceof ServerPlayer player) {
            ModNetworking.INSTANCE.send(PacketDistributor.PLAYER.with(() -> player), new ClientSetRaining(player.getUUID(), this.buildify$isRaining));
        }
    }

    @Override
    public void buildify$clearRaining() {
        this.buildify$playersRaining = false;
        if (((Player) (Object) this) instanceof ServerPlayer player) {
            ModNetworking.INSTANCE.send(PacketDistributor.PLAYER.with(() -> player), new ClientSetRaining(player.getUUID()));
        }
    }

    @Override
    public void buildify$manageRaining() {
        this.buildify$oRainLevel = this.buildify$rainLevel;
        if (this.buildify$isRaining()) {
            this.buildify$rainLevel += 0.01F;
        } else {
            this.buildify$rainLevel -= 0.01F;
        }

        this.buildify$rainLevel = Mth.clamp(this.buildify$rainLevel, 0.0F, 1.0F);
    }

    @Override
    public float buildify$getRainLevel(float pDelta) {
        return Mth.lerp(pDelta, this.buildify$oRainLevel, this.buildify$rainLevel);
    }

    @Override
    public boolean buildify$playersRaining() {
        return this.buildify$playersRaining;
    }
}
