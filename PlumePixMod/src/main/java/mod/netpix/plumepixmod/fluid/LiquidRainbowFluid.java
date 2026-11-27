package mod.netpix.plumepixmod.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import mod.netpix.plumepixmod.init.NetpixelmodModItems;
import mod.netpix.plumepixmod.init.NetpixelmodModFluids;
import mod.netpix.plumepixmod.init.NetpixelmodModFluidTypes;
import mod.netpix.plumepixmod.init.NetpixelmodModBlocks;

public abstract class LiquidRainbowFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> NetpixelmodModFluidTypes.LIQUID_RAINBOW_TYPE.get(), () -> NetpixelmodModFluids.LIQUID_RAINBOW.get(),
			() -> NetpixelmodModFluids.FLOWING_LIQUID_RAINBOW.get()).explosionResistance(100f).bucket(() -> NetpixelmodModItems.LIQUID_RAINBOW_BUCKET.get()).block(() -> (LiquidBlock) NetpixelmodModBlocks.LIQUID_RAINBOW.get());

	private LiquidRainbowFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.BUBBLE_POP;
	}

	public static class Source extends LiquidRainbowFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends LiquidRainbowFluid {
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