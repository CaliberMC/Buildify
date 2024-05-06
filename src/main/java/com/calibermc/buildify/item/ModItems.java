package com.calibermc.buildify.item;

import com.calibermc.buildify.Buildify;
import com.calibermc.buildify.item.custom.Hammer;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;


import static net.minecraft.world.item.Rarity.COMMON;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(BuiltInRegistries.ITEM, Buildify.MOD_ID);

    public static final DeferredHolder<Item, Hammer> HAMMER = ITEMS.register("hammer",
            () -> new Hammer(new Item.Properties().stacksTo(1).rarity(COMMON)));

    public static final DeferredHolder<Item, Item> NAILS = ITEMS.register("nails",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}
