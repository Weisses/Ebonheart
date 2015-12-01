package com.ebonheart.EbonArtsMod.items;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemArcanite extends Item {

	public ItemArcanite()
	{
		this.setHasSubtypes(true);
        this.setMaxDamage(0);
        //this.setCreativeTab(CreativeTabs.tabMaterials);
		
		
	}
	
	@SideOnly(Side.CLIENT)
    public void getSubItems(Item itemIn, CreativeTabs tab, List subItems)
    {
        subItems.add(new ItemStack(itemIn, 1, 0));
        subItems.add(new ItemStack(itemIn, 1, 1));
    }
	
	
	
}
