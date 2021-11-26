package net.mcreator.orderofobsidian.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.orderofobsidian.entity.ObsidianGolemEntity;
import net.mcreator.orderofobsidian.client.model.Modelirongolem;

public class ObsidianGolemRenderer extends MobRenderer<ObsidianGolemEntity, Modelirongolem<ObsidianGolemEntity>> {
	public ObsidianGolemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelirongolem(context.bakeLayer(Modelirongolem.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(ObsidianGolemEntity entity) {
		return new ResourceLocation("orderofobsidian:textures/obsidian_golem.png");
	}
}
