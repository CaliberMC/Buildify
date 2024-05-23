package com.calibermc.buildify.mixin;

import com.calibermc.buildify.BuildifyClient;
import com.calibermc.buildify.client.AdjustReachOverlay;
import com.calibermc.buildify.util.player.IPlayerExtended;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.entity.LevelEntityGetter;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.ArrayList;

@Mixin(Gui.class)
public abstract class GuiMixin {

    @Shadow private int screenWidth;

    @Shadow private int screenHeight;

    @Inject(method = "render", at = @At("TAIL"))
    public void mixin$renderAdjustReachOverlay(GuiGraphics guiGraphics, float partialTick, CallbackInfo ci) {
        AdjustReachOverlay.render((Gui) (Object) this, guiGraphics, partialTick, this.screenWidth, this.screenHeight);
    }
}
