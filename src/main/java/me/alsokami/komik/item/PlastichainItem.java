
package me.alsokami.komik.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class PlastichainItem extends Item {
	public PlastichainItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("\u00A77A rod made out of"));
		list.add(Component.literal("\u00A77small micro plastics. Can"));
		list.add(Component.literal("\u00A77be refined to plastic polymers"));
		list.add(Component.literal("\u00A77or smelted for molding."));
		list.add(Component.literal("\u00A78\u00A7oYou won't be saving"));
		list.add(Component.literal("\u00A78\u00A7othe turtles with this"));
		list.add(Component.literal("\u00A78\u00A7oone..."));
		list.add(Component.literal("\u00A7r"));
		list.add(Component.literal("\u00A7a\u00A7lUNCOMMON MATERIAL"));
	}
}
