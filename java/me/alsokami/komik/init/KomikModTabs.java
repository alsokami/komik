
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.alsokami.komik.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import me.alsokami.komik.KomikMod;

public class KomikModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KomikMod.MODID);
	public static final RegistryObject<CreativeModeTab> KMATERIALS = REGISTRY.register("kmaterials",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.komik.kmaterials")).icon(() -> new ItemStack(KomikModItems.SILICON.get())).displayItems((parameters, tabData) -> {
				tabData.accept(KomikModItems.SILICON.get());
				tabData.accept(KomikModBlocks.SILICONORE.get().asItem());
				tabData.accept(KomikModItems.ALUMINUM.get());
				tabData.accept(KomikModBlocks.ALUMINUMORE.get().asItem());
				tabData.accept(KomikModItems.CRUDEOIL_BUCKET.get());
				tabData.accept(KomikModItems.PLASTICS.get());
				tabData.accept(KomikModItems.PLASTICPOLYMER.get());
				tabData.accept(KomikModItems.PLASTICFIBERS.get());
				tabData.accept(KomikModItems.SOLARCELL.get());
				tabData.accept(KomikModItems.SILVERORE.get());
				tabData.accept(KomikModBlocks.SILVEROREBLOCK.get().asItem());
				tabData.accept(KomikModItems.BIGSOLARCELL.get());
			}).withSearchBar().build());
	public static final RegistryObject<CreativeModeTab> KMACHINES = REGISTRY.register("kmachines",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.komik.kmachines")).icon(() -> new ItemStack(KomikModBlocks.OILDISPOSAL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(KomikModBlocks.OILDISPOSAL.get().asItem());
				tabData.accept(KomikModBlocks.REFINERY.get().asItem());
				tabData.accept(KomikModBlocks.SOLARPANEL.get().asItem());
			}).withSearchBar().build());
}
