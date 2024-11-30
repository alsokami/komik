
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.alsokami.komik.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import me.alsokami.komik.block.SolarpanelBlock;
import me.alsokami.komik.block.SilveroreblockBlock;
import me.alsokami.komik.block.SiliconoreBlock;
import me.alsokami.komik.block.RefineryBlock;
import me.alsokami.komik.block.OildisposalBlock;
import me.alsokami.komik.block.CrudeoilBlock;
import me.alsokami.komik.block.AluminumoreBlock;
import me.alsokami.komik.KomikMod;

public class KomikModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, KomikMod.MODID);
	public static final RegistryObject<Block> SILICONORE = REGISTRY.register("siliconore", () -> new SiliconoreBlock());
	public static final RegistryObject<Block> ALUMINUMORE = REGISTRY.register("aluminumore", () -> new AluminumoreBlock());
	public static final RegistryObject<Block> OILDISPOSAL = REGISTRY.register("oildisposal", () -> new OildisposalBlock());
	public static final RegistryObject<Block> CRUDEOIL = REGISTRY.register("crudeoil", () -> new CrudeoilBlock());
	public static final RegistryObject<Block> REFINERY = REGISTRY.register("refinery", () -> new RefineryBlock());
	public static final RegistryObject<Block> SILVEROREBLOCK = REGISTRY.register("silveroreblock", () -> new SilveroreblockBlock());
	public static final RegistryObject<Block> SOLARPANEL = REGISTRY.register("solarpanel", () -> new SolarpanelBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
