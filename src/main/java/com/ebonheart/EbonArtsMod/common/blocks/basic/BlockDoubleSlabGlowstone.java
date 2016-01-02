package com.ebonheart.EbonArtsMod.common.blocks.basic;

import net.minecraft.item.Item;

//Double slab.
public class BlockDoubleSlabGlowstone extends EABlockSlabGlowstone {
	
    public BlockDoubleSlabGlowstone(String setUnlocalizedName) 
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
