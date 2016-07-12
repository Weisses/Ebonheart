package com.ebonheart.EbonArtsMod.common.blocks.basic;

import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;

import com.ebonheart.EbonArtsMod.common.blocks.BlockHelper;

public class EABlockPillar extends BlockRotatedPillar {
	
	public EABlockPillar(String unlocalizedName)
	{
		super(Material.rock);
		BlockHelper.setBlockName(this, unlocalizedName);
		
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(5.0F);
		this.setStepSound(soundTypeStone);
		this.useNeighborBrightness = true;
	}
	
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}
}

