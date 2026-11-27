/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package mod.netpix.plumepixmod.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import mod.netpix.plumepixmod.fluid.types.LiquidRainbowFluidType;
import mod.netpix.plumepixmod.NetpixelmodMod;

public class NetpixelmodModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, NetpixelmodMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> LIQUID_RAINBOW_TYPE = REGISTRY.register("liquid_rainbow", LiquidRainbowFluidType::new);
}