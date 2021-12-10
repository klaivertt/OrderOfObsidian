
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.orderofobsidian.init;

import net.minecraftforge.fmllegacy.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.orderofobsidian.world.inventory.ThermalGeneratorGUIMenu;
import net.mcreator.orderofobsidian.world.inventory.GuiFourMenu;
import net.mcreator.orderofobsidian.world.inventory.ForgeguiMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OrderofobsidianModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<GuiFourMenu> GUI_FOUR = register("gui_four", (id, inv, extraData) -> new GuiFourMenu(id, inv, extraData));
	public static final MenuType<ForgeguiMenu> FORGEGUI = register("forgegui", (id, inv, extraData) -> new ForgeguiMenu(id, inv, extraData));
	public static final MenuType<ThermalGeneratorGUIMenu> THERMAL_GENERATOR_GUI = register("thermal_generator_gui",
			(id, inv, extraData) -> new ThermalGeneratorGUIMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
