package com.ebonheart.EbonArtsMod.common.blocks.basic.slabs;

import net.minecraft.item.Item;

//Double slab.
public class BlockDoubleSlabNecrocite extends EABlockSlabNecrocite {
	
    public BlockDoubleSlabNecrocite(String setUnlocalizedName) 
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
