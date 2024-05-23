package com.calibermc.buildify.forge.datagen.properties;

public enum CraftingTableTypes {
    ANVIL("minecraft:anvil"),
    BEEHIVE("minecraft:beehive"),
    BLAST_FURNACE("minecraft:blast_furnace"),
    BREWING_STAND("minecraft:brewing_stand"),
    CARTOGRAPHY_TABLE("minecraft:cartography_table"),
    CAULDRON("minecraft:cauldron"),
    CRAFTING_TABLE("minecraft:crafting_table"),
    ENCHANTING_TABLE("minecraft:enchanting_table"),
    FLETCHING_TABLE("minecraft:fletching_table"),
    FURNACE("minecraft:furnace"),
    GRINDSTONE("minecraft:grindstone"),
    LECTERN("minecraft:lectern"),
    LOOM("minecraft:loom"),
    SMITHING_TABLE("minecraft:smithing_table"),
    SMOKER("minecraft:smoker"),
    STONECUTTER("minecraft:stonecutter"),

    // Caliber
    WOODCUTTER("caliber:woodcutter");

    private final String name;

    CraftingTableTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
