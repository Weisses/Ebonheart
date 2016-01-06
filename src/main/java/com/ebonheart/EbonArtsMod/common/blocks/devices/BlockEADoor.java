package com.ebonheart.EbonArtsMod.common.blocks.devices;

import com.ebonheart.EbonArtsMod.EbonArtsMod;

import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;



public class BlockEADoor extends BlockDoor {
	
    public BlockEADoor(Material materialIn)
    {
        super(materialIn);
        this.disableStats();
        this.setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH).withProperty(OPEN, Boolean.valueOf(false)).withProperty(HINGE, BlockDoor1.EnumHingePosition.LEFT).withProperty(POWERED, Boolean.valueOf(false)).withProperty(HALF, BlockDoor1.EnumDoorHalf.LOWER));
    }
}