package me.alsokami.komik.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import me.alsokami.komik.init.KomikModItems;

public class PanRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		BlockState isgravelblock = Blocks.AIR.defaultBlockState();
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.GRAVEL) {
			world.destroyBlock(BlockPos.containing(x, y, z), false);
			if (entity instanceof Player _player)
				_player.giveExperiencePoints((int) Mth.nextDouble(RandomSource.create(), 1, 12));
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.FLINT).copy();
				_setstack.setCount((int) Mth.nextDouble(RandomSource.create(), 0, 4));
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.IRON_NUGGET).copy();
				_setstack.setCount((int) Mth.nextDouble(RandomSource.create(), 0, 2));
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(KomikModItems.SIFTED_ORE.get()).copy();
				_setstack.setCount((int) Mth.nextDouble(RandomSource.create(), 1, 5));
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7cYou can only use a gold pan on Gravel!"), true);
		}
	}
}
