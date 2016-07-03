package com.ebonheart.EbonArtsMod.common.utils.meta;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockMeta extends ItemBlock {
	
	public ItemBlockMeta(Block block) 
	{
    	super(block);
    	if (!(block instanceof IMetaBlockName)) 
    	{
    		throw new IllegalArgumentException(String.format("The given Block %s is not an instance of ISpecialBlockName, so says Viesis!", block.getUnlocalizedName()));
    	}
    	this.setMaxDamage(0);
    	this.setHasSubtypes(true);
	}
	
	public int getMetadata(int damage)
	{
		return damage;
	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack) 
	{
		return super//.getRegistryName().toString()
				.getUnlocalizedName(stack)
				+ "." + ((IMetaBlockName)this.block).getSpecialName(stack);
	}
}
