package com.ebonheart.EbonArtsMod.items;

import com.ebonheart.EbonArtsMod.EbonArtsMod;

import net.minecraft.item.ItemSword;

public class ItemArcaniteSword extends ItemSword 
{

	public ItemArcaniteSword(ToolMaterial material) 
	{
		super(material);
		this.setUnlocalizedName("tool/arcanite_sword");
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}

}
