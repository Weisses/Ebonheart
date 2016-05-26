package com.ebonheart.EbonArtsMod.common.blocks.basic.dyeables;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.blocks.BlockHelper;
import com.ebonheart.EbonArtsMod.init.InitBlocksEA;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.util.IStringSerializable;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockMysticCobblestoneGlass extends BlockRotatedPillar {
	
	public static final PropertyEnum LOG_AXIS = PropertyEnum.create("axis", BlockMysticCobblestoneGlass.EnumAxis.class);
    
	private boolean ignoreSimilarity = true;
	
	public BlockMysticCobblestoneGlass(String unlocalizedName) 
	{
		super(Material.rock);
		BlockHelper.setBlockName(this, unlocalizedName);
		
		this.setCreativeTab(EbonArtsMod.tabEbonArtsDyeables);
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(5.0F);
		this.setStepSound(soundTypeStone);
	}
	
	
	@SideOnly(Side.CLIENT)
    public EnumWorldBlockLayer getBlockLayer()
    {
        return EnumWorldBlockLayer.CUTOUT;
    }

    public boolean isFullCube()
    {
        return false;
    }
    
    /**
     * Used to determine ambient occlusion and culling when rebuilding chunks for render
     */
    public boolean isOpaqueCube()
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
    
    
    
    
	
	public IBlockState getStateFromMeta(int meta)
    {
        IBlockState iblockstate = this.getDefaultState();

        switch (meta & 12)
        {
            case 0:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockMysticCobblestoneGlass.EnumAxis.Y);
                break;
            case 4:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockMysticCobblestoneGlass.EnumAxis.X);
                break;
            case 8:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockMysticCobblestoneGlass.EnumAxis.Z);
                break;
            default:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockMysticCobblestoneGlass.EnumAxis.NONE);
        }

        return iblockstate;
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state)
    {
        int i = 0;
        
        switch (BlockMysticCobblestoneGlass.SwitchEnumAxis.AXIS_LOOKUP[((BlockMysticCobblestoneGlass.EnumAxis)state.getValue(LOG_AXIS)).ordinal()])
        {
            case 1:
                i |= 4;
                break;
            case 2:
                i |= 8;
                break;
            case 3:
                i |= 12;
        }
        return i;
    }

    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        return super.onBlockPlaced(worldIn, pos, facing, hitX, hitY, hitZ, meta, placer).withProperty(LOG_AXIS, BlockMysticCobblestoneGlass.EnumAxis.fromFacingAxis(facing.getAxis()));
    }
    
    protected BlockState createBlockState()
    {
        return new BlockState(this, new IProperty[] {LOG_AXIS});
    }

    /**
     * Get the damage value that this Block should drop
     */
    //public int damageDropped(IBlockState state)
    //{
	     //return ((BlockPlanks.EnumType)state.getValue(VARIANT)).getMetadata();
    //}

    
    public static enum EnumAxis implements IStringSerializable
    {
        X("x"),
        Y("y"),
        Z("z"),
        NONE("none");
        private final String name;

        private static final String __OBFID = "CL_00002100";

        private EnumAxis(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return this.name;
        }

        public static BlockMysticCobblestoneGlass.EnumAxis fromFacingAxis(EnumFacing.Axis axis)
        {
            switch (BlockMysticCobblestoneGlass.SwitchAxis.AXIS_LOOKUP[axis.ordinal()])
            {
                case 1:
                    return X;
                case 2:
                    return Y;
                case 3:
                    return Z;
                default:
                    return NONE;
            }
        }

        public String getName()
        {
            return this.name;
        }
    }

    static final class SwitchAxis
        {
            static final int[] AXIS_LOOKUP = new int[EnumFacing.Axis.values().length];
            private static final String __OBFID = "CL_00002101";

            static
            {
                try
                {
                    AXIS_LOOKUP[EnumFacing.Axis.X.ordinal()] = 1;
                }
                catch (NoSuchFieldError var3)
                {
                    ;
                }

                try
                {
                    AXIS_LOOKUP[EnumFacing.Axis.Y.ordinal()] = 2;
                }
                catch (NoSuchFieldError var2)
                {
                    ;
                }

                try
                {
                    AXIS_LOOKUP[EnumFacing.Axis.Z.ordinal()] = 3;
                }
                catch (NoSuchFieldError var1)
                {
                    ;
                }
            }
        }
    
    
    
    static final class SwitchEnumAxis
        {
            static final int[] AXIS_LOOKUP = new int[BlockMysticCobblestoneGlass.EnumAxis.values().length];
            
            static
            {
                try
                {
                    AXIS_LOOKUP[BlockMysticCobblestoneGlass.EnumAxis.X.ordinal()] = 1;
                }
                catch (NoSuchFieldError var3)
                {
                    ;
                }

                try
                {
                    AXIS_LOOKUP[BlockMysticCobblestoneGlass.EnumAxis.Z.ordinal()] = 2;
                }
                catch (NoSuchFieldError var2)
                {
                    ;
                }

                try
                {
                    AXIS_LOOKUP[BlockMysticCobblestoneGlass.EnumAxis.NONE.ordinal()] = 3;
                }
                catch (NoSuchFieldError var1)
                {
                    ;
                }
            }
        }
	
    
}
