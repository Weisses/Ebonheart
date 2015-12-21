package com.ebonheart.EbonArtsMod.proxy;

import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.ebonheart.EbonArtsMod.common.tileentities.plants.TileEntityBananaPlant;
import com.ebonheart.EbonArtsMod.common.tileentities.plants.TileEntityBananaPlantRenderer;
import com.ebonheart.EbonArtsMod.init.InitBlocksEA;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;
import com.ebonheart.EbonArtsMod.init.InitTileEntitiesEA;

public class ClientProxy extends CommonProxy 
{
	
	@Override
	public void preInit(FMLPreInitializationEvent e) 
	{
		super.preInit(e);
		
		InitBlocksEA.clientInit();
		//InitTileEntitiesEA.init();
		//InitTileEntitiesEA.register();
		
	}
	
	@Override
	public void init(FMLInitializationEvent e) 
	{
		super.init(e);
		
		InitItemsEA.registerRenders();
		InitBlocksEA.registerRenders();
		//InitTileEntitiesEA.registerRenders();
		//InitTileEntitiesEA.clientRegisterRenders();
		
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent e) 
	{
		super.postInit(e);
	}
}
