package com.ebonheart.EbonArtsMod.common.blocks.basic.blocks;

import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.ebonheart.EbonArtsMod.common.blocks.BlockHelper;
import com.ebonheart.EbonArtsMod.common.blocks.basic.BlockRockEA;
import com.ebonheart.EbonArtsMod.init.InitBlocksEA;


public class BlockEbonheart extends BlockRockEA {

	public BlockEbonheart() 
	{
		super();
		BlockHelper.setBlockName(this, "gem/ebonheart/ebonheart_block");
		
		this.useNeighborBrightness=true;
	}
	
    public boolean isOpaqueCube()
    {
    	return false;
    }
    
    public boolean isFullCube()
    {
        return true;
    }
    
    public boolean isBeaconBase(IBlockAccess worldObj, BlockPos pos, BlockPos beacon)
    {
        return true;
    }
    
    public float getEnchantPowerBonus(World world, BlockPos pos)
    {
    	
        return this == InitBlocksEA.ebonheart_block ? 30 : 0;
    }
    
    
}
