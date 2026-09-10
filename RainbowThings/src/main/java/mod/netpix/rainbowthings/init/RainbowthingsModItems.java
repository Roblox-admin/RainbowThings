/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mod.netpix.rainbowthings.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import mod.netpix.rainbowthings.item.*;
import mod.netpix.rainbowthings.RainbowthingsMod;

public class RainbowthingsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(RainbowthingsMod.MODID);
	public static final DeferredItem<Item> RE;
	public static final DeferredItem<Item> ANIM_RE;
	public static final DeferredItem<Item> RED_EM;
	public static final DeferredItem<Item> ORAN_EM;
	public static final DeferredItem<Item> YELL_EM;
	public static final DeferredItem<Item> LB_EM;
	public static final DeferredItem<Item> BLUE_EM;
	public static final DeferredItem<Item> CRIM_EM;
	public static final DeferredItem<Item> ANIM_RB;
	public static final DeferredItem<Item> RB;
	static {
		RE = REGISTRY.register("re", ReItem::new);
		ANIM_RE = REGISTRY.register("anim_re", AnimReItem::new);
		RED_EM = REGISTRY.register("red_em", RedEmItem::new);
		ORAN_EM = REGISTRY.register("oran_em", OranEmItem::new);
		YELL_EM = REGISTRY.register("yell_em", YellEmItem::new);
		LB_EM = REGISTRY.register("lb_em", LBEmItem::new);
		BLUE_EM = REGISTRY.register("blue_em", BlueEmItem::new);
		CRIM_EM = REGISTRY.register("crim_em", CrimEmItem::new);
		ANIM_RB = block(RainbowthingsModBlocks.ANIM_RB, new Item.Properties().rarity(Rarity.EPIC));
		RB = block(RainbowthingsModBlocks.RB, new Item.Properties().rarity(Rarity.EPIC));
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}