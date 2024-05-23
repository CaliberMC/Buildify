package com.calibermc.buildify.networking;

import com.calibermc.buildify.Buildify;
import net.mehvahdjukaar.moonlight.api.platform.network.ChannelHandler;
import net.mehvahdjukaar.moonlight.api.platform.network.NetworkDir;

public class ModNetworking {

    public static final ChannelHandler INSTANCE = ChannelHandler.builder(Buildify.MOD_ID)
            .version(5)
            .register(NetworkDir.PLAY_TO_SERVER,
                    ServerOpenBlockPickerMenu.class, ServerOpenBlockPickerMenu::new)
            .register(NetworkDir.PLAY_TO_SERVER,
                    ServerAdjustReach.class, ServerAdjustReach::new)
            .register(NetworkDir.PLAY_TO_SERVER,
                    ServerSetBlockMenuSlot.class, ServerSetBlockMenuSlot::new)
            .register(NetworkDir.PLAY_TO_SERVER,
                    ServerPressAdditionalKey.class, ServerPressAdditionalKey::new)
            .register(NetworkDir.PLAY_TO_SERVER,
                    ServerUpdateSlots.class, ServerUpdateSlots::new)

            .register(NetworkDir.PLAY_TO_CLIENT,
                    ClientSetTime.class, ClientSetTime::new)
            .register(NetworkDir.PLAY_TO_CLIENT,
                    ClientSetRaining.class, ClientSetRaining::new)


            .build();

    public static void init() {
    }
}
