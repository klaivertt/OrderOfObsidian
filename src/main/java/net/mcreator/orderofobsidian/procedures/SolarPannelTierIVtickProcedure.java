package net.mcreator.orderofobsidian.procedures;

import net.minecraftforge.energy.CapabilityEnergy;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import java.util.concurrent.atomic.AtomicBoolean;

public class SolarPannelTierIVtickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.canSeeSkyFromBelowWater(new BlockPos((int) x, (int) y, (int) z)) && (world instanceof Level _lvl ? _lvl.isDay() : false)
				&& new Object() {
					public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
						AtomicBoolean _retval = new AtomicBoolean(false);
						BlockEntity _ent = level.getBlockEntity(pos);
						if (_ent != null)
							_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP).ifPresent(capability -> _retval.set(capability.canReceive()));
						return _retval.get();
					}
				}.canReceiveEnergy(world, new BlockPos((int) x, (int) (y - 1), (int) z))) {
			{
				BlockEntity _ent = world.getBlockEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				int _amount = 25;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, Direction.UP).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		}
	}
}
