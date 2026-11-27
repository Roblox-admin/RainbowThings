/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mod.netpix.plumepixmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import mod.netpix.plumepixmod.NetpixelmodMod;

public class NetpixelmodModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, NetpixelmodMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> RAINTACO = REGISTRY.register("raintaco", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("netpixelmod", "raintaco")));
	public static final DeferredHolder<SoundEvent, SoundEvent> SAL = REGISTRY.register("sal", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("netpixelmod", "sal")));
	public static final DeferredHolder<SoundEvent, SoundEvent> TACOBOT = REGISTRY.register("tacobot", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("netpixelmod", "tacobot")));
	public static final DeferredHolder<SoundEvent, SoundEvent> DESPH = REGISTRY.register("desph", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("netpixelmod", "desph")));
	public static final DeferredHolder<SoundEvent, SoundEvent> IDK = REGISTRY.register("idk", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("netpixelmod", "idk")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BG1 = REGISTRY.register("bg1", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("netpixelmod", "bg1")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BG2 = REGISTRY.register("bg2", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("netpixelmod", "bg2")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BG3 = REGISTRY.register("bg3", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("netpixelmod", "bg3")));
	public static final DeferredHolder<SoundEvent, SoundEvent> RECROOM = REGISTRY.register("recroom", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("netpixelmod", "recroom")));
}