
package net.mcreator.orderofobsidian.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.AxeItem;

import net.mcreator.orderofobsidian.init.OrderofobsidianModItems;

public class AikigiteAxeItem extends AxeItem {
	public AikigiteAxeItem() {
		super(new Tier() {
			public int getUses() {
				return 1700;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 13f;
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
		}, 1, -3f, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS));
		setRegistryName("aikigite_axe");
	}
}
