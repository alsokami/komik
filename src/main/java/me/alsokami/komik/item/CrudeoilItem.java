
package me.alsokami.komik.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;
import net.minecraft.network.chat.Component;

import me.alsokami.komik.init.KomikModFluids;

import java.util.List;

public class CrudeoilItem extends BucketItem {
	public CrudeoilItem() {
		super(KomikModFluids.CRUDEOIL, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("\u00A77Fluid: \u00A7aOil"));
		list.add(Component.literal("\u00A7r"));
		list.add(Component.literal("\u00A77This bucket contains"));
		list.add(Component.literal("\u00A77the liquid every"));
		list.add(Component.literal("\u00A77american is after,"));
		list.add(Component.literal("\u00A77Crude oil."));
		list.add(Component.literal("\u00A7r"));
		list.add(Component.literal("\u00A76\u00A7lLEGENDARY FLUID"));
	}
}
