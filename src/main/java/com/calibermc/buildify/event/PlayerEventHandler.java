package com.calibermc.buildify.event;

import com.calibermc.buildify.item.custom.Hammer;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;

@Mod.EventBusSubscriber
public class PlayerEventHandler {

    @SubscribeEvent
    public static void onPlayerDeath(LivingDeathEvent event) {
        if (event.getEntity() instanceof ServerPlayer) {
            ServerPlayer player = (ServerPlayer) event.getEntity();
            resetHammerInteraction(player);
        }
    }

    @SubscribeEvent
    public static void onPlayerLogout(PlayerEvent.PlayerLoggedOutEvent event) {
        if (event.getEntity() instanceof ServerPlayer) {
            ServerPlayer player = (ServerPlayer) event.getEntity();
            resetHammerInteraction(player);
        }
    }

    private static void resetHammerInteraction(ServerPlayer player) {
        ItemStack hammerItem = findHammerInInventory(player);
        if (hammerItem != null && hammerItem.getItem() instanceof Hammer) {
            ((Hammer) hammerItem.getItem()).resetLastInteractedBlock();
        }
    }

    private static ItemStack findHammerInInventory(ServerPlayer player) {
        // Iterate through the player's main inventory
        for (ItemStack itemStack : player.getInventory().items) {
            if (itemStack.getItem() instanceof Hammer) {
                return itemStack;
            }
        }

        // Check the offhand slot
        ItemStack offhandStack = player.getOffhandItem();
        if (offhandStack.getItem() instanceof Hammer) {
            return offhandStack;
        }

        // Return null if the hammer is not found
        return null;
    }
}
