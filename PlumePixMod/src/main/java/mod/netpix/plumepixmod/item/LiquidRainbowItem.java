package mod.netpix.plumepixmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import mod.netpix.plumepixmod.init.NetpixelmodModFluids;

public class LiquidRainbowItem extends BucketItem {
	public LiquidRainbowItem() {
		super(NetpixelmodModFluids.LIQUID_RAINBOW.get(), new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.EPIC));
	}
}