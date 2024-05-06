package com.calibermc.buildify.world.inventory;

import com.calibermc.buildify.Buildify;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


public class ModMenuTypes {

    // FIXME
    /* This is all messed up...  Found a new method that uses RegisterMenuScreensEvent
    * to register the screens but I cannot find any new info on the Menus.
    *
    * // Event is listened to on the mod event bus
    * private void registerScreens(RegisterMenuScreensEvent event) {
    * event.register(MY_MENU.get(), MyContainerScreen::new);
    * }
    * */

    public static final DeferredRegister<MenuType<?>> CONTAINERS = DeferredRegister.create(BuiltInRegistries.MENU, Buildify.MOD_ID);

    public static final DeferredHolder<MenuType<?>, MenuType<AbstractContainerMenu>> BLOCK_TYPE = register("block_type", BlockPickerMenu::new);

    private static <T extends AbstractContainerMenu> DeferredHolder<MenuType<?>, MenuType<T>> register(String name, MenuType.MenuSupplier<T> factory) {
        return CONTAINERS.register(name, () -> new MenuType<>(factory, FeatureFlagSet.of()));
    }

    public static void register(IEventBus modEventBus) {
        CONTAINERS.register(modEventBus);
    }
}
