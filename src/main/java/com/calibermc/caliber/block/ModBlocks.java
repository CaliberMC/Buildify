package com.calibermc.caliber.block;

import com.calibermc.caliber.Caliber;
import com.calibermc.caliber.block.custom.*;
import com.calibermc.caliber.block.custom.DirectionalBlock;
import com.calibermc.caliber.block.properties.BlockProps;
import com.calibermc.caliber.item.CreativeTabs;
import com.calibermc.caliber.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    private static int blockCount = 0;
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Caliber.MOD_ID);
    
    // METAL BLOCKS
    public static final RegistryObject<Block> TIN_BLOCK = registerBlock("tin_block",
            () -> new Block(BlockProps.TIN_BLOCK.get()));
    public static final RegistryObject<Block> TIN_ORE = registerBlock("tin_ore",
            () -> new OreBlock(BlockProps.TIN_ORE.get()));
    public static final RegistryObject<Block> RAW_TIN_BLOCK = registerBlock("raw_tin_block",
            () -> new Block(BlockProps.RAW_TIN.get()));
    public static final RegistryObject<Block> DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",
            () -> new OreBlock(BlockProps.DEEPSLATE_TIN_ORE.get()));

    public static final RegistryObject<Block> SILVER_BLOCK = registerBlock("silver_block",
            () -> new Block(BlockProps.SILVER_BLOCK.get()));
    public static final RegistryObject<Block> SILVER_ORE = registerBlock("silver_ore",
            () -> new OreBlock(BlockProps.SILVER_ORE.get()));
    public static final RegistryObject<Block> RAW_SILVER_BLOCK = registerBlock("raw_silver_block",
            () -> new Block(BlockProps.RAW_SILVER.get()));
    public static final RegistryObject<Block> DEEPSLATE_SILVER_ORE = registerBlock("deepslate_silver_ore",
            () -> new OreBlock(BlockProps.DEEPSLATE_SILVER_ORE.get()));
    
    //TODO: ADD BRONZE STUFF
    //TODO: ADD STEEL STUFF

    // STONE BLOCKS
    /* DEEPSLATE */
    public static final RegistryObject<Block> DEEPSLATE_ARCH = registerBlock("deepslate_arch",
            () -> new ArchBlock(BlockProps.DEEPSLATE.get()));
    public static final RegistryObject<Block> DEEPSLATE_ARCH_HALF = registerBlock("deepslate_arch_half",
            () -> new HalfArchBlock(BlockProps.DEEPSLATE.get()));
    public static final RegistryObject<Block> DEEPSLATE_ARCH_LARGE = registerBlock("deepslate_arch_large",
            () -> new LargeArchBlock(BlockProps.DEEPSLATE.get()));
    public static final RegistryObject<Block> DEEPSLATE_ARCH_LARGE_HALF = registerBlock("deepslate_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.DEEPSLATE.get()));
    public static final RegistryObject<Block> DEEPSLATE_ARROWSLIT = registerBlock("deepslate_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.DEEPSLATE.get()));
    public static final RegistryObject<Block> DEEPSLATE_BALUSTRADE = registerBlock("deepslate_balustrade",
            () -> new BalustradeBlock(BlockProps.DEEPSLATE.get()));
    public static final RegistryObject<Block> DEEPSLATE_CAPITAL = registerBlock("deepslate_capital",
            () -> new CapitalBlock(BlockProps.DEEPSLATE.get()));
    public static final RegistryObject<Block> DEEPSLATE_CORNER = registerBlock("deepslate_corner",
            () -> new CornerLayerBlock(BlockProps.DEEPSLATE.get()));
    public static final RegistryObject<Block> DEEPSLATE_CORNER_SLAB = registerBlock("deepslate_corner_slab",
            () -> new CornerSlabBlock(BlockProps.DEEPSLATE.get()));
    public static final RegistryObject<Block> DEEPSLATE_CORNER_SLAB_VERTICAL = registerBlock("deepslate_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.DEEPSLATE.get()));
    public static final RegistryObject<Block> DEEPSLATE_EIGHTH = registerBlock("deepslate_eighth",
            () -> new EighthBlock(BlockProps.DEEPSLATE.get()));
    public static final RegistryObject<Block> DEEPSLATE_PILLAR = registerBlock("deepslate_pillar",
            () -> new PillarLayerBlock(BlockProps.DEEPSLATE.get()));
    public static final RegistryObject<Block> DEEPSLATE_QUARTER = registerBlock("deepslate_quarter",
            () -> new QuarterLayerBlock(BlockProps.DEEPSLATE.get()));
    public static final RegistryObject<Block> DEEPSLATE_QUARTER_VERTICAL = registerBlock("deepslate_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.DEEPSLATE.get()));
    public static final RegistryObject<Block> DEEPSLATE_SLAB = registerBlock("deepslate_slab",
            () -> new SlabLayerBlock(BlockProps.DEEPSLATE.get()));
    public static final RegistryObject<Block> DEEPSLATE_SLAB_VERTICAL = registerBlock("deepslate_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.DEEPSLATE.get()));
    public static final RegistryObject<Block> DEEPSLATE_STAIRS = registerBlock("deepslate_stairs",
            () -> new StairBlock(Blocks.DEEPSLATE::defaultBlockState, BlockProps.DEEPSLATE.get()));
    public static final RegistryObject<Block> DEEPSLATE_WALL = registerBlock("deepslate_wall",
            () -> new WallBlock(BlockProps.DEEPSLATE.get()));
    public static final RegistryObject<Block> DEEPSLATE_WINDOW = registerBlock("deepslate_window",
            () -> new WindowBlock(BlockProps.DEEPSLATE.get()));
    public static final RegistryObject<Block> DEEPSLATE_WINDOW_HALF = registerBlock("deepslate_window_half",
            () -> new HalfWindowBlock(BlockProps.DEEPSLATE.get()));

    /* DEEPSLATE BRICK*/
    public static final RegistryObject<Block> DEEPSLATE_BRICK_ARCH = registerBlock("deepslate_brick_arch",
            () -> new ArchBlock(BlockProps.DEEPSLATE_BRICK.get()));
    public static final RegistryObject<Block> DEEPSLATE_BRICK_ARCH_HALF = registerBlock("deepslate_brick_arch_half",
            () -> new HalfArchBlock(BlockProps.DEEPSLATE_BRICK.get()));
    public static final RegistryObject<Block> DEEPSLATE_BRICK_ARCH_LARGE = registerBlock("deepslate_brick_arch_large",
            () -> new LargeArchBlock(BlockProps.DEEPSLATE_BRICK.get()));
    public static final RegistryObject<Block> DEEPSLATE_BRICK_ARCH_LARGE_HALF = registerBlock("deepslate_brick_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.DEEPSLATE_BRICK.get()));
    public static final RegistryObject<Block> DEEPSLATE_BRICK_ARROWSLIT = registerBlock("deepslate_brick_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.DEEPSLATE_BRICK.get()));
    public static final RegistryObject<Block> DEEPSLATE_BRICK_BALUSTRADE = registerBlock("deepslate_brick_balustrade",
            () -> new BalustradeBlock(BlockProps.DEEPSLATE_BRICK.get()));
    public static final RegistryObject<Block> DEEPSLATE_BRICK_CAPITAL = registerBlock("deepslate_brick_capital",
            () -> new CapitalBlock(BlockProps.DEEPSLATE_BRICK.get()));
    public static final RegistryObject<Block> DEEPSLATE_BRICK_CORNER = registerBlock("deepslate_brick_corner",
            () -> new CornerLayerBlock(BlockProps.DEEPSLATE_BRICK.get()));
    public static final RegistryObject<Block> DEEPSLATE_BRICK_CORNER_SLAB = registerBlock("deepslate_brick_corner_slab",
            () -> new CornerSlabBlock(BlockProps.DEEPSLATE_BRICK.get()));
    public static final RegistryObject<Block> DEEPSLATE_BRICK_CORNER_SLAB_VERTICAL = registerBlock("deepslate_brick_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.DEEPSLATE_BRICK.get()));
    public static final RegistryObject<Block> DEEPSLATE_BRICK_EIGHTH = registerBlock("deepslate_brick_eighth",
            () -> new EighthBlock(BlockProps.DEEPSLATE_BRICK.get()));
    public static final RegistryObject<Block> DEEPSLATE_BRICK_PILLAR = registerBlock("deepslate_brick_pillar",
            () -> new PillarLayerBlock(BlockProps.DEEPSLATE_BRICK.get()));
    public static final RegistryObject<Block> DEEPSLATE_BRICK_QUARTER = registerBlock("deepslate_brick_quarter",
            () -> new QuarterLayerBlock(BlockProps.DEEPSLATE_BRICK.get()));
    public static final RegistryObject<Block> DEEPSLATE_BRICK_QUARTER_VERTICAL = registerBlock("deepslate_brick_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.DEEPSLATE_BRICK.get()));
    public static final RegistryObject<Block> DEEPSLATE_BRICK_SLAB = registerBlock("deepslate_brick_slab",
            () -> new SlabLayerBlock(BlockProps.DEEPSLATE_BRICK.get()));
    public static final RegistryObject<Block> DEEPSLATE_BRICK_SLAB_VERTICAL = registerBlock("deepslate_brick_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.DEEPSLATE_BRICK.get()));
    public static final RegistryObject<Block> DEEPSLATE_BRICK_WINDOW = registerBlock("deepslate_brick_window",
            () -> new WindowBlock(BlockProps.DEEPSLATE_BRICK.get()));
    public static final RegistryObject<Block> DEEPSLATE_BRICK_WINDOW_HALF = registerBlock("deepslate_brick_window_half",
            () -> new HalfWindowBlock(BlockProps.DEEPSLATE_BRICK.get()));

    /* DEEPSLATE TILES*/
    public static final RegistryObject<Block> DEEPSLATE_TILE_ARCH = registerBlock("deepslate_tile_arch",
            () -> new ArchBlock(BlockProps.DEEPSLATE_TILES.get()));
    public static final RegistryObject<Block> DEEPSLATE_TILE_ARCH_HALF = registerBlock("deepslate_tile_arch_half",
            () -> new HalfArchBlock(BlockProps.DEEPSLATE_TILES.get()));
    public static final RegistryObject<Block> DEEPSLATE_TILE_ARCH_LARGE = registerBlock("deepslate_tile_arch_large",
            () -> new LargeArchBlock(BlockProps.DEEPSLATE_TILES.get()));
    public static final RegistryObject<Block> DEEPSLATE_TILE_ARCH_LARGE_HALF = registerBlock("deepslate_tile_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.DEEPSLATE_TILES.get()));
    public static final RegistryObject<Block> DEEPSLATE_TILE_ARROWSLIT = registerBlock("deepslate_tile_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.DEEPSLATE_TILES.get()));
    public static final RegistryObject<Block> DEEPSLATE_TILE_BALUSTRADE = registerBlock("deepslate_tile_balustrade",
            () -> new BalustradeBlock(BlockProps.DEEPSLATE_TILES.get()));
    public static final RegistryObject<Block> DEEPSLATE_TILE_CAPITAL = registerBlock("deepslate_tile_capital",
            () -> new CapitalBlock(BlockProps.DEEPSLATE_TILES.get()));
    public static final RegistryObject<Block> DEEPSLATE_TILE_CORNER = registerBlock("deepslate_tile_corner",
            () -> new CornerLayerBlock(BlockProps.DEEPSLATE_TILES.get()));
    public static final RegistryObject<Block> DEEPSLATE_TILE_CORNER_SLAB = registerBlock("deepslate_tile_corner_slab",
            () -> new CornerSlabBlock(BlockProps.DEEPSLATE_TILES.get()));
    public static final RegistryObject<Block> DEEPSLATE_TILE_CORNER_SLAB_VERTICAL = registerBlock("deepslate_tile_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.DEEPSLATE_TILES.get()));
    public static final RegistryObject<Block> DEEPSLATE_TILE_EIGHTH = registerBlock("deepslate_tile_eighth",
            () -> new EighthBlock(BlockProps.DEEPSLATE_TILES.get()));
    public static final RegistryObject<Block> DEEPSLATE_TILE_PILLAR = registerBlock("deepslate_tile_pillar",
            () -> new PillarLayerBlock(BlockProps.DEEPSLATE_TILES.get()));
    public static final RegistryObject<Block> DEEPSLATE_TILE_QUARTER = registerBlock("deepslate_tile_quarter",
            () -> new QuarterLayerBlock(BlockProps.DEEPSLATE_TILES.get()));
    public static final RegistryObject<Block> DEEPSLATE_TILE_QUARTER_VERTICAL = registerBlock("deepslate_tile_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.DEEPSLATE_TILES.get()));
    public static final RegistryObject<Block> DEEPSLATE_TILE_SLAB = registerBlock("deepslate_tile_slab",
            () -> new SlabLayerBlock(BlockProps.DEEPSLATE_TILES.get()));
    public static final RegistryObject<Block> DEEPSLATE_TILE_SLAB_VERTICAL = registerBlock("deepslate_tile_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.DEEPSLATE_TILES.get()));
    public static final RegistryObject<Block> DEEPSLATE_TILE_WINDOW = registerBlock("deepslate_tile_window",
            () -> new WindowBlock(BlockProps.DEEPSLATE_TILES.get()));
    public static final RegistryObject<Block> DEEPSLATE_TILE_WINDOW_HALF = registerBlock("deepslate_tile_window_half",
            () -> new HalfWindowBlock(BlockProps.DEEPSLATE_TILES.get()));

    /* COBBLED DEEPSLATE */
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_ARCH = registerBlock("cobbled_deepslate_arch",
            () -> new ArchBlock(BlockProps.COBBLED_DEEPSLATE.get()));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_ARCH_HALF = registerBlock("cobbled_deepslate_arch_half",
            () -> new HalfArchBlock(BlockProps.COBBLED_DEEPSLATE.get()));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_ARCH_LARGE = registerBlock("cobbled_deepslate_arch_large",
            () -> new LargeArchBlock(BlockProps.COBBLED_DEEPSLATE.get()));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_ARCH_LARGE_HALF = registerBlock("cobbled_deepslate_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.COBBLED_DEEPSLATE.get()));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_ARROWSLIT = registerBlock("cobbled_deepslate_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.COBBLED_DEEPSLATE.get()));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_BALUSTRADE = registerBlock("cobbled_deepslate_balustrade",
            () -> new BalustradeBlock(BlockProps.COBBLED_DEEPSLATE.get()));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_CAPITAL = registerBlock("cobbled_deepslate_capital",
            () -> new CapitalBlock(BlockProps.COBBLED_DEEPSLATE.get()));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_CORNER = registerBlock("cobbled_deepslate_corner",
            () -> new CornerLayerBlock(BlockProps.COBBLED_DEEPSLATE.get()));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_CORNER_SLAB = registerBlock("cobbled_deepslate_corner_slab",
            () -> new CornerSlabBlock(BlockProps.COBBLED_DEEPSLATE.get()));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_CORNER_SLAB_VERTICAL = registerBlock("cobbled_deepslate_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.COBBLED_DEEPSLATE.get()));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_EIGHTH = registerBlock("cobbled_deepslate_eighth",
            () -> new EighthBlock(BlockProps.COBBLED_DEEPSLATE.get()));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_PILLAR = registerBlock("cobbled_deepslate_pillar",
            () -> new PillarLayerBlock(BlockProps.COBBLED_DEEPSLATE.get()));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_QUARTER = registerBlock("cobbled_deepslate_quarter",
            () -> new QuarterLayerBlock(BlockProps.COBBLED_DEEPSLATE.get()));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_QUARTER_VERTICAL = registerBlock("cobbled_deepslate_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.COBBLED_DEEPSLATE.get()));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_SLAB = registerBlock("cobbled_deepslate_slab",
            () -> new SlabLayerBlock(BlockProps.COBBLED_DEEPSLATE.get()));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_SLAB_VERTICAL = registerBlock("cobbled_deepslate_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.COBBLED_DEEPSLATE.get()));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_WINDOW = registerBlock("cobbled_deepslate_window",
            () -> new WindowBlock(BlockProps.COBBLED_DEEPSLATE.get()));
    public static final RegistryObject<Block> COBBLED_DEEPSLATE_WINDOW_HALF = registerBlock("cobbled_deepslate_window_half",
            () -> new HalfWindowBlock(BlockProps.COBBLED_DEEPSLATE.get()));

    /* POLISHED DEEPSLATE */
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_ARCH = registerBlock("polished_deepslate_arch",
            () -> new ArchBlock(BlockProps.POLISHED_DEEPSLATE.get()));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_ARCH_HALF = registerBlock("polished_deepslate_arch_half",
            () -> new HalfArchBlock(BlockProps.POLISHED_DEEPSLATE.get()));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_ARCH_LARGE = registerBlock("polished_deepslate_arch_large",
            () -> new LargeArchBlock(BlockProps.POLISHED_DEEPSLATE.get()));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_ARCH_LARGE_HALF = registerBlock("polished_deepslate_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.POLISHED_DEEPSLATE.get()));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_ARROWSLIT = registerBlock("polished_deepslate_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.POLISHED_DEEPSLATE.get()));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_BALUSTRADE = registerBlock("polished_deepslate_balustrade",
            () -> new BalustradeBlock(BlockProps.POLISHED_DEEPSLATE.get()));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_CAPITAL = registerBlock("polished_deepslate_capital",
            () -> new CapitalBlock(BlockProps.POLISHED_DEEPSLATE.get()));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_CORNER = registerBlock("polished_deepslate_corner",
            () -> new CornerLayerBlock(BlockProps.POLISHED_DEEPSLATE.get()));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_CORNER_SLAB = registerBlock("polished_deepslate_corner_slab",
            () -> new CornerSlabBlock(BlockProps.POLISHED_DEEPSLATE.get()));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_CORNER_SLAB_VERTICAL = registerBlock("polished_deepslate_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.POLISHED_DEEPSLATE.get()));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_EIGHTH = registerBlock("polished_deepslate_eighth",
            () -> new EighthBlock(BlockProps.POLISHED_DEEPSLATE.get()));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_PILLAR = registerBlock("polished_deepslate_pillar",
            () -> new PillarLayerBlock(BlockProps.POLISHED_DEEPSLATE.get()));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_QUARTER = registerBlock("polished_deepslate_quarter",
            () -> new QuarterLayerBlock(BlockProps.POLISHED_DEEPSLATE.get()));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_QUARTER_VERTICAL = registerBlock("polished_deepslate_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.POLISHED_DEEPSLATE.get()));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_SLAB = registerBlock("polished_deepslate_slab",
            () -> new SlabLayerBlock(BlockProps.POLISHED_DEEPSLATE.get()));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_SLAB_VERTICAL = registerBlock("polished_deepslate_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.POLISHED_DEEPSLATE.get()));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_WINDOW = registerBlock("polished_deepslate_window",
            () -> new WindowBlock(BlockProps.POLISHED_DEEPSLATE.get()));
    public static final RegistryObject<Block> POLISHED_DEEPSLATE_WINDOW_HALF = registerBlock("polished_deepslate_window_half",
            () -> new HalfWindowBlock(BlockProps.POLISHED_DEEPSLATE.get()));
    
    // -- GRANITE
    public static final RegistryObject<Block> BLACK_GRANITE = registerBlock("black_granite",
            () -> new Block(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BROWN_GRANITE = registerBlock("brown_granite",
            () -> new Block(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> GRAY_GRANITE = registerBlock("gray_granite",
            () -> new Block(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> PINK_GRANITE = registerBlock("pink_granite",
            () -> new Block(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> WHITE_GRANITE = registerBlock("white_granite",
            () -> new Block(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BLACK_GRANITE_ARCH = registerBlock("black_granite_arch",
            () -> new ArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BROWN_GRANITE_ARCH = registerBlock("brown_granite_arch",
            () -> new ArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> GRAY_GRANITE_ARCH = registerBlock("gray_granite_arch",
            () -> new ArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> PINK_GRANITE_ARCH = registerBlock("pink_granite_arch",
            () -> new ArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> RED_GRANITE_ARCH = registerBlock("red_granite_arch",
            () -> new ArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> WHITE_GRANITE_ARCH = registerBlock("white_granite_arch",
            () -> new ArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BLACK_GRANITE_ARCH_HALF = registerBlock("black_granite_arch_half",
            () -> new HalfArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BROWN_GRANITE_ARCH_HALF = registerBlock("brown_granite_arch_half",
            () -> new HalfArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> GRAY_GRANITE_ARCH_HALF = registerBlock("gray_granite_arch_half",
            () -> new HalfArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> PINK_GRANITE_ARCH_HALF = registerBlock("pink_granite_arch_half",
            () -> new HalfArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> RED_GRANITE_ARCH_HALF = registerBlock("red_granite_arch_half",
            () -> new HalfArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> WHITE_GRANITE_ARCH_HALF = registerBlock("white_granite_arch_half",
            () -> new HalfArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BLACK_GRANITE_ARCH_LARGE = registerBlock("black_granite_arch_large",
            () -> new LargeArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BROWN_GRANITE_ARCH_LARGE = registerBlock("brown_granite_arch_large",
            () -> new LargeArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> GRAY_GRANITE_ARCH_LARGE = registerBlock("gray_granite_arch_large",
            () -> new LargeArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> PINK_GRANITE_ARCH_LARGE = registerBlock("pink_granite_arch_large",
            () -> new LargeArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> RED_GRANITE_ARCH_LARGE = registerBlock("red_granite_arch_large",
            () -> new LargeArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> WHITE_GRANITE_ARCH_LARGE = registerBlock("white_granite_arch_large",
            () -> new LargeArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BLACK_GRANITE_ARCH_LARGE_HALF = registerBlock("black_granite_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BROWN_GRANITE_ARCH_LARGE_HALF = registerBlock("brown_granite_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> GRAY_GRANITE_ARCH_LARGE_HALF = registerBlock("gray_granite_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> PINK_GRANITE_ARCH_LARGE_HALF = registerBlock("pink_granite_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> RED_GRANITE_ARCH_LARGE_HALF = registerBlock("red_granite_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> WHITE_GRANITE_ARCH_LARGE_HALF = registerBlock("white_granite_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BLACK_GRANITE_ARROWSLIT = registerBlock("black_granite_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BROWN_GRANITE_ARROWSLIT = registerBlock("brown_granite_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> GRAY_GRANITE_ARROWSLIT = registerBlock("gray_granite_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> PINK_GRANITE_ARROWSLIT = registerBlock("pink_granite_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> RED_GRANITE_ARROWSLIT = registerBlock("red_granite_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> WHITE_GRANITE_ARROWSLIT = registerBlock("white_granite_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BLACK_GRANITE_BALUSTRADE = registerBlock("black_granite_balustrade",
            () -> new BalustradeBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BROWN_GRANITE_BALUSTRADE = registerBlock("brown_granite_balustrade",
            () -> new BalustradeBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> GRAY_GRANITE_BALUSTRADE = registerBlock("gray_granite_balustrade",
            () -> new BalustradeBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> PINK_GRANITE_BALUSTRADE = registerBlock("pink_granite_balustrade",
            () -> new BalustradeBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> RED_GRANITE_BALUSTRADE = registerBlock("red_granite_balustrade",
            () -> new BalustradeBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> WHITE_GRANITE_BALUSTRADE = registerBlock("white_granite_balustrade",
            () -> new BalustradeBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BLACK_GRANITE_CAPITAL = registerBlock("black_granite_capital",
            () -> new CapitalBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BROWN_GRANITE_CAPITAL = registerBlock("brown_granite_capital",
            () -> new CapitalBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> GRAY_GRANITE_CAPITAL = registerBlock("gray_granite_capital",
            () -> new CapitalBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> PINK_GRANITE_CAPITAL = registerBlock("pink_granite_capital",
            () -> new CapitalBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> RED_GRANITE_CAPITAL = registerBlock("red_granite_capital",
            () -> new CapitalBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> WHITE_GRANITE_CAPITAL = registerBlock("white_granite_capital",
            () -> new CapitalBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BLACK_GRANITE_CORNER = registerBlock("black_granite_corner",
            () -> new CornerLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BROWN_GRANITE_CORNER = registerBlock("brown_granite_corner",
            () -> new CornerLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> GRAY_GRANITE_CORNER = registerBlock("gray_granite_corner",
            () -> new CornerLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> PINK_GRANITE_CORNER = registerBlock("pink_granite_corner",
            () -> new CornerLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> RED_GRANITE_CORNER = registerBlock("red_granite_corner",
            () -> new CornerLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> WHITE_GRANITE_CORNER = registerBlock("white_granite_corner",
            () -> new CornerLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BLACK_GRANITE_CORNER_SLAB = registerBlock("black_granite_corner_slab",
            () -> new CornerSlabBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BROWN_GRANITE_CORNER_SLAB = registerBlock("brown_granite_corner_slab",
            () -> new CornerSlabBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> GRAY_GRANITE_CORNER_SLAB = registerBlock("gray_granite_corner_slab",
            () -> new CornerSlabBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> PINK_GRANITE_CORNER_SLAB = registerBlock("pink_granite_corner_slab",
            () -> new CornerSlabBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> RED_GRANITE_CORNER_SLAB = registerBlock("red_granite_corner_slab",
            () -> new CornerSlabBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> WHITE_GRANITE_CORNER_SLAB = registerBlock("white_granite_corner_slab",
            () -> new CornerSlabBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BLACK_GRANITE_CORNER_SLAB_VERTICAL = registerBlock("black_granite_corner_slab_vertical",
        () -> new VerticalCornerSlabBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BROWN_GRANITE_CORNER_SLAB_VERTICAL = registerBlock("brown_granite_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> GRAY_GRANITE_CORNER_SLAB_VERTICAL = registerBlock("gray_granite_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> PINK_GRANITE_CORNER_SLAB_VERTICAL = registerBlock("pink_granite_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> RED_GRANITE_CORNER_SLAB_VERTICAL = registerBlock("red_granite_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> WHITE_GRANITE_CORNER_SLAB_VERTICAL = registerBlock("white_granite_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BLACK_GRANITE_EIGHTH = registerBlock("black_granite_eighth",
            () -> new EighthBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BROWN_GRANITE_EIGHTH = registerBlock("brown_granite_eighth",
            () -> new EighthBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> GRAY_GRANITE_EIGHTH = registerBlock("gray_granite_eighth",
            () -> new EighthBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> PINK_GRANITE_EIGHTH = registerBlock("pink_granite_eighth",
            () -> new EighthBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> RED_GRANITE_EIGHTH = registerBlock("red_granite_eighth",
            () -> new EighthBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> WHITE_GRANITE_EIGHTH = registerBlock("white_granite_eighth",
            () -> new EighthBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BLACK_GRANITE_PILLAR = registerBlock("black_granite_pillar",
            () -> new PillarLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BROWN_GRANITE_PILLAR = registerBlock("brown_granite_pillar",
            () -> new PillarLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> GRAY_GRANITE_PILLAR = registerBlock("gray_granite_pillar",
            () -> new PillarLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> PINK_GRANITE_PILLAR = registerBlock("pink_granite_pillar",
            () -> new PillarLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> RED_GRANITE_PILLAR = registerBlock("red_granite_pillar",
            () -> new PillarLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> WHITE_GRANITE_PILLAR = registerBlock("white_granite_pillar",
            () -> new PillarLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BLACK_GRANITE_QUARTER = registerBlock("black_granite_quarter",
            () -> new QuarterLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BROWN_GRANITE_QUARTER = registerBlock("brown_granite_quarter",
            () -> new QuarterLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> GRAY_GRANITE_QUARTER = registerBlock("gray_granite_quarter",
            () -> new QuarterLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> PINK_GRANITE_QUARTER = registerBlock("pink_granite_quarter",
            () -> new QuarterLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> RED_GRANITE_QUARTER = registerBlock("red_granite_quarter",
            () -> new QuarterLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> WHITE_GRANITE_QUARTER = registerBlock("white_granite_quarter",
            () -> new QuarterLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BLACK_GRANITE_QUARTER_VERTICAL = registerBlock("black_granite_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BROWN_GRANITE_QUARTER_VERTICAL = registerBlock("brown_granite_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> GRAY_GRANITE_QUARTER_VERTICAL = registerBlock("gray_granite_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> PINK_GRANITE_QUARTER_VERTICAL = registerBlock("pink_granite_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> RED_GRANITE_QUARTER_VERTICAL = registerBlock("red_granite_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> WHITE_GRANITE_QUARTER_VERTICAL = registerBlock("white_granite_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BLACK_GRANITE_SLAB = registerBlock("black_granite_slab",
            () -> new SlabLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BROWN_GRANITE_SLAB = registerBlock("brown_granite_slab",
            () -> new SlabLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> GRAY_GRANITE_SLAB = registerBlock("gray_granite_slab",
            () -> new SlabLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> PINK_GRANITE_SLAB = registerBlock("pink_granite_slab",
            () -> new SlabLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> RED_GRANITE_SLAB = registerBlock("red_granite_slab",
            () -> new SlabLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> WHITE_GRANITE_SLAB = registerBlock("white_granite_slab",
            () -> new SlabLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BLACK_GRANITE_SLAB_VERTICAL = registerBlock("black_granite_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BROWN_GRANITE_SLAB_VERTICAL = registerBlock("brown_granite_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> GRAY_GRANITE_SLAB_VERTICAL = registerBlock("gray_granite_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> PINK_GRANITE_SLAB_VERTICAL = registerBlock("pink_granite_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> RED_GRANITE_SLAB_VERTICAL = registerBlock("red_granite_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> WHITE_GRANITE_SLAB_VERTICAL = registerBlock("white_granite_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BLACK_GRANITE_STAIRS = registerBlock("black_granite_stairs",
            () -> new StairBlock(() -> ModBlocks.BLACK_GRANITE.get().defaultBlockState(), BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BROWN_GRANITE_STAIRS = registerBlock("brown_granite_stairs",
            () -> new StairBlock(() -> ModBlocks.BROWN_GRANITE.get().defaultBlockState(), BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> GRAY_GRANITE_STAIRS = registerBlock("gray_granite_stairs",
            () -> new StairBlock(() -> ModBlocks.GRAY_GRANITE.get().defaultBlockState(), BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> PINK_GRANITE_STAIRS = registerBlock("pink_granite_stairs",
            () -> new StairBlock(() -> ModBlocks.PINK_GRANITE.get().defaultBlockState(), BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> WHITE_GRANITE_STAIRS = registerBlock("white_granite_stairs",
            () -> new StairBlock(() -> ModBlocks.WHITE_GRANITE.get().defaultBlockState(), BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BLACK_GRANITE_WALL = registerBlock("black_granite_wall",
            () -> new WallBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BROWN_GRANITE_WALL = registerBlock("brown_granite_wall",
            () -> new WallBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> GRAY_GRANITE_WALL = registerBlock("gray_granite_wall",
            () -> new WallBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> PINK_GRANITE_WALL = registerBlock("pink_granite_wall",
            () -> new WallBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> WHITE_GRANITE_WALL = registerBlock("white_granite_wall",
            () -> new WallBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BLACK_GRANITE_WINDOW = registerBlock("black_granite_window",
            () -> new WindowBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BROWN_GRANITE_WINDOW = registerBlock("brown_granite_window",
            () -> new WindowBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> GRAY_GRANITE_WINDOW = registerBlock("gray_granite_window",
            () -> new WindowBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> PINK_GRANITE_WINDOW = registerBlock("pink_granite_window",
            () -> new WindowBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> RED_GRANITE_WINDOW = registerBlock("red_granite_window",
            () -> new WindowBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> WHITE_GRANITE_WINDOW = registerBlock("white_granite_window",
            () -> new WindowBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BLACK_GRANITE_WINDOW_HALF = registerBlock("black_granite_window_half",
            () -> new HalfWindowBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> BROWN_GRANITE_WINDOW_HALF = registerBlock("brown_granite_window_half",
            () -> new HalfWindowBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> GRAY_GRANITE_WINDOW_HALF = registerBlock("gray_granite_window_half",
            () -> new HalfWindowBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> PINK_GRANITE_WINDOW_HALF = registerBlock("pink_granite_window_half",
            () -> new HalfWindowBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> RED_GRANITE_WINDOW_HALF = registerBlock("red_granite_window_half",
            () -> new HalfWindowBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> WHITE_GRANITE_WINDOW_HALF = registerBlock("white_granite_window_half",
            () -> new HalfWindowBlock(BlockProps.GRANITE.get()));

    // -- GRANITE -- POLISHED
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE = registerBlock("polished_black_granite",
            () -> new Block(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE = registerBlock("polished_brown_granite",
            () -> new Block(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE = registerBlock("polished_gray_granite",
            () -> new Block(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE = registerBlock("polished_pink_granite",
            () -> new Block(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE = registerBlock("polished_white_granite",
            () -> new Block(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_ARCH = registerBlock("polished_black_granite_arch",
            () -> new ArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_ARCH = registerBlock("polished_brown_granite_arch",
            () -> new ArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_ARCH = registerBlock("polished_gray_granite_arch",
            () -> new ArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_ARCH = registerBlock("polished_pink_granite_arch",
            () -> new ArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_RED_GRANITE_ARCH = registerBlock("polished_red_granite_arch",
            () -> new ArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_ARCH = registerBlock("polished_white_granite_arch",
            () -> new ArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_ARCH_HALF = registerBlock("polished_black_granite_arch_half",
            () -> new HalfArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_ARCH_HALF = registerBlock("polished_brown_granite_arch_half",
            () -> new HalfArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_ARCH_HALF = registerBlock("polished_gray_granite_arch_half",
            () -> new HalfArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_ARCH_HALF = registerBlock("polished_pink_granite_arch_half",
            () -> new HalfArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_RED_GRANITE_ARCH_HALF = registerBlock("polished_red_granite_arch_half",
            () -> new HalfArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_ARCH_HALF = registerBlock("polished_white_granite_arch_half",
            () -> new HalfArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_ARCH_LARGE = registerBlock("polished_black_granite_arch_large",
            () -> new LargeArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_ARCH_LARGE = registerBlock("polished_brown_granite_arch_large",
            () -> new LargeArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_ARCH_LARGE = registerBlock("polished_gray_granite_arch_large",
            () -> new LargeArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_ARCH_LARGE = registerBlock("polished_pink_granite_arch_large",
            () -> new LargeArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_RED_GRANITE_ARCH_LARGE = registerBlock("polished_red_granite_arch_large",
            () -> new LargeArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_ARCH_LARGE = registerBlock("polished_white_granite_arch_large",
            () -> new LargeArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_ARCH_LARGE_HALF = registerBlock("polished_black_granite_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_ARCH_LARGE_HALF = registerBlock("polished_brown_granite_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_ARCH_LARGE_HALF = registerBlock("polished_gray_granite_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_ARCH_LARGE_HALF = registerBlock("polished_pink_granite_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_RED_GRANITE_ARCH_LARGE_HALF = registerBlock("polished_red_granite_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_ARCH_LARGE_HALF = registerBlock("polished_white_granite_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_ARROWSLIT = registerBlock("polished_black_granite_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_ARROWSLIT = registerBlock("polished_brown_granite_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_ARROWSLIT = registerBlock("polished_gray_granite_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_ARROWSLIT = registerBlock("polished_pink_granite_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_RED_GRANITE_ARROWSLIT = registerBlock("polished_red_granite_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_ARROWSLIT = registerBlock("polished_white_granite_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_BALUSTRADE = registerBlock("polished_black_granite_balustrade",
            () -> new BalustradeBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_BALUSTRADE = registerBlock("polished_brown_granite_balustrade",
            () -> new BalustradeBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_BALUSTRADE = registerBlock("polished_gray_granite_balustrade",
            () -> new BalustradeBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_BALUSTRADE = registerBlock("polished_pink_granite_balustrade",
            () -> new BalustradeBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_RED_GRANITE_BALUSTRADE = registerBlock("polished_red_granite_balustrade",
            () -> new BalustradeBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_BALUSTRADE = registerBlock("polished_white_granite_balustrade",
            () -> new BalustradeBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_CAPITAL = registerBlock("polished_black_granite_capital",
            () -> new CapitalBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_CAPITAL = registerBlock("polished_brown_granite_capital",
            () -> new CapitalBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_CAPITAL = registerBlock("polished_gray_granite_capital",
            () -> new CapitalBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_CAPITAL = registerBlock("polished_pink_granite_capital",
            () -> new CapitalBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_RED_GRANITE_CAPITAL = registerBlock("polished_red_granite_capital",
            () -> new CapitalBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_CAPITAL = registerBlock("polished_white_granite_capital",
            () -> new CapitalBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_CORNER = registerBlock("polished_black_granite_corner",
            () -> new CornerLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_CORNER = registerBlock("polished_brown_granite_corner",
            () -> new CornerLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_CORNER = registerBlock("polished_gray_granite_corner",
            () -> new CornerLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_CORNER = registerBlock("polished_pink_granite_corner",
            () -> new CornerLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_RED_GRANITE_CORNER = registerBlock("polished_red_granite_corner",
            () -> new CornerLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_CORNER = registerBlock("polished_white_granite_corner",
            () -> new CornerLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_CORNER_SLAB = registerBlock("polished_black_granite_corner_slab",
            () -> new CornerSlabBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_CORNER_SLAB = registerBlock("polished_brown_granite_corner_slab",
            () -> new CornerSlabBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_CORNER_SLAB = registerBlock("polished_gray_granite_corner_slab",
            () -> new CornerSlabBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_CORNER_SLAB = registerBlock("polished_pink_granite_corner_slab",
            () -> new CornerSlabBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_RED_GRANITE_CORNER_SLAB = registerBlock("polished_red_granite_corner_slab",
            () -> new CornerSlabBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_CORNER_SLAB = registerBlock("polished_white_granite_corner_slab",
            () -> new CornerSlabBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_CORNER_SLAB_VERTICAL = registerBlock("polished_black_granite_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_CORNER_SLAB_VERTICAL = registerBlock("polished_brown_granite_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_CORNER_SLAB_VERTICAL = registerBlock("polished_gray_granite_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_CORNER_SLAB_VERTICAL = registerBlock("polished_pink_granite_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_RED_GRANITE_CORNER_SLAB_VERTICAL = registerBlock("polished_red_granite_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_CORNER_SLAB_VERTICAL = registerBlock("polished_white_granite_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_EIGHTH = registerBlock("polished_black_granite_eighth",
            () -> new EighthBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_EIGHTH = registerBlock("polished_brown_granite_eighth",
            () -> new EighthBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_EIGHTH = registerBlock("polished_gray_granite_eighth",
            () -> new EighthBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_EIGHTH = registerBlock("polished_pink_granite_eighth",
            () -> new EighthBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_RED_GRANITE_EIGHTH = registerBlock("polished_red_granite_eighth",
            () -> new EighthBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_EIGHTH = registerBlock("polished_white_granite_eighth",
            () -> new EighthBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_PILLAR = registerBlock("polished_black_granite_pillar",
            () -> new PillarLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_PILLAR = registerBlock("polished_brown_granite_pillar",
            () -> new PillarLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_PILLAR = registerBlock("polished_gray_granite_pillar",
            () -> new PillarLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_PILLAR = registerBlock("polished_pink_granite_pillar",
            () -> new PillarLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_RED_GRANITE_PILLAR = registerBlock("polished_red_granite_pillar",
            () -> new PillarLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_PILLAR = registerBlock("polished_white_granite_pillar",
            () -> new PillarLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_QUARTER = registerBlock("polished_black_granite_quarter",
            () -> new QuarterLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_QUARTER = registerBlock("polished_brown_granite_quarter",
            () -> new QuarterLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_QUARTER = registerBlock("polished_gray_granite_quarter",
            () -> new QuarterLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_QUARTER = registerBlock("polished_pink_granite_quarter",
            () -> new QuarterLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_RED_GRANITE_QUARTER = registerBlock("polished_red_granite_quarter",
            () -> new QuarterLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_QUARTER = registerBlock("polished_white_granite_quarter",
            () -> new QuarterLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_QUARTER_VERTICAL = registerBlock("polished_black_granite_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_QUARTER_VERTICAL = registerBlock("polished_brown_granite_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_QUARTER_VERTICAL = registerBlock("polished_gray_granite_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_QUARTER_VERTICAL = registerBlock("polished_pink_granite_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_RED_GRANITE_QUARTER_VERTICAL = registerBlock("polished_red_granite_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_QUARTER_VERTICAL = registerBlock("polished_white_granite_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_SLAB = registerBlock("polished_black_granite_slab",
            () -> new SlabLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_SLAB = registerBlock("polished_brown_granite_slab",
            () -> new SlabLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_SLAB = registerBlock("polished_gray_granite_slab",
            () -> new SlabLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_SLAB = registerBlock("polished_pink_granite_slab",
            () -> new SlabLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_RED_GRANITE_SLAB = registerBlock("polished_red_granite_slab",
            () -> new SlabLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_SLAB = registerBlock("polished_white_granite_slab",
            () -> new SlabLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_SLAB_VERTICAL = registerBlock("polished_black_granite_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_SLAB_VERTICAL = registerBlock("polished_brown_granite_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_SLAB_VERTICAL = registerBlock("polished_gray_granite_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_SLAB_VERTICAL = registerBlock("polished_pink_granite_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_RED_GRANITE_SLAB_VERTICAL = registerBlock("polished_red_granite_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_SLAB_VERTICAL = registerBlock("polished_white_granite_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_STAIRS = registerBlock("polished_black_granite_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_BLACK_GRANITE.get().defaultBlockState(), BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_STAIRS = registerBlock("polished_brown_granite_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_BROWN_GRANITE.get().defaultBlockState(), BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_STAIRS = registerBlock("polished_gray_granite_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_GRAY_GRANITE.get().defaultBlockState(), BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_STAIRS = registerBlock("polished_pink_granite_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_PINK_GRANITE.get().defaultBlockState(), BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_STAIRS = registerBlock("polished_white_granite_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_WHITE_GRANITE.get().defaultBlockState(), BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_WALL = registerBlock("polished_black_granite_wall",
            () -> new WallBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_WALL = registerBlock("polished_brown_granite_wall",
            () -> new WallBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_WALL = registerBlock("polished_gray_granite_wall",
            () -> new WallBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_WALL = registerBlock("polished_pink_granite_wall",
            () -> new WallBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_RED_GRANITE_WALL = registerBlock("polished_red_granite_wall",
            () -> new WallBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_WALL = registerBlock("polished_white_granite_wall",
            () -> new WallBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_WINDOW = registerBlock("polished_black_granite_window",
            () -> new WindowBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_WINDOW = registerBlock("polished_brown_granite_window",
            () -> new WindowBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_WINDOW = registerBlock("polished_gray_granite_window",
            () -> new WindowBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_WINDOW = registerBlock("polished_pink_granite_window",
            () -> new WindowBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_RED_GRANITE_WINDOW = registerBlock("polished_red_granite_window",
            () -> new WindowBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_WINDOW = registerBlock("polished_white_granite_window",
            () -> new WindowBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_GRANITE_WINDOW_HALF = registerBlock("polished_black_granite_window_half",
            () -> new HalfWindowBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_BROWN_GRANITE_WINDOW_HALF = registerBlock("polished_brown_granite_window_half",
            () -> new HalfWindowBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_GRANITE_WINDOW_HALF = registerBlock("polished_gray_granite_window_half",
            () -> new HalfWindowBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_GRANITE_WINDOW_HALF = registerBlock("polished_pink_granite_window_half",
            () -> new HalfWindowBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_RED_GRANITE_WINDOW_HALF = registerBlock("polished_red_granite_window_half",
            () -> new HalfWindowBlock(BlockProps.GRANITE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_GRANITE_WINDOW_HALF = registerBlock("polished_white_granite_window_half",
            () -> new HalfWindowBlock(BlockProps.GRANITE.get()));


    // -- LIMESTONE
    public static final RegistryObject<Block> DARK_LIMESTONE = registerBlock("dark_limestone",
            () -> new Block(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE = registerBlock("light_limestone",
            () -> new Block(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE = registerBlock("pink_limestone",
            () -> new Block(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE = registerBlock("tan_limestone",
            () -> new Block(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_ARCH = registerBlock("dark_limestone_arch",
            () -> new ArchBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_ARCH = registerBlock("light_limestone_arch",
            () -> new ArchBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIMESTONE_ARCH = registerBlock("limestone_arch",
            () -> new ArchBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_ARCH = registerBlock("pink_limestone_arch",
            () -> new ArchBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_ARCH = registerBlock("tan_limestone_arch",
            () -> new ArchBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_ARCH_HALF = registerBlock("dark_limestone_arch_half",
            () -> new HalfArchBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_ARCH_HALF = registerBlock("light_limestone_arch_half",
            () -> new HalfArchBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIMESTONE_ARCH_HALF = registerBlock("limestone_arch_half",
            () -> new HalfArchBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_ARCH_HALF = registerBlock("pink_limestone_arch_half",
            () -> new HalfArchBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_ARCH_HALF = registerBlock("tan_limestone_arch_half",
            () -> new HalfArchBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_ARCH_LARGE = registerBlock("dark_limestone_arch_large",
            () -> new LargeArchBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_ARCH_LARGE = registerBlock("light_limestone_arch_large",
            () -> new LargeArchBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIMESTONE_ARCH_LARGE = registerBlock("limestone_arch_large",
            () -> new LargeArchBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_ARCH_LARGE = registerBlock("pink_limestone_arch_large",
            () -> new LargeArchBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_ARCH_LARGE = registerBlock("tan_limestone_arch_large",
            () -> new LargeArchBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_ARCH_LARGE_HALF = registerBlock("dark_limestone_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_ARCH_LARGE_HALF = registerBlock("light_limestone_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIMESTONE_ARCH_LARGE_HALF = registerBlock("limestone_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_ARCH_LARGE_HALF = registerBlock("pink_limestone_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_ARCH_LARGE_HALF = registerBlock("tan_limestone_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_ARROWSLIT = registerBlock("dark_limestone_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_ARROWSLIT = registerBlock("light_limestone_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIMESTONE_ARROWSLIT = registerBlock("limestone_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_ARROWSLIT = registerBlock("pink_limestone_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_ARROWSLIT = registerBlock("tan_limestone_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_BALUSTRADE = registerBlock("dark_limestone_balustrade",
            () -> new BalustradeBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BALUSTRADE = registerBlock("light_limestone_balustrade",
            () -> new BalustradeBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIMESTONE_BALUSTRADE = registerBlock("limestone_balustrade",
            () -> new BalustradeBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_BALUSTRADE = registerBlock("pink_limestone_balustrade",
            () -> new BalustradeBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_BALUSTRADE = registerBlock("tan_limestone_balustrade",
            () -> new BalustradeBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_BUTTON = registerBlock("dark_limestone_button",
            () -> new StoneButtonBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BUTTON = registerBlock("light_limestone_button",
            () -> new StoneButtonBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_BUTTON = registerBlock("pink_limestone_button",
            () -> new StoneButtonBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_BUTTON = registerBlock("tan_limestone_button",
            () -> new StoneButtonBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_CAPITAL = registerBlock("dark_limestone_capital",
            () -> new CapitalBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_CAPITAL = registerBlock("light_limestone_capital",
            () -> new CapitalBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIMESTONE_CAPITAL = registerBlock("limestone_capital",
            () -> new CapitalBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_CAPITAL = registerBlock("pink_limestone_capital",
            () -> new CapitalBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_CAPITAL = registerBlock("tan_limestone_capital",
            () -> new CapitalBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_CORNER = registerBlock("dark_limestone_corner",
            () -> new CornerLayerBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_CORNER = registerBlock("light_limestone_corner",
            () -> new CornerLayerBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIMESTONE_CORNER = registerBlock("limestone_corner",
            () -> new CornerLayerBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_CORNER = registerBlock("pink_limestone_corner",
            () -> new CornerLayerBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_CORNER = registerBlock("tan_limestone_corner",
            () -> new CornerLayerBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_CORNER_SLAB = registerBlock("dark_limestone_corner_slab",
            () -> new CornerSlabBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_CORNER_SLAB = registerBlock("light_limestone_corner_slab",
            () -> new CornerSlabBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIMESTONE_CORNER_SLAB = registerBlock("limestone_corner_slab",
            () -> new CornerSlabBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_CORNER_SLAB = registerBlock("pink_limestone_corner_slab",
            () -> new CornerSlabBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_CORNER_SLAB = registerBlock("tan_limestone_corner_slab",
            () -> new CornerSlabBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_CORNER_SLAB_VERTICAL = registerBlock("dark_limestone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_CORNER_SLAB_VERTICAL = registerBlock("light_limestone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIMESTONE_CORNER_SLAB_VERTICAL = registerBlock("limestone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_CORNER_SLAB_VERTICAL = registerBlock("pink_limestone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_CORNER_SLAB_VERTICAL = registerBlock("tan_limestone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_EIGHTH = registerBlock("dark_limestone_eighth",
            () -> new EighthBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_EIGHTH = registerBlock("light_limestone_eighth",
            () -> new EighthBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIMESTONE_EIGHTH = registerBlock("limestone_eighth",
            () -> new EighthBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_EIGHTH = registerBlock("pink_limestone_eighth",
            () -> new EighthBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_EIGHTH = registerBlock("tan_limestone_eighth",
            () -> new EighthBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_PILLAR = registerBlock("dark_limestone_pillar",
            () -> new PillarLayerBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_PILLAR = registerBlock("light_limestone_pillar",
            () -> new PillarLayerBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIMESTONE_PILLAR = registerBlock("limestone_pillar",
            () -> new PillarLayerBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_PILLAR = registerBlock("pink_limestone_pillar",
            () -> new PillarLayerBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_PILLAR = registerBlock("tan_limestone_pillar",
            () -> new PillarLayerBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_PRESSURE_PLATE = registerBlock("dark_limestone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_PRESSURE_PLATE = registerBlock("light_limestone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_PRESSURE_PLATE = registerBlock("pink_limestone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_PRESSURE_PLATE = registerBlock("tan_limestone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_QUARTER = registerBlock("dark_limestone_quarter",
            () -> new QuarterLayerBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_QUARTER = registerBlock("light_limestone_quarter",
            () -> new QuarterLayerBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIMESTONE_QUARTER = registerBlock("limestone_quarter",
            () -> new QuarterLayerBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_QUARTER = registerBlock("pink_limestone_quarter",
            () -> new QuarterLayerBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_QUARTER = registerBlock("tan_limestone_quarter",
            () -> new QuarterLayerBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_QUARTER_VERTICAL = registerBlock("dark_limestone_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_QUARTER_VERTICAL = registerBlock("light_limestone_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIMESTONE_QUARTER_VERTICAL = registerBlock("limestone_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_QUARTER_VERTICAL = registerBlock("pink_limestone_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_QUARTER_VERTICAL = registerBlock("tan_limestone_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_SLAB = registerBlock("dark_limestone_slab",
            () -> new SlabLayerBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_SLAB = registerBlock("light_limestone_slab",
            () -> new SlabLayerBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIMESTONE_SLAB = registerBlock("limestone_slab",
            () -> new SlabLayerBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_SLAB = registerBlock("pink_limestone_slab",
            () -> new SlabLayerBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_SLAB = registerBlock("tan_limestone_slab",
            () -> new SlabLayerBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_SLAB_VERTICAL = registerBlock("dark_limestone_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_SLAB_VERTICAL = registerBlock("light_limestone_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIMESTONE_SLAB_VERTICAL = registerBlock("limestone_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_SLAB_VERTICAL = registerBlock("pink_limestone_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_SLAB_VERTICAL = registerBlock("tan_limestone_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_STAIRS = registerBlock("dark_limestone_stairs",
            () -> new StairBlock(() -> ModBlocks.DARK_LIMESTONE.get().defaultBlockState(), BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_STAIRS = registerBlock("light_limestone_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_LIMESTONE.get().defaultBlockState(), BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_STAIRS = registerBlock("pink_limestone_stairs",
            () -> new StairBlock(() -> ModBlocks.PINK_LIMESTONE.get().defaultBlockState(), BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_STAIRS = registerBlock("tan_limestone_stairs",
            () -> new StairBlock(() -> ModBlocks.TAN_LIMESTONE.get().defaultBlockState(), BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_WALL = registerBlock("dark_limestone_wall",
            () -> new WallBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_WALL = registerBlock("light_limestone_wall",
            () -> new WallBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIMESTONE_WALL = registerBlock("limestone_wall",
            () -> new WallBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_WALL = registerBlock("pink_limestone_wall",
            () -> new WallBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_WALL = registerBlock("tan_limestone_wall",
            () -> new WallBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_WINDOW = registerBlock("dark_limestone_window",
            () -> new WindowBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_WINDOW = registerBlock("light_limestone_window",
            () -> new WindowBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIMESTONE_WINDOW = registerBlock("limestone_window",
            () -> new WindowBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_WINDOW = registerBlock("pink_limestone_window",
            () -> new WindowBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_WINDOW = registerBlock("tan_limestone_window",
            () -> new WindowBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_WINDOW_HALF = registerBlock("dark_limestone_window_half",
            () -> new HalfWindowBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_WINDOW_HALF = registerBlock("light_limestone_window_half",
            () -> new HalfWindowBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> LIMESTONE_WINDOW_HALF = registerBlock("limestone_window_half",
            () -> new HalfWindowBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_WINDOW_HALF = registerBlock("pink_limestone_window_half",
            () -> new HalfWindowBlock(BlockProps.LIMESTONE.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_WINDOW_HALF = registerBlock("tan_limestone_window_half",
            () -> new HalfWindowBlock(BlockProps.LIMESTONE.get()));


    // -- LIMESTONE -- COBBLED
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE = registerBlock("cobbled_dark_limestone",
            () -> new Block(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE = registerBlock("cobbled_light_limestone",
            () -> new Block(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE = registerBlock("cobbled_pink_limestone",
            () -> new Block(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE = registerBlock("cobbled_tan_limestone",
            () -> new Block(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_ARCH = registerBlock("cobbled_dark_limestone_arch",
            () -> new ArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_ARCH = registerBlock("cobbled_light_limestone_arch",
            () -> new ArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIMESTONE_ARCH = registerBlock("cobbled_limestone_arch",
            () -> new ArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_ARCH = registerBlock("cobbled_pink_limestone_arch",
            () -> new ArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_ARCH = registerBlock("cobbled_tan_limestone_arch",
            () -> new ArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_ARCH_HALF = registerBlock("cobbled_dark_limestone_arch_half",
            () -> new HalfArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_ARCH_HALF = registerBlock("cobbled_light_limestone_arch_half",
            () -> new HalfArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIMESTONE_ARCH_HALF = registerBlock("cobbled_limestone_arch_half",
            () -> new HalfArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_ARCH_HALF = registerBlock("cobbled_pink_limestone_arch_half",
            () -> new HalfArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_ARCH_HALF = registerBlock("cobbled_tan_limestone_arch_half",
            () -> new HalfArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_ARCH_LARGE = registerBlock("cobbled_dark_limestone_arch_large",
            () -> new LargeArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_ARCH_LARGE = registerBlock("cobbled_light_limestone_arch_large",
            () -> new LargeArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIMESTONE_ARCH_LARGE = registerBlock("cobbled_limestone_arch_large",
            () -> new LargeArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_ARCH_LARGE = registerBlock("cobbled_pink_limestone_arch_large",
            () -> new LargeArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_ARCH_LARGE = registerBlock("cobbled_tan_limestone_arch_large",
            () -> new LargeArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_ARCH_LARGE_HALF = registerBlock("cobbled_dark_limestone_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_ARCH_LARGE_HALF = registerBlock("cobbled_light_limestone_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIMESTONE_ARCH_LARGE_HALF = registerBlock("cobbled_limestone_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_ARCH_LARGE_HALF = registerBlock("cobbled_pink_limestone_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_ARCH_LARGE_HALF = registerBlock("cobbled_tan_limestone_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_ARROWSLIT = registerBlock("cobbled_dark_limestone_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_ARROWSLIT = registerBlock("cobbled_light_limestone_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIMESTONE_ARROWSLIT = registerBlock("cobbled_limestone_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_ARROWSLIT = registerBlock("cobbled_pink_limestone_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_ARROWSLIT = registerBlock("cobbled_tan_limestone_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_BALUSTRADE = registerBlock("cobbled_dark_limestone_balustrade",
            () -> new BalustradeBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_BALUSTRADE = registerBlock("cobbled_light_limestone_balustrade",
            () -> new BalustradeBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIMESTONE_BALUSTRADE = registerBlock("cobbled_limestone_balustrade",
            () -> new BalustradeBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_BALUSTRADE = registerBlock("cobbled_pink_limestone_balustrade",
            () -> new BalustradeBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_BALUSTRADE = registerBlock("cobbled_tan_limestone_balustrade",
            () -> new BalustradeBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_CAPITAL = registerBlock("cobbled_dark_limestone_capital",
            () -> new CapitalBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_CAPITAL = registerBlock("cobbled_light_limestone_capital",
            () -> new CapitalBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIMESTONE_CAPITAL = registerBlock("cobbled_limestone_capital",
            () -> new CapitalBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_CAPITAL = registerBlock("cobbled_pink_limestone_capital",
            () -> new CapitalBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_CAPITAL = registerBlock("cobbled_tan_limestone_capital",
            () -> new CapitalBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_CORNER = registerBlock("cobbled_dark_limestone_corner",
            () -> new CornerLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_CORNER = registerBlock("cobbled_light_limestone_corner",
            () -> new CornerLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIMESTONE_CORNER = registerBlock("cobbled_limestone_corner",
            () -> new CornerLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_CORNER = registerBlock("cobbled_pink_limestone_corner",
            () -> new CornerLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_CORNER = registerBlock("cobbled_tan_limestone_corner",
            () -> new CornerLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_CORNER_SLAB = registerBlock("cobbled_dark_limestone_corner_slab",
            () -> new CornerSlabBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_CORNER_SLAB = registerBlock("cobbled_light_limestone_corner_slab",
            () -> new CornerSlabBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIMESTONE_CORNER_SLAB = registerBlock("cobbled_limestone_corner_slab",
            () -> new CornerSlabBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_CORNER_SLAB = registerBlock("cobbled_pink_limestone_corner_slab",
            () -> new CornerSlabBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_CORNER_SLAB = registerBlock("cobbled_tan_limestone_corner_slab",
            () -> new CornerSlabBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_CORNER_SLAB_VERTICAL = registerBlock("cobbled_dark_limestone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_CORNER_SLAB_VERTICAL = registerBlock("cobbled_light_limestone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIMESTONE_CORNER_SLAB_VERTICAL = registerBlock("cobbled_limestone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_CORNER_SLAB_VERTICAL = registerBlock("cobbled_pink_limestone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_CORNER_SLAB_VERTICAL = registerBlock("cobbled_tan_limestone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_EIGHTH = registerBlock("cobbled_dark_limestone_eighth",
            () -> new EighthBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_EIGHTH = registerBlock("cobbled_light_limestone_eighth",
            () -> new EighthBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIMESTONE_EIGHTH = registerBlock("cobbled_limestone_eighth",
            () -> new EighthBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_EIGHTH = registerBlock("cobbled_pink_limestone_eighth",
            () -> new EighthBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_EIGHTH = registerBlock("cobbled_tan_limestone_eighth",
            () -> new EighthBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_PILLAR = registerBlock("cobbled_dark_limestone_pillar",
            () -> new PillarLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_PILLAR = registerBlock("cobbled_light_limestone_pillar",
            () -> new PillarLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIMESTONE_PILLAR = registerBlock("cobbled_limestone_pillar",
            () -> new PillarLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_PILLAR = registerBlock("cobbled_pink_limestone_pillar",
            () -> new PillarLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_PILLAR = registerBlock("cobbled_tan_limestone_pillar",
            () -> new PillarLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_QUARTER = registerBlock("cobbled_dark_limestone_quarter",
            () -> new QuarterLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_QUARTER = registerBlock("cobbled_light_limestone_quarter",
            () -> new QuarterLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIMESTONE_QUARTER = registerBlock("cobbled_limestone_quarter",
            () -> new QuarterLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_QUARTER = registerBlock("cobbled_pink_limestone_quarter",
            () -> new QuarterLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_QUARTER = registerBlock("cobbled_tan_limestone_quarter",
            () -> new QuarterLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_QUARTER_VERTICAL = registerBlock("cobbled_dark_limestone_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_QUARTER_VERTICAL = registerBlock("cobbled_light_limestone_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIMESTONE_QUARTER_VERTICAL = registerBlock("cobbled_limestone_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_QUARTER_VERTICAL = registerBlock("cobbled_pink_limestone_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_QUARTER_VERTICAL = registerBlock("cobbled_tan_limestone_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_SLAB = registerBlock("cobbled_dark_limestone_slab",
            () -> new SlabLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_SLAB = registerBlock("cobbled_light_limestone_slab",
            () -> new SlabLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIMESTONE_SLAB = registerBlock("cobbled_limestone_slab",
            () -> new SlabLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_SLAB = registerBlock("cobbled_pink_limestone_slab",
            () -> new SlabLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_SLAB = registerBlock("cobbled_tan_limestone_slab",
            () -> new SlabLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_SLAB_VERTICAL = registerBlock("cobbled_dark_limestone_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_SLAB_VERTICAL = registerBlock("cobbled_light_limestone_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIMESTONE_SLAB_VERTICAL = registerBlock("cobbled_limestone_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_SLAB_VERTICAL = registerBlock("cobbled_pink_limestone_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_SLAB_VERTICAL = registerBlock("cobbled_tan_limestone_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_STAIRS = registerBlock("cobbled_dark_limestone_stairs",
            () -> new StairBlock(() -> ModBlocks.COBBLED_DARK_LIMESTONE.get().defaultBlockState(), BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_STAIRS = registerBlock("cobbled_light_limestone_stairs",
            () -> new StairBlock(() -> ModBlocks.COBBLED_LIGHT_LIMESTONE.get().defaultBlockState(), BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_STAIRS = registerBlock("cobbled_pink_limestone_stairs",
            () -> new StairBlock(() -> ModBlocks.COBBLED_PINK_LIMESTONE.get().defaultBlockState(), BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_STAIRS = registerBlock("cobbled_tan_limestone_stairs",
            () -> new StairBlock(() -> ModBlocks.COBBLED_TAN_LIMESTONE.get().defaultBlockState(), BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_WALL = registerBlock("cobbled_dark_limestone_wall",
            () -> new WallBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_WALL = registerBlock("cobbled_light_limestone_wall",
            () -> new WallBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_WALL = registerBlock("cobbled_pink_limestone_wall",
            () -> new WallBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_WALL = registerBlock("cobbled_tan_limestone_wall",
            () -> new WallBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_WINDOW = registerBlock("cobbled_dark_limestone_window",
            () -> new WindowBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_WINDOW = registerBlock("cobbled_light_limestone_window",
            () -> new WindowBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIMESTONE_WINDOW = registerBlock("cobbled_limestone_window",
            () -> new WindowBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_WINDOW = registerBlock("cobbled_pink_limestone_window",
            () -> new WindowBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_WINDOW = registerBlock("cobbled_tan_limestone_window",
            () -> new WindowBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_DARK_LIMESTONE_WINDOW_HALF = registerBlock("cobbled_dark_limestone_window_half",
            () -> new HalfWindowBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIGHT_LIMESTONE_WINDOW_HALF = registerBlock("cobbled_light_limestone_window_half",
            () -> new HalfWindowBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_LIMESTONE_WINDOW_HALF = registerBlock("cobbled_limestone_window_half",
            () -> new HalfWindowBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_PINK_LIMESTONE_WINDOW_HALF = registerBlock("cobbled_pink_limestone_window_half",
            () -> new HalfWindowBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> COBBLED_TAN_LIMESTONE_WINDOW_HALF = registerBlock("cobbled_tan_limestone_window_half",
            () -> new HalfWindowBlock(BlockProps.COBBLESTONE.get()));

    // -- LIMESTONE -- MOSSY_COBBLED
    public static final RegistryObject<Block> MOSSY_COBBLED_DARK_LIMESTONE = registerBlock("mossy_cobbled_dark_limestone",
            () -> new Block(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIGHT_LIMESTONE = registerBlock("mossy_cobbled_light_limestone",
            () -> new Block(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_PINK_LIMESTONE = registerBlock("mossy_cobbled_pink_limestone",
            () -> new Block(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_TAN_LIMESTONE = registerBlock("mossy_cobbled_tan_limestone",
            () -> new Block(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_DARK_LIMESTONE_ARCH = registerBlock("mossy_cobbled_dark_limestone_arch",
            () -> new ArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIGHT_LIMESTONE_ARCH = registerBlock("mossy_cobbled_light_limestone_arch",
            () -> new ArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIMESTONE_ARCH = registerBlock("mossy_cobbled_limestone_arch",
            () -> new ArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_PINK_LIMESTONE_ARCH = registerBlock("mossy_cobbled_pink_limestone_arch",
            () -> new ArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_TAN_LIMESTONE_ARCH = registerBlock("mossy_cobbled_tan_limestone_arch",
            () -> new ArchBlock(BlockProps.COBBLESTONE.get()));
        public static final RegistryObject<Block> MOSSY_COBBLED_DARK_LIMESTONE_ARCH_HALF = registerBlock("mossy_cobbled_dark_limestone_arch_half",
            () -> new HalfArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIGHT_LIMESTONE_ARCH_HALF = registerBlock("mossy_cobbled_light_limestone_arch_half",
            () -> new HalfArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIMESTONE_ARCH_HALF = registerBlock("mossy_cobbled_limestone_arch_half",
            () -> new HalfArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_PINK_LIMESTONE_ARCH_HALF = registerBlock("mossy_cobbled_pink_limestone_arch_half",
            () -> new HalfArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_TAN_LIMESTONE_ARCH_HALF = registerBlock("mossy_cobbled_tan_limestone_arch_half",
            () -> new HalfArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_DARK_LIMESTONE_ARCH_LARGE = registerBlock("mossy_cobbled_dark_limestone_arch_large",
            () -> new LargeArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIGHT_LIMESTONE_ARCH_LARGE = registerBlock("mossy_cobbled_light_limestone_arch_large",
            () -> new LargeArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIMESTONE_ARCH_LARGE = registerBlock("mossy_cobbled_limestone_arch_large",
            () -> new LargeArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_PINK_LIMESTONE_ARCH_LARGE = registerBlock("mossy_cobbled_pink_limestone_arch_large",
            () -> new LargeArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_TAN_LIMESTONE_ARCH_LARGE = registerBlock("mossy_cobbled_tan_limestone_arch_large",
            () -> new LargeArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_DARK_LIMESTONE_ARCH_LARGE_HALF = registerBlock("mossy_cobbled_dark_limestone_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIGHT_LIMESTONE_ARCH_LARGE_HALF = registerBlock("mossy_cobbled_light_limestone_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIMESTONE_ARCH_LARGE_HALF = registerBlock("mossy_cobbled_limestone_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_PINK_LIMESTONE_ARCH_LARGE_HALF = registerBlock("mossy_cobbled_pink_limestone_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_TAN_LIMESTONE_ARCH_LARGE_HALF = registerBlock("mossy_cobbled_tan_limestone_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_DARK_LIMESTONE_ARROWSLIT = registerBlock("mossy_cobbled_dark_limestone_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIGHT_LIMESTONE_ARROWSLIT = registerBlock("mossy_cobbled_light_limestone_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIMESTONE_ARROWSLIT = registerBlock("mossy_cobbled_limestone_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_PINK_LIMESTONE_ARROWSLIT = registerBlock("mossy_cobbled_pink_limestone_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_TAN_LIMESTONE_ARROWSLIT = registerBlock("mossy_cobbled_tan_limestone_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_DARK_LIMESTONE_BALUSTRADE = registerBlock("mossy_cobbled_dark_limestone_balustrade",
            () -> new BalustradeBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIGHT_LIMESTONE_BALUSTRADE = registerBlock("mossy_cobbled_light_limestone_balustrade",
            () -> new BalustradeBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIMESTONE_BALUSTRADE = registerBlock("mossy_cobbled_limestone_balustrade",
            () -> new BalustradeBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_PINK_LIMESTONE_BALUSTRADE = registerBlock("mossy_cobbled_pink_limestone_balustrade",
            () -> new BalustradeBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_TAN_LIMESTONE_BALUSTRADE = registerBlock("mossy_cobbled_tan_limestone_balustrade",
            () -> new BalustradeBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_DARK_LIMESTONE_CAPITAL = registerBlock("mossy_cobbled_dark_limestone_capital",
            () -> new CapitalBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIGHT_LIMESTONE_CAPITAL = registerBlock("mossy_cobbled_light_limestone_capital",
            () -> new CapitalBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIMESTONE_CAPITAL = registerBlock("mossy_cobbled_limestone_capital",
            () -> new CapitalBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_PINK_LIMESTONE_CAPITAL = registerBlock("mossy_cobbled_pink_limestone_capital",
            () -> new CapitalBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_TAN_LIMESTONE_CAPITAL = registerBlock("mossy_cobbled_tan_limestone_capital",
            () -> new CapitalBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_DARK_LIMESTONE_CORNER = registerBlock("mossy_cobbled_dark_limestone_corner",
            () -> new CornerLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIGHT_LIMESTONE_CORNER = registerBlock("mossy_cobbled_light_limestone_corner",
            () -> new CornerLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIMESTONE_CORNER = registerBlock("mossy_cobbled_limestone_corner",
            () -> new CornerLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_PINK_LIMESTONE_CORNER = registerBlock("mossy_cobbled_pink_limestone_corner",
            () -> new CornerLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_TAN_LIMESTONE_CORNER = registerBlock("mossy_cobbled_tan_limestone_corner",
            () -> new CornerLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_DARK_LIMESTONE_CORNER_SLAB = registerBlock("mossy_cobbled_dark_limestone_corner_slab",
            () -> new CornerSlabBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIGHT_LIMESTONE_CORNER_SLAB = registerBlock("mossy_cobbled_light_limestone_corner_slab",
            () -> new CornerSlabBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIMESTONE_CORNER_SLAB = registerBlock("mossy_cobbled_limestone_corner_slab",
            () -> new CornerSlabBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_PINK_LIMESTONE_CORNER_SLAB = registerBlock("mossy_cobbled_pink_limestone_corner_slab",
            () -> new CornerSlabBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_TAN_LIMESTONE_CORNER_SLAB = registerBlock("mossy_cobbled_tan_limestone_corner_slab",
            () -> new CornerSlabBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_DARK_LIMESTONE_CORNER_SLAB_VERTICAL = registerBlock("mossy_cobbled_dark_limestone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIGHT_LIMESTONE_CORNER_SLAB_VERTICAL = registerBlock("mossy_cobbled_light_limestone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIMESTONE_CORNER_SLAB_VERTICAL = registerBlock("mossy_cobbled_limestone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_PINK_LIMESTONE_CORNER_SLAB_VERTICAL = registerBlock("mossy_cobbled_pink_limestone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_TAN_LIMESTONE_CORNER_SLAB_VERTICAL = registerBlock("mossy_cobbled_tan_limestone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_DARK_LIMESTONE_EIGHTH = registerBlock("mossy_cobbled_dark_limestone_eighth",
            () -> new EighthBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIGHT_LIMESTONE_EIGHTH = registerBlock("mossy_cobbled_light_limestone_eighth",
            () -> new EighthBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIMESTONE_EIGHTH = registerBlock("mossy_cobbled_limestone_eighth",
            () -> new EighthBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_PINK_LIMESTONE_EIGHTH = registerBlock("mossy_cobbled_pink_limestone_eighth",
            () -> new EighthBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_TAN_LIMESTONE_EIGHTH = registerBlock("mossy_cobbled_tan_limestone_eighth",
            () -> new EighthBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_DARK_LIMESTONE_PILLAR = registerBlock("mossy_cobbled_dark_limestone_pillar",
            () -> new PillarLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIGHT_LIMESTONE_PILLAR = registerBlock("mossy_cobbled_light_limestone_pillar",
            () -> new PillarLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIMESTONE_PILLAR = registerBlock("mossy_cobbled_limestone_pillar",
            () -> new PillarLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_PINK_LIMESTONE_PILLAR = registerBlock("mossy_cobbled_pink_limestone_pillar",
            () -> new PillarLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_TAN_LIMESTONE_PILLAR = registerBlock("mossy_cobbled_tan_limestone_pillar",
            () -> new PillarLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_DARK_LIMESTONE_QUARTER = registerBlock("mossy_cobbled_dark_limestone_quarter",
            () -> new QuarterLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIGHT_LIMESTONE_QUARTER = registerBlock("mossy_cobbled_light_limestone_quarter",
            () -> new QuarterLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIMESTONE_QUARTER = registerBlock("mossy_cobbled_limestone_quarter",
            () -> new QuarterLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_PINK_LIMESTONE_QUARTER = registerBlock("mossy_cobbled_pink_limestone_quarter",
            () -> new QuarterLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_TAN_LIMESTONE_QUARTER = registerBlock("mossy_cobbled_tan_limestone_quarter",
            () -> new QuarterLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_DARK_LIMESTONE_QUARTER_VERTICAL = registerBlock("mossy_cobbled_dark_limestone_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIGHT_LIMESTONE_QUARTER_VERTICAL = registerBlock("mossy_cobbled_light_limestone_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIMESTONE_QUARTER_VERTICAL = registerBlock("mossy_cobbled_limestone_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_PINK_LIMESTONE_QUARTER_VERTICAL = registerBlock("mossy_cobbled_pink_limestone_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_TAN_LIMESTONE_QUARTER_VERTICAL = registerBlock("mossy_cobbled_tan_limestone_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_DARK_LIMESTONE_SLAB = registerBlock("mossy_cobbled_dark_limestone_slab",
            () -> new SlabLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIGHT_LIMESTONE_SLAB = registerBlock("mossy_cobbled_light_limestone_slab",
            () -> new SlabLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIMESTONE_SLAB = registerBlock("mossy_cobbled_limestone_slab",
            () -> new SlabLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_PINK_LIMESTONE_SLAB = registerBlock("mossy_cobbled_pink_limestone_slab",
            () -> new SlabLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_TAN_LIMESTONE_SLAB = registerBlock("mossy_cobbled_tan_limestone_slab",
            () -> new SlabLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_DARK_LIMESTONE_SLAB_VERTICAL = registerBlock("mossy_cobbled_dark_limestone_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIGHT_LIMESTONE_SLAB_VERTICAL = registerBlock("mossy_cobbled_light_limestone_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIMESTONE_SLAB_VERTICAL = registerBlock("mossy_cobbled_limestone_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_PINK_LIMESTONE_SLAB_VERTICAL = registerBlock("mossy_cobbled_pink_limestone_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_TAN_LIMESTONE_SLAB_VERTICAL = registerBlock("mossy_cobbled_tan_limestone_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_DARK_LIMESTONE_STAIRS = registerBlock("mossy_cobbled_dark_limestone_stairs",
            () -> new StairBlock(() -> ModBlocks.MOSSY_COBBLED_DARK_LIMESTONE.get().defaultBlockState(), BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIGHT_LIMESTONE_STAIRS = registerBlock("mossy_cobbled_light_limestone_stairs",
            () -> new StairBlock(() -> ModBlocks.MOSSY_COBBLED_LIGHT_LIMESTONE.get().defaultBlockState(), BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_PINK_LIMESTONE_STAIRS = registerBlock("mossy_cobbled_pink_limestone_stairs",
            () -> new StairBlock(() -> ModBlocks.MOSSY_COBBLED_PINK_LIMESTONE.get().defaultBlockState(), BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_TAN_LIMESTONE_STAIRS = registerBlock("mossy_cobbled_tan_limestone_stairs",
            () -> new StairBlock(() -> ModBlocks.MOSSY_COBBLED_TAN_LIMESTONE.get().defaultBlockState(), BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_DARK_LIMESTONE_WALL = registerBlock("mossy_cobbled_dark_limestone_wall",
            () -> new WallBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIGHT_LIMESTONE_WALL = registerBlock("mossy_cobbled_light_limestone_wall",
            () -> new WallBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_PINK_LIMESTONE_WALL = registerBlock("mossy_cobbled_pink_limestone_wall",
            () -> new WallBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_TAN_LIMESTONE_WALL = registerBlock("mossy_cobbled_tan_limestone_wall",
            () -> new WallBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_DARK_LIMESTONE_WINDOW = registerBlock("mossy_cobbled_dark_limestone_window",
            () -> new WindowBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIGHT_LIMESTONE_WINDOW = registerBlock("mossy_cobbled_light_limestone_window",
            () -> new WindowBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIMESTONE_WINDOW = registerBlock("mossy_cobbled_limestone_window",
            () -> new WindowBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_PINK_LIMESTONE_WINDOW = registerBlock("mossy_cobbled_pink_limestone_window",
            () -> new WindowBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_TAN_LIMESTONE_WINDOW = registerBlock("mossy_cobbled_tan_limestone_window",
            () -> new WindowBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_DARK_LIMESTONE_WINDOW_HALF = registerBlock("mossy_cobbled_dark_limestone_window_half",
            () -> new HalfWindowBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIGHT_LIMESTONE_WINDOW_HALF = registerBlock("mossy_cobbled_light_limestone_window_half",
            () -> new HalfWindowBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_LIMESTONE_WINDOW_HALF = registerBlock("mossy_cobbled_limestone_window_half",
            () -> new HalfWindowBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_PINK_LIMESTONE_WINDOW_HALF = registerBlock("mossy_cobbled_pink_limestone_window_half",
            () -> new HalfWindowBlock(BlockProps.COBBLESTONE.get()));
    public static final RegistryObject<Block> MOSSY_COBBLED_TAN_LIMESTONE_WINDOW_HALF = registerBlock("mossy_cobbled_tan_limestone_window_half",
            () -> new HalfWindowBlock(BlockProps.COBBLESTONE.get()));


    // -- LIMESTONE -- BRICKS
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICKS = registerBlock("dark_limestone_bricks",
            () -> new Block(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICKS = registerBlock("light_limestone_bricks",
            () -> new Block(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICKS = registerBlock("pink_limestone_bricks",
            () -> new Block(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICKS = registerBlock("tan_limestone_bricks",
            () -> new Block(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_ARCH = registerBlock("dark_limestone_brick_arch",
            () -> new ArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_ARCH = registerBlock("light_limestone_brick_arch",
            () -> new ArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIMESTONE_BRICK_ARCH = registerBlock("limestone_brick_arch",
            () -> new ArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_ARCH = registerBlock("pink_limestone_brick_arch",
            () -> new ArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_ARCH = registerBlock("tan_limestone_brick_arch",
            () -> new ArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_ARCH_HALF = registerBlock("dark_limestone_brick_arch_half",
            () -> new HalfArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_ARCH_HALF = registerBlock("light_limestone_brick_arch_half",
            () -> new HalfArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIMESTONE_BRICK_ARCH_HALF = registerBlock("limestone_brick_arch_half",
            () -> new HalfArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_ARCH_HALF = registerBlock("pink_limestone_brick_arch_half",
            () -> new HalfArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_ARCH_HALF = registerBlock("tan_limestone_brick_arch_half",
            () -> new HalfArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_ARCH_LARGE = registerBlock("dark_limestone_brick_arch_large",
            () -> new LargeArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_ARCH_LARGE = registerBlock("light_limestone_brick_arch_large",
            () -> new LargeArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIMESTONE_BRICK_ARCH_LARGE = registerBlock("limestone_brick_arch_large",
            () -> new LargeArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_ARCH_LARGE = registerBlock("pink_limestone_brick_arch_large",
            () -> new LargeArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_ARCH_LARGE = registerBlock("tan_limestone_brick_arch_large",
            () -> new LargeArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_ARCH_LARGE_HALF = registerBlock("dark_limestone_brick_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_ARCH_LARGE_HALF = registerBlock("light_limestone_brick_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIMESTONE_BRICK_ARCH_LARGE_HALF = registerBlock("limestone_brick_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_ARCH_LARGE_HALF = registerBlock("pink_limestone_brick_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_ARCH_LARGE_HALF = registerBlock("tan_limestone_brick_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_ARROWSLIT = registerBlock("dark_limestone_brick_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_ARROWSLIT = registerBlock("light_limestone_brick_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIMESTONE_BRICK_ARROWSLIT = registerBlock("limestone_brick_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_ARROWSLIT = registerBlock("pink_limestone_brick_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_ARROWSLIT = registerBlock("tan_limestone_brick_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_BALUSTRADE = registerBlock("dark_limestone_brick_balustrade",
            () -> new BalustradeBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_BALUSTRADE = registerBlock("light_limestone_brick_balustrade",
            () -> new BalustradeBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIMESTONE_BRICK_BALUSTRADE = registerBlock("limestone_brick_balustrade",
            () -> new BalustradeBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_BALUSTRADE = registerBlock("pink_limestone_brick_balustrade",
            () -> new BalustradeBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_BALUSTRADE = registerBlock("tan_limestone_brick_balustrade",
            () -> new BalustradeBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_CAPITAL = registerBlock("dark_limestone_brick_capital",
            () -> new CapitalBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_CAPITAL = registerBlock("light_limestone_brick_capital",
            () -> new CapitalBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIMESTONE_BRICK_CAPITAL = registerBlock("limestone_brick_capital",
            () -> new CapitalBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_CAPITAL = registerBlock("pink_limestone_brick_capital",
            () -> new CapitalBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_CAPITAL = registerBlock("tan_limestone_brick_capital",
            () -> new CapitalBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_CORNER = registerBlock("dark_limestone_brick_corner",
            () -> new CornerLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_CORNER = registerBlock("light_limestone_brick_corner",
            () -> new CornerLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIMESTONE_BRICK_CORNER = registerBlock("limestone_brick_corner",
            () -> new CornerLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_CORNER = registerBlock("pink_limestone_brick_corner",
            () -> new CornerLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_CORNER = registerBlock("tan_limestone_brick_corner",
            () -> new CornerLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_CORNER_SLAB = registerBlock("dark_limestone_brick_corner_slab",
            () -> new CornerSlabBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_CORNER_SLAB = registerBlock("light_limestone_brick_corner_slab",
            () -> new CornerSlabBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIMESTONE_BRICK_CORNER_SLAB = registerBlock("limestone_brick_corner_slab",
            () -> new CornerSlabBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_CORNER_SLAB = registerBlock("pink_limestone_brick_corner_slab",
            () -> new CornerSlabBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_CORNER_SLAB = registerBlock("tan_limestone_brick_corner_slab",
            () -> new CornerSlabBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL = registerBlock("dark_limestone_brick_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL = registerBlock("light_limestone_brick_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIMESTONE_BRICK_CORNER_SLAB_VERTICAL = registerBlock("limestone_brick_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL = registerBlock("pink_limestone_brick_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL = registerBlock("tan_limestone_brick_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_EIGHTH = registerBlock("dark_limestone_brick_eighth",
            () -> new EighthBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_EIGHTH = registerBlock("light_limestone_brick_eighth",
            () -> new EighthBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIMESTONE_BRICK_EIGHTH = registerBlock("limestone_brick_eighth",
            () -> new EighthBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_EIGHTH = registerBlock("pink_limestone_brick_eighth",
            () -> new EighthBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_EIGHTH = registerBlock("tan_limestone_brick_eighth",
            () -> new EighthBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_PILLAR = registerBlock("dark_limestone_brick_pillar",
            () -> new PillarLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_PILLAR = registerBlock("light_limestone_brick_pillar",
            () -> new PillarLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIMESTONE_BRICK_PILLAR = registerBlock("limestone_brick_pillar",
            () -> new PillarLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_PILLAR = registerBlock("pink_limestone_brick_pillar",
            () -> new PillarLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_PILLAR = registerBlock("tan_limestone_brick_pillar",
            () -> new PillarLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_QUARTER = registerBlock("dark_limestone_brick_quarter",
            () -> new QuarterLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_QUARTER = registerBlock("light_limestone_brick_quarter",
            () -> new QuarterLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIMESTONE_BRICK_QUARTER = registerBlock("limestone_brick_quarter",
            () -> new QuarterLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_QUARTER = registerBlock("pink_limestone_brick_quarter",
            () -> new QuarterLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_QUARTER = registerBlock("tan_limestone_brick_quarter",
            () -> new QuarterLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_QUARTER_VERTICAL = registerBlock("dark_limestone_brick_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_QUARTER_VERTICAL = registerBlock("light_limestone_brick_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIMESTONE_BRICK_QUARTER_VERTICAL = registerBlock("limestone_brick_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_QUARTER_VERTICAL = registerBlock("pink_limestone_brick_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_QUARTER_VERTICAL = registerBlock("tan_limestone_brick_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_SLAB = registerBlock("dark_limestone_brick_slab",
            () -> new SlabLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_SLAB = registerBlock("light_limestone_brick_slab",
            () -> new SlabLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIMESTONE_BRICK_SLAB = registerBlock("limestone_brick_slab",
            () -> new SlabLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_SLAB = registerBlock("pink_limestone_brick_slab",
            () -> new SlabLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_SLAB = registerBlock("tan_limestone_brick_slab",
            () -> new SlabLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_SLAB_VERTICAL = registerBlock("dark_limestone_brick_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_SLAB_VERTICAL = registerBlock("light_limestone_brick_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIMESTONE_BRICK_SLAB_VERTICAL = registerBlock("limestone_brick_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_SLAB_VERTICAL = registerBlock("pink_limestone_brick_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_SLAB_VERTICAL = registerBlock("tan_limestone_brick_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_STAIRS = registerBlock("dark_limestone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.DARK_LIMESTONE_BRICKS.get().defaultBlockState(), BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_STAIRS = registerBlock("light_limestone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_LIMESTONE_BRICKS.get().defaultBlockState(), BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_STAIRS = registerBlock("pink_limestone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.PINK_LIMESTONE_BRICKS.get().defaultBlockState(), BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_STAIRS = registerBlock("tan_limestone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.TAN_LIMESTONE_BRICKS.get().defaultBlockState(), BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_WALL = registerBlock("dark_limestone_brick_wall",
            () -> new WallBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_WALL = registerBlock("light_limestone_brick_wall",
            () -> new WallBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_WALL = registerBlock("pink_limestone_brick_wall",
            () -> new WallBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_WALL = registerBlock("tan_limestone_brick_wall",
            () -> new WallBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_WINDOW = registerBlock("dark_limestone_brick_window",
            () -> new WindowBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_WINDOW = registerBlock("light_limestone_brick_window",
            () -> new WindowBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIMESTONE_BRICK_WINDOW = registerBlock("limestone_brick_window",
            () -> new WindowBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_WINDOW = registerBlock("pink_limestone_brick_window",
            () -> new WindowBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_WINDOW = registerBlock("tan_limestone_brick_window",
            () -> new WindowBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> DARK_LIMESTONE_BRICK_WINDOW_HALF = registerBlock("dark_limestone_brick_window_half",
            () -> new HalfWindowBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIGHT_LIMESTONE_BRICK_WINDOW_HALF = registerBlock("light_limestone_brick_window_half",
            () -> new HalfWindowBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> LIMESTONE_BRICK_WINDOW_HALF = registerBlock("limestone_brick_window_half",
            () -> new HalfWindowBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> PINK_LIMESTONE_BRICK_WINDOW_HALF = registerBlock("pink_limestone_brick_window_half",
            () -> new HalfWindowBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> TAN_LIMESTONE_BRICK_WINDOW_HALF = registerBlock("tan_limestone_brick_window_half",
            () -> new HalfWindowBlock(BlockProps.LIMESTONE_BRICK.get()));

    // -- MOSSY -- LIMESTONE -- BRICKS
    public static final RegistryObject<Block> MOSSY_DARK_LIMESTONE_BRICKS = registerBlock("mossy_dark_limestone_bricks",
            () -> new Block(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIGHT_LIMESTONE_BRICKS = registerBlock("mossy_light_limestone_bricks",
            () -> new Block(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_PINK_LIMESTONE_BRICKS = registerBlock("mossy_pink_limestone_bricks",
            () -> new Block(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_TAN_LIMESTONE_BRICKS = registerBlock("mossy_tan_limestone_bricks",
            () -> new Block(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_DARK_LIMESTONE_BRICK_ARCH = registerBlock("mossy_dark_limestone_brick_arch",
            () -> new ArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIGHT_LIMESTONE_BRICK_ARCH = registerBlock("mossy_light_limestone_brick_arch",
            () -> new ArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIMESTONE_BRICK_ARCH = registerBlock("mossy_limestone_brick_arch",
            () -> new ArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_PINK_LIMESTONE_BRICK_ARCH = registerBlock("mossy_pink_limestone_brick_arch",
            () -> new ArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_TAN_LIMESTONE_BRICK_ARCH = registerBlock("mossy_tan_limestone_brick_arch",
            () -> new ArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_DARK_LIMESTONE_BRICK_ARCH_HALF = registerBlock("mossy_dark_limestone_brick_arch_half",
            () -> new HalfArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIGHT_LIMESTONE_BRICK_ARCH_HALF = registerBlock("mossy_light_limestone_brick_arch_half",
            () -> new HalfArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIMESTONE_BRICK_ARCH_HALF = registerBlock("mossy_limestone_brick_arch_half",
            () -> new HalfArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_PINK_LIMESTONE_BRICK_ARCH_HALF = registerBlock("mossy_pink_limestone_brick_arch_half",
            () -> new HalfArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_TAN_LIMESTONE_BRICK_ARCH_HALF = registerBlock("mossy_tan_limestone_brick_arch_half",
            () -> new HalfArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_DARK_LIMESTONE_BRICK_ARCH_LARGE = registerBlock("mossy_dark_limestone_brick_arch_large",
            () -> new LargeArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIGHT_LIMESTONE_BRICK_ARCH_LARGE = registerBlock("mossy_light_limestone_brick_arch_large",
            () -> new LargeArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIMESTONE_BRICK_ARCH_LARGE = registerBlock("mossy_limestone_brick_arch_large",
            () -> new LargeArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_PINK_LIMESTONE_BRICK_ARCH_LARGE = registerBlock("mossy_pink_limestone_brick_arch_large",
            () -> new LargeArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_TAN_LIMESTONE_BRICK_ARCH_LARGE = registerBlock("mossy_tan_limestone_brick_arch_large",
            () -> new LargeArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_DARK_LIMESTONE_BRICK_ARCH_LARGE_HALF = registerBlock("mossy_dark_limestone_brick_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIGHT_LIMESTONE_BRICK_ARCH_LARGE_HALF = registerBlock("mossy_light_limestone_brick_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIMESTONE_BRICK_ARCH_LARGE_HALF = registerBlock("mossy_limestone_brick_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_PINK_LIMESTONE_BRICK_ARCH_LARGE_HALF = registerBlock("mossy_pink_limestone_brick_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_TAN_LIMESTONE_BRICK_ARCH_LARGE_HALF = registerBlock("mossy_tan_limestone_brick_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_DARK_LIMESTONE_BRICK_ARROWSLIT = registerBlock("mossy_dark_limestone_brick_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIGHT_LIMESTONE_BRICK_ARROWSLIT = registerBlock("mossy_light_limestone_brick_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIMESTONE_BRICK_ARROWSLIT = registerBlock("mossy_limestone_brick_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_PINK_LIMESTONE_BRICK_ARROWSLIT = registerBlock("mossy_pink_limestone_brick_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_TAN_LIMESTONE_BRICK_ARROWSLIT = registerBlock("mossy_tan_limestone_brick_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_DARK_LIMESTONE_BRICK_BALUSTRADE = registerBlock("mossy_dark_limestone_brick_balustrade",
            () -> new BalustradeBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIGHT_LIMESTONE_BRICK_BALUSTRADE = registerBlock("mossy_light_limestone_brick_balustrade",
            () -> new BalustradeBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIMESTONE_BRICK_BALUSTRADE = registerBlock("mossy_limestone_brick_balustrade",
            () -> new BalustradeBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_PINK_LIMESTONE_BRICK_BALUSTRADE = registerBlock("mossy_pink_limestone_brick_balustrade",
            () -> new BalustradeBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_TAN_LIMESTONE_BRICK_BALUSTRADE = registerBlock("mossy_tan_limestone_brick_balustrade",
            () -> new BalustradeBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_DARK_LIMESTONE_BRICK_CAPITAL = registerBlock("mossy_dark_limestone_brick_capital",
            () -> new CapitalBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIGHT_LIMESTONE_BRICK_CAPITAL = registerBlock("mossy_light_limestone_brick_capital",
            () -> new CapitalBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIMESTONE_BRICK_CAPITAL = registerBlock("mossy_limestone_brick_capital",
            () -> new CapitalBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_PINK_LIMESTONE_BRICK_CAPITAL = registerBlock("mossy_pink_limestone_brick_capital",
            () -> new CapitalBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_TAN_LIMESTONE_BRICK_CAPITAL = registerBlock("mossy_tan_limestone_brick_capital",
            () -> new CapitalBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_DARK_LIMESTONE_BRICK_CORNER = registerBlock("mossy_dark_limestone_brick_corner",
            () -> new CornerLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIGHT_LIMESTONE_BRICK_CORNER = registerBlock("mossy_light_limestone_brick_corner",
            () -> new CornerLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIMESTONE_BRICK_CORNER = registerBlock("mossy_limestone_brick_corner",
            () -> new CornerLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_PINK_LIMESTONE_BRICK_CORNER = registerBlock("mossy_pink_limestone_brick_corner",
            () -> new CornerLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_TAN_LIMESTONE_BRICK_CORNER = registerBlock("mossy_tan_limestone_brick_corner",
            () -> new CornerLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_DARK_LIMESTONE_BRICK_CORNER_SLAB = registerBlock("mossy_dark_limestone_brick_corner_slab",
            () -> new CornerSlabBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIGHT_LIMESTONE_BRICK_CORNER_SLAB = registerBlock("mossy_light_limestone_brick_corner_slab",
            () -> new CornerSlabBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIMESTONE_BRICK_CORNER_SLAB = registerBlock("mossy_limestone_brick_corner_slab",
            () -> new CornerSlabBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_PINK_LIMESTONE_BRICK_CORNER_SLAB = registerBlock("mossy_pink_limestone_brick_corner_slab",
            () -> new CornerSlabBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_TAN_LIMESTONE_BRICK_CORNER_SLAB = registerBlock("mossy_tan_limestone_brick_corner_slab",
            () -> new CornerSlabBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_DARK_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL = registerBlock("mossy_dark_limestone_brick_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIGHT_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL = registerBlock("mossy_light_limestone_brick_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL = registerBlock("mossy_limestone_brick_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_PINK_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL = registerBlock("mossy_pink_limestone_brick_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_TAN_LIMESTONE_BRICK_CORNER_SLAB_VERTICAL = registerBlock("mossy_tan_limestone_brick_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_DARK_LIMESTONE_BRICK_EIGHTH = registerBlock("mossy_dark_limestone_brick_eighth",
            () -> new EighthBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIGHT_LIMESTONE_BRICK_EIGHTH = registerBlock("mossy_light_limestone_brick_eighth",
            () -> new EighthBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIMESTONE_BRICK_EIGHTH = registerBlock("mossy_limestone_brick_eighth",
            () -> new EighthBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_PINK_LIMESTONE_BRICK_EIGHTH = registerBlock("mossy_pink_limestone_brick_eighth",
            () -> new EighthBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_TAN_LIMESTONE_BRICK_EIGHTH = registerBlock("mossy_tan_limestone_brick_eighth",
            () -> new EighthBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_DARK_LIMESTONE_BRICK_PILLAR = registerBlock("mossy_dark_limestone_brick_pillar",
            () -> new PillarLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIGHT_LIMESTONE_BRICK_PILLAR = registerBlock("mossy_light_limestone_brick_pillar",
            () -> new PillarLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIMESTONE_BRICK_PILLAR = registerBlock("mossy_limestone_brick_pillar",
            () -> new PillarLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_PINK_LIMESTONE_BRICK_PILLAR = registerBlock("mossy_pink_limestone_brick_pillar",
            () -> new PillarLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_TAN_LIMESTONE_BRICK_PILLAR = registerBlock("mossy_tan_limestone_brick_pillar",
            () -> new PillarLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_DARK_LIMESTONE_BRICK_QUARTER = registerBlock("mossy_dark_limestone_brick_quarter",
            () -> new QuarterLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIGHT_LIMESTONE_BRICK_QUARTER = registerBlock("mossy_light_limestone_brick_quarter",
            () -> new QuarterLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIMESTONE_BRICK_QUARTER = registerBlock("mossy_limestone_brick_quarter",
            () -> new QuarterLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_PINK_LIMESTONE_BRICK_QUARTER = registerBlock("mossy_pink_limestone_brick_quarter",
            () -> new QuarterLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_TAN_LIMESTONE_BRICK_QUARTER = registerBlock("mossy_tan_limestone_brick_quarter",
            () -> new QuarterLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_DARK_LIMESTONE_BRICK_QUARTER_VERTICAL = registerBlock("mossy_dark_limestone_brick_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIGHT_LIMESTONE_BRICK_QUARTER_VERTICAL = registerBlock("mossy_light_limestone_brick_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIMESTONE_BRICK_QUARTER_VERTICAL = registerBlock("mossy_limestone_brick_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_PINK_LIMESTONE_BRICK_QUARTER_VERTICAL = registerBlock("mossy_pink_limestone_brick_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_TAN_LIMESTONE_BRICK_QUARTER_VERTICAL = registerBlock("mossy_tan_limestone_brick_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_DARK_LIMESTONE_BRICK_SLAB = registerBlock("mossy_dark_limestone_brick_slab",
            () -> new SlabLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIGHT_LIMESTONE_BRICK_SLAB = registerBlock("mossy_light_limestone_brick_slab",
            () -> new SlabLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIMESTONE_BRICK_SLAB = registerBlock("mossy_limestone_brick_slab",
            () -> new SlabLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_PINK_LIMESTONE_BRICK_SLAB = registerBlock("mossy_pink_limestone_brick_slab",
            () -> new SlabLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_TAN_LIMESTONE_BRICK_SLAB = registerBlock("mossy_tan_limestone_brick_slab",
            () -> new SlabLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_DARK_LIMESTONE_BRICK_SLAB_VERTICAL = registerBlock("mossy_dark_limestone_brick_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIGHT_LIMESTONE_BRICK_SLAB_VERTICAL = registerBlock("mossy_light_limestone_brick_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIMESTONE_BRICK_SLAB_VERTICAL = registerBlock("mossy_limestone_brick_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_PINK_LIMESTONE_BRICK_SLAB_VERTICAL = registerBlock("mossy_pink_limestone_brick_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_TAN_LIMESTONE_BRICK_SLAB_VERTICAL = registerBlock("mossy_tan_limestone_brick_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_DARK_LIMESTONE_BRICK_STAIRS = registerBlock("mossy_dark_limestone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.MOSSY_DARK_LIMESTONE_BRICKS.get().defaultBlockState(), BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIGHT_LIMESTONE_BRICK_STAIRS = registerBlock("mossy_light_limestone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.MOSSY_LIGHT_LIMESTONE_BRICKS.get().defaultBlockState(), BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_PINK_LIMESTONE_BRICK_STAIRS = registerBlock("mossy_pink_limestone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.MOSSY_PINK_LIMESTONE_BRICKS.get().defaultBlockState(), BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_TAN_LIMESTONE_BRICK_STAIRS = registerBlock("mossy_tan_limestone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.MOSSY_TAN_LIMESTONE_BRICKS.get().defaultBlockState(), BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_DARK_LIMESTONE_BRICK_WALL = registerBlock("mossy_dark_limestone_brick_wall",
            () -> new WallBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIGHT_LIMESTONE_BRICK_WALL = registerBlock("mossy_light_limestone_brick_wall",
            () -> new WallBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_PINK_LIMESTONE_BRICK_WALL = registerBlock("mossy_pink_limestone_brick_wall",
            () -> new WallBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_TAN_LIMESTONE_BRICK_WALL = registerBlock("mossy_tan_limestone_brick_wall",
            () -> new WallBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_DARK_LIMESTONE_BRICK_WINDOW = registerBlock("mossy_dark_limestone_brick_window",
            () -> new WindowBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIGHT_LIMESTONE_BRICK_WINDOW = registerBlock("mossy_light_limestone_brick_window",
            () -> new WindowBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIMESTONE_BRICK_WINDOW = registerBlock("mossy_limestone_brick_window",
            () -> new WindowBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_PINK_LIMESTONE_BRICK_WINDOW = registerBlock("mossy_pink_limestone_brick_window",
            () -> new WindowBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_TAN_LIMESTONE_BRICK_WINDOW = registerBlock("mossy_tan_limestone_brick_window",
            () -> new WindowBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_DARK_LIMESTONE_BRICK_WINDOW_HALF = registerBlock("mossy_dark_limestone_brick_window_half",
            () -> new HalfWindowBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIGHT_LIMESTONE_BRICK_WINDOW_HALF = registerBlock("mossy_light_limestone_brick_window_half",
            () -> new HalfWindowBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_LIMESTONE_BRICK_WINDOW_HALF = registerBlock("mossy_limestone_brick_window_half",
            () -> new HalfWindowBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_PINK_LIMESTONE_BRICK_WINDOW_HALF = registerBlock("mossy_pink_limestone_brick_window_half",
            () -> new HalfWindowBlock(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> MOSSY_TAN_LIMESTONE_BRICK_WINDOW_HALF = registerBlock("mossy_tan_limestone_brick_window_half",
            () -> new HalfWindowBlock(BlockProps.LIMESTONE_BRICK.get()));


    // -- LIMESTONE -- CRACKED BRICKS
    public static final RegistryObject<Block> CRACKED_DARK_LIMESTONE_BRICKS = registerBlock("cracked_dark_limestone_bricks",
            () -> new Block(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> CRACKED_LIGHT_LIMESTONE_BRICKS = registerBlock("cracked_light_limestone_bricks",
            () -> new Block(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> CRACKED_PINK_LIMESTONE_BRICKS = registerBlock("cracked_pink_limestone_bricks",
            () -> new Block(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> CRACKED_TAN_LIMESTONE_BRICKS = registerBlock("cracked_tan_limestone_bricks",
            () -> new Block(BlockProps.LIMESTONE_BRICK.get()));

    // -- LIMESTONE -- CHISELED BRICKS
    public static final RegistryObject<Block> CHISELED_DARK_LIMESTONE_BRICKS = registerBlock("chiseled_dark_limestone_bricks",
            () -> new Block(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> CHISELED_LIGHT_LIMESTONE_BRICKS = registerBlock("chiseled_light_limestone_bricks",
            () -> new Block(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> CHISELED_PINK_LIMESTONE_BRICKS = registerBlock("chiseled_pink_limestone_bricks",
            () -> new Block(BlockProps.LIMESTONE_BRICK.get()));
    public static final RegistryObject<Block> CHISELED_TAN_LIMESTONE_BRICKS = registerBlock("chiseled_tan_limestone_bricks",
            () -> new Block(BlockProps.LIMESTONE_BRICK.get()));

    // -- LIMESTONE -- SMOOTH
    public static final RegistryObject<Block> SMOOTH_DARK_LIMESTONE = registerBlock("smooth_dark_limestone",
            () -> new Block(BlockProps.SMOOTH_LIMESTONE.get()));
    public static final RegistryObject<Block> SMOOTH_LIGHT_LIMESTONE = registerBlock("smooth_light_limestone",
            () -> new Block(BlockProps.SMOOTH_LIMESTONE.get()));
    public static final RegistryObject<Block> SMOOTH_PINK_LIMESTONE = registerBlock("smooth_pink_limestone",
            () -> new Block(BlockProps.SMOOTH_LIMESTONE.get()));
    public static final RegistryObject<Block> SMOOTH_TAN_LIMESTONE = registerBlock("smooth_tan_limestone",
            () -> new Block(BlockProps.SMOOTH_LIMESTONE.get()));
    public static final RegistryObject<Block> SMOOTH_DARK_LIMESTONE_SLAB = registerBlock("smooth_dark_limestone_slab",
            () -> new SlabLayerBlock(BlockProps.SMOOTH_LIMESTONE.get()));
    public static final RegistryObject<Block> SMOOTH_LIGHT_LIMESTONE_SLAB = registerBlock("smooth_light_limestone_slab",
            () -> new SlabLayerBlock(BlockProps.SMOOTH_LIMESTONE.get()));
    public static final RegistryObject<Block> SMOOTH_LIMESTONE_SLAB = registerBlock("smooth_limestone_slab",
            () -> new SlabLayerBlock(BlockProps.SMOOTH_LIMESTONE.get()));
    public static final RegistryObject<Block> SMOOTH_PINK_LIMESTONE_SLAB = registerBlock("smooth_pink_limestone_slab",
            () -> new SlabLayerBlock(BlockProps.SMOOTH_LIMESTONE.get()));
    public static final RegistryObject<Block> SMOOTH_TAN_LIMESTONE_SLAB = registerBlock("smooth_tan_limestone_slab",
            () -> new SlabLayerBlock(BlockProps.SMOOTH_LIMESTONE.get()));


    // -- MARBLE
    public static final RegistryObject<Block> BLACK_MARBLE = registerBlock("black_marble",
            () -> new Block(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> GRAY_MARBLE = registerBlock("gray_marble",
            () -> new Block(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> PINK_MARBLE = registerBlock("pink_marble",
            () -> new Block(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> RED_MARBLE = registerBlock("red_marble",
            () -> new Block(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> WHITE_MARBLE = registerBlock("white_marble",
            () -> new Block(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> BLACK_MARBLE_ARCH = registerBlock("black_marble_arch",
            () -> new ArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> GRAY_MARBLE_ARCH = registerBlock("gray_marble_arch",
            () -> new ArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> PINK_MARBLE_ARCH = registerBlock("pink_marble_arch",
            () -> new ArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> RED_MARBLE_ARCH = registerBlock("red_marble_arch",
            () -> new ArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> WHITE_MARBLE_ARCH = registerBlock("white_marble_arch",
            () -> new ArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> BLACK_MARBLE_ARCH_HALF = registerBlock("black_marble_arch_half",
            () -> new HalfArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> GRAY_MARBLE_ARCH_HALF = registerBlock("gray_marble_arch_half",
            () -> new HalfArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> PINK_MARBLE_ARCH_HALF = registerBlock("pink_marble_arch_half",
            () -> new HalfArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> RED_MARBLE_ARCH_HALF = registerBlock("red_marble_arch_half",
            () -> new HalfArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> WHITE_MARBLE_ARCH_HALF = registerBlock("white_marble_arch_half",
            () -> new HalfArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> BLACK_MARBLE_ARCH_LARGE = registerBlock("black_marble_arch_large",
            () -> new LargeArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> GRAY_MARBLE_ARCH_LARGE = registerBlock("gray_marble_arch_large",
            () -> new LargeArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> PINK_MARBLE_ARCH_LARGE = registerBlock("pink_marble_arch_large",
            () -> new LargeArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> RED_MARBLE_ARCH_LARGE = registerBlock("red_marble_arch_large",
            () -> new LargeArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> WHITE_MARBLE_ARCH_LARGE = registerBlock("white_marble_arch_large",
            () -> new LargeArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> BLACK_MARBLE_ARCH_LARGE_HALF = registerBlock("black_marble_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> GRAY_MARBLE_ARCH_LARGE_HALF = registerBlock("gray_marble_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> PINK_MARBLE_ARCH_LARGE_HALF = registerBlock("pink_marble_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> RED_MARBLE_ARCH_LARGE_HALF = registerBlock("red_marble_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> WHITE_MARBLE_ARCH_LARGE_HALF = registerBlock("white_marble_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> BLACK_MARBLE_ARROWSLIT = registerBlock("black_marble_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> GRAY_MARBLE_ARROWSLIT = registerBlock("gray_marble_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> PINK_MARBLE_ARROWSLIT = registerBlock("pink_marble_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> RED_MARBLE_ARROWSLIT = registerBlock("red_marble_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> WHITE_MARBLE_ARROWSLIT = registerBlock("white_marble_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> BLACK_MARBLE_BALUSTRADE = registerBlock("black_marble_balustrade",
            () -> new BalustradeBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> GRAY_MARBLE_BALUSTRADE = registerBlock("gray_marble_balustrade",
            () -> new BalustradeBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> PINK_MARBLE_BALUSTRADE = registerBlock("pink_marble_balustrade",
            () -> new BalustradeBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> RED_MARBLE_BALUSTRADE = registerBlock("red_marble_balustrade",
            () -> new BalustradeBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> WHITE_MARBLE_BALUSTRADE = registerBlock("white_marble_balustrade",
            () -> new BalustradeBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> BLACK_MARBLE_CAPITAL = registerBlock("black_marble_capital",
            () -> new CapitalBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> GRAY_MARBLE_CAPITAL = registerBlock("gray_marble_capital",
            () -> new CapitalBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> PINK_MARBLE_CAPITAL = registerBlock("pink_marble_capital",
            () -> new CapitalBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> RED_MARBLE_CAPITAL = registerBlock("red_marble_capital",
            () -> new CapitalBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> WHITE_MARBLE_CAPITAL = registerBlock("white_marble_capital",
            () -> new CapitalBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> BLACK_MARBLE_CORNER = registerBlock("black_marble_corner",
            () -> new CornerLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> GRAY_MARBLE_CORNER = registerBlock("gray_marble_corner",
            () -> new CornerLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> PINK_MARBLE_CORNER = registerBlock("pink_marble_corner",
            () -> new CornerLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> RED_MARBLE_CORNER = registerBlock("red_marble_corner",
            () -> new CornerLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> WHITE_MARBLE_CORNER = registerBlock("white_marble_corner",
            () -> new CornerLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> BLACK_MARBLE_CORNER_SLAB = registerBlock("black_marble_corner_slab",
            () -> new CornerSlabBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> GRAY_MARBLE_CORNER_SLAB = registerBlock("gray_marble_corner_slab",
            () -> new CornerSlabBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> PINK_MARBLE_CORNER_SLAB = registerBlock("pink_marble_corner_slab",
            () -> new CornerSlabBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> RED_MARBLE_CORNER_SLAB = registerBlock("red_marble_corner_slab",
            () -> new CornerSlabBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> WHITE_MARBLE_CORNER_SLAB = registerBlock("white_marble_corner_slab",
            () -> new CornerSlabBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> BLACK_MARBLE_CORNER_SLAB_VERTICAL = registerBlock("black_marble_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> GRAY_MARBLE_CORNER_SLAB_VERTICAL = registerBlock("gray_marble_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> PINK_MARBLE_CORNER_SLAB_VERTICAL = registerBlock("pink_marble_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> RED_MARBLE_CORNER_SLAB_VERTICAL = registerBlock("red_marble_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> WHITE_MARBLE_CORNER_SLAB_VERTICAL = registerBlock("white_marble_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> BLACK_MARBLE_EIGHTH = registerBlock("black_marble_eighth",
            () -> new EighthBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> GRAY_MARBLE_EIGHTH = registerBlock("gray_marble_eighth",
            () -> new EighthBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> PINK_MARBLE_EIGHTH = registerBlock("pink_marble_eighth",
            () -> new EighthBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> RED_MARBLE_EIGHTH = registerBlock("red_marble_eighth",
            () -> new EighthBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> WHITE_MARBLE_EIGHTH = registerBlock("white_marble_eighth",
            () -> new EighthBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> BLACK_MARBLE_PILLAR = registerBlock("black_marble_pillar",
            () -> new PillarLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> GRAY_MARBLE_PILLAR = registerBlock("gray_marble_pillar",
            () -> new PillarLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> PINK_MARBLE_PILLAR = registerBlock("pink_marble_pillar",
            () -> new PillarLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> RED_MARBLE_PILLAR = registerBlock("red_marble_pillar",
            () -> new PillarLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> WHITE_MARBLE_PILLAR = registerBlock("white_marble_pillar",
            () -> new PillarLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> BLACK_MARBLE_QUARTER = registerBlock("black_marble_quarter",
            () -> new QuarterLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> GRAY_MARBLE_QUARTER = registerBlock("gray_marble_quarter",
            () -> new QuarterLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> PINK_MARBLE_QUARTER = registerBlock("pink_marble_quarter",
            () -> new QuarterLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> RED_MARBLE_QUARTER = registerBlock("red_marble_quarter",
            () -> new QuarterLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> WHITE_MARBLE_QUARTER = registerBlock("white_marble_quarter",
            () -> new QuarterLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> BLACK_MARBLE_QUARTER_VERTICAL = registerBlock("black_marble_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> GRAY_MARBLE_QUARTER_VERTICAL = registerBlock("gray_marble_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> PINK_MARBLE_QUARTER_VERTICAL = registerBlock("pink_marble_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> RED_MARBLE_QUARTER_VERTICAL = registerBlock("red_marble_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> WHITE_MARBLE_QUARTER_VERTICAL = registerBlock("white_marble_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> BLACK_MARBLE_SLAB = registerBlock("black_marble_slab",
            () -> new SlabLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> GRAY_MARBLE_SLAB = registerBlock("gray_marble_slab",
            () -> new SlabLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> PINK_MARBLE_SLAB = registerBlock("pink_marble_slab",
            () -> new SlabLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> RED_MARBLE_SLAB = registerBlock("red_marble_slab",
            () -> new SlabLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> WHITE_MARBLE_SLAB = registerBlock("white_marble_slab",
            () -> new SlabLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> BLACK_MARBLE_SLAB_VERTICAL = registerBlock("black_marble_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> GRAY_MARBLE_SLAB_VERTICAL = registerBlock("gray_marble_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> PINK_MARBLE_SLAB_VERTICAL = registerBlock("pink_marble_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> RED_MARBLE_SLAB_VERTICAL = registerBlock("red_marble_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> WHITE_MARBLE_SLAB_VERTICAL = registerBlock("white_marble_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> BLACK_MARBLE_STAIRS = registerBlock("black_marble_stairs",
            () -> new StairBlock(() -> ModBlocks.BLACK_MARBLE.get().defaultBlockState(), BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> GRAY_MARBLE_STAIRS = registerBlock("gray_marble_stairs",
            () -> new StairBlock(() -> ModBlocks.GRAY_MARBLE.get().defaultBlockState(), BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> PINK_MARBLE_STAIRS = registerBlock("pink_marble_stairs",
            () -> new StairBlock(() -> ModBlocks.PINK_MARBLE.get().defaultBlockState(), BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> RED_MARBLE_STAIRS = registerBlock("red_marble_stairs",
            () -> new StairBlock(() -> ModBlocks.RED_MARBLE.get().defaultBlockState(), BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> WHITE_MARBLE_STAIRS = registerBlock("white_marble_stairs",
            () -> new StairBlock(() -> ModBlocks.WHITE_MARBLE.get().defaultBlockState(), BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> BLACK_MARBLE_WALL = registerBlock("black_marble_wall",
            () -> new WallBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> GRAY_MARBLE_WALL = registerBlock("gray_marble_wall",
            () -> new WallBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> PINK_MARBLE_WALL = registerBlock("pink_marble_wall",
            () -> new WallBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> RED_MARBLE_WALL = registerBlock("red_marble_wall",
            () -> new WallBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> WHITE_MARBLE_WALL = registerBlock("white_marble_wall",
            () -> new WallBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> BLACK_MARBLE_WINDOW = registerBlock("black_marble_window",
            () -> new WindowBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> GRAY_MARBLE_WINDOW = registerBlock("gray_marble_window",
            () -> new WindowBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> PINK_MARBLE_WINDOW = registerBlock("pink_marble_window",
            () -> new WindowBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> RED_MARBLE_WINDOW = registerBlock("red_marble_window",
            () -> new WindowBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> WHITE_MARBLE_WINDOW = registerBlock("white_marble_window",
            () -> new WindowBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> BLACK_MARBLE_WINDOW_HALF = registerBlock("black_marble_window_half",
            () -> new HalfWindowBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> GRAY_MARBLE_WINDOW_HALF = registerBlock("gray_marble_window_half",
            () -> new HalfWindowBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> PINK_MARBLE_WINDOW_HALF = registerBlock("pink_marble_window_half",
            () -> new HalfWindowBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> RED_MARBLE_WINDOW_HALF = registerBlock("red_marble_window_half",
            () -> new HalfWindowBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> WHITE_MARBLE_WINDOW_HALF = registerBlock("white_marble_window_half",
            () -> new HalfWindowBlock(BlockProps.MARBLE.get()));


    // -- MARBLE -- POLISHED
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE = registerBlock("polished_black_marble",
            () -> new Block(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE = registerBlock("polished_gray_marble",
            () -> new Block(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE = registerBlock("polished_pink_marble",
            () -> new Block(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_RED_MARBLE = registerBlock("polished_red_marble",
            () -> new Block(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE = registerBlock("polished_white_marble",
            () -> new Block(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_ARCH = registerBlock("polished_black_marble_arch",
            () -> new ArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_ARCH = registerBlock("polished_gray_marble_arch",
            () -> new ArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_ARCH = registerBlock("polished_pink_marble_arch",
            () -> new ArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_ARCH = registerBlock("polished_red_marble_arch",
            () -> new ArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_ARCH = registerBlock("polished_white_marble_arch",
            () -> new ArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_ARCH_HALF = registerBlock("polished_black_marble_arch_half",
            () -> new HalfArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_ARCH_HALF = registerBlock("polished_gray_marble_arch_half",
            () -> new HalfArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_ARCH_HALF = registerBlock("polished_pink_marble_arch_half",
            () -> new HalfArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_ARCH_HALF = registerBlock("polished_red_marble_arch_half",
            () -> new HalfArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_ARCH_HALF = registerBlock("polished_white_marble_arch_half",
            () -> new HalfArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_ARCH_LARGE = registerBlock("polished_black_marble_arch_large",
            () -> new LargeArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_ARCH_LARGE = registerBlock("polished_gray_marble_arch_large",
            () -> new LargeArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_ARCH_LARGE = registerBlock("polished_pink_marble_arch_large",
            () -> new LargeArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_ARCH_LARGE = registerBlock("polished_red_marble_arch_large",
            () -> new LargeArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_ARCH_LARGE = registerBlock("polished_white_marble_arch_large",
            () -> new LargeArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_ARCH_LARGE_HALF = registerBlock("polished_black_marble_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_ARCH_LARGE_HALF = registerBlock("polished_gray_marble_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_ARCH_LARGE_HALF = registerBlock("polished_pink_marble_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_ARCH_LARGE_HALF = registerBlock("polished_red_marble_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_ARCH_LARGE_HALF = registerBlock("polished_white_marble_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_ARROWSLIT = registerBlock("polished_black_marble_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_ARROWSLIT = registerBlock("polished_gray_marble_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_ARROWSLIT = registerBlock("polished_pink_marble_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_ARROWSLIT = registerBlock("polished_red_marble_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_ARROWSLIT = registerBlock("polished_white_marble_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_BALUSTRADE = registerBlock("polished_black_marble_balustrade",
            () -> new BalustradeBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_BALUSTRADE = registerBlock("polished_gray_marble_balustrade",
            () -> new BalustradeBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_BALUSTRADE = registerBlock("polished_pink_marble_balustrade",
            () -> new BalustradeBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_BALUSTRADE = registerBlock("polished_red_marble_balustrade",
            () -> new BalustradeBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_BALUSTRADE = registerBlock("polished_white_marble_balustrade",
            () -> new BalustradeBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_CAPITAL = registerBlock("polished_black_marble_capital",
            () -> new CapitalBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_CAPITAL = registerBlock("polished_gray_marble_capital",
            () -> new CapitalBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_CAPITAL = registerBlock("polished_pink_marble_capital",
            () -> new CapitalBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_CAPITAL = registerBlock("polished_red_marble_capital",
            () -> new CapitalBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_CAPITAL = registerBlock("polished_white_marble_capital",
            () -> new CapitalBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_CORNER = registerBlock("polished_black_marble_corner",
            () -> new CornerLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_CORNER = registerBlock("polished_gray_marble_corner",
            () -> new CornerLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_CORNER = registerBlock("polished_pink_marble_corner",
            () -> new CornerLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_CORNER = registerBlock("polished_red_marble_corner",
            () -> new CornerLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_CORNER = registerBlock("polished_white_marble_corner",
            () -> new CornerLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_CORNER_SLAB = registerBlock("polished_black_marble_corner_slab",
            () -> new CornerSlabBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_CORNER_SLAB = registerBlock("polished_gray_marble_corner_slab",
            () -> new CornerSlabBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_CORNER_SLAB = registerBlock("polished_pink_marble_corner_slab",
            () -> new CornerSlabBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_CORNER_SLAB = registerBlock("polished_red_marble_corner_slab",
            () -> new CornerSlabBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_CORNER_SLAB = registerBlock("polished_white_marble_corner_slab",
            () -> new CornerSlabBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_CORNER_SLAB_VERTICAL = registerBlock("polished_black_marble_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_CORNER_SLAB_VERTICAL = registerBlock("polished_gray_marble_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_CORNER_SLAB_VERTICAL = registerBlock("polished_pink_marble_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_CORNER_SLAB_VERTICAL = registerBlock("polished_red_marble_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_CORNER_SLAB_VERTICAL = registerBlock("polished_white_marble_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_EIGHTH = registerBlock("polished_black_marble_eighth",
            () -> new EighthBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_EIGHTH = registerBlock("polished_gray_marble_eighth",
            () -> new EighthBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_EIGHTH = registerBlock("polished_pink_marble_eighth",
            () -> new EighthBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_EIGHTH = registerBlock("polished_red_marble_eighth",
            () -> new EighthBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_EIGHTH = registerBlock("polished_white_marble_eighth",
            () -> new EighthBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_PILLAR = registerBlock("polished_black_marble_pillar",
            () -> new PillarLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_PILLAR = registerBlock("polished_gray_marble_pillar",
            () -> new PillarLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_PILLAR = registerBlock("polished_pink_marble_pillar",
            () -> new PillarLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_PILLAR = registerBlock("polished_red_marble_pillar",
            () -> new PillarLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_PILLAR = registerBlock("polished_white_marble_pillar",
            () -> new PillarLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_QUARTER = registerBlock("polished_black_marble_quarter",
            () -> new QuarterLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_QUARTER = registerBlock("polished_gray_marble_quarter",
            () -> new QuarterLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_QUARTER = registerBlock("polished_pink_marble_quarter",
            () -> new QuarterLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_QUARTER = registerBlock("polished_red_marble_quarter",
            () -> new QuarterLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_QUARTER = registerBlock("polished_white_marble_quarter",
            () -> new QuarterLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_QUARTER_VERTICAL = registerBlock("polished_black_marble_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_QUARTER_VERTICAL = registerBlock("polished_gray_marble_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_QUARTER_VERTICAL = registerBlock("polished_pink_marble_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_QUARTER_VERTICAL = registerBlock("polished_red_marble_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_QUARTER_VERTICAL = registerBlock("polished_white_marble_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_SLAB = registerBlock("polished_black_marble_slab",
            () -> new SlabLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_SLAB = registerBlock("polished_gray_marble_slab",
            () -> new SlabLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_SLAB = registerBlock("polished_pink_marble_slab",
            () -> new SlabLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_SLAB = registerBlock("polished_red_marble_slab",
            () -> new SlabLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_SLAB = registerBlock("polished_white_marble_slab",
            () -> new SlabLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_SLAB_VERTICAL = registerBlock("polished_black_marble_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_SLAB_VERTICAL = registerBlock("polished_gray_marble_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_SLAB_VERTICAL = registerBlock("polished_pink_marble_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_SLAB_VERTICAL = registerBlock("polished_red_marble_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_SLAB_VERTICAL = registerBlock("polished_white_marble_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_STAIRS = registerBlock("polished_black_marble_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_BLACK_MARBLE.get().defaultBlockState(), BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_STAIRS = registerBlock("polished_gray_marble_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_GRAY_MARBLE.get().defaultBlockState(), BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_STAIRS = registerBlock("polished_pink_marble_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_PINK_MARBLE.get().defaultBlockState(), BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_STAIRS = registerBlock("polished_red_marble_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_RED_MARBLE.get().defaultBlockState(), BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_STAIRS = registerBlock("polished_white_marble_stairs",
            () -> new StairBlock(() -> ModBlocks.POLISHED_WHITE_MARBLE.get().defaultBlockState(), BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_WALL = registerBlock("polished_black_marble_wall",
            () -> new WallBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_WALL = registerBlock("polished_gray_marble_wall",
            () -> new WallBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_WALL = registerBlock("polished_pink_marble_wall",
            () -> new WallBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_WALL = registerBlock("polished_red_marble_wall",
            () -> new WallBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_WALL = registerBlock("polished_white_marble_wall",
            () -> new WallBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_WINDOW = registerBlock("polished_black_marble_window",
            () -> new WindowBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_WINDOW = registerBlock("polished_gray_marble_window",
            () -> new WindowBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_WINDOW = registerBlock("polished_pink_marble_window",
            () -> new WindowBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_WINDOW = registerBlock("polished_red_marble_window",
            () -> new WindowBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_WINDOW = registerBlock("polished_white_marble_window",
            () -> new WindowBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_BLACK_MARBLE_WINDOW_HALF = registerBlock("polished_black_marble_window_half",
            () -> new HalfWindowBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_GRAY_MARBLE_WINDOW_HALF = registerBlock("polished_gray_marble_window_half",
            () -> new HalfWindowBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_PINK_MARBLE_WINDOW_HALF = registerBlock("polished_pink_marble_window_half",
            () -> new HalfWindowBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_RED_MARBLE_WINDOW_HALF = registerBlock("polished_red_marble_window_half",
            () -> new HalfWindowBlock(BlockProps.MARBLE.get()));
    public static final RegistryObject<Block> POLISHED_WHITE_MARBLE_WINDOW_HALF = registerBlock("polished_white_marble_window_half",
            () -> new HalfWindowBlock(BlockProps.MARBLE.get()));


    // -- SANDSTONE
    public static final RegistryObject<Block> BROWN_SANDSTONE = registerBlock("brown_sandstone",
            () -> new Block(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> ORANGE_SANDSTONE = registerBlock("orange_sandstone",
            () -> new Block(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> BROWN_SANDSTONE_ARCH = registerBlock("brown_sandstone_arch",
            () -> new ArchBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_ARCH = registerBlock("orange_sandstone_arch",
            () -> new ArchBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> RED_SANDSTONE_ARCH = registerBlock("red_sandstone_arch",
            () -> new ArchBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> SANDSTONE_ARCH = registerBlock("sandstone_arch",
            () -> new ArchBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> BROWN_SANDSTONE_ARCH_HALF = registerBlock("brown_sandstone_arch_half",
            () -> new HalfArchBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_ARCH_HALF = registerBlock("orange_sandstone_arch_half",
            () -> new HalfArchBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> RED_SANDSTONE_ARCH_HALF = registerBlock("red_sandstone_arch_half",
            () -> new HalfArchBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> SANDSTONE_ARCH_HALF = registerBlock("sandstone_arch_half",
            () -> new HalfArchBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> BROWN_SANDSTONE_ARCH_LARGE = registerBlock("brown_sandstone_arch_large",
            () -> new LargeArchBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_ARCH_LARGE = registerBlock("orange_sandstone_arch_large",
            () -> new LargeArchBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> RED_SANDSTONE_ARCH_LARGE = registerBlock("red_sandstone_arch_large",
            () -> new LargeArchBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> SANDSTONE_ARCH_LARGE = registerBlock("sandstone_arch_large",
            () -> new LargeArchBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> BROWN_SANDSTONE_ARCH_LARGE_HALF = registerBlock("brown_sandstone_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_ARCH_LARGE_HALF = registerBlock("orange_sandstone_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> RED_SANDSTONE_ARCH_LARGE_HALF = registerBlock("red_sandstone_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> SANDSTONE_ARCH_LARGE_HALF = registerBlock("sandstone_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> BROWN_SANDSTONE_ARROWSLIT = registerBlock("brown_sandstone_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_ARROWSLIT = registerBlock("orange_sandstone_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> RED_SANDSTONE_ARROWSLIT = registerBlock("red_sandstone_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> SANDSTONE_ARROWSLIT = registerBlock("sandstone_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> BROWN_SANDSTONE_BALUSTRADE = registerBlock("brown_sandstone_balustrade",
            () -> new BalustradeBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_BALUSTRADE = registerBlock("orange_sandstone_balustrade",
            () -> new BalustradeBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> RED_SANDSTONE_BALUSTRADE = registerBlock("red_sandstone_balustrade",
            () -> new BalustradeBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> SANDSTONE_BALUSTRADE = registerBlock("sandstone_balustrade",
            () -> new BalustradeBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> BROWN_SANDSTONE_CAPITAL = registerBlock("brown_sandstone_capital",
            () -> new CapitalBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_CAPITAL = registerBlock("orange_sandstone_capital",
            () -> new CapitalBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> RED_SANDSTONE_CAPITAL = registerBlock("red_sandstone_capital",
            () -> new CapitalBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> SANDSTONE_CAPITAL = registerBlock("sandstone_capital",
            () -> new CapitalBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> BROWN_SANDSTONE_CORNER = registerBlock("brown_sandstone_corner",
            () -> new CornerLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_CORNER = registerBlock("orange_sandstone_corner",
            () -> new CornerLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> RED_SANDSTONE_CORNER = registerBlock("red_sandstone_corner",
            () -> new CornerLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> SANDSTONE_CORNER = registerBlock("sandstone_corner",
            () -> new CornerLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> BROWN_SANDSTONE_CORNER_SLAB = registerBlock("brown_sandstone_corner_slab",
            () -> new CornerSlabBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_CORNER_SLAB = registerBlock("orange_sandstone_corner_slab",
            () -> new CornerSlabBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> RED_SANDSTONE_CORNER_SLAB = registerBlock("red_sandstone_corner_slab",
            () -> new CornerSlabBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> SANDSTONE_CORNER_SLAB = registerBlock("sandstone_corner_slab",
            () -> new CornerSlabBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> BROWN_SANDSTONE_CORNER_SLAB_VERTICAL = registerBlock("brown_sandstone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_CORNER_SLAB_VERTICAL = registerBlock("orange_sandstone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> RED_SANDSTONE_CORNER_SLAB_VERTICAL = registerBlock("red_sandstone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> SANDSTONE_CORNER_SLAB_VERTICAL = registerBlock("sandstone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> BROWN_SANDSTONE_EIGHTH = registerBlock("brown_sandstone_eighth",
            () -> new EighthBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_EIGHTH = registerBlock("orange_sandstone_eighth",
            () -> new EighthBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> RED_SANDSTONE_EIGHTH = registerBlock("red_sandstone_eighth",
            () -> new EighthBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> SANDSTONE_EIGHTH = registerBlock("sandstone_eighth",
            () -> new EighthBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> BROWN_SANDSTONE_PILLAR = registerBlock("brown_sandstone_pillar",
            () -> new PillarLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_PILLAR = registerBlock("orange_sandstone_pillar",
            () -> new PillarLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> RED_SANDSTONE_PILLAR = registerBlock("red_sandstone_pillar",
            () -> new PillarLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> SANDSTONE_PILLAR = registerBlock("sandstone_pillar",
            () -> new PillarLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> BROWN_SANDSTONE_QUARTER = registerBlock("brown_sandstone_quarter",
            () -> new QuarterLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_QUARTER = registerBlock("orange_sandstone_quarter",
            () -> new QuarterLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> RED_SANDSTONE_QUARTER = registerBlock("red_sandstone_quarter",
            () -> new QuarterLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> SANDSTONE_QUARTER = registerBlock("sandstone_quarter",
            () -> new QuarterLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> BROWN_SANDSTONE_QUARTER_VERTICAL = registerBlock("brown_sandstone_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_QUARTER_VERTICAL = registerBlock("orange_sandstone_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> RED_SANDSTONE_QUARTER_VERTICAL = registerBlock("red_sandstone_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> SANDSTONE_QUARTER_VERTICAL = registerBlock("sandstone_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> BROWN_SANDSTONE_SLAB = registerBlock("brown_sandstone_slab",
            () -> new SlabLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_SLAB = registerBlock("orange_sandstone_slab",
            () -> new SlabLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> RED_SANDSTONE_SLAB = registerBlock("red_sandstone_slab",
            () -> new SlabLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> SANDSTONE_SLAB = registerBlock("sandstone_slab",
            () -> new SlabLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> BROWN_SANDSTONE_SLAB_VERTICAL = registerBlock("brown_sandstone_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_SLAB_VERTICAL = registerBlock("orange_sandstone_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> RED_SANDSTONE_SLAB_VERTICAL = registerBlock("red_sandstone_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> SANDSTONE_SLAB_VERTICAL = registerBlock("sandstone_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> BROWN_SANDSTONE_STAIRS = registerBlock("brown_sandstone_stairs",
            () -> new StairBlock(() -> ModBlocks.BROWN_SANDSTONE.get().defaultBlockState(), BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_STAIRS = registerBlock("orange_sandstone_stairs",
            () -> new StairBlock(() -> ModBlocks.ORANGE_SANDSTONE.get().defaultBlockState(), BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> BROWN_SANDSTONE_WALL = registerBlock("brown_sandstone_wall",
            () -> new WallBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_WALL = registerBlock("orange_sandstone_wall",
            () -> new WallBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> BROWN_SANDSTONE_WINDOW = registerBlock("brown_sandstone_window",
            () -> new WindowBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_WINDOW = registerBlock("orange_sandstone_window",
            () -> new WindowBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> RED_SANDSTONE_WINDOW = registerBlock("red_sandstone_window",
            () -> new WindowBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> SANDSTONE_WINDOW = registerBlock("sandstone_window",
            () -> new WindowBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> BROWN_SANDSTONE_WINDOW_HALF = registerBlock("brown_sandstone_window_half",
            () -> new HalfWindowBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> ORANGE_SANDSTONE_WINDOW_HALF = registerBlock("orange_sandstone_window_half",
            () -> new HalfWindowBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> RED_SANDSTONE_WINDOW_HALF = registerBlock("red_sandstone_window_half",
            () -> new HalfWindowBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> SANDSTONE_WINDOW_HALF = registerBlock("sandstone_window_half",
            () -> new HalfWindowBlock(BlockProps.SANDSTONE.get()));


    // -- SANDSTONE -- CHISELED
    public static final RegistryObject<Block> CHISELED_BROWN_SANDSTONE = registerBlock("chiseled_brown_sandstone",
            () -> new Block(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CHISELED_ORANGE_SANDSTONE = registerBlock("chiseled_orange_sandstone",
            () -> new Block(BlockProps.SANDSTONE.get()));

    // -- SANDSTONE -- CUT
    public static final RegistryObject<Block> CUT_BROWN_SANDSTONE = registerBlock("cut_brown_sandstone",
            () -> new Block(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_ORANGE_SANDSTONE = registerBlock("cut_orange_sandstone",
            () -> new Block(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_BROWN_SANDSTONE_ARCH = registerBlock("cut_brown_sandstone_arch",
            () -> new ArchBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_ORANGE_SANDSTONE_ARCH = registerBlock("cut_orange_sandstone_arch",
            () -> new ArchBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_ARCH = registerBlock("cut_red_sandstone_arch",
            () -> new ArchBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_SANDSTONE_ARCH = registerBlock("cut_sandstone_arch",
            () -> new ArchBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_BROWN_SANDSTONE_ARCH_HALF = registerBlock("cut_brown_sandstone_arch_half",
            () -> new HalfArchBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_ORANGE_SANDSTONE_ARCH_HALF = registerBlock("cut_orange_sandstone_arch_half",
            () -> new HalfArchBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_ARCH_HALF = registerBlock("cut_red_sandstone_arch_half",
            () -> new HalfArchBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_SANDSTONE_ARCH_HALF = registerBlock("cut_sandstone_arch_half",
            () -> new HalfArchBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_BROWN_SANDSTONE_ARCH_LARGE = registerBlock("cut_brown_sandstone_arch_large",
            () -> new LargeArchBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_ORANGE_SANDSTONE_ARCH_LARGE = registerBlock("cut_orange_sandstone_arch_large",
            () -> new LargeArchBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_ARCH_LARGE = registerBlock("cut_red_sandstone_arch_large",
            () -> new LargeArchBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_SANDSTONE_ARCH_LARGE = registerBlock("cut_sandstone_arch_large",
            () -> new LargeArchBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_BROWN_SANDSTONE_ARCH_LARGE_HALF = registerBlock("cut_brown_sandstone_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_ORANGE_SANDSTONE_ARCH_LARGE_HALF = registerBlock("cut_orange_sandstone_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_ARCH_LARGE_HALF = registerBlock("cut_red_sandstone_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_SANDSTONE_ARCH_LARGE_HALF = registerBlock("cut_sandstone_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_BROWN_SANDSTONE_ARROWSLIT = registerBlock("cut_brown_sandstone_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_ORANGE_SANDSTONE_ARROWSLIT = registerBlock("cut_orange_sandstone_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_ARROWSLIT = registerBlock("cut_red_sandstone_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_SANDSTONE_ARROWSLIT = registerBlock("cut_sandstone_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_BROWN_SANDSTONE_BALUSTRADE = registerBlock("cut_brown_sandstone_balustrade",
            () -> new BalustradeBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_ORANGE_SANDSTONE_BALUSTRADE = registerBlock("cut_orange_sandstone_balustrade",
            () -> new BalustradeBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_BALUSTRADE = registerBlock("cut_red_sandstone_balustrade",
            () -> new BalustradeBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_SANDSTONE_BALUSTRADE = registerBlock("cut_sandstone_balustrade",
            () -> new BalustradeBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_BROWN_SANDSTONE_CAPITAL = registerBlock("cut_brown_sandstone_capital",
            () -> new CapitalBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_ORANGE_SANDSTONE_CAPITAL = registerBlock("cut_orange_sandstone_capital",
            () -> new CapitalBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_CAPITAL = registerBlock("cut_red_sandstone_capital",
            () -> new CapitalBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_SANDSTONE_CAPITAL = registerBlock("cut_sandstone_capital",
            () -> new CapitalBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_BROWN_SANDSTONE_CORNER = registerBlock("cut_brown_sandstone_corner",
            () -> new CornerLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_ORANGE_SANDSTONE_CORNER = registerBlock("cut_orange_sandstone_corner",
            () -> new CornerLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_CORNER = registerBlock("cut_red_sandstone_corner",
            () -> new CornerLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_SANDSTONE_CORNER = registerBlock("cut_sandstone_corner",
            () -> new CornerLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_BROWN_SANDSTONE_CORNER_SLAB = registerBlock("cut_brown_sandstone_corner_slab",
            () -> new CornerSlabBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_ORANGE_SANDSTONE_CORNER_SLAB = registerBlock("cut_orange_sandstone_corner_slab",
            () -> new CornerSlabBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_CORNER_SLAB = registerBlock("cut_red_sandstone_corner_slab",
            () -> new CornerSlabBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_SANDSTONE_CORNER_SLAB = registerBlock("cut_sandstone_corner_slab",
            () -> new CornerSlabBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_BROWN_SANDSTONE_CORNER_SLAB_VERTICAL = registerBlock("cut_brown_sandstone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_ORANGE_SANDSTONE_CORNER_SLAB_VERTICAL = registerBlock("cut_orange_sandstone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_CORNER_SLAB_VERTICAL = registerBlock("cut_red_sandstone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_SANDSTONE_CORNER_SLAB_VERTICAL = registerBlock("cut_sandstone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_BROWN_SANDSTONE_EIGHTH = registerBlock("cut_brown_sandstone_eighth",
            () -> new EighthBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_ORANGE_SANDSTONE_EIGHTH = registerBlock("cut_orange_sandstone_eighth",
            () -> new EighthBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_EIGHTH = registerBlock("cut_red_sandstone_eighth",
            () -> new EighthBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_SANDSTONE_EIGHTH = registerBlock("cut_sandstone_eighth",
            () -> new EighthBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_BROWN_SANDSTONE_PILLAR = registerBlock("cut_brown_sandstone_pillar",
            () -> new PillarLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_ORANGE_SANDSTONE_PILLAR = registerBlock("cut_orange_sandstone_pillar",
            () -> new PillarLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_PILLAR = registerBlock("cut_red_sandstone_pillar",
            () -> new PillarLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_SANDSTONE_PILLAR = registerBlock("cut_sandstone_pillar",
            () -> new PillarLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_BROWN_SANDSTONE_QUARTER = registerBlock("cut_brown_sandstone_quarter",
            () -> new QuarterLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_ORANGE_SANDSTONE_QUARTER = registerBlock("cut_orange_sandstone_quarter",
            () -> new QuarterLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_QUARTER = registerBlock("cut_red_sandstone_quarter",
            () -> new QuarterLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_SANDSTONE_QUARTER = registerBlock("cut_sandstone_quarter",
            () -> new QuarterLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_BROWN_SANDSTONE_QUARTER_VERTICAL = registerBlock("cut_brown_sandstone_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_ORANGE_SANDSTONE_QUARTER_VERTICAL = registerBlock("cut_orange_sandstone_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_QUARTER_VERTICAL = registerBlock("cut_red_sandstone_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_SANDSTONE_QUARTER_VERTICAL = registerBlock("cut_sandstone_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_BROWN_SANDSTONE_SLAB = registerBlock("cut_brown_sandstone_slab",
            () -> new SlabLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_ORANGE_SANDSTONE_SLAB = registerBlock("cut_orange_sandstone_slab",
            () -> new SlabLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_SLAB = registerBlock("cut_red_sandstone_slab",
            () -> new SlabLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_SANDSTONE_SLAB = registerBlock("cut_sandstone_slab",
            () -> new SlabLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_BROWN_SANDSTONE_SLAB_VERTICAL = registerBlock("cut_brown_sandstone_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_ORANGE_SANDSTONE_SLAB_VERTICAL = registerBlock("cut_orange_sandstone_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_SLAB_VERTICAL = registerBlock("cut_red_sandstone_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_SANDSTONE_SLAB_VERTICAL = registerBlock("cut_sandstone_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_BROWN_SANDSTONE_STAIRS = registerBlock("cut_brown_sandstone_stairs",
            () -> new StairBlock(() -> ModBlocks.CUT_BROWN_SANDSTONE.get().defaultBlockState(), BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_ORANGE_SANDSTONE_STAIRS = registerBlock("cut_orange_sandstone_stairs",
            () -> new StairBlock(() -> ModBlocks.CUT_ORANGE_SANDSTONE.get().defaultBlockState(), BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_STAIRS = registerBlock("cut_red_sandstone_stairs",
            () -> new StairBlock(Blocks.CUT_RED_SANDSTONE::defaultBlockState, BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_SANDSTONE_STAIRS = registerBlock("cut_sandstone_stairs",
            () -> new StairBlock(Blocks.CUT_SANDSTONE::defaultBlockState, BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_BROWN_SANDSTONE_WALL = registerBlock("cut_brown_sandstone_wall",
            () -> new WallBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_ORANGE_SANDSTONE_WALL = registerBlock("cut_orange_sandstone_wall",
            () -> new WallBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_WALL = registerBlock("cut_red_sandstone_wall",
            () -> new WallBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_SANDSTONE_WALL = registerBlock("cut_sandstone_wall",
            () -> new WallBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_BROWN_SANDSTONE_WINDOW = registerBlock("cut_brown_sandstone_window",
            () -> new WindowBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_ORANGE_SANDSTONE_WINDOW = registerBlock("cut_orange_sandstone_window",
            () -> new WindowBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_WINDOW = registerBlock("cut_red_sandstone_window",
            () -> new WindowBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_SANDSTONE_WINDOW = registerBlock("cut_sandstone_window",
            () -> new WindowBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_BROWN_SANDSTONE_WINDOW_HALF = registerBlock("cut_brown_sandstone_window_half",
            () -> new HalfWindowBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_ORANGE_SANDSTONE_WINDOW_HALF = registerBlock("cut_orange_sandstone_window_half",
            () -> new HalfWindowBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_RED_SANDSTONE_WINDOW_HALF = registerBlock("cut_red_sandstone_window_half",
            () -> new HalfWindowBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> CUT_SANDSTONE_WINDOW_HALF = registerBlock("cut_sandstone_window_half",
            () -> new HalfWindowBlock(BlockProps.SANDSTONE.get()));


    // -- SANDSTONE -- SMOOTH
    public static final RegistryObject<Block> SMOOTH_BROWN_SANDSTONE = registerBlock("smooth_brown_sandstone",
            () -> new Block(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_ORANGE_SANDSTONE = registerBlock("smooth_orange_sandstone",
            () -> new Block(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_BROWN_SANDSTONE_ARCH = registerBlock("smooth_brown_sandstone_arch",
            () -> new ArchBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_ORANGE_SANDSTONE_ARCH = registerBlock("smooth_orange_sandstone_arch",
            () -> new ArchBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_ARCH = registerBlock("smooth_red_sandstone_arch",
            () -> new ArchBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_ARCH = registerBlock("smooth_sandstone_arch",
            () -> new ArchBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_BROWN_SANDSTONE_ARCH_HALF = registerBlock("smooth_brown_sandstone_arch_half",
            () -> new HalfArchBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_ORANGE_SANDSTONE_ARCH_HALF = registerBlock("smooth_orange_sandstone_arch_half",
            () -> new HalfArchBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_ARCH_HALF = registerBlock("smooth_red_sandstone_arch_half",
            () -> new HalfArchBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_ARCH_HALF = registerBlock("smooth_sandstone_arch_half",
            () -> new HalfArchBlock(BlockProps.SMOOTH_SANDSTONE.get()));
public static final RegistryObject<Block> SMOOTH_BROWN_SANDSTONE_ARCH_LARGE = registerBlock("smooth_brown_sandstone_arch_large",
        () -> new LargeArchBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_ORANGE_SANDSTONE_ARCH_LARGE = registerBlock("smooth_orange_sandstone_arch_large",
            () -> new LargeArchBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_ARCH_LARGE = registerBlock("smooth_red_sandstone_arch_large",
            () -> new LargeArchBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_ARCH_LARGE = registerBlock("smooth_sandstone_arch_large",
            () -> new LargeArchBlock(BlockProps.SMOOTH_SANDSTONE.get()));
        public static final RegistryObject<Block> SMOOTH_BROWN_SANDSTONE_ARCH_LARGE_HALF = registerBlock("smooth_brown_sandstone_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_ORANGE_SANDSTONE_ARCH_LARGE_HALF = registerBlock("smooth_orange_sandstone_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_ARCH_LARGE_HALF = registerBlock("smooth_red_sandstone_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_ARCH_LARGE_HALF = registerBlock("smooth_sandstone_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_BROWN_SANDSTONE_ARROWSLIT = registerBlock("smooth_brown_sandstone_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_ORANGE_SANDSTONE_ARROWSLIT = registerBlock("smooth_orange_sandstone_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_ARROWSLIT = registerBlock("smooth_red_sandstone_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_ARROWSLIT = registerBlock("smooth_sandstone_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_BROWN_SANDSTONE_BALUSTRADE = registerBlock("smooth_brown_sandstone_balustrade",
            () -> new BalustradeBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_ORANGE_SANDSTONE_BALUSTRADE = registerBlock("smooth_orange_sandstone_balustrade",
            () -> new BalustradeBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_BALUSTRADE = registerBlock("smooth_red_sandstone_balustrade",
            () -> new BalustradeBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_BALUSTRADE = registerBlock("smooth_sandstone_balustrade",
            () -> new BalustradeBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_BROWN_SANDSTONE_CAPITAL = registerBlock("smooth_brown_sandstone_capital",
            () -> new CapitalBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_ORANGE_SANDSTONE_CAPITAL = registerBlock("smooth_orange_sandstone_capital",
            () -> new CapitalBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_CAPITAL = registerBlock("smooth_red_sandstone_capital",
            () -> new CapitalBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_CAPITAL = registerBlock("smooth_sandstone_capital",
            () -> new CapitalBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_BROWN_SANDSTONE_CORNER = registerBlock("smooth_brown_sandstone_corner",
            () -> new CornerLayerBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_ORANGE_SANDSTONE_CORNER = registerBlock("smooth_orange_sandstone_corner",
            () -> new CornerLayerBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_CORNER = registerBlock("smooth_red_sandstone_corner",
            () -> new CornerLayerBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_CORNER = registerBlock("smooth_sandstone_corner",
            () -> new CornerLayerBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_BROWN_SANDSTONE_CORNER_SLAB = registerBlock("smooth_brown_sandstone_corner_slab",
            () -> new CornerSlabBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_ORANGE_SANDSTONE_CORNER_SLAB = registerBlock("smooth_orange_sandstone_corner_slab",
            () -> new CornerSlabBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_CORNER_SLAB = registerBlock("smooth_red_sandstone_corner_slab",
            () -> new CornerSlabBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_CORNER_SLAB = registerBlock("smooth_sandstone_corner_slab",
            () -> new CornerSlabBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_BROWN_SANDSTONE_CORNER_SLAB_VERTICAL = registerBlock("smooth_brown_sandstone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_ORANGE_SANDSTONE_CORNER_SLAB_VERTICAL = registerBlock("smooth_orange_sandstone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_CORNER_SLAB_VERTICAL = registerBlock("smooth_red_sandstone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_CORNER_SLAB_VERTICAL = registerBlock("smooth_sandstone_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_BROWN_SANDSTONE_EIGHTH = registerBlock("smooth_brown_sandstone_eighth",
            () -> new EighthBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_ORANGE_SANDSTONE_EIGHTH = registerBlock("smooth_orange_sandstone_eighth",
            () -> new EighthBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_EIGHTH = registerBlock("smooth_red_sandstone_eighth",
            () -> new EighthBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_EIGHTH = registerBlock("smooth_sandstone_eighth",
            () -> new EighthBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_BROWN_SANDSTONE_PILLAR = registerBlock("smooth_brown_sandstone_pillar",
            () -> new PillarLayerBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_ORANGE_SANDSTONE_PILLAR = registerBlock("smooth_orange_sandstone_pillar",
            () -> new PillarLayerBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_PILLAR = registerBlock("smooth_red_sandstone_pillar",
            () -> new PillarLayerBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_PILLAR = registerBlock("smooth_sandstone_pillar",
            () -> new PillarLayerBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_BROWN_SANDSTONE_QUARTER = registerBlock("smooth_brown_sandstone_quarter",
            () -> new QuarterLayerBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_ORANGE_SANDSTONE_QUARTER = registerBlock("smooth_orange_sandstone_quarter",
            () -> new QuarterLayerBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_QUARTER = registerBlock("smooth_red_sandstone_quarter",
            () -> new QuarterLayerBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_QUARTER = registerBlock("smooth_sandstone_quarter",
            () -> new QuarterLayerBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_BROWN_SANDSTONE_QUARTER_VERTICAL = registerBlock("smooth_brown_sandstone_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_ORANGE_SANDSTONE_QUARTER_VERTICAL = registerBlock("smooth_orange_sandstone_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_QUARTER_VERTICAL = registerBlock("smooth_red_sandstone_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_QUARTER_VERTICAL = registerBlock("smooth_sandstone_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_BROWN_SANDSTONE_SLAB = registerBlock("smooth_brown_sandstone_slab",
            () -> new SlabLayerBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_ORANGE_SANDSTONE_SLAB = registerBlock("smooth_orange_sandstone_slab",
            () -> new SlabLayerBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_SLAB = registerBlock("smooth_red_sandstone_slab",
            () -> new SlabLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_SLAB = registerBlock("smooth_sandstone_slab",
            () -> new SlabLayerBlock(BlockProps.SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_BROWN_SANDSTONE_SLAB_VERTICAL = registerBlock("smooth_brown_sandstone_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_ORANGE_SANDSTONE_SLAB_VERTICAL = registerBlock("smooth_orange_sandstone_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_SLAB_VERTICAL = registerBlock("smooth_red_sandstone_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_SLAB_VERTICAL = registerBlock("smooth_sandstone_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_BROWN_SANDSTONE_STAIRS = registerBlock("smooth_brown_sandstone_stairs",
            () -> new StairBlock(() -> ModBlocks.SMOOTH_BROWN_SANDSTONE.get().defaultBlockState(), BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_ORANGE_SANDSTONE_STAIRS = registerBlock("smooth_orange_sandstone_stairs",
            () -> new StairBlock(() -> ModBlocks.SMOOTH_ORANGE_SANDSTONE.get().defaultBlockState(), BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_BROWN_SANDSTONE_WALL = registerBlock("smooth_brown_sandstone_wall",
            () -> new WallBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_ORANGE_SANDSTONE_WALL = registerBlock("smooth_orange_sandstone_wall",
            () -> new WallBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            () -> new WallBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            () -> new WallBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_BROWN_SANDSTONE_WINDOW = registerBlock("smooth_brown_sandstone_window",
            () -> new WindowBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_ORANGE_SANDSTONE_WINDOW = registerBlock("smooth_orange_sandstone_window",
            () -> new WindowBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_WINDOW = registerBlock("smooth_red_sandstone_window",
            () -> new WindowBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_WINDOW = registerBlock("smooth_sandstone_window",
            () -> new WindowBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_BROWN_SANDSTONE_WINDOW_HALF = registerBlock("smooth_brown_sandstone_window_half",
            () -> new HalfWindowBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_ORANGE_SANDSTONE_WINDOW_HALF = registerBlock("smooth_orange_sandstone_window_half",
            () -> new HalfWindowBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_WINDOW_HALF = registerBlock("smooth_red_sandstone_window_half",
            () -> new HalfWindowBlock(BlockProps.SMOOTH_SANDSTONE.get()));
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_WINDOW_HALF = registerBlock("smooth_sandstone_window_half",
            () -> new HalfWindowBlock(BlockProps.SMOOTH_SANDSTONE.get()));

     // -- TERRAIN

    public static final RegistryObject<Block> BLACK_SAND = registerBlock("black_sand",
             () -> new SandBlock(2, BlockProps.SAND.get()));
    public static final RegistryObject<Block> BROWN_SAND = registerBlock("brown_sand",
            () -> new SandBlock(2, BlockProps.SAND.get()));
    public static final RegistryObject<Block> ORANGE_SAND = registerBlock("orange_sand",
            () -> new SandBlock(2, BlockProps.SAND.get()));
    public static final RegistryObject<Block> WHITE_SAND = registerBlock("white_sand",
            () -> new SandBlock(2, BlockProps.SAND.get()));
    public static final RegistryObject<Block> BLACK_SAND_LAYER = registerBlock("black_sand_layer",
            () -> new FallingLayerBlock(BlockProps.SAND.get()));
    public static final RegistryObject<Block> BROWN_SAND_LAYER = registerBlock("brown_sand_layer",
            () -> new FallingLayerBlock(BlockProps.SAND.get()));
    public static final RegistryObject<Block> ORANGE_SAND_LAYER = registerBlock("orange_sand_layer",
            () -> new FallingLayerBlock(BlockProps.SAND.get()));
    public static final RegistryObject<Block> RED_SAND_LAYER = registerBlock("red_sand_layer",
            () -> new FallingLayerBlock(BlockProps.SAND.get()));
    public static final RegistryObject<Block> SOUL_SAND_LAYER = registerBlock("soul_sand_layer",
            () -> new SoulSandLayerBlock(BlockProps.SOUL_SAND.get()));
    public static final RegistryObject<Block> SAND_LAYER = registerBlock("sand_layer",
            () -> new FallingLayerBlock(BlockProps.SAND.get()));
    public static final RegistryObject<Block> WHITE_SAND_LAYER = registerBlock("white_sand_layer",
            () -> new FallingLayerBlock(BlockProps.SAND.get()));

    public static final RegistryObject<Block> CLAY_LAYER = registerBlock("clay_layer",
            () -> new TerrainLayerBlock(BlockProps.DIRT.get()));
    public static final RegistryObject<Block> COARSE_DIRT_LAYER = registerBlock("coarse_dirt_layer",
            () -> new TerrainLayerBlock(BlockProps.DIRT.get()));
    public static final RegistryObject<Block> DIRT_LAYER = registerBlock("dirt_layer",
            () -> new TerrainLayerBlock(BlockProps.DIRT.get()));
//    public static final RegistryObject<Block> FARMLAND_LAYER = registerBlock("farmland_layer",
//            () -> new FarmLayerBlock(BlockProps.FARMLAND.get()));
    public static final RegistryObject<Block> GRASS_LAYER = registerBlock("grass_layer",
            () -> new GrassLayerBlock(BlockProps.GRASS.get()));
    public static final RegistryObject<Block> GRAVEL_LAYER = registerBlock("gravel_layer",
            () -> new FallingLayerBlock(BlockProps.GRAVEL.get()));
    public static final RegistryObject<Block> MYCELIUM_LAYER = registerBlock("mycelium_layer",
            () -> new MyceliumLayerBlock(BlockProps.DIRT.get()));
    public static final RegistryObject<Block> PODZOL_LAYER = registerBlock("podzol_layer",
            () -> new TerrainLayerBlock(BlockProps.DIRT.get()));
    public static final RegistryObject<Block> ROOTED_DIRT_LAYER = registerBlock("rooted_dirt_layer",
            () -> new TerrainLayerBlock(BlockProps.DIRT.get()));
    public static final RegistryObject<Block> SOUL_SOIL_LAYER = registerBlock("soul_soil_layer",
            () -> new TerrainLayerBlock(BlockProps.SOUL_SOIL.get()));
    public static final RegistryObject<Block> CRIMSON_NYLIUM_LAYER = registerBlock("crimson_nylium_layer",
        () -> new NyliumLayerBlock(BlockProps.CRIMSON_NYLIUM.get()));
    public static final RegistryObject<Block> WARPED_NYLIUM_LAYER = registerBlock("warped_nylium_layer",
            () -> new NyliumLayerBlock(BlockProps.WARPED_NYLIUM.get()));

    // WOOD BLOCKS
    public static final RegistryObject<Block> ACACIA_BALUSTRADE = registerBlock("acacia_balustrade",
            () -> new BalustradeBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> BIRCH_BALUSTRADE = registerBlock("birch_balustrade",
            () -> new BalustradeBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> DARK_OAK_BALUSTRADE = registerBlock("dark_oak_balustrade",
            () -> new BalustradeBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> JUNGLE_BALUSTRADE = registerBlock("jungle_balustrade",
            () -> new BalustradeBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> OAK_BALUSTRADE = registerBlock("oak_balustrade",
            () -> new BalustradeBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> SPRUCE_BALUSTRADE = registerBlock("spruce_balustrade",
            () -> new BalustradeBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> ACACIA_CAPITAL = registerBlock("acacia_capital",
            () -> new CapitalBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> BIRCH_CAPITAL = registerBlock("birch_capital",
            () -> new CapitalBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> DARK_OAK_CAPITAL = registerBlock("dark_oak_capital",
            () -> new CapitalBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> JUNGLE_CAPITAL = registerBlock("jungle_capital",
            () -> new CapitalBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> OAK_CAPITAL = registerBlock("oak_capital",
            () -> new CapitalBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> SPRUCE_CAPITAL = registerBlock("spruce_capital",
            () -> new CapitalBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> ACACIA_CORNER = registerBlock("acacia_corner",
            () -> new CornerLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> BIRCH_CORNER = registerBlock("birch_corner",
            () -> new CornerLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> DARK_OAK_CORNER = registerBlock("dark_oak_corner",
            () -> new CornerLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> JUNGLE_CORNER = registerBlock("jungle_corner",
            () -> new CornerLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> OAK_CORNER = registerBlock("oak_corner",
            () -> new CornerLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> SPRUCE_CORNER = registerBlock("spruce_corner",
            () -> new CornerLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> ACACIA_CORNER_SLAB = registerBlock("acacia_corner_slab",
            () -> new CornerSlabBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> BIRCH_CORNER_SLAB = registerBlock("birch_corner_slab",
            () -> new CornerSlabBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> DARK_OAK_CORNER_SLAB = registerBlock("dark_oak_corner_slab",
            () -> new CornerSlabBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> JUNGLE_CORNER_SLAB = registerBlock("jungle_corner_slab",
            () -> new CornerSlabBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> OAK_CORNER_SLAB = registerBlock("oak_corner_slab",
            () -> new CornerSlabBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> SPRUCE_CORNER_SLAB = registerBlock("spruce_corner_slab",
            () -> new CornerSlabBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> ACACIA_SLAB = registerBlock("acacia_slab",
            () -> new SlabLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> BIRCH_SLAB = registerBlock("birch_slab",
            () -> new SlabLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> DARK_OAK_SLAB = registerBlock("dark_oak_slab",
            () -> new SlabLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> JUNGLE_SLAB = registerBlock("jungle_slab",
            () -> new SlabLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> OAK_SLAB = registerBlock("oak_slab",
            () -> new SlabLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> SPRUCE_SLAB = registerBlock("spruce_slab",
            () -> new SlabLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> ACACIA_CORNER_SLAB_VERTICAL = registerBlock("acacia_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> BIRCH_CORNER_SLAB_VERTICAL = registerBlock("birch_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> DARK_OAK_CORNER_SLAB_VERTICAL = registerBlock("dark_oak_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> JUNGLE_CORNER_SLAB_VERTICAL = registerBlock("jungle_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> OAK_CORNER_SLAB_VERTICAL = registerBlock("oak_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> SPRUCE_CORNER_SLAB_VERTICAL = registerBlock("spruce_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> ACACIA_EIGHTH = registerBlock("acacia_eighth",
            () -> new EighthBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> BIRCH_EIGHTH = registerBlock("birch_eighth",
            () -> new EighthBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> DARK_OAK_EIGHTH = registerBlock("dark_oak_eighth",
            () -> new EighthBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> JUNGLE_EIGHTH = registerBlock("jungle_eighth",
            () -> new EighthBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> OAK_EIGHTH = registerBlock("oak_eighth",
            () -> new EighthBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> SPRUCE_EIGHTH = registerBlock("spruce_eighth",
            () -> new EighthBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> ACACIA_PILLAR = registerBlock("acacia_pillar",
            () -> new PillarLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> BIRCH_PILLAR = registerBlock("birch_pillar",
            () -> new PillarLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> DARK_OAK_PILLAR = registerBlock("dark_oak_pillar",
            () -> new PillarLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> JUNGLE_PILLAR = registerBlock("jungle_pillar",
            () -> new PillarLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> OAK_PILLAR = registerBlock("oak_pillar",
            () -> new PillarLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> SPRUCE_PILLAR = registerBlock("spruce_pillar",
            () -> new PillarLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> ACACIA_QUARTER = registerBlock("acacia_quarter",
            () -> new QuarterLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> BIRCH_QUARTER = registerBlock("birch_quarter",
            () -> new QuarterLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> DARK_OAK_QUARTER = registerBlock("dark_oak_quarter",
            () -> new QuarterLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> JUNGLE_QUARTER = registerBlock("jungle_quarter",
            () -> new QuarterLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> OAK_QUARTER = registerBlock("oak_quarter",
            () -> new QuarterLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> SPRUCE_QUARTER = registerBlock("spruce_quarter",
            () -> new QuarterLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> ACACIA_QUARTER_VERTICAL = registerBlock("acacia_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> BIRCH_QUARTER_VERTICAL = registerBlock("birch_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> DARK_OAK_QUARTER_VERTICAL = registerBlock("dark_oak_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> JUNGLE_QUARTER_VERTICAL = registerBlock("jungle_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> OAK_QUARTER_VERTICAL = registerBlock("oak_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> SPRUCE_QUARTER_VERTICAL = registerBlock("spruce_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> ACACIA_SLAB_VERTICAL = registerBlock("acacia_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> BIRCH_SLAB_VERTICAL = registerBlock("birch_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> DARK_OAK_SLAB_VERTICAL = registerBlock("dark_oak_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> JUNGLE_SLAB_VERTICAL = registerBlock("jungle_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> OAK_SLAB_VERTICAL = registerBlock("oak_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> SPRUCE_SLAB_VERTICAL = registerBlock("spruce_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> ACACIA_WALL = registerBlock("acacia_wall",
            () -> new WallBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> BIRCH_WALL = registerBlock("birch_wall",
            () -> new WallBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> DARK_OAK_WALL = registerBlock("dark_oak_wall",
            () -> new WallBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> JUNGLE_WALL = registerBlock("jungle_wall",
            () -> new WallBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> OAK_WALL = registerBlock("oak_wall",
            () -> new WallBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> SPRUCE_WALL = registerBlock("spruce_wall",
            () -> new WallBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> ACACIA_WINDOW = registerBlock("acacia_window",
            () -> new WindowBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> BIRCH_WINDOW = registerBlock("birch_window",
            () -> new WindowBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> DARK_OAK_WINDOW = registerBlock("dark_oak_window",
            () -> new WindowBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> JUNGLE_WINDOW = registerBlock("jungle_window",
            () -> new WindowBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> OAK_WINDOW = registerBlock("oak_window",
            () -> new WindowBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> SPRUCE_WINDOW = registerBlock("spruce_window",
            () -> new WindowBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> ACACIA_WINDOW_HALF = registerBlock("acacia_window_half",
            () -> new HalfWindowBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> BIRCH_WINDOW_HALF = registerBlock("birch_window_half",
            () -> new HalfWindowBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> DARK_OAK_WINDOW_HALF = registerBlock("dark_oak_window_half",
            () -> new HalfWindowBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> JUNGLE_WINDOW_HALF = registerBlock("jungle_window_half",
            () -> new HalfWindowBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> OAK_WINDOW_HALF = registerBlock("oak_window_half",
            () -> new HalfWindowBlock(BlockProps.PLANK.get()));
    public static final RegistryObject<Block> SPRUCE_WINDOW_HALF = registerBlock("spruce_window_half",
            () -> new HalfWindowBlock(BlockProps.PLANK.get()));

    // PLASTER BLOCKS
    public static final RegistryObject<Block> BEIGE_PLASTER = registerBlock("beige_plaster",
            () -> new Block(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BROWN_PLASTER = registerBlock("brown_plaster",
            () -> new Block(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> OCHRE_PLASTER = registerBlock("ochre_plaster",
            () -> new Block(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> TAN_PLASTER = registerBlock("tan_plaster",
            () -> new Block(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> WHITE_PLASTER = registerBlock("white_plaster",
            () -> new Block(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BEIGE_PLASTER_ARCH = registerBlock("beige_plaster_arch",
            () -> new ArchBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BROWN_PLASTER_ARCH = registerBlock("brown_plaster_arch",
            () -> new ArchBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> OCHRE_PLASTER_ARCH = registerBlock("ochre_plaster_arch",
            () -> new ArchBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> TAN_PLASTER_ARCH = registerBlock("tan_plaster_arch",
            () -> new ArchBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> WHITE_PLASTER_ARCH = registerBlock("white_plaster_arch",
            () -> new ArchBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BEIGE_PLASTER_ARCH_HALF = registerBlock("beige_plaster_arch_half",
            () -> new HalfArchBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BROWN_PLASTER_ARCH_HALF = registerBlock("brown_plaster_arch_half",
            () -> new HalfArchBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> OCHRE_PLASTER_ARCH_HALF = registerBlock("ochre_plaster_arch_half",
            () -> new HalfArchBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> TAN_PLASTER_ARCH_HALF = registerBlock("tan_plaster_arch_half",
            () -> new HalfArchBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> WHITE_PLASTER_ARCH_HALF = registerBlock("white_plaster_arch_half",
            () -> new HalfArchBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BEIGE_PLASTER_ARCH_LARGE = registerBlock("beige_plaster_arch_large",
            () -> new LargeArchBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BROWN_PLASTER_ARCH_LARGE = registerBlock("brown_plaster_arch_large",
            () -> new LargeArchBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> OCHRE_PLASTER_ARCH_LARGE = registerBlock("ochre_plaster_arch_large",
            () -> new LargeArchBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> TAN_PLASTER_ARCH_LARGE = registerBlock("tan_plaster_arch_large",
            () -> new LargeArchBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> WHITE_PLASTER_ARCH_LARGE = registerBlock("white_plaster_arch_large",
            () -> new LargeArchBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BEIGE_PLASTER_ARCH_LARGE_HALF = registerBlock("beige_plaster_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BROWN_PLASTER_ARCH_LARGE_HALF = registerBlock("brown_plaster_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> OCHRE_PLASTER_ARCH_LARGE_HALF = registerBlock("ochre_plaster_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> TAN_PLASTER_ARCH_LARGE_HALF = registerBlock("tan_plaster_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> WHITE_PLASTER_ARCH_LARGE_HALF = registerBlock("white_plaster_arch_large_half",
            () -> new LargeHalfArchBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BEIGE_PLASTER_ARROWSLIT = registerBlock("beige_plaster_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BROWN_PLASTER_ARROWSLIT = registerBlock("brown_plaster_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> OCHRE_PLASTER_ARROWSLIT = registerBlock("ochre_plaster_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> TAN_PLASTER_ARROWSLIT = registerBlock("tan_plaster_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> WHITE_PLASTER_ARROWSLIT = registerBlock("white_plaster_arrowslit",
            () -> new ArrowSlitBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BEIGE_PLASTER_BALUSTRADE = registerBlock("beige_plaster_balustrade",
            () -> new BalustradeBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BROWN_PLASTER_BALUSTRADE = registerBlock("brown_plaster_balustrade",
            () -> new BalustradeBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> OCHRE_PLASTER_BALUSTRADE = registerBlock("ochre_plaster_balustrade",
            () -> new BalustradeBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> TAN_PLASTER_BALUSTRADE = registerBlock("tan_plaster_balustrade",
            () -> new BalustradeBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> WHITE_PLASTER_BALUSTRADE = registerBlock("white_plaster_balustrade",
            () -> new BalustradeBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BEIGE_PLASTER_CAPITAL = registerBlock("beige_plaster_capital",
            () -> new CapitalBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BROWN_PLASTER_CAPITAL = registerBlock("brown_plaster_capital",
            () -> new CapitalBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> OCHRE_PLASTER_CAPITAL = registerBlock("ochre_plaster_capital",
            () -> new CapitalBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> TAN_PLASTER_CAPITAL = registerBlock("tan_plaster_capital",
            () -> new CapitalBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> WHITE_PLASTER_CAPITAL = registerBlock("white_plaster_capital",
            () -> new CapitalBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BEIGE_PLASTER_CORNER = registerBlock("beige_plaster_corner",
            () -> new CornerLayerBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BROWN_PLASTER_CORNER = registerBlock("brown_plaster_corner",
            () -> new CornerLayerBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> OCHRE_PLASTER_CORNER = registerBlock("ochre_plaster_corner",
            () -> new CornerLayerBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> TAN_PLASTER_CORNER = registerBlock("tan_plaster_corner",
            () -> new CornerLayerBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> WHITE_PLASTER_CORNER = registerBlock("white_plaster_corner",
            () -> new CornerLayerBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BEIGE_PLASTER_CORNER_SLAB = registerBlock("beige_plaster_corner_slab",
            () -> new CornerSlabBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BROWN_PLASTER_CORNER_SLAB = registerBlock("brown_plaster_corner_slab",
            () -> new CornerSlabBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> OCHRE_PLASTER_CORNER_SLAB = registerBlock("ochre_plaster_corner_slab",
            () -> new CornerSlabBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> TAN_PLASTER_CORNER_SLAB = registerBlock("tan_plaster_corner_slab",
            () -> new CornerSlabBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> WHITE_PLASTER_CORNER_SLAB = registerBlock("white_plaster_corner_slab",
            () -> new CornerSlabBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BEIGE_PLASTER_CORNER_SLAB_VERTICAL = registerBlock("beige_plaster_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BROWN_PLASTER_CORNER_SLAB_VERTICAL = registerBlock("brown_plaster_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> OCHRE_PLASTER_CORNER_SLAB_VERTICAL = registerBlock("ochre_plaster_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> TAN_PLASTER_CORNER_SLAB_VERTICAL = registerBlock("tan_plaster_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> WHITE_PLASTER_CORNER_SLAB_VERTICAL = registerBlock("white_plaster_corner_slab_vertical",
            () -> new VerticalCornerSlabBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BEIGE_PLASTER_EIGHTH = registerBlock("beige_plaster_eighth",
            () -> new EighthBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BROWN_PLASTER_EIGHTH = registerBlock("brown_plaster_eighth",
            () -> new EighthBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> OCHRE_PLASTER_EIGHTH = registerBlock("ochre_plaster_eighth",
            () -> new EighthBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> TAN_PLASTER_EIGHTH = registerBlock("tan_plaster_eighth",
            () -> new EighthBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> WHITE_PLASTER_EIGHTH = registerBlock("white_plaster_eighth",
            () -> new EighthBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BEIGE_PLASTER_PILLAR = registerBlock("beige_plaster_pillar",
            () -> new PillarLayerBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BROWN_PLASTER_PILLAR = registerBlock("brown_plaster_pillar",
            () -> new PillarLayerBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> OCHRE_PLASTER_PILLAR = registerBlock("ochre_plaster_pillar",
            () -> new PillarLayerBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> TAN_PLASTER_PILLAR = registerBlock("tan_plaster_pillar",
            () -> new PillarLayerBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> WHITE_PLASTER_PILLAR = registerBlock("white_plaster_pillar",
            () -> new PillarLayerBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BEIGE_PLASTER_QUARTER = registerBlock("beige_plaster_quarter",
            () -> new QuarterLayerBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BROWN_PLASTER_QUARTER = registerBlock("brown_plaster_quarter",
            () -> new QuarterLayerBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> OCHRE_PLASTER_QUARTER = registerBlock("ochre_plaster_quarter",
            () -> new QuarterLayerBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> TAN_PLASTER_QUARTER = registerBlock("tan_plaster_quarter",
            () -> new QuarterLayerBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> WHITE_PLASTER_QUARTER = registerBlock("white_plaster_quarter",
            () -> new QuarterLayerBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BEIGE_PLASTER_QUARTER_VERTICAL = registerBlock("beige_plaster_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BROWN_PLASTER_QUARTER_VERTICAL = registerBlock("brown_plaster_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> OCHRE_PLASTER_QUARTER_VERTICAL = registerBlock("ochre_plaster_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> TAN_PLASTER_QUARTER_VERTICAL = registerBlock("tan_plaster_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> WHITE_PLASTER_QUARTER_VERTICAL = registerBlock("white_plaster_quarter_vertical",
            () -> new VerticalQuarterLayerBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BEIGE_PLASTER_SLAB = registerBlock("beige_plaster_slab",
            () -> new SlabLayerBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BROWN_PLASTER_SLAB = registerBlock("brown_plaster_slab",
            () -> new SlabLayerBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> OCHRE_PLASTER_SLAB = registerBlock("ochre_plaster_slab",
            () -> new SlabLayerBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> TAN_PLASTER_SLAB = registerBlock("tan_plaster_slab",
            () -> new SlabLayerBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> WHITE_PLASTER_SLAB = registerBlock("white_plaster_slab",
            () -> new SlabLayerBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BEIGE_PLASTER_SLAB_VERTICAL = registerBlock("beige_plaster_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BROWN_PLASTER_SLAB_VERTICAL = registerBlock("brown_plaster_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> OCHRE_PLASTER_SLAB_VERTICAL = registerBlock("ochre_plaster_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> TAN_PLASTER_SLAB_VERTICAL = registerBlock("tan_plaster_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> WHITE_PLASTER_SLAB_VERTICAL = registerBlock("white_plaster_slab_vertical",
            () -> new VerticalSlabLayerBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BEIGE_PLASTER_STAIRS = registerBlock("beige_plaster_stairs",
            () -> new StairBlock(() -> ModBlocks.BEIGE_PLASTER.get().defaultBlockState(), BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BROWN_PLASTER_STAIRS = registerBlock("brown_plaster_stairs",
            () -> new StairBlock(() -> ModBlocks.BROWN_PLASTER.get().defaultBlockState(), BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> OCHRE_PLASTER_STAIRS = registerBlock("ochre_plaster_stairs",
            () -> new StairBlock(() -> ModBlocks.OCHRE_PLASTER.get().defaultBlockState(), BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> TAN_PLASTER_STAIRS = registerBlock("tan_plaster_stairs",
            () -> new StairBlock(() -> ModBlocks.TAN_PLASTER.get().defaultBlockState(), BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> WHITE_PLASTER_STAIRS = registerBlock("white_plaster_stairs",
            () -> new StairBlock(() -> ModBlocks.WHITE_PLASTER.get().defaultBlockState(), BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BEIGE_PLASTER_WALL = registerBlock("beige_plaster_wall",
            () -> new WallBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BROWN_PLASTER_WALL = registerBlock("brown_plaster_wall",
            () -> new WallBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> OCHRE_PLASTER_WALL = registerBlock("ochre_plaster_wall",
            () -> new WallBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> TAN_PLASTER_WALL = registerBlock("tan_plaster_wall",
            () -> new WallBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> WHITE_PLASTER_WALL = registerBlock("white_plaster_wall",
            () -> new WallBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BEIGE_PLASTER_WINDOW = registerBlock("beige_plaster_window",
            () -> new WindowBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BROWN_PLASTER_WINDOW = registerBlock("brown_plaster_window",
            () -> new WindowBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> OCHRE_PLASTER_WINDOW = registerBlock("ochre_plaster_window",
            () -> new WindowBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> TAN_PLASTER_WINDOW = registerBlock("tan_plaster_window",
            () -> new WindowBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> WHITE_PLASTER_WINDOW = registerBlock("white_plaster_window",
            () -> new WindowBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BEIGE_PLASTER_WINDOW_HALF = registerBlock("beige_plaster_window_half",
            () -> new HalfWindowBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> BROWN_PLASTER_WINDOW_HALF = registerBlock("brown_plaster_window_half",
            () -> new HalfWindowBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> OCHRE_PLASTER_WINDOW_HALF = registerBlock("ochre_plaster_window_half",
            () -> new HalfWindowBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> TAN_PLASTER_WINDOW_HALF = registerBlock("tan_plaster_window_half",
            () -> new HalfWindowBlock(BlockProps.PLASTER.get()));
    public static final RegistryObject<Block> WHITE_PLASTER_WINDOW_HALF = registerBlock("white_plaster_window_half",
            () -> new HalfWindowBlock(BlockProps.PLASTER.get()));

    /* Plaster Powder */
    public static final RegistryObject<ConcretePowderBlock> BEIGE_PLASTER_POWDER = registerBlock("beige_plaster_powder",
            () -> new ConcretePowderBlock(ModBlocks.BEIGE_PLASTER.get(), BlockProps.PLASTER_POWDER.get()));
    public static final RegistryObject<ConcretePowderBlock> BROWN_PLASTER_POWDER = registerBlock("brown_plaster_powder",
            () -> new ConcretePowderBlock(ModBlocks.BROWN_PLASTER.get(), BlockProps.PLASTER_POWDER.get()));
    public static final RegistryObject<ConcretePowderBlock> OCHRE_PLASTER_POWDER = registerBlock("ochre_plaster_powder",
            () -> new ConcretePowderBlock(ModBlocks.OCHRE_PLASTER.get(), BlockProps.PLASTER_POWDER.get()));
    public static final RegistryObject<ConcretePowderBlock> TAN_PLASTER_POWDER = registerBlock("tan_plaster_powder",
            () -> new ConcretePowderBlock(ModBlocks.TAN_PLASTER.get(), BlockProps.PLASTER_POWDER.get()));
    public static final RegistryObject<ConcretePowderBlock> WHITE_PLASTER_POWDER = registerBlock("white_plaster_powder",
            () -> new ConcretePowderBlock(ModBlocks.WHITE_PLASTER.get(), BlockProps.PLASTER_POWDER.get()));

    // TUDOR BLOCKS
    /* Beige Plaster Half-Timbered Blocks */
    public static final RegistryObject<Block> TUDOR_ACACIA_BEIGE_PLASTER_CROSS = registerBlock("tudor_acacia_beige_plaster_cross",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_BEIGE_PLASTER_DOWN = registerBlock("tudor_acacia_beige_plaster_down",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_BEIGE_PLASTER_UP = registerBlock("tudor_acacia_beige_plaster_up",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_BEIGE_PLASTER_LEFT = registerBlock("tudor_acacia_beige_plaster_left",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_BEIGE_PLASTER_RIGHT = registerBlock("tudor_acacia_beige_plaster_right",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_BEIGE_PLASTER_HORIZONTAL_1 = registerBlock("tudor_acacia_beige_plaster_horizontal_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_BEIGE_PLASTER_HORIZONTAL_2 = registerBlock("tudor_acacia_beige_plaster_horizontal_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_BEIGE_PLASTER_VERTICAL_1 = registerBlock("tudor_acacia_beige_plaster_vertical_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_BEIGE_PLASTER_VERTICAL_2 = registerBlock("tudor_acacia_beige_plaster_vertical_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));

    public static final RegistryObject<Block> TUDOR_BIRCH_BEIGE_PLASTER_CROSS = registerBlock("tudor_birch_beige_plaster_cross",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_BEIGE_PLASTER_DOWN = registerBlock("tudor_birch_beige_plaster_down",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_BEIGE_PLASTER_UP = registerBlock("tudor_birch_beige_plaster_up",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_BEIGE_PLASTER_LEFT = registerBlock("tudor_birch_beige_plaster_left",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_BEIGE_PLASTER_RIGHT = registerBlock("tudor_birch_beige_plaster_right",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_BEIGE_PLASTER_HORIZONTAL_1 = registerBlock("tudor_birch_beige_plaster_horizontal_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_BEIGE_PLASTER_HORIZONTAL_2 = registerBlock("tudor_birch_beige_plaster_horizontal_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_BEIGE_PLASTER_VERTICAL_1 = registerBlock("tudor_birch_beige_plaster_vertical_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_BEIGE_PLASTER_VERTICAL_2 = registerBlock("tudor_birch_beige_plaster_vertical_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    
    public static final RegistryObject<Block> TUDOR_DARK_OAK_BEIGE_PLASTER_CROSS = registerBlock("tudor_dark_oak_beige_plaster_cross",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_BEIGE_PLASTER_DOWN = registerBlock("tudor_dark_oak_beige_plaster_down",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_BEIGE_PLASTER_UP = registerBlock("tudor_dark_oak_beige_plaster_up",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_BEIGE_PLASTER_LEFT = registerBlock("tudor_dark_oak_beige_plaster_left",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_BEIGE_PLASTER_RIGHT = registerBlock("tudor_dark_oak_beige_plaster_right",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_BEIGE_PLASTER_HORIZONTAL_1 = registerBlock("tudor_dark_oak_beige_plaster_horizontal_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_BEIGE_PLASTER_HORIZONTAL_2 = registerBlock("tudor_dark_oak_beige_plaster_horizontal_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_BEIGE_PLASTER_VERTICAL_1 = registerBlock("tudor_dark_oak_beige_plaster_vertical_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_BEIGE_PLASTER_VERTICAL_2 = registerBlock("tudor_dark_oak_beige_plaster_vertical_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));

    public static final RegistryObject<Block> TUDOR_JUNGLE_BEIGE_PLASTER_CROSS = registerBlock("tudor_jungle_beige_plaster_cross",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_BEIGE_PLASTER_DOWN = registerBlock("tudor_jungle_beige_plaster_down",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_BEIGE_PLASTER_UP = registerBlock("tudor_jungle_beige_plaster_up",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_BEIGE_PLASTER_LEFT = registerBlock("tudor_jungle_beige_plaster_left",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_BEIGE_PLASTER_RIGHT = registerBlock("tudor_jungle_beige_plaster_right",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_BEIGE_PLASTER_HORIZONTAL_1 = registerBlock("tudor_jungle_beige_plaster_horizontal_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_BEIGE_PLASTER_HORIZONTAL_2 = registerBlock("tudor_jungle_beige_plaster_horizontal_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_BEIGE_PLASTER_VERTICAL_1 = registerBlock("tudor_jungle_beige_plaster_vertical_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_BEIGE_PLASTER_VERTICAL_2 = registerBlock("tudor_jungle_beige_plaster_vertical_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));

    public static final RegistryObject<Block> TUDOR_OAK_BEIGE_PLASTER_CROSS = registerBlock("tudor_oak_beige_plaster_cross",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_BEIGE_PLASTER_DOWN = registerBlock("tudor_oak_beige_plaster_down",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_BEIGE_PLASTER_UP = registerBlock("tudor_oak_beige_plaster_up",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_BEIGE_PLASTER_LEFT = registerBlock("tudor_oak_beige_plaster_left",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_BEIGE_PLASTER_RIGHT = registerBlock("tudor_oak_beige_plaster_right",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_BEIGE_PLASTER_HORIZONTAL_1 = registerBlock("tudor_oak_beige_plaster_horizontal_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_BEIGE_PLASTER_HORIZONTAL_2 = registerBlock("tudor_oak_beige_plaster_horizontal_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_BEIGE_PLASTER_VERTICAL_1 = registerBlock("tudor_oak_beige_plaster_vertical_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_BEIGE_PLASTER_VERTICAL_2 = registerBlock("tudor_oak_beige_plaster_vertical_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));

    public static final RegistryObject<Block> TUDOR_SPRUCE_BEIGE_PLASTER_CROSS = registerBlock("tudor_spruce_beige_plaster_cross",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_BEIGE_PLASTER_DOWN = registerBlock("tudor_spruce_beige_plaster_down",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_BEIGE_PLASTER_UP = registerBlock("tudor_spruce_beige_plaster_up",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_BEIGE_PLASTER_LEFT = registerBlock("tudor_spruce_beige_plaster_left",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_BEIGE_PLASTER_RIGHT = registerBlock("tudor_spruce_beige_plaster_right",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_BEIGE_PLASTER_HORIZONTAL_1 = registerBlock("tudor_spruce_beige_plaster_horizontal_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_BEIGE_PLASTER_HORIZONTAL_2 = registerBlock("tudor_spruce_beige_plaster_horizontal_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_BEIGE_PLASTER_VERTICAL_1 = registerBlock("tudor_spruce_beige_plaster_vertical_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_BEIGE_PLASTER_VERTICAL_2 = registerBlock("tudor_spruce_beige_plaster_vertical_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));

    /* Brown Plaster Half-Timbered Blocks */
    public static final RegistryObject<Block> TUDOR_ACACIA_BROWN_PLASTER_CROSS = registerBlock("tudor_acacia_brown_plaster_cross",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_BROWN_PLASTER_DOWN = registerBlock("tudor_acacia_brown_plaster_down",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_BROWN_PLASTER_UP = registerBlock("tudor_acacia_brown_plaster_up",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_BROWN_PLASTER_LEFT = registerBlock("tudor_acacia_brown_plaster_left",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_BROWN_PLASTER_RIGHT = registerBlock("tudor_acacia_brown_plaster_right",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_BROWN_PLASTER_HORIZONTAL_1 = registerBlock("tudor_acacia_brown_plaster_horizontal_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_BROWN_PLASTER_HORIZONTAL_2 = registerBlock("tudor_acacia_brown_plaster_horizontal_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_BROWN_PLASTER_VERTICAL_1 = registerBlock("tudor_acacia_brown_plaster_vertical_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_BROWN_PLASTER_VERTICAL_2 = registerBlock("tudor_acacia_brown_plaster_vertical_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));

    public static final RegistryObject<Block> TUDOR_BIRCH_BROWN_PLASTER_CROSS = registerBlock("tudor_birch_brown_plaster_cross",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_BROWN_PLASTER_DOWN = registerBlock("tudor_birch_brown_plaster_down",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_BROWN_PLASTER_UP = registerBlock("tudor_birch_brown_plaster_up",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_BROWN_PLASTER_LEFT = registerBlock("tudor_birch_brown_plaster_left",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_BROWN_PLASTER_RIGHT = registerBlock("tudor_birch_brown_plaster_right",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_BROWN_PLASTER_HORIZONTAL_1 = registerBlock("tudor_birch_brown_plaster_horizontal_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_BROWN_PLASTER_HORIZONTAL_2 = registerBlock("tudor_birch_brown_plaster_horizontal_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_BROWN_PLASTER_VERTICAL_1 = registerBlock("tudor_birch_brown_plaster_vertical_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_BROWN_PLASTER_VERTICAL_2 = registerBlock("tudor_birch_brown_plaster_vertical_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));

    public static final RegistryObject<Block> TUDOR_DARK_OAK_BROWN_PLASTER_CROSS = registerBlock("tudor_dark_oak_brown_plaster_cross",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_BROWN_PLASTER_DOWN = registerBlock("tudor_dark_oak_brown_plaster_down",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_BROWN_PLASTER_UP = registerBlock("tudor_dark_oak_brown_plaster_up",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_BROWN_PLASTER_LEFT = registerBlock("tudor_dark_oak_brown_plaster_left",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_BROWN_PLASTER_RIGHT = registerBlock("tudor_dark_oak_brown_plaster_right",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_BROWN_PLASTER_HORIZONTAL_1 = registerBlock("tudor_dark_oak_brown_plaster_horizontal_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_BROWN_PLASTER_HORIZONTAL_2 = registerBlock("tudor_dark_oak_brown_plaster_horizontal_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_BROWN_PLASTER_VERTICAL_1 = registerBlock("tudor_dark_oak_brown_plaster_vertical_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_BROWN_PLASTER_VERTICAL_2 = registerBlock("tudor_dark_oak_brown_plaster_vertical_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));

    public static final RegistryObject<Block> TUDOR_JUNGLE_BROWN_PLASTER_CROSS = registerBlock("tudor_jungle_brown_plaster_cross",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_BROWN_PLASTER_DOWN = registerBlock("tudor_jungle_brown_plaster_down",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_BROWN_PLASTER_UP = registerBlock("tudor_jungle_brown_plaster_up",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_BROWN_PLASTER_LEFT = registerBlock("tudor_jungle_brown_plaster_left",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_BROWN_PLASTER_RIGHT = registerBlock("tudor_jungle_brown_plaster_right",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_BROWN_PLASTER_HORIZONTAL_1 = registerBlock("tudor_jungle_brown_plaster_horizontal_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_BROWN_PLASTER_HORIZONTAL_2 = registerBlock("tudor_jungle_brown_plaster_horizontal_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_BROWN_PLASTER_VERTICAL_1 = registerBlock("tudor_jungle_brown_plaster_vertical_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_BROWN_PLASTER_VERTICAL_2 = registerBlock("tudor_jungle_brown_plaster_vertical_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));

    public static final RegistryObject<Block> TUDOR_OAK_BROWN_PLASTER_CROSS = registerBlock("tudor_oak_brown_plaster_cross",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_BROWN_PLASTER_DOWN = registerBlock("tudor_oak_brown_plaster_down",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_BROWN_PLASTER_UP = registerBlock("tudor_oak_brown_plaster_up",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_BROWN_PLASTER_LEFT = registerBlock("tudor_oak_brown_plaster_left",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_BROWN_PLASTER_RIGHT = registerBlock("tudor_oak_brown_plaster_right",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_BROWN_PLASTER_HORIZONTAL_1 = registerBlock("tudor_oak_brown_plaster_horizontal_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_BROWN_PLASTER_HORIZONTAL_2 = registerBlock("tudor_oak_brown_plaster_horizontal_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_BROWN_PLASTER_VERTICAL_1 = registerBlock("tudor_oak_brown_plaster_vertical_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_BROWN_PLASTER_VERTICAL_2 = registerBlock("tudor_oak_brown_plaster_vertical_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));

    public static final RegistryObject<Block> TUDOR_SPRUCE_BROWN_PLASTER_CROSS = registerBlock("tudor_spruce_brown_plaster_cross",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_BROWN_PLASTER_DOWN = registerBlock("tudor_spruce_brown_plaster_down",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_BROWN_PLASTER_UP = registerBlock("tudor_spruce_brown_plaster_up",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_BROWN_PLASTER_LEFT = registerBlock("tudor_spruce_brown_plaster_left",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_BROWN_PLASTER_RIGHT = registerBlock("tudor_spruce_brown_plaster_right",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_BROWN_PLASTER_HORIZONTAL_1 = registerBlock("tudor_spruce_brown_plaster_horizontal_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_BROWN_PLASTER_HORIZONTAL_2 = registerBlock("tudor_spruce_brown_plaster_horizontal_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_BROWN_PLASTER_VERTICAL_1 = registerBlock("tudor_spruce_brown_plaster_vertical_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_BROWN_PLASTER_VERTICAL_2 = registerBlock("tudor_spruce_brown_plaster_vertical_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));

    /* Ochre Plaster Half-Timbered Blocks */
    public static final RegistryObject<Block> TUDOR_ACACIA_OCHRE_PLASTER_CROSS = registerBlock("tudor_acacia_ochre_plaster_cross",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_OCHRE_PLASTER_DOWN = registerBlock("tudor_acacia_ochre_plaster_down",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_OCHRE_PLASTER_UP = registerBlock("tudor_acacia_ochre_plaster_up",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_OCHRE_PLASTER_LEFT = registerBlock("tudor_acacia_ochre_plaster_left",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_OCHRE_PLASTER_RIGHT = registerBlock("tudor_acacia_ochre_plaster_right",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_OCHRE_PLASTER_HORIZONTAL_1 = registerBlock("tudor_acacia_ochre_plaster_horizontal_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_OCHRE_PLASTER_HORIZONTAL_2 = registerBlock("tudor_acacia_ochre_plaster_horizontal_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_OCHRE_PLASTER_VERTICAL_1 = registerBlock("tudor_acacia_ochre_plaster_vertical_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_OCHRE_PLASTER_VERTICAL_2 = registerBlock("tudor_acacia_ochre_plaster_vertical_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));

    public static final RegistryObject<Block> TUDOR_BIRCH_OCHRE_PLASTER_CROSS = registerBlock("tudor_birch_ochre_plaster_cross",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_OCHRE_PLASTER_DOWN = registerBlock("tudor_birch_ochre_plaster_down",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_OCHRE_PLASTER_UP = registerBlock("tudor_birch_ochre_plaster_up",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_OCHRE_PLASTER_LEFT = registerBlock("tudor_birch_ochre_plaster_left",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_OCHRE_PLASTER_RIGHT = registerBlock("tudor_birch_ochre_plaster_right",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_OCHRE_PLASTER_HORIZONTAL_1 = registerBlock("tudor_birch_ochre_plaster_horizontal_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_OCHRE_PLASTER_HORIZONTAL_2 = registerBlock("tudor_birch_ochre_plaster_horizontal_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_OCHRE_PLASTER_VERTICAL_1 = registerBlock("tudor_birch_ochre_plaster_vertical_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_OCHRE_PLASTER_VERTICAL_2 = registerBlock("tudor_birch_ochre_plaster_vertical_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));

    public static final RegistryObject<Block> TUDOR_DARK_OAK_OCHRE_PLASTER_CROSS = registerBlock("tudor_dark_oak_ochre_plaster_cross",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_OCHRE_PLASTER_DOWN = registerBlock("tudor_dark_oak_ochre_plaster_down",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_OCHRE_PLASTER_UP = registerBlock("tudor_dark_oak_ochre_plaster_up",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_OCHRE_PLASTER_LEFT = registerBlock("tudor_dark_oak_ochre_plaster_left",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_OCHRE_PLASTER_RIGHT = registerBlock("tudor_dark_oak_ochre_plaster_right",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_OCHRE_PLASTER_HORIZONTAL_1 = registerBlock("tudor_dark_oak_ochre_plaster_horizontal_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_OCHRE_PLASTER_HORIZONTAL_2 = registerBlock("tudor_dark_oak_ochre_plaster_horizontal_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_OCHRE_PLASTER_VERTICAL_1 = registerBlock("tudor_dark_oak_ochre_plaster_vertical_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_OCHRE_PLASTER_VERTICAL_2 = registerBlock("tudor_dark_oak_ochre_plaster_vertical_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));

    public static final RegistryObject<Block> TUDOR_JUNGLE_OCHRE_PLASTER_CROSS = registerBlock("tudor_jungle_ochre_plaster_cross",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_OCHRE_PLASTER_DOWN = registerBlock("tudor_jungle_ochre_plaster_down",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_OCHRE_PLASTER_UP = registerBlock("tudor_jungle_ochre_plaster_up",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_OCHRE_PLASTER_LEFT = registerBlock("tudor_jungle_ochre_plaster_left",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_OCHRE_PLASTER_RIGHT = registerBlock("tudor_jungle_ochre_plaster_right",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_OCHRE_PLASTER_HORIZONTAL_1 = registerBlock("tudor_jungle_ochre_plaster_horizontal_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_OCHRE_PLASTER_HORIZONTAL_2 = registerBlock("tudor_jungle_ochre_plaster_horizontal_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_OCHRE_PLASTER_VERTICAL_1 = registerBlock("tudor_jungle_ochre_plaster_vertical_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_OCHRE_PLASTER_VERTICAL_2 = registerBlock("tudor_jungle_ochre_plaster_vertical_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));

    public static final RegistryObject<Block> TUDOR_OAK_OCHRE_PLASTER_CROSS = registerBlock("tudor_oak_ochre_plaster_cross",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_OCHRE_PLASTER_DOWN = registerBlock("tudor_oak_ochre_plaster_down",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_OCHRE_PLASTER_UP = registerBlock("tudor_oak_ochre_plaster_up",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_OCHRE_PLASTER_LEFT = registerBlock("tudor_oak_ochre_plaster_left",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_OCHRE_PLASTER_RIGHT = registerBlock("tudor_oak_ochre_plaster_right",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_OCHRE_PLASTER_HORIZONTAL_1 = registerBlock("tudor_oak_ochre_plaster_horizontal_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_OCHRE_PLASTER_HORIZONTAL_2 = registerBlock("tudor_oak_ochre_plaster_horizontal_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_OCHRE_PLASTER_VERTICAL_1 = registerBlock("tudor_oak_ochre_plaster_vertical_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_OCHRE_PLASTER_VERTICAL_2 = registerBlock("tudor_oak_ochre_plaster_vertical_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));

    public static final RegistryObject<Block> TUDOR_SPRUCE_OCHRE_PLASTER_CROSS = registerBlock("tudor_spruce_ochre_plaster_cross",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_OCHRE_PLASTER_DOWN = registerBlock("tudor_spruce_ochre_plaster_down",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_OCHRE_PLASTER_UP = registerBlock("tudor_spruce_ochre_plaster_up",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_OCHRE_PLASTER_LEFT = registerBlock("tudor_spruce_ochre_plaster_left",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_OCHRE_PLASTER_RIGHT = registerBlock("tudor_spruce_ochre_plaster_right",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_OCHRE_PLASTER_HORIZONTAL_1 = registerBlock("tudor_spruce_ochre_plaster_horizontal_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_OCHRE_PLASTER_HORIZONTAL_2 = registerBlock("tudor_spruce_ochre_plaster_horizontal_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_OCHRE_PLASTER_VERTICAL_1 = registerBlock("tudor_spruce_ochre_plaster_vertical_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_OCHRE_PLASTER_VERTICAL_2 = registerBlock("tudor_spruce_ochre_plaster_vertical_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));

    /* Tan Plaster Half-Timbered Blocks */
    public static final RegistryObject<Block> TUDOR_ACACIA_TAN_PLASTER_CROSS = registerBlock("tudor_acacia_tan_plaster_cross",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_TAN_PLASTER_DOWN = registerBlock("tudor_acacia_tan_plaster_down",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_TAN_PLASTER_UP = registerBlock("tudor_acacia_tan_plaster_up",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_TAN_PLASTER_LEFT = registerBlock("tudor_acacia_tan_plaster_left",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_TAN_PLASTER_RIGHT = registerBlock("tudor_acacia_tan_plaster_right",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_TAN_PLASTER_HORIZONTAL_1 = registerBlock("tudor_acacia_tan_plaster_horizontal_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_TAN_PLASTER_HORIZONTAL_2 = registerBlock("tudor_acacia_tan_plaster_horizontal_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_TAN_PLASTER_VERTICAL_1 = registerBlock("tudor_acacia_tan_plaster_vertical_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_TAN_PLASTER_VERTICAL_2 = registerBlock("tudor_acacia_tan_plaster_vertical_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));

    public static final RegistryObject<Block> TUDOR_BIRCH_TAN_PLASTER_CROSS = registerBlock("tudor_birch_tan_plaster_cross",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_TAN_PLASTER_DOWN = registerBlock("tudor_birch_tan_plaster_down",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_TAN_PLASTER_UP = registerBlock("tudor_birch_tan_plaster_up",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_TAN_PLASTER_LEFT = registerBlock("tudor_birch_tan_plaster_left",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_TAN_PLASTER_RIGHT = registerBlock("tudor_birch_tan_plaster_right",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_TAN_PLASTER_HORIZONTAL_1 = registerBlock("tudor_birch_tan_plaster_horizontal_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_TAN_PLASTER_HORIZONTAL_2 = registerBlock("tudor_birch_tan_plaster_horizontal_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_TAN_PLASTER_VERTICAL_1 = registerBlock("tudor_birch_tan_plaster_vertical_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_TAN_PLASTER_VERTICAL_2 = registerBlock("tudor_birch_tan_plaster_vertical_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));

    public static final RegistryObject<Block> TUDOR_DARK_OAK_TAN_PLASTER_CROSS = registerBlock("tudor_dark_oak_tan_plaster_cross",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_TAN_PLASTER_DOWN = registerBlock("tudor_dark_oak_tan_plaster_down",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_TAN_PLASTER_UP = registerBlock("tudor_dark_oak_tan_plaster_up",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_TAN_PLASTER_LEFT = registerBlock("tudor_dark_oak_tan_plaster_left",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_TAN_PLASTER_RIGHT = registerBlock("tudor_dark_oak_tan_plaster_right",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_TAN_PLASTER_HORIZONTAL_1 = registerBlock("tudor_dark_oak_tan_plaster_horizontal_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_TAN_PLASTER_HORIZONTAL_2 = registerBlock("tudor_dark_oak_tan_plaster_horizontal_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_TAN_PLASTER_VERTICAL_1 = registerBlock("tudor_dark_oak_tan_plaster_vertical_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_TAN_PLASTER_VERTICAL_2 = registerBlock("tudor_dark_oak_tan_plaster_vertical_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));

    public static final RegistryObject<Block> TUDOR_JUNGLE_TAN_PLASTER_CROSS = registerBlock("tudor_jungle_tan_plaster_cross",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_TAN_PLASTER_DOWN = registerBlock("tudor_jungle_tan_plaster_down",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_TAN_PLASTER_UP = registerBlock("tudor_jungle_tan_plaster_up",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_TAN_PLASTER_LEFT = registerBlock("tudor_jungle_tan_plaster_left",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_TAN_PLASTER_RIGHT = registerBlock("tudor_jungle_tan_plaster_right",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_TAN_PLASTER_HORIZONTAL_1 = registerBlock("tudor_jungle_tan_plaster_horizontal_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_TAN_PLASTER_HORIZONTAL_2 = registerBlock("tudor_jungle_tan_plaster_horizontal_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_TAN_PLASTER_VERTICAL_1 = registerBlock("tudor_jungle_tan_plaster_vertical_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_TAN_PLASTER_VERTICAL_2 = registerBlock("tudor_jungle_tan_plaster_vertical_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));

    public static final RegistryObject<Block> TUDOR_OAK_TAN_PLASTER_CROSS = registerBlock("tudor_oak_tan_plaster_cross",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_TAN_PLASTER_DOWN = registerBlock("tudor_oak_tan_plaster_down",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_TAN_PLASTER_UP = registerBlock("tudor_oak_tan_plaster_up",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_TAN_PLASTER_LEFT = registerBlock("tudor_oak_tan_plaster_left",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_TAN_PLASTER_RIGHT = registerBlock("tudor_oak_tan_plaster_right",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_TAN_PLASTER_HORIZONTAL_1 = registerBlock("tudor_oak_tan_plaster_horizontal_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_TAN_PLASTER_HORIZONTAL_2 = registerBlock("tudor_oak_tan_plaster_horizontal_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_TAN_PLASTER_VERTICAL_1 = registerBlock("tudor_oak_tan_plaster_vertical_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_TAN_PLASTER_VERTICAL_2 = registerBlock("tudor_oak_tan_plaster_vertical_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));

    public static final RegistryObject<Block> TUDOR_SPRUCE_TAN_PLASTER_CROSS = registerBlock("tudor_spruce_tan_plaster_cross",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_TAN_PLASTER_DOWN = registerBlock("tudor_spruce_tan_plaster_down",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_TAN_PLASTER_UP = registerBlock("tudor_spruce_tan_plaster_up",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_TAN_PLASTER_LEFT = registerBlock("tudor_spruce_tan_plaster_left",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_TAN_PLASTER_RIGHT = registerBlock("tudor_spruce_tan_plaster_right",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_TAN_PLASTER_HORIZONTAL_1 = registerBlock("tudor_spruce_tan_plaster_horizontal_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_TAN_PLASTER_HORIZONTAL_2 = registerBlock("tudor_spruce_tan_plaster_horizontal_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_TAN_PLASTER_VERTICAL_1 = registerBlock("tudor_spruce_tan_plaster_vertical_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_TAN_PLASTER_VERTICAL_2 = registerBlock("tudor_spruce_tan_plaster_vertical_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));

    /* White Plaster Half-Timbered Blocks */
    public static final RegistryObject<Block> TUDOR_ACACIA_WHITE_PLASTER_CROSS = registerBlock("tudor_acacia_white_plaster_cross",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_WHITE_PLASTER_DOWN = registerBlock("tudor_acacia_white_plaster_down",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_WHITE_PLASTER_UP = registerBlock("tudor_acacia_white_plaster_up",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_WHITE_PLASTER_LEFT = registerBlock("tudor_acacia_white_plaster_left",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_WHITE_PLASTER_RIGHT = registerBlock("tudor_acacia_white_plaster_right",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_WHITE_PLASTER_HORIZONTAL_1 = registerBlock("tudor_acacia_white_plaster_horizontal_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_WHITE_PLASTER_HORIZONTAL_2 = registerBlock("tudor_acacia_white_plaster_horizontal_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_WHITE_PLASTER_VERTICAL_1 = registerBlock("tudor_acacia_white_plaster_vertical_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_ACACIA_WHITE_PLASTER_VERTICAL_2 = registerBlock("tudor_acacia_white_plaster_vertical_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));

    public static final RegistryObject<Block> TUDOR_BIRCH_WHITE_PLASTER_CROSS = registerBlock("tudor_birch_white_plaster_cross",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_WHITE_PLASTER_DOWN = registerBlock("tudor_birch_white_plaster_down",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_WHITE_PLASTER_UP = registerBlock("tudor_birch_white_plaster_up",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_WHITE_PLASTER_LEFT = registerBlock("tudor_birch_white_plaster_left",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_WHITE_PLASTER_RIGHT = registerBlock("tudor_birch_white_plaster_right",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_WHITE_PLASTER_HORIZONTAL_1 = registerBlock("tudor_birch_white_plaster_horizontal_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_WHITE_PLASTER_HORIZONTAL_2 = registerBlock("tudor_birch_white_plaster_horizontal_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_WHITE_PLASTER_VERTICAL_1 = registerBlock("tudor_birch_white_plaster_vertical_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_BIRCH_WHITE_PLASTER_VERTICAL_2 = registerBlock("tudor_birch_white_plaster_vertical_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));

    public static final RegistryObject<Block> TUDOR_DARK_OAK_WHITE_PLASTER_CROSS = registerBlock("tudor_dark_oak_white_plaster_cross",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_WHITE_PLASTER_DOWN = registerBlock("tudor_dark_oak_white_plaster_down",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_WHITE_PLASTER_UP = registerBlock("tudor_dark_oak_white_plaster_up",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_WHITE_PLASTER_LEFT = registerBlock("tudor_dark_oak_white_plaster_left",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_WHITE_PLASTER_RIGHT = registerBlock("tudor_dark_oak_white_plaster_right",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_WHITE_PLASTER_HORIZONTAL_1 = registerBlock("tudor_dark_oak_white_plaster_horizontal_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_WHITE_PLASTER_HORIZONTAL_2 = registerBlock("tudor_dark_oak_white_plaster_horizontal_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_WHITE_PLASTER_VERTICAL_1 = registerBlock("tudor_dark_oak_white_plaster_vertical_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_DARK_OAK_WHITE_PLASTER_VERTICAL_2 = registerBlock("tudor_dark_oak_white_plaster_vertical_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));

    public static final RegistryObject<Block> TUDOR_JUNGLE_WHITE_PLASTER_CROSS = registerBlock("tudor_jungle_white_plaster_cross",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_WHITE_PLASTER_DOWN = registerBlock("tudor_jungle_white_plaster_down",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_WHITE_PLASTER_UP = registerBlock("tudor_jungle_white_plaster_up",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_WHITE_PLASTER_LEFT = registerBlock("tudor_jungle_white_plaster_left",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_WHITE_PLASTER_RIGHT = registerBlock("tudor_jungle_white_plaster_right",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_WHITE_PLASTER_HORIZONTAL_1 = registerBlock("tudor_jungle_white_plaster_horizontal_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_WHITE_PLASTER_HORIZONTAL_2 = registerBlock("tudor_jungle_white_plaster_horizontal_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_WHITE_PLASTER_VERTICAL_1 = registerBlock("tudor_jungle_white_plaster_vertical_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_JUNGLE_WHITE_PLASTER_VERTICAL_2 = registerBlock("tudor_jungle_white_plaster_vertical_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));

    public static final RegistryObject<Block> TUDOR_OAK_WHITE_PLASTER_CROSS = registerBlock("tudor_oak_white_plaster_cross",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_WHITE_PLASTER_DOWN = registerBlock("tudor_oak_white_plaster_down",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_WHITE_PLASTER_UP = registerBlock("tudor_oak_white_plaster_up",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_WHITE_PLASTER_LEFT = registerBlock("tudor_oak_white_plaster_left",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_WHITE_PLASTER_RIGHT = registerBlock("tudor_oak_white_plaster_right",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_WHITE_PLASTER_HORIZONTAL_1 = registerBlock("tudor_oak_white_plaster_horizontal_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_WHITE_PLASTER_HORIZONTAL_2 = registerBlock("tudor_oak_white_plaster_horizontal_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_WHITE_PLASTER_VERTICAL_1 = registerBlock("tudor_oak_white_plaster_vertical_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_OAK_WHITE_PLASTER_VERTICAL_2 = registerBlock("tudor_oak_white_plaster_vertical_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));

    public static final RegistryObject<Block> TUDOR_SPRUCE_WHITE_PLASTER_CROSS = registerBlock("tudor_spruce_white_plaster_cross",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_WHITE_PLASTER_DOWN = registerBlock("tudor_spruce_white_plaster_down",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_WHITE_PLASTER_UP = registerBlock("tudor_spruce_white_plaster_up",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_WHITE_PLASTER_LEFT = registerBlock("tudor_spruce_white_plaster_left",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_WHITE_PLASTER_RIGHT = registerBlock("tudor_spruce_white_plaster_right",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_WHITE_PLASTER_HORIZONTAL_1 = registerBlock("tudor_spruce_white_plaster_horizontal_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_WHITE_PLASTER_HORIZONTAL_2 = registerBlock("tudor_spruce_white_plaster_horizontal_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_WHITE_PLASTER_VERTICAL_1 = registerBlock("tudor_spruce_white_plaster_vertical_1",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));
    public static final RegistryObject<Block> TUDOR_SPRUCE_WHITE_PLASTER_VERTICAL_2 = registerBlock("tudor_spruce_white_plaster_vertical_2",
            () -> new DirectionalBlock(BlockProps.HALF_TIMBERED.get()));

    public static void printCounts() {
        System.out.println("Caliber Blocks Registered: " + blockCount);
    }
    
    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn); //CreativeTabs.CALIBER_TAB
        blockCount++;
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(CreativeTabs.CALIBER_TAB)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
