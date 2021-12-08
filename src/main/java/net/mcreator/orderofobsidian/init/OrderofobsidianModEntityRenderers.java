
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
import net.mcreator.orderofobsidian.client.renderer.EndCreeperRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class OrderofobsidianModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(OrderofobsidianModEntities.OXYS_BOW, ThrownItemRenderer::new);
		event.registerEntityRenderer(OrderofobsidianModEntities.OBSIDIAN_GOLEM, ObsidianGolemRenderer::new);
		event.registerEntityRenderer(OrderofobsidianModEntities.NETHERITEGOLEM, NetheritegolemRenderer::new);
		event.registerEntityRenderer(OrderofobsidianModEntities.END_CREEPER, EndCreeperRenderer::new);
		event.registerEntityRenderer(OrderofobsidianModEntities.NETHER_CREEPER, NetherCreeperRenderer::new);
		event.registerEntityRenderer(OrderofobsidianModEntities.DYNAMITE, ThrownItemRenderer::new);
		event.registerEntityRenderer(OrderofobsidianModEntities.BIG_DYNAMITE, ThrownItemRenderer::new);
		event.registerEntityRenderer(OrderofobsidianModEntities.DYNAMITE_AIKIGITE, ThrownItemRenderer::new);
		event.registerEntityRenderer(OrderofobsidianModEntities.BIG_DYNAMITE_AIKIGITE, ThrownItemRenderer::new);
		event.registerEntityRenderer(OrderofobsidianModEntities.DYNAMITE_BAUHERITE, ThrownItemRenderer::new);
		event.registerEntityRenderer(OrderofobsidianModEntities.BIGDYNAMITE_BAUHERITE, ThrownItemRenderer::new);
		event.registerEntityRenderer(OrderofobsidianModEntities.DYNAMITE_AVENRONITE, ThrownItemRenderer::new);
		event.registerEntityRenderer(OrderofobsidianModEntities.BIGDYNAMITE_AVENRONITE, ThrownItemRenderer::new);
		event.registerEntityRenderer(OrderofobsidianModEntities.DYNAMITE_OXYS, ThrownItemRenderer::new);
		event.registerEntityRenderer(OrderofobsidianModEntities.BIGDYNAMITE_OXYS, ThrownItemRenderer::new);
	}
}
