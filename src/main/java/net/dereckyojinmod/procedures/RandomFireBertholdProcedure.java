package net.dereckyojinmod.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector2f;
import net.minecraft.command.ICommandSource;
import net.minecraft.command.CommandSource;

import net.dereckyojinmod.DerecKyojinmodModElements;
import net.dereckyojinmod.DerecKyojinmodMod;

import java.util.Map;

@DerecKyojinmodModElements.ModElement.Tag
public class RandomFireBertholdProcedure extends DerecKyojinmodModElements.ModElement {
	public RandomFireBertholdProcedure(DerecKyojinmodModElements instance) {
		super(instance, 10);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DerecKyojinmodMod.LOGGER.warn("Failed to load dependency x for procedure RandomFireBerthold!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DerecKyojinmodMod.LOGGER.warn("Failed to load dependency y for procedure RandomFireBerthold!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DerecKyojinmodMod.LOGGER.warn("Failed to load dependency z for procedure RandomFireBerthold!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DerecKyojinmodMod.LOGGER.warn("Failed to load dependency world for procedure RandomFireBerthold!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double tempxd = 0;
		if (world instanceof ServerWorld) {
			((World) world).getServer().getCommandManager().handleCommand(
					new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
							new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
					"summon minecraft:fireball ~ ~ ~ {direction:[0.0,0.1,-10.0],power:[-0.4,0.1,-1.0],ExplosionPower:50}");
		}
		if (world instanceof ServerWorld) {
			((World) world).getServer().getCommandManager().handleCommand(
					new CommandSource(ICommandSource.DUMMY, new Vector3d(x, (y - 50), z), Vector2f.ZERO, (ServerWorld) world, 4, "",
							new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
					"summon minecraft:fireball ~ ~ ~ {direction:[0.0,0.1,-10.0],power:[-0.4,0.1,-1.0],ExplosionPower:50}");
		}
		if (world instanceof ServerWorld) {
			((World) world).getServer().getCommandManager().handleCommand(
					new CommandSource(ICommandSource.DUMMY, new Vector3d((x + 50), y, (z + 50)), Vector2f.ZERO, (ServerWorld) world, 4, "",
							new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
					"summon minecraft:fireball ~ ~ ~ {direction:[0.0,0.1,-10.0],power:[-0.4,0.1,-1.0],ExplosionPower:50}");
		}
		if (world instanceof ServerWorld) {
			((World) world).getServer().getCommandManager().handleCommand(
					new CommandSource(ICommandSource.DUMMY, new Vector3d((x - 50), y, (z - 50)), Vector2f.ZERO, (ServerWorld) world, 4, "",
							new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
					"summon minecraft:fireball ~ ~ ~ {direction:[0.0,0.1,-10.0],power:[-0.4,0.1,-1.0],ExplosionPower:50}");
		}
		if (world instanceof ServerWorld) {
			((World) world).getServer().getCommandManager().handleCommand(
					new CommandSource(ICommandSource.DUMMY, new Vector3d((x - 50), y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
							new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
					"summon minecraft:fireball ~ ~ ~ {direction:[0.0,0.1,-10.0],power:[-0.4,0.1,-1.0],ExplosionPower:50}");
		}
		if (world instanceof ServerWorld) {
			((World) world).getServer().getCommandManager().handleCommand(
					new CommandSource(ICommandSource.DUMMY, new Vector3d((x + 50), y, z), Vector2f.ZERO, (ServerWorld) world, 4, "",
							new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
					"summon minecraft:fireball ~ ~ ~ {direction:[0.0,0.1,-10.0],power:[-0.4,0.1,-1.0],ExplosionPower:50}");
		}
		if (world instanceof ServerWorld) {
			((World) world).getServer().getCommandManager().handleCommand(
					new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, (z - 50)), Vector2f.ZERO, (ServerWorld) world, 4, "",
							new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
					"summon minecraft:fireball ~ ~ ~ {direction:[0.0,0.1,-10.0],power:[-0.4,0.1,-1.0],ExplosionPower:50}");
		}
		if (world instanceof ServerWorld) {
			((World) world).getServer().getCommandManager().handleCommand(
					new CommandSource(ICommandSource.DUMMY, new Vector3d(x, y, (z + 50)), Vector2f.ZERO, (ServerWorld) world, 4, "",
							new StringTextComponent(""), ((World) world).getServer(), null).withFeedbackDisabled(),
					"summon minecraft:fireball ~ ~ ~ {direction:[0.0,0.1,-10.0],power:[-0.4,0.1,-1.0],ExplosionPower:50}");
		}
		tempxd = (double) 0;
	}
}
