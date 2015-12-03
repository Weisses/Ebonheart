package com.ebonheart.EbonArtsMod.init;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoubleStoneSlab;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockFurnace;
import net.minecraft.block.BlockHalfStoneSlab;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockQuartz;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.BlockWall;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBlock;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.Reference;
import com.ebonheart.EbonArtsMod.blocks.BlockArcaniteMeta;
import com.ebonheart.EbonArtsMod.blocks.BlockArcaniteNormal;
import com.ebonheart.EbonArtsMod.blocks.BlockFurnaceEA;
import com.ebonheart.EbonArtsMod.blocks.BlockInnateArcaniteNormal;
import com.ebonheart.EbonArtsMod.blocks.BlockOreEA;
import com.ebonheart.EbonArtsMod.items.ItemBlockMeta;
import com.ebonheart.EbonArtsMod.tileentity.TileEntityBananaPlant;

public class InitBlocksEA {
	
	public static Block arcanite_ore;
	
	public static Block arcanite_block;
	public static Block arcanite_block_normal;
	
	public static Block arcanite_fence_normal;
	//public static Block arcanite_fence_gate;
	//public static Block arcanite_wall;
	//public static Block arcanite_wall_gate;
	
	public static Block innate_arcanite_block;
	public static Block innate_arcanite_block_normal;
	
	//public static Block arcanite_column;
	//public static Block arcanite_double_slab;
	//public static Block arcanite_slab;
	//public static Block arcanite_stairs;
	public static Block purified_mystic_block;
	
	public static Block mystic_furnace;
	public static Block lit_mystic_furnace;
	
	public static void preInit() {
		ModelBakery.addVariantName(Item.getItemFromBlock(InitBlocksEA.arcanite_block), 
				"ea:arcanite_block_white", 
				"ea:arcanite_block_orange", 
				"ea:arcanite_block_magenta", 
				"ea:arcanite_block_lightblue", 
				"ea:arcanite_block_yellow", 
				"ea:arcanite_block_lime", 
				"ea:arcanite_block_pink", 
				"ea:arcanite_block_gray", 
				"ea:arcanite_block_lightgray", 
				"ea:arcanite_block_cyan", 
				"ea:arcanite_block_purple", 
				"ea:arcanite_block_blue", 
				"ea:arcanite_block_brown", 
				"ea:arcanite_block_green", 
				"ea:arcanite_block_red", 
				"ea:arcanite_block_black");
		
		ModelBakery.addVariantName(Item.getItemFromBlock(InitBlocksEA.innate_arcanite_block), 
				"ea:innate_arcanite_block_white", 
				"ea:innate_arcanite_block_orange", 
				"ea:innate_arcanite_block_magenta", 
				"ea:innate_arcanite_block_lightblue", 
				"ea:innate_arcanite_block_yellow", 
				"ea:innate_arcanite_block_lime", 
				"ea:innate_arcanite_block_pink", 
				"ea:innate_arcanite_block_gray", 
				"ea:innate_arcanite_block_lightgray", 
				"ea:innate_arcanite_block_cyan", 
				"ea:innate_arcanite_block_purple", 
				"ea:innate_arcanite_block_blue", 
				"ea:innate_arcanite_block_brown", 
				"ea:innate_arcanite_block_green", 
				"ea:innate_arcanite_block_red", 
				"ea:innate_arcanite_block_black");
	}

