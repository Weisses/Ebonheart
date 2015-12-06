package com.ebonheart.EbonArtsMod.common.items.tools;

import com.ebonheart.EbonArtsMod.EbonArtsMod;

import net.minecraft.item.ItemSpade;

public class ItemArcaniteShovel extends ItemSpade 
{

	public ItemArcaniteShovel(ToolMaterial material) 
	{
		super(material);
		this.setUnlocalizedName("tool/arcanite_shovel");
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}

}
