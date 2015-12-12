/**
 * Copyright (C) Jon Rowlett. All rights reserved.
 */
package com.ebonheart.EbonArtsMod.common.blocks.basic;

import net.minecraft.item.Item;

/**
 * Regular slab of stained bricks.
 */
public class BlockHalfSlab extends EABlockSlab {
	
    public BlockHalfSlab(String unlocalizedName) 
    {
        super();
        this.setUnlocalizedName(unlocalizedName);
    }

    @Override
    public final boolean isDouble() 
    {
        return false;
    }
}
