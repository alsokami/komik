
package me.alsokami.komik.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class GemstonegauntletItem extends PickaxeItem {
	public GemstonegauntletItem() {
		super(new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 50f;
			}

			public float getAttackDamageBonus() {
				return 308f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 23;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 1, -3f, new Item.Properties().fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.literal("\u00A78Breaking Power 8"));
		list.add(Component.literal("\u00A7r"));
		list.add(Component.literal("\u00A77Damage: \u00A7c+300"));
		list.add(Component.literal("\u00A77Strength: \u00A7c+50"));
		list.add(Component.literal("\u00A77Mining Speed: \u00A7a+800"));
		list.add(Component.literal("\u00A78[\u00A77\u2618\u00A78][\u00A77\u2E15\u00A78][\u00A77\u2727\u00A78][\u00A77\u270E\u00A78][\u00A77\u2748\u00A78]"));
		list.add(Component.literal("\u00A7r"));
		list.add(Component.literal("\u00A77This heavily inspired item"));
		list.add(Component.literal("\u00A77which is not Komik's creation"));
		list.add(Component.literal("\u00A77is the best you are getting for"));
		list.add(Component.literal("\u00A77early late game mining."));
		list.add(Component.literal("\u00A78\u00A7oDoes it get any better than"));
		list.add(Component.literal("\u00A78\u00A7othis?!"));
		list.add(Component.literal("\u00A7r"));
		list.add(Component.literal("\u00A76\u00A7lLEGENDARY GAUNTLET"));
	}
}
