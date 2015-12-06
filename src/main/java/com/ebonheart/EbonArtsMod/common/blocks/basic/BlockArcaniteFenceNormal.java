package com.ebonheart.EbonArtsMod.common.blocks.basic;

import com.ebonheart.EbonArtsMod.EbonArtsMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class BlockArcaniteFenceNormal extends BlockFence {

	public BlockArcaniteFenceNormal(Material materialIn) 
	{
		super(materialIn);
		this.setUnlocalizedName("fence/arcanite_fence_normal");
		this.setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(5F);
		this.setResistance(1000F);
		this.setStepSound(soundTypeStone);
	}
}
