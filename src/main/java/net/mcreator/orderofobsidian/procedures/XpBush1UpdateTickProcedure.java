package net.mcreator.orderofobsidian.procedures;

import net.minecraftforge.eventbus.api.Event;

public class XpBush1UpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos((int) x, (int) y, (int) z), OrderofobsidianModBlocks.XPBERY_FULL.defaultBlockState(), 3);
	}
}
