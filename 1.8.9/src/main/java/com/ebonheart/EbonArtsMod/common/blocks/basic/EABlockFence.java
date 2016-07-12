package com.ebonheart.EbonArtsMod.common.blocks.basic;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;

import com.ebonheart.EbonArtsMod.common.blocks.BlockHelper;


public class EABlockFence extends BlockFence {

	public EABlockFence(String unlocalizedName) 
	{
		super(Material.wood, null);
		BlockHelper.setBlockName(this, unlocalizedName);
		
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(5.0F);
		this.setStepSound(soundTypeStone);
	}
	
	
}
