package com.calibermc.buildify.util.compat;

import com.calibermc.caliber.Caliber;
import net.minecraftforge.fml.ModList;

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
        BOP = ModList.get().isLoaded("biomesoplenty");
        BYG = ModList.get().isLoaded("byg");
        CALIBER = ModList.get().isLoaded("caliber");
        CHIPPED = ModList.get().isLoaded("chipped");
        CREATE = ModList.get().isLoaded("create");
        DOUBLE_DOORS = ModList.get().isLoaded("doubledoors");
        MANYIDEAS_DOORS = ModList.get().isLoaded("manyideas_doors");
        NATURES_CANVAS = ModList.get().isLoaded("naturescanvas");
        QUARK = ModList.get().isLoaded("quark");
        STONE_WORKS = ModList.get().isLoaded("stone_works");
        REGIONS_UNEXPLORED = ModList.get().isLoaded("regions_unexplored");


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

