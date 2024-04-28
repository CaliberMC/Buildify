package com.calibermc.buildify.command;

import com.calibermc.buildify.util.player.IPlayerExtended;
import com.mojang.brigadier.Command;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.arguments.TimeArgument;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.GameType;
import net.minecraft.world.phys.Vec3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.calibermc.buildify.config.CommonConfigs.COMMAND_SERVER_LOGGING;

public class BuildifyCommands {

    public static void register(CommandDispatcher<CommandSourceStack> dispatcher) {

        // Time Command
        dispatcher.register(Commands.literal("time")
                .requires(source -> source.hasPermission(2))
                .then(Commands.literal("sunrise").executes(context -> setServerTime(context.getSource(), 0)))
                .then(Commands.literal("day").executes(context -> setServerTime(context.getSource(), 1000)))
                .then(Commands.literal("morning").executes(context -> setServerTime(context.getSource(), 2000)))
                .then(Commands.literal("noon").executes(context -> setServerTime(context.getSource(), 6000)))
                .then(Commands.literal("afternoon").executes(context -> setServerTime(context.getSource(), 9000)))
                .then(Commands.literal("sunset").executes(context -> setServerTime(context.getSource(), 12000)))
                .then(Commands.literal("night").executes(context -> setServerTime(context.getSource(), 13000)))
                .then(Commands.literal("midnight").executes(context -> setServerTime(context.getSource(), 18000)))
                .then(Commands.argument("set", TimeArgument.time()).executes(context ->
                        setServerTime(context.getSource(), IntegerArgumentType.getInteger(context, "set"))))
        );

        // Player Time Command
        dispatcher.register(Commands.literal("ptime")
                .requires((sourceStack) -> sourceStack.getEntity() instanceof Player && sourceStack.hasPermission(2))
                .then(Commands.literal("sunrise").executes(context -> setPlayerTime(context.getSource(), 0, false)))
                .then(Commands.literal("day").executes(context -> setPlayerTime(context.getSource(), 1000, false)))
                .then(Commands.literal("morning").executes(context -> setPlayerTime(context.getSource(), 2000, false)))
                .then(Commands.literal("noon").executes(context -> setPlayerTime(context.getSource(), 6000, false)))
                .then(Commands.literal("afternoon").executes(context -> setPlayerTime(context.getSource(), 9000, false)))
                .then(Commands.literal("sunset").executes(context -> setPlayerTime(context.getSource(), 12000, false)))
                .then(Commands.literal("night").executes(context -> setPlayerTime(context.getSource(), 13000, false)))
                .then(Commands.literal("midnight").executes(context -> setPlayerTime(context.getSource(), 18000, false)))
                .then(Commands.literal("server").executes(context -> setServerVal(context.getSource(), false)))  // Reset to server time
                .then(Commands.literal("set")
                        .then(Commands.argument("time", TimeArgument.time())
                                .executes(context -> setPlayerTime(context.getSource(), IntegerArgumentType.getInteger(context, "time"), false))))
        );

        // Weather Command
        dispatcher.register(Commands.literal("weather")
                .requires(source -> source.hasPermission(2))
                .then(Commands.literal("clear").executes(context -> setServerWeather(context.getSource(), WeatherType.CLEAR)))
                .then(Commands.literal("rain").executes(context -> setServerWeather(context.getSource(), WeatherType.RAIN)))
                .then(Commands.literal("thunder").executes(context -> setServerWeather(context.getSource(), WeatherType.THUNDER))));


        // Player Weather Command
        dispatcher.register(net.minecraft.commands.Commands.literal("pweather").requires((context) -> context.hasPermission(2))
                .then(net.minecraft.commands.Commands.literal("server").executes((context) -> setServerVal(context.getSource(), true)))
                .then(net.minecraft.commands.Commands.literal("clear").executes((context) -> setPlayerWeather(context.getSource(), false)))
                .then(net.minecraft.commands.Commands.literal("rain").executes((context) -> setPlayerWeather(context.getSource(), true)))
        );

        // GameMode Command
        dispatcher.register(
                Commands.literal("gm").requires((context) -> context.hasPermission(2))
                        .then(Commands.argument("0 = Survival, 1 = Creative, 2 = Adventure, 3 = Spectator", IntegerArgumentType.integer(0, 3))
                                .executes(context -> {
                                    int mode = IntegerArgumentType.getInteger(context, "0 = Survival, 1 = Creative, 2 = Adventure, 3 = Spectator");
                                    return switchGameMode(context.getSource(), mode);
                                }))
        );

        // Repair Command
        dispatcher.register(Commands.literal("repair")
                .requires(cs -> cs.hasPermission(2))
                .executes(context -> repairItemInHand(context.getSource()))
        );

        // Heal Command
        dispatcher.register(Commands.literal("heal")
                .requires(cs -> cs.hasPermission(2))
                .executes(context -> healPlayer(context.getSource(), context.getSource().getPlayerOrException()))
                .then(Commands.argument("player", EntityArgument.player())
                        .executes(context -> healPlayer(context.getSource(), EntityArgument.getPlayer(context, "player"))))
        );

        // Fly Command
        dispatcher.register(Commands.literal("fly")
                .requires(cs -> cs.hasPermission(2))
                .executes(context -> fly(context.getSource(), context.getSource().getPlayerOrException()))
                .then(Commands.argument("target", EntityArgument.player())
                        .executes(context -> fly(context.getSource(), EntityArgument.getPlayer(context, "target"))))
        );

        // Teleport All Command
        dispatcher.register(Commands.literal("tpall")
                .requires(cs -> cs.hasPermission(2))
                .then(Commands.argument("target", EntityArgument.player())
                        .executes(context -> teleportAllToPlayer(context.getSource(), EntityArgument.getPlayer(context, "target"))))
        );

    }

