package com.ebonheart.EbonArtsMod.common.items.resources;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.items.ItemHelper;
import com.mojang.realmsclient.gui.ChatFormatting;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemVelious extends Item {
	
	public ItemVelious() 
	{
		this.setUnlocalizedName("gems/velious");
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) 
	{
		toolTip.add(ChatFormatting.GOLD + "A subtle chill emanates from");
		toolTip.add(ChatFormatting.GOLD + "the core of this crystal.");
	}
	
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.uncommon;
    }
	
}
