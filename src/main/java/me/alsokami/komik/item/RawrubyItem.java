
package me.alsokami.komik.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class RawrubyItem extends Item {
	public RawrubyItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("\u00A77A mineral dropped from"));
		list.add(Component.literal("\u00A77Ruby ore. Used for complex"));
		list.add(Component.literal("\u00A77and expensive machinery."));
		list.add(Component.literal("\u00A7r"));
		list.add(Component.literal("\u00A79\u00A7lRARE MINERAL"));
	}
}
