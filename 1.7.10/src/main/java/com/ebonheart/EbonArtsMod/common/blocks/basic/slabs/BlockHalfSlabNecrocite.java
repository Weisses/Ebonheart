package com.ebonheart.EbonArtsMod.common.blocks.basic.slabs;

import com.ebonheart.EbonArtsMod.EbonArtsMod;

//Regular slab.
public class BlockHalfSlabNecrocite extends EABlockSlabNecrocite {
	
    public BlockHalfSlabNecrocite(boolean bool, String unlocalizedName) 
    {
        super(bool);
        this.setBlockName(unlocalizedName);
        this.setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
    }

    //@Override
    //public final boolean isDouble() 
    //{
    //    return false;
    //}

}
