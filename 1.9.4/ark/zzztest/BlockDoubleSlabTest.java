package com.ebonheart.EbonArtsMod.zzztest;

import com.ebonheart.EbonArtsMod.common.blocks.BlockHelper;

import net.minecraft.block.properties.IProperty;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

//Double slab.
public class BlockDoubleSlabTest extends BlockPurpurSlab {
	
    public BlockDoubleSlabTest(String unlocalizedName) 
    {
        super();
        BlockHelper.setBlockName(this, unlocalizedName);
        //this.setUnlocalizedName(setUnlocalizedName);
    }

	@Override
	public boolean isDouble() 
	{
		return true;
	}
	
	
}
