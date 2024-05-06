package com.calibermc.buildify.config;

import net.neoforged.neoforge.common.ModConfigSpec;

public class ClientConfigs {
    public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
    public static final ModConfigSpec SPEC;
    public static final ModConfigSpec.IntValue MAX_RANGE;
    public static final ModConfigSpec.BooleanValue DISPLAY_SORTING_BUTTONS;
    public static final ModConfigSpec.BooleanValue DISPLAY_HOT_SWAP_SLIDERS;


    static {
        BUILDER.push("Configs for Buildify Mod");

        DISPLAY_SORTING_BUTTONS = BUILDER.comment("Display Sorting Buttons?").translation("config.caliber.display_sorting_buttons").define("display_sorting_buttons", true);
        DISPLAY_HOT_SWAP_SLIDERS = BUILDER.comment("Display Hot Swap Sliders in Survival Inventory?").translation("config.caliber.display_hot_swap_sliders").define("display_hot_swap_sliders", true);
        MAX_RANGE = BUILDER.comment("Max range for Reach Distance key").translation("config.buildify.max_range").defineInRange("max_range", 127, 0, 255);


        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
