
package net.mcreator.orderofobsidian.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.orderofobsidian.init.OrderofobsidianModTabs;
import net.mcreator.orderofobsidian.init.OrderofobsidianModItems;

public class AvenroniteAxeItem extends AxeItem {
	public AvenroniteAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 3000;
			}

			public float getSpeed() {
				return 10f;
			}

			public float getAttackDamageBonus() {
				return 18f;
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
		}, 1, -3f, new Item.Properties().tab(OrderofobsidianModTabs.TAB_TOOLS).fireResistant());
		setRegistryName("avenronite_axe");
	}
}
