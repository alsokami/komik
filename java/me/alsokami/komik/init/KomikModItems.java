
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

import me.alsokami.komik.item.SolarcellItem;
import me.alsokami.komik.item.SilveroreItem;
import me.alsokami.komik.item.SilverItem;
import me.alsokami.komik.item.SiliconItem;
import me.alsokami.komik.item.PlasticsItem;
import me.alsokami.komik.item.PlasticpolymerItem;
import me.alsokami.komik.item.PlasticfibersItem;
import me.alsokami.komik.item.CrudeoilItem;
import me.alsokami.komik.item.BigsolarcellItem;
import me.alsokami.komik.item.AluminumItem;
import me.alsokami.komik.KomikMod;

public class KomikModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, KomikMod.MODID);
	public static final RegistryObject<Item> SILICON = REGISTRY.register("silicon", () -> new SiliconItem());
	public static final RegistryObject<Item> SILICONORE = block(KomikModBlocks.SILICONORE);
	public static final RegistryObject<Item> ALUMINUM = REGISTRY.register("aluminum", () -> new AluminumItem());
	public static final RegistryObject<Item> ALUMINUMORE = block(KomikModBlocks.ALUMINUMORE);
	public static final RegistryObject<Item> OILDISPOSAL = block(KomikModBlocks.OILDISPOSAL);
	public static final RegistryObject<Item> CRUDEOIL_BUCKET = REGISTRY.register("crudeoil_bucket", () -> new CrudeoilItem());
	public static final RegistryObject<Item> REFINERY = block(KomikModBlocks.REFINERY);
	public static final RegistryObject<Item> PLASTICS = REGISTRY.register("plastics", () -> new PlasticsItem());
	public static final RegistryObject<Item> PLASTICPOLYMER = REGISTRY.register("plasticpolymer", () -> new PlasticpolymerItem());
	public static final RegistryObject<Item> PLASTICFIBERS = REGISTRY.register("plasticfibers", () -> new PlasticfibersItem());
	public static final RegistryObject<Item> SOLARCELL = REGISTRY.register("solarcell", () -> new SolarcellItem());
	public static final RegistryObject<Item> SILVER = REGISTRY.register("silver", () -> new SilverItem());
	public static final RegistryObject<Item> SILVERORE = REGISTRY.register("silverore", () -> new SilveroreItem());
	public static final RegistryObject<Item> SILVEROREBLOCK = block(KomikModBlocks.SILVEROREBLOCK);
	public static final RegistryObject<Item> SOLARPANEL = block(KomikModBlocks.SOLARPANEL);
	public static final RegistryObject<Item> BIGSOLARCELL = REGISTRY.register("bigsolarcell", () -> new BigsolarcellItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
