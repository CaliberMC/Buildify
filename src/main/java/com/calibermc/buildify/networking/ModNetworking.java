package com.calibermc.buildify.networking;

import com.calibermc.buildify.Buildify;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;

public class ModNetworking {

    public static SimpleChannel INSTANCE;
    private static int id = 0;

    public static void registerMessages() {
        INSTANCE = NetworkRegistry.newSimpleChannel(new ResourceLocation(Buildify.MOD_ID, "network"), () -> "1.0", s -> true, s -> true);
        INSTANCE.registerMessage(id++, com.calibermc.buildify.networking.ServerOpenBlockPickerMenu.class, ServerOpenBlockPickerMenu::toBytes, ServerOpenBlockPickerMenu::new, ServerOpenBlockPickerMenu::handle);
        INSTANCE.registerMessage(id++, ServerAdjustReach.class, ServerAdjustReach::toBytes, ServerAdjustReach::new, ServerAdjustReach::handle);
        INSTANCE.registerMessage(id++, ServerSetBlockMenuSlot.class, ServerSetBlockMenuSlot::toBytes, ServerSetBlockMenuSlot::new, ServerSetBlockMenuSlot::handle);
        INSTANCE.registerMessage(id++, com.calibermc.buildify.networking.ServerPressAdditionalKey.class, ServerPressAdditionalKey::toBytes, ServerPressAdditionalKey::new, ServerPressAdditionalKey::handle);

        INSTANCE.registerMessage(id++, ClientSetTime.class, ClientSetTime::toBytes, ClientSetTime::new, ClientSetTime::handle);
        INSTANCE.registerMessage(id++, ClientSetRaining.class, ClientSetRaining::toBytes, ClientSetRaining::new, ClientSetRaining::handle);
    }
}
