package com.ebonheart.EbonArtsMod.proxy;

import net.minecraft.entity.Entity;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.utils.EventHandler;
import com.ebonheart.EbonArtsMod.common.utils.SoundEventsEA;
import com.ebonheart.EbonArtsMod.common.utils.gui.GuiHandler;
import com.ebonheart.EbonArtsMod.common.world.WorldChestHooks;
import com.ebonheart.EbonArtsMod.common.world.WorldGeneratorEA;
import com.ebonheart.EbonArtsMod.init.InitAchievementsEA;
import com.ebonheart.EbonArtsMod.init.InitBlocksEA;
import com.ebonheart.EbonArtsMod.init.InitEntityEA;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;
import com.ebonheart.EbonArtsMod.init.InitRecipesEA;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent event) 
	{
		SoundEventsEA.registerSounds();
		InitItemsEA.preInit();
		InitBlocksEA.preInit();
		InitBlocksEA.register();
		InitEntityEA.preInit();
		InitEntityEA.register();
		
		
		//=======================================//
		//InitTileEntitiesEA.init();
		//InitTileEntitiesEA.register();
	}
	
	public void init(FMLInitializationEvent event) 
	{
		InitRecipesEA.initShapedRecipe();
		InitRecipesEA.initShapelessRecipe();
		InitRecipesEA.initSmeltingRecipe();
		InitAchievementsEA.init();
		//WorldChestHooks.init();
		
		
		 MinecraftForge.EVENT_BUS.register(new EventHandler());
	     //FMLCommonHandler.instance().bus().register(new EventHandler());
		
		GameRegistry.registerWorldGenerator(new WorldGeneratorEA(), 0);
		NetworkRegistry.INSTANCE.registerGuiHandler(EbonArtsMod.instance, new GuiHandler());
	}
	
	public void postInit(FMLPostInitializationEvent event) 
	{
		
	}
	
	public void generateSprintParticles(Entity entity) { }
	
	public void generateUnholyParticles(Entity entity) { }
	
	public void generateFlightParticles(Entity entity) { }
	
	
}
