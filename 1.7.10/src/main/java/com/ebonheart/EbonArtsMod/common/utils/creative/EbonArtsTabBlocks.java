package com.ebonheart.EbonArtsMod.common.utils.creative;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.ebonheart.EbonArtsMod.api.BlocksEA;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EbonArtsTabBlocks extends CreativeTabs {

	public EbonArtsTabBlocks(String label) 
	{
		super(label);
		this.setBackgroundImageName("ebonarts.png");
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getTabIconItem() 
	{
		return Item.getItemFromBlock(BlocksEA.soularite_block);
	}
}
