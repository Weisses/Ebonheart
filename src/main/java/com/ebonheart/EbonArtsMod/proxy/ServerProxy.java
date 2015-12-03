package com.ebonheart.EbonArtsMod.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.ebonheart.EbonArtsMod.Reference;
import com.ebonheart.EbonArtsMod.init.InitBlocksEA;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;
import com.ebonheart.EbonArtsMod.init.InitTileEntitiesEA;

public class ServerProxy extends CommonProxy 
{
	
	@Override
	public void preInit(FMLPreInitializationEvent e) 
	{
		super.preInit(e);
	}
	
	@Override
	public void init(FMLInitializationEvent e) 
	{
		super.init(e);
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent e) 
	{
		super.postInit(e);
	}
}
