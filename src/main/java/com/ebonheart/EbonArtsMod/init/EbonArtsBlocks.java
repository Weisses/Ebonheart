package com.ebonheart.EbonArtsMod.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.Reference;
import com.ebonheart.EbonArtsMod.blocks.BlockMysticOre;
import com.ebonheart.EbonArtsMod.blocks.GeneralModBlocks;

public class EbonArtsBlocks {
	
	public static Block mystic_ore;
	public static Block mystic_block;
	public static Block purified_mystic_block;

	public static void init()
	{
		
		mystic_ore = new GeneralModBlocks(Material.rock).setUnlocalizedName("mystic_ore").setCreativeTab(EbonArtsMod.tabEbonArts);
		mystic_block = new GeneralModBlocks(Material.rock).setUnlocalizedName("mystic_block").setCreativeTab(EbonArtsMod.tabEbonArts);
		purified_mystic_block = new GeneralModBlocks(Material.rock).setUnlocalizedName("purified_mystic_block").setCreativeTab(EbonArtsMod.tabEbonArts);
		
	}
	
	
	public static void register()
	{
		
		GameRegistry.registerBlock(mystic_ore, mystic_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(mystic_block, mystic_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(purified_mystic_block, purified_mystic_block.getUnlocalizedName().substring(5));
		
	}
	
	public static void registerRenders()
	{
		
		registerRender(mystic_ore);
		registerRender(mystic_block);
		registerRender(purified_mystic_block);
		
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}
}
