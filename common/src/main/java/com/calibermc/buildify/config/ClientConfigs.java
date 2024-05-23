package com.calibermc.buildify.config;

import com.calibermc.buildify.Buildify;
import net.mehvahdjukaar.moonlight.api.platform.configs.ConfigBuilder;
import net.mehvahdjukaar.moonlight.api.platform.configs.ConfigSpec;
import net.mehvahdjukaar.moonlight.api.platform.configs.ConfigType;

import java.util.function.Supplier;

public class ClientConfigs {
    public static final ConfigSpec SPEC;
    public static final Supplier<Integer> MAX_RANGE;
    public static final Supplier<Boolean> DISPLAY_SORTING_BUTTONS;
    public static final Supplier<Boolean> DISPLAY_HOT_SWAP_SLIDERS;

    public static void init() {
        // Just loads the class, so we can have this all static final
    }

    static {
        ConfigBuilder builder = ConfigBuilder.create(Buildify.MOD_ID, ConfigType.CLIENT);
        builder.push("Configs for Buildify Mod");

        DISPLAY_SORTING_BUTTONS = builder.comment("Display Sorting Buttons?").define("display_sorting_buttons", true);
        DISPLAY_HOT_SWAP_SLIDERS = builder.comment("Display Hot Swap Sliders in Survival Inventory?").define("display_hot_swap_sliders", true);
        MAX_RANGE = builder.comment("Max range for Reach Distance key").define("max_range", 127, 0, 255);  //127, 0, 255
//        CUSTOM_CREATIVE_INVENTORY = BUILDER.comment("Use Custom Creative Inventory?").define("custom_creative_inventory", true);

        builder.pop();
        SPEC = builder.buildAndRegister();
        SPEC.loadFromFile();
    }
}
