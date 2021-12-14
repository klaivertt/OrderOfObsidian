
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.orderofobsidian.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.orderofobsidian.client.gui.ThermalGeneratorGUIScreen;
import net.mcreator.orderofobsidian.client.gui.MaterialbreakerguiScreen;
import net.mcreator.orderofobsidian.client.gui.GuiFourScreen;
import net.mcreator.orderofobsidian.client.gui.ForgeguiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class OrderofobsidianModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(OrderofobsidianModMenus.GUI_FOUR, GuiFourScreen::new);
			MenuScreens.register(OrderofobsidianModMenus.FORGEGUI, ForgeguiScreen::new);
			MenuScreens.register(OrderofobsidianModMenus.THERMAL_GENERATOR_GUI, ThermalGeneratorGUIScreen::new);
			MenuScreens.register(OrderofobsidianModMenus.MATERIALBREAKERGUI, MaterialbreakerguiScreen::new);
		});
	}
}
