package me.alsokami.komik.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import me.alsokami.komik.world.inventory.OildepositmentMenu;
import me.alsokami.komik.network.OildepositmentButtonMessage;
import me.alsokami.komik.KomikMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class OildepositmentScreen extends AbstractContainerScreen<OildepositmentMenu> {
	private final static HashMap<String, Object> guistate = OildepositmentMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_understood;

	public OildepositmentScreen(OildepositmentMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("komik:textures/screens/oildepositment.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.komik.oildepositment.label_oil_deposit"), 56, 8, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.komik.oildepositment.label_an_oil_deposit_is_a_machine_used"), 13, 39, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.komik.oildepositment.label_used_to_deposite_crude_oil"), 17, 52, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.komik.oildepositment.label_this_could_be_for_storage"), 23, 67, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.komik.oildepositment.label_or_refining"), 53, 81, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_understood = Button.builder(Component.translatable("gui.komik.oildepositment.button_understood"), e -> {
			if (true) {
				KomikMod.PACKET_HANDLER.sendToServer(new OildepositmentButtonMessage(0, x, y, z));
				OildepositmentButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 45, this.topPos + 118, 82, 20).build();
		guistate.put("button:button_understood", button_understood);
		this.addRenderableWidget(button_understood);
	}
}
