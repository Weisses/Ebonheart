package com.ebonheart.EbonArtsMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.ebonheart.EbonArtsMod.init.EbonArtsItems;

public class EbonArtsTabItems extends CreativeTabs {

	public EbonArtsTabItems(String label) {
		super(label);
		this.setBackgroundImageName("ebonarts.png");
	}

	@Override
	public Item getTabIconItem() {
		
		return EbonArtsItems.ebon_sigil;
	}

}