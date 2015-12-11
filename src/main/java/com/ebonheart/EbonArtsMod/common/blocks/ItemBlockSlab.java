package com.ebonheart.EbonArtsMod.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;

public class ItemBlockSlab extends ItemSlab {

	public ItemBlockSlab(
	        final Block block,
	        final TestSlab slab,
	        final TestDoubleSlab doubleSlab,
	        final Boolean stacked) {
	        super(block, slab, doubleSlab);
	    }

}
