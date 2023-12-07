package com.calibermc.buildify.util.player;

import net.minecraft.nbt.CompoundTag;

public interface IPlayerExtended {

    CompoundTag buildify$getTag();

    boolean buildify$additionalPressed();

    void buildify$pressAdditional(boolean pressed);

    void buildify$setDayTime(long dayTime, boolean shouldTick);

    void buildify$resetDayTime();

    long buildify$getDayTime();

    boolean buildify$shouldTick();

    boolean buildify$playersDayTime();

    boolean buildify$isRaining();

    boolean buildify$playersRaining();

    void buildify$setRaining(boolean raining);

    void buildify$clearRaining();

    void buildify$manageRaining();

    float buildify$getRainLevel(float pDelta);
}