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
import com.ebonheart.EbonArtsMod.api.helper.LogHelper;
import com.ebonheart.EbonArtsMod.configs.EbonArtsConfiguration;
import com.ebonheart.EbonArtsMod.init.InitAchievementsEA;
import com.ebonheart.EbonArtsMod.init.InitBlocksEA;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;
import com.ebonheart.EbonArtsMod.init.InitRecipesEA;
import com.ebonheart.EbonArtsMod.proxy.CommonProxy;
import com.ebonheart.EbonArtsMod.references.Reference;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, guiFactory = Reference.CONFIG_GUI)
public class EbonArtsMod {

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	public static Configuration config;
	
	public static final EbonArtsTabBlocks tabEbonArtsBlocks = new EbonArtsTabBlocks("tabEbonArtsBlocks");
	public static final EbonArtsTabItems tabEbonArtsItems = new EbonArtsTabItems("tabEbonArtsItems");
	
	@Mod.Instance(Reference.MOD_ID)
	public static EbonArtsMod instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		config = new Configuration(event.getSuggestedConfigurationFile());
		FMLCommonHandler.instance().bus().register(instance);
		EbonArtsConfiguration.syncConfig();
		
		this.proxy.preInit(event);
		LogHelper.info("Pre Initialization Complete.");
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
		LogHelper.info("Initialization Complete.");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		this.proxy.postInit(event);
		LogHelper.info("Post Initialization Complete.");
	}
}
