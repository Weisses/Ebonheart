package com.ebonheart.EbonArtsMod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;

public class BlockRotatedPillarEA extends Block {

	public static final PropertyEnum AXIS = PropertyEnum.create("axis", EnumFacing.Axis.class);
    //private static final String __OBFID = "CL_00000302";
    
	public BlockRotatedPillarEA(Material materialIn) {
		super(materialIn);
		
	}
	
	public boolean rotateBlock(net.minecraft.world.World world, net.minecraft.util.BlockPos pos, EnumFacing axis)
    {
        IBlockState state = world.getBlockState(pos);
        for (net.minecraft.block.properties.IProperty prop : (java.util.Set<net.minecraft.block.properties.IProperty>)state.getProperties().keySet())
        {
            if (prop.getName().equals("axis"))
            {
                world.setBlockState(pos, state.cycleProperty(prop));
                return true;
            }
        }
        return false;
    }
}
