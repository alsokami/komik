
package me.alsokami.komik.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SolarcellItem extends Item {
	public SolarcellItem() {
		super(new Item.Properties().stacksTo(12).rarity(Rarity.UNCOMMON));
	}
}
