package com.calibermc.buildify.util;

import com.calibermc.buildify.Buildify;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.Slot;
import org.apache.commons.compress.utils.Lists;
import org.spongepowered.asm.mixin.Unique;

import java.util.List;

public interface IInvScreenExtended {
    ResourceLocation INV = new ResourceLocation(Buildify.MOD_ID, "textures/gui/inventory.png");

    int buildify$lineOfSlots();

    @Unique
    default List<Slot> buildify$hoveredSlots() {
        List<Slot> slots = Lists.newArrayList();
        if (buildify$lineOfSlots() != -1) {
            for (int k = 0; k < 9; ++k) {
                int i = k + (this.buildify$lineOfSlots() + 1) * 9;
                slots.add(((AbstractContainerScreen<?>) this).getMenu().slots.get(i));
            }
        }
        return slots;
    }
}
