package com.ebonheart.EbonArtsMod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ebonheart.EbonArtsMod.common.tileentities.TestTileEntities;
import com.ebonheart.EbonArtsMod.common.world.WorldGeneratorEA;
import com.ebonheart.EbonArtsMod.init.InitBlocksEA;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;

public class CommonProxy 
{
	
	public void preInit(FMLPreInitializationEvent event) 
	{
		InitItemsEA.init();
		InitItemsEA.register();
		InitBlocksEA.init();
		InitBlocksEA.register();
		TestTileEntities.init();
		
	}
	
	public void init(FMLInitializationEvent event) 
	{
		GameRegistry.registerWorldGenerator(new WorldGeneratorEA(), 0);
		//NetworkRegistry.INSTANCE.registerGuiHandler(EbonArtsMod.instance, new GuiHandler());
	}
	
	public void postInit(FMLPostInitializationEvent event) 
	{
		
	}
}
