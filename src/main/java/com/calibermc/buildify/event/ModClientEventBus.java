package com.calibermc.buildify.event;


import com.calibermc.buildify.Buildify;
import com.calibermc.buildify.client.AdjustReachOverlay;
import com.calibermc.buildify.client.BlockPickerScreen;
import com.calibermc.buildify.mixin.MinecraftAccessor;
import com.calibermc.buildify.networking.ModNetworking;
import com.calibermc.buildify.networking.ServerOpenBlockPickerMenu;
import com.calibermc.buildify.world.inventory.ModMenuTypes;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterGuiOverlaysEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.client.gui.overlay.VanillaGuiOverlay;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.lwjgl.glfw.GLFW;

import static com.calibermc.buildify.Buildify.MOD_ID;


@Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModClientEventBus {

    public static final KeyMapping BLOCK_PICKER = new KeyMapping("%s.key.block_picker_screen".formatted(Buildify.MOD_ID), GLFW.GLFW_KEY_V, "key.categories.%s".formatted(Buildify.MOD_ID));
    public static final KeyMapping COPY_BLOCK = new KeyMapping("%s.key.copy_block".formatted(Buildify.MOD_ID), GLFW.GLFW_KEY_B, "key.categories.%s".formatted(Buildify.MOD_ID));
    public static final KeyMapping ADJUST_REACH = new KeyMapping("%s.key.adjust_reach".formatted(Buildify.MOD_ID), GLFW.GLFW_KEY_N, "key.categories.%s".formatted(Buildify.MOD_ID));

    @SubscribeEvent
    public static void registerArmorRenderers(final EntityRenderersEvent.AddLayers event) {

    }

    @SubscribeEvent
    public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {

    }

    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event) {

        MenuScreens.register(ModMenuTypes.BLOCK_TYPE.get(), BlockPickerScreen::new);

    }

    @SubscribeEvent
    public static void registerKeyBinding(final RegisterKeyMappingsEvent event) {
        event.register(BLOCK_PICKER);
        event.register(ADJUST_REACH);
        event.register(COPY_BLOCK);
    }

    @SubscribeEvent
    public static void registerGuiOverlay(final RegisterGuiOverlaysEvent event) {
        event.registerAbove(VanillaGuiOverlay.HELMET.id(), "adjust_distance", new AdjustReachOverlay());
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
    public static class Client {

        /**
         * LEFT_CONTROL + MIDDLE CLICK instead of or in addition to the keybind.
         */
        @SubscribeEvent
        public static void mouseInput(final InputEvent.MouseButton.Pre event) {
            Minecraft mc = Minecraft.getInstance();
            if (mc.player == null || mc.screen != null) return;
            if (event.getButton() == GLFW.GLFW_MOUSE_BUTTON_MIDDLE && event.getModifiers() == GLFW.GLFW_MOD_CONTROL) {
                if (mc.hitResult != null && mc.hitResult.getType() == HitResult.Type.BLOCK && mc.player.isCreative()) {
                    onPickBlock(mc.hitResult, mc.player, mc.level);
                    event.setCanceled(true);
                }
            }
        }

        @SubscribeEvent
        public static void keyInput(final InputEvent.Key event) {
            Minecraft mc = Minecraft.getInstance();
            if (mc.player == null || mc.screen != null) return;
            if (BLOCK_PICKER.consumeClick() && !mc.player.getMainHandItem().isEmpty() && mc.player.isCreative()) {
                ModNetworking.INSTANCE.sendToServer(new ServerOpenBlockPickerMenu());
            }
            if (COPY_BLOCK.consumeClick()) {
                if (mc.hitResult != null && mc.hitResult.getType() == HitResult.Type.BLOCK && mc.player.isCreative()) {
                    onPickBlock(mc.hitResult, mc.player, mc.level);
                }
            }
        }

        public static void onPickBlock(HitResult target, Player player, Level level) {
            BlockEntity te = null;

            BlockPos pos = ((BlockHitResult) target).getBlockPos();
            BlockState state = level.getBlockState(pos);

            if (state.isAir())
                return;

            if (state.hasBlockEntity())
                te = level.getBlockEntity(pos);

            ItemStack result = state.getCloneItemStack(target, level, pos, player);

            if (result.isEmpty())
                return;

            // save blockstate
            CompoundTag compoundTag = result.getOrCreateTag();
            CompoundTag compoundTag3;
            if (compoundTag.contains("BlockStateTag", 10)) {
                compoundTag3 = compoundTag.getCompound("BlockStateTag");
            } else {
                compoundTag3 = new CompoundTag();
                compoundTag.put("BlockStateTag", compoundTag3);
            }
            state.getProperties().stream().filter(state::hasProperty).forEach((property) ->
                    compoundTag3.putString(property.getName(), serialize(state, property)));

            if (te != null)
                ((MinecraftAccessor) Minecraft.getInstance()).addCustomNbtData(result, te);

            player.getInventory().setPickedItem(result);
            assert Minecraft.getInstance().gameMode != null;
            Minecraft.getInstance().gameMode.handleCreativeModeItemAdd(player.getItemInHand(InteractionHand.MAIN_HAND), 36 + player.getInventory().selected);
        }
    }

    private static <T extends Comparable<T>> String serialize(BlockState pBlockState, Property<T> pProperty) {
        T t = pBlockState.getValue(pProperty);
        return pProperty.getName(t);
    }
}
