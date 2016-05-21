package com.ebonheart.EbonArtsMod.common.blocks.world;

import java.util.Random;

import com.ebonheart.EbonArtsMod.common.blocks.BlockHelper;
import com.ebonheart.EbonArtsMod.init.InitBlocksEA;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class HellionFruitCrop extends BlockCrops{
	
	Random random = new Random();
	
	private static final AxisAlignedBB[] HELLIONFRUIT_AABB = new AxisAlignedBB[] {new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.1875D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.3125D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.375D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.4375D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.5625D, 1.0D)};

	public HellionFruitCrop()
	{
		BlockHelper.setBlockName(this, "plant/hellion_fruit_crop");
		setCreativeTab(null);
	}
	protected Item getSeed()
    {
        return InitItemsEA.hellion_fruit;
    }

    protected Item getCrop()
    {
        return InitItemsEA.hellion_fruit;
    }

    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return HELLIONFRUIT_AABB[((Integer)state.getValue(this.getAge())).intValue()];
    }
    
    
    
}
