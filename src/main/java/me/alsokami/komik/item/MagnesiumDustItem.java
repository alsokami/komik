
package me.alsokami.komik.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class MagnesiumDustItem extends Item {
	public MagnesiumDustItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("\u00A77A powder that can be"));
		list.add(Component.literal("\u00A77turned into Magnesium."));
		list.add(Component.literal("\u00A77\u2E15 Obtained from washing"));
		list.add(Component.literal("\u00A77sifted ore in ore washer."));
		list.add(Component.literal("\u00A78\u00A7oMagnesium, MG"));
		list.add(Component.literal("\u00A7r"));
		list.add(Component.literal("\u00A7f\u00A7lCOMMON MINERAL"));
	}
}
