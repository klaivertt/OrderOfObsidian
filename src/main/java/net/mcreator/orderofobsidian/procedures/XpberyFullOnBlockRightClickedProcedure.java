package net.mcreator.orderofobsidian.procedures;

import net.minecraftforge.eventbus.api.Event;

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
			if (Math.random() < 0.95) {
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
