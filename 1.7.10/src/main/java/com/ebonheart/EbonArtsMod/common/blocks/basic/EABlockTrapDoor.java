package com.ebonheart.EbonArtsMod.common.blocks.basic;

import net.minecraft.block.BlockTrapDoor;
import net.minecraft.block.material.Material;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.blocks.BlockHelperOLDOLDOLD;

public class EABlockTrapDoor extends BlockTrapDoor {

	public EABlockTrapDoor(String unlocalizedName) {
		super(Material.rock);
		this.setBlockName(unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		this.setHardness(5.0F);
	}

}
