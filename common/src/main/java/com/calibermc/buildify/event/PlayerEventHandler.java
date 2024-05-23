package com.calibermc.buildify.event;

import com.calibermc.buildify.item.custom.Hammer;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.ItemStack;

public class PlayerEventHandler {

    public static void resetHammerInteraction(ServerPlayer player) {
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
