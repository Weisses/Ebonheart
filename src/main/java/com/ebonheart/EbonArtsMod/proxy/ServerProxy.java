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

public class ServerProxy extends CommonProxy {
	
	@Override
	public void registerRenders()
	{
		EbonArtsBlocks.registerRenders();
		EbonArtsItems.registerRenders();
		//EbonArtsTileEntities.registerRenders();
	}
	
	
}
