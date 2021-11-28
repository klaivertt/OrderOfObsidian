package net.mcreator.orderofobsidian.procedures;

import net.minecraftforge.eventbus.api.Event;

public class XPberryRightClickedInAirProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _level && !_level.isClientSide())
			_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 3));
		if (Math.random() > 0.7) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 3));
		}
		if (Math.random() > 0.9) {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.addFreshEntity(new ExperienceOrb(_level, x, y, z, 3));
		}
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(OrderofobsidianModItems.X_PBERRY);
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
	}
}
