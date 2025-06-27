package com.calibermc.buildify.util;

import com.calibermc.buildify.Buildify;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.*;
import java.util.stream.Collectors;

public class ModTags {


    public static class Blocks {
        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Buildify.MOD_ID, name));
        }
        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }

    }

    public static class Items {

        /* Creative Tab Tags */
        public static final TagKey<Item> armorTab = tag("creative_tabs/armor_tab");
        public static final TagKey<Item> cobbleBricksTab = tag( "creative_tabs/cobble_bricks_tab");
        public static final TagKey<Item> concretePlasterStuccoTab = tag("creative_tabs/concrete_plaster_stucco_tab");
        public static final TagKey<Item> craftingTab = tag("creative_tabs/crafting_tab");
        public static final TagKey<Item> cropsTab = tag("creative_tabs/crops_tab");
        public static final TagKey<Item> decorTab = tag("creative_tabs/decor_tab");
        public static final TagKey<Item> doorsGatesTab = tag("creative_tabs/doors_gates_tab");
        public static final TagKey<Item> flowersPlantsTab = tag("creative_tabs/flowers_plants_tab");
        public static final TagKey<Item> foodTab = tag("creative_tabs/food_tab");
        public static final TagKey<Item> furnitureTab = tag("creative_tabs/furniture_tab");
        public static final TagKey<Item> glassWindowsTab = tag("creative_tabs/glass_windows_tab");
        public static final TagKey<Item> grassDirtTab = tag("creative_tabs/grass_dirt_tab");
        public static final TagKey<Item> halfTimberedWallTab = tag("creative_tabs/half_timbered_wall_tab");
        public static final TagKey<Item> leavesTab = tag("creative_tabs/leaves_tab");
        public static final TagKey<Item> lightingTab = tag("creative_tabs/lighting_tab");
        public static final TagKey<Item> logsTab = tag("creative_tabs/logs_tab");
        public static final TagKey<Item> metalsOresTab = tag("creative_tabs/metals_ores_tab");
        public static final TagKey<Item> miscTab = tag("creative_tabs/misc_tab");
        public static final TagKey<Item> planksBeamsTab = tag("creative_tabs/planks_beams_tab");
        public static final TagKey<Item> redstoneTab = tag("creative_tabs/redstone_tab");
        public static final TagKey<Item> roofingTab = tag("creative_tabs/roofing_tab");
        public static final TagKey<Item> sandGravelTab = tag("creative_tabs/sand_gravel_tab");
        public static final TagKey<Item> spawnEggTab = tag("creative_tabs/spawn_egg_tab");
        public static final TagKey<Item> stoneTab = tag("creative_tabs/stone_tab");
        public static final TagKey<Item> storageTab = tag("creative_tabs/storage_tab");
        public static final TagKey<Item> tilesFlooringTab = tag("creative_tabs/tiles_flooring_tab");
        public static final TagKey<Item> toolsWeaponsTab = tag("creative_tabs/tools_weapons_tab");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Buildify.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }

    public static Set<TagKey<Item>> getCreativeTabTags() {
        return ForgeRegistries.ITEMS.getValues().stream()
                // FlatMap to get all distinct tags of items
                .flatMap(item -> item.builtInRegistryHolder().tags().toList().stream())
                // Filter tags by a specific path segment (e.g., starts with 'creative_tabs/')
                .filter(tagKey -> tagKey.location().getPath().startsWith("creative_tabs/"))
                // Collect into a set to eliminate duplicates
                .collect(Collectors.toSet());
    }

}
