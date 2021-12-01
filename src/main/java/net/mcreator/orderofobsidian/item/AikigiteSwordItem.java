
package net.mcreator.orderofobsidian.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.orderofobsidian.init.OrderofobsidianModTabs;
import net.mcreator.orderofobsidian.init.OrderofobsidianModItems;

public class AikigiteSwordItem extends SwordItem {
	public AikigiteSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 1;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 8f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 24;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(OrderofobsidianModItems.AIKIGITE_INGOT));
			}
		}, 3, -3f, new Item.Properties().tab(OrderofobsidianModTabs.TAB_SPIRIT));
		setRegistryName("aikigite_sword");
	}
}
