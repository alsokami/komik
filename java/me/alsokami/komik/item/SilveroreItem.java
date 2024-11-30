
package me.alsokami.komik.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SilveroreItem extends Item {
	public SilveroreItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}
}
