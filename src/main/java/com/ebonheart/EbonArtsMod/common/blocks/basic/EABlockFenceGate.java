package com.ebonheart.EbonArtsMod.common.blocks.basic;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EABlockMeta.EnumType;

import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


public class EABlockFenceGate extends BlockFenceGate {
	
	public EABlockFenceGate(String unlocalizedName) 
	{
		this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		this.setDefaultState(this.blockState.getBaseState().withProperty(OPEN, Boolean.valueOf(false)).withProperty(POWERED, Boolean.valueOf(false)).withProperty(IN_WALL, Boolean.valueOf(false)));
        this.setHarvestLevel("pickaxe", 2);
        this.setStepSound(soundTypeStone);
	}
}
