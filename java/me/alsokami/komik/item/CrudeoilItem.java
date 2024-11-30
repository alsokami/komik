
package me.alsokami.komik.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import me.alsokami.komik.init.KomikModFluids;

public class CrudeoilItem extends BucketItem {
	public CrudeoilItem() {
		super(KomikModFluids.CRUDEOIL, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON));
	}
}
