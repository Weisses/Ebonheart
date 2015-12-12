/**
 * Copyright (C) Jon Rowlett. All rights reserved.
 */
package com.ebonheart.EbonArtsMod.common.blocks.basic;

import net.minecraft.item.Item;

/**
 * Double slab of stained bricks.
 */
public class BlockDoubleSlab extends EABlockSlab {
	
    public BlockDoubleSlab(String setUnlocalizedName) 
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
