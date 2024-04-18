package com.calibermc.buildify.datagen.properties;

public enum StoneTypes {
    ANDESITE("andesite"),
    ARGILLITE("argillite"),
    ASURINE("asurine"),
    BASALT("basalt"),
    BLACK_SANDSTONE("black_sandstone"),
    BLACKSTONE("blackstone"),
    BRIMSTONE("brimstone"),
    CALCITE("calcite"),
    CHALK("chalk"),
    CRIMSITE("crimsite"),
    DEEPSLATE("deepslate"),
    DIORITE("diorite"),
    DRIPSTONE("dripstone"),
    END_STONE("end_stone"),
    GILDED_BLACKSTONE("gilded_blackstone"),
    GRANITE("granite"),
    LIMESTONE("limestone"),
    MARBLE("marble"),
    OCHRUM("ochrum"),
    ORANGE_SANDSTONE("orange_sandstone"),
    QUARTZ("quartz"),
    RED_SANDSTONE("red_sandstone"),
    ROSE_QUARTZ("rose_quartz"),
    SANDSTONE("sandstone"),
    SCORCHIA("scorchia"),
    SCORIA("scoria"),
    SLATE("slate"),
    STONE("stone"),
    TUFF("tuff"),
    VERIDIUM("veridium"),
    WHITE_SANDSTONE("white_sandstone");

    private final String name;

    StoneTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
