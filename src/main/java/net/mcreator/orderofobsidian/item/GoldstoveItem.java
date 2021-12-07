
package net.mcreator.orderofobsidian.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Item;

import net.mcreator.orderofobsidian.init.OrderofobsidianModTabs;

public class GoldstoveItem extends SwordItem {
	public GoldstoveItem() {
		super(new Tier() {
			public int getUses() {
				return 25;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return 0.2f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 1;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.5f, new Item.Properties().tab(OrderofobsidianModTabs.TAB_SPIRIT));
		setRegistryName("goldstove");
	}
}
