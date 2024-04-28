package com.calibermc.buildify.mixin;

import com.calibermc.buildify.util.player.IPlayerExtended;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.entity.LevelEntityGetter;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.ArrayList;
import java.util.Collections;

@Mixin(Level.class)
public abstract class LevelMixin {

    @Shadow protected abstract LevelEntityGetter<Entity> getEntities();

    @Inject(method = "tickBlockEntities", at = @At("TAIL"))
    public void mixin$tick(CallbackInfo ci) {
        Level level = (Level) (Object) this;
        Iterable<Entity> list = new ArrayList<>();
        if (level.isClientSide) {
            list = buildify$getClientEntities(level);
        } else if (level instanceof ServerLevel l) {
            list = l.getAllEntities();
        }

        for (Entity entity : list) {
            if (entity instanceof IPlayerExtended l) {
                if (l.buildify$shouldTick() && l.buildify$playersDayTime()) {
                    l.buildify$setDayTime(l.buildify$getDayTime() + 1L, l.buildify$shouldTick());
                }

                if (entity.getCommandSenderWorld().isClientSide) {
                    l.buildify$manageRaining();
                }
            }
        }
    }

    @Inject(method = "getRainLevel", at = @At("TAIL"), cancellable = true)
    public void mixin$getRainLevel(float pDelta, CallbackInfoReturnable<Float> cir) {
        for (Entity entity : this.getEntities().getAll()) {
            if (entity instanceof IPlayerExtended l && l.buildify$playersRaining() && entity.getCommandSenderWorld().isClientSide) {
                cir.setReturnValue(l.buildify$getRainLevel(pDelta));
            }
        }
    }

    @Unique
    @OnlyIn(Dist.CLIENT)
    private Iterable<Entity> buildify$getClientEntities(Level level) {
        if (level instanceof ClientLevel l) {
            return l.entitiesForRendering();
        }
        return Collections.emptyList();
    }
}
