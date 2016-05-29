package com.ebonheart.EbonArtsMod.common.blocks.basic.bricks;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.blocks.BlockHelperOLDOLDOLD;
import com.ebonheart.EbonArtsMod.common.blocks.basic.BlockRockEA;


public class BlockBrickArcanite extends BlockRockEA {

	public BlockBrickArcanite() 
	{
		super();
		//BlockHelperOLDOLDOLD.setBlockName(this, "gem/arcanite/arcanite_block_brick");
		this.setBlockName("gems/arcanite/arcanite_block_brick");
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
