
package net.mcreator.orderofobsidian.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.orderofobsidian.procedures.EnergySettingDeviceRightClickedInAirProcedure;
import net.mcreator.orderofobsidian.init.OrderofobsidianModTabs;

public class EnergySettingDeviceItem extends Item {
	public EnergySettingDeviceItem() {
		super(new Item.Properties().tab(OrderofobsidianModTabs.TAB_TOOLS).stacksTo(1).rarity(Rarity.UNCOMMON));
		setRegistryName("energy_setting_device");
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

		EnergySettingDeviceRightClickedInAirProcedure.execute(entity);
		return ar;
	}
}
