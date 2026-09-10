package mod.netpix.rainbowthings.block;

import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class AnimRBBlock extends Block {
	public AnimRBBlock() {
		super(BlockBehaviour.Properties.of().mapColor(MapColor.FIRE).strength(1f, 10f));
	}
}