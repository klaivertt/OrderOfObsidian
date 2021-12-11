
package net.mcreator.orderofobsidian.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.core.BlockPos;

import net.mcreator.orderofobsidian.procedures.DimondhammerBlockDestroyedWithToolProcedure;
import net.mcreator.orderofobsidian.init.OrderofobsidianModTabs;
import net.mcreator.orderofobsidian.init.OrderofobsidianModItems;

public class UruckHammerItem extends PickaxeItem {
	public UruckHammerItem() {
		super(new Tier() {
			public int getUses() {
				return 750;
			}

			public float getSpeed() {
				return 2f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrderofobsidianModItems.URUK_INGOT));
			}
		}, 1, -3f, new Item.Properties().tab(OrderofobsidianModTabs.TAB_TOOLS));
		setRegistryName("uruck_hammer");
	}

	@Override
	public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
		boolean retval = super.mineBlock(itemstack, world, blockstate, pos, entity);
		int x = pos.getX();
		int y = pos.getY();
		int z = pos.getZ();

		DimondhammerBlockDestroyedWithToolProcedure.execute(world, x, y, z, entity);
		return retval;
	}
}
