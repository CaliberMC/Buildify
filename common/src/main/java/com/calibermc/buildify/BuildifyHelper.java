package com.calibermc.buildify;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.world.entity.ai.attributes.Attribute;

public class BuildifyHelper {
    @ExpectPlatform
    public static Attribute[] getAttributes() {
        throw new AssertionError();
    }
}
