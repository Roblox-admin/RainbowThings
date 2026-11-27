package mod.netpix.plumepixmod.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import mod.netpix.plumepixmod.init.NetpixelmodModFluids;

public class LiquidRainbowBlock extends LiquidBlock {
	public LiquidRainbowBlock() {
		super(NetpixelmodModFluids.LIQUID_RAINBOW.get(),
				BlockBehaviour.Properties.of().mapColor(MapColor.GRASS).strength(100f).lightLevel(state -> 7).noCollission().noLootTable().liquid().pushReaction(PushReaction.DESTROY).sound(SoundType.EMPTY).replaceable());
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 3;
	}
}