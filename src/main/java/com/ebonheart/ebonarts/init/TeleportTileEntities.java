package com.ebonheart.ebonarts.init;

import com.ebonheart.ebonarts.tileentity.TileEntityEbonAlter;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class TeleportTileEntities {

	public static void register()
	{
		GameRegistry.registerTileEntity(TileEntityEbonAlter.class, "tmCoordTransporter");
	}
}
