
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.alsokami.komik.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import me.alsokami.komik.item.WrenchItem;
import me.alsokami.komik.item.SiliconItem;
import me.alsokami.komik.item.SiftedOreItem;
import me.alsokami.komik.item.PanItem;
import me.alsokami.komik.item.MagnesiumIngotItem;
import me.alsokami.komik.item.MagnesiumDustItem;
import me.alsokami.komik.item.LeadingotItem;
import me.alsokami.komik.item.LeaddustItem;
import me.alsokami.komik.item.IrondustItem;
import me.alsokami.komik.item.CrudeoilItem;
import me.alsokami.komik.item.AluminumItem;
import me.alsokami.komik.KomikMod;

public class KomikModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, KomikMod.MODID);
	public static final RegistryObject<Item> PAN = REGISTRY.register("pan", () -> new PanItem());
	public static final RegistryObject<Item> SIFTED_ORE = REGISTRY.register("sifted_ore", () -> new SiftedOreItem());
	public static final RegistryObject<Item> ORE_WASHER = block(KomikModBlocks.ORE_WASHER);
	public static final RegistryObject<Item> WRENCH = REGISTRY.register("wrench", () -> new WrenchItem());
	public static final RegistryObject<Item> IRONDUST = REGISTRY.register("irondust", () -> new IrondustItem());
	public static final RegistryObject<Item> MAGNESIUM_DUST = REGISTRY.register("magnesium_dust", () -> new MagnesiumDustItem());
	public static final RegistryObject<Item> ZINCDUST = REGISTRY.register("zincdust", () -> new LeaddustItem());
	public static final RegistryObject<Item> MAGNESIUM_INGOT = REGISTRY.register("magnesium_ingot", () -> new MagnesiumIngotItem());
	public static final RegistryObject<Item> ZINCINGOT = REGISTRY.register("zincingot", () -> new LeadingotItem());
	public static final RegistryObject<Item> SOLARPANEL_400W = block(KomikModBlocks.SOLARPANEL_400W);
	public static final RegistryObject<Item> SILICON = REGISTRY.register("silicon", () -> new SiliconItem());
	public static final RegistryObject<Item> SILICONORE = block(KomikModBlocks.SILICONORE);
	public static final RegistryObject<Item> ALUMINUM = REGISTRY.register("aluminum", () -> new AluminumItem());
	public static final RegistryObject<Item> ALUMINUMORE = block(KomikModBlocks.ALUMINUMORE);
	public static final RegistryObject<Item> CRUDEOIL_BUCKET = REGISTRY.register("crudeoil_bucket", () -> new CrudeoilItem());
	public static final RegistryObject<Item> OILREFINERY = block(KomikModBlocks.OILREFINERY);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
