package com.calibermc.buildify.item;



import com.calibermc.buildify.config.ClientConfigs;
import com.calibermc.buildify.util.ModTags;
import com.google.common.collect.Lists;
import net.minecraft.core.NonNullList;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.level.block.*;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.tags.ITagManager;
import javax.annotation.Nullable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;


public class CreativeTabs {

    public static final CreativeModeTab BUILDIFY_TAB = new CreativeModeTab("buildify") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Blocks.STONE);
        }
    };
}
