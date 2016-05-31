package com.ebonheart.EbonArtsMod.common.blocks.basic.slabs;

import com.ebonheart.EbonArtsMod.EbonArtsMod;


//Regular slab.
public class BlockHalfSlab extends EABlockSlab {
	
    public BlockHalfSlab(boolean bool, String unlocalizedName) 
    {
        super(bool);
        
        this.setBlockName(unlocalizedName);
        this.setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
    }
    
}
