package com.ebonheart.EbonArtsMod.common.items.resources;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.items.ItemHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDraconiumDust extends Item {
	
	public ItemDraconiumDust() 
	{
		this.setUnlocalizedName("gems/draconium_dust");
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
		//ItemHelper.setItemName(this, "gem/draconium_dust");
	}
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) 
	{
		toolTip.add("Dragon blood is said to imbue this");
		toolTip.add("dust with unique properties.");
	}
	
}
