package com.ebonheart.EbonArtsMod.blocks;

import java.util.List;
import java.util.Random;

import com.ebonheart.EbonArtsMod.init.EbonArtsBlocks;
import com.ebonheart.EbonArtsMod.init.EbonArtsItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockArcaniteBlock extends Block {

	public BlockArcaniteBlock(Material materialIn) {
		super(materialIn);
		
		
		
		
	}
	


	public static final PropertyEnum VARIANT = PropertyEnum.create("variant", BlockArcaniteBlock.EnumType.class);
    //private static final String __OBFID = "CL_00000292";

    public BlockArcaniteBlock()
    {
        super(Material.rock);
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, BlockArcaniteBlock.EnumType.DEFAULT));
        //this.setCreativeTab(CreativeTabs.tabBlock);
    }

    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer)
    {
        if (meta == BlockArcaniteBlock.EnumType.LINES_Y.getMetadata())
        {
            switch (BlockArcaniteBlock.SwitchAxis.AXIS_LOOKUP[facing.getAxis().ordinal()])
            {
                case 1:
                    return this.getDefaultState().withProperty(VARIANT, BlockArcaniteBlock.EnumType.LINES_Z);
                case 2:
                    return this.getDefaultState().withProperty(VARIANT, BlockArcaniteBlock.EnumType.LINES_X);
                case 3:
                default:
                    return this.getDefaultState().withProperty(VARIANT, BlockArcaniteBlock.EnumType.LINES_Y);
            }
        }
        else
        {
            return meta == BlockArcaniteBlock.EnumType.CHISELED.getMetadata() ? this.getDefaultState().withProperty(VARIANT, BlockArcaniteBlock.EnumType.CHISELED) : this.getDefaultState().withProperty(VARIANT, BlockArcaniteBlock.EnumType.DEFAULT);
        }
    }

    /**
     * Get the damage value that this Block should drop
     */
    public int damageDropped(IBlockState state)
    {
        BlockArcaniteBlock.EnumType enumtype = (BlockArcaniteBlock.EnumType)state.getValue(VARIANT);
        return enumtype != BlockArcaniteBlock.EnumType.LINES_X && enumtype != BlockArcaniteBlock.EnumType.LINES_Z ? enumtype.getMetadata() : BlockArcaniteBlock.EnumType.LINES_Y.getMetadata();
    }

    protected ItemStack createStackedBlock(IBlockState state)
    {
        BlockArcaniteBlock.EnumType enumtype = (BlockArcaniteBlock.EnumType)state.getValue(VARIANT);
        return enumtype != BlockArcaniteBlock.EnumType.LINES_X && enumtype != BlockArcaniteBlock.EnumType.LINES_Z ? super.createStackedBlock(state) : new ItemStack(Item.getItemFromBlock(this), 1, BlockArcaniteBlock.EnumType.LINES_Y.getMetadata());
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List list)
    {
        list.add(new ItemStack(itemIn, 1, BlockArcaniteBlock.EnumType.DEFAULT.getMetadata()));
        list.add(new ItemStack(itemIn, 1, BlockArcaniteBlock.EnumType.CHISELED.getMetadata()));
        list.add(new ItemStack(itemIn, 1, BlockArcaniteBlock.EnumType.LINES_Y.getMetadata()));
    }

    /**
     * Get the MapColor for this Block and the given BlockState
     */
    //public MapColor getMapColor(IBlockState state)
    // {
    //     return MapColor.quartzColor;
    // }

    /**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(VARIANT, BlockArcaniteBlock.EnumType.byMetadata(meta));
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state)
    {
        return ((BlockArcaniteBlock.EnumType)state.getValue(VARIANT)).getMetadata();
    }

    protected BlockState createBlockState()
    {
        return new BlockState(this, new IProperty[] {VARIANT});
    }

    public boolean rotateBlock(World world, BlockPos pos, EnumFacing axis)
    {
        IBlockState state = world.getBlockState(pos);
        for (IProperty prop : (java.util.Set<IProperty>)state.getProperties().keySet())
        {
            if (prop.getName().equals("variant") && prop.getValueClass() == EnumType.class)
            {
                EnumType current = (EnumType)state.getValue(prop);
                EnumType next = current == EnumType.LINES_X ? EnumType.LINES_Y :
                                current == EnumType.LINES_Y ? EnumType.LINES_Z :
                                current == EnumType.LINES_Z ? EnumType.LINES_X : current;
                if (next == current)
                    return false;
                world.setBlockState(pos, state.withProperty(prop, next));
                return true;
            }
        }
        return false;
    }

    public static enum EnumType implements IStringSerializable
    {
        DEFAULT(0, "default", "default"),
        CHISELED(1, "chiseled", "chiseled"),
        LINES_Y(2, "lines_y", "lines"),
        LINES_X(3, "lines_x", "lines"),
        LINES_Z(4, "lines_z", "lines");
        private static final BlockArcaniteBlock.EnumType[] META_LOOKUP = new BlockArcaniteBlock.EnumType[values().length];
        private final int meta;
        private final String field_176805_h;
        private final String unlocalizedName;

        //private static final String __OBFID = "CL_00002074";

        private EnumType(int meta, String name, String unlocalizedName)
        {
            this.meta = meta;
            this.field_176805_h = name;
            this.unlocalizedName = unlocalizedName;
        }

        public int getMetadata()
        {
            return this.meta;
        }

        public String toString()
        {
            return this.unlocalizedName;
        }

        public static BlockArcaniteBlock.EnumType byMetadata(int meta)
        {
            if (meta < 0 || meta >= META_LOOKUP.length)
            {
                meta = 0;
            }

            return META_LOOKUP[meta];
        }

        public String getName()
        {
            return this.field_176805_h;
        }

        static
        {
            BlockArcaniteBlock.EnumType[] var0 = values();
            int var1 = var0.length;

            for (int var2 = 0; var2 < var1; ++var2)
            {
                BlockArcaniteBlock.EnumType var3 = var0[var2];
                META_LOOKUP[var3.getMetadata()] = var3;
            }
        }
    }

    static final class SwitchAxis
        {
            static final int[] AXIS_LOOKUP = new int[EnumFacing.Axis.values().length];
            //private static final String __OBFID = "CL_00002075";

            static
            {
                try
                {
                    AXIS_LOOKUP[EnumFacing.Axis.Z.ordinal()] = 1;
                }
                catch (NoSuchFieldError var3)
                {
                    ;
                }

                try
                {
                    AXIS_LOOKUP[EnumFacing.Axis.X.ordinal()] = 2;
                }
                catch (NoSuchFieldError var2)
                {
                    ;
                }

                try
                {
                    AXIS_LOOKUP[EnumFacing.Axis.Y.ordinal()] = 3;
                }
                catch (NoSuchFieldError var1)
                {
                    ;
                }
            }
        }
    

}
