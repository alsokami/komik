
package me.alsokami.komik.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;
import net.minecraft.network.chat.Component;

import me.alsokami.komik.procedures.PanRightclickedOnBlockProcedure;

import java.util.List;

public class PanItem extends Item {
	public PanItem() {
		super(new Item.Properties().durability(1400).rarity(Rarity.COMMON));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("\u00A77The pan is a tool used"));
		list.add(Component.literal("\u00A77to collect sifted ore from"));
		list.add(Component.literal("\u00A77gravel."));
		list.add(Component.literal("\u00A7r"));
		list.add(Component.literal("\u00A7f\u00A7lCOMMON TOOL"));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		PanRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
