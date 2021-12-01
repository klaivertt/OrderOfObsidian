
package net.mcreator.orderofobsidian.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.orderofobsidian.init.OrderofobsidianModTabs;
import net.mcreator.orderofobsidian.init.OrderofobsidianModItems;

public class AikigitePickaxeItem extends PickaxeItem {
	public AikigitePickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1700;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 1f;
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
		}, 1, -3f, new Item.Properties().tab(OrderofobsidianModTabs.TAB_TOOLS));
		setRegistryName("aikigite_pickaxe");
	}
}
