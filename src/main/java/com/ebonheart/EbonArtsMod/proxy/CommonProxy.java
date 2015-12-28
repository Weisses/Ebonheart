package com.ebonheart.EbonArtsMod.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.api.GuiHandler;
import com.ebonheart.EbonArtsMod.common.world.WorldGeneratorEA;
import com.ebonheart.EbonArtsMod.init.InitAchievementsEA;
import com.ebonheart.EbonArtsMod.init.InitBlocksEA;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;
import com.ebonheart.EbonArtsMod.init.InitRecipesEA;
import com.ebonheart.EbonArtsMod.init.InitTileEntitiesEA;
import com.ebonheart.EbonArtsMod.network.packets.EAPacket;

public class CommonProxy 
{
	
	public void preInit(FMLPreInitializationEvent event) 
	{
		InitItemsEA.preInit();
		InitItemsEA.register();
		InitBlocksEA.preInit();
		InitBlocksEA.register();
		//InitTileEntitiesEA.init();
		//InitTileEntitiesEA.register();
		
		
		
	}
	
	public void init(FMLInitializationEvent event) 
	{
		InitRecipesEA.initShapedRecipe();
		InitRecipesEA.initShapelessRecipe();
		InitRecipesEA.initSmeltingRecipe();
		InitAchievementsEA.init();
		
		GameRegistry.registerWorldGenerator(new WorldGeneratorEA(), 0);
		NetworkRegistry.INSTANCE.registerGuiHandler(EbonArtsMod.instance, new GuiHandler());
	}
	
	public void postInit(FMLPostInitializationEvent event) 
	{
		
	}
}
