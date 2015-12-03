package com.ebonheart.EbonArtsMod.items;

import com.ebonheart.EbonArtsMod.EbonArtsMod;

import net.minecraft.item.ItemHoe;

public class ItemArcaniteHoe extends ItemHoe 
{

	public ItemArcaniteHoe(ToolMaterial material) 
	{
		super(material);
		this.setUnlocalizedName("tool/arcanite_hoe");
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}

}
