package com.ebonheart.EbonArtsMod;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import org.apache.logging.log4j.Logger;

import com.ebonheart.EbonArtsMod.init.EbonArtsAchievements;
import com.ebonheart.EbonArtsMod.init.EbonArtsBlocks;
import com.ebonheart.EbonArtsMod.init.EbonArtsItems;
import com.ebonheart.EbonArtsMod.init.EbonArtsRecipes;
import com.ebonheart.EbonArtsMod.init.EbonArtsTileEntities;
import com.ebonheart.EbonArtsMod.proxy.CommonProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class EbonArtsMod {

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	
	public static final EbonArtsTab tabEbonArts = new EbonArtsTab("tabEbonArts");
	public static final EbonArtsTabBlocks tabEbonArtsBlocks = new EbonArtsTabBlocks("tabEbonArtsBlocks");
	public static final EbonArtsTabItems tabEbonArtsItems = new EbonArtsTabItems("tabEbonArtsItems");
	
	public static Configuration config;
	public static EbonArtsMod instance;
	
	public static Logger log = FMLLog.getLogger();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		log.info("Log PreInit");
		//config = new Configuration(event.getSuggestedConfigurationFile());
		//EbonArtsConfiguration.syncConfig();
		EbonArtsBlocks.init();
		EbonArtsBlocks.register();
		EbonArtsItems.init();
		EbonArtsItems.register();

		
		
		
	}
	
	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event)
	{
		if(event.modID.equals(Reference.MOD_ID))
		{
			EbonArtsConfiguration.syncConfig();
		}
	}
	
	
	
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		log.info("Log Init");
		proxy.registerRenders();
		EbonArtsRecipes.init();
		EbonArtsAchievements.init();
		EbonArtsTileEntities.init();

		
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		log.info("Log PostInit");
		
		
	}
	
	
	
}
