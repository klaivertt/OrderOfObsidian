
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.orderofobsidian.init;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.biome.Biome;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.orderofobsidian.world.biome.VolcanBiome;
import net.mcreator.orderofobsidian.world.biome.PikeperchhillBiome;
import net.mcreator.orderofobsidian.world.biome.NyliumForestBiome;
import net.mcreator.orderofobsidian.OrderofobsidianMod;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OrderofobsidianModBiomes {
	private static final List<Biome> REGISTRY = new ArrayList<>();
	public static Biome VOLCAN = register("volcan", VolcanBiome.createBiome());
	public static Biome PIKEPERCHHILL = register("pikeperchhill", PikeperchhillBiome.createBiome());
	public static Biome NYLIUM_FOREST = register("nylium_forest", NyliumForestBiome.createBiome());

	private static Biome register(String registryname, Biome biome) {
		REGISTRY.add(biome.setRegistryName(new ResourceLocation(OrderofobsidianMod.MODID, registryname)));
		return biome;
	}

	@SubscribeEvent
	public static void registerBiomes(RegistryEvent.Register<Biome> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Biome[0]));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			VolcanBiome.init();
			PikeperchhillBiome.init();
			NyliumForestBiome.init();
		});
	}
}
