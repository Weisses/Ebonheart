package com.ebonheart.EbonArtsMod.items;

import com.ebonheart.EbonArtsMod.EbonArtsMod;

import net.minecraft.item.ItemAxe;

public class ItemArcaniteAxe extends ItemAxe {

	public ItemArcaniteAxe(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName("tool/arcanite_axe");
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}

}
