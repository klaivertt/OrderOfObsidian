
package net.mcreator.orderofobsidian.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.orderofobsidian.procedures.DiamondAppleFoodEatenProcedure;

public class NtehritAppleItem extends Item {
	public NtehritAppleItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_FOOD).stacksTo(64).rarity(Rarity.UNCOMMON)
				.food((new FoodProperties.Builder()).nutrition(6).saturationMod(0.6f)

						.build()));
		setRegistryName("ntehrit_apple");
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 33;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		DiamondAppleFoodEatenProcedure.execute(entity);
		return retval;
	}
}
