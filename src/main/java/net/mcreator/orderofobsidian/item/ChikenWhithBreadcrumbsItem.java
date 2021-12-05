
package net.mcreator.orderofobsidian.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class ChikenWhithBreadcrumbsItem extends Item {
	public ChikenWhithBreadcrumbsItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("chiken_whith_breadcrumbs");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
