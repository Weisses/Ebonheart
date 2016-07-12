package com.ebonheart.EbonArtsMod.common.blocks.basic;

import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import scala.reflect.api.Mirror;

import com.ebonheart.EbonArtsMod.common.blocks.BlockHelper;

public class EABlockDirectional extends BlockDirectional {

	public EABlockDirectional(String unlocalizedName) 
	{
		super(Material.cloth);
		BlockHelper.setBlockName(this, unlocalizedName);
		
		//this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
		this.setHardness(1.0F);
		this.setStepSound(soundTypeStone);
		this.useNeighborBrightness=true;
	}
	
	@Override
	public boolean isOpaqueCube()
    {
        return false;
    }
	
	
}
