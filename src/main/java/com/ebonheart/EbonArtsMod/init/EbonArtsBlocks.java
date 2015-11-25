package com.ebonheart.EbonArtsMod.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.Reference;
import com.ebonheart.EbonArtsMod.blocks.BlockArcaniteBlock;
import com.ebonheart.EbonArtsMod.blocks.GeneralModBlocks;

public class EbonArtsBlocks {
	
	
	public static Block arcanite_block;
	public static Block arcanite_column;
	public static Block arcanite_double_slab;
	public static Block arcanite_ore;
	public static Block arcanite_slab;
	public static Block arcanite_stairs;
	public static Block purified_mystic_block;

	public static void init()
	{
		
		
		arcanite_block = new GeneralModBlocks(Material.rock).setUnlocalizedName("arcanite_block").setCreativeTab(EbonArtsMod.tabEbonArts);
		arcanite_column = new BlockArcaniteBlock(Material.rock).setUnlocalizedName("arcanite_column").setCreativeTab(EbonArtsMod.tabEbonArts);
		arcanite_double_slab = new BlockArcaniteBlock(Material.rock).setUnlocalizedName("arcanite_double_slab").setCreativeTab(EbonArtsMod.tabEbonArts);
		arcanite_ore = new GeneralModBlocks(Material.rock).setUnlocalizedName("arcanite_ore").setCreativeTab(EbonArtsMod.tabEbonArts);
		arcanite_slab = new BlockArcaniteBlock(Material.rock).setUnlocalizedName("arcanite_slab").setCreativeTab(EbonArtsMod.tabEbonArts);
		arcanite_stairs = new BlockArcaniteBlock(Material.rock).setUnlocalizedName("arcanite_stairs").setCreativeTab(EbonArtsMod.tabEbonArts);
		
		purified_mystic_block = new GeneralModBlocks(Material.rock).setUnlocalizedName("purified_mystic_block").setCreativeTab(EbonArtsMod.tabEbonArts);
		
	}
	
	
	public static void register()
	{
		
		GameRegistry.registerBlock(arcanite_block, arcanite_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(arcanite_column, arcanite_column.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(arcanite_double_slab, arcanite_double_slab.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(arcanite_ore, arcanite_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(arcanite_slab, arcanite_slab.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(arcanite_stairs, arcanite_stairs.getUnlocalizedName().substring(5));
		
		GameRegistry.registerBlock(purified_mystic_block, purified_mystic_block.getUnlocalizedName().substring(5));
		
	}
	
	public static void registerRenders()
	{
		
		registerRender(arcanite_block);
		registerRender(arcanite_column);
		registerRender(arcanite_double_slab);
		registerRender(arcanite_ore);
		registerRender(arcanite_slab);
		registerRender(arcanite_stairs);
		
		registerRender(purified_mystic_block);
		
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}
}
