
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.orderofobsidian.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.orderofobsidian.client.renderer.ObsidianGolemRenderer;
import net.mcreator.orderofobsidian.client.renderer.NetheritegolemRenderer;
import net.mcreator.orderofobsidian.client.renderer.NetherCreeperRenderer;
import net.mcreator.orderofobsidian.client.renderer.EndermanblazeRenderer;
import net.mcreator.orderofobsidian.client.renderer.EndCreeperRenderer;
import net.mcreator.orderofobsidian.client.renderer.DrowneHorseRenderer;
import net.mcreator.orderofobsidian.client.renderer.BlueghastRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class OrderofobsidianModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(OrderofobsidianModEntities.OXYS_BOW, ThrownItemRenderer::new);
		event.registerEntityRenderer(OrderofobsidianModEntities.BLUEGHAST, BlueghastRenderer::new);
		event.registerEntityRenderer(OrderofobsidianModEntities.BLUEGHAST_PROJECTILE, ThrownItemRenderer::new);
		event.registerEntityRenderer(OrderofobsidianModEntities.ENDERMANBLAZE, EndermanblazeRenderer::new);
		event.registerEntityRenderer(OrderofobsidianModEntities.OBSIDIAN_GOLEM, ObsidianGolemRenderer::new);
		event.registerEntityRenderer(OrderofobsidianModEntities.NETHERITEGOLEM, NetheritegolemRenderer::new);
		event.registerEntityRenderer(OrderofobsidianModEntities.DROWNE_HORSE, DrowneHorseRenderer::new);
		event.registerEntityRenderer(OrderofobsidianModEntities.END_CREEPER, EndCreeperRenderer::new);
		event.registerEntityRenderer(OrderofobsidianModEntities.NETHER_CREEPER, NetherCreeperRenderer::new);
	}
}
