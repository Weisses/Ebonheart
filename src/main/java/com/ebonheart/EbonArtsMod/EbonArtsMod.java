package com.ebonheart.EbonArtsMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.ebonheart.EbonArtsMod.init.EbonArtsBlocks;
import com.ebonheart.EbonArtsMod.init.EbonArtsItems;
import com.ebonheart.EbonArtsMod.init.EbonArtsRecipes;
import com.ebonheart.EbonArtsMod.proxy.CommonProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class EbonArtsMod {

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final EbonArtsTab tabEbonArts = new EbonArtsTab("tabEbonArts");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		EbonArtsBlocks.init();
		EbonArtsBlocks.register();
		EbonArtsItems.init();
		EbonArtsItems.register();
		
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.registerRenders();
		EbonArtsRecipes.init();
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
		
		
	}
	
	
	
}
