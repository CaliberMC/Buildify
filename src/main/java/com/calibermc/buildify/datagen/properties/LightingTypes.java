package com.calibermc.buildify.datagen.properties;

public enum LightingTypes {
    CANDLE("candle"),
    HYACINTH_LAMP("hyacinth_lamp"),
    LANTERN("lantern"),
    SEA_LANTERN("sea_lantern"),
    SEA_PICKLE("sea_pickle"),
    SOUL_LANTERN("soul_lantern"),
    SOUL_TORCH("soul_torch"),
    TORCH("torch");


    private final String name;

    LightingTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
