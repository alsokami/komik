package me.alsokami.komik.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

public class SolarpanelOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		while (world instanceof Level _lvl0 && _lvl0.isDay()) {
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z));
				int _amount = (int) 0.3;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
			if (!(world instanceof Level _lvl2 && _lvl2.isDay())) {
				break;
			}
		}
	}
}