    private static int teleportAllToPlayer(CommandSourceStack source, ServerPlayer targetPlayer) throws CommandSyntaxException {
        Vec3 targetPos = targetPlayer.position();
        ServerLevel targetWorld = targetPlayer.serverLevel();

        for (ServerPlayer player : source.getServer().getPlayerList().getPlayers()) {
            if (player != targetPlayer) {
                player.teleportTo(targetWorld, targetPos.x, targetPos.y, targetPos.z, player.getYRot(), player.getXRot());
            }
        }

        source.sendSuccess(() -> Component.literal("All players have been teleported to " + targetPlayer.getName().getString() + "'s location."), true);
        return Command.SINGLE_SUCCESS;
    }

    private static int fly(CommandSourceStack source, ServerPlayer player) {
        boolean canFly = player.getAbilities().mayfly;
        player.getAbilities().mayfly = !canFly;
        player.onUpdateAbilities();
        if (!canFly) {
            source.sendSuccess(() -> Component.literal("Flying enabled for " + player.getName().getString()), true);
        } else {
            source.sendSuccess(() -> Component.literal("Flying disabled for " + player.getName().getString()), true);
        }

        return Command.SINGLE_SUCCESS;
    }

    private static int healPlayer(CommandSourceStack source, ServerPlayer player) {
        boolean serverLogging = COMMAND_SERVER_LOGGING.get();
        player.setHealth(player.getMaxHealth());  // Heal the player to full health
        player.getFoodData().eat(20, 20.0F);  // Also max out the food and saturation level

        if (source.getEntity() == player) {
            source.sendSuccess(() -> Component.literal("You have been fully healed and nourished."), serverLogging);
        } else {
            source.sendSuccess(() -> Component.literal(player.getName().getString() + " has been fully healed and nourished."), serverLogging);
        }

        return Command.SINGLE_SUCCESS;
    }

    private static int repairItemInHand(CommandSourceStack pSource) throws CommandSyntaxException {
        boolean serverLogging = COMMAND_SERVER_LOGGING.get();
        ServerPlayer player = pSource.getPlayerOrException();
        ItemStack itemInHand = player.getMainHandItem();  // Get the item in the main hand

        if (!itemInHand.isEmpty() && itemInHand.isDamageableItem()) {
            itemInHand.setDamageValue(0);  // Repair the item by setting its damage to 0
            pSource.sendSuccess(() -> Component.literal("Item repaired."), serverLogging);
        } else {
            pSource.sendFailure(Component.literal("You are not holding a repairable item."));
        }

        return Command.SINGLE_SUCCESS;
    }

    private static int switchGameMode(CommandSourceStack pSource, int mode) throws CommandSyntaxException {
        boolean serverLogging = COMMAND_SERVER_LOGGING.get();
        ServerPlayer player = pSource.getPlayerOrException();
        switch (mode) {
            case 0:
                player.setGameMode(GameType.SURVIVAL);
                break;
            case 1:
                player.setGameMode(GameType.CREATIVE);
                break;
            case 2:
                player.setGameMode(GameType.ADVENTURE);
                break;
            case 3:
                player.setGameMode(GameType.SPECTATOR);
                break;
            default:
                throw new CommandSyntaxException(CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand(), Component.literal("Invalid game mode"));
        }
        pSource.sendSuccess(() -> Component.literal("Game mode changed to " + player.gameMode.getGameModeForPlayer().getName()), serverLogging);
        return 1;
    }

