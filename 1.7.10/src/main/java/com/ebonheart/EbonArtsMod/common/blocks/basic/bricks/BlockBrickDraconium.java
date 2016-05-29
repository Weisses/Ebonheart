package com.ebonheart.EbonArtsMod.common.blocks.basic.bricks;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.blocks.BlockHelperOLDOLDOLD;
import com.ebonheart.EbonArtsMod.common.blocks.basic.BlockRockEA;


public class BlockBrickDraconium extends BlockRockEA {

	public BlockBrickDraconium() 
	{
		super();
		//BlockHelperOLDOLDOLD.setBlockName(this, "gem/draconium/draconium_block_brick");
		this.setBlockName("gems/draconium/draconium_block_brick");
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
