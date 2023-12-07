package com.calibermc.buildify.world;

import com.calibermc.buildify.Buildify;
import com.calibermc.buildify.networking.ServerAdjustReach;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Buildify.MOD_ID)
public class ModWorldEvents {

    @SubscribeEvent
    public static void entityJoinWorld(EntityJoinWorldEvent event) {
        if (event.getEntity() instanceof LivingEntity entity) {
            ServerAdjustReach.setModifier(entity, -1, ForgeMod.ATTACK_RANGE.get(), ForgeMod.REACH_DISTANCE.get());
        }
    }

    @SubscribeEvent
    public static void playerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase == TickEvent.Phase.START && !event.player.isCreative()) {
            ServerAdjustReach.setModifier(event.player, -1, ForgeMod.ATTACK_RANGE.get(), ForgeMod.REACH_DISTANCE.get());
        }
    }
}
