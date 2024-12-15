
package me.alsokami.komik.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import me.alsokami.komik.init.KomikModItems;
import me.alsokami.komik.init.KomikModFluids;
import me.alsokami.komik.init.KomikModFluidTypes;
import me.alsokami.komik.init.KomikModBlocks;

public abstract class CrudeoilFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> KomikModFluidTypes.CRUDEOIL_TYPE.get(), () -> KomikModFluids.CRUDEOIL.get(), () -> KomikModFluids.FLOWING_CRUDEOIL.get())
			.explosionResistance(100f).bucket(() -> KomikModItems.CRUDEOIL_BUCKET.get()).block(() -> (LiquidBlock) KomikModBlocks.CRUDEOIL.get());

	private CrudeoilFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.BUBBLE_POP;
	}

	public static class Source extends CrudeoilFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends CrudeoilFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
