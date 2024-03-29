package com.calibermc.buildify.item;

import com.calibermc.buildify.Buildify;
import com.calibermc.buildify.item.custom.Hammer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraft.world.item.Rarity.COMMON;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Buildify.MOD_ID);

    public static final RegistryObject<Hammer> HAMMER = ITEMS.register("hammer",
            () -> new Hammer(new Item.Properties().stacksTo(1).rarity(COMMON)));

    public static final RegistryObject<Item> NAILS = ITEMS.register("nails",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
