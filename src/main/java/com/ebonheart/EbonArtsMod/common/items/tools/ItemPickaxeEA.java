package com.ebonheart.EbonArtsMod.common.items.tools;

import com.ebonheart.EbonArtsMod.EbonArtsMod;

import net.minecraft.item.ItemPickaxe;

public class ItemPickaxeEA extends ItemPickaxe 
{

	public ItemPickaxeEA(ToolMaterial material, String unlocalizedName) 
	{
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);

	}

}
