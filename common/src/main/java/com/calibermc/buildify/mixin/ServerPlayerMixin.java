package com.calibermc.buildify.mixin;

import com.calibermc.buildify.client.AdjustReachOverlay;
import com.calibermc.buildify.event.PlayerEventHandler;
import net.minecraft.client.gui.Gui;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.damagesource.DamageSource;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ServerPlayer.class)
public abstract class ServerPlayerMixin {

    @Inject(method = "die", at = @At("HEAD"))
    public void mixin$die(DamageSource damageSource, CallbackInfo ci) {
        PlayerEventHandler.resetHammerInteraction((ServerPlayer) (Object) this);
    }
}
