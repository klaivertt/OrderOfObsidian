
package net.mcreator.orderofobsidian.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.entity.EquipmentSlot;

public class PropellingEnchantment extends Enchantment {
	public PropellingEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.ARMOR_CHEST, slots);
	}

	@Override
	public int getMaxLevel() {
		return 2;
	}
}
