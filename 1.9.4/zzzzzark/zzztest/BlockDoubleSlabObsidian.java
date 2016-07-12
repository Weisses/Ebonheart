package com.ebonheart.EbonArtsMod.common.blocks.basic.slabs;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

//Double slab.
public class BlockDoubleSlabObsidian extends EABlockSlabObsidian {
	
    public BlockDoubleSlabObsidian(String setUnlocalizedName) 
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
