
package me.alsokami.komik.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class PolishedrubyItem extends Item {
	public PolishedrubyItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("\u00A77A polished version of"));
		list.add(Component.literal("\u00A77ruby. Think of it as"));
		list.add(Component.literal("\u00A77a compacted version of it."));
		list.add(Component.literal("\u00A78\u00A7oGetting more expensive."));
		list.add(Component.literal("\u00A7r"));
		list.add(Component.literal("\u00A79\u00A7lRARE MINERAL"));
	}
}
