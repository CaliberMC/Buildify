package com.calibermc.buildify.mixin;

import com.calibermc.buildify.util.player.IPlayerExtended;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ClientLevel.ClientLevelData.class)
public class ClientLevelDataMixin {

    @Inject(method = "getDayTime()J", at = @At("RETURN"), cancellable = true)
    public void mixin$getDayTime(CallbackInfoReturnable<Long> cir) {
        Minecraft mc = Minecraft.getInstance();
        ClientLevel.ClientLevelData data = (ClientLevel.ClientLevelData) (Object) this;
        if (mc.level != null && mc.level.getLevelData() == data) {
            if (mc.player instanceof IPlayerExtended ex && ex.buildify$playersDayTime()) {
                cir.setReturnValue(ex.buildify$getDayTime());
            }
        }
    }

    @Inject(method = "isRaining()Z", at = @At("RETURN"), cancellable = true)
    public void mixin$isRaining(CallbackInfoReturnable<Boolean> cir) {
        Minecraft mc = Minecraft.getInstance();
        ClientLevel.ClientLevelData data = (ClientLevel.ClientLevelData) (Object) this;
        if (mc.level != null && mc.level.getLevelData() == data) {
            if (mc.player instanceof IPlayerExtended ex && ex.buildify$playersRaining()) {
                cir.setReturnValue(ex.buildify$isRaining());
            }
        }
    }
}
