package com.ebonheart.EbonArtsMod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.ItemFood;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ebonheart.EbonArtsMod.init.EbonArtsAchievements;
import com.ebonheart.EbonArtsMod.init.EbonArtsBlocks;
import com.ebonheart.EbonArtsMod.init.EbonArtsItems;
import com.ebonheart.EbonArtsMod.init.EbonArtsRecipes;
import com.ebonheart.EbonArtsMod.init.EbonArtsTileEntities;
import com.ebonheart.EbonArtsMod.proxy.CommonProxy;
import com.ebonheart.EbonArtsMod.tileentity.BlockBananaPlantRoot;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class EbonArtsMod {

	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	//public static BlockBananaPlantRoot bananaplant;
	//public static ItemFood banana;
	
	public static final EbonArtsTab tabEbonArts = new EbonArtsTab("tabEbonArts");
	public static final EbonArtsTabBlocks tabEbonArtsBlocks = new EbonArtsTabBlocks("tabEbonArtsBlocks");
	public static final EbonArtsTabItems tabEbonArtsItems = new EbonArtsTabItems("tabEbonArtsItems");
	
	
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
		EbonArtsAchievements.init();
		//EbonArtsTileEntities.init();
		//EbonArtsTileEntities.register();
		
		//EbonArtsMod.bananaplant = new BlockBananaPlantRoot(EbonArtsMod.banana, 3, 1, 5, 2, 2, 12, 10, 30, 40, 100, 5, 10, 3, 1, null);
		
		//EbonArtsMod.bananaplant.RegisterRenderers();
		
		//EbonArtsMod.banana = new ItemFood(3, 0.3F, false);
		//EbonArtsMod.banana.setUnlocalizedName("banana");
		//GameRegistry.registerItem(EbonArtsMod.banana, "banana");
		
		//Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(EbonArtsMod.banana, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + "banana", "inventory"));
		
		
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
		
		
	}
	
	
	
}
