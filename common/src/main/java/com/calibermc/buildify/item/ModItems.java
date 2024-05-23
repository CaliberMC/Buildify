package com.calibermc.buildify.item;

import com.calibermc.buildify.Buildify;
import com.calibermc.buildify.item.custom.Hammer;
import net.mehvahdjukaar.moonlight.api.misc.RegSupplier;
import net.mehvahdjukaar.moonlight.api.platform.RegHelper;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

import static net.minecraft.world.item.Rarity.COMMON;

public class ModItems {
    public static final RegSupplier<Hammer> HAMMER = RegHelper.registerItem(new ResourceLocation(Buildify.MOD_ID, "hammer"),
            () -> new Hammer(new Item.Properties().stacksTo(1).rarity(COMMON)));

    public static final RegSupplier<Item> NAILS = RegHelper.registerItem(new ResourceLocation(Buildify.MOD_ID, "nails"),
            () -> new Item(new Item.Properties()));

    public static void init() {
    }
}
