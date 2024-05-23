package com.calibermc.buildify.world.inventory;

import com.calibermc.buildify.Buildify;
import net.mehvahdjukaar.moonlight.api.misc.RegSupplier;
import net.mehvahdjukaar.moonlight.api.platform.RegHelper;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class ModMenuTypes {

    public static final Supplier<MenuType<BlockPickerMenu>> BLOCK_TYPE = register("block_type", BlockPickerMenu::new);

    private static <T extends AbstractContainerMenu> RegSupplier<MenuType<T>> register(String name, BiFunction<Integer, Inventory, T> factory) {
        return RegHelper.registerMenuType(new ResourceLocation(Buildify.MOD_ID, name), (i, inv, buf) -> factory.apply(i, inv));
    }

    public static void init() {

    }
}
