
package net.mcreator.orderofobsidian.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.orderofobsidian.init.OrderofobsidianModTabs;

public class LeadPlateItem extends Item {
	public LeadPlateItem() {
		super(new Item.Properties().tab(OrderofobsidianModTabs.TAB_ITEMS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("lead_plate");
	}

	@Override
	public int getEnchantmentValue() {
		return 0;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
		return 1F;
	}
}
