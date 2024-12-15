
package me.alsokami.komik.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;

import me.alsokami.komik.init.KomikModFluids;

public class CrudeoilBlock extends LiquidBlock {
	public CrudeoilBlock() {
		super(() -> KomikModFluids.CRUDEOIL.get(), BlockBehaviour.Properties.of().mapColor(MapColor.WATER).strength(100f).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}
}
