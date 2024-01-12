package com.calibermc.buildify.networking;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.IntFunction;
import java.util.function.Supplier;

public class ServerUpdateSlots {
    private final int containerId;
    private final int stateId;
    private final Int2ObjectMap<ItemStack> changedSlots;

    public ServerUpdateSlots(int pContainerId, int pStateId, Int2ObjectMap<ItemStack> pChangedSlots) {
        this.containerId = pContainerId;
        this.stateId = pStateId;
        this.changedSlots = Int2ObjectMaps.unmodifiable(pChangedSlots);
    }

    public ServerUpdateSlots(FriendlyByteBuf buffer) {
        this.containerId = buffer.readByte();
        this.stateId = buffer.readVarInt();
        IntFunction<Int2ObjectOpenHashMap<ItemStack>> intfunction = FriendlyByteBuf.limitValue(Int2ObjectOpenHashMap::new, 128);
        this.changedSlots = Int2ObjectMaps.unmodifiable(buffer.readMap(intfunction, (i) ->
                Integer.valueOf(i.readShort()), FriendlyByteBuf::readItem));
    }

    public void toBytes(FriendlyByteBuf buffer) {
        buffer.writeByte(this.containerId);
        buffer.writeVarInt(this.stateId);
        buffer.writeMap(this.changedSlots, FriendlyByteBuf::writeShort, FriendlyByteBuf::writeItem);
    }

    public void handle(Supplier<NetworkEvent.Context> ctx) {
        ctx.get().enqueueWork(() -> {
            ServerPlayer sender = ctx.get().getSender();
            if (sender != null) {
                sender.resetLastActionTime();
                if (sender.containerMenu.containerId == this.containerId) {
                    if (sender.isSpectator()) {
                        sender.containerMenu.sendAllDataToRemote();
                    } else {
                        boolean flag = this.stateId != sender.containerMenu.getStateId();
                        sender.containerMenu.suppressRemoteUpdates();

                        for (Int2ObjectMap.Entry<ItemStack> entry : Int2ObjectMaps.fastIterable(this.changedSlots)) {
                            sender.containerMenu.getSlot(entry.getIntKey()).set(entry.getValue());
                        }

                        sender.containerMenu.resumeRemoteUpdates();
                        if (flag) {
                            sender.containerMenu.broadcastFullState();
                        } else {
                            sender.containerMenu.broadcastChanges();
                        }
                    }
                }

            }
        });
        ctx.get().setPacketHandled(true);
    }

}