package com.ebonheart.EbonArtsMod.common.blocks.basic;

import net.minecraft.block.BlockStairs;
import net.minecraft.init.Blocks;

import com.ebonheart.EbonArtsMod.common.blocks.BlockHelper;


public class EABlockStairs extends BlockStairs {
	
	public EABlockStairs(String unlocalizedName) 
	{
		super(Blocks.oak_stairs.getStateFromMeta(0));
		BlockHelper.setBlockName(this, unlocalizedName);
		
		this.useNeighborBrightness = true;
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(5.0F);
		this.setStepSound(soundTypeStone);
	}
}
