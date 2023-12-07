package com.calibermc.buildify.command;

import com.calibermc.buildify.util.player.IPlayerExtended;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.arguments.TimeArgument;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;

public class BuildifyCommands {

    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(net.minecraft.commands.Commands.literal("ptime")
                .requires((sourceStack) -> sourceStack.getEntity() instanceof Player && sourceStack.hasPermission(2))
                .then(net.minecraft.commands.Commands.literal("server").executes((context) -> {
                    return setServerVal(context.getSource(), false);
                }))
                        .then(net.minecraft.commands.Commands.literal("set")
                                .then(net.minecraft.commands.Commands.literal("sunrise").executes((context) -> {
                                    return setTime(context.getSource(), 0, false);
                                }))
                                .then(net.minecraft.commands.Commands.literal("day").executes((context) -> {
                                    return setTime(context.getSource(), 1000, false);
                                }))
                                .then(net.minecraft.commands.Commands.literal("morning").executes((context) -> {
                                    return setTime(context.getSource(), 2000, false);
                                }))
                                .then(net.minecraft.commands.Commands.literal("noon").executes((context) -> {
                                    return setTime(context.getSource(), 6000, false);
                                }))
                                .then(net.minecraft.commands.Commands.literal("afternoon").executes((context) -> {
                                    return setTime(context.getSource(), 9000, false);
                                }))
                                .then(net.minecraft.commands.Commands.literal("sunset").executes((context) -> {
                                    return setTime(context.getSource(), 12000, false);
                                }))
                                .then(net.minecraft.commands.Commands.literal("night").executes((context) -> {
                                    return setTime(context.getSource(), 13000, false);
                                }))
                                .then(net.minecraft.commands.Commands.literal("midnight").executes((context) -> {
                                    return setTime(context.getSource(), 18000, false);
                                }))
                                .then(net.minecraft.commands.Commands.argument("time", TimeArgument.time()).executes((context) ->
                                        setTime(context.getSource(), IntegerArgumentType.getInteger(context, "time"),
                                                false))))
                        
                );
        dispatcher.register(net.minecraft.commands.Commands.literal("pweather").requires((context) -> context.hasPermission(2))
                .then(net.minecraft.commands.Commands.literal("server").executes((context) -> setServerVal(context.getSource(), true)))
                .then(net.minecraft.commands.Commands.literal("clear").executes((context) -> setRain(context.getSource(), false)))
                .then(net.minecraft.commands.Commands.literal("rain").executes((context) -> setRain(context.getSource(), true)))
        );
    }


    private static int setServerVal(CommandSourceStack pSource, boolean weather) throws CommandSyntaxException {
        if (pSource.getPlayerOrException() instanceof IPlayerExtended ex) {
            if (weather) {
                ex.buildify$clearRaining();
                pSource.sendSuccess(new TextComponent("Using server weather"), true);
            } else {
                ex.buildify$resetDayTime();
                pSource.sendSuccess(new TextComponent("Using server day time"), true);
            }
        }
        return 0;
    }

    private static int setRain(CommandSourceStack pSource, boolean isRaining) throws CommandSyntaxException {
        if (pSource.getPlayerOrException() instanceof IPlayerExtended ex) {
            ex.buildify$setRaining(isRaining);
            if (isRaining) {
                pSource.sendSuccess(new TranslatableComponent("commands.weather.set.rain"), true);
            } else {
                pSource.sendSuccess(new TranslatableComponent("commands.weather.set.clear"), true);
            }
        }
        return 0;
    }

    private static int getDayTime(ServerPlayer serverPlayer) {
        if (serverPlayer instanceof IPlayerExtended ex) {
            return (int) (ex.buildify$getDayTime() % 24000L);
        }
        return (int) (serverPlayer.level.getDayTime() % 24000L);
    }

    private static int queryTime(CommandSourceStack pSource, boolean day) throws CommandSyntaxException {
        ServerPlayer player = pSource.getPlayerOrException();
        int pTime = 0;
        if (player instanceof IPlayerExtended ex) {
            if (day) {
                pTime = (int) (ex.buildify$getDayTime() / 24000L % 2147483647L);
            } else {
                pTime = (int) (ex.buildify$getDayTime() % 24000L);
            }
        }
        pSource.sendSuccess(new TranslatableComponent("commands.time.query", pTime), false);
        return pTime;
    }

    public static int setTime(CommandSourceStack pSource, int pTime, boolean tickable) throws CommandSyntaxException {
        ServerPlayer player = pSource.getPlayerOrException();
        if (player instanceof IPlayerExtended ex) {
            ex.buildify$setDayTime(pTime, tickable);
        }
        pSource.sendSuccess(new TranslatableComponent("commands.time.set", pTime), true);
        return getDayTime(player);
    }

    public static int addTime(CommandSourceStack pSource, int pAmount, boolean tickable) throws CommandSyntaxException {
        ServerPlayer player = pSource.getPlayerOrException();
        if (player instanceof IPlayerExtended ex) {
            ex.buildify$setDayTime(ex.buildify$getDayTime() + pAmount, tickable);
        }
        int i = getDayTime(player);
        pSource.sendSuccess(new TranslatableComponent("commands.time.set", i), true);
        return i;
    }
}
