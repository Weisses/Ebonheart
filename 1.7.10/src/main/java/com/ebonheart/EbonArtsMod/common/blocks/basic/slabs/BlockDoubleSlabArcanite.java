package com.ebonheart.EbonArtsMod.common.blocks.basic.slabs;


//Double slab.
public class BlockDoubleSlabArcanite extends EABlockSlabArcanite {
	
    public BlockDoubleSlabArcanite(String setUnlocalizedName) 
    {
        super();
        this.setUnlocalizedName(setUnlocalizedName);
    }

	@Override
	public boolean isDouble() 
	{
		return true;
	}
}
