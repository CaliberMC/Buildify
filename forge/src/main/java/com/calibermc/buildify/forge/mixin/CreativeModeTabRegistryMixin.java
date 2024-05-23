package com.calibermc.buildify.forge.mixin;

import com.calibermc.buildify.item.ModCreativeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.CreativeModeTabRegistry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(value = CreativeModeTabRegistry.class, remap = false)
public abstract class CreativeModeTabRegistryMixin {
    @Inject(at = @At("RETURN"), method = "getSortedCreativeModeTabs", cancellable = true)
    private static void mixin$recalculateItemCreativeModeTabs(CallbackInfoReturnable<List<CreativeModeTab>> cir) {
        if (cir.getReturnValue() != null && !cir.getReturnValue().isEmpty()) {
            cir.setReturnValue(ModCreativeTabs.setupCreativeTabs(cir.getReturnValue()));
        }
    }
}
