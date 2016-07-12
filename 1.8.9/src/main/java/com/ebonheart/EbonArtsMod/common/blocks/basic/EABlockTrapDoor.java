package com.ebonheart.EbonArtsMod.common.blocks.basic;

import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;

import com.ebonheart.EbonArtsMod.common.blocks.BlockHelper;

public class EABlockTrapDoor extends BlockTrapDoor {

	public EABlockTrapDoor(String unlocalizedName) {
		super(Material.rock);
		
		BlockHelper.setBlockName(this, unlocalizedName);
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(5.0F);
		this.setStepSound(soundTypeStone);
	}

}
