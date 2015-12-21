package com.ebonheart.EbonArtsMod;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import org.apache.logging.log4j.Logger;




import com.ebonheart.EbonArtsMod.api.creative.EbonArtsTabBlocks;
import com.ebonheart.EbonArtsMod.api.creative.EbonArtsTabItems;
import com.ebonheart.EbonArtsMod.configs.EbonArtsConfiguration;
import com.ebonheart.EbonArtsMod.init.InitAchievementsEA;
import com.ebonheart.EbonArtsMod.init.InitBlocksEA;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;
import com.ebonheart.EbonArtsMod.init.InitRecipesEA;
import com.ebonheart.EbonArtsMod.proxy.CommonProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, guiFactory = Reference.CONFIG_GUI)
public class EbonArtsMod 
{

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	//public static PacketHandler packetHandler;
	
	public static final EbonArtsTabBlocks tabEbonArtsBlocks = new EbonArtsTabBlocks("tabEbonArtsBlocks");
	public static final EbonArtsTabItems tabEbonArtsItems = new EbonArtsTabItems("tabEbonArtsItems");
	
	public static Configuration config;
	
	@Mod.Instance(Reference.MOD_ID)
	public static EbonArtsMod instance;
	
	public static Logger log = FMLLog.getLogger();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		
		config = new Configuration(event.getSuggestedConfigurationFile());
		EbonArtsConfiguration.syncConfig();
		
		this.proxy.preInit(event);
		log.info("Log PreInit");
		
	}
	
	//if config changed then it syncs it
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
		this.proxy.init(event);
		log.info("Log Init");
		FMLCommonHandler.instance().bus().register(instance);
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		this.proxy.postInit(event);
		log.info("Log PostInit");
		
	}
}
