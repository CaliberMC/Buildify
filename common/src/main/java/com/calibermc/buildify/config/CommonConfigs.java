package com.calibermc.buildify.config;

import com.calibermc.buildify.Buildify;
import net.mehvahdjukaar.moonlight.api.platform.configs.ConfigBuilder;
import net.mehvahdjukaar.moonlight.api.platform.configs.ConfigSpec;
import net.mehvahdjukaar.moonlight.api.platform.configs.ConfigType;

import java.util.function.Supplier;

public class CommonConfigs {
    public static final ConfigSpec SPEC;
    public static final Supplier<Boolean> USE_CUSTOM_CREATIVE_TABS;
    public static final Supplier<Boolean> REMOVE_VANILLA_TABS;
    public static final Supplier<Boolean> USE_VANILLA_BLOCK_FAMILIES;
    public static final Supplier<Boolean> DISABLE_ALL_ADDED_OP_COMMANDS;
    public static final Supplier<Boolean> COMMAND_SERVER_LOGGING;


    static {
        ConfigBuilder builder = ConfigBuilder.create(Buildify.MOD_ID, ConfigType.COMMON);

        builder.push("Configs for Buildify Mod");
        USE_CUSTOM_CREATIVE_TABS = builder.comment("Use Custom Creative Inventory Tabs?").define("use_custom_creative_tabs", true);
        REMOVE_VANILLA_TABS = builder.comment("Remove all Vanilla Tabs?").define("remove_vanilla_tabs", true);
        USE_VANILLA_BLOCK_FAMILIES = builder.comment("Use Vanilla Block Families? (This adds doors, signs, etc to Block Picker)").comment("If using Buildify without CaliberMod installed, set this to True").define("use_vanilla_block_families", false);
        DISABLE_ALL_ADDED_OP_COMMANDS = builder.comment("Disable all added OP Commands?").define("disable_all_added_op_commands", false);
            COMMAND_SERVER_LOGGING = builder.comment("Enable Server Logging for Commands?").define("command_server_logging", true);
        builder.pop();
        // With this line, the config file will be synced to all connecting clients when connecting to a server
        builder.setSynced();

        // Builds and register out config
        SPEC = builder.buildAndRegister();
        // If this is called, the config file wil be loaded immediately
        SPEC.loadFromFile();
    }

    public static void init() {
    }
}
