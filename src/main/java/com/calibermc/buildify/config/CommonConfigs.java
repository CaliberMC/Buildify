package com.calibermc.buildify.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class CommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.BooleanValue USE_CUSTOM_CREATIVE_TABS;
    public static final ForgeConfigSpec.BooleanValue REMOVE_VANILLA_TABS;


    static {
        BUILDER.push("Configs for Buildify Mod");
        USE_CUSTOM_CREATIVE_TABS = BUILDER.comment("Use Custom Creative Inventory Tabs?").translation("config.caliber.custom_creative_inventory").define("custom_creative_inventory", true);
        REMOVE_VANILLA_TABS = BUILDER.comment("Remove all Vanilla Tabs?").translation("config.caliber.remove_vanilla_tabs").define("remove_vanilla_tabs", true);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
