package com.ebonheart.EbonArtsMod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ebonheart.EbonArtsMod.init.InitBlocksEA;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;
import com.ebonheart.EbonArtsMod.init.InitTileEntitiesEA;
import com.ebonheart.EbonArtsMod.tileentity.BlockBananaPlantRoot;
import com.ebonheart.EbonArtsMod.world.WorldGeneratorEA;

public class CommonProxy 
{
	
	public void preInit(FMLPreInitializationEvent event) 
	{
		InitItemsEA.init();
		InitItemsEA.register();
		InitBlocksEA.init();
		InitBlocksEA.register();
		
	}
	
	public void init(FMLInitializationEvent event) 
	{
		GameRegistry.registerWorldGenerator(new WorldGeneratorEA(), 0);
		
	}
	
	public void postInit(FMLPostInitializationEvent event) 
	{
		
	}
}
