
package me.alsokami.komik.potion;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import me.alsokami.komik.procedures.OilpoisoningOnEffectActiveTickProcedure;

import java.util.List;
import java.util.ArrayList;

public class OilpoisoningMobEffect extends MobEffect {
	public OilpoisoningMobEffect() {
		super(MobEffectCategory.HARMFUL, -10066432);
	}

	@Override
	public List<ItemStack> getCurativeItems() {
		ArrayList<ItemStack> cures = new ArrayList<ItemStack>();
		cures.add(new ItemStack(Items.TOTEM_OF_UNDYING));
		return cures;
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		OilpoisoningOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
