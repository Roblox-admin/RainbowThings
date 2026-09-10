/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mod.netpix.rainbowthings.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import mod.netpix.rainbowthings.block.RbBlock;
import mod.netpix.rainbowthings.block.AnimRBBlock;
import mod.netpix.rainbowthings.RainbowthingsMod;

public class RainbowthingsModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(RainbowthingsMod.MODID);
	public static final DeferredBlock<Block> ANIM_RB;
	public static final DeferredBlock<Block> RB;
	static {
		ANIM_RB = REGISTRY.register("anim_rb", AnimRBBlock::new);
		RB = REGISTRY.register("rb", RbBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}