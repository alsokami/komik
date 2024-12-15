package me.alsokami.komik.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import me.alsokami.komik.world.inventory.WorkbenchguiMenu;
import me.alsokami.komik.network.WorkbenchguiButtonMessage;
import me.alsokami.komik.KomikMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class WorkbenchguiScreen extends AbstractContainerScreen<WorkbenchguiMenu> {
	private final static HashMap<String, Object> guistate = WorkbenchguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_industrialise;

	public WorkbenchguiScreen(WorkbenchguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 178;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("komik:textures/screens/workbenchgui.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
		if (mouseX > leftPos + 81 && mouseX < leftPos + 105 && mouseY > topPos + 15 && mouseY < topPos + 39)
			guiGraphics.renderTooltip(font, Component.translatable("gui.komik.workbenchgui.tooltip_the_industrial_workbench_is_a_cr"), mouseX, mouseY);
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
		guiGraphics.drawString(this.font, Component.translatable("gui.komik.workbenchgui.label_industrial_workbench"), 38, 5, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.komik.workbenchgui.label_hover_for_help"), 52, 16, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.komik.workbenchgui.label_output"), 127, 65, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		button_industrialise = Button.builder(Component.translatable("gui.komik.workbenchgui.button_industrialise"), e -> {
			if (true) {
				KomikMod.PACKET_HANDLER.sendToServer(new WorkbenchguiButtonMessage(0, x, y, z));
				WorkbenchguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 49, this.topPos + 38, 93, 20).build();
		guistate.put("button:button_industrialise", button_industrialise);
		this.addRenderableWidget(button_industrialise);
	}
}
