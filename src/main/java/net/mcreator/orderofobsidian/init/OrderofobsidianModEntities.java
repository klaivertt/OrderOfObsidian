
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.orderofobsidian.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.orderofobsidian.entity.OxysBowEntity;
import net.mcreator.orderofobsidian.entity.ObsidianGolemEntity;
import net.mcreator.orderofobsidian.entity.NetheritegolemEntity;
import net.mcreator.orderofobsidian.entity.NetherCreeperEntity;
import net.mcreator.orderofobsidian.entity.EndermanblazeEntity;
import net.mcreator.orderofobsidian.entity.EndCreeperEntity;
import net.mcreator.orderofobsidian.entity.DrowneHorseEntity;
import net.mcreator.orderofobsidian.entity.BlueghastProjectileEntity;
import net.mcreator.orderofobsidian.entity.BlueghastEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OrderofobsidianModEntities {
	private static final List<EntityType<?>> REGISTRY = new ArrayList<>();
	public static final EntityType<OxysBowEntity> OXYS_BOW = register("entitybulletoxys_bow",
			EntityType.Builder.<OxysBowEntity>of(OxysBowEntity::new, MobCategory.MISC).setCustomClientFactory(OxysBowEntity::new)
					.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final EntityType<BlueghastEntity> BLUEGHAST = register("blueghast",
			EntityType.Builder.<BlueghastEntity>of(BlueghastEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlueghastEntity::new).fireImmune().sized(1f, 1f));
	public static final EntityType<BlueghastProjectileEntity> BLUEGHAST_PROJECTILE = register("entitybulletblueghast",
			EntityType.Builder.<BlueghastProjectileEntity>of(BlueghastProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(BlueghastProjectileEntity::new).sized(0.5f, 0.5f));
	public static final EntityType<EndermanblazeEntity> ENDERMANBLAZE = register("endermanblaze",
			EntityType.Builder.<EndermanblazeEntity>of(EndermanblazeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EndermanblazeEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final EntityType<ObsidianGolemEntity> OBSIDIAN_GOLEM = register("obsidian_golem",
			EntityType.Builder.<ObsidianGolemEntity>of(ObsidianGolemEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ObsidianGolemEntity::new).sized(1.4f, 2.7f));
	public static final EntityType<NetheritegolemEntity> NETHERITEGOLEM = register("netheritegolem",
			EntityType.Builder.<NetheritegolemEntity>of(NetheritegolemEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NetheritegolemEntity::new).fireImmune().sized(1.4f, 2.7f));
	public static final EntityType<DrowneHorseEntity> DROWNE_HORSE = register("drowne_horse",
			EntityType.Builder.<DrowneHorseEntity>of(DrowneHorseEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(DrowneHorseEntity::new).sized(0.6f, 1.8f));
	public static final EntityType<EndCreeperEntity> END_CREEPER = register("end_creeper",
			EntityType.Builder.<EndCreeperEntity>of(EndCreeperEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EndCreeperEntity::new).fireImmune().sized(0.6f, 1.7f));
	public static final EntityType<NetherCreeperEntity> NETHER_CREEPER = register("nether_creeper",
			EntityType.Builder.<NetherCreeperEntity>of(NetherCreeperEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NetherCreeperEntity::new).sized(0.6f, 1.7f));

	private static <T extends Entity> EntityType<T> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		EntityType<T> entityType = (EntityType<T>) entityTypeBuilder.build(registryname).setRegistryName(registryname);
		REGISTRY.add(entityType);
		return entityType;
	}

	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new EntityType[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			BlueghastEntity.init();
			EndermanblazeEntity.init();
			ObsidianGolemEntity.init();
			NetheritegolemEntity.init();
			DrowneHorseEntity.init();
			EndCreeperEntity.init();
			NetherCreeperEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(BLUEGHAST, BlueghastEntity.createAttributes().build());
		event.put(ENDERMANBLAZE, EndermanblazeEntity.createAttributes().build());
		event.put(OBSIDIAN_GOLEM, ObsidianGolemEntity.createAttributes().build());
		event.put(NETHERITEGOLEM, NetheritegolemEntity.createAttributes().build());
		event.put(DROWNE_HORSE, DrowneHorseEntity.createAttributes().build());
		event.put(END_CREEPER, EndCreeperEntity.createAttributes().build());
		event.put(NETHER_CREEPER, NetherCreeperEntity.createAttributes().build());
	}
}
