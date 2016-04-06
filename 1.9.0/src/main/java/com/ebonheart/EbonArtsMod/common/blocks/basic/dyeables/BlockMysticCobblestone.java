package com.ebonheart.EbonArtsMod.common.blocks.basic.dyeables;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.blocks.BlockHelper;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockMysticCobblestone extends BlockRotatedPillar {
	
	public BlockMysticCobblestone(String unlocalizedName) 
	{
		super(Material.rock);
		BlockHelper.setBlockName(this, unlocalizedName);
		
		this.setCreativeTab(EbonArtsMod.tabEbonArtsDyeables);
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(5.0F);
		this.setStepSound(stepSound.STONE);
	}
	
	//public boolean isOpaqueCube(IBlockState state)
	//{
	//	return false;
	//}
	
	//public boolean isFullCube()
	//{
	//	return true;
	//}
	
}
