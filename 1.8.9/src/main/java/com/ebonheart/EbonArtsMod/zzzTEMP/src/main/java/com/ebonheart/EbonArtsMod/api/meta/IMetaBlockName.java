package com.ebonheart.EbonArtsMod.api.meta;

import net.minecraft.item.ItemStack;

public interface IMetaBlockName {
	
    String getSpecialName(ItemStack stack);
}