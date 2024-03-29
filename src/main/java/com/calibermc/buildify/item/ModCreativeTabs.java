package com.calibermc.buildify.item;

import com.calibermc.buildify.Buildify;
import com.calibermc.buildify.config.CommonConfigs;
import com.calibermc.buildify.util.ModTags;
import com.google.common.collect.Lists;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.CreativeModeTabRegistry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.tags.ITagManager;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ModCreativeTabs {
    private static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Buildify.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BUILDIFY_TAB = CREATIVE_TABS.register("buildify",
            () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.buildify"))
                    .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
                    .icon(() -> new ItemStack(Blocks.STONE))
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.HAMMER.get());
                        pOutput.accept(ModItems.NAILS.get());
                    }))
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_TABS.register(eventBus);
    }

    // ------------------------------------------------------
    // Sorting thing
    // ------------------------------------------------------


    // TODO: Add back Brewing and Misc Tabs

    static {
        //boolean loadedCaliber = ModList.get().isLoaded("caliber");
        BiFunction<String, Block, Supplier<ItemStack>> caliberBlocks = (s, b) -> () -> new ItemStack(ForgeRegistries.BLOCKS.getHolder(
                new ResourceLocation("caliber:%s".formatted(s))
        ).orElse(Holder.direct(b)).get());

        ResourceKey<CreativeModeTab> beforeTab = CreativeModeTabs.BUILDING_BLOCKS;

        beforeTab = createTab(beforeTab, "cobble_brick", caliberBlocks.apply("cobbled_dark_limestone", Blocks.COBBLESTONE), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                List<Item> items = new ArrayList<>();
                for (Item item : tags.getTag(ModTags.Items.cobbleBricksTab)) {
                    items.add(item);
                }

                Map<String, List<Item>> groupedItems = items.stream()
                        .collect(Collectors.groupingBy(item -> {
                            ItemStack itemStack = new ItemStack(item);
                            String itemName = itemStack.getItem().getName(itemStack).toString();
                            if (itemName.contains("granite")) {
                                return "granite";
                            } else if (itemName.contains("limestone")
                                    || itemName.contains("cobblestone")) {
                                return "limestone";
                            } else if (itemName.contains("marble")) {
                                return "marble";
                            } else {
                                return itemName;
                            }
                        }));

                groupedItems.entrySet().stream()
                        // Sort groups alphabetically by key
                        .sorted(Map.Entry.comparingByKey())
                        .forEach(entry -> {
                            entry.getValue().stream()
                                    // Sort based on itemName within groups
                                    .sorted(Comparator.comparing(item -> {
                                        ItemStack itemStack = new ItemStack(item);
                                        return itemStack.getItem().getName(itemStack).getString();
                                    }))
                                    // Add sorted items to the tab
                                    .forEach(item -> pOutput.accept(new ItemStack(item)));
                        });
            }
        });

//        beforeTab = createTab(beforeTab, "planks_beams", () -> new ItemStack(Blocks.OAK_PLANKS), (pParameters, pOutput) -> {
//            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
//            if (tags != null) {
//                for (Item item : tags.getTag(ModTags.Items.planksBeamsTab)) {
//                    pOutput.accept(new ItemStack(item));
//                }
//            }
//        });

        beforeTab = createTab(beforeTab, "planks_beams", () -> new ItemStack(Blocks.OAK_PLANKS), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                List<Item> items = new ArrayList<>();
                for (Item item : tags.getTag(ModTags.Items.planksBeamsTab)) {
                    items.add(item);
                }

                Map<String, List<Item>> groupedItems = items.stream()
                        .collect(Collectors.groupingBy(item -> {
                            ItemStack itemStack = new ItemStack(item);
                            String itemName = itemStack.getItem().getName(itemStack).toString();
                            if (itemName.contains("planks")
                                    || itemName.contains("boards")){
                                return "aplanks";
                            } else {
                                return itemName;
                            }
                        }));

                groupedItems.entrySet().stream()
                        // Sort groups alphabetically by key
                        .sorted(Map.Entry.comparingByKey())
                        .forEach(entry -> {
                            entry.getValue().stream()
                                    // Sort based on itemName within groups
                                    .sorted(Comparator.comparing(item -> {
                                        ItemStack itemStack = new ItemStack(item);
                                        return itemStack.getItem().getName(itemStack).getString();
                                    }))
                                    // Add sorted items to the tab
                                    .forEach(item -> pOutput.accept(new ItemStack(item)));
                        });
            }
        });

