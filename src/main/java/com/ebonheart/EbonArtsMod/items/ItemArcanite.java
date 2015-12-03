package com.ebonheart.EbonArtsMod.items;

import java.util.List;

import com.ebonheart.EbonArtsMod.EbonArtsMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemArcanite extends Item 
{

	public ItemArcanite(String unlocalizedName)
	{
		super();
		this.setUnlocalizedName("gem/item_arcanite");
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}
	
	
	
}
