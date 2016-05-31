package com.ebonheart.EbonArtsMod.common.blocks.basic;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWall;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.blocks.BlockHelperOLDOLDOLD;
import com.ebonheart.EbonArtsMod.init.InitBlocksEA;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class EAEbonheartWall extends BlockWall {
	
	public EAEbonheartWall(String unlocalizedName) 
    {
		super(Blocks.stonebrick);
		this.setBlockName(unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(5.0F);
		this.setStepSound(soundTypeStone);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_)
    {
        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 0));
        //p_149666_3_.add(new ItemStack(p_149666_1_, 1, 1));
    }
	
	/**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
    	return InitBlocksEA.ebonheart_block.getBlockTextureFromSide(p_149691_1_);
    	//return //p_149691_2_ == 1 ? Blocks.mossy_cobblestone.getBlockTextureFromSide(p_149691_1_) : Blocks.cobblestone.getBlockTextureFromSide(p_149691_1_);
    }

	@Override
    public boolean canPlaceTorchOnTop(World world, int x, int y, int z)
    {
            return true;
    }

	@Override
	public boolean canConnectWallTo(IBlockAccess p_149826_1_, int p_149826_2_, int p_149826_3_, int p_149826_4_)
	{
		Block block = p_149826_1_.getBlock(p_149826_2_, p_149826_3_, p_149826_4_);
        return block != this && block != Blocks.fence_gate ? (block.renderAsNormalBlock() == false) : true;
	}
}
