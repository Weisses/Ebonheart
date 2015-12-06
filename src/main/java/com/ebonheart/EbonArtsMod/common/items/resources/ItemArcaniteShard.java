package com.ebonheart.EbonArtsMod.common.items.resources;

import java.util.List;

import com.ebonheart.EbonArtsMod.EbonArtsMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemArcaniteShard extends Item 
{

	public ItemArcaniteShard(String unlocalizedName)
	{
		super();
		this.setUnlocalizedName("gem/arcanite_shard");
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}
	
	
	
}
