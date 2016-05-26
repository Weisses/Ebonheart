package com.ebonheart.EbonArtsMod.proxy;

import net.minecraft.entity.Entity;
import net.minecraftforge.common.MinecraftForge;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.AchievementTriggersEA;
import com.ebonheart.EbonArtsMod.common.utils.events.ArmorBuffHandler;
import com.ebonheart.EbonArtsMod.common.utils.gui.GuiHandler;
import com.ebonheart.EbonArtsMod.common.world.WorldGeneratorEA;
import com.ebonheart.EbonArtsMod.init.InitAchievementsEA;
import com.ebonheart.EbonArtsMod.init.InitBlocksEA;
import com.ebonheart.EbonArtsMod.init.InitEntityEA;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;
import com.ebonheart.EbonArtsMod.init.InitRecipesEA;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {
	
	public void preInit(FMLPreInitializationEvent event) 
	{
		//SoundEventsEA.registerSounds();
		
		InitItemsEA.preInit();
		//InitItemsEA.register();
		//InitBlocksEA.preInit();
		//InitBlocksEA.register();
		//InitEntityEA.preInit();
		//InitEntityEA.preInit();
		
		
		//=======================================//
		//InitTileEntitiesEA.init();
		//InitTileEntitiesEA.register();
	}
	
	public void init(FMLInitializationEvent event) 
	{
		//InitRecipesEA.initShapedRecipe();
		//InitRecipesEA.initShapelessRecipe();
		//InitRecipesEA.initSmeltingRecipe();
		//InitAchievementsEA.init();
		
		//WorldChestHooks.init();
		
		//MinecraftForge.EVENT_BUS.register(new AchievementTriggersEA());
		//MinecraftForge.EVENT_BUS.register(new ArmorBuffHandler());
	    
		
		//GameRegistry.registerWorldGenerator(new WorldGeneratorEA(), 0);
		//.registerWorldGenerator(new WorldGeneratorEA(), 0);
		NetworkRegistry.INSTANCE.registerGuiHandler(EbonArtsMod.instance, new GuiHandler());
	}
	
	public void postInit(FMLPostInitializationEvent event) 
	{
		
	}
	
	public void generateSprintParticles(Entity entity) { }
	
	public void generateUnholyParticles(Entity entity) { }
	
	public void generateFlightParticles(Entity entity) { }
	
	public void generateEnchEbonParticles(Entity entity) { }
	
	
}
