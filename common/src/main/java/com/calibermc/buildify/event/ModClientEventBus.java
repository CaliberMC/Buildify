package com.calibermc.buildify.event;


import com.calibermc.buildify.Buildify;
import com.calibermc.buildify.networking.ModNetworking;
import com.calibermc.buildify.networking.ServerOpenBlockPickerMenu;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.StringTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PlayerHeadItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import org.lwjgl.glfw.GLFW;

import static com.calibermc.buildify.Buildify.MOD_ID;


public class ModClientEventBus {

    public static final KeyMapping BLOCK_PICKER = new KeyMapping("%s.key.block_picker_screen".formatted(Buildify.MOD_ID), GLFW.GLFW_KEY_V, "key.categories.%s".formatted(Buildify.MOD_ID));
    public static final KeyMapping COPY_BLOCK = new KeyMapping("%s.key.copy_block".formatted(Buildify.MOD_ID), GLFW.GLFW_KEY_B, "key.categories.%s".formatted(Buildify.MOD_ID));
    public static final KeyMapping ADJUST_REACH = new KeyMapping("%s.key.adjust_reach".formatted(Buildify.MOD_ID), GLFW.GLFW_KEY_N, "key.categories.%s".formatted(Buildify.MOD_ID));

    public static void keyInput(int key, int scanCode, int action, int modifiers) {
        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null || mc.screen != null) return;
        if (action == GLFW.GLFW_PRESS && mc.player.isCreative()) {
            if (key == BLOCK_PICKER.getDefaultKey().getValue() && !mc.player.getMainHandItem().isEmpty()) {
                ModNetworking.INSTANCE.sendToServer(new ServerOpenBlockPickerMenu());
            }
            if (key == COPY_BLOCK.getDefaultKey().getValue() && mc.hitResult != null && mc.hitResult.getType() == HitResult.Type.BLOCK) {
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

        ItemStack result = state.getBlock().getCloneItemStack(level, pos, state);

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
            ModClientEventBus.addCustomNbtData(result, te);

        player.getInventory().setPickedItem(result);
        assert Minecraft.getInstance().gameMode != null;
        Minecraft.getInstance().gameMode.handleCreativeModeItemAdd(player.getItemInHand(InteractionHand.MAIN_HAND), 36 + player.getInventory().selected);
    }

    private static void addCustomNbtData(ItemStack pStack, BlockEntity pBe) {
        CompoundTag compoundtag = pBe.saveWithFullMetadata();
        BlockItem.setBlockEntityData(pStack, pBe.getType(), compoundtag);
        if (pStack.getItem() instanceof PlayerHeadItem && compoundtag.contains("SkullOwner")) {
            CompoundTag compoundtag3 = compoundtag.getCompound("SkullOwner");
            CompoundTag compoundtag4 = pStack.getOrCreateTag();
            compoundtag4.put("SkullOwner", compoundtag3);
            CompoundTag compoundtag2 = compoundtag4.getCompound("BlockEntityTag");
            compoundtag2.remove("SkullOwner");
            compoundtag2.remove("x");
            compoundtag2.remove("y");
            compoundtag2.remove("z");
        } else {
            CompoundTag compoundtag1 = new CompoundTag();
            ListTag listtag = new ListTag();
            listtag.add(StringTag.valueOf("\"(+NBT)\""));
            compoundtag1.put("Lore", listtag);
            pStack.addTagElement("display", compoundtag1);
        }
    }

    private static <T extends Comparable<T>> String serialize(BlockState pBlockState, Property<T> pProperty) {
        T t = pBlockState.getValue(pProperty);
        return pProperty.getName(t);
    }
}