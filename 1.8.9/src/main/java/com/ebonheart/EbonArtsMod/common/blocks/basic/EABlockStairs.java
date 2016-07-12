package com.ebonheart.EbonArtsMod.common.blocks.basic;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

import com.ebonheart.EbonArtsMod.common.blocks.BlockHelper;


public class EABlockStairs extends BlockStairs {
	
	public EABlockStairs(String unlocalizedName, Block block) 
	{
		super(block.getDefaultState());
		BlockHelper.setBlockName(this, unlocalizedName);
		
		this.useNeighborBrightness = true;
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(5.0F);
		this.setStepSound(soundTypeStone);
	}
}
