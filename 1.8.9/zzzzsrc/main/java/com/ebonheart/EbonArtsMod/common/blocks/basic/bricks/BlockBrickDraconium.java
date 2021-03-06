package com.ebonheart.EbonArtsMod.common.blocks.basic.bricks;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.blocks.BlockHelper;
import com.ebonheart.EbonArtsMod.common.blocks.basic.BlockRockEA;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class BlockBrickDraconium extends BlockRockEA {

	public BlockBrickDraconium() 
	{
		super();
		BlockHelper.setBlockName(this, "gem/draconium/draconium_block_brick");
		
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
}
