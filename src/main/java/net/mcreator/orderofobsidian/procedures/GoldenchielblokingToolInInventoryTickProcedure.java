package net.mcreator.orderofobsidian.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.orderofobsidian.init.OrderofobsidianModItems;

public class GoldenchielblokingToolInInventoryTickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double sheildDamage = 0;
		double localShieldTimer = 0;
		if (sheildDamage == 0
				&& itemstack.getItem() == (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem()) {
			sheildDamage = (double) ((itemstack).getDamageValue());
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(OrderofobsidianModItems.GOLDENCHIELD);
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
				if (_entity instanceof ServerPlayer _serverPlayer)
					_serverPlayer.getInventory().setChanged();
			}
			((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY)).setDamageValue((int) sheildDamage);
		} else {
			localShieldTimer = (double) (sheildDamage - 1);
			sheildDamage = (double) localShieldTimer;
		}
	}
}