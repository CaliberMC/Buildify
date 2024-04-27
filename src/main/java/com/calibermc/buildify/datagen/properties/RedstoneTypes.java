package com.calibermc.buildify.datagen.properties;

public enum RedstoneTypes {
    ACTIVATOR_RAIL("activator_rail"),
    ANALOGUE_LEVER("analogue_lever"),
    CHAIN_COMMAND_BLOCK("chain_command_block"),
    CHUTE("chute"),
    COMMAND_BLOCK("command_block"),
    COMPARATOR("comparator"),
    DAYLIGHT_DETECTOR("daylight_detector"),
    DETECTOR_RAIL("detector_rail"),
    DISPENSER("dispenser"),
    DROPPER("dropper"),
    HOPPER("hopper"),
    JUKEBOX("jukebox"),
    LEVER("lever"),
    NOTE_BLOCK("note_block"),
    OBSERVER("observer"),
    PISTON("piston"),
    POWERED_RAIL("powered_rail"),
    RAIL("rail"),
    REDSTONE_BLOCK("redstone_block"),
    REDSTONE_CONTACT("redstone_contact"),
    REDSTONE_LAMP("redstone_lamp"),
    REDSTONE_LINK("redstone_link"),
    REDSTONE_TORCH("redstone_torch"),
    REPEATER("repeater"),
    REPEATING_COMMAND_BLOCK("repeating_command_block"),
    SCULK_SENSOR("sculk_sensor"),
    CALIBRATED_SCULK_SENSOR("calibrated_sculk_sensor"),
    SCULK_SHRIEKER("sculk_shrieker"),
    SLIME_BLOCK("slime_block"),
    SMART_CHUTE("smart_chute"),
    SMART_OBSERVER("smart_observer"),
    STICKY_PISTON("sticky_piston"),
    TARGET("target"),
    TNT("tnt"),
    TRAPPED_CHEST("trapped_chest"),
    TRIPWIRE("tripwire"),
    TRIPWIRE_HOOK("tripwire_hook");


    private final String name;

    RedstoneTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
