
package me.alsokami.komik.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class MagnesiumIngotItem extends Item {
	public MagnesiumIngotItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("\u00A77An ingot made from"));
		list.add(Component.literal("\u00A77smelting \u00A7n\u00A7fMagnesium\u00A77."));
		list.add(Component.literal("\u00A78\u00A7oThe opening to many"));
		list.add(Component.literal("\u00A78\u00A7omachinery."));
		list.add(Component.literal("\u00A7r"));
		list.add(Component.literal("\u00A7f\u00A7lCOMMON MINERAL"));
	}
}
