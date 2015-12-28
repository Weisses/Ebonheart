package com.ebonheart.EbonArtsMod.common.blocks.basic;

import com.ebonheart.EbonArtsMod.EbonArtsMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class BlockInnateMysticNormal extends Block {

	public BlockInnateMysticNormal() 
	{
		super(Material.rock);
		this.setUnlocalizedName("gem/mystic/innate_mystic_block_normal");
		this.setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(5f);
		this.setResistance(1000f);
		this.setStepSound(soundTypeStone);
	}
}
