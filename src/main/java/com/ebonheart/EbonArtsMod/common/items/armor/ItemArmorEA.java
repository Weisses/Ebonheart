package com.ebonheart.EbonArtsMod.common.items.armor;

import com.ebonheart.EbonArtsMod.EbonArtsMod;

import net.minecraft.item.ItemArmor;

public class ItemArmorEA extends ItemArmor 
{

	public ItemArmorEA(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) 
	{
		super(material, renderIndex, armorType);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}

}
