
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.orderofobsidian.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.orderofobsidian.client.model.Modelirongolem;
import net.mcreator.orderofobsidian.client.model.Modelhorse;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class OrderofobsidianModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelhorse.LAYER_LOCATION, Modelhorse::createBodyLayer);
		event.registerLayerDefinition(Modelirongolem.LAYER_LOCATION, Modelirongolem::createBodyLayer);
	}
}
