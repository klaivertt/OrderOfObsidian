
package net.mcreator.orderofobsidian.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.orderofobsidian.procedures.EnergyMetterRightClickedOnBlockProcedure;
import net.mcreator.orderofobsidian.init.OrderofobsidianModTabs;

public class EnergyMetterItem extends Item {
	public EnergyMetterItem() {
		super(new Item.Properties().tab(OrderofobsidianModTabs.TAB_MACHINE).stacksTo(1).rarity(Rarity.COMMON));
		setRegistryName("energy_metter");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		InteractionResult retval = super.useOn(context);
		EnergyMetterRightClickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(),
				context.getClickedPos().getZ(), context.getClickedFace(), context.getPlayer());
		return retval;
	}
}
