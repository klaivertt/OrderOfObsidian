
package net.mcreator.orderofobsidian.enchantment;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

public class IgnitionEnchantment extends Enchantment {
	public IgnitionEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.COMMON, EnchantmentCategory.BREAKABLE, slots);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		if (stack.getItem() == Blocks.TNT.asItem())
			return true;
		return false;
	}

	@Override
	public boolean isTreasureOnly() {
		return true;
	}
}
