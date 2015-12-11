package com.ebonheart.EbonArtsMod.common.blocks;

import net.minecraft.item.Item;

public class TestDoubleSlab extends BlockStainedBrickSlab {

	public TestDoubleSlab() {
		
		this.setUnlocalizedName("double_stained_bricks_slab_black");
	}

	@Override
	public void registerInventoryModel(Item item, String id, int metadata) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addModelBakeryVariant(Item item, String variantName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isDouble() {
		// TODO Auto-generated method stub
		return true;
	}

}
