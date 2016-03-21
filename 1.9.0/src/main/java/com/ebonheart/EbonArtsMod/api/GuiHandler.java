package com.ebonheart.EbonArtsMod.api;

import com.ebonheart.EbonArtsMod.common.gui.GuiCompendium;
import com.ebonheart.EbonArtsMod.common.gui.GuiTestTileEntity;
import com.ebonheart.EbonArtsMod.common.gui.guicontainer.ContainerTestTileEntity;
import com.ebonheart.EbonArtsMod.common.tileentities.TestTileEntity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	public static final int ALCHEMICAL_COMPENDIUM_GUI = 0;
	public static final int TEST_TILE_ENTITY_GUI = 1;
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if (ID == 1)
		{
			return new ContainerTestTileEntity(player.inventory, (TestTileEntity) world.getTileEntity(new BlockPos(x, y, z)));
		}
		else 
		{
			return null;
		}
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if (ID == 0)
		{
			return new GuiCompendium();
		}
		else if (ID == 1)
		{
			return new GuiTestTileEntity(player.inventory, (TestTileEntity) world.getTileEntity(new BlockPos(x, y, z)));
		}
		else
		{
			return null;
		}
	}
}
