/**
 * Copyright (C) Jon Rowlett. All rights reserved.
 */
package com.ebonheart.EbonArtsMod.common.blocks;

import net.minecraft.item.Item;

/**
 * Double slab of stained bricks.
 * @author jrowlett
 *
 */
public class BlockDoubleStainedBrickSlab extends BlockStainedBrickSlab {
    /**
     * Initializes a new instance of the BlockDoubleStainedBrickSlab class.
     * @param brickColor the brick color.
     */
    public BlockDoubleStainedBrickSlab(
    		//final int brickColor
    		) {
        super(
        		//brickColor
        		);
        setUnlocalizedName("double_stained_bricks_slab_black");
    }

	@Override
	public boolean isDouble() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void registerInventoryModel(Item item, String id, int metadata) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addModelBakeryVariant(Item item, String variantName) {
		// TODO Auto-generated method stub
		
	}

    /**
     * Gets whether or not this is a double stacked slab.
     * @return always true.
     */
    
}
