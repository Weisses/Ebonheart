package com.ebonheart.EbonArtsMod.common.blocks.basic;

import com.ebonheart.EbonArtsMod.EbonArtsMod;

import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;


public class EABlockStairs extends BlockStairs {

	public EABlockStairs(String unlocalizedName) {
		super(Blocks.oak_stairs.getStateFromMeta(0));
		this.useNeighborBrightness = true;
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		this.setHarvestLevel("pickaxe", 2);
		//this.setHardness(5f);
		//this.setResistance(1000f);
		this.setStepSound(soundTypeStone);
	}

}
