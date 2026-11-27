/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mod.netpix.plumepixmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import mod.netpix.plumepixmod.block.RbBlock;
import mod.netpix.plumepixmod.block.LiquidRainbowBlock;
import mod.netpix.plumepixmod.block.AnimRBBlock;
import mod.netpix.plumepixmod.NetpixelmodMod;

public class NetpixelmodModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(NetpixelmodMod.MODID);
	public static final DeferredBlock<Block> ANIM_RB;
	public static final DeferredBlock<Block> RB;
	public static final DeferredBlock<Block> LIQUID_RAINBOW;
	static {
		ANIM_RB = REGISTRY.register("anim_rb", AnimRBBlock::new);
		RB = REGISTRY.register("rb", RbBlock::new);
		LIQUID_RAINBOW = REGISTRY.register("liquid_rainbow", LiquidRainbowBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}