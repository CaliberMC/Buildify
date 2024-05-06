package com.calibermc.buildify.config;

import net.neoforged.neoforge.common.ModConfigSpec;

public class CommonConfigs {
    public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final ModConfigSpec SPEC;
    public static final ModConfigSpec.BooleanValue USE_CUSTOM_CREATIVE_TABS;
    public static final ModConfigSpec.BooleanValue REMOVE_VANILLA_TABS;
    public static final ModConfigSpec.BooleanValue USE_VANILLA_BLOCK_FAMILIES;
    public static final ModConfigSpec.BooleanValue DISABLE_ALL_ADDED_OP_COMMANDS;
    public static final ModConfigSpec.BooleanValue COMMAND_SERVER_LOGGING;


    static {
        BUILDER.push("Configs for Buildify Mod");
        USE_CUSTOM_CREATIVE_TABS = BUILDER.comment("Use Custom Creative Inventory Tabs?").translation("config.caliber.use_custom_creative_tabs").define("use_custom_creative_tabs", true);
        REMOVE_VANILLA_TABS = BUILDER.comment("Remove all Vanilla Tabs?").translation("config.caliber.remove_vanilla_tabs").define("remove_vanilla_tabs", true);
        USE_VANILLA_BLOCK_FAMILIES = BUILDER.comment("Use Vanilla Block Families? (This adds doors, signs, etc to Block Picker)").comment("If using Buildify without CaliberMod installed, set this to True").translation("config.caliber.use_vanilla_block_families").define("use_vanilla_block_families", false);
        DISABLE_ALL_ADDED_OP_COMMANDS = BUILDER.comment("Disable all added OP Commands?").translation("config.caliber.disable_all_added_op_commands").define("disable_all_added_op_commands", false);
        COMMAND_SERVER_LOGGING = BUILDER.comment("Enable Server Logging for Commands?").translation("config.caliber.command_server_logging").define("command_server_logging", true);
        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
