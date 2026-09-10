/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mod.netpix.rainbowthings.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import mod.netpix.rainbowthings.RainbowthingsMod;

public class RainbowthingsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RainbowthingsMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> RAINBOW_BLOCK_MOD = REGISTRY.register("rainbow_block_mod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.rainbowthings.rainbow_block_mod")).icon(() -> new ItemStack(RainbowthingsModBlocks.ANIM_RB.get())).displayItems((parameters, tabData) -> {
				tabData.accept(RainbowthingsModItems.RE.get());
				tabData.accept(RainbowthingsModItems.ANIM_RE.get());
				tabData.accept(RainbowthingsModItems.RED_EM.get());
				tabData.accept(RainbowthingsModItems.ORAN_EM.get());
				tabData.accept(RainbowthingsModItems.YELL_EM.get());
				tabData.accept(RainbowthingsModItems.LB_EM.get());
				tabData.accept(RainbowthingsModItems.BLUE_EM.get());
				tabData.accept(RainbowthingsModItems.CRIM_EM.get());
				tabData.accept(RainbowthingsModBlocks.ANIM_RB.get().asItem());
				tabData.accept(RainbowthingsModBlocks.RB.get().asItem());
			}).withSearchBar().build());
}