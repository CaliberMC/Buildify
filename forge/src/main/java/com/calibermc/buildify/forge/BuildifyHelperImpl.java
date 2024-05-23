package com.calibermc.buildify.forge;

import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraftforge.common.ForgeMod;

public class BuildifyHelperImpl {
    public static Attribute[] getAttributes() {
        return new Attribute[]{ForgeMod.BLOCK_REACH.get(), ForgeMod.ENTITY_REACH.get()};
    }
}
