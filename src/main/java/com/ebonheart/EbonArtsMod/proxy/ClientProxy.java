package com.ebonheart.EbonArtsMod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.ebonheart.EbonArtsMod.init.InitBlocksEA;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;
import com.ebonheart.EbonArtsMod.init.InitTileEntitiesEA;

public class ClientProxy extends CommonProxy 
{
	
	@Override
	public void preInit(FMLPreInitializationEvent e) 
	{
		super.preInit(e);
		
		InitBlocksEA.preInit();
	}
	
	@Override
	public void init(FMLInitializationEvent e) 
	{
		super.init(e);
		
		InitItemsEA.registerRenders();
		InitBlocksEA.registerRenders();
		InitTileEntitiesEA.registerRenders();
		
		
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent e) 
	{
		super.postInit(e);
	}
}
