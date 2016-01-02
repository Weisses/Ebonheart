package com.ebonheart.EbonArtsMod.common.blocks.basic;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EABlockMeta.EnumType;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;


public class EABlockFence extends BlockFence {

	public EABlockFence(String unlocalizedName) 
	{
		super(Material.rock);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		this.setHarvestLevel("pickaxe", 2);
		//this.setHardness(5f);
		//this.setResistance(1000f);
		this.setStepSound(soundTypeStone);
	}
}
