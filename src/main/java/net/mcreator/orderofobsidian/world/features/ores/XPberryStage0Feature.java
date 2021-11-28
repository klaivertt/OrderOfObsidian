
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
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.Registry;

import net.mcreator.orderofobsidian.init.OrderofobsidianModBlocks;

import java.util.Set;
import java.util.Random;

public class XPberryStage0Feature extends OreFeature {
	public static final XPberryStage0Feature FEATURE = (XPberryStage0Feature) new XPberryStage0Feature()
			.setRegistryName("orderofobsidian:xpbush_stage_0");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(XPberryStage0FeatureRuleTest.INSTANCE, OrderofobsidianModBlocks.XPBUSH_STAGE_0.defaultBlockState(), 1))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(0), VerticalAnchor.absolute(20)))).squared().count(4);
	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public XPberryStage0Feature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		Level world = context.level().getLevel();
		ResourceKey<Level> dimensionType = world.dimension();
		boolean dimensionCriteria = false;
		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;
		if (!dimensionCriteria)
			return false;
		return super.place(context);
	}

	private static class XPberryStage0FeatureRuleTest extends RuleTest {
		static final XPberryStage0FeatureRuleTest INSTANCE = new XPberryStage0FeatureRuleTest();
		static final com.mojang.serialization.Codec<XPberryStage0FeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
		static final RuleTestType<XPberryStage0FeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("orderofobsidian:xpbush_stage_0_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;
			if (blockAt.getBlock() == Blocks.STONE)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.GRANITE)
				blockCriteria = true;
			if (blockAt.getBlock() == Blocks.ANDESITE)
				blockCriteria = true;
			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}
	}
}
