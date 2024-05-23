package com.calibermc.buildify.fabric;

import com.calibermc.buildify.Buildify;
import com.calibermc.caliberlib.CaliberLib;
import net.fabricmc.api.ModInitializer;

public class BuildifyFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Buildify.init();
    }
}
