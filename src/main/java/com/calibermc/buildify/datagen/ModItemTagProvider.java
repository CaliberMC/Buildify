package com.calibermc.buildify.datagen;

import biomesoplenty.block.*;
import biomesoplenty.block.OrangeMapleLeavesBlock;
import biomesoplenty.block.RedMapleLeavesBlock;
import com.calibermc.buildify.datagen.properties.*;
import com.calibermc.buildify.item.custom.Hammer;
import com.calibermc.buildify.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.*;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.regions_unexplored.world.level.block.leaves.*;
import net.regions_unexplored.world.level.block.wood.*;
import org.jetbrains.annotations.Nullable;

import java.util.*;
import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {

    protected String modid;

    public ModItemTagProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider,
                              CompletableFuture<TagLookup<Block>> completableFuture, String modid, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, completableFuture, modid, existingFileHelper);
        this.modid = modid;
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        // Block Item Tags
        ForgeRegistries.BLOCKS.getValues().stream()
                .filter(block -> {
                    ResourceLocation registryName = ForgeRegistries.BLOCKS.getKey(block);
                    return registryName != null && registryName.getNamespace().equals(this.modid);
                })
                .sorted(Comparator.comparing(block -> (ForgeRegistries.BLOCKS.getKey(block)).getPath()))
                .forEach(block -> {
                    String itemName = (ForgeRegistries.BLOCKS.getKey(block)).getPath();
                    String fullItemName = ForgeRegistries.BLOCKS.getKey(block).toString();

                    if (!itemName.contains("arch") && !itemName.contains("arrowslit")
                            && !itemName.contains("balustrade") && !itemName.contains("beam")
                            && !itemName.contains("button") && !itemName.contains("capital")
                            && !itemName.contains("column") && !itemName.contains("corner")
                            && !itemName.contains("door") && !itemName.contains("eighth")
                            && !itemName.contains("fence") && !itemName.contains("fence_gate")
                            && !itemName.contains("frame") && !itemName.contains("layer")
                            && !itemName.contains("lintel") && !itemName.contains("pillar")
                            && !itemName.contains("pressure_plate") && !itemName.contains("quarter")
                            && !itemName.contains("roof") && !itemName.contains("sign")
                            && !itemName.contains("slab") && !itemName.contains("stairs")
                            && !itemName.contains("trapdoor") && !itemName.contains("wall")
                            && !itemName.contains("window")) {

                        if (block instanceof FlowerBlock || block instanceof FlowerBlockBOP || block instanceof CoralBlock
                                || block instanceof CoralFanBlock || block instanceof SeaPickleBlock || block instanceof SaplingBlock
                                || block instanceof MushroomBlock || block instanceof NetherWartBlock || block instanceof CactusBlock
                                || block instanceof SugarCaneBlock || block instanceof KelpBlock || block instanceof ChorusPlantBlock
                                || block instanceof ChorusFlowerBlock || block instanceof DeadBushBlock || block instanceof TallGrassBlock
                                || block instanceof VineBlock || block instanceof SweetBerryBushBlock || block instanceof NetherSproutsBlock
                                || block instanceof TwistingVinesBlock || itemName.contains("flower") || itemName.contains("mushroom")
                                || itemName.contains("sapling") || itemName.contains("coral") || itemName.contains("kelp")
                                || itemName.contains("cactus") || itemName.contains("sugar_cane") || itemName.contains("wart")
                                || itemName.contains("vine") || itemName.contains("bush") || itemName.contains("sprouts")
                                || itemName.contains("sandy_grass") || itemName.contains("tall_grass") || itemName.contains("shrub")) {
                            this.tag(ModTags.Items.flowersPlantsTab).addOptional(ResourceLocation.fromNamespaceAndPath(this.modid, itemName));
                        }

                        if (block instanceof BedBlock) {
                            this.tag(ModTags.Items.furnitureTab).addOptional(ResourceLocation.fromNamespaceAndPath(this.modid, itemName));
                        }

                        if (block instanceof LeavesBlock || block instanceof BrambleLeavesBlock || block instanceof JacarandaLeavesBlock
                                || block instanceof net.regions_unexplored.world.level.block.leaves.RedMapleLeavesBlock || block instanceof net.regions_unexplored.world.level.block.leaves.OrangeMapleLeavesBlock || block instanceof SnowblossomLeavesBlock
                                || block instanceof YellowMapleLeavesBlock || block instanceof AppleLeavesBlock || block instanceof BlueMagnoliaLeavesBlock
                                || block instanceof CherryLeavesBlock || block instanceof BrimwoodLeavesBlock || block instanceof EnchantedBirchLeavesBlock
                                || block instanceof JoshuaLeavesBlock || block instanceof MauveLeavesBlock || block instanceof PalmLeavesBlock
                                || block instanceof OrangeMapleLeavesBlock || block instanceof PinkMagnoliaLeavesBlock || block instanceof RedMapleLeavesBlock
                                || block instanceof SilverBirchLeavesBlock || block instanceof WhiteMagnoliaLeavesBlock) {
                            this.tag(ModTags.Items.leavesTab).addOptional(ResourceLocation.fromNamespaceAndPath(this.modid, itemName));
                        }

                        if ((block instanceof AspenLogBlock || block instanceof BambooLogBlock || block instanceof MagmaLogBlock
                                || block instanceof PineLogBlock || block instanceof SmallOakLogBlock || block instanceof StrippedBambooLogBlock
                                || itemName.contains("log") || itemName.contains("stripped_log") || itemName.contains("stem")) && !itemName.contains("lever")) {
                            this.tag(ModTags.Items.logsTab).addOptional(ResourceLocation.fromNamespaceAndPath(this.modid, itemName));
                        }

                        if (Arrays.stream(OreTypes.values()).anyMatch(p -> itemName.equals(p.getName()))) {
                            this.tag(ModTags.Items.metalsOresTab).addOptional(ResourceLocation.fromNamespaceAndPath(this.modid, itemName));
                        }

                        if ((itemName.contains("plank") || itemName.contains("beam") || itemName.contains("boards"))
                                || (itemName.contains("stripped") && !itemName.contains("log") && (itemName.contains("wood") || itemName.contains("hyphae")))) {
                            this.tag(ModTags.Items.planksBeamsTab).addOptional(ResourceLocation.fromNamespaceAndPath(this.modid, itemName));
                        }

                        if (Arrays.stream(RedstoneTypes.values()).anyMatch(p -> itemName.equals(p.getName()))) {
                            this.tag(ModTags.Items.redstoneTab).addOptional(ResourceLocation.fromNamespaceAndPath(this.modid, itemName));
                        }

                        if (block instanceof GravelBlock || block instanceof SandBlock || itemName.contains("gravel")
                                || itemName.contains("clay") || itemName.contains("suspicious")) {
                            this.tag(ModTags.Items.sandGravelTab).addOptional(ResourceLocation.fromNamespaceAndPath(this.modid, itemName));
                        }

                        if (block instanceof ChestBlock || block instanceof EnderChestBlock || block instanceof BarrelBlock || block instanceof ShulkerBoxBlock) {
                            this.tag(ModTags.Items.storageTab).addOptional(ResourceLocation.fromNamespaceAndPath(this.modid, itemName));
                        }

                    }
                    if (Arrays.stream(CobbleBricksTypes.values()).anyMatch(p -> fullItemName.equals(p.getName()))) {
                        this.tag(ModTags.Items.cobbleBricksTab).addOptional(ResourceLocation.fromNamespaceAndPath(this.modid, itemName));
                    }

                    if (Arrays.stream(ConcretePlasterTypes.values()).anyMatch(p -> fullItemName.equals(p.getName()))) {
                        this.tag(ModTags.Items.concretePlasterStuccoTab).addOptional(ResourceLocation.fromNamespaceAndPath(this.modid, itemName));
                    }

                    if (Arrays.stream(CraftingTableTypes.values()).anyMatch(p -> fullItemName.equals(p.getName()))) {
                        this.tag(ModTags.Items.craftingTab).addOptional(ResourceLocation.fromNamespaceAndPath(this.modid, itemName));
                    }

                    if (Arrays.stream(DecorTypes.values()).anyMatch(p -> fullItemName.equals(p.getName()))) {
                        this.tag(ModTags.Items.decorTab).addOptional(ResourceLocation.fromNamespaceAndPath(this.modid, itemName));
                    }

                    if ((Arrays.stream(GlassWindowTypes.values()).anyMatch(p -> fullItemName.equals(p.getName()))
                            || block instanceof GlassBlock || block instanceof StainedGlassBlock || block instanceof StainedGlassPaneBlock
                            || itemName.contains("glass") || itemName.contains("pane"))) {
                        this.tag(ModTags.Items.glassWindowsTab).addOptional(ResourceLocation.fromNamespaceAndPath(this.modid, itemName));
                    }

                    if (Arrays.stream(GrassDirtTypes.values()).anyMatch(p -> fullItemName.equals(p.getName()))) {
                        this.tag(ModTags.Items.grassDirtTab).addOptional(ResourceLocation.fromNamespaceAndPath(this.modid, itemName));
                    }

                    if (Arrays.stream(LightingTypes.values()).anyMatch(p -> fullItemName.equals(p.getName()))) {
                        this.tag(ModTags.Items.lightingTab).addOptional(ResourceLocation.fromNamespaceAndPath(this.modid, itemName));
                    }

                    if (itemName.contains("roof")) {
                        this.tag(ModTags.Items.roofingTab).addOptional(ResourceLocation.fromNamespaceAndPath(this.modid, itemName));
                    }

                    if (Arrays.stream(StoneTypes.values()).anyMatch(p -> fullItemName.equals(p.getName()))) {
                        this.tag(ModTags.Items.stoneTab).addOptional(ResourceLocation.fromNamespaceAndPath(this.modid, itemName));
                    }

                    if (Arrays.stream(TilesFlooringTypes.values()).anyMatch(p -> fullItemName.equals(p.getName()))) {
                        this.tag(ModTags.Items.tilesFlooringTab).addOptional(ResourceLocation.fromNamespaceAndPath(this.modid, itemName));
                    }
                });

        // Item Tags
        ForgeRegistries.ITEMS.getValues().stream()
                .filter(item -> {
                    ResourceLocation registryName = ForgeRegistries.ITEMS.getKey(item);
                    return registryName != null && registryName.getNamespace().equals(this.modid);
                })
                .sorted(Comparator.comparing(item -> (ForgeRegistries.ITEMS.getKey(item)).getPath()))
                .forEach(item -> {
                    String itemName = (ForgeRegistries.ITEMS.getKey(item)).getPath();

                    if (item instanceof ArmorItem || item instanceof HorseArmorItem) {
                        this.tag(ModTags.Items.armorTab).addOptional(ResourceLocation.fromNamespaceAndPath(this.modid, itemName));
                    }

                    if (item instanceof ArrowItem || item instanceof BowItem || item instanceof BucketItem
                            || item instanceof CompassItem || item instanceof CrossbowItem || item instanceof ElytraItem
                            || item instanceof FireworkRocketItem || item instanceof FlintAndSteelItem || item instanceof FishingRodItem
                            || item instanceof Hammer || item instanceof HoeItem || item instanceof LeadItem
                            || item instanceof NameTagItem || item instanceof PickaxeItem || item instanceof ShieldItem
                            || item instanceof ShearsItem || item instanceof ShovelItem || item instanceof SpectralArrowItem
                            || item instanceof SpyglassItem || item instanceof SwordItem || item instanceof TridentItem
                            || itemName.equals("nails") || itemName.equals("clock") || itemName.equals("wrench")
                            || itemName.equals("potato_cannon") || itemName.equals("extendo_grip") || itemName.equals("wand_of_symmetry") || itemName.contains("staff")) {
                        this.tag(ModTags.Items.toolsWeaponsTab).addOptional(ResourceLocation.fromNamespaceAndPath(this.modid, itemName));
                    }

                    if (itemName.contains("seeds")) {
                        this.tag(ModTags.Items.cropsTab).addOptional(ResourceLocation.fromNamespaceAndPath(this.modid, itemName));
                    }

                    if ((itemName.contains("banner") || itemName.contains("item_frame") || itemName.contains("painting")
                            || itemName.contains("decorated_pot") || itemName.contains("skull") || itemName.contains("head")
                            || itemName.contains("armor_stand") || itemName.contains("book")) && !itemName.contains("knowledge")) {
                        this.tag(ModTags.Items.decorTab).addOptional(ResourceLocation.fromNamespaceAndPath(this.modid, itemName));
                    }

                    if ((!itemName.contains("fence") && !itemName.contains("frame"))
                            && (itemName.contains("gate") || itemName.contains("door"))) {
                        this.tag(ModTags.Items.doorsGatesTab).addOptional(ResourceLocation.fromNamespaceAndPath(this.modid, itemName));
                    }

                    if (item.isEdible()) {
                        this.tag(ModTags.Items.foodTab).addOptional(ResourceLocation.fromNamespaceAndPath(this.modid, itemName));
                    }

                    if (itemName.equals("redstone")) {
                        this.tag(ModTags.Items.redstoneTab).addOptional(ResourceLocation.fromNamespaceAndPath(this.modid, itemName));
                    }

                    if (item instanceof SpawnEggItem)
                        this.tag(ModTags.Items.spawnEggTab).addOptional(ResourceLocation.fromNamespaceAndPath(this.modid, itemName));

                });

    }
}

