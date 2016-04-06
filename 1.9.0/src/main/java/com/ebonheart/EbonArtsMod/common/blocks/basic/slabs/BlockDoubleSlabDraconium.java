package com.ebonheart.EbonArtsMod.common.blocks.basic.slabs;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.blocks.BlockHelper;

import net.minecraft.block.BlockStoneSlab;
import net.minecraft.block.BlockSlab.EnumBlockHalf;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

//Double slab.
public class BlockDoubleSlabDraconium extends EABlockSlabDraconium {
	
    public BlockDoubleSlabDraconium(String unlocalizedName) 
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
