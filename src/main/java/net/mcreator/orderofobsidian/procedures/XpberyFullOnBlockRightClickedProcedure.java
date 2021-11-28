package net.mcreator.orderofobsidian.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.core.BlockPos;

import net.mcreator.orderofobsidian.init.OrderofobsidianModItems;
import net.mcreator.orderofobsidian.init.OrderofobsidianModBlocks;

public class XpberyFullOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof Level _level && !_level.isClientSide()) {
			ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(OrderofobsidianModItems.X_PBERRY));
			entityToSpawn.setPickUpDelay(10);
			_level.addFreshEntity(entityToSpawn);
		}
		if (Math.random() < 0.5) {
			if (world instanceof Level _level && !_level.isClientSide()) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(OrderofobsidianModItems.X_PBERRY));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		} else {
			if (Math.random() < 0.8) {
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(OrderofobsidianModBlocks.XPBUSH_STAGE_0));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			}
		}
		world.setBlock(new BlockPos((int) x, (int) y, (int) z), OrderofobsidianModBlocks.XP_BUSH_1.defaultBlockState(), 3);
	}
}
