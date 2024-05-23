package com.calibermc.buildify.forge.datagen.properties;

public enum BudClusterTypes {
    BRIMSTONE_BUD("biomesoplenty:brimstone_bud"),
    BRIMSONTE_CLUSTER("biomesoplenty:brimstone_cluster"),
    ;

    private final String name;

    BudClusterTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
