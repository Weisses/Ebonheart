/**
 * Copyright (C) Jon Rowlett. All rights reserved.
 */
package com.ebonheart.EbonArtsMod.common.blocks;

import net.minecraft.item.Item;

/**
 * Regular slab of stained bricks.
 * @author jrowlett
 *
 */
public class BlockHalfStainedBrickSlab extends BlockStainedBrickSlab {
    /**
     * Initializes a new instance of the BlockHalfStainedBrickSlab class.
     * @param brickColor the brick color.
     */
    public BlockHalfStainedBrickSlab(
    		//final int brickColor
    		) {
        super(
        		//brickColor
        		);
    }

    /**
     * Gets whether or not this is double height.
     * @return always false.
     */
    @Override
    public final boolean isDouble() {
        return false;
    }

	@Override
	public void registerInventoryModel(Item item, String id, int metadata) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addModelBakeryVariant(Item item, String variantName) {
		// TODO Auto-generated method stub
		
	}

	
}
