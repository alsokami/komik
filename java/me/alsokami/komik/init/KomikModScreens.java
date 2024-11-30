
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package me.alsokami.komik.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import me.alsokami.komik.client.gui.OilrefineryScreen;
import me.alsokami.komik.client.gui.OildepositmentScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class KomikModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(KomikModMenus.OILREFINERY.get(), OilrefineryScreen::new);
			MenuScreens.register(KomikModMenus.OILDEPOSITMENT.get(), OildepositmentScreen::new);
		});
	}
}
