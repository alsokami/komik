
package me.alsokami.komik.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class BigsolarcellItem extends Item {
	public BigsolarcellItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("\u00A77A group of small"));
		list.add(Component.literal("\u00A77PV cells used to make"));
		list.add(Component.literal("\u00A77a 400W Solar panel."));
		list.add(Component.literal("\u00A78\u00A7oYou're getting so"));
		list.add(Component.literal("\u00A78\u00A7oclose!"));
		list.add(Component.literal("\u00A7r"));
		list.add(Component.literal("\u00A75\u00A7lEPIC MATERIAL"));
	}
}
