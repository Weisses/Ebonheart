package com.ebonheart.ebonarts.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ebonheart.ebonarts.EbonArtsMod;
import com.ebonheart.ebonarts.Reference;
import com.ebonheart.ebonarts.blocks.EbonAlter;
import com.ebonheart.ebonarts.blocks.MysticOre;

public class EbonArtsBlocks {

	public static Block mystic_ore;
	public static Block ebon_alter;
	
	public static void init() {
		
		mystic_ore = new MysticOre(Material.rock).setUnlocalizedName("mystic_ore").setCreativeTab(EbonArtsMod.tabEbonArts);
		ebon_alter = new EbonAlter(Material.cloth).setUnlocalizedName("ebon_alter").setCreativeTab(EbonArtsMod.tabEbonArts);
	}
	
	public static void register() {
		
		GameRegistry.registerBlock(mystic_ore, mystic_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ebon_alter, ebon_alter.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders() {
		
		registerRender(mystic_ore);
		registerRender(ebon_alter);
	}
	
	
	public static void registerRender(Block block) {
		
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,	new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
}
