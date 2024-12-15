package me.alsokami.komik.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.ParticleTypes;

import me.alsokami.komik.init.KomikModItems;

public class OreWasherOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(KomikModItems.SIFTED_ORE.get())) : false) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(KomikModItems.SIFTED_ORE.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
			if (!world.isClientSide() && world.getServer() != null) {
				for (ItemStack itemstackiterator : world.getServer().getLootData().getLootTable(new ResourceLocation("komik:gameplay/siftedoregranter")).getRandomItems(new LootParams.Builder((ServerLevel) world).create(LootContextParamSets.EMPTY))) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = itemstackiterator.copy();
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.BUBBLE, x, y, z, 5, 3, 3, 3, 1);
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("\u00A7c\u00A7lSorry! \u00A7r\u00A78You do not have any more sifted ore."), false);
		}
	}
}
