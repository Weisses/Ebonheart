package com.ebonheart.EbonArtsMod.common.blocks.basic.dyeables;

import net.minecraft.block.Block;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;

import com.ebonheart.EbonArtsMod.init.InitBlocksEA;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockMysticWoodGlass extends BlockMysticWood {
	
	private boolean ignoreSimilarity = true;
	
	public BlockMysticWoodGlass(String unlocalizedName) 
	{
		super(unlocalizedName);
	}
	
	
	@SideOnly(Side.CLIENT)
    public EnumWorldBlockLayer getBlockLayer()
    {
        return EnumWorldBlockLayer.CUTOUT;
    }

    public boolean isFullCube(IBlockState state)
    {
        return false;
    }
    
    /**
     * Used to determine ambient occlusion and culling when rebuilding chunks for render
     */
    public boolean isOpaqueCube(IBlockState state)
    {
        return false;
    }

    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos, EnumFacing side)
    {
        IBlockState iblockstate = blockAccess.getBlockState(pos.offset(side));
        Block block = iblockstate.getBlock();
        
        IBlockState test = blockAccess.getBlockState(pos.offset(side));
        Block test1 = iblockstate.getBlock();

        if (this == InitBlocksEA.cobble_mystic_block_glass
                || this == InitBlocksEA.mystic_block_glass
                || this == InitBlocksEA.wood_mystic_block_glass)
        {
        	
            if (blockState != iblockstate)
            {
                return true;
            }

            if (block == this)
            {
                return false;
            }
        }

        return !this.ignoreSimilarity && block == this ? false : super.shouldSideBeRendered(blockAccess, pos, side);
    }
    
}
