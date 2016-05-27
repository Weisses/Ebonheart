package com.ebonheart.EbonArtsMod.common.items.resources;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.world.World;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.entity.EntityEnchantedEbonheart;
import com.ebonheart.EbonArtsMod.common.items.ItemHelper;
import com.mojang.realmsclient.gui.ChatFormatting;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemEnchantedEbonheart extends Item {
	
	public ItemEnchantedEbonheart() 
	{
		//ItemHelper.setItemName(this, "gem/enchanted_ebonheart");
		this.setUnlocalizedName("gems/enchanted_ebonheart");
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
		this.setMaxStackSize(16);
		//this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) 
	{
		toolTip.add(ChatFormatting.DARK_AQUA + "A powerful item containing ancient knowledge.");
		toolTip.add(ChatFormatting.DARK_AQUA + "Hold " + ChatFormatting.WHITE + "[Shift + Right-Click]" + ChatFormatting.DARK_AQUA + " to throw this");
		toolTip.add(ChatFormatting.DARK_AQUA + "item and unleash the experience within.");
	}
	
	@SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack)
    {
        return true;
    }
	
	
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn)
    {
		if(playerIn.isSneaking())
		{
			if (!playerIn.capabilities.isCreativeMode)
			{
				--itemStackIn.stackSize;
			}

			worldIn.playSoundAtEntity(playerIn, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

			if (!worldIn.isRemote)
			{
				//EntityEnchantedEbonheart
        	
				worldIn.spawnEntityInWorld(new EntityEnchantedEbonheart(worldIn, playerIn));
				
				//EntityEnchantedEbonheart entityenchantedebonheart = new EntityEnchantedEbonheart(worldIn, playerIn);
				//entityenchantedebonheart.setHeadingFromThrower(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, -20.0F, 0.7F, 1.0F);
				//worldIn.spawnEntityInWorld(entityenchantedebonheart);
        	
        	//EntityExpBottle entityexpbottle = new EntityExpBottle(worldIn, playerIn);
            //entityexpbottle.func_184538_a(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, -20.0F, 0.7F, 1.0F);
            //worldIn.spawnEntityInWorld(entityexpbottle);
			}

			playerIn.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);
			return itemStackIn;
		}
		return itemStackIn;
    }
	
	//@Override
	//public ItemStack onItemRightClick(ItemStack stack, World worldIn, EntityPlayer playerIn)
    //{
	//	if(playerIn.isSneaking())
	//	{
	//		if (!playerIn.capabilities.isCreativeMode)
	//        {
	//            --stack.stackSize;
	//        }

	//        worldIn.playSoundAtEntity(playerIn, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

	//        if (!worldIn.isRemote)
	//        {
	//            worldIn.spawnEntityInWorld(new EntityEnchantedEbonheart(worldIn, playerIn));
	//        }
	//        return stack;
	//	}
    //    return stack;
    //}
	
	//@Override
	//public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    //{
    //    IBlockState iblockstate = worldIn.getBlockState(pos);

    //    if (iblockstate.getBlock() == Blocks.jukebox && !((Boolean)iblockstate.getValue(BlockJukebox.HAS_RECORD)).booleanValue())
    //    {
    //        if (!worldIn.isRemote)
    //        {
    //            ((BlockJukebox)Blocks.jukebox).insertRecord(worldIn, pos, iblockstate, stack);
    //            worldIn.playAuxSFXAtEntity((EntityPlayer)null, 1010, pos, Item.getIdFromItem(this));
    //            --stack.stackSize;
    //            playerIn.addStat(StatList.recordPlayed);
    //        }

    //        return EnumActionResult.SUCCESS;
    //    }
    //    else
    //    {
    ///        return EnumActionResult.PASS;
    //    }
    //}
	
	
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.rare;
    }
	
}
