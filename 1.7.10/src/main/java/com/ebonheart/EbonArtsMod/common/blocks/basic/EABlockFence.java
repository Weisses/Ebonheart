package com.ebonheart.EbonArtsMod.common.blocks.basic;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

import com.ebonheart.EbonArtsMod.common.blocks.BlockHelper;


public class EABlockFence extends BlockFence {

	public EABlockFence(String unlocalizedName) 
	{
		super(Material.wood, null);
		BlockHelper.setBlockName(this, unlocalizedName);
		
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(5.0F);
		this.setStepSound(soundTypeStone);
	}
	
	public void isFlamable(World worldIn, BlockPos posIn, EnumFacing face)
	{
		this.isFlammable(worldIn, posIn, face);
	}
	
}
