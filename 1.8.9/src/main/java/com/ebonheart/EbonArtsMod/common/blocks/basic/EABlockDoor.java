package com.ebonheart.EbonArtsMod.common.blocks.basic;

import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;

import com.ebonheart.EbonArtsMod.common.blocks.BlockHelper;


public class EABlockDoor extends BlockDoor {

	public EABlockDoor(String unlocalizedName) 
	{
		super(Material.wood);
		BlockHelper.setBlockName(this, unlocalizedName);
		//this.setUnlocalizedName(unlocalizedName);
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(5.0F);
		this.setStepSound(soundTypeStone);
		this.disableStats();
	}
	
	
}
