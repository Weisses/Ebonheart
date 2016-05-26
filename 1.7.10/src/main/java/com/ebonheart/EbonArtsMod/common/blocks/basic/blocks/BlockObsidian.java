package com.ebonheart.EbonArtsMod.common.blocks.basic.blocks;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.blocks.BlockHelper;
import com.ebonheart.EbonArtsMod.common.blocks.basic.BlockRockEA;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;


public class BlockObsidian extends BlockRockEA {

	public BlockObsidian() 
	{
		super();
		BlockHelper.setBlockName(this, "gem/obsidian/obsidian_block");
		
		this.useNeighborBrightness=true;
	}
    
    public boolean isOpaqueCube()
    {
    	return false;
    }
    
    public boolean isFullCube()
    {
        return true;
    }
}
