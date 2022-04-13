package fr.klaivert.orderofobsidian.event;


import fr.klaivert.orderofobsidian.OrderofobsidianMod;
import fr.klaivert.orderofobsidian.client.model.MossWalkerModel;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = OrderofobsidianMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public final class ClientModEvents {

    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(MossWalkerModel.LAYER_LOCATION, MossWalkerModel::createBodyLayer);
    }
}
