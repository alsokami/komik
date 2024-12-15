
package me.alsokami.komik.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class LeaddustItem extends Item {
	public LeaddustItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("\u00A77A powder that"));
		list.add(Component.literal("\u00A77turns into Zinc ingots."));
		list.add(Component.literal("\u00A77\u2E15 Obtained by washing"));
		list.add(Component.literal("\u00A77sifted ore in ore washer."));
		list.add(Component.literal("\u00A78\u00A7oZinc, ZN"));
		list.add(Component.literal("\u00A7r"));
		list.add(Component.literal("\u00A7f\u00A7lCOMMON MINERAL"));
	}
}
