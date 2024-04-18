package com.calibermc.buildify.datagen;

import biomesoplenty.common.block.*;
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

                    if (       !itemName.contains("arch")           && !itemName.contains("arrowslit")
                            && !itemName.contains("balustrade")     && !itemName.contains("beam")
                            && !itemName.contains("button")         && !itemName.contains("capital")
                            && !itemName.contains("column")         && !itemName.contains("corner")
                            && !itemName.contains("door")           && !itemName.contains("eighth")
                            && !itemName.contains("fence")          && !itemName.contains("fence_gate")
                            && !itemName.contains("frame")          && !itemName.contains("layer")
                            && !itemName.contains("lintel")         && !itemName.contains("pillar")
                            && !itemName.contains("pressure_plate") && !itemName.contains("quarter")
                            && !itemName.contains("roof")           && !itemName.contains("sign")
                            && !itemName.contains("slab")           && !itemName.contains("stairs")
                            && !itemName.contains("trapdoor")       && !itemName.contains("wall")
                            && !itemName.contains("window")) {
//                    if (block instanceof Block) {

                        if (       (!itemName.contains("cutter") && !itemName.contains("bookshelf") && !itemName.contains("copper"))
                                && (itemName.contains("cobble")  || itemName.contains("brick")   || itemName.contains("tiles")
                                || itemName.contains("chiseled") || itemName.contains("cracked") || itemName.contains("polished")
                                || itemName.contains("smooth")   || itemName.contains("cut"))) {
                            this.tag(ModTags.Items.cobbleBricksTab).addOptional(new ResourceLocation(this.modid, itemName));
                        }

                        if (itemName.contains("concrete") || itemName.contains("plaster") || itemName.contains("stucco")) {
                            this.tag(ModTags.Items.concretePlasterStuccoTab).addOptional(new ResourceLocation(this.modid, itemName));
                        }

                        if (Arrays.stream(CraftingTableTypes.values()).anyMatch(p -> itemName.equals(p.getName()))) {
                            this.tag(ModTags.Items.craftingTab).addOptional(new ResourceLocation(this.modid, itemName));
                        }

                        if (block instanceof CropBlock) {
                            this.tag(ModTags.Items.cropsTab).addOptional(new ResourceLocation(this.modid, itemName));
                        }

                        if (block instanceof ChiseledBookShelfBlock) {
                            this.tag(ModTags.Items.decorTab).addOptional(new ResourceLocation(this.modid, itemName));
                        }

                        if (       block instanceof FlowerBlock        || block instanceof FlowerBlockBOP      || block instanceof CoralBlock
                                || block instanceof CoralFanBlock      || block instanceof SeaPickleBlock      || block instanceof SaplingBlock
                                || block instanceof MushroomBlock      || block instanceof NetherWartBlock     || block instanceof CactusBlock
                                || block instanceof SugarCaneBlock     || block instanceof KelpBlock           || block instanceof ChorusPlantBlock
                                || block instanceof ChorusFlowerBlock  || block instanceof DeadBushBlock       || block instanceof TallGrassBlock
                                || block instanceof VineBlock          || block instanceof SweetBerryBushBlock || block instanceof NetherSproutsBlock
                                || block instanceof TwistingVinesBlock || itemName.contains("flower")          || itemName.contains("mushroom")
                                || itemName.contains("sapling")        || itemName.contains("coral")           || itemName.contains("kelp")
                                || itemName.contains("cactus")         || itemName.contains("sugar_cane")      || itemName.contains("wart")
                                || itemName.contains("vine")           || itemName.contains("bush")            || itemName.contains("sprouts")
                                || itemName.contains("sandy_grass")    || itemName.contains("tall_grass")      || itemName.contains("shrub")) {
                            this.tag(ModTags.Items.flowersPlantsTab).addOptional(new ResourceLocation(this.modid, itemName));
                        }

                        if (block instanceof BedBlock) {
                            this.tag(ModTags.Items.furnitureTab).addOptional(new ResourceLocation(this.modid, itemName));
                        }

                        if (       block instanceof GlassBlock || block instanceof StainedGlassBlock || block instanceof StainedGlassPaneBlock
                                || itemName.contains("glass")  || itemName.contains("pane")          || itemName.contains("window")){
                            this.tag(ModTags.Items.glassWindowsTab).addOptional(new ResourceLocation(this.modid, itemName));
                        }

                        if (block instanceof GrassBlock || block instanceof DirtPathBlock || itemName.equals("dirt") || itemName.equals("grass")) {
                            this.tag(ModTags.Items.grassDirtTab).addOptional(new ResourceLocation(this.modid, itemName));
                        }

                        if (       block instanceof LeavesBlock             || block instanceof BrambleLeavesBlock           || block instanceof JacarandaLeavesBlock
                                || block instanceof MapleLeavesBlock        || block instanceof OrangeAutumnLeavesBlock      || block instanceof SnowblossomLeavesBlock
                                || block instanceof YellowAutumnLeavesBlock || block instanceof AppleLeavesBlock             || block instanceof BlueMagnoliaLeavesBlock
                                || block instanceof CherryLeavesBlock       || block instanceof BrimwoodLeavesBlock          || block instanceof EnchantedBirchLeavesBlock
                                || block instanceof JoshuaLeavesBlock       || block instanceof MauveLeavesBlock             || block instanceof PalmLeavesBlock
                                || block instanceof OrangeMapleLeavesBlock  || block instanceof PinkMagnoliaLeavesBlock      || block instanceof RedMapleLeavesBlock
                                || block instanceof SilverBirchLeavesBlock  || block instanceof WhiteMagnoliaLeavesBlock) {
                            this.tag(ModTags.Items.leavesTab).addOptional(new ResourceLocation(this.modid, itemName));
                        }

                        if (Arrays.stream(LightingTypes.values()).anyMatch(p -> itemName.equals(p.getName()))) {
                            this.tag(ModTags.Items.lightingTab).addOptional(new ResourceLocation(this.modid, itemName));
                        }

                        if (block instanceof AspenLogBlock       || block instanceof BambooLogBlock   || block instanceof MagmaLogBlock
                                || block instanceof PineLogBlock || block instanceof SmallOakLogBlock || block instanceof StrippedBambooLogBlock
                                || itemName.contains("log")      || itemName.contains("stripped_log")) {
                            this.tag(ModTags.Items.logsTab).addOptional(new ResourceLocation(this.modid, itemName));
                        }

                        if (Arrays.stream(OreTypes.values()).anyMatch(p -> itemName.equals(p.getName()))) {
                            this.tag(ModTags.Items.metalsOresTab).addOptional(new ResourceLocation(this.modid, itemName));
                        }

                        if (       (itemName.contains("plank") || itemName.contains("beam"))
                                || (itemName.contains("stripped") && !itemName.contains("log") && (itemName.contains("wood")  || itemName.contains("hyphae")))) {
                            this.tag(ModTags.Items.planksBeamsTab).addOptional(new ResourceLocation(this.modid, itemName));
                        }

                        if (Arrays.stream(RedstoneTypes.values()).anyMatch(p -> itemName.equals(p.getName()))) {
                            this.tag(ModTags.Items.redstoneTab).addOptional(new ResourceLocation(this.modid, itemName));
                        }

                        if (       block instanceof GravelBlock || block instanceof SandBlock || itemName.contains("gravel")
                                || itemName.contains("clay") || itemName.contains("suspicious")) {
                            this.tag(ModTags.Items.sandGravelTab).addOptional(new ResourceLocation(this.modid, itemName));
                        }

                        if (    Arrays.stream(StoneTypes.values()).anyMatch(p -> itemName.equals(p.getName()))
                                && !itemName.contains("brick")  && !itemName.contains("chiseled")
                                && !itemName.contains("cobble")   && !itemName.contains("polished") && !itemName.contains("smooth")
                                && !itemName.contains("cut")      && !itemName.contains("ore")      && !itemName.contains("bulb")
                                && !itemName.contains("lamp")     && !itemName.contains("torch")    && !itemName.contains("redstone")
                                && !itemName.contains("bud")      && !itemName.contains("grindstone")) {
                            this.tag(ModTags.Items.stoneTab).addOptional(new ResourceLocation(this.modid, itemName));
                        }

                        if (block instanceof ChestBlock || block instanceof EnderChestBlock || block instanceof BarrelBlock || block instanceof ShulkerBoxBlock){
                            this.tag(ModTags.Items.storageTab).addOptional(new ResourceLocation(this.modid, itemName));
                        }

                        if (block instanceof CarpetBlock || itemName.contains("glazed_terracotta") || itemName.contains("flooring")){
                            this.tag(ModTags.Items.tilesFlooringTab).addOptional(new ResourceLocation(this.modid, itemName));
                        }

                    }

                    if (itemName.contains("roof")) {
                        this.tag(ModTags.Items.roofingTab).addOptional(new ResourceLocation(this.modid, itemName));
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
                        this.tag(ModTags.Items.armorTab).addOptional(new ResourceLocation(this.modid, itemName));
                    }

                    if (       item instanceof ArrowItem          || item instanceof BowItem             || item instanceof BucketItem
                            || item instanceof CompassItem        || item instanceof CrossbowItem        || item instanceof ElytraItem
                            || item instanceof FireworkRocketItem || item instanceof FlintAndSteelItem   || item instanceof FishingRodItem
                            || item instanceof Hammer             || item instanceof HoeItem             || item instanceof LeadItem
                            || item instanceof NameTagItem        || item instanceof PickaxeItem         || item instanceof ShieldItem
                            || item instanceof ShearsItem         || item instanceof ShovelItem          || item instanceof SpectralArrowItem
                            || item instanceof SpyglassItem       || item instanceof SwordItem           || item instanceof TridentItem
                            || itemName.equals("nails")          || itemName.equals("clock")){
                        this.tag(ModTags.Items.toolsWeaponsTab).addOptional(new ResourceLocation(this.modid, itemName));
                    }

                    if (itemName.contains("seeds")) {
                        this.tag(ModTags.Items.cropsTab).addOptional(new ResourceLocation(this.modid, itemName));
                    }

                    if (      (itemName.contains("banner") || itemName.contains("item_frame")  || itemName.contains("painting")
                            || itemName.contains("decorated_pot") ||itemName.contains("skull") || itemName.contains("head")
                            || itemName.contains("armor_stand")   || itemName.contains("book")) && !itemName.contains("knowledge")) {
                        this.tag(ModTags.Items.decorTab).addOptional(new ResourceLocation(this.modid, itemName));
                    }

                    if (       (!itemName.contains("fence") && !itemName.contains("frame"))
                            && (itemName.contains("gate") || itemName.contains("door"))) {
                        this.tag(ModTags.Items.doorsGatesTab).addOptional(new ResourceLocation(this.modid, itemName));
                    }

                    if (item.isEdible()) {
                        this.tag(ModTags.Items.foodTab).addOptional(new ResourceLocation(this.modid, itemName));
                    }

                    if (itemName.equals("redstone")) {
                        this.tag(ModTags.Items.redstoneTab).addOptional(new ResourceLocation(this.modid, itemName));
                    }

                    if (item instanceof SpawnEggItem)
                        this.tag(ModTags.Items.spawnEggTab).addOptional(new ResourceLocation(this.modid, itemName));

                });

    }
}

