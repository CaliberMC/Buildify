package com.calibermc.buildify.datagen.properties;

public enum StoneTypes {

    ANDESITE("minecraft:andesite"),
    BASALT("minecraft:basalt"),
    BEDROCK("minecraft:bedrock"),
    BLACKSTONE("minecraft:blackstone"),
    CALCITE("minecraft:calcite"),
    DEEPSLATE("deepslate"),
    DIORITE("minecraft:diorite"),
    DRIPSTONE("minecraft:dripstone"),
    END_STONE("minecraft:end_stone"),
    GILDED_BLACKSTONE("minecraft:gilded_blackstone"),
    GRANITE("minecraft:granite"),
    QUARTZ("minecraft:quartz"),
    RED_SANDSTONE("minecraft:red_sandstone"),
    SANDSTONE("minecraft:sandstone"),
    SLATE("slate"),
    SMOOTH_BASALT("minecraft:smooth_basalt"),
    STONE("stone"),
    TUFF("tuff"),

    // Biomes O' Plenty
    BOP_BRIMSTONE("biomesoplenty:brimstone"),
    BOP_BLACK_SANDSTONE("biomesoplenty:black_sandstone"),
    BOP_RANGE_SANDSTONE("biomesoplenty:orange_sandstone"),
    BOP_WHITE_SANDSTONE("biomesoplenty:white_sandstone"),
    BOP_ROSE_QUARTZ_BLOCK("biomesoplenty::rose_quartz_block"),

    // Create
    CREATE_ASURINE("create:asurine"),
    CREATE_CRIMSITE("create:crimsite"),
    CREATE_LIMESTONE("create:limestone"),
    CREATE_OCHRUM("create:ochrum"),
    CREATE_ROSE_QUARTZ_BLOCK("create:rose_quartz_block"),
    CREATE_SCORCHIA("create:scorchia"),
    CREATE_SCORIA("create:scoria"),
    CREATE_VERIDIUM("create:veridium"),

    // Regions Unexplored
    RU_ARGILLITE("regions_unexplored:argillite"),
    RU_CHALK("regions_unexplored:chalk");



    private final String name;

    StoneTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
