package net.mcreator.orderofobsidian.procedures;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.orderofobsidian.network.OrderofobsidianModVariables;

public class TestFeu3Procedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		boolean test = false;
		if (OrderofobsidianModVariables.MapVariables.get(world).anim == 3 && new Object() {
			public boolean getValue(LevelAccessor world, BlockPos pos, String tag) {
				BlockEntity blockEntity = world.getBlockEntity(pos);
				if (blockEntity != null)
					return blockEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "animFlamme")) {
			test = (boolean) (true);
		} else {
			test = (boolean) (false);
		}
		return test;
	}
}
