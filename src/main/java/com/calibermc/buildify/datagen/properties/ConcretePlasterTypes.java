package com.calibermc.buildify.datagen.properties;

public enum ConcretePlasterTypes {
    BLACK_CONCRETE("minecraft:black_concrete"),
    BLUE_CONCRETE("minecraft:blue_concrete"),
    BROWN_CONCRETE("minecraft:brown_concrete"),
    CYAN_CONCRETE("minecraft:cyan_concrete"),
    GRAY_CONCRETE("minecraft:gray_concrete"),
    GREEN_CONCRETE("minecraft:green_concrete"),
    LIGHT_BLUE_CONCRETE("minecraft:light_blue_concrete"),
    LIGHT_GRAY_CONCRETE("minecraft:light_gray_concrete"),
    LIME_CONCRETE("minecraft:lime_concrete"),
    MAGENTA_CONCRETE("minecraft:magenta_concrete"),
    ORANGE_CONCRETE("minecraft:orange_concrete"),
    PINK_CONCRETE("minecraft:pink_concrete"),
    PURPLE_CONCRETE("minecraft:purple_concrete"),
    RED_CONCRETE("minecraft:red_concrete"),
    WHITE_CONCRETE("minecraft:white_concrete"),
    YELLOW_CONCRETE("minecraft:yellow_concrete"),

    BLACK_CONCRETE_POWDER("minecraft:black_concrete_powder"),
    BLUE_CONCRETE_POWDER("minecraft:blue_concrete_powder"),
    BROWN_CONCRETE_POWDER("minecraft:brown_concrete_powder"),
    CYAN_CONCRETE_POWDER("minecraft:cyan_concrete_powder"),
    GRAY_CONCRETE_POWDER("minecraft:gray_concrete_powder"),
    GREEN_CONCRETE_POWDER("minecraft:green_concrete_powder"),
    LIGHT_BLUE_CONCRETE_POWDER("minecraft:light_blue_concrete_powder"),
    LIGHT_GRAY_CONCRETE_POWDER("minecraft:light_gray_concrete_powder"),
    LIME_CONCRETE_POWDER("minecraft:lime_concrete_powder"),
    MAGENTA_CONCRETE_POWDER("minecraft:magenta_concrete_powder"),
    ORANGE_CONCRETE_POWDER("minecraft:orange_concrete_powder"),
    PINK_CONCRETE_POWDER("minecraft:pink_concrete_powder"),
    PURPLE_CONCRETE_POWDER("minecraft:purple_concrete_powder"),
    RED_CONCRETE_POWDER("minecraft:red_concrete_powder"),
    WHITE_CONCRETE_POWDER("minecraft:white_concrete_powder"),
    YELLOW_CONCRETE_POWDER("minecraft:yellow_concrete_powder");

    private final String name;

    ConcretePlasterTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
