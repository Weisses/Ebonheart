package com.ebonheart.ebonarts;

import com.ebonheart.ebonarts.init.EbonArtsItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class EbonArtsTab extends CreativeTabs {

	public EbonArtsTab(String label) {
		super(label);
		this.setBackgroundImageName("ebonarts.png");
	}

	@Override
	public Item getTabIconItem() {
		return EbonArtsItems.ebon_sigil;
	}

}
