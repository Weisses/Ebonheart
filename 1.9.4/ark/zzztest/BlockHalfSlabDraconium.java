package com.ebonheart.EbonArtsMod.common.blocks.basic.slabs;


//Regular slab.
public class BlockHalfSlabDraconium extends EABlockSlabDraconium {
	
    public BlockHalfSlabDraconium(String unlocalizedName) 
    {
        super();
        //BlockHelper.setBlockName(this, unlocalizedName);
        
        this.setUnlocalizedName(unlocalizedName);
    }

    @Override
    public final boolean isDouble() 
    {
        return false;
    }
}
