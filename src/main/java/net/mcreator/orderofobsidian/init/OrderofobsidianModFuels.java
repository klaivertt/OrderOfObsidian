
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.orderofobsidian.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

@Mod.EventBusSubscriber
public class OrderofobsidianModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == OrderofobsidianModItems.BAUHERITE_MIXED_COAL)
			event.setBurnTime(7000);
		else if (event.getItemStack().getItem() == OrderofobsidianModItems.AVENRONITE_MIXED_COAL)
			event.setBurnTime(8000);
		else if (event.getItemStack().getItem() == OrderofobsidianModItems.AIKIGITE_MIXED_COAL)
			event.setBurnTime(5000);
	}
}
