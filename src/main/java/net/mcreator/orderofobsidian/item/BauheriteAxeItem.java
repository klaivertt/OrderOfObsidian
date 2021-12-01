
package net.mcreator.orderofobsidian.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.orderofobsidian.init.OrderofobsidianModTabs;
import net.mcreator.orderofobsidian.init.OrderofobsidianModItems;

public class BauheriteAxeItem extends AxeItem {
	public BauheriteAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2500;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 16f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 28;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrderofobsidianModItems.BAUHERITE_INGOT));
			}
		}, 1, -3f, new Item.Properties().tab(OrderofobsidianModTabs.TAB_TOOLS));
		setRegistryName("bauherite_axe");
	}
}
