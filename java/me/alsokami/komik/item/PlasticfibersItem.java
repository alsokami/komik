
package me.alsokami.komik.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class PlasticfibersItem extends Item {
	public PlasticfibersItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON));
	}
}
