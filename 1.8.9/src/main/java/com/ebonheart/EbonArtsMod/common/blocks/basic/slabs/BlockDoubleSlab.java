package com.ebonheart.EbonArtsMod.common.blocks.basic.slabs;


//Double slab.
public class BlockDoubleSlab extends EABlockSlab {
	
    public BlockDoubleSlab(String unlocalizedName) 
    {
        super();
        this.setUnlocalizedName(unlocalizedName);
    }

	@Override
	public boolean isDouble() 
	{
		return true;
	}
}
