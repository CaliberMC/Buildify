package com.calibermc.buildify;


import com.calibermc.buildify.config.ClientConfigs;
import com.calibermc.buildify.config.CommonConfigs;
import com.calibermc.buildify.item.ModCreativeTabs;
import com.calibermc.buildify.item.ModItems;
import com.calibermc.buildify.networking.ModNetworking;
import com.calibermc.buildify.world.inventory.ModMenuTypes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Buildify.MOD_ID)
public class Buildify {
    public static final String MOD_ID = "buildify";

    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();

    public Buildify(FMLJavaModLoadingContext context) {
        IEventBus eventBus = context.getModEventBus();

        ModItems.register(eventBus);
        ModMenuTypes.register(eventBus);
        ModCreativeTabs.register(eventBus);

        eventBus.addListener(this::setup);

        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, ClientConfigs.SPEC, "buildify-client.toml");
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, CommonConfigs.SPEC, "buildify-common.toml");
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("Loading Buildify Mod");
        ModNetworking.registerMessages();
    }
}
