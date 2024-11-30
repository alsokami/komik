package me.alsokami.komik.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import me.alsokami.komik.init.KomikModMobEffects;

public class CrudeoilMobplayerCollidesBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(KomikModMobEffects.OILPOISONING.get(), 1200, 1));
	}
}
