package com.calibermc.buildify.forge.datagen.properties;

public enum TilesFlooringTypes {

    BLACK_CARPET("minecraft:black_carpet"),
    BLUE_CARPET("minecraft:blue_carpet"),
    BROWN_CARPET("minecraft:brown_carpet"),
    CYAN_CARPET("minecraft:cyan_carpet"),
    GRAY_CARPET("minecraft:gray_carpet"),
    GREEN_CARPET("minecraft:green_carpet"),
    LIGHT_BLUE_CARPET("minecraft:light_blue_carpet"),
    LIGHT_GRAY_CARPET("minecraft:light_gray_carpet"),
    LIME_CARPET("minecraft:lime_carpet"),
    MAGENTA_CARPET("minecraft:magenta_carpet"),
    ORANGE_CARPET("minecraft:orange_carpet"),
    PINK_CARPET("minecraft:pink_carpet"),
    PURPLE_CARPET("minecraft:purple_carpet"),
    RED_CARPET("minecraft:red_carpet"),
    WHITE_CARPET("minecraft:white_carpet"),
    YELLOW_CARPET("minecraft:yellow_carpet"),
    MOSS_CARPET("minecraft:moss_carpet"),

    BLACK_GLAZED_TERRACOTTA("minecraft:black_glazed_terracotta"),
    BLUE_GLAZED_TERRACOTTA("minecraft:blue_glazed_terracotta"),
    BROWN_GLAZED_TERRACOTTA("minecraft:brown_glazed_terracotta"),
    CYAN_GLAZED_TERRACOTTA("minecraft:cyan_glazed_terracotta"),
    GRAY_GLAZED_TERRACOTTA("minecraft:gray_glazed_terracotta"),
    GREEN_GLAZED_TERRACOTTA("minecraft:green_glazed_terracotta"),
    LIGHT_BLUE_GLAZED_TERRACOTTA("minecraft:light_blue_glazed_terracotta"),
    LIGHT_GRAY_GLAZED_TERRACOTTA("minecraft:light_gray_glazed_terracotta"),
    LIME_GLAZED_TERRACOTTA("minecraft:lime_glazed_terracotta"),
    MAGENTA_GLAZED_TERRACOTTA("minecraft:magenta_glazed_terracotta"),
    ORANGE_GLAZED_TERRACOTTA("minecraft:orange_glazed_terracotta"),
    PINK_GLAZED_TERRACOTTA("minecraft:pink_glazed_terracotta"),
    PURPLE_GLAZED_TERRACOTTA("minecraft:purple_glazed_terracotta"),
    RED_GLAZED_TERRACOTTA("minecraft:red_glazed_terracotta"),
    WHITE_GLAZED_TERRACOTTA("minecraft:white_glazed_terracotta"),
    YELLOW_GLAZED_TERRACOTTA("minecraft:yellow_glazed_terracotta"),

    // Biomes O' Plenty
    BOP_GLOWING_MOSS_CARPET("biomesoplenty:glowing_moss_carpet"),

    // Create
    ROSE_QUARTZ_TILES("create:rose_quartz_tiles"),
    SMALL_ROSE_QUARTZ_TILES("create:small_rose_quartz_tiles");

    private final String name;

    TilesFlooringTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
