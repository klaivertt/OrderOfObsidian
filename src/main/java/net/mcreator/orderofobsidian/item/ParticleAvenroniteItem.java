
package net.mcreator.orderofobsidian.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.orderofobsidian.init.OrderofobsidianModTabs;

public class ParticleAvenroniteItem extends Item {
	public ParticleAvenroniteItem() {
		super(new Item.Properties().tab(OrderofobsidianModTabs.TAB_ITEMS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("particle_avenronite");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
