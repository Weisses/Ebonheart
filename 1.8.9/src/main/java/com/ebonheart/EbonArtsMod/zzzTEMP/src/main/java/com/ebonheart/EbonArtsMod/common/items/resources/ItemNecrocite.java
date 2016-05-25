package com.ebonheart.EbonArtsMod.common.items.resources;

import java.util.List;

import com.ebonheart.EbonArtsMod.EbonArtsMod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemNecrocite extends Item {
	
	public ItemNecrocite() 
	{
		this.setUnlocalizedName("gem/necrocite");
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) 
	{
		toolTip.add(EnumChatFormatting.DARK_AQUA + "Death and decay flows from");
		toolTip.add(EnumChatFormatting.DARK_AQUA + "this cursed gemstone.");
	}
	
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.RARE;
    }
	
}
