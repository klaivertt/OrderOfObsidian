
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.orderofobsidian.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.orderofobsidian.item.Wooden_armorArmorItem;
import net.mcreator.orderofobsidian.item.WoodKatanaItem;
import net.mcreator.orderofobsidian.item.WoodHammerItem;
import net.mcreator.orderofobsidian.item.WoodBattleAxeItem;
import net.mcreator.orderofobsidian.item.WirecoilCopperItem;
import net.mcreator.orderofobsidian.item.UltimateswordItem;
import net.mcreator.orderofobsidian.item.SushiItem;
import net.mcreator.orderofobsidian.item.StoneKatanaItem;
import net.mcreator.orderofobsidian.item.StoneHammerItem;
import net.mcreator.orderofobsidian.item.StoneBattleAxeItem;
import net.mcreator.orderofobsidian.item.SteelSwordItem;
import net.mcreator.orderofobsidian.item.SteelShovelItem;
import net.mcreator.orderofobsidian.item.SteelPlateItem;
import net.mcreator.orderofobsidian.item.SteelPickaxeItem;
import net.mcreator.orderofobsidian.item.SteelIngotItem;
import net.mcreator.orderofobsidian.item.SteelHoeItem;
import net.mcreator.orderofobsidian.item.SteelDustItem;
import net.mcreator.orderofobsidian.item.SteelAxeItem;
import net.mcreator.orderofobsidian.item.SteelArmorItem;
import net.mcreator.orderofobsidian.item.ProcesseurTierIItem;
import net.mcreator.orderofobsidian.item.ProcesseurTierIIItem;
import net.mcreator.orderofobsidian.item.OxysappleItem;
import net.mcreator.orderofobsidian.item.OxysSwordItem;
import net.mcreator.orderofobsidian.item.OxysStickItem;
import net.mcreator.orderofobsidian.item.OxysSpearItem;
import net.mcreator.orderofobsidian.item.OxysShovelItem;
import net.mcreator.orderofobsidian.item.OxysPickaxeItem;
import net.mcreator.orderofobsidian.item.OxysItem;
import net.mcreator.orderofobsidian.item.OxysHoeItem;
import net.mcreator.orderofobsidian.item.OxysBowItem;
import net.mcreator.orderofobsidian.item.OxysAxeItem;
import net.mcreator.orderofobsidian.item.OxysArmorItem;
import net.mcreator.orderofobsidian.item.Obsidian_toolSwordItem;
import net.mcreator.orderofobsidian.item.Obsidian_toolShovelItem;
import net.mcreator.orderofobsidian.item.Obsidian_toolPickaxeItem;
import net.mcreator.orderofobsidian.item.Obsidian_toolHoeItem;
import net.mcreator.orderofobsidian.item.Obsidian_toolAxeItem;
import net.mcreator.orderofobsidian.item.Obsidian_armorArmorItem;
import net.mcreator.orderofobsidian.item.ObsidianSpearItem;
import net.mcreator.orderofobsidian.item.NetheriteHammerItem;
import net.mcreator.orderofobsidian.item.NetherackarmorArmorItem;
import net.mcreator.orderofobsidian.item.LeadPlateItem;
import net.mcreator.orderofobsidian.item.LeadIngotItem;
import net.mcreator.orderofobsidian.item.LeadDustItem;
import net.mcreator.orderofobsidian.item.IronplateItem;
import net.mcreator.orderofobsidian.item.IronbarreItem;
import net.mcreator.orderofobsidian.item.IronSpearItem;
import net.mcreator.orderofobsidian.item.IronKatanaItem;
import net.mcreator.orderofobsidian.item.IronHammerItem;
import net.mcreator.orderofobsidian.item.IronBattleAxeItem;
import net.mcreator.orderofobsidian.item.HeavyNetheriteItem;
import net.mcreator.orderofobsidian.item.HeavyLatherItem;
import net.mcreator.orderofobsidian.item.HeavyIronItem;
import net.mcreator.orderofobsidian.item.HeavyGoldItem;
import net.mcreator.orderofobsidian.item.HeavyDiamondItem;
import net.mcreator.orderofobsidian.item.GoldenchieldItem;
import net.mcreator.orderofobsidian.item.GoldenchielblokingItem;
import net.mcreator.orderofobsidian.item.GoldSpearItem;
import net.mcreator.orderofobsidian.item.GoldKatanaItem;
import net.mcreator.orderofobsidian.item.GoldHammerItem;
import net.mcreator.orderofobsidian.item.GoldBattleAxeItem;
import net.mcreator.orderofobsidian.item.FaradayArmorItem;
import net.mcreator.orderofobsidian.item.EnergyMetterItem;
import net.mcreator.orderofobsidian.item.DimondhammerItem;
import net.mcreator.orderofobsidian.item.DiamondSpearItem;
import net.mcreator.orderofobsidian.item.DiamondKatanaItem;
import net.mcreator.orderofobsidian.item.DiamondBattleAxeItem;
import net.mcreator.orderofobsidian.item.DiamondAppleItem;
import net.mcreator.orderofobsidian.item.CopperPlateItem;
import net.mcreator.orderofobsidian.item.CopperGearItem;
import net.mcreator.orderofobsidian.item.ChipsItem;
import net.mcreator.orderofobsidian.item.BatterieCellItem;
import net.mcreator.orderofobsidian.item.AluminiumPlateItem;
import net.mcreator.orderofobsidian.item.AluminiumIngotItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OrderofobsidianModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item OXYSAPPLE = register(new OxysappleItem());
	public static final Item INVISIBLE = register(OrderofobsidianModBlocks.INVISIBLE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item NETHERACKARMOR_ARMOR_HELMET = register(new NetherackarmorArmorItem.Helmet());
	public static final Item NETHERACKARMOR_ARMOR_CHESTPLATE = register(new NetherackarmorArmorItem.Chestplate());
	public static final Item NETHERACKARMOR_ARMOR_LEGGINGS = register(new NetherackarmorArmorItem.Leggings());
	public static final Item NETHERACKARMOR_ARMOR_BOOTS = register(new NetherackarmorArmorItem.Boots());
	public static final Item OBSIDIAN_ARMOR_ARMOR_HELMET = register(new Obsidian_armorArmorItem.Helmet());
	public static final Item OBSIDIAN_ARMOR_ARMOR_CHESTPLATE = register(new Obsidian_armorArmorItem.Chestplate());
	public static final Item OBSIDIAN_ARMOR_ARMOR_LEGGINGS = register(new Obsidian_armorArmorItem.Leggings());
	public static final Item OBSIDIAN_ARMOR_ARMOR_BOOTS = register(new Obsidian_armorArmorItem.Boots());
	public static final Item DIAMOND_APPLE = register(new DiamondAppleItem());
	public static final Item OXYS = register(new OxysItem());
	public static final Item OXYS_ORE = register(OrderofobsidianModBlocks.OXYS_ORE, OrderofobsidianModTabs.TAB_SPIRIT);
	public static final Item OXYS_BLOCK = register(OrderofobsidianModBlocks.OXYS_BLOCK, OrderofobsidianModTabs.TAB_SPIRIT);
	public static final Item OXYS_PICKAXE = register(new OxysPickaxeItem());
	public static final Item OXYS_AXE = register(new OxysAxeItem());
	public static final Item OXYS_SWORD = register(new OxysSwordItem());
	public static final Item OXYS_SHOVEL = register(new OxysShovelItem());
	public static final Item OXYS_HOE = register(new OxysHoeItem());
	public static final Item OXYS_ARMOR_HELMET = register(new OxysArmorItem.Helmet());
	public static final Item OXYS_ARMOR_CHESTPLATE = register(new OxysArmorItem.Chestplate());
	public static final Item OXYS_ARMOR_LEGGINGS = register(new OxysArmorItem.Leggings());
	public static final Item OXYS_ARMOR_BOOTS = register(new OxysArmorItem.Boots());
	public static final Item OXYS_STICK = register(new OxysStickItem());
	public static final Item OXYS_BOW = register(new OxysBowItem());
	public static final Item BURNEDTREE_WOOD = register(OrderofobsidianModBlocks.BURNEDTREE_WOOD, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item BURNEDTREE_LOG = register(OrderofobsidianModBlocks.BURNEDTREE_LOG, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item BURNEDTREE_PLANKS = register(OrderofobsidianModBlocks.BURNEDTREE_PLANKS, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item BURNEDTREE_LEAVES = register(OrderofobsidianModBlocks.BURNEDTREE_LEAVES, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item BURNEDTREE_STAIRS = register(OrderofobsidianModBlocks.BURNEDTREE_STAIRS, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item BURNEDTREE_SLAB = register(OrderofobsidianModBlocks.BURNEDTREE_SLAB, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item BURNEDTREE_FENCE = register(OrderofobsidianModBlocks.BURNEDTREE_FENCE, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item BURNEDTREE_FENCE_GATE = register(OrderofobsidianModBlocks.BURNEDTREE_FENCE_GATE, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item BURNEDTREE_PRESSURE_PLATE = register(OrderofobsidianModBlocks.BURNEDTREE_PRESSURE_PLATE,
			OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item BURNEDTREE_BUTTON = register(OrderofobsidianModBlocks.BURNEDTREE_BUTTON, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item WOODEN_ARMOR_ARMOR_HELMET = register(new Wooden_armorArmorItem.Helmet());
	public static final Item WOODEN_ARMOR_ARMOR_CHESTPLATE = register(new Wooden_armorArmorItem.Chestplate());
	public static final Item WOODEN_ARMOR_ARMOR_LEGGINGS = register(new Wooden_armorArmorItem.Leggings());
	public static final Item WOODEN_ARMOR_ARMOR_BOOTS = register(new Wooden_armorArmorItem.Boots());
	public static final Item OBSIDIAN_TOOL_PICKAXE = register(new Obsidian_toolPickaxeItem());
	public static final Item OBSIDIAN_TOOL_AXE = register(new Obsidian_toolAxeItem());
	public static final Item OBSIDIAN_TOOL_SWORD = register(new Obsidian_toolSwordItem());
	public static final Item OBSIDIAN_TOOL_SHOVEL = register(new Obsidian_toolShovelItem());
	public static final Item OBSIDIAN_TOOL_HOE = register(new Obsidian_toolHoeItem());
	public static final Item ULTIMATESWORD = register(new UltimateswordItem());
	public static final Item BLUEGHAST = register(
			new SpawnEggItem(OrderofobsidianModEntities.BLUEGHAST, -16777216, -16757136, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("blueghast_spawn_egg"));
	public static final Item ENDERMANBLAZE = register(
			new SpawnEggItem(OrderofobsidianModEntities.ENDERMANBLAZE, -16777216, -13691522, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("endermanblaze_spawn_egg"));
	public static final Item OBSIDIAN_GOLEM = register(
			new SpawnEggItem(OrderofobsidianModEntities.OBSIDIAN_GOLEM, -1, -1, new Item.Properties().tab(null))
					.setRegistryName("obsidian_golem_spawn_egg"));
	public static final Item NETHERITEGOLEM = register(
			new SpawnEggItem(OrderofobsidianModEntities.NETHERITEGOLEM, -16777216, -13421824, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("netheritegolem_spawn_egg"));
	public static final Item OBSIDIAN_GOLEMHEAD = register(OrderofobsidianModBlocks.OBSIDIAN_GOLEMHEAD, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item NETHERITE_GOLEM_HEAD = register(OrderofobsidianModBlocks.NETHERITE_GOLEM_HEAD, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item DROWNE_HORSE = register(
			new SpawnEggItem(OrderofobsidianModEntities.DROWNE_HORSE, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("drowne_horse_spawn_egg"));
	public static final Item END_CREEPER = register(
			new SpawnEggItem(OrderofobsidianModEntities.END_CREEPER, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("end_creeper_spawn_egg"));
	public static final Item NETHER_CREEPER = register(
			new SpawnEggItem(OrderofobsidianModEntities.NETHER_CREEPER, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("nether_creeper_spawn_egg"));
	public static final Item DIAMONDHAMMER = register(new DimondhammerItem());
	public static final Item IRON_HAMMER = register(new IronHammerItem());
	public static final Item GOLD_HAMMER = register(new GoldHammerItem());
	public static final Item NETHERITE_HAMMER = register(new NetheriteHammerItem());
	public static final Item STONE_HAMMER = register(new StoneHammerItem());
	public static final Item WOOD_HAMMER = register(new WoodHammerItem());
	public static final Item FORGE = register(OrderofobsidianModBlocks.FORGE, OrderofobsidianModTabs.TAB_MACHINE);
	public static final Item COPPER_GEAR = register(new CopperGearItem());
	public static final Item FORGEON = register(OrderofobsidianModBlocks.FORGEON, null);
	public static final Item ENERGY_METTER = register(new EnergyMetterItem());
	public static final Item BATTERIE_1 = register(OrderofobsidianModBlocks.BATTERIE_1, OrderofobsidianModTabs.TAB_MACHINE);
	public static final Item SOLAR_PANNEL_TIER_I = register(OrderofobsidianModBlocks.SOLAR_PANNEL_TIER_I, OrderofobsidianModTabs.TAB_MACHINE);
	public static final Item FAN = register(OrderofobsidianModBlocks.FAN, OrderofobsidianModTabs.TAB_MACHINE);
	public static final Item GOLDENCHIELD = register(new GoldenchieldItem());
	public static final Item GOLDENCHIELBLOKING = register(new GoldenchielblokingItem());
	public static final Item LEAD_DUST = register(new LeadDustItem());
	public static final Item LEAD_INGOT = register(new LeadIngotItem());
	public static final Item LEAD_PLATE = register(new LeadPlateItem());
	public static final Item WIRECOIL_COPPER = register(new WirecoilCopperItem());
	public static final Item BATTERIE_CELL = register(new BatterieCellItem());
	public static final Item IRONPLATE = register(new IronplateItem());
	public static final Item ELECTRIQUE_FURNACE = register(OrderofobsidianModBlocks.ELECTRIQUE_FURNACE, OrderofobsidianModTabs.TAB_MACHINE);
	public static final Item STEEL_DUST = register(new SteelDustItem());
	public static final Item STEEL_INGOT = register(new SteelIngotItem());
	public static final Item STEEL_PLATE = register(new SteelPlateItem());
	public static final Item COPPER_PLATE = register(new CopperPlateItem());
	public static final Item PROCESSEUR_TIER_I = register(new ProcesseurTierIItem());
	public static final Item PROCESSEUR_TIER_II = register(new ProcesseurTierIIItem());
	public static final Item ALUMINIUM_INGOT = register(new AluminiumIngotItem());
	public static final Item ALUMINIUM_PLATE = register(new AluminiumPlateItem());
	public static final Item STEEL_ARMOR_HELMET = register(new SteelArmorItem.Helmet());
	public static final Item STEEL_ARMOR_CHESTPLATE = register(new SteelArmorItem.Chestplate());
	public static final Item STEEL_ARMOR_LEGGINGS = register(new SteelArmorItem.Leggings());
	public static final Item STEEL_ARMOR_BOOTS = register(new SteelArmorItem.Boots());
	public static final Item STEEL_PICKAXE = register(new SteelPickaxeItem());
	public static final Item STEEL_AXE = register(new SteelAxeItem());
	public static final Item STEEL_SWORD = register(new SteelSwordItem());
	public static final Item STEEL_SHOVEL = register(new SteelShovelItem());
	public static final Item STEEL_HOE = register(new SteelHoeItem());
	public static final Item ALUMINIUM_ORE = register(OrderofobsidianModBlocks.ALUMINIUM_ORE, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item FARADAY_ARMOR_HELMET = register(new FaradayArmorItem.Helmet());
	public static final Item FARADAY_ARMOR_CHESTPLATE = register(new FaradayArmorItem.Chestplate());
	public static final Item FARADAY_ARMOR_LEGGINGS = register(new FaradayArmorItem.Leggings());
	public static final Item FARADAY_ARMOR_BOOTS = register(new FaradayArmorItem.Boots());
	public static final Item NYLIUM_WOOD = register(OrderofobsidianModBlocks.NYLIUM_WOOD, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item NYLIUM_LOG = register(OrderofobsidianModBlocks.NYLIUM_LOG, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item NYLIUM_PLANKS = register(OrderofobsidianModBlocks.NYLIUM_PLANKS, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item NYLIUM_LEAVES = register(OrderofobsidianModBlocks.NYLIUM_LEAVES, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item NYLIUM_STAIRS = register(OrderofobsidianModBlocks.NYLIUM_STAIRS, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item NYLIUM_SLAB = register(OrderofobsidianModBlocks.NYLIUM_SLAB, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item NYLIUM_FENCE = register(OrderofobsidianModBlocks.NYLIUM_FENCE, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item NYLIUM_FENCE_GATE = register(OrderofobsidianModBlocks.NYLIUM_FENCE_GATE, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item NYLIUM_PRESSURE_PLATE = register(OrderofobsidianModBlocks.NYLIUM_PRESSURE_PLATE, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item NYLIUM_BUTTON = register(OrderofobsidianModBlocks.NYLIUM_BUTTON, OrderofobsidianModTabs.TAB_BLOC_K);
	public static final Item IRON_SPEAR = register(new IronSpearItem());
	public static final Item GOLD_SPEAR = register(new GoldSpearItem());
	public static final Item DIAMOND_SPEAR = register(new DiamondSpearItem());
	public static final Item OBSIDIAN_SPEAR = register(new ObsidianSpearItem());
	public static final Item OXYS_SPEAR = register(new OxysSpearItem());
	public static final Item DIAMOND_BATTLE_AXE = register(new DiamondBattleAxeItem());
	public static final Item GOLD_BATTLE_AXE = register(new GoldBattleAxeItem());
	public static final Item IRON_BATTLE_AXE = register(new IronBattleAxeItem());
	public static final Item STONE_BATTLE_AXE = register(new StoneBattleAxeItem());
	public static final Item WOOD_BATTLE_AXE = register(new WoodBattleAxeItem());
	public static final Item DIAMOND_KATANA = register(new DiamondKatanaItem());
	public static final Item GOLD_KATANA = register(new GoldKatanaItem());
	public static final Item IRON_KATANA = register(new IronKatanaItem());
	public static final Item STONE_KATANA = register(new StoneKatanaItem());
	public static final Item WOOD_KATANA = register(new WoodKatanaItem());
	public static final Item IRONBARRE = register(new IronbarreItem());
	public static final Item HEAVY_NETHERITE_HELMET = register(new HeavyNetheriteItem.Helmet());
	public static final Item HEAVY_NETHERITE_CHESTPLATE = register(new HeavyNetheriteItem.Chestplate());
	public static final Item HEAVY_NETHERITE_LEGGINGS = register(new HeavyNetheriteItem.Leggings());
	public static final Item HEAVY_NETHERITE_BOOTS = register(new HeavyNetheriteItem.Boots());
	public static final Item HEAVY_DIAMOND_HELMET = register(new HeavyDiamondItem.Helmet());
	public static final Item HEAVY_DIAMOND_CHESTPLATE = register(new HeavyDiamondItem.Chestplate());
	public static final Item HEAVY_DIAMOND_LEGGINGS = register(new HeavyDiamondItem.Leggings());
	public static final Item HEAVY_DIAMOND_BOOTS = register(new HeavyDiamondItem.Boots());
	public static final Item HEAVY_GOLD_HELMET = register(new HeavyGoldItem.Helmet());
	public static final Item HEAVY_GOLD_CHESTPLATE = register(new HeavyGoldItem.Chestplate());
	public static final Item HEAVY_GOLD_LEGGINGS = register(new HeavyGoldItem.Leggings());
	public static final Item HEAVY_GOLD_BOOTS = register(new HeavyGoldItem.Boots());
	public static final Item HEAVY_IRON_HELMET = register(new HeavyIronItem.Helmet());
	public static final Item HEAVY_IRON_CHESTPLATE = register(new HeavyIronItem.Chestplate());
	public static final Item HEAVY_IRON_LEGGINGS = register(new HeavyIronItem.Leggings());
	public static final Item HEAVY_IRON_BOOTS = register(new HeavyIronItem.Boots());
	public static final Item HEAVY_LATHER_HELMET = register(new HeavyLatherItem.Helmet());
	public static final Item HEAVY_LATHER_CHESTPLATE = register(new HeavyLatherItem.Chestplate());
	public static final Item HEAVY_LATHER_LEGGINGS = register(new HeavyLatherItem.Leggings());
	public static final Item HEAVY_LATHER_BOOTS = register(new HeavyLatherItem.Boots());
	public static final Item CHIPS = register(new ChipsItem());
	public static final Item SUSHI = register(new SushiItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}