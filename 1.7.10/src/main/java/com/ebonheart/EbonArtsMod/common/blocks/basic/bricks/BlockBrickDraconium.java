package com.ebonheart.EbonArtsMod.common.blocks.basic.bricks;

import com.ebonheart.EbonArtsMod.common.blocks.BlockHelper;
import com.ebonheart.EbonArtsMod.common.blocks.basic.BlockRockEA;


public class BlockBrickDraconium extends BlockRockEA {

	public BlockBrickDraconium() 
	{
		super();
		BlockHelper.setBlockName(this, "gem/draconium/draconium_block_brick");
		
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
