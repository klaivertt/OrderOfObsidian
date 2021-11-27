
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.orderofobsidian.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.orderofobsidian.block.SolarPannelTierIBlock;
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
import net.mcreator.orderofobsidian.block.ForgeonBlock;
import net.mcreator.orderofobsidian.block.ForgeBlock;
import net.mcreator.orderofobsidian.block.FanBlock;
import net.mcreator.orderofobsidian.block.ElectriqueFurnaceBlock;
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
		}
	}
}