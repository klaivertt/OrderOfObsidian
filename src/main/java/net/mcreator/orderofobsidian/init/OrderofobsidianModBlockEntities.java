
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.orderofobsidian.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.orderofobsidian.block.entity.ForgeonBlockEntity;
import net.mcreator.orderofobsidian.block.entity.ForgeBlockEntity;
import net.mcreator.orderofobsidian.block.entity.FanBlockEntity;
import net.mcreator.orderofobsidian.block.entity.ElectriqueFurnaceBlockEntity;
import net.mcreator.orderofobsidian.block.entity.Batterie1BlockEntity;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OrderofobsidianModBlockEntities {
	private static final List<BlockEntityType<?>> REGISTRY = new ArrayList<>();
	public static final BlockEntityType<?> FORGE = register("orderofobsidian:forge", OrderofobsidianModBlocks.FORGE, ForgeBlockEntity::new);
	public static final BlockEntityType<?> FORGEON = register("orderofobsidian:forgeon", OrderofobsidianModBlocks.FORGEON, ForgeonBlockEntity::new);
	public static final BlockEntityType<?> BATTERIE_1 = register("orderofobsidian:batterie_1", OrderofobsidianModBlocks.BATTERIE_1,
			Batterie1BlockEntity::new);
	public static final BlockEntityType<?> FAN = register("orderofobsidian:fan", OrderofobsidianModBlocks.FAN, FanBlockEntity::new);
	public static final BlockEntityType<?> ELECTRIQUE_FURNACE = register("orderofobsidian:electrique_furnace",
			OrderofobsidianModBlocks.ELECTRIQUE_FURNACE, ElectriqueFurnaceBlockEntity::new);

	private static BlockEntityType<?> register(String registryname, Block block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		BlockEntityType<?> blockEntityType = BlockEntityType.Builder.of(supplier, block).build(null).setRegistryName(registryname);
		REGISTRY.add(blockEntityType);
		return blockEntityType;
	}

	@SubscribeEvent
	public static void registerTileEntity(RegistryEvent.Register<BlockEntityType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new BlockEntityType[0]));
	}
}
