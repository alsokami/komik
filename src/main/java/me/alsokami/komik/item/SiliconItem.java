
package me.alsokami.komik.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class SiliconItem extends Item {
	public SiliconItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("\u00A77A not very common"));
		list.add(Component.literal("\u00A77abundant ore used for"));
		list.add(Component.literal("\u00A77machinery and CPUs."));
		list.add(Component.literal("\u00A78\u00A7oThe ultimate miner"));
		list.add(Component.literal("\u00A78\u00A7oguild themselves love"));
		list.add(Component.literal("\u00A78\u00A7omining silica. It is their"));
		list.add(Component.literal("\u00A78\u00A7oeconomy."));
		list.add(Component.literal("\u00A7r"));
		list.add(Component.literal("\u00A7f\u00A7lCOMMON MINERAL"));
	}
}
