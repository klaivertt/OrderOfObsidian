package fr.klaivert.orderofobsidian.event;


import fr.klaivert.orderofobsidian.OrderofobsidianMod;
import fr.klaivert.orderofobsidian.entity.MossWalkerEntity;
import fr.klaivert.orderofobsidian.init.OrderofobsidianModEntities;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = OrderofobsidianMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class orderofobsidianModEvenBusEevnts {

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(OrderofobsidianModEntities.MOSS_WALKER.get(), MossWalkerEntity.setAttributes());
    }
}