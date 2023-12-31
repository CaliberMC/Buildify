package com.calibermc.buildify.mixin;

import com.calibermc.buildify.util.player.IPlayerExtended;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.entity.LevelEntityGetter;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Level.class)
public abstract class LevelMixin {

    @Shadow protected abstract LevelEntityGetter<Entity> getEntities();


    @Inject(method = "tickBlockEntities", at = @At("TAIL"))
    public void mixin$tick(CallbackInfo ci) {
        for (Entity entity : this.getEntities().getAll()) {
            if (entity instanceof IPlayerExtended l) {
                if (l.buildify$shouldTick() && l.buildify$playersDayTime()) {
                    l.buildify$setDayTime(l.buildify$getDayTime() + 1L, l.buildify$shouldTick());
                }

                if (entity.level.isClientSide) {
                    l.buildify$manageRaining();
                }
            }
        }
    }

    @Inject(method = "getRainLevel", at = @At("TAIL"), cancellable = true)
    public void mixin$getRainLevel(float pDelta, CallbackInfoReturnable<Float> cir) {
        for (Entity entity : this.getEntities().getAll()) {
            if (entity instanceof IPlayerExtended l && l.buildify$playersRaining() && entity.level.isClientSide) {
                cir.setReturnValue(l.buildify$getRainLevel(pDelta));
            }
        }
    }
}
