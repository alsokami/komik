package me.alsokami.komik.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;
import net.minecraft.client.gui.GuiGraphics;

import me.alsokami.komik.world.inventory.OilrefineryguiMenu;
import me.alsokami.komik.network.OilrefineryguiButtonMessage;
import me.alsokami.komik.KomikMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class OilrefineryguiScreen extends AbstractContainerScreen<OilrefineryguiMenu> {
	private final static HashMap<String, Object> guistate = OilrefineryguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_screenshot_20241208_130738;

	public OilrefineryguiScreen(OilrefineryguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("komik:textures/screens/oilrefinerygui.png");

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

		guiGraphics.blit(new ResourceLocation("komik:textures/screens/image-removebg-preview.png"), this.leftPos + 30, this.topPos + 1, 0, 0, 119, 28, 119, 28);

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
		guiGraphics.drawString(this.font, Component.translatable("gui.komik.oilrefinerygui.label_oil"), 10, 34, -12829636, false);
		guiGraphics.drawString(this.font, Component.translatable("gui.komik.oilrefinerygui.label_plastic"), 135, 34, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		imagebutton_screenshot_20241208_130738 = new ImageButton(this.leftPos + 34, this.topPos + 46, 105, 25, 0, 0, 25, new ResourceLocation("komik:textures/screens/atlas/imagebutton_screenshot_20241208_130738.png"), 105, 50, e -> {
			if (true) {
				KomikMod.PACKET_HANDLER.sendToServer(new OilrefineryguiButtonMessage(0, x, y, z));
				OilrefineryguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:imagebutton_screenshot_20241208_130738", imagebutton_screenshot_20241208_130738);
		this.addRenderableWidget(imagebutton_screenshot_20241208_130738);
	}
}
