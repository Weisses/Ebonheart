package com.ebonheart.EbonArtsMod.common.items.tools;

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
