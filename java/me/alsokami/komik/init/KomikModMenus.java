
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package me.alsokami.komik.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import me.alsokami.komik.world.inventory.OilrefineryMenu;
import me.alsokami.komik.world.inventory.OildepositmentMenu;
import me.alsokami.komik.KomikMod;

public class KomikModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, KomikMod.MODID);
	public static final RegistryObject<MenuType<OilrefineryMenu>> OILREFINERY = REGISTRY.register("oilrefinery", () -> IForgeMenuType.create(OilrefineryMenu::new));
	public static final RegistryObject<MenuType<OildepositmentMenu>> OILDEPOSITMENT = REGISTRY.register("oildepositment", () -> IForgeMenuType.create(OildepositmentMenu::new));
}
