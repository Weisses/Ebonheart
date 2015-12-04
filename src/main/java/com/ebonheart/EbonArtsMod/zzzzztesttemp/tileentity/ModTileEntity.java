package com.bedrockminer.tutorial.tileentity;

import net.minecraft.server.gui.IUpdatePlayerListBox;
import net.minecraft.tileentity.TileEntity;

public class ModTileEntity extends TileEntity implements IUpdatePlayerListBox {

	@Override
	public void update() {
		System.out.println("Hello, I'm a Tile Entity!");
	}

}
