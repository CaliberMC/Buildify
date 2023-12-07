package com.calibermc.buildify.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class CommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;


    static {
        BUILDER.push("Configs for Buildify Mod");


        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
