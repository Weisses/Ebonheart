package com.ebonheart.EbonArtsMod.common.items.resources;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;

import com.ebonheart.EbonArtsMod.common.items.ItemHelper;
import com.ebonheart.EbonArtsMod.init.InitBlocksEA;
import com.mojang.realmsclient.gui.ChatFormatting;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDragonFruit extends ItemFood implements IPlantable {
	
	public ItemDragonFruit(int healAmount, float saturation) 
	{
		super(healAmount, saturation, true);
		ItemHelper.setItemName(this, "plant/dragon_fruit");
		
	}
	/**
     * Called when a Block is right-clicked with this Item
     */
	public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
    {
    //public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    //{
        net.minecraft.block.state.IBlockState state = worldIn.getBlockState(pos);
        if (side == EnumFacing.UP && playerIn.canPlayerEdit(pos.offset(side), side, stack) && state.getBlock().canSustainPlant(worldIn, pos, EnumFacing.UP, this) && worldIn.isAirBlock(pos.up()))
        {
        	if(worldIn.isRemote)
        	{
        		int amount = 20;

        		for (int i = 0; i < amount; ++i)
                {
                    double d0 = itemRand.nextGaussian() * 0.02D;
                    double d1 = itemRand.nextGaussian() * 0.02D;
                    double d2 = itemRand.nextGaussian() * 0.02D;
                    worldIn.spawnParticle(EnumParticleTypes.PORTAL, 
                    		(double)((float)pos.getX() + itemRand.nextFloat()), 
                    		(double)pos.getY() + (double)itemRand.nextFloat()  + 0.75, 
                    		(double)((float)pos.getZ() + itemRand.nextFloat()), 
                    		d0, d1, d2, new int[0]);
                }
        	}
        	
            worldIn.setBlockState(pos.up(), InitBlocksEA.dragon_fruit.getDefaultState(), 11);
            --stack.stackSize;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    @Override
    public net.minecraftforge.common.EnumPlantType getPlantType(net.minecraft.world.IBlockAccess world, BlockPos pos)
    {
        return net.minecraftforge.common.EnumPlantType.Crop;
    }
    
	@Override
	public IBlockState getPlant(IBlockAccess world, BlockPos pos)
	{
	    return InitBlocksEA.dragon_fruit.getDefaultState();
	}
	
	
	
	
	
    //-------------------------------------------------------------------//
	 
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) 
	{
		toolTip.add(ChatFormatting.GOLD + "An ancient fruit that");
		toolTip.add(ChatFormatting.GOLD + "makes a healthy meal.");
	}
	
    //@SideOnly(Side.CLIENT)
    //public boolean hasEffect(ItemStack stack)
    //{
    //    return true;
    //}
    
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.EPIC;
    }
	
}
