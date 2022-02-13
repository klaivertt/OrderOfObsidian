
package net.mcreator.orderofobsidian.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.orderofobsidian.init.OrderofobsidianModTabs;

public class EdrueliumIngotItem extends Item {
	public EdrueliumIngotItem() {
		super(new Item.Properties().tab(OrderofobsidianModTabs.TAB_ITEMS).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
		setRegistryName("edruelium_ingot");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
