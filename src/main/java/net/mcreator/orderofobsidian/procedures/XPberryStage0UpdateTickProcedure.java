package net.mcreator.orderofobsidian.procedures;

import net.minecraftforge.eventbus.api.Event;

public class XPberryStage0UpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos((int) x, (int) y, (int) z), OrderofobsidianModBlocks.XP_BUSH_1.defaultBlockState(), 3);
	}
}
