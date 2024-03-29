package com.calibermc.buildify.client;

import com.calibermc.buildify.config.ClientConfigs;
import com.calibermc.buildify.event.ModClientEventBus;
import com.calibermc.buildify.networking.ModNetworking;
import com.calibermc.buildify.networking.ServerAdjustReach;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.phys.HitResult;
import net.minecraftforge.client.gui.overlay.ForgeGui;
import net.minecraftforge.client.gui.overlay.IGuiOverlay;
import net.minecraftforge.common.ForgeMod;

public class AdjustReachOverlay implements IGuiOverlay {

    @Override
    public void render(ForgeGui gui, GuiGraphics guiGraphics, float partialTick, int width, int height) {
        Minecraft mc = Minecraft.getInstance();
        if (!(mc.getCameraEntity() instanceof Player player) || !player.isCreative() || mc.screen != null) return;
        if (ModClientEventBus.ADJUST_REACH.isDown()) {
            HitResult rayTraceResult = mc.getCameraEntity().pick(256.0, partialTick, false);
            double distance = ClientConfigs.MAX_RANGE.get();
            if (rayTraceResult.getType() != HitResult.Type.MISS) {
                distance = Math.min(distance, player.getEyePosition(partialTick).distanceTo(rayTraceResult.getLocation()));
            }
            distance = Math.max(Math.ceil(distance), 2);

            boolean sendPacket = true;
            AttributeInstance attributeInstance = player.getAttribute(ForgeMod.BLOCK_REACH.get());
            if (attributeInstance != null) {
                AttributeModifier modifier = attributeInstance.getModifier(ServerAdjustReach.MODIFIER_UUID);
                if (modifier != null) {
                    sendPacket = distance != modifier.getAmount();
                }
            }
            guiGraphics.drawString(mc.font, String.valueOf((int)distance), (int) (width / 2F + 2), (int) (height / 2F + 2), -1);
            if (sendPacket) {
                ModNetworking.INSTANCE.sendToServer(new ServerAdjustReach(distance));
            }
        }
        // use this if u need remove modifiers to get default values.
        /*else {
            AttributeInstance attributeInstance = player.getAttribute(ForgeMod.REACH_DISTANCE.get());
            if (attributeInstance != null && attributeInstance.getModifier(ServerAdjustDistance.MODIFIER_UUID) != null) {
                ModNetworking.INSTANCE.sendToServer(new ServerAdjustDistance(-1));
            }
        }*/
    }
}
