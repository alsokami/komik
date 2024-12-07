
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package me.alsokami.komik.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import me.alsokami.komik.fluid.CrudeoilFluid;
import me.alsokami.komik.KomikMod;

public class KomikModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, KomikMod.MODID);
	public static final RegistryObject<FlowingFluid> CRUDEOIL = REGISTRY.register("crudeoil", () -> new CrudeoilFluid.Source());
	public static final RegistryObject<FlowingFluid> FLOWING_CRUDEOIL = REGISTRY.register("flowing_crudeoil", () -> new CrudeoilFluid.Flowing());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(CRUDEOIL.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_CRUDEOIL.get(), RenderType.translucent());
		}
	}
}
