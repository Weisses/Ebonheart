package com.ebonheart.EbonArtsMod.common.utils.creative;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.ebonheart.EbonArtsMod.init.InitItemsEA;

public class EbonArtsTabItems extends CreativeTabs {

	public EbonArtsTabItems(String label) 
	{
		super(label);
		this.setBackgroundImageName("ebonarts.png");
	}

	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(InitItemsEA.necrocite);
	}
}
