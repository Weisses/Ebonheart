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
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.Reference;
import com.ebonheart.EbonArtsMod.blocks.BlockArcanite;
import com.ebonheart.EbonArtsMod.blocks.BlockFurnaceEA;
import com.ebonheart.EbonArtsMod.blocks.BlockLogEA;
import com.ebonheart.EbonArtsMod.blocks.BlockRotatedPillarEA;
import com.ebonheart.EbonArtsMod.blocks.BlockEA;
import com.ebonheart.EbonArtsMod.blocks.BlockFenceGateEA;
import com.ebonheart.EbonArtsMod.blocks.BlockOreEA;
import com.ebonheart.EbonArtsMod.blocks.BlockSlabEA;
import com.ebonheart.EbonArtsMod.blocks.BlockWallEA;
import com.ebonheart.EbonArtsMod.blocks.GeneralModBlocks;
import com.ebonheart.EbonArtsMod.tileentity.TileEntityBananaPlant;

public class InitBlocksEA {
	
	public static Block arcanite_ore;
	public static Block arcanite_block;
	public static Block arcanite_fence;
	//public static Block arcanite_fence_gate;
	//public static Block arcanite_wall;
	//public static Block arcanite_wall_gate;
	
	public static Block innate_arcanite_block;
	
	//public static Block arcanite_column;
	//public static Block arcanite_double_slab;
	//public static Block arcanite_slab;
	//public static Block arcanite_stairs;
	public static Block purified_mystic_block;
	
	public static Block mystic_furnace;
	public static Block lit_mystic_furnace;
	
	

	public static void init()
	{
		
		arcanite_ore = new BlockOreEA(Material.rock).setUnlocalizedName("ore/arcanite_ore").setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		arcanite_block = new BlockArcanite(Material.rock).setUnlocalizedName("gem/arcanite_block").setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		arcanite_fence = new BlockFence(Material.rock).setUnlocalizedName("fence/arcanite_fence").setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		//arcanite_fence_gate = new BlockFenceGate().setUnlocalizedName("fence/arcanite_fence_gate").setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		//arcanite_wall = new BlockWall(EbonArtsBlocks.arcanite_block).setUnlocalizedName("wall/arcanite_wall").setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		//arcanite_wall_gate = new BlockFenceGate().setUnlocalizedName("wall/arcanite_wall_gate").setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		
		innate_arcanite_block = new BlockOreEA(Material.rock).setUnlocalizedName("gem/innate_arcanite_block").setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		
		mystic_furnace = new BlockFurnaceEA(false).setUnlocalizedName("machine/mystic_furnace").setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		lit_mystic_furnace = new BlockFurnaceEA(true).setUnlocalizedName("machine/lit_mystic_furnace").setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		
		
		
		//arcanite_column = new Block(Material.rock).setUnlocalizedName("gem/arcanite_column").setCreativeTab(EbonArtsMod.tabEbonArts);
		//arcanite_double_slab = new BlockDoubleStoneSlab().setUnlocalizedName("gem/arcanite_double_slab").setCreativeTab(EbonArtsMod.tabEbonArts);
		//arcanite_slab = new BlockHalfStoneSlab().setUnlocalizedName("gem/arcanite_slab").setCreativeTab(EbonArtsMod.tabEbonArts);
		//arcanite_stairs = new BlockStairs().setUnlocalizedName("arcanite_stairs").setCreativeTab(EbonArtsMod.tabEbonArts);
		
		purified_mystic_block = new GeneralModBlocks(Material.rock).setUnlocalizedName("purified_mystic_block").setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		
		
	}
	
	
	public static void register()
	{
		
		GameRegistry.registerBlock(arcanite_ore, arcanite_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(arcanite_block, arcanite_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(arcanite_fence, arcanite_fence.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(arcanite_fence_gate, arcanite_fence_gate.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(arcanite_wall, arcanite_wall.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(arcanite_wall_gate, arcanite_wall_gate.getUnlocalizedName().substring(5));
		
		GameRegistry.registerBlock(innate_arcanite_block, innate_arcanite_block.getUnlocalizedName().substring(5));
		
		GameRegistry.registerBlock(mystic_furnace, mystic_furnace.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lit_mystic_furnace, lit_mystic_furnace.getUnlocalizedName().substring(5));
		
		
		
		//GameRegistry.registerBlock(arcanite_column, arcanite_column.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(arcanite_double_slab, arcanite_double_slab.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(arcanite_slab, arcanite_slab.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(arcanite_stairs, arcanite_stairs.getUnlocalizedName().substring(5));
		
		GameRegistry.registerBlock(purified_mystic_block, purified_mystic_block.getUnlocalizedName().substring(5));
		

	}
	
	public static void registerRenders()
	{
		
		registerRender(arcanite_ore);
		registerRender(arcanite_block);
		registerRender(arcanite_fence);
		//registerRender(arcanite_fence_gate);
		//registerRender(arcanite_wall);
		//registerRender(arcanite_wall_gate);
		
		registerRender(innate_arcanite_block);
		
		registerRender(mystic_furnace);
		registerRender(lit_mystic_furnace);
		
		
		//registerRender(arcanite_column);
		//registerRender(arcanite_double_slab);
		//registerRender(arcanite_slab);
		//registerRender(arcanite_stairs);
		
		registerRender(purified_mystic_block);
		
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}
}
