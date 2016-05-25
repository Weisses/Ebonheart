package com.ebonheart.EbonArtsMod.common.blocks.basic.slabs;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSlab;

//Wrapper around ItemSlab to allow init from GameRegistry.
public class ItemBlockSlabEbonheart extends ItemSlab {
    /**
     * Initializes a new instance of the ItemBlockSlab class.
     * @param block the block behind the item.
     * @param slab the half height slab.
     * @param doubleSlab the full height slab.
     * @param stacked whether or not the block is the stacked version.
     */
    public ItemBlockSlabEbonheart(final Block block, final BlockHalfSlabEbonheart slab, final BlockDoubleSlabEbonheart doubleSlab, final Boolean stacked) 
    {
        super(block, slab, doubleSlab);
    }
}
