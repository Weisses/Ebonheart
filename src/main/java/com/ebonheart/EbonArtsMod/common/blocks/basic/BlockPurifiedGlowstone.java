package com.ebonheart.EbonArtsMod.common.blocks.basic;

import com.ebonheart.EbonArtsMod.EbonArtsMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockPurifiedGlowstone extends Block {

	public BlockPurifiedGlowstone(Material materialIn) {
		super(materialIn);
		this.setLightLevel(1.0f);
		this.setUnlocalizedName("purified_glowstone");
		this.setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		this.setHardness(1f);
		this.setResistance(1000f);
	}

}
