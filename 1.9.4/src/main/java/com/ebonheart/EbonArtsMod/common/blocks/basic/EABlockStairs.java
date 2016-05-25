package com.ebonheart.EbonArtsMod.common.blocks.basic;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.blocks.BlockHelper;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;


public class EABlockStairs extends BlockStairs {
	
	public EABlockStairs(String unlocalizedName) 
	{
		super(Blocks.OAK_STAIRS.getStateFromMeta(0));
		BlockHelper.setBlockName(this, unlocalizedName);
		
		this.useNeighborBrightness = true;
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(5.0F);
		this.setSoundType(SoundType.STONE);
	}
}
