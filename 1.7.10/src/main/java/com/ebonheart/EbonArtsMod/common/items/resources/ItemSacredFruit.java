package com.ebonheart.EbonArtsMod.common.items.resources;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.items.ItemHelper;
import com.ebonheart.EbonArtsMod.init.InitBlocksEA;
import com.mojang.realmsclient.gui.ChatFormatting;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemSacredFruit extends ItemFood implements IPlantable {
	
	public ItemSacredFruit(int healAmount, float saturation) 
	{
		super(healAmount, saturation, false);
		//ItemHelper.setItemName(this, "plant/sacred_fruit");
		this.setUnlocalizedName("plants/sacred_fruit");
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}
	
	public boolean onItemUse(ItemStack p_77648_1_, EntityPlayer p_77648_2_, World p_77648_3_, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_)
    {
		
		if (p_77648_7_ != 1)
        {
            return false;
        }
        else if (p_77648_2_.canPlayerEdit(p_77648_4_, p_77648_5_, p_77648_6_, p_77648_7_, p_77648_1_) && p_77648_2_.canPlayerEdit(p_77648_4_, p_77648_5_ + 1, p_77648_6_, p_77648_7_, p_77648_1_))
        {
            if (p_77648_3_.getBlock(p_77648_4_, p_77648_5_, p_77648_6_).canSustainPlant(p_77648_3_, p_77648_4_, p_77648_5_, p_77648_6_, ForgeDirection.UP, this) && p_77648_3_.isAirBlock(p_77648_4_, p_77648_5_ + 1, p_77648_6_))
            {
            	if(p_77648_3_.isRemote)
            	{
            		int amount = 20;

            		for (int i = 0; i < amount; ++i)
                    {
                        double d0 = itemRand.nextGaussian() * 0.02D;
                        double d1 = itemRand.nextGaussian() * 0.02D;
                        double d2 = itemRand.nextGaussian() * 0.02D;
                        p_77648_3_.spawnParticle("reddust", 
                        		(double)((float)p_77648_4_ + itemRand.nextFloat()), 
                        		(double)p_77648_5_ + (double)itemRand.nextFloat()  + 0.75, 
                        		(double)((float)p_77648_6_ + itemRand.nextFloat()), 
                        		d0, d1, d2);
                        
                    }
            	}
                p_77648_3_.setBlock(p_77648_4_, p_77648_5_ + 1, p_77648_6_, InitBlocksEA.sacred_fruit);
                --p_77648_1_.stackSize;
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
		
	//public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
    //{
    //public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    //{
        //net.minecraft.block.state.IBlockState state = worldIn.getBlockState(pos);
        //if (side == EnumFacing.UP && playerIn.canPlayerEdit(pos.offset(side), side, stack) && state.getBlock().canSustainPlant(worldIn, pos, EnumFacing.UP, this) && worldIn.isAirBlock(pos.up()))
        //{
        	
        	
        	//p_77648_3_.setBlockState(pos.up(), InitBlocksEA.dragon_fruit, 11);
            //--stack.stackSize;
            //return true;
        //}
        //else
        //{
        //    return false;
        //}
    }
	
	
	
	
	
    //-------------------------------------------------------------------//
	 
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) 
	{
    	toolTip.add(ChatFormatting.DARK_AQUA + "A divine fruit that");
		toolTip.add(ChatFormatting.DARK_AQUA + "keeps you going.");
	}
	
    //@SideOnly(Side.CLIENT)
    //public boolean hasEffect(ItemStack stack)
    //{
    //    return true;
    //}
    
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.rare;
    }
	@Override
	public EnumPlantType getPlantType(IBlockAccess world, int x, int y, int z) {
		// TODO Auto-generated method stub
		return net.minecraftforge.common.EnumPlantType.Crop;
	}
	@Override
	public Block getPlant(IBlockAccess world, int x, int y, int z) {
		// TODO Auto-generated method stub
		return InitBlocksEA.sacred_fruit;
	}
	@Override
	public int getPlantMetadata(IBlockAccess world, int x, int y, int z) {
		// TODO Auto-generated method stub
		return 0;
	}
}
