
package net.mcreator.orderofobsidian.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.orderofobsidian.procedures.EnergySettingDevice0RightClickedInAirProcedure;

public class EnergySettingDevice0Item extends Item {
	public EnergySettingDevice0Item() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.UNCOMMON));
		setRegistryName("energy_setting_device_0");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		EnergySettingDevice0RightClickedInAirProcedure.execute(entity);
		return ar;
	}
}
