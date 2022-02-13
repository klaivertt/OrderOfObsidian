
package net.mcreator.orderofobsidian.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class RawEdrueliumItem extends Item {
	public RawEdrueliumItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).fireResistant().rarity(Rarity.COMMON));
		setRegistryName("raw_edruelium");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
