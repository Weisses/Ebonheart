package com.ebonheart.EbonArtsMod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class BlockArcanite extends Block {

	public BlockArcanite(Material materialIn) {
		super(materialIn);
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(4.5F);
		
		
		
	}

	
}
