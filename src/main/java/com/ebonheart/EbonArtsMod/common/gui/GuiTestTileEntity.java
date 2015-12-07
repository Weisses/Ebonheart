package com.ebonheart.EbonArtsMod.common.gui;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.inventory.Container;

public class GuiTestTileEntity extends GuiContainer {

	public GuiTestTileEntity(Container container) {
		super(container);

		this.xSize = 176;
		this.ySize = 166;
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
	}
}
