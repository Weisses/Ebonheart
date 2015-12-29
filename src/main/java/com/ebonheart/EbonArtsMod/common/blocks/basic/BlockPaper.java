package com.ebonheart.EbonArtsMod.common.blocks.basic;

import com.ebonheart.EbonArtsMod.EbonArtsMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockPaper extends Block {

	public BlockPaper() 
	{
		super(Material.cloth);
		this.setUnlocalizedName("paper_block");
		this.setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		this.setHardness(1f);
		this.setResistance(1000f);
	}

}
