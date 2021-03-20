package net.dereckyojinmod.procedures;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.world.Explosion;
import net.minecraft.particles.ParticleTypes;

import net.dereckyojinmod.DerecKyojinmodModElements;
import net.dereckyojinmod.DerecKyojinmodMod;

import java.util.Map;
import java.util.HashMap;

@DerecKyojinmodModElements.ModElement.Tag
public class CollosusExplosionProcedure extends DerecKyojinmodModElements.ModElement {
	public CollosusExplosionProcedure(DerecKyojinmodModElements instance) {
		super(instance, 9);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DerecKyojinmodMod.LOGGER.warn("Failed to load dependency x for procedure CollosusExplosion!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DerecKyojinmodMod.LOGGER.warn("Failed to load dependency y for procedure CollosusExplosion!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DerecKyojinmodMod.LOGGER.warn("Failed to load dependency z for procedure CollosusExplosion!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DerecKyojinmodMod.LOGGER.warn("Failed to load dependency world for procedure CollosusExplosion!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", x);
			$_dependencies.put("y", y);
			$_dependencies.put("z", z);
			TitanLightningProcedure.executeProcedure($_dependencies);
		}
		if (world instanceof World && !((World) world).isRemote) {
			((World) world).createExplosion(null, (int) x, (int) y, (int) z, (float) 100, Explosion.Mode.DESTROY);
		}
		if (world instanceof ServerWorld) {
			((ServerWorld) world).spawnParticle(ParticleTypes.EXPLOSION, x, y, z, (int) 3625, 50, 50, 50, 0);
		}
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("world", world);
			$_dependencies.put("x", x);
			$_dependencies.put("y", y);
			$_dependencies.put("z", z);
			RandomFireBertholdProcedure.executeProcedure($_dependencies);
		}
	}
}
