package com.calibermc.buildify.datagen.properties;

public enum CobbleBricksTypes {
    ROSE_QUARTZ_TILES("rose_quartz_tiles"),
    SMALL_ROSE_QUARTZ_TILES("small_rose_quartz_tiles"),;

    private final String name;

    CobbleBricksTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
