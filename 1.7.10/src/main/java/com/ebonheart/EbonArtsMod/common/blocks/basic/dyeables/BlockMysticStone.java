package com.ebonheart.EbonArtsMod.common.blocks.basic.dyeables;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.blocks.BlockHelper;

public class BlockMysticStone extends Block {
	
	public BlockMysticStone(String unlocalizedName) 
	{
		super(Material.rock);
		BlockHelper.setBlockName(this, unlocalizedName);
		
		this.setCreativeTab(EbonArtsMod.tabEbonArtsDyeables);
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(5.0F);
		this.setResistance(100.0F);
		this.setStepSound(soundTypeStone);
	}
}
