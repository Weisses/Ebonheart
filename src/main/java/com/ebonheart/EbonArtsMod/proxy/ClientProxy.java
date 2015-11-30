package com.ebonheart.EbonArtsMod.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.ebonheart.EbonArtsMod.Reference;
import com.ebonheart.EbonArtsMod.init.EbonArtsBlocks;
import com.ebonheart.EbonArtsMod.init.EbonArtsItems;
import com.ebonheart.EbonArtsMod.init.EbonArtsTileEntities;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenders()
	{
		EbonArtsBlocks.registerRenders();
		EbonArtsItems.registerRenders();
		EbonArtsTileEntities.registerRenders();
	}
	
	//@Override
	//public void preInit(FMLPreInitializationEvent e)
	//{
	//	super.preInit(e);
	//}

	//@Override
	//public void init(FMLInitializationEvent e)
	//{
	//	super.init(e);
	//	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(EbonArtsItems.banana, 0, new ModelResourceLocation(Reference.MOD_ID +":banana", "inventory"));
	//	EbonArtsTileEntities.bananaplant.RegisterRenderers();
	//}

	//@Override
	//public void postInit(FMLPostInitializationEvent e)
	//{
	//	super.postInit(e);
	//}
	
}
