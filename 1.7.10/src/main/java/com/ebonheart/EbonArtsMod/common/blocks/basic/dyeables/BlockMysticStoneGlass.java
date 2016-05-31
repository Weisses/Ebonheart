package com.ebonheart.EbonArtsMod.common.blocks.basic.dyeables;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Facing;
import net.minecraft.world.IBlockAccess;

import com.ebonheart.EbonArtsMod.init.InitBlocksEA;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockMysticStoneGlass extends BlockMysticStone {
	
	private boolean ignoreSimilarity = true;
	private boolean field_149996_a = true;
	
	public BlockMysticStoneGlass(String unlocalizedName) 
	{
		super(unlocalizedName);
	}

    /**
     * Returns which pass should this block be rendered on. 0 for solids and 1 for alpha
     */
    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 0;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }
    
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess p_149646_1_, int p_149646_2_, int p_149646_3_, int p_149646_4_, int p_149646_5_)
    {
        Block block = p_149646_1_.getBlock(p_149646_2_, p_149646_3_, p_149646_4_);

        if (this == Blocks.glass || this == InitBlocksEA.mystic_block_glass
        	|| this == InitBlocksEA.cobble_mystic_block_glass || this == InitBlocksEA.wood_mystic_block_glass
        		)
        {
            if (p_149646_1_.getBlockMetadata(p_149646_2_, p_149646_3_, p_149646_4_) != p_149646_1_.getBlockMetadata(p_149646_2_ - Facing.offsetsXForSide[p_149646_5_], p_149646_3_ - Facing.offsetsYForSide[p_149646_5_], p_149646_4_ - Facing.offsetsZForSide[p_149646_5_]))
            {
                return true;
            }

            if (block == this)
            {
                return false;
            }
        }

        return !this.field_149996_a && block == this ? false : super.shouldSideBeRendered(p_149646_1_, p_149646_2_, p_149646_3_, p_149646_4_, p_149646_5_);
    }
}
