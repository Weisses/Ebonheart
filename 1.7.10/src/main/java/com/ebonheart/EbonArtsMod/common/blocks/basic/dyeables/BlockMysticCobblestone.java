package com.ebonheart.EbonArtsMod.common.blocks.basic.dyeables;

import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.blocks.BlockHelperOLDOLDOLD;

public class BlockMysticCobblestone extends BlockRotatedPillar {
	
	public static final PropertyEnum LOG_AXIS = PropertyEnum.create("axis", BlockMysticCobblestone.EnumAxis.class);
    
	public BlockMysticCobblestone(String unlocalizedName) 
	{
		super(Material.rock);
		BlockHelperOLDOLDOLD.setBlockName(this, unlocalizedName);
		
		this.setCreativeTab(EbonArtsMod.tabEbonArtsDyeables);
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(5.0F);
		this.setResistance(100.0F);
		this.setStepSound(soundTypeStone);
	}
	
	public boolean isOpaqueCube()
	{
		return false;
	}
	
	public boolean isFullCube()
	{
		return true;
	}
	
	public IBlockState getStateFromMeta(int meta)
    {
        IBlockState iblockstate = this.getDefaultState();

        switch (meta & 12)
        {
            case 0:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockMysticCobblestone.EnumAxis.Y);
                break;
            case 4:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockMysticCobblestone.EnumAxis.X);
                break;
            case 8:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockMysticCobblestone.EnumAxis.Z);
                break;
            default:
                iblockstate = iblockstate.withProperty(LOG_AXIS, BlockMysticCobblestone.EnumAxis.NONE);
        }

        return iblockstate;
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state)
    {
        int i = 0;
        
        switch (BlockMysticCobblestone.SwitchEnumAxis.AXIS_LOOKUP[((BlockMysticCobblestone.EnumAxis)state.getValue(LOG_AXIS)).ordinal()])
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
        return super.onBlockPlaced(worldIn, pos, facing, hitX, hitY, hitZ, meta, placer).withProperty(LOG_AXIS, BlockMysticCobblestone.EnumAxis.fromFacingAxis(facing.getAxis()));
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

        public static BlockMysticCobblestone.EnumAxis fromFacingAxis(EnumFacing.Axis axis)
        {
            switch (BlockMysticCobblestone.SwitchAxis.AXIS_LOOKUP[axis.ordinal()])
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
            static final int[] AXIS_LOOKUP = new int[BlockMysticCobblestone.EnumAxis.values().length];
            
            static
            {
                try
                {
                    AXIS_LOOKUP[BlockMysticCobblestone.EnumAxis.X.ordinal()] = 1;
                }
                catch (NoSuchFieldError var3)
                {
                    ;
                }

                try
                {
                    AXIS_LOOKUP[BlockMysticCobblestone.EnumAxis.Z.ordinal()] = 2;
                }
                catch (NoSuchFieldError var2)
                {
                    ;
                }

                try
                {
                    AXIS_LOOKUP[BlockMysticCobblestone.EnumAxis.NONE.ordinal()] = 3;
                }
                catch (NoSuchFieldError var1)
                {
                    ;
                }
            }
        }
	
}
