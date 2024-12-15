
package me.alsokami.komik.item;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class EnchantedgoldItem extends Item {
	public EnchantedgoldItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("\u00A77A mineral made from"));
		list.add(Component.literal("\u00A77combining 18 of gold"));
		list.add(Component.literal("\u00A77ingots."));
		list.add(Component.literal("\u00A7r"));
		list.add(Component.literal("\u00A79\u00A7lRARE MINERAL"));
	}
}
