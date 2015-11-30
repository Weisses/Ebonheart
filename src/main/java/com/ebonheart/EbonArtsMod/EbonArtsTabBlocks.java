package com.ebonheart.EbonArtsMod;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.ebonheart.EbonArtsMod.init.EbonArtsBlocks;
import com.ebonheart.EbonArtsMod.init.EbonArtsItems;

public class EbonArtsTabBlocks extends CreativeTabs {

	public EbonArtsTabBlocks(String label) {
		super(label);
		this.setBackgroundImageName("ebonarts.png");
	}

	
	@Override
	public Item getTabIconItem() {
		
		return Item.getItemFromBlock(EbonArtsBlocks.arcanite_block);
	
	}

}