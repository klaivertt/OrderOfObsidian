package net.mcreator.orderofobsidian.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import net.mcreator.orderofobsidian.entity.EndCreeperEntity;

public class EndCreeperRenderer extends MobRenderer<EndCreeperEntity, CreeperModel<EndCreeperEntity>> {
	public EndCreeperRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);
		this.addLayer(new EyesLayer<EndCreeperEntity, CreeperModel<EndCreeperEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("orderofobsidian:textures/end_creeperlight.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(EndCreeperEntity entity) {
		return new ResourceLocation("orderofobsidian:textures/end_creeper.png");
	}
}
