package com.calibermc.buildify.mixin;

import com.calibermc.buildify.event.PlayerEventHandler;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.players.PlayerList;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerList.class)
public abstract class PlayerListMixin {

    @Inject(method = "remove", at = @At("HEAD"), cancellable = true)
    private void mixin$remove(ServerPlayer player, CallbackInfo ci) {
        PlayerEventHandler.resetHammerInteraction(player);
    }
}