package com.calibermc.buildify.forge.datagen.properties;

public enum GrassDirtTypes {

    COARSE_DIRT("minecraft:coarse_dirt"),
    DIRT("minecraft:dirt"),
    DIRT_PATH("minecraft:dirt_path"),
    GRASS_BLOCK("minecraft:grass_block"),
    MYCELIUM("minecraft:mycelium"),
    PODZOL("minecraft:podzol"),
    ROOTED_DIRT("minecraft:rooted_dirt"),
    SNOWY_DIRT("minecraft:snowy_dirt"),

    // Biomes O' Plenty
    BOP_ORIGIN_GRASS_BLOCK("biomesoplenty:origin_grass_block"),

    // Regions Unexplored
    RU_ALPHA_GRASS_BLOCK("regions_unexplored:alpha_grass_block"),
    RU_ARGILLITE_GRASS_BLOCK("regions_unexplored:argillite_grass_block"),
    RU_CHALK_GRASS_BLOCK("regions_unexplored:chalk_grass_block"),
    RU_DEEPSLATE_GRASS_BLOCK("regions_unexplored:deepslate_grass_block"),
    RU_SILT_GRASS_BLOCK("regions_unexplored:silt_grass_block"),
    RU_STONE_GRASS_BLOCK("regions_unexplored:stone_grass_block"),
    RU_PEAT_GRASS_BLOCK("regions_unexplored:peat_grass_block"),
;

    private final String name;

    GrassDirtTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
