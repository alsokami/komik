
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.alsokami.komik.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import me.alsokami.komik.KomikMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class KomikModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, KomikMod.MODID);
	public static final RegistryObject<CreativeModeTab> KTOOLS = REGISTRY.register("ktools",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.komik.ktools")).icon(() -> new ItemStack(KomikModItems.PAN.get())).displayItems((parameters, tabData) -> {
				tabData.accept(KomikModItems.PAN.get());
				tabData.accept(KomikModItems.WRENCH.get());
				tabData.accept(KomikModItems.GEMSTONEGAUNTLET.get());
				tabData.accept(KomikModItems.RUBYTIPPEDARROWITEM.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> KMATERIALS = REGISTRY.register("kmaterials",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.komik.kmaterials")).icon(() -> new ItemStack(KomikModItems.MICROPLASTICS.get())).displayItems((parameters, tabData) -> {
				tabData.accept(KomikModItems.MICROPLASTICS.get());
				tabData.accept(KomikModItems.PLASTICHAIN.get());
				tabData.accept(KomikModItems.PLASTICPOLYMERS.get());
				tabData.accept(KomikModItems.SOLARCELL.get());
				tabData.accept(KomikModItems.BIGSOLARCELL.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> K_MACHINES = REGISTRY.register("k_machines",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.komik.k_machines")).icon(() -> new ItemStack(KomikModBlocks.SOLARPANEL_400W.get())).displayItems((parameters, tabData) -> {
				tabData.accept(KomikModBlocks.ORE_WASHER.get().asItem());
				tabData.accept(KomikModBlocks.SOLARPANEL_400W.get().asItem());
				tabData.accept(KomikModBlocks.OILREFINERY.get().asItem());
				tabData.accept(KomikModBlocks.INDUSTRIAL_WORKBENCH.get().asItem());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> KMINERALS = REGISTRY.register("kminerals",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.komik.kminerals")).icon(() -> new ItemStack(KomikModItems.SIFTED_ORE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(KomikModItems.SIFTED_ORE.get());
				tabData.accept(KomikModItems.IRONDUST.get());
				tabData.accept(KomikModItems.MAGNESIUM_DUST.get());
				tabData.accept(KomikModItems.ZINCDUST.get());
				tabData.accept(KomikModItems.MAGNESIUM_INGOT.get());
				tabData.accept(KomikModItems.ZINCINGOT.get());
				tabData.accept(KomikModItems.SILICON.get());
				tabData.accept(KomikModBlocks.SILICONORE.get().asItem());
				tabData.accept(KomikModItems.ALUMINUM.get());
				tabData.accept(KomikModBlocks.ALUMINUMORE.get().asItem());
				tabData.accept(KomikModItems.CRUDEOIL_BUCKET.get());
				tabData.accept(KomikModItems.SILVER.get());
				tabData.accept(KomikModBlocks.SILVERORE.get().asItem());
				tabData.accept(KomikModItems.ENCHANTEDGOLD.get());
				tabData.accept(KomikModBlocks.ENCHANTEDGOLDBLOCK.get().asItem());
				tabData.accept(KomikModBlocks.RUBY.get().asItem());
				tabData.accept(KomikModItems.RAWRUBY.get());
				tabData.accept(KomikModItems.POLISHEDRUBY.get());
				tabData.accept(KomikModItems.PERFECTRUBY.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {

			tabData.accept(KomikModItems.WRENCH.get());
			tabData.accept(KomikModItems.GEMSTONEGAUNTLET.get());

		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {

			tabData.accept(KomikModBlocks.SILICONORE.get().asItem());

		}
	}
}
