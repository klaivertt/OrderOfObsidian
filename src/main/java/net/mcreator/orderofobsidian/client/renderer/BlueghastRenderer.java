package net.mcreator.orderofobsidian.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.GhastModel;

import net.mcreator.orderofobsidian.entity.BlueghastEntity;

public class BlueghastRenderer extends MobRenderer<BlueghastEntity, GhastModel<BlueghastEntity>> {
	public BlueghastRenderer(EntityRendererProvider.Context context) {
		super(context, new GhastModel(context.bakeLayer(ModelLayers.GHAST)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BlueghastEntity entity) {
		return new ResourceLocation("orderofobsidian:textures/blue_ghast.png");
	}
}
