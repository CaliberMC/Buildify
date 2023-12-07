package com.calibermc.buildify.item;

import com.calibermc.buildify.Buildify;
import com.calibermc.buildify.item.custom.Hammer;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Buildify.MOD_ID);

    public static final RegistryObject<Hammer> HAMMER = ITEMS.register("hammer",
            () -> new Hammer(new Item.Properties().tab(CreativeTabs.BUILDIFY_TAB)));

    public static final RegistryObject<Hammer> NAILS = ITEMS.register("nails",
            () -> new Hammer(new Item.Properties().tab(CreativeTabs.BUILDIFY_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
