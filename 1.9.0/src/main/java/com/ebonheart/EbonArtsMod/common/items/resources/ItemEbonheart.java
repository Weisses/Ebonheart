package com.ebonheart.EbonArtsMod.common.items.resources;

import java.util.List;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.entity.EntityEnchantedEbonheart;

import net.minecraft.entity.item.EntityExpBottle;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemEbonheart extends Item {
	
	public ItemEbonheart() 
	{
		this.setUnlocalizedName("gem/ebonheart");
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
		this.setMaxStackSize(64);
	}
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) 
	{
		toolTip.add(TextFormatting.DARK_AQUA + "The heart of lost knowledge.");
		//toolTip.add(EnumChatFormatting.DARK_AQUA + "Hold " + EnumChatFormatting.WHITE + "[Shift + Right-Click]" + EnumChatFormatting.DARK_AQUA + " to throw this");
		//toolTip.add(EnumChatFormatting.DARK_AQUA + "item and unleash the experience within.");
	}
	
	
	
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.RARE;
    }
	
}
