package mod.netpix.rainbowthings.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ReItem extends Item {
	public ReItem() {
		super(new Item.Properties().fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public int getEnchantmentValue() {
		return 999;
	}
}