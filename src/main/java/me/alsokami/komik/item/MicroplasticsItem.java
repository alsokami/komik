
package me.alsokami.komik.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class MicroplasticsItem extends Item {
	public MicroplasticsItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("\u00A77An item made from"));
		list.add(Component.literal("\u00A77refining oil in an"));
		list.add(Component.literal("\u00A77oil refinery."));
		list.add(Component.literal("\u00A78\u00A7oHumans find a "));
		list.add(Component.literal("\u00A78\u00A7ocredit card worth of"));
		list.add(Component.literal("\u00A78\u00A7omicroplastics in their"));
		list.add(Component.literal("\u00A78\u00A7obodies a week."));
		list.add(Component.literal("\u00A7r"));
		list.add(Component.literal("\u00A7a\u00A7lUNCOMMON MATERIAL"));
	}
}
