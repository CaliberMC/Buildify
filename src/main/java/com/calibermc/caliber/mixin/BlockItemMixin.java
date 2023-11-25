package com.calibermc.caliber.mixin;

import com.calibermc.caliber.block.custom.SlabLayerBlock;
import com.calibermc.caliber.block.custom.VerticalSlabLayerBlock;
import com.calibermc.caliber.config.CaliberCommonConfigs;
import com.calibermc.caliber.util.ModBlockStateProperties;
import com.calibermc.caliber.util.player.IPlayerExtended;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockItem.class)
public class BlockItemMixin {

    @Inject(method = "getPlacementState(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", at = @At("RETURN"), cancellable = true)
    public void mixin$getPlacementState(BlockPlaceContext pContext, CallbackInfoReturnable<BlockState> cir) {
        if (pContext.getPlayer() instanceof IPlayerExtended ex) {
            BlockState state = cir.getReturnValue();
            if ((state.hasProperty(BlockStateProperties.LAYERS) || state.hasProperty(ModBlockStateProperties.FIVE_LAYERS)) && pContext.getPlayer() instanceof ServerPlayer) {
                boolean slab = CaliberCommonConfigs.MODE_BLOCKSTATE.get() == 0;
                if (ex.caliber$additionalPressed()) {
                    slab = !slab;
                }
                if (slab) {
                    int oldSlabVal = state.getValue(state.hasProperty(ModBlockStateProperties.FIVE_LAYERS) ?
                            ModBlockStateProperties.FIVE_LAYERS : BlockStateProperties.LAYERS);
                    int slabVal = 3;
                    if (state.getBlock() instanceof SlabLayerBlock || state.getBlock() instanceof VerticalSlabLayerBlock) {
                        slabVal = 4;
                    }
                    if (oldSlabVal != slabVal) {
                        cir.setReturnValue(state.setValue(state.hasProperty(ModBlockStateProperties.FIVE_LAYERS) ?
                                ModBlockStateProperties.FIVE_LAYERS : BlockStateProperties.LAYERS, slabVal));
                    }
                }
            }
        }
    }
}
