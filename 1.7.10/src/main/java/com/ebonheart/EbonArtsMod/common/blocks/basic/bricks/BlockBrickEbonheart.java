package com.ebonheart.EbonArtsMod.common.blocks.basic.bricks;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.blocks.BlockHelperOLDOLDOLD;
import com.ebonheart.EbonArtsMod.common.blocks.basic.BlockRockEA;


public class BlockBrickEbonheart extends BlockRockEA {

	public BlockBrickEbonheart() 
	{
		super();
		//BlockHelperOLDOLDOLD.setBlockName(this, "gem/ebonheart/ebonheart_block_brick");
		this.setBlockName("gems/ebonheart/ebonheart_block_brick");
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
