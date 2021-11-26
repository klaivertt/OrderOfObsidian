package net.mcreator.orderofobsidian.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.orderofobsidian.entity.DrowneHorseEntity;
import net.mcreator.orderofobsidian.client.model.Modelhorse;

public class DrowneHorseRenderer extends MobRenderer<DrowneHorseEntity, Modelhorse<DrowneHorseEntity>> {
	public DrowneHorseRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelhorse(context.bakeLayer(Modelhorse.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DrowneHorseEntity entity) {
		return new ResourceLocation("orderofobsidian:textures/drowned_horse.png");
	}
}
