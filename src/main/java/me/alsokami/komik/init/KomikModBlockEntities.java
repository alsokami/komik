
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.alsokami.komik.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import me.alsokami.komik.block.entity.Solarpanel400wBlockEntity;
import me.alsokami.komik.block.entity.IndustrialWorkbenchBlockEntity;
import me.alsokami.komik.KomikMod;

public class KomikModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, KomikMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> SOLARPANEL_400W = register("solarpanel_400w", KomikModBlocks.SOLARPANEL_400W, Solarpanel400wBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> INDUSTRIAL_WORKBENCH = register("industrial_workbench", KomikModBlocks.INDUSTRIAL_WORKBENCH, IndustrialWorkbenchBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
