package com.ebonheart.EbonArtsMod.common.blocks.basic;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.blocks.BlockHelper;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class BlockRockEA extends Block {
	
	public BlockRockEA() 
	{
		super(Material.rock);
		
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(5.0F);
		this.setStepSound(soundTypeStone);
	}
}
