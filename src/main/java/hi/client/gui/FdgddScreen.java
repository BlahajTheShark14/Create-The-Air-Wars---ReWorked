package hi.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.Minecraft;

import java.util.HashMap;

import hi.world.inventory.FdgddMenu;

import hi.network.FdgddButtonMessage;

import hi.CreateTheAirWarsMod;

import com.mojang.blaze3d.systems.RenderSystem;

public class FdgddScreen extends AbstractContainerScreen<FdgddMenu> {
	private final static HashMap<String, Object> guistate = FdgddMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	EditBox cordSE;
	Button button_update;

	public FdgddScreen(FdgddMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 174;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("create_the_air_wars:textures/screens/fdgdd.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		cordSE.render(guiGraphics, mouseX, mouseY, partialTicks);
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
		if (cordSE.isFocused())
			return cordSE.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
		cordSE.tick();
	}

	@Override
	public void resize(Minecraft minecraft, int width, int height) {
		String cordSEValue = cordSE.getValue();
		super.resize(minecraft, width, height);
		cordSE.setValue(cordSEValue);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
		guiGraphics.drawString(this.font, Component.translatable("gui.create_the_air_wars.fdgdd.label_give_the_rocket_power"), 31, 31, -12829636, false);
	}

	@Override
	public void init() {
		super.init();
		cordSE = new EditBox(this.font, this.leftPos + 27, this.topPos + 45, 118, 18, Component.translatable("gui.create_the_air_wars.fdgdd.cordSE")) {
			@Override
			public void insertText(String text) {
				super.insertText(text);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.create_the_air_wars.fdgdd.cordSE").getString());
				else
					setSuggestion(null);
			}

			@Override
			public void moveCursorTo(int pos) {
				super.moveCursorTo(pos);
				if (getValue().isEmpty())
					setSuggestion(Component.translatable("gui.create_the_air_wars.fdgdd.cordSE").getString());
				else
					setSuggestion(null);
			}
		};
		cordSE.setSuggestion(Component.translatable("gui.create_the_air_wars.fdgdd.cordSE").getString());
		cordSE.setMaxLength(32767);
		guistate.put("text:cordSE", cordSE);
		this.addWidget(this.cordSE);
		button_update = Button.builder(Component.translatable("gui.create_the_air_wars.fdgdd.button_update"), e -> {
			if (true) {
				CreateTheAirWarsMod.PACKET_HANDLER.sendToServer(new FdgddButtonMessage(0, x, y, z));
				FdgddButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}).bounds(this.leftPos + 57, this.topPos + 100, 56, 20).build();
		guistate.put("button:button_update", button_update);
		this.addRenderableWidget(button_update);
	}
}
