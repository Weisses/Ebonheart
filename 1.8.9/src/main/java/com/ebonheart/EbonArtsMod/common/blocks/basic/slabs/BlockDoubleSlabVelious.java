package com.ebonheart.EbonArtsMod.common.blocks.basic.slabs;

import net.minecraft.item.Item;

//Double slab.
public class BlockDoubleSlabVelious extends EABlockSlabVelious {
	
    public BlockDoubleSlabVelious(String setUnlocalizedName) 
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
