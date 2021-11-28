
package net.mcreator.orderofobsidian.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class StickswordItem extends SwordItem {
	public StickswordItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 0f;
			}

			public float getAttackDamageBonus() {
				return -1f;
			}

			public int getLevel() {
				return 0;
			}

			public int getEnchantmentValue() {
				return 1;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.STICK));
			}
		},

				3, -1f,

				new Item.Properties().tab(OrderofobsidianModTabs.TAB_SPIRIT));

		setRegistryName("sticksword");
	}

}
