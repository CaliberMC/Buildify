package com.calibermc.buildify.forge.datagen.properties;

public enum LightingTypes {

    CANDLE("minecraft:candle"),
    LANTERN("minecraft:lantern"),
    SEA_LANTERN("minecraft:sea_lantern"),
    SEA_PICKLE("minecraft:sea_pickle"),
    SOUL_LANTERN("minecraft:soul_lantern"),
    SOUL_TORCH("minecraft:soul_torch"),
    TORCH("minecraft:torch"),

    // Regions Unexplored
    RU_HYACINTH_LAMP("regions_unexplored:hyacinth_lamp"),;


    private final String name;

    LightingTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
