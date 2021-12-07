
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.orderofobsidian.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.core.Registry;

import net.mcreator.orderofobsidian.world.features.ores.XPbushOreFeature;
import net.mcreator.orderofobsidian.world.features.ores.SilverOreFeature;
import net.mcreator.orderofobsidian.world.features.ores.OxysOreFeature;
import net.mcreator.orderofobsidian.world.features.ores.GraphiteOreFeature;
import net.mcreator.orderofobsidian.world.features.ores.BauheriteOreFeature;
import net.mcreator.orderofobsidian.world.features.ores.AvenroniteOreFeature;
import net.mcreator.orderofobsidian.world.features.ores.AluminiumOreFeature;
import net.mcreator.orderofobsidian.world.features.ores.AikigiteOreFeature;
import net.mcreator.orderofobsidian.world.features.SmallchaletwithgardenFeature;
import net.mcreator.orderofobsidian.world.features.ObsidianlavalakeFeature;
import net.mcreator.orderofobsidian.world.features.Medievaltent3Feature;
import net.mcreator.orderofobsidian.world.features.Medievaltent2Feature;
import net.mcreator.orderofobsidian.world.features.Medievaltent1Feature;
import net.mcreator.orderofobsidian.world.features.MedievalTentFeature;
import net.mcreator.orderofobsidian.world.features.LighthouseMedievalFeature;

import java.util.Set;
import java.util.Map;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OrderofobsidianModFeatures {
	private static final Map<Feature<?>, FeatureRegistration> REGISTRY = new HashMap<>();
	static {
		REGISTRY.put(OxysOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, OxysOreFeature.GENERATE_BIOMES,
				OxysOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(ObsidianlavalakeFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				ObsidianlavalakeFeature.GENERATE_BIOMES, ObsidianlavalakeFeature.CONFIGURED_FEATURE));
		REGISTRY.put(LighthouseMedievalFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				LighthouseMedievalFeature.GENERATE_BIOMES, LighthouseMedievalFeature.CONFIGURED_FEATURE));
		REGISTRY.put(MedievalTentFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				MedievalTentFeature.GENERATE_BIOMES, MedievalTentFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SmallchaletwithgardenFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				SmallchaletwithgardenFeature.GENERATE_BIOMES, SmallchaletwithgardenFeature.CONFIGURED_FEATURE));
		REGISTRY.put(Medievaltent1Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Medievaltent1Feature.GENERATE_BIOMES, Medievaltent1Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Medievaltent2Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Medievaltent2Feature.GENERATE_BIOMES, Medievaltent2Feature.CONFIGURED_FEATURE));
		REGISTRY.put(Medievaltent3Feature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.SURFACE_STRUCTURES,
				Medievaltent3Feature.GENERATE_BIOMES, Medievaltent3Feature.CONFIGURED_FEATURE));
		REGISTRY.put(AluminiumOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				AluminiumOreFeature.GENERATE_BIOMES, AluminiumOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(SilverOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, SilverOreFeature.GENERATE_BIOMES,
				SilverOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(GraphiteOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				GraphiteOreFeature.GENERATE_BIOMES, GraphiteOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AikigiteOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				AikigiteOreFeature.GENERATE_BIOMES, AikigiteOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(BauheriteOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				BauheriteOreFeature.GENERATE_BIOMES, BauheriteOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(AvenroniteOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES,
				AvenroniteOreFeature.GENERATE_BIOMES, AvenroniteOreFeature.CONFIGURED_FEATURE));
		REGISTRY.put(XPbushOreFeature.FEATURE, new FeatureRegistration(GenerationStep.Decoration.UNDERGROUND_ORES, XPbushOreFeature.GENERATE_BIOMES,
				XPbushOreFeature.CONFIGURED_FEATURE));
	}

	@SubscribeEvent
	public static void registerFeature(RegistryEvent.Register<Feature<?>> event) {
		event.getRegistry().registerAll(REGISTRY.keySet().toArray(new Feature[0]));
		REGISTRY.forEach((feature, registration) -> Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, feature.getRegistryName(),
				registration.configuredFeature()));
	}

	@Mod.EventBusSubscriber
	private static class BiomeFeatureLoader {
		@SubscribeEvent
		public static void addFeatureToBiomes(BiomeLoadingEvent event) {
			for (FeatureRegistration registration : REGISTRY.values()) {
				if (registration.biomes() == null || registration.biomes().contains(event.getName())) {
					event.getGeneration().getFeatures(registration.stage()).add(() -> registration.configuredFeature());
				}
			}
		}
	}

	private static record FeatureRegistration(GenerationStep.Decoration stage, Set<ResourceLocation> biomes,
			ConfiguredFeature<?, ?> configuredFeature) {
	}
}
