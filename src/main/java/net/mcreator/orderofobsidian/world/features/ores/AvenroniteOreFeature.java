
package net.mcreator.orderofobsidian.world.features.ores;

import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTestType;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.heightproviders.UniformHeight;
import net.minecraft.world.level.levelgen.feature.configurations.RangeDecoratorConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.feature.OreFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.mcreator.orderofobsidian.init.OrderofobsidianModBlocks;

import java.util.Set;
import java.util.Random;

public class AvenroniteOreFeature extends OreFeature {
	public static final AvenroniteOreFeature FEATURE = (AvenroniteOreFeature) new AvenroniteOreFeature()
			.setRegistryName("orderofobsidian:avenronite_ore");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(AvenroniteOreFeatureRuleTest.INSTANCE, OrderofobsidianModBlocks.AVENRONITE_ORE.defaultBlockState(), 1))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(1), VerticalAnchor.absolute(64)))).squared().count(3);
	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public AvenroniteOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;
		if (dimensionType == Level.NETHER)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return false;
		return super.place(context);
	}

	private static class AvenroniteOreFeatureRuleTest extends RuleTest {
		static final AvenroniteOreFeatureRuleTest INSTANCE = new AvenroniteOreFeatureRuleTest();
		static final com.mojang.serialization.Codec<AvenroniteOreFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		static final RuleTestType<AvenroniteOreFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("orderofobsidian:avenronite_ore_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;
			if (blockAt.getBlock() == Blocks.NETHER_GOLD_ORE)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.NETHERRACK)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.NETHER_QUARTZ_ORE)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.WARPED_NYLIUM)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.CRIMSON_NYLIUM)
				blockCriteria = true;
			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
