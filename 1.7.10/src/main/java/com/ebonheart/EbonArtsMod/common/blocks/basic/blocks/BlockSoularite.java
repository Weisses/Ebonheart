package com.ebonheart.EbonArtsMod.common.blocks.basic.blocks;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.blocks.BlockHelperOLDOLDOLD;
import com.ebonheart.EbonArtsMod.common.blocks.basic.BlockRockEA;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;


public class BlockSoularite extends BlockRockEA {

	public BlockSoularite() 
	{
		super();
		//BlockHelper.setBlockName(this, "gem/soularite/soularite_block");
		this.setBlockName("gems/soularite/soularite_block");
		this.setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		
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
