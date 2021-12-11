
package net.mcreator.orderofobsidian.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;

import net.mcreator.orderofobsidian.init.OrderofobsidianModTabs;
import net.mcreator.orderofobsidian.init.OrderofobsidianModItems;

public class AngmarBattleAxeItem extends AxeItem {
	public AngmarBattleAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 2200;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 12.5f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 10;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrderofobsidianModItems.URUK_INGOT), new ItemStack(OrderofobsidianModItems.SILVER_PLATE));
			}
		}, 1, -3.2000000000000001f, new Item.Properties().tab(OrderofobsidianModTabs.TAB_SPIRIT));
		setRegistryName("angmar_battle_axe");
	}
}
