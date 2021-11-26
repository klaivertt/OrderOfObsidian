
package net.mcreator.orderofobsidian.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.orderofobsidian.procedures.OxysappleFoodEatenProcedure;
import net.mcreator.orderofobsidian.init.OrderofobsidianModTabs;

public class OxysappleItem extends Item {
	public OxysappleItem() {
		super(new Item.Properties().tab(OrderofobsidianModTabs.TAB_SPIRIT).stacksTo(64).rarity(Rarity.EPIC)
				.food((new FoodProperties.Builder()).nutrition(8).saturationMod(2f)

						.build()));
		setRegistryName("oxysapple");
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		OxysappleFoodEatenProcedure.execute(entity);
		return retval;
	}
}
