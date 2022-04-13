package fr.klaivert.orderofobsidian.client.renderer;


import fr.klaivert.orderofobsidian.OrderofobsidianMod;
import fr.klaivert.orderofobsidian.client.model.MossWalkerModel;
import fr.klaivert.orderofobsidian.entity.MossWalkerEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class MossWalkerRenderer extends MobRenderer<MossWalkerEntity, MossWalkerModel<MossWalkerEntity>> {
    protected static final ResourceLocation TEXTURE = new ResourceLocation(OrderofobsidianMod.MODID,
            "textures/entity/moss_walker/moss_walker.png");

    protected static final ResourceLocation BABY = new ResourceLocation(OrderofobsidianMod.MODID,
            "textures/entity/moss_walker/moss_walker_baby.png");

    public MossWalkerRenderer(EntityRendererProvider.Context context) {
        super(context, new MossWalkerModel<>(context.bakeLayer(MossWalkerModel.LAYER_LOCATION)), 0.7F);
    }

    @Override
    public ResourceLocation getTextureLocation(MossWalkerEntity entity)
    {
        if (entity.isBaby()){
            return BABY;
        }
        return TEXTURE;
    }
}