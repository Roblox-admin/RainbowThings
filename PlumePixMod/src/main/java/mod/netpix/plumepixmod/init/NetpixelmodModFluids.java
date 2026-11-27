/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package mod.netpix.plumepixmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import mod.netpix.plumepixmod.fluid.LiquidRainbowFluid;
import mod.netpix.plumepixmod.NetpixelmodMod;

public class NetpixelmodModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, NetpixelmodMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> LIQUID_RAINBOW = REGISTRY.register("liquid_rainbow", LiquidRainbowFluid.Source::new);
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_LIQUID_RAINBOW = REGISTRY.register("flowing_liquid_rainbow", LiquidRainbowFluid.Flowing::new);

	@EventBusSubscriber(Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(LIQUID_RAINBOW.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_LIQUID_RAINBOW.get(), RenderType.translucent());
		}
	}
}