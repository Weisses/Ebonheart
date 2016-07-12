package com.ebonheart.EbonArtsMod.common.blocks.basic;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockWall;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.blocks.BlockHelper;
import com.ebonheart.EbonArtsMod.proxy.CommonProxy;


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
