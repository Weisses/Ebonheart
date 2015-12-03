package com.ebonheart.EbonArtsMod.api;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.ebonheart.EbonArtsMod.init.InitBlocksEA;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;

public class EbonArtsTabBlocks extends CreativeTabs {

	public EbonArtsTabBlocks(String label) {
		super(label);
		this.setBackgroundImageName("ebonarts.png");
	}

	
	@Override
	public Item getTabIconItem() {
		
		return Item.getItemFromBlock(InitBlocksEA.arcanite_block_normal);
	
	}

}