//        beforeTab = createTab(beforeTab, "roofing", caliberBlocks.apply("acacia_shingle_roof_45", Blocks.ACACIA_STAIRS), (pParameters, pOutput) -> {
//            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
//            if (tags != null) {
//                for (Item item : tags.getTag(ModTags.Items.roofingTab)) {
//                    pOutput.accept(new ItemStack(item));
//                }
//            }
//        });

//        beforeTab = createTab(beforeTab, "roofing", caliberBlocks.apply("acacia_shingle_roof_45", Blocks.ACACIA_STAIRS), (pParameters, pOutput) -> {
//            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
//            if (tags != null) {
//                for (Item item : getSortedItems()) {
//                    if (tags.getTag(ModTags.Items.roofingTab).contains(item)) {
//                        pOutput.accept(new ItemStack(item));
//                    }
//                }
//            }
//        });

        beforeTab = createTab(beforeTab, "roofing", caliberBlocks.apply("acacia_shingle_roof_45", Blocks.ACACIA_STAIRS), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                List<Item> items = new ArrayList<>();
                for (Item item : tags.getTag(ModTags.Items.roofingTab)) {
                    items.add(item);
                }

                Map<String, List<Item>> groupedItems = items.stream()
                        .collect(Collectors.groupingBy(item -> {
                            ItemStack itemStack = new ItemStack(item);
                            String itemName = itemStack.getItem().getName(itemStack).toString();
                            if (itemName.contains("terracotta")) {
                                return "terracotta";
                            } else if (itemName.contains("acacia")) {
                                return "acacia";
                            } else if (itemName.contains("bamboo")) {
                                return "bamboo";
                            } else if (itemName.contains("birch")) {
                                return "birch";
                            } else if (itemName.contains("cherry")) {
                                return "cherry";
                            } else if (itemName.contains("dark_oak")) {
                                return "dark_oak";
                            } else if (itemName.contains("jungle")) {
                                return "jungle";
                            } else if (itemName.contains("mangrove")) {
                                return "mangrove";
                            } else if (itemName.contains("oak") && !itemName.contains("dark")) {
                                return "oak";
                            } else if (itemName.contains("spruce")) {
                                return "spruce";
                            } else if (itemName.contains("warped")) {
                                return "warped";
                            } else if (itemName.contains("crimson")) {
                                return "crimson";
                            } else {
                                return itemName;
                            }
                        }));

                groupedItems.entrySet().stream()
                        // Sort groups alphabetically by key
                        .sorted(Map.Entry.comparingByKey())
                        .forEach(entry -> {
                            entry.getValue().stream()
                                    // Sort based on itemName within groups
                                    .sorted(Comparator.comparing(item -> {
                                        ItemStack itemStack = new ItemStack(item);
                                        return itemStack.getItem().getName(itemStack).getString();
                                    }))
                                    // Add sorted items to the tab
                                    .forEach(item -> pOutput.accept(new ItemStack(item)));
                        });
            }
        });

        beforeTab = createTab(beforeTab, "plaster_stucco", caliberBlocks.apply("beige_plaster", Blocks.WHITE_CONCRETE_POWDER), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : getSortedItems()) {
                    if (tags.getTag(ModTags.Items.plasterStuccoTab).contains(item)) {
                        pOutput.accept(new ItemStack(item));
                    }
                }
            }
        });

        beforeTab = createTab(beforeTab, "half_timbered_walls", caliberBlocks.apply("tudor_acacia_beige_plaster_left", Blocks.WHITE_TERRACOTTA), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : getSortedItems()) {
                    if (tags.getTag(ModTags.Items.halfTimberedWallTab).contains(item)) {
                        pOutput.accept(new ItemStack(item));
                    }
                }
            }
        });

        beforeTab = createTab(beforeTab, "tiles_flooring", () -> new ItemStack(Blocks.BROWN_GLAZED_TERRACOTTA), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : getSortedItems()) {
                    if (tags.getTag(ModTags.Items.tilesFlooringTab).contains(item)) {
                        pOutput.accept(new ItemStack(item));
                    }
                }
            }
        });

        beforeTab = createTab(beforeTab, "glass_windows", () -> new ItemStack(Blocks.GLASS), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : getSortedItems()) {
                    if (tags.getTag(ModTags.Items.glassWindowsTab).contains(item)) {
                        pOutput.accept(new ItemStack(item));
                    }
                }
            }
        });

        beforeTab = createTab(beforeTab, "lighting", () -> new ItemStack(Blocks.LANTERN), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : getSortedItems()) {
                    if (tags.getTag(ModTags.Items.lightingTab).contains(item)) {
                        pOutput.accept(new ItemStack(item));
                    }
                }
            }
        });

        beforeTab = createTab(beforeTab, "crafting", () -> new ItemStack(Items.CRAFTING_TABLE), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : getSortedItems()) {
                    if (tags.getTag(ModTags.Items.craftingTab).contains(item)) {
                        pOutput.accept(new ItemStack(item));
                    }
                }
            }
        });

        beforeTab = createTab(beforeTab, "stone", () -> new ItemStack(Blocks.STONE), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                List<Item> items = new ArrayList<>();
                for (Item item : tags.getTag(ModTags.Items.stoneTab)) {
                    items.add(item);
                }

                Map<String, List<Item>> groupedItems = items.stream()
                        .collect(Collectors.groupingBy(item -> {
                            ItemStack itemStack = new ItemStack(item);
                            String itemName = itemStack.getItem().getName(itemStack).toString();
                            if (itemName.contains("granite")) {
                                return "granite";
                            } else if (itemName.contains("limestone")
                                    || itemName.equals("Stone")) { // TODO: Fix Stone so it Groups with Limestone ??? HOW
                                return "limestone";
                            } else if (itemName.contains("marble")) {
                                return "marble";
                            } else if (itemName.contains("sandstone")) {
                                return "sandstone";
                            } else if (itemName.contains("blackstone")) {
                                return "blackstone";
                            } else if (itemName.contains("basalt")) {
                                return "basalt";
                            } else if (itemName.contains("deepslate")) {
                                return "deepslate";
                            } else if (itemName.contains("diorite")) {
                                return "diorite";
                            } else if (itemName.contains("andesite")) {
                                return "andesite";
                            } else if (itemName.contains("quartz")) {
                                return "quartz";
                            } else if (itemName.contains("terracotta")) {
                                return "terracotta";
                            } else if (itemName.contains("calcite")) {
                                return "nether";
                            } else if (itemName.contains("dripstone")) {
                                return "end";
                            } else if (itemName.contains("tuff")) {
                                return "tuff";
                            } else if (itemName.contains("nether")) {
                                return "nether";
                            } else if (itemName.contains("obsidian")) {
                                return "obsidian";
                            } else if (itemName.contains("purpur")) {
                                return "purpur";
                            } else {
                                return itemName;
                            }
                        }));

                groupedItems.entrySet().stream()
                        // Sort groups alphabetically by key
                        .sorted(Map.Entry.comparingByKey())
                        .forEach(entry -> {
                            entry.getValue().stream()
                                    // Sort based on itemName within groups
                                    .sorted(Comparator.comparing(item -> {
                                        ItemStack itemStack = new ItemStack(item);
                                        return itemStack.getItem().getName(itemStack).getString();
                                    }))
                                    // Add sorted items to the tab
                                    .forEach(item -> pOutput.accept(new ItemStack(item)));
                        });
            }
        });

        beforeTab = createTab(beforeTab, "sand_gravel", () -> new ItemStack(Blocks.SAND), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                List<Item> items = new ArrayList<>();
                for (Item item : tags.getTag(ModTags.Items.sandGravelTab)) {
                    items.add(item);
                }

                Map<String, List<Item>> groupedItems = items.stream()
                        .collect(Collectors.groupingBy(item -> {
                            ItemStack itemStack = new ItemStack(item);
                            String itemName = itemStack.getItem().getName(itemStack).toString();
                            if (itemName.contains("gravel")) {
                                return "gravel";
                            } else if (itemName.contains("sand")) {
                                return "sand";
                            } else {
                                return itemName;
                            }
                        }));

                groupedItems.entrySet().stream()
                        // Sort groups alphabetically by key
                        .sorted(Map.Entry.comparingByKey())
                        .forEach(entry -> {
                            entry.getValue().stream()
                                    // Sort based on itemName within groups
                                    .sorted(Comparator.comparing(item -> {
                                        ItemStack itemStack = new ItemStack(item);
                                        return itemStack.getItem().getName(itemStack).getString();
                                    }))
                                    // Add sorted items to the tab
                                    .forEach(item -> pOutput.accept(new ItemStack(item)));
                        });
            }
        });

        beforeTab = createTab(beforeTab, "grass_dirt", () -> new ItemStack(Blocks.GRASS_BLOCK), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : getSortedItems()) {
                    if (tags.getTag(ModTags.Items.grassDirtTab).contains(item)) {
                        pOutput.accept(new ItemStack(item));
                    }
                }
            }
        });

        beforeTab = createTab(beforeTab, "metals_ores", () -> new ItemStack(Blocks.GOLD_ORE), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : getSortedItems()) {
                    if (tags.getTag(ModTags.Items.metalsOresTab).contains(item)) {
                        pOutput.accept(new ItemStack(item));
                    }
                }
            }
        });

        beforeTab = createTab(beforeTab, "logs", () -> new ItemStack(Blocks.OAK_LOG), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : getSortedItems()) {
                    if (tags.getTag(ModTags.Items.logsTab).contains(item)) {
                        pOutput.accept(new ItemStack(item));
                    }
                }
            }
        });

        beforeTab = createTab(beforeTab, "leaves", () -> new ItemStack(Blocks.ACACIA_LEAVES), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : getSortedItems()) {
                    if (tags.getTag(ModTags.Items.leavesTab).contains(item)) {
                        pOutput.accept(new ItemStack(item));
                    }
                }
            }
        });

        beforeTab = createTab(beforeTab, "flowers_plants", () -> new ItemStack(Blocks.POPPY), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : getSortedItems()) {
                    if (tags.getTag(ModTags.Items.flowersPlantsTab).contains(item)) {
                        pOutput.accept(new ItemStack(item));
                    }
                }
            }
        });

        beforeTab = createTab(beforeTab, "crops", () -> new ItemStack(Blocks.WHEAT), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : getSortedItems()) {
                    if (tags.getTag(ModTags.Items.cropsTab).contains(item)) {
                        pOutput.accept(new ItemStack(item));
                    }
                }
            }
        });

        beforeTab = createTab(beforeTab, "decor", () -> new ItemStack(Blocks.BLUE_BANNER), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                List<Item> items = new ArrayList<>();
                for (Item item : tags.getTag(ModTags.Items.decorTab)) {
                    items.add(item);
                }

                Map<String, List<Item>> groupedItems = items.stream()
                        .collect(Collectors.groupingBy(item -> {
                            ItemStack itemStack = new ItemStack(item);
                            String itemName = itemStack.getItem().getName(itemStack).toString();
                            if (itemName.contains("bookshelf")) {
                                return "bookshelf";
                            } else if (itemName.contains("banner")) {
                                return "banner";
                            } else {
                                return itemName;
                            }
                        }));

                groupedItems.entrySet().stream()
                        // Sort groups alphabetically by key
                        .sorted(Map.Entry.comparingByKey())
                        .forEach(entry -> {
                            entry.getValue().stream()
                                    // Sort based on itemName within groups
                                    .sorted(Comparator.comparing(item -> {
                                        ItemStack itemStack = new ItemStack(item);
                                        return itemStack.getItem().getName(itemStack).getString();
                                    }))
                                    // Add sorted items to the tab
                                    .forEach(item -> pOutput.accept(new ItemStack(item)));
                        });
            }
        });

        beforeTab = createTab(beforeTab, "furniture", () -> new ItemStack(Blocks.BROWN_BED), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                List<Item> items = new ArrayList<>();
                for (Item item : tags.getTag(ModTags.Items.furnitureTab)) {
                    items.add(item);
                }

                Map<String, List<Item>> groupedItems = items.stream()
                        .collect(Collectors.groupingBy(item -> {
                            ItemStack itemStack = new ItemStack(item);
                            String itemName = itemStack.getItem().getName(itemStack).toString();
                            if (itemName.contains("armoire")) {
                                return "armoire";
                            } else if (itemName.contains("desk")) {
                                return "desk";
                            } else if (itemName.contains("chair")) {
                                return "chair";
                            } else if (itemName.contains("table")) {
                                return "table";
                            } else if (itemName.contains("cabinet")) {
                                return "cabinet";
                            } else if (itemName.contains("shelf")) {
                                return "shelf";
                            } else if (itemName.contains("couch")) {
                                return "couch";
                            } else if (itemName.contains("bench")) {
                                return "bench";
                            } else if (itemName.contains("stool")) {
                                return "stool";
                            } else if (itemName.contains("bed")) {
                                return "bed";
                            } else if (itemName.contains("nightstand")) {
                                return "nightstand";
                            } else if (itemName.contains("dresser")) {
                                return "dresser";
                            } else if (itemName.contains("wardrobe")) {
                                return "wardrobe";
                            } else if (itemName.contains("mirror")) {
                                return "mirror";
                            } else {
                                return itemName;
                            }
                        }));

                groupedItems.entrySet().stream()
                        // Sort groups alphabetically by key
                        .sorted(Map.Entry.comparingByKey())
                        .forEach(entry -> {
                            entry.getValue().stream()
                                    // Sort based on itemName within groups
                                    .sorted(Comparator.comparing(item -> {
                                        ItemStack itemStack = new ItemStack(item);
                                        return itemStack.getItem().getName(itemStack).getString();
                                    }))
                                    // Add sorted items to the tab
                                    .forEach(item -> pOutput.accept(new ItemStack(item)));
                        });
            }
        });

        beforeTab = createTab(beforeTab, "storage", () -> new ItemStack(Blocks.CHEST), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : getSortedItems()) {
                    if (tags.getTag(ModTags.Items.storageTab).contains(item)) {
                        pOutput.accept(new ItemStack(item));
                    }
                }
            }
        });

        beforeTab = createTab(beforeTab, "redstone", () -> new ItemStack(Items.REDSTONE), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : getSortedItems()) {
                    if (tags.getTag(ModTags.Items.redstoneTab).contains(item)) {
                        pOutput.accept(new ItemStack(item));
                    }
                }
            }
        });

        beforeTab = createTab(beforeTab, "food", () -> new ItemStack(Items.APPLE), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : getSortedItems()) {
                    if (tags.getTag(ModTags.Items.foodTab).contains(item)) {
                        pOutput.accept(new ItemStack(item));
                    }
                }
            }
        });

        beforeTab = createTab(beforeTab, "tools_weapons", () -> new ItemStack(Items.IRON_SWORD), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                List<Item> items = new ArrayList<>();
                for (Item item : tags.getTag(ModTags.Items.toolsWeaponsTab)) {
                    items.add(item);
                }

                Map<String, List<Item>> groupedItems = items.stream()
                        .collect(Collectors.groupingBy(item -> {
                            ItemStack itemStack = new ItemStack(item);
                            String itemName = itemStack.getItem().getName(itemStack).toString();
                            if (itemName.contains("sword")
                                    || itemName.contains("axe")
                                    || itemName.contains("pickaxe")
                                    || itemName.contains("shovel")
                                    || itemName.contains("hoe")) {
                                return "wtools";
                            } else if (itemName.contains("trident")) {
                                return "xtrident";
                            } else if (itemName.contains("shield")) {
                                return "xshields";
                            } else if (itemName.contains("bow")) {
                                return "ybows";
                            } else if (itemName.contains("arrow")) {
                                return "zarrow";
                            } else if (itemName.contains("bucket")) {
                                return "zbucket";
                            } else if (itemName.contains("lead")
                                    || itemName.contains("name_tag")
                                    || itemName.contains("compass")
                                    || itemName.contains("clock")
                                    || itemName.contains("fishing_rod")
                                    || itemName.contains("shears")
                                    || itemName.contains("spyglass")
                                    || itemName.contains("hammer")
                                    || itemName.contains("nails")
                                    || itemName.contains("flint_and_steel")
                                    || itemName.contains("fire_charge")
                                    || itemName.contains("carrot_on_a_stick")) {
                                return "zmisc";
                            } else {
                                return itemName;
                            }
                        }));

                groupedItems.entrySet().stream()
                        // Sort groups alphabetically by key
                        .sorted(Map.Entry.comparingByKey())
                        .forEach(entry -> {
                            entry.getValue().stream()
                                    // Sort based on itemName within groups
                                    .sorted(Comparator.comparing(item -> {
                                        ItemStack itemStack = new ItemStack(item);
                                        return itemStack.getItem().getName(itemStack).getString();
                                    }))
                                    // Add sorted items to the tab
                                    .forEach(item -> pOutput.accept(new ItemStack(item)));
                        });
            }
        });

        beforeTab = createTab(beforeTab, "armor", () -> new ItemStack(Items.IRON_CHESTPLATE), (pParameters, pOutput) -> {
            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
            if (tags != null) {
                for (Item item : getSortedItems()) {
                    if (tags.getTag(ModTags.Items.armorTab).contains(item)) {
                        pOutput.accept(new ItemStack(item));
                    }
                }
            }
        });
    }


    //original
