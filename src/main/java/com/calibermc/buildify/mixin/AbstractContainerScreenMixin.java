package com.calibermc.buildify.mixin;

import com.calibermc.buildify.util.IInvScreenExtended;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.injector.WrapWithCondition;
import com.llamalad7.mixinextras.sugar.Local;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import static com.calibermc.buildify.util.IInvScreenExtended.INV;
import static net.minecraft.client.gui.screens.inventory.AbstractContainerScreen.INVENTORY_LOCATION;

@Mixin(AbstractContainerScreen.class)
public abstract class AbstractContainerScreenMixin extends Screen {

    @Shadow protected int leftPos;

    @Shadow protected int topPos;

    protected AbstractContainerScreenMixin(Component pTitle) {
        super(pTitle);
    }

    @Inject(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/screens/inventory/AbstractContainerScreen;renderLabels(Lcom/mojang/blaze3d/vertex/PoseStack;II)V"))
    public void mixin$renderLineStuff(PoseStack pPoseStack, int pMouseX, int pMouseY, float pPartialTick, CallbackInfo ci) {
        if (!(this instanceof IInvScreenExtended s)) return;
        int i = this.leftPos;
        int j = this.topPos;
        for (int k = 0; k < 4; k++) {
            if (s.buildify$lineOfSlots() != k) {
                int y = 83 + k * 19 - 1;
                RenderSystem.setShaderTexture(0, INV);
                if (k == 3) {
                    y = 142;
                }
                blit(pPoseStack, 176, y, 0, 0, 18, 19, 18, 38);
            }
        }

        if (s.buildify$lineOfSlots() != -1) {
            int blitOffset = 500;
            int y1 = 83 + s.buildify$lineOfSlots() * 18 - 1;
            if (s.buildify$lineOfSlots() == 3) {
                y1 = 140;
            }
            int x = (pMouseX - i) - 176 - 2;
            int y = (pMouseY - j) - y1 - 8;
            y += y1;
            pPoseStack.pushPose();
            pPoseStack.translate(0, 0, blitOffset);
            RenderSystem.setShaderTexture(0, INVENTORY_LOCATION);
            blit(pPoseStack, 7, y1 + 1, 162, 18, 3, 83, 4, 18, 256, 256);

            RenderSystem.setShaderTexture(0, INV);
            blit(pPoseStack, x + 169, y, 0, 19, 18, 19, 18, 38);
            RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
            RenderSystem.setShaderTexture(0, INVENTORY_LOCATION);
            blit(pPoseStack, x + 7, y, 7, 83, 162, 18, 256, 256);
            fill(pPoseStack, x + 7, y + 18, x + 169, y + 18 + 1, -16777216);

            y -= y1;
            for (Slot slot : s.buildify$hoveredSlots()) {
                int xSlot = slot.x + x;
                int ySlot = slot.y + y;
                ItemStack pStack = slot.getItem();
                if (slot.isActive()) {
                    PoseStack posestack = RenderSystem.getModelViewStack();
                    posestack.translate(0.0D, 0.0D, 32.0D);
                    RenderSystem.applyModelViewMatrix();
                    this.setBlitOffset(blitOffset);
                    this.itemRenderer.blitOffset = blitOffset;
                    net.minecraft.client.gui.Font font = net.minecraftforge.client.RenderProperties.get(pStack).getFont(pStack);
                    if (font == null) font = this.font;
                    this.itemRenderer.renderAndDecorateItem(pStack, xSlot, ySlot);
                    this.itemRenderer.renderGuiItemDecorations(font, pStack, xSlot, ySlot, null);
                    this.setBlitOffset(0);
                    this.itemRenderer.blitOffset = 0.0F;
                }
            }
            pPoseStack.popPose();
        }
    }

    @ModifyExpressionValue(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/inventory/Slot;isActive()Z"))
    public boolean mixin$isActive(boolean original, @Local Slot slot) {
        if (this instanceof IInvScreenExtended s) {
            return !s.buildify$hoveredSlots().contains(slot);
        }
        return true;
    }
}
