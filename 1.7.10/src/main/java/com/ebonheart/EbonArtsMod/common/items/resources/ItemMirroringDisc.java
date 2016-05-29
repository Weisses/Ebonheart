package com.ebonheart.EbonArtsMod.common.items.resources;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.mojang.realmsclient.gui.ChatFormatting;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemMirroringDisc extends ItemMusicDiscEA {
	
	public ItemMirroringDisc(String unlocalizedName, String soundIn) 
	{
		super(unlocalizedName);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) 
	{
		toolTip.add(ChatFormatting.DARK_AQUA + "Use this item to craft other");
		toolTip.add(ChatFormatting.DARK_AQUA + "vanilla discs, also plays the");
		toolTip.add(ChatFormatting.DARK_AQUA + "archived record, \"" + this.getRecordNameLocal() + "\".");
	}
	
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.rare;
    }
	
}
