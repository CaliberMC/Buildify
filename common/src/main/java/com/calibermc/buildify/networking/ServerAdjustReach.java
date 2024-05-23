package com.calibermc.buildify.networking;

import com.calibermc.buildify.Buildify;
import com.calibermc.buildify.BuildifyHelper;
import net.mehvahdjukaar.moonlight.api.platform.PlatHelper;
import net.mehvahdjukaar.moonlight.api.platform.network.ChannelHandler;
import net.mehvahdjukaar.moonlight.api.platform.network.Message;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.player.Player;

import java.util.UUID;

public class ServerAdjustReach implements Message {

    public static final UUID MODIFIER_UUID = UUID.fromString("d58171f5-856b-49eb-9d8b-8ec230980f3b");
    private final double distance;

    public ServerAdjustReach(double distance) {
        this.distance = distance;
    }

    public ServerAdjustReach(FriendlyByteBuf buffer) {
        this.distance = buffer.readDouble();
    }

    public static void setModifier(LivingEntity entity, double distance, Attribute... attributes) {
        for (Attribute attribute : attributes) {
            AttributeInstance instance = entity.getAttribute(attribute);
            if (instance != null) {
                instance.removeModifier(MODIFIER_UUID);
                if (distance >= 0) {
                    double val = PlatHelper.getPlatform().isFabric() ? 5: 0.5;
                    val += instance.getValue();
                    instance.addPermanentModifier(new AttributeModifier(MODIFIER_UUID, Buildify.MOD_ID, distance - val, AttributeModifier.Operation.ADDITION));
                }
            }
        }
    }

    @Override
    public void writeToBuffer(FriendlyByteBuf buf) {
        buf.writeDouble(this.distance);
    }

    @Override
    public void handle(ChannelHandler.Context context) {
        Player sender = context.getSender();
        if (sender != null) {
            ServerAdjustReach.setModifier(sender, this.distance, BuildifyHelper.getAttributes());
        }
    }
}