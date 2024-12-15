
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package me.alsokami.komik.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import me.alsokami.komik.world.inventory.WorkbenchguiMenu;
import me.alsokami.komik.world.inventory.SolarpanelguiMenu;
import me.alsokami.komik.world.inventory.OilrefineryguiMenu;
import me.alsokami.komik.KomikMod;

public class KomikModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, KomikMod.MODID);
	public static final RegistryObject<MenuType<OilrefineryguiMenu>> OILREFINERYGUI = REGISTRY.register("oilrefinerygui", () -> IForgeMenuType.create(OilrefineryguiMenu::new));
	public static final RegistryObject<MenuType<WorkbenchguiMenu>> WORKBENCHGUI = REGISTRY.register("workbenchgui", () -> IForgeMenuType.create(WorkbenchguiMenu::new));
	public static final RegistryObject<MenuType<SolarpanelguiMenu>> SOLARPANELGUI = REGISTRY.register("solarpanelgui", () -> IForgeMenuType.create(SolarpanelguiMenu::new));
}
