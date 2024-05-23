package com.calibermc.buildify.mixin;

import com.calibermc.buildify.event.ModClientEventBus;
import net.minecraft.client.KeyboardHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.MouseHandler;
import net.minecraft.world.phys.HitResult;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MouseHandler.class)
public abstract class MouseHandlerMixin {

    /**
     * LEFT_CONTROL + MIDDLE CLICK instead of or in addition to the keybind.
     */
    @Inject(method = "onPress", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/Minecraft;getOverlay()Lnet/minecraft/client/gui/screens/Overlay;", ordinal = 0), cancellable = true)
    private void mixin$remove(long windowPointer, int button, int action, int modifiers, CallbackInfo ci) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null || mc.screen != null) return;
        if (button == GLFW.GLFW_MOUSE_BUTTON_MIDDLE && action == GLFW.GLFW_PRESS && modifiers == GLFW.GLFW_MOD_CONTROL) {
            if (mc.hitResult != null && mc.hitResult.getType() == HitResult.Type.BLOCK && mc.player.isCreative()) {
                ModClientEventBus.onPickBlock(mc.hitResult, mc.player, mc.level);
                ci.cancel();
            }
        }
    }
}