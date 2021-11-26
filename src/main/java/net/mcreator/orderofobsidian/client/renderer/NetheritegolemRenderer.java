package net.mcreator.orderofobsidian.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.orderofobsidian.entity.NetheritegolemEntity;
import net.mcreator.orderofobsidian.client.model.Modelirongolem;

public class NetheritegolemRenderer extends MobRenderer<NetheritegolemEntity, Modelirongolem<NetheritegolemEntity>> {
	public NetheritegolemRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelirongolem(context.bakeLayer(Modelirongolem.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NetheritegolemEntity entity) {
		return new ResourceLocation("orderofobsidian:textures/netherite_golem_png.png");
	}
}
