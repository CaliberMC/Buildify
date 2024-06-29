package com.calibermc.buildify.fabric.mixin;

import com.calibermc.buildify.item.ModCreativeTabs;
import net.fabricmc.fabric.impl.client.itemgroup.FabricCreativeGuiComponents;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroup;
import net.fabricmc.fabric.mixin.itemgroup.ItemGroupAccessor;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.List;

@Mixin(value = CreativeModeTabs.class)
public abstract class CreativeModeTabsMixin {

    @Inject(at = @At("RETURN"), method = "tabs", cancellable = true)
    private static void mixin$recalculateTabs(CallbackInfoReturnable<List<CreativeModeTab>> cir) {
        if (cir.getReturnValue() != null) {
            var list = cir.getReturnValue();
            if (!list.isEmpty()) {
                cir.setReturnValue(CreativeModeTabs.allTabs().stream().filter(CreativeModeTab::shouldDisplay).toList());
            }
        }
    }

    @Inject(at = @At("RETURN"), method = "allTabs", cancellable = true)
    private static void mixin$recalculateAllTabs(CallbackInfoReturnable<List<CreativeModeTab>> cir) {
        if (cir.getReturnValue() != null) {
            var list = cir.getReturnValue();
            if (!list.isEmpty()) {
                List<CreativeModeTab> tabs = ModCreativeTabs.setupCreativeTabs(list);
                tabs.addAll(FabricCreativeGuiComponents.COMMON_GROUPS);
                int count = 0;
                int TABS_PER_PAGE = 10;
                for (CreativeModeTab itemGroup : tabs) {
                    final FabricItemGroup fabricItemGroup = (FabricItemGroup) itemGroup;
                    if (FabricCreativeGuiComponents.COMMON_GROUPS.contains(itemGroup)) {
                        fabricItemGroup.setPage(0);
                        continue;
                    }

                    final ItemGroupAccessor itemGroupAccessor = (ItemGroupAccessor) itemGroup;
                    fabricItemGroup.setPage(count / TABS_PER_PAGE);
                    int pageIndex = count % TABS_PER_PAGE;
                    CreativeModeTab.Row row = pageIndex < (TABS_PER_PAGE / 2) ? CreativeModeTab.Row.TOP : CreativeModeTab.Row.BOTTOM;
                    itemGroupAccessor.setRow(row);
                    itemGroupAccessor.setColumn(row == CreativeModeTab.Row.TOP ? pageIndex % TABS_PER_PAGE : (pageIndex - TABS_PER_PAGE / 2) % (TABS_PER_PAGE));
                    count++;
                }
                cir.setReturnValue(tabs);
            }
        }
    }

    @Inject(at = @At("RETURN"), method = "getDefaultTab", cancellable = true)
    private static void mixin$getFirstTab(CallbackInfoReturnable<CreativeModeTab> cir) {
        if (cir.getReturnValue() != null) {
            var list = CreativeModeTabs.tabs();
            if (!list.isEmpty()) {
                cir.setReturnValue(list.get(0));
            }
        }
    }
}
