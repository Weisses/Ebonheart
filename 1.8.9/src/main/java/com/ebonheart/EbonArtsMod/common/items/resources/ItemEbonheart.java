package com.ebonheart.EbonArtsMod.common.items.resources;

import java.util.List;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.entity.EntityEbonheart;

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

public class ItemEbonheart extends Item {
	
	public ItemEbonheart() {
		
	 this.setUnlocalizedName("gem/ebonheart");
	 this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	 this.setMaxStackSize(16);
	 
	}
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) {
		toolTip.add("The heart of lost knowledge.");
		toolTip.add("Hold shift to unleash the");
		toolTip.add("experience within.");
		
	}
	
	@SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack)
    {
        return true;
    }
	
	
	//@Override
	//public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
	//{
	//	if(!playerIn.isSneaking())
	//	{
	//		if(stack.getTagCompound() == null)
	//		{
	//			stack.setTagCompound(new NBTTagCompound());
	//		}
	//		NBTTagCompound nbt = new NBTTagCompound();
	//		nbt.setInteger("dim", playerIn.dimension);
	//		nbt.setInteger("posX", pos.getX());
	//		nbt.setInteger("posY", pos.getY());
	//		nbt.setInteger("posZ", pos.getZ());
	//		stack.getTagCompound().setTag("coords", nbt);
	//		stack.setStackDisplayName(EnumChatFormatting.DARK_PURPLE + "Coordinate Cache");
	//	}
	//	return false;
	//}
	
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
	            worldIn.spawnEntityInWorld(new EntityEbonheart(worldIn, playerIn));
	        }

	        //playerIn.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);
	        return stack;
		}
        return stack;
    }
	
	
	
	
	
	
	
	
    //public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn)
    //{
    //    if (!playerIn.capabilities.isCreativeMode)
    //    {
    //        --itemStackIn.stackSize;
    //    }

    //    worldIn.playSoundAtEntity(playerIn, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

    //    if (!worldIn.isRemote)
    //    {
    //        worldIn.spawnEntityInWorld(new EntityEbonheart(worldIn, playerIn));
    //    }

        //playerIn.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);
    //    return itemStackIn;
    //}
	

	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.EPIC;
    }
	
}
