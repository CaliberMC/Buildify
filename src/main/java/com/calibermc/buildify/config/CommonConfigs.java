package com.calibermc.buildify.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class CommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.BooleanValue USE_CUSTOM_CREATIVE_TABS;
    public static final ForgeConfigSpec.BooleanValue REMOVE_VANILLA_TABS;
    public static final ForgeConfigSpec.BooleanValue USE_VANILLA_BLOCK_FAMILIES;
    public static final ForgeConfigSpec.BooleanValue COMMAND_SERVER_LOGGING;


    static {
        BUILDER.push("Configs for Buildify Mod");
        USE_CUSTOM_CREATIVE_TABS = BUILDER.comment("Use Custom Creative Inventory Tabs?").translation("config.caliber.use_custom_creative_tabs").define("use_custom_creative_tabs", true);
        REMOVE_VANILLA_TABS = BUILDER.comment("Remove all Vanilla Tabs?").translation("config.caliber.remove_vanilla_tabs").define("remove_vanilla_tabs", true);
        USE_VANILLA_BLOCK_FAMILIES = BUILDER.comment("Use Vanilla Block Families? (This adds doors, signs, etc to Block Picker)").comment("If using Buildify without CaliberMod installed, set this to True").translation("config.caliber.use_vanilla_block_families").define("use_vanilla_block_families", false);
        COMMAND_SERVER_LOGGING = BUILDER.comment("Enable Server Logging for Commands?").translation("config.caliber.command_server_logging").define("command_server_logging", true);
        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
