package com.ebonheart.EbonArtsMod.items;

import com.ebonheart.EbonArtsMod.EbonArtsMod;

import net.minecraft.item.ItemArmor;

public class ItemArmorArcanite extends ItemArmor {

	public ItemArmorArcanite(ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}

}
