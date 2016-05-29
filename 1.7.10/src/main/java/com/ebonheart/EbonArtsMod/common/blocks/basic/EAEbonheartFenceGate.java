package com.ebonheart.EbonArtsMod.common.blocks.basic;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.blocks.BlockHelperOLDOLDOLD;
import com.ebonheart.EbonArtsMod.init.InitBlocksEA;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class EAEbonheartFenceGate extends BlockFenceGate {
	
	public static Block fenceBlockEA;
	public EAEbonheartFenceGate(String unlocalizedName, Block US) 
	{
		super();
		this.setBlockName(unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		this.fenceBlockEA = US;
		//this.setDefaultState(this.blockState.getBaseState().withProperty(OPEN, Boolean.valueOf(false)).withProperty(POWERED, Boolean.valueOf(false)).withProperty(IN_WALL, Boolean.valueOf(false)));
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(5.0F);
        this.setStepSound(soundTypeStone);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return InitBlocksEA.ebonheart_block.getBlockTextureFromSide(p_149691_1_);
    }
	
}
