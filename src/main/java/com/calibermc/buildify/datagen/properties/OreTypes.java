package com.calibermc.buildify.datagen.properties;

public enum OreTypes {
    AMETHYST_BLOCK("amethyst_block"),
    BRASS_BLOCK("brass_block"),
    BUDDING_AMETHYST("budding_amethyst"),
    COAL_BLOCK("coal_block"),
    COAL_ORE("coal_ore"),
    DEEPSLATE_COAL_ORE("deepslate_coal_ore"),
    COPPER_BLOCK("copper_block"),
    COOPER_ORE("copper_ore"),
    DEEPSLATE_COPPER_ORE("deepslate_copper_ore"),
    DIAMOND_BLOCK("diamond_block"),
    DIAMOND_ORE("diamond_ore"),
    DEEPSLATE_DIAMOND_ORE("deepslate_diamond_ore"),
    EMERALD_BLOCK("emerald_block"),
    EMERALD_ORE("emerald_ore"),
    DEEPSLATE_EMERALD_ORE("deepslate_emerald_ore"),
    GOLD_BLOCK("gold_block"),
    GOLD_ORE("gold_ore"),
    DEEPSLATE_GOLD_ORE("deepslate_gold_ore"),
    IRON_BLOCK("iron_block"),
    IRON_ORE("iron_ore"),
    DEEPSLATE_IRON_ORE("deepslate_iron_ore"),
    LAPIS_BLOCK("lapis_block"),
    LAPIS_ORE("lapis_ore"),
    DEEPSLATE_LAPIS_ORE("deepslate_lapis_ore"),
    NETHER_QUARTZ("nether_quartz"),
    SAPPHIRE_BLOCK("sapphire_block"),
    SAPPHIRE_ORE("sapphire_ore"),
    DEEPSLATE_SAPPHIRE_ORE("deepslate_sapphire_ore"),
    SILVER_BLOCK("silver_block"),
    SILVER_ORE("silver_ore"),
    DEEPSLATE_SILVER_ORE("deepslate_silver_ore"),
    ZINC_BLOCK("zinc_block"),
    ZINC_ORE("zinc_ore"),
    DEEPSLATE_ZINC_ORE("deepslate_zinc_ore");

    private final String name;

    OreTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
