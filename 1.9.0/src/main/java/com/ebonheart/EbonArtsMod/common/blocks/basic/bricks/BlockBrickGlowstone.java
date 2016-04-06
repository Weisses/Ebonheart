package com.ebonheart.EbonArtsMod.common.blocks.basic.bricks;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.blocks.BlockHelper;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class BlockBrickGlowstone extends Block {

	public BlockBrickGlowstone() 
	{
		super(Material.rock);
		BlockHelper.setBlockName(this, "gem/glowstone/glowstone_block_brick");
		
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(5.0F);
		this.setStepSound(stepSound.STONE);
		this.useNeighborBrightness=true;
	}
    
    public boolean isOpaqueCube(IBlockState state)
    {
    	return false;
    }
    
    public boolean isFullCube()
    {
        return true;
    }
}
