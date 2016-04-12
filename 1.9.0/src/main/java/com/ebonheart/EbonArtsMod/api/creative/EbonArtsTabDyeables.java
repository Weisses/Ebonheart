package com.ebonheart.EbonArtsMod.api.creative;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.ebonheart.EbonArtsMod.init.InitBlocksEA;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;
import com.ebonheart.EbonArtsMod.references.BlocksEA;

public class EbonArtsTabDyeables extends CreativeTabs {

	public EbonArtsTabDyeables(String label) 
	{
		super(label);
		this.setBackgroundImageName("ebonarts.png");
	}

	@Override
	public Item getTabIconItem() 
	{
		return Item.getItemFromBlock(BlocksEA.mystic_block_glass);
	}
}
