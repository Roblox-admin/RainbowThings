package mod.netpix.rainbowthings.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class RbBlock extends Block {
	public RbBlock() {
		super(BlockBehaviour.Properties.of().strength(1f, 10f));
	}
}