    private static int setServerVal(CommandSourceStack pSource, boolean weather) throws CommandSyntaxException {
        boolean serverLogging = COMMAND_SERVER_LOGGING.get();
        if (pSource.getPlayerOrException() instanceof IPlayerExtended ex) {
            if (weather) {
                ex.buildify$clearRaining();
                pSource.sendSuccess(() -> Component.literal("Using server weather"), serverLogging);
            } else {
                ex.buildify$resetDayTime();
                pSource.sendSuccess(() -> Component.literal("Using server day time"), serverLogging);
            }
        }
        return 0;
    }

    private static int setPlayerWeather(CommandSourceStack pSource, boolean isRaining) throws CommandSyntaxException {
        boolean serverLogging = COMMAND_SERVER_LOGGING.get();
        if (pSource.getPlayerOrException() instanceof IPlayerExtended ex) {
            ex.buildify$setRaining(isRaining);
            if (isRaining) {
                pSource.sendSuccess(() -> Component.translatable("commands.weather.set.rain"), serverLogging);
            } else {
                pSource.sendSuccess(() -> Component.translatable("commands.weather.set.clear"), serverLogging);
            }
        }
        return 0;
    }

    enum WeatherType {
        CLEAR, RAIN, THUNDER;
    }

    private static int setServerWeather(CommandSourceStack source, WeatherType type) {
        ServerLevel world = source.getServer().overworld(); // Assuming you want to change the weather in the overworld

        switch (type) {
            case CLEAR:
                world.setWeatherParameters(12000, 0, false, false); // Set clear weather
                source.sendSuccess(() -> Component.literal("Weather changed to clear."), true);
                break;
            case RAIN:
                world.setWeatherParameters(0, 12000, true, false); // Set rain
                source.sendSuccess(() -> Component.literal("Weather changed to rain."), true);
                break;
            case THUNDER:
                world.setWeatherParameters(0, 12000, true, true); // Set thunderstorm
                source.sendSuccess(() -> Component.literal("Weather changed to thunder."), true);
                break;
        }
        return Command.SINGLE_SUCCESS;
    }

    private static int getDayTime(ServerPlayer serverPlayer) {
        if (serverPlayer instanceof IPlayerExtended ex) {
            return (int) (ex.buildify$getDayTime() % 24000L);
        }
        return (int) (serverPlayer.getCommandSenderWorld().getDayTime() % 24000L);
    }

    private static int queryPlayerTime(CommandSourceStack pSource, boolean day) throws CommandSyntaxException {
        boolean serverLogging = COMMAND_SERVER_LOGGING.get();
        ServerPlayer player = pSource.getPlayerOrException();
        int pTime;
        if (player instanceof IPlayerExtended ex) {
            if (day) {
                pTime = (int) (ex.buildify$getDayTime() / 24000L % 2147483647L);
            } else {
                pTime = (int) (ex.buildify$getDayTime() % 24000L);
            }
        } else {
            pTime = 0;
        }
        pSource.sendSuccess(() -> Component.translatable("commands.time.query", pTime), serverLogging);
        return pTime;
    }

    public static int setPlayerTime(CommandSourceStack pSource, int pTime, boolean tickable) throws CommandSyntaxException {
        boolean serverLogging = COMMAND_SERVER_LOGGING.get();
        ServerPlayer player = pSource.getPlayerOrException();
        if (player instanceof IPlayerExtended ex) {
            ex.buildify$setDayTime(pTime, tickable);
        }
        pSource.sendSuccess(() -> Component.translatable("commands.time.set", pTime), serverLogging);
        return getDayTime(player);
    }

    public static int addPlayerTime(CommandSourceStack pSource, int pAmount, boolean tickable) throws CommandSyntaxException {
        boolean serverLogging = COMMAND_SERVER_LOGGING.get();
        ServerPlayer player = pSource.getPlayerOrException();
        if (player instanceof IPlayerExtended ex) {
            ex.buildify$setDayTime(ex.buildify$getDayTime() + pAmount, tickable);
        }
        int i = getDayTime(player);
        pSource.sendSuccess(() -> Component.translatable("commands.time.set", i), serverLogging);
        return i;
    }

    private static int setServerTime(CommandSourceStack pSource, int time) {
        pSource.getServer().getAllLevels().forEach(world -> world.setDayTime(time));  // This sets the time in all worlds (dimensions)
        pSource.sendSuccess(() -> Component.literal("Server time set to " + time), true);
        return Command.SINGLE_SUCCESS;
    }
}
