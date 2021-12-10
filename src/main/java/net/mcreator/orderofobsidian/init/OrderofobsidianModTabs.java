
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.orderofobsidian.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class OrderofobsidianModTabs {
	public static CreativeModeTab TAB_SPIRIT;
	public static CreativeModeTab TAB_TOOLS;
	public static CreativeModeTab TAB_ITEMS;
	public static CreativeModeTab TAB_MACHINE;
	public static CreativeModeTab TAB_BLOC_K;
	public static CreativeModeTab TAB_ARMOR;

	public static void load() {
		TAB_SPIRIT = new CreativeModeTab("tabspirit") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(OrderofobsidianModItems.OXYS_SWORD);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_TOOLS = new CreativeModeTab("tabtools") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(OrderofobsidianModItems.DIAMONDHAMMER);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ITEMS = new CreativeModeTab("tabitems") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(OrderofobsidianModItems.OXYS_STICK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_MACHINE = new CreativeModeTab("tabmachine") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(OrderofobsidianModBlocks.ELECTRIQUE_FURNACE);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_BLOC_K = new CreativeModeTab("tabbloc_k") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(OrderofobsidianModBlocks.BURNEDTREE_WOOD);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
		TAB_ARMOR = new CreativeModeTab("tabarmor") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(OrderofobsidianModItems.URUK_ARMOR_HELMET);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
