package com.calibermc.buildify.forge.datagen.properties;

public enum DoorGateTypes {

    // Create Items
    CREATE_ANDESITE_DOOR("create:andesite_door"),
    CREATE_BRASS_DOOR("create:brass_door"),
    CREATE_COPPER_DOOR("create:copper_door"),
    CREATE_TRAIN_DOOR("create:train_door"),
    CREATE_TRAIN_TRAP_DOOR("create:train_trapdoor");

    private final String name;

    DoorGateTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
