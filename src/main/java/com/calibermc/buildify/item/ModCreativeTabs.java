package com.calibermc.buildify.item;

import com.calibermc.buildify.Buildify;
import com.calibermc.buildify.config.CommonConfigs;
import com.calibermc.buildify.util.ModTags;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.CreativeModeTabRegistry;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ModCreativeTabs {
    private static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Buildify.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BUILDIFY_TAB = CREATIVE_TABS.register("buildify",
            () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.buildify"))
                    .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
                    .icon(() -> new ItemStack(Blocks.STONE))
                    .displayItems(((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.HAMMER.get());
                        pOutput.accept(ModItems.NAILS.get());
                    }))
                    .build());

    public static void register(IEventBus modEventBus) {
        CREATIVE_TABS.register(modEventBus);
    }

    // ------------------------------------------------------
    // Sorting thing
    // ------------------------------------------------------


    // TODO: Add back Brewing and Misc Tabs

    static {
        //boolean loadedCaliber = ModList.get().isLoaded("caliber");
        BiFunction<String, Block, Supplier<ItemStack>> useCaliberBlock = (string, block) -> () -> {
            ResourceKey<Block> blockKey = ResourceKey.create(BuiltInRegistries.BLOCK.key(), new ResourceLocation("caliber:%s".formatted(string)));
            return new ItemStack(BuiltInRegistries.BLOCK.getHolder(blockKey)
                    .orElse((Holder.Reference<Block>) Holder.direct(block)).value());
        };

        ResourceKey<CreativeModeTab> beforeTab = CreativeModeTabs.BUILDING_BLOCKS;

        beforeTab = createTab(beforeTab, "cobble_brick", useCaliberBlock.apply("cobbled_dark_limestone", Blocks.COBBLESTONE), (pParameters, pOutput) -> {
            Stream<Pair<TagKey<Item>, HolderSet.Named<Item>>> tags = BuiltInRegistries.ITEM.getTags();
            TagKey<Item> creativeTabTag = ModTags.Items.cobbleBricksTab;

            List<Item> items = tags
                    .filter(tagPair -> tagPair.getFirst().equals(creativeTabTag))
                    .flatMap(tagPair -> tagPair.getSecond().stream())
                    .map(Holder::value)  // Extract the Item from the Holder
                    .toList();

            Map<String, List<Item>> groupedItems = items.stream()
                    .collect(Collectors.groupingBy(item -> {
                        ItemStack itemStack = new ItemStack(item);
                        String itemName = itemStack.getItem().getName(itemStack).toString();
                        if (itemName.contains("granite")) {
                            return "granite";
                        } else if ((itemName.contains("stone_bricks") && !itemName.contains("blackstone") && !itemName.contains("endstone")
                                && !itemName.contains("dripstone") && !itemName.contains("brimstone") && !itemName.contains("limestone"))
                                || itemName.contains("cobblestone") || itemName.contains("smooth_stone")) {
                            return "stone";
                        } else if (itemName.contains("andesite")) {
                            return "andesite";
                        } else if (itemName.contains("asurine")) {
                            return "asurine";
                        } else if (itemName.contains("basalt")) {
                            return "basalt";
                        } else if (itemName.contains("blackstone")) {
                            return "blackstone";
                        } else if (itemName.contains("brimstone")) {
                            return "brimstone";
                        } else if (itemName.contains("calcite")) {
                            return "calcite";
                        } else if (itemName.contains("chalk")) {
                            return "chalk";
                        } else if (itemName.contains("crimsite")) {
                            return "crimsite";
                        } else if (itemName.contains("deepslate")) {
                            return "deepslate";
                        } else if (itemName.contains("diorite")) {
                            return "diorite";
                        } else if (itemName.contains("dripstone")) {
                            return "dripstone";
                        } else if (itemName.contains("limestone")) {
                            return "limestone";
                        } else if (itemName.contains("sandstone")) {
                            return "sandstone";
                        } else if (itemName.contains("marble")) {
                            return "marble";
                        } else if (itemName.contains("mud")) {
                            return "mud";
                        } else if (itemName.contains("nether")) {
                            return "nether";
                        } else if (itemName.contains("ochrum")) {
                            return "ochrum";
                        } else if (itemName.contains("purpur")) {
                            return "purpur";
                        } else if (itemName.contains("prismarine")) {
                            return "prismarine";
                        } else if (itemName.contains("quartz") && !itemName.contains("rose")) {
                            return "quartz";
                        } else if (itemName.contains("rose_quartz")) {
                            return "rose_quartz";
                        } else if (itemName.contains("scorchia")) {
                            return "scorchia";
                        } else if (itemName.contains("scoria")) {
                            return "scoria";
                        } else if (itemName.contains("tuff")) {
                            return "tuff";
                        } else if (itemName.contains("viridium")) {
                            return "viridium";
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

        });

        beforeTab = createTab(beforeTab, "planks_beams", () -> new ItemStack(Blocks.OAK_PLANKS), (pParameters, pOutput) -> {
            Stream<Pair<TagKey<Item>, HolderSet.Named<Item>>> tags = BuiltInRegistries.ITEM.getTags();
            TagKey<Item> creativeTabTag = ModTags.Items.planksBeamsTab;

            List<Item> items = tags
                    .filter(tagPair -> tagPair.getFirst().equals(creativeTabTag))
                    .flatMap(tagPair -> tagPair.getSecond().stream())
                    .map(Holder::value)  // Extract the Item from the Holder
                    .toList();

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

        });

        beforeTab = createTab(beforeTab, "roofing", useCaliberBlock.apply("acacia_shingle_roof_45", Blocks.ACACIA_STAIRS), (pParameters, pOutput) -> {
            Stream<Pair<TagKey<Item>, HolderSet.Named<Item>>> tags = BuiltInRegistries.ITEM.getTags();
            TagKey<Item> creativeTabTag = ModTags.Items.roofingTab;

            List<Item> items = tags
                    .filter(tagPair -> tagPair.getFirst().equals(creativeTabTag))
                    .flatMap(tagPair -> tagPair.getSecond().stream())
                    .map(Holder::value)  // Extract the Item from the Holder
                    .toList();

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

        });

        beforeTab = createTab(beforeTab, "concrete_plaster_stucco", useCaliberBlock.apply("beige_plaster", Blocks.WHITE_CONCRETE_POWDER), (pParameters, pOutput) -> {
            Stream<Pair<TagKey<Item>, HolderSet.Named<Item>>> tags = BuiltInRegistries.ITEM.getTags();
            TagKey<Item> creativeTabTag = ModTags.Items.concretePlasterStuccoTab;

            List<Item> items = tags
                    .filter(tagPair -> tagPair.getFirst().equals(creativeTabTag))
                    .flatMap(tagPair -> tagPair.getSecond().stream())
                    .map(Holder::value)  // Extract the Item from the Holder
                    .toList();

            items.stream()
                    // Sort based on itemName within groups
                    .sorted(Comparator.comparing(item -> {
                        ItemStack itemStack = new ItemStack(item);
                        return itemStack.getItem().getName(itemStack).getString();
                    }))
                    // Add sorted items to the tab
                    .forEach(item -> pOutput.accept(new ItemStack(item)));
        });

        beforeTab = createTab(beforeTab, "half_timbered_walls", useCaliberBlock.apply("tudor_acacia_beige_plaster_left", Blocks.WHITE_TERRACOTTA), (pParameters, pOutput) -> {
            Stream<Pair<TagKey<Item>, HolderSet.Named<Item>>> tags = BuiltInRegistries.ITEM.getTags();
            TagKey<Item> creativeTabTag = ModTags.Items.halfTimberedWallTab;

            List<Item> items = tags
                    .filter(tagPair -> tagPair.getFirst().equals(creativeTabTag))
                    .flatMap(tagPair -> tagPair.getSecond().stream())
                    .map(Holder::value)  // Extract the Item from the Holder
                    .toList();

            items.stream()
                    // Sort based on itemName within groups
                    .sorted(Comparator.comparing(item -> {
                        ItemStack itemStack = new ItemStack(item);
                        return itemStack.getItem().getName(itemStack).getString();
                    }))
                    // Add sorted items to the tab
                    .forEach(item -> pOutput.accept(new ItemStack(item)));
        });

        beforeTab = createTab(beforeTab, "tiles_flooring", () -> new ItemStack(Blocks.BROWN_GLAZED_TERRACOTTA), (pParameters, pOutput) -> {
            Stream<Pair<TagKey<Item>, HolderSet.Named<Item>>> tags = BuiltInRegistries.ITEM.getTags();
            TagKey<Item> creativeTabTag = ModTags.Items.tilesFlooringTab;

            List<Item> items = tags
                    .filter(tagPair -> tagPair.getFirst().equals(creativeTabTag))
                    .flatMap(tagPair -> tagPair.getSecond().stream())
                    .map(Holder::value)  // Extract the Item from the Holder
                    .toList();

            items.stream()
                    // Sort based on itemName within groups
                    .sorted(Comparator.comparing(item -> {
                        ItemStack itemStack = new ItemStack(item);
                        return itemStack.getItem().getName(itemStack).getString();
                    }))
                    // Add sorted items to the tab
                    .forEach(item -> pOutput.accept(new ItemStack(item)));
        });

        beforeTab = createTab(beforeTab, "glass_windows", () -> new ItemStack(Blocks.GLASS), (pParameters, pOutput) -> {
            Stream<Pair<TagKey<Item>, HolderSet.Named<Item>>> tags = BuiltInRegistries.ITEM.getTags();
            TagKey<Item> creativeTabTag = ModTags.Items.glassWindowsTab;

            List<Item> items = tags
                    .filter(tagPair -> tagPair.getFirst().equals(creativeTabTag))
                    .flatMap(tagPair -> tagPair.getSecond().stream())
                    .map(Holder::value)  // Extract the Item from the Holder
                    .toList();

            Map<String, List<Item>> groupedItems = items.stream()
                    .collect(Collectors.groupingBy(item -> {
                        ItemStack itemStack = new ItemStack(item);
                        String itemName = itemStack.getItem().getName(itemStack).toString();
                        if (itemName.contains("acacia")) {
                            return "acacia";
                        } else if (itemName.contains("bamboo")) {
                            return "bamboo";
                        } else if (itemName.contains("birch")) {
                            return "birch";
                        } else if (itemName.contains("cherry")) {
                            return "cherry";
                        } else if (itemName.contains("crimson")) {
                            return "crimson";
                        } else if (itemName.contains("dark_oak")) {
                            return "dark_oak";
                        } else if (itemName.contains("iron")) {
                            return "iron";
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
                        } else if (itemName.contains("stained")) {
                            return "xstained";
                        } else if (itemName.contains("tinted")) {
                            return "xtinted";
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

        });

        beforeTab = createTab(beforeTab, "doors_gates", () -> new ItemStack(Blocks.ACACIA_DOOR), (pParameters, pOutput) -> {
            Stream<Pair<TagKey<Item>, HolderSet.Named<Item>>> tags = BuiltInRegistries.ITEM.getTags();
            TagKey<Item> creativeTabTag = ModTags.Items.doorsGatesTab;

            List<Item> items = tags
                    .filter(tagPair -> tagPair.getFirst().equals(creativeTabTag))
                    .flatMap(tagPair -> tagPair.getSecond().stream())
                    .map(Holder::value)  // Extract the Item from the Holder
                    .toList();

            items.stream()
                    // Sort based on itemName within groups
                    .sorted(Comparator.comparing(item -> {
                        ItemStack itemStack = new ItemStack(item);
                        return itemStack.getItem().getName(itemStack).getString();
                    }))
                    // Add sorted items to the tab
                    .forEach(item -> pOutput.accept(new ItemStack(item)));
        });

        beforeTab = createTab(beforeTab, "lighting", () -> new ItemStack(Blocks.LANTERN), (pParameters, pOutput) -> {
            Stream<Pair<TagKey<Item>, HolderSet.Named<Item>>> tags = BuiltInRegistries.ITEM.getTags();
            TagKey<Item> creativeTabTag = ModTags.Items.lightingTab;

            List<Item> items = tags
                    .filter(tagPair -> tagPair.getFirst().equals(creativeTabTag))
                    .flatMap(tagPair -> tagPair.getSecond().stream())
                    .map(Holder::value)  // Extract the Item from the Holder
                    .toList();

            items.stream()
                    // Sort based on itemName within groups
                    .sorted(Comparator.comparing(item -> {
                        ItemStack itemStack = new ItemStack(item);
                        return itemStack.getItem().getName(itemStack).getString();
                    }))
                    // Add sorted items to the tab
                    .forEach(item -> pOutput.accept(new ItemStack(item)));
        });

        beforeTab = createTab(beforeTab, "crafting", () -> new ItemStack(Items.CRAFTING_TABLE), (pParameters, pOutput) -> {
            Stream<Pair<TagKey<Item>, HolderSet.Named<Item>>> tags = BuiltInRegistries.ITEM.getTags();
            TagKey<Item> creativeTabTag = ModTags.Items.craftingTab;

            List<Item> items = tags
                    .filter(tagPair -> tagPair.getFirst().equals(creativeTabTag))
                    .flatMap(tagPair -> tagPair.getSecond().stream())
                    .map(Holder::value)  // Extract the Item from the Holder
                    .toList();

            items.stream()
                    // Sort based on itemName within groups
                    .sorted(Comparator.comparing(item -> {
                        ItemStack itemStack = new ItemStack(item);
                        return itemStack.getItem().getName(itemStack).getString();
                    }))
                    // Add sorted items to the tab
                    .forEach(item -> pOutput.accept(new ItemStack(item)));
        });

        beforeTab = createTab(beforeTab, "stone", () -> new ItemStack(Blocks.STONE), (pParameters, pOutput) -> {
            Stream<Pair<TagKey<Item>, HolderSet.Named<Item>>> tags = BuiltInRegistries.ITEM.getTags();
            TagKey<Item> creativeTabTag = ModTags.Items.stoneTab;

            List<Item> items = tags
                    .filter(tagPair -> tagPair.getFirst().equals(creativeTabTag))
                    .flatMap(tagPair -> tagPair.getSecond().stream())
                    .map(Holder::value)  // Extract the Item from the Holder
                    .toList();

            Map<String, List<Item>> groupedItems = items.stream()
                    .collect(Collectors.groupingBy(item -> {
                        ItemStack itemStack = new ItemStack(item);
                        String itemName = itemStack.getItem().getName(itemStack).toString();
                        if (itemName.contains("granite")) {
                            return "granite";
                        } else if (itemName.contains("limestone")
                                || itemName.equals("Stone")) {
                            return "limestone";
                        } else if (itemName.contains("end")) {
                            return "end";
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

        });

        beforeTab = createTab(beforeTab, "sand_gravel", () -> new ItemStack(Blocks.SAND), (pParameters, pOutput) -> {
            Stream<Pair<TagKey<Item>, HolderSet.Named<Item>>> tags = BuiltInRegistries.ITEM.getTags();
            TagKey<Item> creativeTabTag = ModTags.Items.sandGravelTab;

            List<Item> items = tags
                    .filter(tagPair -> tagPair.getFirst().equals(creativeTabTag))
                    .flatMap(tagPair -> tagPair.getSecond().stream())
                    .map(Holder::value)  // Extract the Item from the Holder
                    .toList();

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

        });

        beforeTab = createTab(beforeTab, "grass_dirt", () -> new ItemStack(Blocks.GRASS_BLOCK), (pParameters, pOutput) -> {
            Stream<Pair<TagKey<Item>, HolderSet.Named<Item>>> tags = BuiltInRegistries.ITEM.getTags();
            TagKey<Item> creativeTabTag = ModTags.Items.grassDirtTab;

            List<Item> items = tags
                    .filter(tagPair -> tagPair.getFirst().equals(creativeTabTag))
                    .flatMap(tagPair -> tagPair.getSecond().stream())
                    .map(Holder::value)  // Extract the Item from the Holder
                    .toList();

            items.stream()
                    // Sort based on itemName within groups
                    .sorted(Comparator.comparing(item -> {
                        ItemStack itemStack = new ItemStack(item);
                        return itemStack.getItem().getName(itemStack).getString();
                    }))
                    // Add sorted items to the tab
                    .forEach(item -> pOutput.accept(new ItemStack(item)));
        });

        beforeTab = createTab(beforeTab, "metals_ores", () -> new ItemStack(Blocks.GOLD_ORE), (pParameters, pOutput) -> {
            Stream<Pair<TagKey<Item>, HolderSet.Named<Item>>> tags = BuiltInRegistries.ITEM.getTags();
            TagKey<Item> creativeTabTag = ModTags.Items.metalsOresTab;

            List<Item> items = tags
                    .filter(tagPair -> tagPair.getFirst().equals(creativeTabTag))
                    .flatMap(tagPair -> tagPair.getSecond().stream())
                    .map(Holder::value)  // Extract the Item from the Holder
                    .toList();

            Map<String, List<Item>> groupedItems = items.stream()
                    .collect(Collectors.groupingBy(item -> {
                        ItemStack itemStack = new ItemStack(item);
                        String itemName = itemStack.getItem().getName(itemStack).toString();
                        if (itemName.contains("amethyst")) {
                            return "amethyst";
                        } else if (itemName.contains("coal")) {
                            return "coal";
                        } else if (itemName.contains("copper")) {
                            return "copper";
                        } else if (itemName.contains("diamond")) {
                            return "diamond";
                        } else if (itemName.contains("emerald")) {
                            return "emerald";
                        } else if (itemName.contains("gold")) {
                            return "gold";
                        } else if (itemName.contains("iron")) {
                            return "iron";
                        } else if (itemName.contains("lapis")) {
                            return "lapis";
                        } else if (itemName.contains("quartz")) {
                            return "quartz";
                        } else if (itemName.contains("redstone")) {
                            return "redstone";
                        } else if (itemName.contains("sapphire")) {
                            return "sapphire";
                        } else if (itemName.contains("silver")) {
                            return "silver";
                        } else if (itemName.contains("zinc")) {
                            return "zinc";
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

        });


        beforeTab = createTab(beforeTab, "logs", () -> new ItemStack(Blocks.OAK_LOG), (pParameters, pOutput) -> {
            Stream<Pair<TagKey<Item>, HolderSet.Named<Item>>> tags = BuiltInRegistries.ITEM.getTags();
            TagKey<Item> creativeTabTag = ModTags.Items.logsTab;

            List<Item> items = tags
                    .filter(tagPair -> tagPair.getFirst().equals(creativeTabTag))
                    .flatMap(tagPair -> tagPair.getSecond().stream())
                    .map(Holder::value)  // Extract the Item from the Holder
                    .toList();

            items.stream()
                    // Sort based on itemName within groups
                    .sorted(Comparator.comparing(item -> {
                        ItemStack itemStack = new ItemStack(item);
                        return itemStack.getItem().getName(itemStack).getString();
                    }))
                    // Add sorted items to the tab
                    .forEach(item -> pOutput.accept(new ItemStack(item)));
        });

        beforeTab = createTab(beforeTab, "leaves", () -> new ItemStack(Blocks.ACACIA_LEAVES), (pParameters, pOutput) -> {
            Stream<Pair<TagKey<Item>, HolderSet.Named<Item>>> tags = BuiltInRegistries.ITEM.getTags();
            TagKey<Item> creativeTabTag = ModTags.Items.leavesTab;

            List<Item> items = tags
                    .filter(tagPair -> tagPair.getFirst().equals(creativeTabTag))
                    .flatMap(tagPair -> tagPair.getSecond().stream())
                    .map(Holder::value)  // Extract the Item from the Holder
                    .toList();

            items.stream()
                    // Sort based on itemName within groups
                    .sorted(Comparator.comparing(item -> {
                        ItemStack itemStack = new ItemStack(item);
                        return itemStack.getItem().getName(itemStack).getString();
                    }))
                    // Add sorted items to the tab
                    .forEach(item -> pOutput.accept(new ItemStack(item)));
        });

        beforeTab = createTab(beforeTab, "flowers_plants", () -> new ItemStack(Blocks.POPPY), (pParameters, pOutput) -> {
            Stream<Pair<TagKey<Item>, HolderSet.Named<Item>>> tags = BuiltInRegistries.ITEM.getTags();
            TagKey<Item> creativeTabTag = ModTags.Items.flowersPlantsTab;

            List<Item> items = tags
                    .filter(tagPair -> tagPair.getFirst().equals(creativeTabTag))
                    .flatMap(tagPair -> tagPair.getSecond().stream())
                    .map(Holder::value)  // Extract the Item from the Holder
                    .toList();

            Map<String, List<Item>> groupedItems = items.stream()
                    .collect(Collectors.groupingBy(item -> {
                        ItemStack itemStack = new ItemStack(item);
                        String itemName = itemStack.getItem().getName(itemStack).toString();
                        if (itemName.contains("sapling") || itemName.contains("propagule")) {
                            return "sapling";
                        } else if (itemName.contains("flower") || itemName.contains("rose") || itemName.contains("allium") || itemName.contains("dandelion")
                                || itemName.contains("aster") || itemName.contains("tulip") || itemName.contains("lily") || itemName.contains("orchid") || itemName.contains("pansy")
                                || itemName.contains("poppy") || itemName.contains("bluebell") || itemName.contains("daisy") || itemName.contains("daffodil") || itemName.contains("iris")
                                || itemName.contains("lupine") || itemName.contains("marigold") || itemName.contains("peony") || itemName.contains("sunflower") || itemName.contains("snowbelle")
                                || itemName.contains("violet") || itemName.contains("zinnia") || itemName.contains("buttercup") || itemName.contains("cosmos") || itemName.contains("dahlia")
                                || itemName.contains("foxglove") || itemName.contains("hydrangea") || itemName.contains("lavender") || itemName.contains("lilac") || itemName.contains("magnolia")
                                || itemName.contains("mimosa") || itemName.contains("narcissus") || itemName.contains("poinsettia") || itemName.contains("rhododendron") || itemName.contains("snapdragon")
                                || itemName.contains("thistle") || itemName.contains("wisteria") || itemName.contains("bleeding_heart") || itemName.contains("blossom") || itemName.contains("bloom")
                                || itemName.contains("fireweed") || itemName.contains("hibiscus") || itemName.contains("carnation") || itemName.contains("hyssop") || itemName.contains("mallow")
                                || itemName.contains("moonflower") || itemName.contains("tsubaki") || itemName.contains("waratah") || itemName.contains("trillium") || itemName.contains("tansy")) {
                            return "flower";
                        } else if (itemName.contains("mushroom") || itemName.contains("wart") ||itemName.contains("fungus")
                                || itemName.contains("shroom") || itemName.contains("spore") || itemName.contains("toadstool")) {
                            return "mushroom";
                        } else if (itemName.contains("fern")) {
                            return "fern";
                        } else if (itemName.contains("bush") || itemName.contains("shrub") || itemName.contains("grass")) {
                            return "bush";
                        } else if (itemName.contains("cactus")) {
                            return "cactus";
                        } else if (itemName.contains("pot")) {
                            return "pot";
                        } else if (itemName.contains("vine")) {
                            return "vine";
                        } else if (itemName.contains("coral") || itemName.contains("sea")) {
                            return "xcoral";
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

        });

        beforeTab = createTab(beforeTab, "crops", () -> new ItemStack(Blocks.WHEAT), (pParameters, pOutput) -> {
            Stream<Pair<TagKey<Item>, HolderSet.Named<Item>>> tags = BuiltInRegistries.ITEM.getTags();
            TagKey<Item> creativeTabTag = ModTags.Items.cropsTab;

            List<Item> items = tags
                    .filter(tagPair -> tagPair.getFirst().equals(creativeTabTag))
                    .flatMap(tagPair -> tagPair.getSecond().stream())
                    .map(Holder::value)  // Extract the Item from the Holder
                    .toList();

            items.stream()
                    // Sort based on itemName within groups
                    .sorted(Comparator.comparing(item -> {
                        ItemStack itemStack = new ItemStack(item);
                        return itemStack.getItem().getName(itemStack).getString();
                    }))
                    // Add sorted items to the tab
                    .forEach(item -> pOutput.accept(new ItemStack(item)));
        });

        beforeTab = createTab(beforeTab, "decor", () -> new ItemStack(Blocks.BLUE_BANNER), (pParameters, pOutput) -> {
            Stream<Pair<TagKey<Item>, HolderSet.Named<Item>>> tags = BuiltInRegistries.ITEM.getTags();
            TagKey<Item> creativeTabTag = ModTags.Items.decorTab;

            List<Item> items = tags
                    .filter(tagPair -> tagPair.getFirst().equals(creativeTabTag))
                    .flatMap(tagPair -> tagPair.getSecond().stream())
                    .map(Holder::value)  // Extract the Item from the Holder
                    .toList();

            Map<String, List<Item>> groupedItems = items.stream()
                    .collect(Collectors.groupingBy(item -> {
                        ItemStack itemStack = new ItemStack(item);
                        String itemName = itemStack.getItem().getName(itemStack).toString();
                        if (itemName.contains("bookshelf")) {
                            return "bookshelf";
                        } else if (itemName.contains("banner")) {
                            if (itemName.contains("pattern")) {
                                return "banner_pattern";
                            } else {
                                return "abanner";
                            }
                        } else if (itemName.contains("head")) {
                            return "bohead";
                        } else if (itemName.contains("skull")) {
                            return "bphead";
                        } else if (itemName.contains("stand")) {
                            return "bpstand";
                        } else if (itemName.contains("shelf")) {
                            return "bpshelf";
                        } else if (itemName.contains("pot")) {
                            return "bppot";
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

        });

        beforeTab = createTab(beforeTab, "furniture", () -> new ItemStack(Blocks.BROWN_BED), (pParameters, pOutput) -> {
            Stream<Pair<TagKey<Item>, HolderSet.Named<Item>>> tags = BuiltInRegistries.ITEM.getTags();
            TagKey<Item> creativeTabTag = ModTags.Items.furnitureTab;

            List<Item> items = tags
                    .filter(tagPair -> tagPair.getFirst().equals(creativeTabTag))
                    .flatMap(tagPair -> tagPair.getSecond().stream())
                    .map(Holder::value)  // Extract the Item from the Holder
                    .toList();

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

        });

        beforeTab = createTab(beforeTab, "storage", () -> new ItemStack(Blocks.CHEST), (pParameters, pOutput) -> {
            Stream<Pair<TagKey<Item>, HolderSet.Named<Item>>> tags = BuiltInRegistries.ITEM.getTags();
            TagKey<Item> creativeTabTag = ModTags.Items.storageTab;

            List<Item> items = tags
                    .filter(tagPair -> tagPair.getFirst().equals(creativeTabTag))
                    .flatMap(tagPair -> tagPair.getSecond().stream())
                    .map(Holder::value)  // Extract the Item from the Holder
                    .toList();

            Map<String, List<Item>> groupedItems = items.stream()
                    .collect(Collectors.groupingBy(item -> {
                        ItemStack itemStack = new ItemStack(item);
                        String itemName = itemStack.getItem().getName(itemStack).toString();
                        if (itemName.contains("barrel")) {
                            return "barrel";
                        } else if (itemName.contains("chest")) {
                            return "chest";
                        } else if (itemName.contains("shulker")) {
                            return "shulker";
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

        });

        beforeTab = createTab(beforeTab, "redstone", () -> new ItemStack(Items.REDSTONE), (pParameters, pOutput) -> {
            Stream<Pair<TagKey<Item>, HolderSet.Named<Item>>> tags = BuiltInRegistries.ITEM.getTags();
            TagKey<Item> creativeTabTag = ModTags.Items.redstoneTab;

            List<Item> items = tags
                    .filter(tagPair -> tagPair.getFirst().equals(creativeTabTag))
                    .flatMap(tagPair -> tagPair.getSecond().stream())
                    .map(Holder::value)  // Extract the Item from the Holder
                    .toList();

            Map<String, List<Item>> groupedItems = items.stream()
                    .collect(Collectors.groupingBy(item -> {
                        ItemStack itemStack = new ItemStack(item);
                        String itemName = itemStack.getItem().getName(itemStack).toString();
                        if (itemName.contains("command_block")) {
                            return "command_block";
                        } else if (itemName.contains("piston")) {
                            return "piston";
                        } else if (itemName.contains("rail")) {
                            return "rail";
                        } else if (itemName.contains("redstone")) {
                            return "redstone";
                        } else if (itemName.contains("lever")) {
                            return "lever";
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

        });

        beforeTab = createTab(beforeTab, "food", () -> new ItemStack(Items.APPLE), (pParameters, pOutput) -> {
            Stream<Pair<TagKey<Item>, HolderSet.Named<Item>>> tags = BuiltInRegistries.ITEM.getTags();
            TagKey<Item> creativeTabTag = ModTags.Items.foodTab;

            List<Item> items = tags
                    .filter(tagPair -> tagPair.getFirst().equals(creativeTabTag))
                    .flatMap(tagPair -> tagPair.getSecond().stream())
                    .map(Holder::value)  // Extract the Item from the Holder
                    .toList();

            items.stream()
                    // Sort based on itemName within groups
                    .sorted(Comparator.comparing(item -> {
                        ItemStack itemStack = new ItemStack(item);
                        return itemStack.getItem().getName(itemStack).getString();
                    }))
                    // Add sorted items to the tab
                    .forEach(item -> pOutput.accept(new ItemStack(item)));
        });

        beforeTab = createTab(beforeTab, "tools_weapons", () -> new ItemStack(Items.IRON_SWORD), (pParameters, pOutput) -> {
            Stream<Pair<TagKey<Item>, HolderSet.Named<Item>>> tags = BuiltInRegistries.ITEM.getTags();
            TagKey<Item> creativeTabTag = ModTags.Items.toolsWeaponsTab;

            List<Item> items = tags
                    .filter(tagPair -> tagPair.getFirst().equals(creativeTabTag))
                    .flatMap(tagPair -> tagPair.getSecond().stream())
                    .map(Holder::value)  // Extract the Item from the Holder
                    .toList();

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
                                || itemName.contains("firework")
                                || itemName.contains("elytra")
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

        });

        beforeTab = createTab(beforeTab, "armor", () -> new ItemStack(Items.IRON_CHESTPLATE), (pParameters, pOutput) -> {
            Stream<Pair<TagKey<Item>, HolderSet.Named<Item>>> tags = BuiltInRegistries.ITEM.getTags();
            TagKey<Item> creativeTabTag = ModTags.Items.armorTab;

            List<Item> items = tags
                    .filter(tagPair -> tagPair.getFirst().equals(creativeTabTag))
                    .flatMap(tagPair -> tagPair.getSecond().stream())
                    .map(Holder::value)  // Extract the Item from the Holder
                    .toList();

            items.stream()
                    // Sort based on itemName within groups
                    .sorted(Comparator.comparing(item -> {
                        ItemStack itemStack = new ItemStack(item);
                        return itemStack.getItem().getName(itemStack).getString();
                    }))
                    // Add sorted items to the tab
                    .forEach(item -> pOutput.accept(new ItemStack(item)));
        });

        beforeTab = createTab(beforeTab, "spawn_eggs", () -> new ItemStack(Items.SPIDER_SPAWN_EGG), (pParameters, pOutput) -> {
            Stream<Pair<TagKey<Item>, HolderSet.Named<Item>>> tags = BuiltInRegistries.ITEM.getTags();
            TagKey<Item> creativeTabTag = ModTags.Items.spawnEggTab;

            List<Item> items = tags
                    .filter(tagPair -> tagPair.getFirst().equals(creativeTabTag))
                    .flatMap(tagPair -> tagPair.getSecond().stream())
                    .map(Holder::value)  // Extract the Item from the Holder
                    .toList();

            items.stream()
                    // Sort based on itemName within groups
                    .sorted(Comparator.comparing(item -> {
                        ItemStack itemStack = new ItemStack(item);
                        return itemStack.getItem().getName(itemStack).getString();
                    }))
                    // Add sorted items to the tab
                    .forEach(item -> pOutput.accept(new ItemStack(item)));
        });
    }

//    public static List<Item> getItems() {
//        return BuiltInRegistries.ITEM.stream()
//                .map(Map.Entry::getValue)
//                .toList();
//    }

//    public static List<Item> getSortedItems() {
//        return ForgeRegistries.ITEMS.getEntries().stream().map(Map.Entry::getValue).sorted((o, o1) -> {
//            ResourceLocation str1 = ForgeRegistries.ITEMS.getKey(o);
//            ResourceLocation str2 = ForgeRegistries.ITEMS.getKey(o1);
//            assert str1 != null && str2 != null;
//            return str1.compareTo(str2);
//        }).toList();
//    }

    public static List<CreativeModeTab> setupCreativeTabs(List<CreativeModeTab> tabsOld) {
        boolean displayCustomTabs, removeMCTabs;

        try {
            displayCustomTabs = CommonConfigs.USE_CUSTOM_CREATIVE_TABS.get();
            removeMCTabs = CommonConfigs.REMOVE_VANILLA_TABS.get();
        } catch (Throwable e) {
            displayCustomTabs = true;
            removeMCTabs = false;
        }

        boolean finalDisplayCustomTabs = displayCustomTabs;
        List<CreativeModeTab> tabs = tabsOld.stream().filter(tab -> {
            boolean baseTabs = CreativeModeTabRegistry.getDefaultTabs().contains(tab);
            ResourceLocation name = BuiltInRegistries.CREATIVE_MODE_TAB.getKey(tab);
            if (name != null && finalDisplayCustomTabs) {
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

//        for (CreativeModeTab tab : Lists.newArrayList(tabs)) {
//            if (tab.getDisplayItems().isEmpty()) {
//                tabs.remove(tab); // remove tabs that are empty
//            }
//        }

        for (CreativeModeTab tab : Lists.newArrayList(tabs)) {
            ResourceLocation name = BuiltInRegistries.CREATIVE_MODE_TAB.getKey(tab);
            if (name != null && name.getNamespace().equals("buildify") && tab.getDisplayItems().isEmpty()) {
                tabs.remove(tab); // remove buildify tabs that are empty
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
