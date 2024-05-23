package com.calibermc.buildify.forge;

import com.calibermc.buildify.Buildify;
import com.calibermc.buildify.client.AdjustReachOverlay;
import net.mehvahdjukaar.moonlight.api.platform.PlatHelper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Buildify.MOD_ID)
public class BuildifyForge {
    public BuildifyForge() {
        // Submit our event bus to let architectury register our content on the right time
        FMLJavaModLoadingContext.get().getModEventBus().register(this);
        Buildify.init();
        if (PlatHelper.getPhysicalSide().isClient()) {
            MinecraftForge.EVENT_BUS.addListener(this::renderOverlay);
        }
    }

    private void renderOverlay(RenderGuiEvent.Post event) {
        if (PlatHelper.getPhysicalSide().isClient()) {
            AdjustReachOverlay.render(Minecraft.getInstance().gui, event.getGuiGraphics(), event.getPartialTick(), event.getWindow().getGuiScaledWidth(), event.getWindow().getGuiScaledHeight());
        }
    }
}
