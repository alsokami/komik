
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package me.alsokami.komik.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import me.alsokami.komik.fluid.types.CrudeoilFluidType;
import me.alsokami.komik.KomikMod;

public class KomikModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, KomikMod.MODID);
	public static final RegistryObject<FluidType> CRUDEOIL_TYPE = REGISTRY.register("crudeoil", () -> new CrudeoilFluidType());
}
