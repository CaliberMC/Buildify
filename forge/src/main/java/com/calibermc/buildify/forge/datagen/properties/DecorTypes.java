package com.calibermc.buildify.forge.datagen.properties;

public enum DecorTypes {
    CHISELED_BOOKSHELF("minecraft:chiseled_bookshelf");

    private final String name;

    DecorTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
