
package net.mcreator.orderofobsidian.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.orderofobsidian.init.OrderofobsidianModTabs;
import net.mcreator.orderofobsidian.init.OrderofobsidianModItems;

public class AvenroniteSwordItem extends SwordItem {
	public AvenroniteSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 2700;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 11f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 31;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrderofobsidianModItems.AVENRONITE_INGOT));
			}
		}, 3, -3f, new Item.Properties().tab(OrderofobsidianModTabs.TAB_ITEMS));
		setRegistryName("avenronite_sword");
	}
}
