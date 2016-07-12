package com.ebonheart.EbonArtsMod.common.blocks.basic;

import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockPlanks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;

import com.ebonheart.EbonArtsMod.common.blocks.BlockHelper;


public class EABlockFenceGate extends BlockFenceGate {
	
	public EABlockFenceGate(String unlocalizedName) 
	{
		super(BlockPlanks.EnumType.OAK);
		BlockHelper.setBlockName(this, unlocalizedName);
		
		this.setDefaultState(this.blockState.getBaseState().withProperty(OPEN, Boolean.valueOf(false)).withProperty(POWERED, Boolean.valueOf(false)).withProperty(IN_WALL, Boolean.valueOf(false)));
        this.setHarvestLevel("pickaxe", 2);
        this.setHardness(5.0F);
        this.setStepSound(soundTypeStone);
	}
	
	@Override
	public boolean isFlammable(IBlockAccess world, BlockPos pos, EnumFacing face)
    {
        return false;
    }
	
	
}
