
package me.alsokami.komik.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SilverItem extends Item {
	public SilverItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
