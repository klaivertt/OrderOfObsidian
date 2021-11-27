
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.orderofobsidian.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.orderofobsidian.block.SolarPannelTierVBlock;
import net.mcreator.orderofobsidian.block.SolarPannelTierIVBlock;
import net.mcreator.orderofobsidian.block.SolarPannelTierIIIBlock;
import net.mcreator.orderofobsidian.block.SolarPannelTierIBlock;
import net.mcreator.orderofobsidian.block.SolarPannelTier2Block;
import net.mcreator.orderofobsidian.block.SilverOreBlock;
import net.mcreator.orderofobsidian.block.RiceStage7Block;
import net.mcreator.orderofobsidian.block.RiceStage6Block;
import net.mcreator.orderofobsidian.block.RiceStage5Block;
import net.mcreator.orderofobsidian.block.RiceStage4Block;
import net.mcreator.orderofobsidian.block.RiceStage3Block;
import net.mcreator.orderofobsidian.block.RiceStage2Block;
import net.mcreator.orderofobsidian.block.RiceStage1Block;
import net.mcreator.orderofobsidian.block.RiceStage0Block;
import net.mcreator.orderofobsidian.block.OxysOreBlock;
import net.mcreator.orderofobsidian.block.OxysBlockBlock;
import net.mcreator.orderofobsidian.block.ObsidianGolemheadBlock;
import net.mcreator.orderofobsidian.block.NyliumWoodBlock;
import net.mcreator.orderofobsidian.block.NyliumStairsBlock;
import net.mcreator.orderofobsidian.block.NyliumSlabBlock;
import net.mcreator.orderofobsidian.block.NyliumPressurePlateBlock;
import net.mcreator.orderofobsidian.block.NyliumPlanksBlock;
import net.mcreator.orderofobsidian.block.NyliumLogBlock;
import net.mcreator.orderofobsidian.block.NyliumLeavesBlock;
import net.mcreator.orderofobsidian.block.NyliumFenceGateBlock;
import net.mcreator.orderofobsidian.block.NyliumFenceBlock;
import net.mcreator.orderofobsidian.block.NyliumButtonBlock;
import net.mcreator.orderofobsidian.block.NetheriteGolemHeadBlock;
import net.mcreator.orderofobsidian.block.InvisibleBlock;
import net.mcreator.orderofobsidian.block.GraphiteOreBlock;
import net.mcreator.orderofobsidian.block.GraphiteGlassBlock;
import net.mcreator.orderofobsidian.block.ForgeonBlock;
import net.mcreator.orderofobsidian.block.ForgeBlock;
import net.mcreator.orderofobsidian.block.FanBlock;
import net.mcreator.orderofobsidian.block.ElectriqueFurnaceBlock;
import net.mcreator.orderofobsidian.block.DiamondGlassBlock;
import net.mcreator.orderofobsidian.block.BurnedtreeWoodBlock;
import net.mcreator.orderofobsidian.block.BurnedtreeStairsBlock;
import net.mcreator.orderofobsidian.block.BurnedtreeSlabBlock;
import net.mcreator.orderofobsidian.block.BurnedtreePressurePlateBlock;
import net.mcreator.orderofobsidian.block.BurnedtreePlanksBlock;
import net.mcreator.orderofobsidian.block.BurnedtreeLogBlock;
import net.mcreator.orderofobsidian.block.BurnedtreeLeavesBlock;
import net.mcreator.orderofobsidian.block.BurnedtreeFenceGateBlock;
import net.mcreator.orderofobsidian.block.BurnedtreeFenceBlock;
import net.mcreator.orderofobsidian.block.BurnedtreeButtonBlock;
import net.mcreator.orderofobsidian.block.Batterie1Block;
import net.mcreator.orderofobsidian.block.AluminiumOreBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OrderofobsidianModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block INVISIBLE = register(new InvisibleBlock());
	public static final Block OXYS_ORE = register(new OxysOreBlock());
	public static final Block OXYS_BLOCK = register(new OxysBlockBlock());
	public static final Block BURNEDTREE_WOOD = register(new BurnedtreeWoodBlock());
	public static final Block BURNEDTREE_LOG = register(new BurnedtreeLogBlock());
	public static final Block BURNEDTREE_PLANKS = register(new BurnedtreePlanksBlock());
	public static final Block BURNEDTREE_LEAVES = register(new BurnedtreeLeavesBlock());
	public static final Block BURNEDTREE_STAIRS = register(new BurnedtreeStairsBlock());
	public static final Block BURNEDTREE_SLAB = register(new BurnedtreeSlabBlock());
	public static final Block BURNEDTREE_FENCE = register(new BurnedtreeFenceBlock());
	public static final Block BURNEDTREE_FENCE_GATE = register(new BurnedtreeFenceGateBlock());
	public static final Block BURNEDTREE_PRESSURE_PLATE = register(new BurnedtreePressurePlateBlock());
	public static final Block BURNEDTREE_BUTTON = register(new BurnedtreeButtonBlock());
	public static final Block OBSIDIAN_GOLEMHEAD = register(new ObsidianGolemheadBlock());
	public static final Block NETHERITE_GOLEM_HEAD = register(new NetheriteGolemHeadBlock());
	public static final Block FORGE = register(new ForgeBlock());
	public static final Block FORGEON = register(new ForgeonBlock());
	public static final Block BATTERIE_1 = register(new Batterie1Block());
	public static final Block SOLAR_PANNEL_TIER_I = register(new SolarPannelTierIBlock());
	public static final Block FAN = register(new FanBlock());
	public static final Block ELECTRIQUE_FURNACE = register(new ElectriqueFurnaceBlock());
	public static final Block ALUMINIUM_ORE = register(new AluminiumOreBlock());
	public static final Block NYLIUM_WOOD = register(new NyliumWoodBlock());
	public static final Block NYLIUM_LOG = register(new NyliumLogBlock());
	public static final Block NYLIUM_PLANKS = register(new NyliumPlanksBlock());
	public static final Block NYLIUM_LEAVES = register(new NyliumLeavesBlock());
	public static final Block NYLIUM_STAIRS = register(new NyliumStairsBlock());
	public static final Block NYLIUM_SLAB = register(new NyliumSlabBlock());
	public static final Block NYLIUM_FENCE = register(new NyliumFenceBlock());
	public static final Block NYLIUM_FENCE_GATE = register(new NyliumFenceGateBlock());
	public static final Block NYLIUM_PRESSURE_PLATE = register(new NyliumPressurePlateBlock());
	public static final Block NYLIUM_BUTTON = register(new NyliumButtonBlock());
	public static final Block SOLAR_PANNEL_TIER_2 = register(new SolarPannelTier2Block());
	public static final Block SOLAR_PANNEL_TIER_III = register(new SolarPannelTierIIIBlock());
	public static final Block SOLAR_PANNEL_TIER_IV = register(new SolarPannelTierIVBlock());
	public static final Block SOLAR_PANNEL_TIER_V = register(new SolarPannelTierVBlock());
	public static final Block RICE_STAGE_0 = register(new RiceStage0Block());
	public static final Block RICE_STAGE_1 = register(new RiceStage1Block());
	public static final Block RICE_STAGE_2 = register(new RiceStage2Block());
	public static final Block RICE_STAGE_3 = register(new RiceStage3Block());
	public static final Block RICE_STAGE_4 = register(new RiceStage4Block());
	public static final Block RICE_STAGE_5 = register(new RiceStage5Block());
	public static final Block RICE_STAGE_6 = register(new RiceStage6Block());
	public static final Block RICE_STAGE_7 = register(new RiceStage7Block());
	public static final Block SILVER_ORE = register(new SilverOreBlock());
	public static final Block GRAPHITE_ORE = register(new GraphiteOreBlock());
	public static final Block DIAMOND_GLASS = register(new DiamondGlassBlock());
	public static final Block GRAPHITE_GLASS = register(new GraphiteGlassBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			InvisibleBlock.registerRenderLayer();
			SolarPannelTierIBlock.registerRenderLayer();
			NyliumLeavesBlock.registerRenderLayer();
			SolarPannelTier2Block.registerRenderLayer();
			SolarPannelTierIIIBlock.registerRenderLayer();
			SolarPannelTierIVBlock.registerRenderLayer();
			SolarPannelTierVBlock.registerRenderLayer();
			RiceStage0Block.registerRenderLayer();
			RiceStage1Block.registerRenderLayer();
			RiceStage2Block.registerRenderLayer();
			RiceStage3Block.registerRenderLayer();
			RiceStage4Block.registerRenderLayer();
			RiceStage5Block.registerRenderLayer();
			RiceStage6Block.registerRenderLayer();
			RiceStage7Block.registerRenderLayer();
			DiamondGlassBlock.registerRenderLayer();
			GraphiteGlassBlock.registerRenderLayer();
		}

		@SubscribeEvent
		public static void blockColorLoad(ColorHandlerEvent.Block event) {
			GraphiteGlassBlock.blockColorLoad(event);
		}
	}
}
