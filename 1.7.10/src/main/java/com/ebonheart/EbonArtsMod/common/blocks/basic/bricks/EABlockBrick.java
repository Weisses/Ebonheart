package com.ebonheart.EbonArtsMod.common.blocks.basic.bricks;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.blocks.BlockHelperOLDOLDOLD;
import com.ebonheart.EbonArtsMod.common.blocks.basic.BlockRockEA;


public class EABlockBrick extends BlockRockEA {

	public EABlockBrick(String unlocalizedName) 
	{
		super();
		
		this.setBlockName(unlocalizedName);
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
