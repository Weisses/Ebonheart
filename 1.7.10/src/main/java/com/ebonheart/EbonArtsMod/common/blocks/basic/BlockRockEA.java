package com.ebonheart.EbonArtsMod.common.blocks.basic;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;


public class BlockRockEA extends Block {
	
	public BlockRockEA() 
	{
		super(Material.rock);
		
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(5.0F);
		this.setStepSound(soundTypeStone);
	}
}
