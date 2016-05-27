package com.ebonheart.EbonArtsMod.common.items;

import net.minecraft.item.Item;

import com.ebonheart.EbonArtsMod.EbonArtsMod;

public class ItemHelper extends Item {

	public ItemHelper() 
	{
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
		//setItemName(this, itemName);
		
	}

	//Set the registry name of {@code block} to {@code blockName} 
	//and the unlocalised name to the full registry name.
	//public static void setItemName(Item item, String itemName) 
	//{
		//item.setUnlocalizedName(itemName);
		//item.setUnlocalizedName(item.getRegistryName().toString());
	//	item.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	//}
	
}
