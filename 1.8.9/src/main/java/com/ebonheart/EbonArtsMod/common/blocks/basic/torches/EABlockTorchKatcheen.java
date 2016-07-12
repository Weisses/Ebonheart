package com.ebonheart.EbonArtsMod.common.blocks.basic.torches;

import java.util.Random;

import net.minecraft.block.BlockTorch;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.ebonheart.EbonArtsMod.common.blocks.BlockHelper;

public class EABlockTorchKatcheen extends BlockTorch {
		
	    public EABlockTorchKatcheen()
	    {
	        super();
	        BlockHelper.setBlockName(this, "gem/katcheen/katcheen_torch");
	        
	        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.UP));
	        this.setTickRandomly(true);
	        this.setLightLevel(0.9375F);
	    }


	    @SideOnly(Side.CLIENT)
	    public void randomDisplayTick(World pos, BlockPos state, IBlockState worldIn, Random rand)
	    {
	        EnumFacing enumfacing = (EnumFacing)worldIn.getValue(FACING);
	        double d0 = (double)state.getX() + 0.5D;
	        double d1 = (double)state.getY() + 0.7D;
	        double d2 = (double)state.getZ() + 0.5D;
	        double d3 = 0.22D;
	        double d4 = 0.27D;

	        if (enumfacing.getAxis().isHorizontal())
	        {
	            EnumFacing enumfacing1 = enumfacing.getOpposite();
	            pos.spawnParticle(EnumParticleTypes.SPELL_MOB_AMBIENT, d0 + d4 * (double)enumfacing1.getFrontOffsetX(), d1 + d3, d2 + d4 * (double)enumfacing1.getFrontOffsetZ(), 1.0D, -5.0D, 0.0D, new int[0]);
	            pos.spawnParticle(EnumParticleTypes.REDSTONE, d0 + d4 * (double)enumfacing1.getFrontOffsetX(), d1 + d3, d2 + d4 * (double)enumfacing1.getFrontOffsetZ(), 0.0D, 5.0D, 3.4D, new int[0]);
	        }
	        else
	        {
	            pos.spawnParticle(EnumParticleTypes.SPELL_MOB_AMBIENT, d0, d1, d2, 1.0D, -5.0D, 0.0D, new int[0]);
	            pos.spawnParticle(EnumParticleTypes.REDSTONE, d0, d1, d2, 0.0D, 5.0D, 3.4D, new int[0]);
	        }
	    }
	    
}

