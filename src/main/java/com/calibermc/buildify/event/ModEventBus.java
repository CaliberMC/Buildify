package com.calibermc.buildify.event;

import com.calibermc.buildify.Buildify;
import com.calibermc.buildify.client.BlockPickerScreen;
import com.calibermc.buildify.command.BuildifyCommands;
import com.calibermc.buildify.config.CommonConfigs;
import com.calibermc.buildify.util.BlockPickerStatesJson;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.neoforge.event.AddReloadListenerEvent;
import net.neoforged.neoforge.event.RegisterCommandsEvent;

import javax.annotation.Nullable;
import java.util.Collection;

import static com.calibermc.buildify.world.inventory.ModMenuTypes.BLOCK_TYPE;

@Mod.EventBusSubscriber(modid = Buildify.MOD_ID)
public class ModEventBus {


    public static void hammerInteraction(CompoundTag tag, ServerPlayer pPlayer, BlockState pStateClicked, LevelAccessor pAccessor, BlockPos pPos, boolean pShouldCycleState) {
        Block block = pStateClicked.getBlock();
        Collection<Property<?>> collection = block.getStateDefinition().getProperties();
        ResourceLocation key = BuiltInRegistries.BLOCK.getKey(block);
        assert key != null;
        String s = "block.%s.%s".formatted(key.getNamespace(), key.getPath());
        if (collection.isEmpty()) {
            pPlayer.sendSystemMessage(Component.translatable("item.minecraft.debug_stick.empty", s), true);
        } else {
            Property<?> property = block.getStateDefinition().getProperty(tag.getString(s));
            if (pShouldCycleState) {
                if (property == null) {
                    property = collection.iterator().next();
                }

                BlockState blockstate = cycleState(pStateClicked, property, pPlayer.isSecondaryUseActive());
                pAccessor.setBlock(pPos, blockstate, 18);
                pPlayer.sendSystemMessage(Component.translatable("item.minecraft.debug_stick.update", property.getName(), propertyName(blockstate, property)), true);
            } else {
                property = nextProperty(collection, property, pPlayer.isSecondaryUseActive());
                String s2 = property.getName();
                tag.putString(s, s2);
                pPlayer.sendSystemMessage(Component.translatable("item.minecraft.debug_stick.select", s2, propertyName(pStateClicked, property)), true);
            }

        }
    }

    private static <T extends Comparable<T>> BlockState cycleState(BlockState pState, Property<T> pProperty, boolean pBackwards) {
        return pState.setValue(pProperty, nextProperty(pProperty.getPossibleValues(), pState.getValue(pProperty), pBackwards));
    }

    private static <T> T nextProperty(Iterable<T> allowedValues, @Nullable T currentValue, boolean backwards) {
        return backwards ? Util.findPreviousInIterable(allowedValues, currentValue) : Util.findNextInIterable(allowedValues, currentValue);
    }

    private static <T extends Comparable<T>> String propertyName(BlockState state, Property<T> property) {
        return property.getName(state.getValue(property));
    }

    @SubscribeEvent
    public static void registerCommands(RegisterCommandsEvent event) {
        boolean disbaleCommands = CommonConfigs.DISABLE_ALL_ADDED_OP_COMMANDS.get();
        if (!disbaleCommands) {
            BuildifyCommands.register(event.getDispatcher());
        }
    }

    @SubscribeEvent
    public static void addReloadListener(AddReloadListenerEvent event) {
        event.addListener(new BlockPickerStatesJson());
    }

    // TODO: Work on this ModMenuTypes.java ModClientEventBus and BlockPickerScreen.java
    @SubscribeEvent
    private void registerScreens(RegisterMenuScreensEvent event) {
        event.register(BLOCK_TYPE.get(), BlockPickerMenu::new);
    }
}
