package com.calibermc.buildify.datagen;

import com.calibermc.buildify.Buildify;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = Buildify.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        boolean run = true;

        // BlockStates, Loot and Models
//        generator.addProvider(event.includeClient(), new CaliberBlockStateProvider(generator, existingFileHelper));
//        generator.addProvider(event.includeClient(), new CaliberItemModelProvider(generator, existingFileHelper));
//        generator.addProvider(event.includeServer(), new ModLootTableProvider(generator, CaliberBlockLootTables::new));
//        // Recipes
//        generator.addProvider(event.includeServer(), new CaliberRecipeProvider(generator));
//        generator.addProvider(event.includeServer(), new MiscRecipeProvider(generator));
//        generator.addProvider(event.includeServer(), new ItemRecipeProvider(generator));

        // Tags
//        ModBlockTagProvider blockTagGenerator = generator.addProvider(event.includeServer(), new ModBlockTagProvider(packOutput, lookupProvider, existingFileHelper));
//        generator.addProvider(event.includeServer(), new ModItemTagProvider(packOutput, lookupProvider, blockTagGenerator.contentsGetter(), existingFileHelper));

        BlockTagsProvider blockTagsProvider = new BuildifyBlockTagProvider(packOutput, lookupProvider, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new BuildifyItemTagProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));

    }
}
