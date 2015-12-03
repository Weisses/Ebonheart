package com.ebonheart.EbonArtsMod.api;

import net.minecraft.item.ItemStack;

public interface IMetaBlockName {
	
    String getSpecialName(ItemStack stack);
}