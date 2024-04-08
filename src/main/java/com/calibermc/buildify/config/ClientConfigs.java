package com.calibermc.buildify.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ClientConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    public static final ForgeConfigSpec.IntValue MAX_RANGE;
//    public static final ForgeConfigSpec.BooleanValue CUSTOM_CREATIVE_INVENTORY;
    public static final ForgeConfigSpec.BooleanValue DISPLAY_SORTING_BUTTONS;

    static {
        BUILDER.push("Configs for Buildify Mod");

        DISPLAY_SORTING_BUTTONS = BUILDER.comment("Display Sorting Buttons?").translation("config.caliber.display_sorting_buttons").define("display_sorting_buttons", true);
        MAX_RANGE = BUILDER.comment("Max range for Reach Distance key").translation("config.buildify.max_range").defineInRange("max_range", 127, 0, 255);  //127, 0, 255
//        CUSTOM_CREATIVE_INVENTORY = BUILDER.comment("Use Custom Creative Inventory?").translation("config.buildify.custom_creative_inventory").define("custom_creative_inventory", true);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
