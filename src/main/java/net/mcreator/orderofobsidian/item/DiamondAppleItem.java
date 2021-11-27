
package net.mcreator.orderofobsidian.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.orderofobsidian.procedures.DiamondAppleFoodEatenProcedure;
import net.mcreator.orderofobsidian.init.OrderofobsidianModTabs;

public class DiamondAppleItem extends Item {
	public DiamondAppleItem() {
		super(new Item.Properties().tab(OrderofobsidianModTabs.TAB_SPIRIT).stacksTo(64).rarity(Rarity.UNCOMMON)
				.food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.5f)

						.build()));
		setRegistryName("diamond_apple");
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