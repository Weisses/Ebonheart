package com.ebonheart.EbonArtsMod.common.blocks.basic;

import java.util.List;

import net.minecraft.block.BlockWall;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;

import com.ebonheart.EbonArtsMod.common.blocks.BlockHelper;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class EABlockWall extends BlockWall {
	
	public EABlockWall(String unlocalizedName) 
    {
		super(Blocks.stonebrick);
		BlockHelper.setBlockName(this, unlocalizedName);
		
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(5.0F);
		this.setStepSound(soundTypeStone);
	}
	
	
	
	@SideOnly(Side.CLIENT)
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list)
    {
		list.add(new ItemStack(itemIn, 1));
    }

	@Override
	public boolean canPlaceTorchOnTop(IBlockAccess world, BlockPos pos)
    {
        if (isSideSolid(world, pos, EnumFacing.UP))
        {
            return true;
        }
        else
        {
            return this instanceof EABlockWall || this == net.minecraft.init.Blocks.glass || this == net.minecraft.init.Blocks.cobblestone_wall;
        }
		
    }
}
