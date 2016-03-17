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
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemEnchantedEbonheart extends Item {
	
	public ItemEnchantedEbonheart() 
	{
		this.setUnlocalizedName("gem/enchanted_ebonheart");
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
		this.setMaxStackSize(64);
	}
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) 
	{
		toolTip.add(EnumChatFormatting.DARK_AQUA + "A powerful item containing ancient knowledge.");
		toolTip.add(EnumChatFormatting.DARK_AQUA + "Hold " + EnumChatFormatting.WHITE + "[Shift + Right-Click]" + EnumChatFormatting.DARK_AQUA + " to throw this");
		toolTip.add(EnumChatFormatting.DARK_AQUA + "item and unleash the experience within.");
	}
	
	@SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack)
    {
        return true;
    }
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World worldIn, EntityPlayer playerIn)
    {
		if(playerIn.isSneaking())
		{
			if (!playerIn.capabilities.isCreativeMode)
	        {
	            --stack.stackSize;
	        }

	        worldIn.playSoundAtEntity(playerIn, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

	        if (!worldIn.isRemote)
	        {
	            worldIn.spawnEntityInWorld(new EntityEnchantedEbonheart(worldIn, playerIn));
	        }
	        return stack;
		}
        return stack;
    }
	
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.RARE;
    }
	
}
