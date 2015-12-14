package com.ebonheart.EbonArtsMod.common.blocks.basic;

import com.ebonheart.EbonArtsMod.EbonArtsMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class BlockNecrocite extends Block {

	public BlockNecrocite(Material materialIn) 
	{
		super(materialIn);
		this.setUnlocalizedName("gem/necrocite/necrocite_block");
		this.setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		this.setHarvestLevel("pickaxe", 3);
		this.setHardness(25f);
		this.setResistance(1500f);
		this.setStepSound(soundTypeStone);
	}
}
