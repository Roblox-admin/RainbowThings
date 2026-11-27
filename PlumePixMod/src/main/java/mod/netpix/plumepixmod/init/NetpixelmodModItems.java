/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mod.netpix.plumepixmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.capability.wrappers.FluidBucketWrapper;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import mod.netpix.plumepixmod.item.*;
import mod.netpix.plumepixmod.NetpixelmodMod;

@EventBusSubscriber
public class NetpixelmodModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(NetpixelmodMod.MODID);
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
	public static final DeferredItem<Item> ODINR;
	public static final DeferredItem<Item> DVAR;
	public static final DeferredItem<Item> TRIR;
	public static final DeferredItem<Item> PYATR;
	public static final DeferredItem<Item> DESYATR;
	public static final DeferredItem<Item> STOR;
	public static final DeferredItem<Item> TISYACHYAR;
	public static final DeferredItem<Item> PYATTISYACHR;
	public static final DeferredItem<Item> MONEY_PACK_15_K;
	public static final DeferredItem<Item> LIQUID_RAINBOW_BUCKET;
	static {
		RE = REGISTRY.register("re", ReItem::new);
		ANIM_RE = REGISTRY.register("anim_re", AnimReItem::new);
		RED_EM = REGISTRY.register("red_em", RedEmItem::new);
		ORAN_EM = REGISTRY.register("oran_em", OranEmItem::new);
		YELL_EM = REGISTRY.register("yell_em", YellEmItem::new);
		LB_EM = REGISTRY.register("lb_em", LBEmItem::new);
		BLUE_EM = REGISTRY.register("blue_em", BlueEmItem::new);
		CRIM_EM = REGISTRY.register("crim_em", CrimEmItem::new);
		ANIM_RB = block(NetpixelmodModBlocks.ANIM_RB, new Item.Properties().rarity(Rarity.EPIC));
		RB = block(NetpixelmodModBlocks.RB, new Item.Properties().rarity(Rarity.EPIC));
		ODINR = REGISTRY.register("odinr", OdinrItem::new);
		DVAR = REGISTRY.register("dvar", DvarItem::new);
		TRIR = REGISTRY.register("trir", TrirItem::new);
		PYATR = REGISTRY.register("pyatr", PyatrItem::new);
		DESYATR = REGISTRY.register("desyatr", DesyatrItem::new);
		STOR = REGISTRY.register("stor", StorItem::new);
		TISYACHYAR = REGISTRY.register("tisyachyar", TisyachyarItem::new);
		PYATTISYACHR = REGISTRY.register("pyattisyachr", PyattisyachrItem::new);
		MONEY_PACK_15_K = REGISTRY.register("money_pack_15_k", MoneyPack15KItem::new);
		LIQUID_RAINBOW_BUCKET = REGISTRY.register("liquid_rainbow_bucket", LiquidRainbowItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	@SubscribeEvent
	public static void registerCapabilities(RegisterCapabilitiesEvent event) {
		event.registerItem(Capabilities.FluidHandler.ITEM, (stack, context) -> new FluidBucketWrapper(stack), LIQUID_RAINBOW_BUCKET.get());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}