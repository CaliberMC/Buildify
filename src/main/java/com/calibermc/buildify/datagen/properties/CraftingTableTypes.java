package com.calibermc.buildify.datagen.properties;

public enum CraftingTableTypes {
    ANVIL("anvil"),
    BEEHIVE("beehive"),
    BLAST_FURNACE("blast_furnace"),
    BREWING_STAND("brewing_stand"),
    CARTOGRAPHY_TABLE("cartography_table"),
    CAULDRON("cauldron"),
    CRAFTING_TABLE("crafting_table"),
    ENCHANTING_TABLE("enchanting_table"),
    FLETCHING_TABLE("fletching_table"),
    FURNACE("furnace"),
    GRINDSTONE("grindstone"),
    LECTERN("lectern"),
    LOOM("loom"),
    SMOKER("smoker"),
    SMITHING_TABLE("smithing_table"),
    STONECUTTER("stonecutter"),
    WOODCUTTER("woodcutter");

    private final String name;

    CraftingTableTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
