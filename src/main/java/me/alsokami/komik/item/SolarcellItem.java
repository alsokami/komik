
package me.alsokami.komik.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class SolarcellItem extends Item {
	public SolarcellItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("\u00A77A photovoltaic cell"));
		list.add(Component.literal("\u00A77made from silica, "));
		list.add(Component.literal("\u00A77silver and aluminum."));
		list.add(Component.literal("\u00A77Used for making big"));
		list.add(Component.literal("\u00A77solar cells."));
		list.add(Component.literal("\u00A7r"));
		list.add(Component.literal("\u00A75\u00A7lEPIC MATERIAL"));
	}
}
