package com.ebonheart.EbonArtsMod.common.items.resources;

import java.util.List;

import com.ebonheart.EbonArtsMod.EbonArtsMod;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemVelious extends Item {
	
	public ItemVelious() {
		
	 this.setUnlocalizedName("gem/velious");
	 this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	 
	}
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) {
		toolTip.add("A subtle chill radiates from");
		toolTip.add("the core of this crystal.");
		
	}
}
