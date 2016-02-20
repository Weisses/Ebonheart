package com.ebonheart.EbonArtsMod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.ebonheart.EbonArtsMod.client.InitBlocksEARender;
import com.ebonheart.EbonArtsMod.client.InitEntityEARender;
import com.ebonheart.EbonArtsMod.client.InitItemsEARender;
import com.ebonheart.EbonArtsMod.init.InitEntityEA;

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
		InitEntityEARender.registerRenders();
		
		//InitEntityEARender.registerParticle(null, null);
		
		
		//InitBlocksEARender.registerSpecialRenders();
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent event) 
	{
		super.postInit(event);
	}
}
