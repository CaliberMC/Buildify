package com.calibermc.buildify.mixin;

import com.calibermc.buildify.client.SortingButton;
import com.calibermc.buildify.config.ClientConfigs;
import com.calibermc.buildify.util.IInvScreenExtended;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.screens.inventory.CreativeModeInventoryScreen;
import net.minecraft.client.gui.screens.recipebook.RecipeUpdateListener;
import net.minecraft.network.chat.Component;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.inventory.InventoryMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import org.apache.commons.compress.utils.Lists;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

import static com.calibermc.buildify.util.IInvScreenExtended.INV;
import static net.minecraft.client.gui.screens.inventory.AbstractContainerScreen.INVENTORY_LOCATION;

@Mixin(AbstractContainerScreen.class)
public abstract class AbstractContainerScreenMixin<T extends AbstractContainerMenu> extends Screen {

    @Shadow protected int leftPos;

    @Shadow protected int topPos;

    protected AbstractContainerScreenMixin(Component pTitle) {
        super(pTitle);
    }

    @Inject(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/gui/screens/inventory/AbstractContainerScreen;renderLabels(Lnet/minecraft/client/gui/GuiGraphics;II)V"))
        public void mixin$renderLineStuff (GuiGraphics guiGraphics,int pMouseX, int pMouseY, float pPartialTick, CallbackInfo ci) {

        boolean renderHotSwapSliders = ClientConfigs.DISPLAY_HOT_SWAP_SLIDERS.get();
        if (renderHotSwapSliders) {

            if (!(this instanceof IInvScreenExtended s)) return;
            int i = this.leftPos;
            int j = this.topPos;
            for (int k = 0; k < 4; k++) {
                if (s.buildify$lineOfSlots() != k) {
                    int y = 83 + k * 19 - 1;
                    if (k == 3) {
                        y = 142;
                    }
                    guiGraphics.blit(INV, 176, y, 0, 0, 18, 19, 18, 38);
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
                guiGraphics.pose().pushPose();
                guiGraphics.pose().translate(0, 0, blitOffset);
                RenderSystem.setShaderTexture(0, INVENTORY_LOCATION);
                guiGraphics.blit(INVENTORY_LOCATION, 7, y1 + 1, 162, 18, 3, 83, 4, 18, 256, 256);

                RenderSystem.setShaderTexture(0, INV);
                guiGraphics.blit(INV, x + 169, y, 0, 19, 18, 19, 18, 38);
                RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
                RenderSystem.setShaderTexture(0, INVENTORY_LOCATION);
                guiGraphics.blit(INVENTORY_LOCATION, x + 7, y, 7, 83, 162, 18, 256, 256);
                guiGraphics.fill(x + 7, y + 18, x + 169, y + 18 + 1, -16777216);

                y -= y1;
                for (Slot slot : s.buildify$hoveredSlots()) {
                    int xSlot = slot.x + x;
                    int ySlot = slot.y + y;
                    ItemStack pStack = slot.getItem();
                    if (slot.isActive()) {
                        PoseStack posestack = RenderSystem.getModelViewStack();
                        posestack.translate(0.0D, 0.0D, 32.0D);
                        RenderSystem.applyModelViewMatrix();
                        guiGraphics.pose().pushPose();
                        guiGraphics.pose().translate(0, 0, blitOffset);
                        net.minecraft.client.gui.Font font = IClientItemExtensions.of(pStack).getFont(pStack, IClientItemExtensions.FontContext.ITEM_COUNT);
                        if (font == null) font = this.font;
                        guiGraphics.renderItem(pStack, xSlot, ySlot, 0, 500);
                        guiGraphics.renderItemDecorations(font, pStack, xSlot, ySlot, null);
                        guiGraphics.pose().popPose();
                    }
                }
                guiGraphics.pose().popPose();
            }
        }
    }

    @ModifyExpressionValue(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/inventory/Slot;isActive()Z"))
    public boolean mixin$isActive(boolean original, @Local Slot slot) {
        if (this instanceof IInvScreenExtended s) {
            return !s.buildify$hoveredSlots().contains(slot);
        }
        return true;
    }


    @Shadow @Final
    protected T menu;

    @Shadow protected int imageHeight;

    @Shadow protected int imageWidth;

    @Shadow protected abstract void init();

    @Unique
    private final List<SortingButton> buildify$sortingButtonList = Lists.newArrayList();

    @Inject(method = "init", at = @At("RETURN"))
    public void mixin$init(CallbackInfo ci) {
        boolean displaySortingButtons = ClientConfigs.DISPLAY_SORTING_BUTTONS.get();
        if (displaySortingButtons) {
            AbstractContainerScreen<?> screen = (AbstractContainerScreen<?>) (Object) this;
            int x = this.leftPos + this.imageWidth - 5;
            for (int i = 0; i < 2; i++) {
                boolean playerOnly = this.menu instanceof InventoryMenu || screen instanceof CreativeModeInventoryScreen;
                boolean alphabet = i == 0;
                x -= 13;
                int menuY = this.topPos + (playerOnly ? (this.imageHeight - 98) : 6);

                if (this.menu instanceof ChestMenu) {
                    menuY -= 1;
                }
                this.buildify$sortingButtonList.add(this.addRenderableWidget(new SortingButton(screen, x, menuY, playerOnly, alphabet)));

                if (!playerOnly) {
                    int y = 0;
                    if (!this.menu.slots.isEmpty()) {
                        y = this.menu.getSlot(this.menu.slots.size() - 36).y - 13;
                    }
                    this.buildify$sortingButtonList.add(this.addRenderableWidget(new SortingButton(screen, x, this.topPos + y, true, alphabet)));
                }
            }
            if (screen instanceof CreativeModeInventoryScreen s) {
                for (SortingButton button : this.buildify$sortingButtonList) {
                    button.visible = s.isInventoryOpen();
                }
            }
        }
    }

    @Inject(method = "render", at = @At("HEAD"))
    public void mixin$render(CallbackInfo ci) {
        if ((Object) this instanceof CreativeModeInventoryScreen s) {
            for (SortingButton button : this.buildify$sortingButtonList) {
                button.visible = s.isInventoryOpen();
            }
        }
        if ((Object) this instanceof RecipeUpdateListener s) {
            for (SortingButton button : this.buildify$sortingButtonList) {
                int x = button.initX;
                button.setX(s.getRecipeBookComponent().isVisible() ? 78 + x : x);
            }
        }
    }
}
