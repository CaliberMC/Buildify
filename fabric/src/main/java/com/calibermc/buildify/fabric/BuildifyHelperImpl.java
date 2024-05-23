package com.calibermc.buildify.fabric;

import com.jamieswhiteshirt.reachentityattributes.ReachEntityAttributes;
import net.minecraft.world.entity.ai.attributes.Attribute;

public class BuildifyHelperImpl {

    public static Attribute[] getAttributes() {
        return new Attribute[]{ReachEntityAttributes.REACH, ReachEntityAttributes.ATTACK_RANGE};
    }
}
