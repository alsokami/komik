
package me.alsokami.komik.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class SiftedOreItem extends Item {
	public SiftedOreItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("\u00A77A mysterious powder full of"));
		list.add(Component.literal("\u00A77minerals that can be sifted"));
		list.add(Component.literal("\u00A77into mineral dust."));
		list.add(Component.literal("\u00A7r"));
		list.add(Component.literal("\u00A7f\u00A7lCOMMON ITEM"));
	}
}
