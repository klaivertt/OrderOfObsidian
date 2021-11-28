package net.mcreator.orderofobsidian.procedures;

import net.minecraftforge.eventbus.api.Event;

public class XPberryStage0EntityCollidesInTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.hurt(DamageSource.CACTUS, 1);
	}
}
