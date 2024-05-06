package com.calibermc.buildify.world;

import com.calibermc.buildify.Buildify;
import com.calibermc.buildify.networking.ServerAdjustReach;
import net.minecraft.world.entity.LivingEntity;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForgeMod;
import net.neoforged.neoforge.event.TickEvent;
import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;


@Mod.EventBusSubscriber(modid = Buildify.MOD_ID)
public class ModWorldEvents {

    @SubscribeEvent
    public static void entityJoinWorld(EntityJoinLevelEvent event) {
        if (event.getEntity() instanceof LivingEntity entity) {
            ServerAdjustReach.setModifier(entity, -1, NeoForgeMod.ENTITY_REACH.value(), NeoForgeMod.BLOCK_REACH.value());
        }
    }

    @SubscribeEvent
    public static void playerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase == TickEvent.Phase.START && !event.player.isCreative()) {
            ServerAdjustReach.setModifier(event.player, -1, NeoForgeMod.ENTITY_REACH.value(), NeoForgeMod.BLOCK_REACH.value());
        }
    }
}
