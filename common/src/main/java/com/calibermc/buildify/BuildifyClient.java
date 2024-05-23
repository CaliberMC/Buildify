package com.calibermc.buildify;

import com.calibermc.buildify.client.BlockPickerScreen;
import com.calibermc.buildify.event.ModClientEventBus;
import com.calibermc.buildify.world.inventory.ModMenuTypes;
import net.mehvahdjukaar.moonlight.api.platform.ClientHelper;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;

import java.util.Collections;

public class BuildifyClient {
    public static void init() {
        ClientHelper.addKeyBindRegistration(keyBindEvent -> {
            keyBindEvent.register(ModClientEventBus.BLOCK_PICKER);
            keyBindEvent.register(ModClientEventBus.COPY_BLOCK);
            keyBindEvent.register(ModClientEventBus.ADJUST_REACH);
        });
        ClientHelper.addClientSetup(BuildifyClient::setup);
    }

    private static void setup() {
        MenuScreens.register(ModMenuTypes.BLOCK_TYPE.get(), BlockPickerScreen::new);
    }

    public static Iterable<Entity> getClientEntities(Level level) {
        if (level instanceof ClientLevel l) {
            return l.entitiesForRendering();
        }
        return Collections.emptyList();
    }
}
