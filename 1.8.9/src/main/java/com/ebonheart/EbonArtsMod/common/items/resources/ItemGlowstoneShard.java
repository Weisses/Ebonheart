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

public class ItemGlowstoneShard extends Item {
	
	public ItemGlowstoneShard() 
	{
		this.setUnlocalizedName("gem/glowstone_shard");
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) 
	{
		toolTip.add(EnumChatFormatting.GOLD + "Crystalline imbued pieces");
		toolTip.add(EnumChatFormatting.GOLD + "of Glowstone.");
	}
	
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.UNCOMMON;
    }
	
}
