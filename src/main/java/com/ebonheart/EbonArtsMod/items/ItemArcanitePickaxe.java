package com.ebonheart.EbonArtsMod.items;

import com.ebonheart.EbonArtsMod.EbonArtsMod;

import net.minecraft.item.ItemPickaxe;

public class ItemArcanitePickaxe extends ItemPickaxe 
{

	public ItemArcanitePickaxe(ToolMaterial material) 
	{
		super(material);
		this.setUnlocalizedName("tool/arcanite_pickaxe");
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);

	}

}
