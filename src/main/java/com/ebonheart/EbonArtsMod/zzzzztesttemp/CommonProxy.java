package com.bedrockminer.tutorial;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.bedrockminer.tutorial.blocks.ModBlocks;
import com.bedrockminer.tutorial.items.ModItems;
import com.bedrockminer.tutorial.tileentity.ModTileEntities;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		ModItems.createItems();
		ModBlocks.createBlocks();
		ModTileEntities.init();
	}

	public void init(FMLInitializationEvent e) {
	}

	public void postInit(FMLPostInitializationEvent e) {

	}
}
