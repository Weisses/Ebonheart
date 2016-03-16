package com.ebonheart.EbonArtsMod.common.items.resources;

import java.util.List;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.items.ItemMusicDiscEA;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemMirroringDisc extends ItemMusicDiscEA {
	
	public ItemMirroringDisc(String name, String music) 
	{
		//super(music, music);
		super(music, music);
		this.setUnlocalizedName("disc/mirroring_disc");
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) 
	{
		toolTip.add(EnumChatFormatting.DARK_AQUA + "Use this item to craft other");
		toolTip.add(EnumChatFormatting.DARK_AQUA + "vanilla discs, also plays the");
		toolTip.add(EnumChatFormatting.DARK_AQUA + "archived record, \"" + this.getRecordNameLocal() + "\".");
	}
	
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.RARE;
    }
	
}
