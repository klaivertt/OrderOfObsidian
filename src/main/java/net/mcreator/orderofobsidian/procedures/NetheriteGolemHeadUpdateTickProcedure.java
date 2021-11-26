package net.mcreator.orderofobsidian.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.orderofobsidian.init.OrderofobsidianModEntities;
import net.mcreator.orderofobsidian.entity.NetheritegolemEntity;

public class NetheriteGolemHeadUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == Blocks.NETHERITE_BLOCK
				&& (world.getBlockState(new BlockPos((int) (x - 1), (int) (y - 1), (int) z))).getBlock() == Blocks.NETHERITE_BLOCK
				|| (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)))).getBlock() == Blocks.NETHERITE_BLOCK
						&& (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)))).getBlock() == Blocks.NETHERITE_BLOCK)
				&& (world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.NETHERITE_BLOCK
				&& (world.getBlockState(new BlockPos((int) x, (int) (y - 2), (int) z))).getBlock() == Blocks.NETHERITE_BLOCK) {
			world.setBlock(new BlockPos((int) x, (int) (y - 1), (int) z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos((int) x, (int) (y - 2), (int) z), Blocks.AIR.defaultBlockState(), 3);
			if ((world.getBlockState(new BlockPos((int) (x + 1), (int) (y - 1), (int) z))).getBlock() == Blocks.NETHERITE_BLOCK) {
				world.setBlock(new BlockPos((int) (x + 1), (int) (y - 1), (int) z), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos((int) (x - 1), (int) (y - 1), (int) z), Blocks.AIR.defaultBlockState(), 3);
			} else {
				world.setBlock(new BlockPos((int) x, (int) (y - 1), (int) (z - 1)), Blocks.AIR.defaultBlockState(), 3);
				world.setBlock(new BlockPos((int) x, (int) (y - 1), (int) (z + 1)), Blocks.AIR.defaultBlockState(), 3);
			}
			world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new NetheritegolemEntity(OrderofobsidianModEntities.NETHERITEGOLEM, _level);
				entityToSpawn.moveTo(x, (y - 1), z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null,
							null);
				world.addFreshEntity(entityToSpawn);
			}
		}
	}
}
