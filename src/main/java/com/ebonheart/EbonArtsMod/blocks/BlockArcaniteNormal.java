package com.ebonheart.EbonArtsMod.blocks;

import com.ebonheart.EbonArtsMod.EbonArtsMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class BlockArcaniteNormal extends Block {

	public BlockArcaniteNormal(Material materialIn) {
		super(materialIn);
		this.setUnlocalizedName("gem/arcanite_block_normal");
		this.setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(5F);
		this.setResistance(1000F);
		this.setStepSound(soundTypeStone);
		
		
		
	}

	
}
