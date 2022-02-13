
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.orderofobsidian.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.orderofobsidian.enchantment.IgnitionEnchantment;
import net.mcreator.orderofobsidian.enchantment.CurseOfBackfireEnchantment;
import net.mcreator.orderofobsidian.enchantment.AutoSmeltEnchantment;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OrderofobsidianModEnchantments {
	private static final List<Enchantment> REGISTRY = new ArrayList<>();
	public static final Enchantment IGNITION = register("orderofobsidian:ignition", new IgnitionEnchantment());
	public static final Enchantment AUTO_SMELT = register("orderofobsidian:auto_smelt", new AutoSmeltEnchantment());
	public static final Enchantment CURSE_OF_BACKFIRE = register("orderofobsidian:curse_of_backfire", new CurseOfBackfireEnchantment());

	private static Enchantment register(String registryname, Enchantment enchantment) {
		REGISTRY.add(enchantment.setRegistryName(registryname));
		return enchantment;
	}

	@SubscribeEvent
	public static void registerEnchantments(RegistryEvent.Register<Enchantment> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Enchantment[0]));
	}
}
