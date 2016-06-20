package com.ebonheart.EbonArtsMod.common.blocks.basic;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.blocks.BlockHelper;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.SoundEvents;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class BlockRockEA extends Block {
	
	public BlockRockEA() 
	{
		super(Material.ROCK);
		//BlockHelper.setBlockName(this, unlocalizedName);
				
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(5.0F);
		this.setSoundType(SoundType.STONE);
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
