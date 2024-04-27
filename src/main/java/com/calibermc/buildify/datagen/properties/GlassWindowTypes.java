package com.calibermc.buildify.datagen.properties;

public enum GlassWindowTypes {

    // Create
    ACACIA_WINDOW("create:acacia_window"),
    ACACIA_WINDOW_PANE("create:acacia_window_pane"),
    BIRCH_WINDOW("create:birch_window"),
    BIRCH_WINDOW_PANE("create:birch_window_pane"),
    CRIMSOM_WINDOW("create:crimson_window"),
    CRIMSOM_WINDOW_PANE("create:crimson_window_pane"),
    DARK_OAK_WINDOW("create:dark_oak_window"),
    DARK_OAK_WINDOW_PANE("create:dark_oak_window_pane"),
    FRAMED_GLASS_DOOR("create:framed_glass_door"),
    FRAMED_GLASS_TRAPDOOR("create:framed_glass_trapdoor"),
    FRAMED_GLASS("create:framed_glass"),
    FRAMED_GLASS_PANE("create:framed_glass_pane"),
    HORIZONTAL_FRAMED_GLASS("create:horizontal_framed_glass"),
    HORIZONTAL_FRAMED_GLASS_PANE("create:horizontal_framed_glass_pane"),
    JUNGLE_WINDOW("create:jungle_window"),
    JUNGLE_WINDOW_PANE("create:jungle_window_pane"),
    MANGROVE_WINDOW("create:mangrove_window"),
    MANGROVE_WINDOW_PANE("create:mangrove_window_pane"),
    OAK_WINDOW("create:oak_window"),
    OAK_WINDOW_PANE("create:oak_window_pane"),
    ORNATE_IRON_WINDOW("create:ornate_iron_window"),
    ORNATE_IRON_WINDOW_PANE("create:ornate_iron_window_pane"),
    SPRUCE_WINDOW("create:spruce_window"),
    SPRUCE_WINDOW_PANE("create:spruce_window_pane"),
    TILED_GLASS("create:tiled_glass"),
    TILED_GLASS_PANE("create:tiled_glass_pane"),
    VERTICAL_FRAMED_GLASS("create:vertical_framed_glass"),
    VERITCAL_FRAMED_GLASS_PANE("create:vertical_framed_glass_pane"),
    WARPED_WINDOW("create:warped_window"),
    WARPED_WINDOW_PANE("create:warped_window_pane");


    private final String name;

    GlassWindowTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
