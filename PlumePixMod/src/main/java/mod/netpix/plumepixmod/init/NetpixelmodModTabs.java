/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mod.netpix.plumepixmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import mod.netpix.plumepixmod.NetpixelmodMod;

public class NetpixelmodModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NetpixelmodMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> RAINBOW_BLOCK_MOD = REGISTRY.register("rainbow_block_mod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.netpixelmod.rainbow_block_mod")).icon(() -> new ItemStack(NetpixelmodModBlocks.ANIM_RB.get())).displayItems((parameters, tabData) -> {
				tabData.accept(NetpixelmodModItems.RE.get());
				tabData.accept(NetpixelmodModItems.ANIM_RE.get());
				tabData.accept(NetpixelmodModItems.RED_EM.get());
				tabData.accept(NetpixelmodModItems.ORAN_EM.get());
				tabData.accept(NetpixelmodModItems.YELL_EM.get());
				tabData.accept(NetpixelmodModItems.LB_EM.get());
				tabData.accept(NetpixelmodModItems.BLUE_EM.get());
				tabData.accept(NetpixelmodModItems.CRIM_EM.get());
				tabData.accept(NetpixelmodModBlocks.ANIM_RB.get().asItem());
				tabData.accept(NetpixelmodModBlocks.RB.get().asItem());
				tabData.accept(NetpixelmodModItems.ODINR.get());
				tabData.accept(NetpixelmodModItems.DVAR.get());
				tabData.accept(NetpixelmodModItems.TRIR.get());
				tabData.accept(NetpixelmodModItems.PYATR.get());
				tabData.accept(NetpixelmodModItems.DESYATR.get());
				tabData.accept(NetpixelmodModItems.STOR.get());
				tabData.accept(NetpixelmodModItems.TISYACHYAR.get());
				tabData.accept(NetpixelmodModItems.PYATTISYACHR.get());
				tabData.accept(NetpixelmodModItems.MONEY_PACK_15_K.get());
				tabData.accept(NetpixelmodModItems.LIQUID_RAINBOW_BUCKET.get());
			}).withSearchBar().build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> PPMMONEY = REGISTRY.register("ppmmoney",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.netpixelmod.ppmmoney")).icon(() -> new ItemStack(NetpixelmodModItems.ODINR.get())).displayItems((parameters, tabData) -> {
				tabData.accept(NetpixelmodModItems.ODINR.get());
				tabData.accept(NetpixelmodModItems.DVAR.get());
				tabData.accept(NetpixelmodModItems.TRIR.get());
				tabData.accept(NetpixelmodModItems.PYATR.get());
				tabData.accept(NetpixelmodModItems.DESYATR.get());
				tabData.accept(NetpixelmodModItems.STOR.get());
				tabData.accept(NetpixelmodModItems.TISYACHYAR.get());
				tabData.accept(NetpixelmodModItems.PYATTISYACHR.get());
				tabData.accept(NetpixelmodModItems.MONEY_PACK_15_K.get());
			}).withSearchBar().withTabsBefore(RAINBOW_BLOCK_MOD.getId()).build());
}