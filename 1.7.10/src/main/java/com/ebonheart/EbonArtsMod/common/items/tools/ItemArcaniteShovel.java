package com.ebonheart.EbonArtsMod.common.items.tools;

import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.items.ItemHelper;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;

public class ItemArcaniteShovel extends ItemSpade {
	
	public ItemArcaniteShovel(ToolMaterial material) 
	{
		super(material);
		//ItemHelper.setItemName(this, "tool/arcanite_shovel");
		this.setUnlocalizedName("tools/arcanite_shovel");
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}
	
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
	{
		return InitItemsEA.arcanite == par2ItemStack.getItem() ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
	}
	
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.uncommon;
    }
	
}
