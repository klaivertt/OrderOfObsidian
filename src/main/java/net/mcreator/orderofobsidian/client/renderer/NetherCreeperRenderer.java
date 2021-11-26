package net.mcreator.orderofobsidian.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import net.mcreator.orderofobsidian.entity.NetherCreeperEntity;

public class NetherCreeperRenderer extends MobRenderer<NetherCreeperEntity, CreeperModel<NetherCreeperEntity>> {
	public NetherCreeperRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NetherCreeperEntity entity) {
		return new ResourceLocation("orderofobsidian:textures/nether_creeper.png");
	}
}
