package com.calibermc.buildify.util.compat;

import net.mehvahdjukaar.moonlight.api.platform.PlatHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ModCompats {

    public static List<String> compatMODID = new ArrayList<>(Arrays.asList("minecraft"));

    public static final boolean BOP;
    public static final boolean BYG;
    public static final boolean CALIBER;
    public static final boolean CHIPPED;
    public static final boolean CREATE;
    public static final boolean DOUBLE_DOORS;
    public static final boolean MANYIDEAS_DOORS;
    public static final boolean NATURES_CANVAS;
    public static final boolean QUARK;
    public static final boolean STONE_WORKS;
    public static final boolean REGIONS_UNEXPLORED;

    static {
        BOP = PlatHelper.isModLoaded("biomesoplenty");
        BYG = PlatHelper.isModLoaded("byg");
        CALIBER = PlatHelper.isModLoaded("caliber");
        CHIPPED = PlatHelper.isModLoaded("chipped");
        CREATE = PlatHelper.isModLoaded("create");
        DOUBLE_DOORS = PlatHelper.isModLoaded("doubledoors");
        MANYIDEAS_DOORS = PlatHelper.isModLoaded("manyideas_doors");
        NATURES_CANVAS = PlatHelper.isModLoaded("naturescanvas");
        QUARK = PlatHelper.isModLoaded("quark");
        STONE_WORKS = PlatHelper.isModLoaded("stone_works");
        REGIONS_UNEXPLORED = PlatHelper.isModLoaded("regions_unexplored");


        if (BOP) {
            compatMODID.add("biomesoplenty");
        }
        if (BYG) {
            compatMODID.add("byg");
        }
        if (CALIBER) {
            compatMODID.add("caliber");
            compatMODID.add("buildify");
        }
        if (CHIPPED) {
            compatMODID.add("chipped");
        }
        if (CREATE) {
            compatMODID.add("create");
        }
        if (DOUBLE_DOORS) {
            compatMODID.add("doubledoors");
        }
        if (MANYIDEAS_DOORS) {
            compatMODID.add("manyideas_doors");
        }
        if (NATURES_CANVAS) {
            compatMODID.add("naturescanvas");
        }
        if (QUARK) {
            compatMODID.add("quark");
        }
        if (STONE_WORKS) {
            compatMODID.add("stone_works");
        }
        if (REGIONS_UNEXPLORED) {
            compatMODID.add("regions_unexplored");
        }
    }
}

