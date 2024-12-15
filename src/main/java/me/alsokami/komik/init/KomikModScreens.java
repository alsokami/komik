
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package me.alsokami.komik.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import me.alsokami.komik.client.gui.WorkbenchguiScreen;
import me.alsokami.komik.client.gui.SolarpanelguiScreen;
import me.alsokami.komik.client.gui.OilrefineryguiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class KomikModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(KomikModMenus.OILREFINERYGUI.get(), OilrefineryguiScreen::new);
			MenuScreens.register(KomikModMenus.WORKBENCHGUI.get(), WorkbenchguiScreen::new);
			MenuScreens.register(KomikModMenus.SOLARPANELGUI.get(), SolarpanelguiScreen::new);
		});
	}
}
