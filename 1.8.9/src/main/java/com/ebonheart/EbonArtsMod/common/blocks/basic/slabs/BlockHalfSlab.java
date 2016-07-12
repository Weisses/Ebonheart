package com.ebonheart.EbonArtsMod.common.blocks.basic.slabs;


//Regular slab.
public class BlockHalfSlab extends EABlockSlab {
	
    public BlockHalfSlab(String unlocalizedName) 
    {
        super();
        this.setUnlocalizedName(unlocalizedName);
    }

    @Override
    public final boolean isDouble() 
    {
        return false;
    }
}
