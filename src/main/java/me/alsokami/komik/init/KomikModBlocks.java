
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.alsokami.komik.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import me.alsokami.komik.block.Solarpanel400wBlock;
import me.alsokami.komik.block.SilveroreBlock;
import me.alsokami.komik.block.SiliconoreBlock;
import me.alsokami.komik.block.RubyBlock;
import me.alsokami.komik.block.OreWasherBlock;
import me.alsokami.komik.block.OilrefineryBlock;
import me.alsokami.komik.block.IndustrialWorkbenchBlock;
import me.alsokami.komik.block.EnchantedgoldblockBlock;
import me.alsokami.komik.block.CrudeoilBlock;
import me.alsokami.komik.block.AluminumoreBlock;
import me.alsokami.komik.KomikMod;

public class KomikModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, KomikMod.MODID);
	public static final RegistryObject<Block> ORE_WASHER = REGISTRY.register("ore_washer", () -> new OreWasherBlock());
	public static final RegistryObject<Block> SOLARPANEL_400W = REGISTRY.register("solarpanel_400w", () -> new Solarpanel400wBlock());
	public static final RegistryObject<Block> SILICONORE = REGISTRY.register("siliconore", () -> new SiliconoreBlock());
	public static final RegistryObject<Block> ALUMINUMORE = REGISTRY.register("aluminumore", () -> new AluminumoreBlock());
	public static final RegistryObject<Block> CRUDEOIL = REGISTRY.register("crudeoil", () -> new CrudeoilBlock());
	public static final RegistryObject<Block> OILREFINERY = REGISTRY.register("oilrefinery", () -> new OilrefineryBlock());
	public static final RegistryObject<Block> SILVERORE = REGISTRY.register("silverore", () -> new SilveroreBlock());
	public static final RegistryObject<Block> INDUSTRIAL_WORKBENCH = REGISTRY.register("industrial_workbench", () -> new IndustrialWorkbenchBlock());
	public static final RegistryObject<Block> ENCHANTEDGOLDBLOCK = REGISTRY.register("enchantedgoldblock", () -> new EnchantedgoldblockBlock());
	public static final RegistryObject<Block> RUBY = REGISTRY.register("ruby", () -> new RubyBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
