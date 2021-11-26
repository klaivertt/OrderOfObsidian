package net.mcreator.orderofobsidian.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.orderofobsidian.network.OrderofobsidianModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class AnimfeuProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.WorldTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.world);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		if (OrderofobsidianModVariables.MapVariables.get(world).anim < 3) {
			OrderofobsidianModVariables.MapVariables.get(world).anim = (double) (OrderofobsidianModVariables.MapVariables.get(world).anim + 1);
			OrderofobsidianModVariables.MapVariables.get(world).syncData(world);
		} else {
			OrderofobsidianModVariables.MapVariables.get(world).anim = (double) 1;
			OrderofobsidianModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
