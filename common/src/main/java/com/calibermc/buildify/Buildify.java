package com.calibermc.buildify;

import com.calibermc.buildify.config.ClientConfigs;
import com.calibermc.buildify.config.CommonConfigs;
import com.calibermc.buildify.event.ModEventBus;
import com.calibermc.buildify.item.ModCreativeTabs;
import com.calibermc.buildify.item.ModItems;
import com.calibermc.buildify.networking.ModNetworking;
import com.calibermc.buildify.world.inventory.ModMenuTypes;
import dev.architectury.injectables.annotations.ExpectPlatform;
import net.mehvahdjukaar.moonlight.api.misc.RegSupplier;
import net.mehvahdjukaar.moonlight.api.platform.PlatHelper;
import net.mehvahdjukaar.moonlight.api.platform.RegHelper;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.RangedAttribute;
import net.minecraft.world.entity.player.Player;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Supplier;

public class Buildify {
    public static final String MOD_ID = "buildify";
    public static final Logger LOGGER = LogManager.getLogger();

    public static final Attribute REACH_DISTANCE_ATTRIBUTE = new RangedAttribute("%s.reach_distance".formatted(Buildify.MOD_ID), 0.0D, 0.0D, 1024.0D).setSyncable(true);
    public static RegSupplier<Attribute> REACH_DISTANCE = RegHelper.register(new ResourceLocation(Buildify.MOD_ID, "reach_distance"), () -> Buildify.REACH_DISTANCE_ATTRIBUTE, Registries.ATTRIBUTE);

    public static void init() {
        ModItems.init();
        ModMenuTypes.init();
        ModCreativeTabs.init();
        ModEventBus.init();

        ModNetworking.init();
        LOGGER.info("Loading Buildify Mod");

        ClientConfigs.init();
        CommonConfigs.init();
        if (PlatHelper.getPhysicalSide().isClient()) {
            BuildifyClient.init();
        }
    }
}
