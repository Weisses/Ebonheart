package com.ebonheart.EbonArtsMod.common.blocks.basic.slabs;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

//Double slab.
public class BlockDoubleSlabDraconium extends EABlockSlabDraconium {
	
    public BlockDoubleSlabDraconium(String setUnlocalizedName) 
    {
        super();
        this.setUnlocalizedName(setUnlocalizedName);
    }

	@Override
	public boolean isDouble() 
	{
		return true;
	}

	@Override
	public Comparable<?> getTypeForItem(ItemStack stack) {
		// TODO Auto-generated method stub
		return null;
	}
}
