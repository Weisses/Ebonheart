package com.ebonheart.EbonArtsMod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.ebonheart.EbonArtsMod.client.InitBlocksEARender;
import com.ebonheart.EbonArtsMod.client.InitItemsEARender;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void preInit(FMLPreInitializationEvent event) 
	{
		super.preInit(event);
		
		InitBlocksEARender.preInit();
		//InitTileEntitiesEA.init();
		//InitTileEntitiesEA.register();
		
		
	}
	
	@Override
	public void init(FMLInitializationEvent event) 
	{
		super.init(event);
		
		InitItemsEARender.registerRenders();
		InitBlocksEARender.registerRenders();
		InitBlocksEARender.registerSpecialRenders();
		//InitTileEntitiesEA.registerRenders();
		//InitTileEntitiesEA.clientRegisterRenders();
				
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent event) 
	{
		super.postInit(event);
	}
}
