package net.dereckyojinmod.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.dereckyojinmod.DerecKyojinmodModElements;
import net.dereckyojinmod.DerecKyojinmodMod;

import java.util.Map;

@DerecKyojinmodModElements.ModElement.Tag
public class CheckNapeProcedure extends DerecKyojinmodModElements.ModElement {
	public CheckNapeProcedure(DerecKyojinmodModElements instance) {
		super(instance, 7);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DerecKyojinmodMod.LOGGER.warn("Failed to load dependency entity for procedure CheckNape!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				DerecKyojinmodMod.LOGGER.warn("Failed to load dependency sourceentity for procedure CheckNape!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if ((((sourceentity.getPosY()) >= ((entity.getPosY()) + ((entity.getHeight()) - 2.5)))
				&& ((sourceentity.getPosY()) <= ((entity.getPosY()) + ((entity.getHeight()) - 0.1))))) {
			if (((sourceentity.getHorizontalFacing()) == (entity.getHorizontalFacing()))) {
				entity.attackEntityFrom(DamageSource.GENERIC, (float) 69696);
			}
		}
	}
}