//        beforeTab = createTab(beforeTab, "tools_weapons", () -> new ItemStack(Items.IRON_SWORD), (pParameters, pOutput) -> {
//            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
//            if (tags != null) {
//                for (Item item : tags.getTag(ModTags.Items.toolsWeaponsTab)) {
//                    pOutput.accept(new ItemStack(item));
//                }
//            }
//        });

    //alphabetical
//        beforeTab = createTab(beforeTab, "tools_weapons", () -> new ItemStack(Items.IRON_SWORD), (pParameters, pOutput) -> {
//            ITagManager<Item> tags = ForgeRegistries.ITEMS.tags();
//            if (tags != null) {
//                for (Item item : getSortedItems()) {
//                    if (tags.getTag(ModTags.Items.toolsWeaponsTab).contains(item)) {
//                        pOutput.accept(new ItemStack(item));
//                    }
//                }
//            }
//        });



    public static List<Item> getItems() {
        return ForgeRegistries.ITEMS.getEntries().stream()
                .map(Map.Entry::getValue)
                .toList();
    }

    public static List<Item> getSortedItems() {
        return ForgeRegistries.ITEMS.getEntries().stream().map(Map.Entry::getValue).sorted((o, o1) -> {
            ResourceLocation str1 = ForgeRegistries.ITEMS.getKey(o);
            ResourceLocation str2 = ForgeRegistries.ITEMS.getKey(o1);
            assert str1 != null && str2 != null;
            return str1.compareTo(str2);
        }).toList();
    }

    public static List<CreativeModeTab> setupCreativeTabs(List<CreativeModeTab> tabsOld) {
        boolean removeMCTabs;
        try {
            removeMCTabs = CommonConfigs.CUSTOM_CREATIVE_INVENTORY.get();
        } catch (Throwable e) {
            removeMCTabs = false;
        }
        List<CreativeModeTab> tabs = tabsOld.stream().filter(tab -> {
            boolean baseTabs = CreativeModeTabRegistry.getDefaultTabs().contains(tab);
            ResourceLocation name = BuiltInRegistries.CREATIVE_MODE_TAB.getKey(tab);
            if (name != null) {
                return name.getNamespace().equals("buildify")
                        && !name.getPath().equals("buildify") || baseTabs; // copy default mc tabs and our buildify tag tabs
            }
            return baseTabs;
        }).collect(Collectors.toList());

        for (CreativeModeTab tab : tabsOld) {
            ResourceLocation name = BuiltInRegistries.CREATIVE_MODE_TAB.getKey(tab);
            if (name != null && !CreativeModeTabRegistry.getDefaultTabs().contains(tab)) {
                // copy mc tabs
                if (name.getNamespace().equals("minecraft")) {
                    if (!removeMCTabs) {
                        tabs.add(tab);
                    }
                } else {
                    // copy other tabs
                    if (!name.getNamespace().equals("buildify") || name.getPath().equals("buildify")) {
                        tabs.add(tab);
                    }
                }
            }
        }

        for (CreativeModeTab tab : Lists.newArrayList(tabs)) {
            if (tab.getDisplayItems().isEmpty()) {
                tabs.remove(tab); // remove tabs that are empty
            }
        }

        return tabs;
    }

    public static ResourceKey<CreativeModeTab> createTab(ResourceKey<CreativeModeTab> key, String label, Supplier<ItemStack> iconStack, CreativeModeTab.DisplayItemsGenerator displayItems) {
        return CREATIVE_TABS.register(label, () -> CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.%s".formatted(label)))
                .withTabsBefore(key)
                .icon(iconStack).displayItems(displayItems).build()).getKey();
    }

}
