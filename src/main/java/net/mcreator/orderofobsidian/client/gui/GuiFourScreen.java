
package net.mcreator.orderofobsidian.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.orderofobsidian.world.inventory.GuiFourMenu;
import net.mcreator.orderofobsidian.procedures.Barre4Procedure;
import net.mcreator.orderofobsidian.procedures.Barre3Procedure;
import net.mcreator.orderofobsidian.procedures.Barre2Procedure;
import net.mcreator.orderofobsidian.procedures.Barre1Procedure;
import net.mcreator.orderofobsidian.procedures.Barre0Procedure;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class GuiFourScreen extends AbstractContainerScreen<GuiFourMenu> {
	public final static HashMap<String, Object> guistate = new HashMap<>();
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public GuiFourScreen(GuiFourMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("orderofobsidian:textures/gui_four.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		if (Barre0Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("orderofobsidian:textures/barre0.png"));
			this.blit(ms, this.leftPos + 47, this.topPos + 21, 0, 0, 64, 8, 64, 8);
		}
		if (Barre4Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("orderofobsidian:textures/barre1.png"));
			this.blit(ms, this.leftPos + 47, this.topPos + 21, 0, 0, 64, 8, 64, 8);
		}
		if (Barre3Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("orderofobsidian:textures/barre2.png"));
			this.blit(ms, this.leftPos + 47, this.topPos + 21, 0, 0, 64, 8, 64, 8);
		}
		if (Barre2Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("orderofobsidian:textures/barre3.png"));
			this.blit(ms, this.leftPos + 47, this.topPos + 21, 0, 0, 64, 8, 64, 8);
		}
		if (Barre1Procedure.execute(world, x, y, z)) {
			RenderSystem.setShaderTexture(0, new ResourceLocation("orderofobsidian:textures/barre4.png"));
			this.blit(ms, this.leftPos + 47, this.topPos + 21, 0, 0, 64, 8, 64, 8);
		}

		RenderSystem.setShaderTexture(0, new ResourceLocation("orderofobsidian:textures/energy_empty.png"));
		this.blit(ms, this.leftPos + 148, this.topPos + 18, 0, 0, 18, 50, 18, 50);

		RenderSystem.setShaderTexture(0, new ResourceLocation("orderofobsidian:textures/enegyfull.png"));
		this.blit(ms, this.leftPos + 149, this.topPos + 19, 0, 0, 16, 48, 16, 48);

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
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		drawString(poseStack, this.font, "Electrique Furnace", 4, 5, -16777216);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
	}
}
