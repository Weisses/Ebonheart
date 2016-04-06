package com.ebonheart.EbonArtsMod.common.items;

import com.ebonheart.EbonArtsMod.EbonArtsMod;

import net.minecraft.item.Item;

public class ItemHelper extends Item {

	public ItemHelper(String itemName) {
		setItemName(this, itemName);
		//setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}

	/**
	 * Set the registry name of {@code item} to {@code itemName} and the unlocalised name to the full registry name.
	 *
	 * @param item     The item
	 * @param itemName The item's name
	 */
	public static void setItemName(Item item, String itemName) {
		item.setRegistryName(itemName);
		item.setUnlocalizedName(item.getRegistryName().toString());
		item.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}
	
}
