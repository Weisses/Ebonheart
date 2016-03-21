package com.ebonheart.EbonArtsMod.common.items.tools;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemAxe;
//import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ItemArcaniteAxe extends ItemAxe {
	
	public ItemArcaniteAxe(String unlocalizedName, ToolMaterial material) 
	{
		//super(material);
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}
	
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
	{
		return InitItemsEA.arcanite == par2ItemStack.getItem() ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
	}
	
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.UNCOMMON;
    }
}