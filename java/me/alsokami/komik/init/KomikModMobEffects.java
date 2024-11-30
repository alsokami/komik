
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package me.alsokami.komik.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import me.alsokami.komik.potion.OilpoisoningMobEffect;
import me.alsokami.komik.KomikMod;

public class KomikModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, KomikMod.MODID);
	public static final RegistryObject<MobEffect> OILPOISONING = REGISTRY.register("oilpoisoning", () -> new OilpoisoningMobEffect());
}
