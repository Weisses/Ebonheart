package com.ebonheart.EbonArtsMod.common.items.resources;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.sound.SoundEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.mojang.realmsclient.gui.ChatFormatting;

public class ItemMirroringDisc extends ItemMusicDiscEA {

	public ItemMirroringDisc(String unlocalizedName, String soundIn) 
	{
		super(unlocalizedName, soundIn);

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
        return EnumRarity.RARE;
    }
	
}
