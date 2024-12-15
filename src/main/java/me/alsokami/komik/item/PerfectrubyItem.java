
package me.alsokami.komik.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class PerfectrubyItem extends Item {
	public PerfectrubyItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("\u00A77A perfected compacted"));
		list.add(Component.literal("\u00A77version of the Polished ruby."));
		list.add(Component.literal("\u00A78\u00A7oEven though it's \"perfect\","));
		list.add(Component.literal("\u00A78\u00A7oyou can still think of more"));
		list.add(Component.literal("\u00A78\u00A7operfect things.."));
		list.add(Component.literal("\u00A7r"));
		list.add(Component.literal("\u00A79\u00A7lRARE MINERAL"));
	}
}
