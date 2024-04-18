package com.calibermc.buildify.datagen;

import com.calibermc.buildify.Buildify;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

import static com.calibermc.buildify.util.compat.ModCompats.compatMODID;

public class BuildifyBlockTagProvider extends ModBlockTagProvider {
    public BuildifyBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Buildify.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        for (String modid : compatMODID) {
            this.modid = modid;
            super.addTags(pProvider);
        }
    }
}



