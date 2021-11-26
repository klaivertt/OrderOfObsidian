package net.mcreator.orderofobsidian.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class Barre1Procedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean test = false;
		if (new Object() {
			public double getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getDouble(tag);
				return -1;
			}
		}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible") == 1) {
			test = (boolean) (true);
		} else {
			test = (boolean) (false);
		}
		return test;
	}
}