	public static void init()
	{
		
		arcanite_ore = new BlockOreEA(Material.rock).setUnlocalizedName("ore/arcanite_ore");
		
		
		arcanite_block_normal = new BlockArcaniteNormal(Material.rock);
		arcanite_fence_normal = new BlockFence(Material.rock).setUnlocalizedName("fence/arcanite_fence_normal").setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		//arcanite_fence_gate = new BlockFenceGate().setUnlocalizedName("fence/arcanite_fence_gate").setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		//arcanite_wall = new BlockWall(EbonArtsBlocks.arcanite_block).setUnlocalizedName("wall/arcanite_wall").setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		//arcanite_wall_gate = new BlockFenceGate().setUnlocalizedName("wall/arcanite_wall_gate").setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		
		innate_arcanite_block_normal = new BlockInnateArcaniteNormal(Material.rock);
		
		mystic_furnace = new BlockFurnaceEA(false).setUnlocalizedName("machine/mystic_furnace").setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		lit_mystic_furnace = new BlockFurnaceEA(true).setUnlocalizedName("machine/lit_mystic_furnace").setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		
		
		
		//arcanite_column = new Block(Material.rock).setUnlocalizedName("gem/arcanite_column").setCreativeTab(EbonArtsMod.tabEbonArts);
		//arcanite_double_slab = new BlockDoubleStoneSlab().setUnlocalizedName("gem/arcanite_double_slab").setCreativeTab(EbonArtsMod.tabEbonArts);
		//arcanite_slab = new BlockHalfStoneSlab().setUnlocalizedName("gem/arcanite_slab").setCreativeTab(EbonArtsMod.tabEbonArts);
		//arcanite_stairs = new BlockStairs().setUnlocalizedName("arcanite_stairs").setCreativeTab(EbonArtsMod.tabEbonArts);
		
		//purified_mystic_block = new GeneralModBlocks(Material.rock).setUnlocalizedName("purified_mystic_block").setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		
		
	}
	
	
	public static void register()
	{
		
		GameRegistry.registerBlock(arcanite_block = new BlockArcaniteMeta("gem/arcanite_block", Material.rock), ItemBlockMeta.class, "gem/arcanite_block");
		GameRegistry.registerBlock(innate_arcanite_block = new BlockArcaniteMeta("gem/innate_arcanite_block", Material.rock), ItemBlockMeta.class, "gem/innate_arcanite_block");
		
		GameRegistry.registerBlock(arcanite_ore, arcanite_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(arcanite_block_normal, arcanite_block_normal.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(arcanite_fence_normal, arcanite_fence_normal.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(arcanite_fence_gate, arcanite_fence_gate.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(arcanite_wall, arcanite_wall.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(arcanite_wall_gate, arcanite_wall_gate.getUnlocalizedName().substring(5));
		
		GameRegistry.registerBlock(innate_arcanite_block_normal, innate_arcanite_block_normal.getUnlocalizedName().substring(5));
		
		GameRegistry.registerBlock(mystic_furnace, mystic_furnace.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lit_mystic_furnace, lit_mystic_furnace.getUnlocalizedName().substring(5));
		
		
		
		//GameRegistry.registerBlock(arcanite_column, arcanite_column.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(arcanite_double_slab, arcanite_double_slab.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(arcanite_slab, arcanite_slab.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(arcanite_stairs, arcanite_stairs.getUnlocalizedName().substring(5));
		
		//GameRegistry.registerBlock(purified_mystic_block, purified_mystic_block.getUnlocalizedName().substring(5));
		

	}
	
	public static void registerRenders()
	{
		
		registerRender(arcanite_ore);
		
		registerRender(arcanite_block_normal);
		registerRender(arcanite_block);
		registerRender(InitBlocksEA.arcanite_block, 0, "arcanite_block_white");
		registerRender(InitBlocksEA.arcanite_block, 1, "arcanite_block_orange");
		registerRender(InitBlocksEA.arcanite_block, 2, "arcanite_block_magenta");
		registerRender(InitBlocksEA.arcanite_block, 3, "arcanite_block_lightblue");
		registerRender(InitBlocksEA.arcanite_block, 4, "arcanite_block_yellow");
		registerRender(InitBlocksEA.arcanite_block, 5, "arcanite_block_lime");
		registerRender(InitBlocksEA.arcanite_block, 6, "arcanite_block_pink");
		registerRender(InitBlocksEA.arcanite_block, 7, "arcanite_block_gray");
		registerRender(InitBlocksEA.arcanite_block, 8, "arcanite_block_lightgray");
		registerRender(InitBlocksEA.arcanite_block, 9, "arcanite_block_cyan");
		registerRender(InitBlocksEA.arcanite_block, 10, "arcanite_block_purple");
		registerRender(InitBlocksEA.arcanite_block, 11, "arcanite_block_blue");
		registerRender(InitBlocksEA.arcanite_block, 12, "arcanite_block_brown");
		registerRender(InitBlocksEA.arcanite_block, 13, "arcanite_block_green");
		registerRender(InitBlocksEA.arcanite_block, 14, "arcanite_block_red");
		registerRender(InitBlocksEA.arcanite_block, 15, "arcanite_block_black");
		

		
		
		registerRender(arcanite_fence_normal);
		//registerRender(arcanite_fence_gate);
		//registerRender(arcanite_wall);
		//registerRender(arcanite_wall_gate);
		
		registerRender(innate_arcanite_block_normal);
		registerRender(innate_arcanite_block);
		registerRender(InitBlocksEA.innate_arcanite_block, 0, "innate_arcanite_block_white");
		registerRender(InitBlocksEA.innate_arcanite_block, 1, "innate_arcanite_block_orange");
		registerRender(InitBlocksEA.innate_arcanite_block, 2, "innate_arcanite_block_magenta");
		registerRender(InitBlocksEA.innate_arcanite_block, 3, "innate_arcanite_block_lightblue");
		registerRender(InitBlocksEA.innate_arcanite_block, 4, "innate_arcanite_block_yellow");
		registerRender(InitBlocksEA.innate_arcanite_block, 5, "innate_arcanite_block_lime");
		registerRender(InitBlocksEA.innate_arcanite_block, 6, "innate_arcanite_block_pink");
		registerRender(InitBlocksEA.innate_arcanite_block, 7, "innate_arcanite_block_gray");
		registerRender(InitBlocksEA.innate_arcanite_block, 8, "innate_arcanite_block_lightgray");
		registerRender(InitBlocksEA.innate_arcanite_block, 9, "innate_arcanite_block_cyan");
		registerRender(InitBlocksEA.innate_arcanite_block, 10, "innate_arcanite_block_purple");
		registerRender(InitBlocksEA.innate_arcanite_block, 11, "innate_arcanite_block_blue");
		registerRender(InitBlocksEA.innate_arcanite_block, 12, "innate_arcanite_block_brown");
		registerRender(InitBlocksEA.innate_arcanite_block, 13, "innate_arcanite_block_green");
		registerRender(InitBlocksEA.innate_arcanite_block, 14, "innate_arcanite_block_red");
		registerRender(InitBlocksEA.innate_arcanite_block, 15, "innate_arcanite_block_black");
		registerRender(mystic_furnace);
		registerRender(lit_mystic_furnace);
		
		
		//registerRender(arcanite_column);
		//registerRender(arcanite_double_slab);
		//registerRender(arcanite_slab);
		//registerRender(arcanite_stairs);
		
		//registerRender(purified_mystic_block);
		
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}
	
	public static void registerRender(Block block, int meta, String file) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), meta, new ModelResourceLocation(Reference.MOD_ID + ":" + file, "inventory"));
	}
	
	
	//Register metadata blocks
	//public static void registerMetaRenders() {
	//    reg(InitBlocksEA.arcanite_block);
	//	registerMetaRender(InitBlocksEA.arcanite_block, 0, "ea:arcanite_block_black");
	//	registerMetaRender(InitBlocksEA.arcanite_block, 1, "ea:gem/arcanite_block_white");
	    
	//}
	
	

	
	//public static void registerMetaRender(Block block, int meta, String file) {
	//    Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	//    .register(Item.getItemFromBlock(block), meta, new ModelResourceLocation(Reference.MOD_ID + ":" + file, "inventory"));
	//}
	
	
	
}
