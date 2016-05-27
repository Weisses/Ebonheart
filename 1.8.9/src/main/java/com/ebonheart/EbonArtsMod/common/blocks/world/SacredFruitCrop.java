package com.ebonheart.EbonArtsMod.common.blocks.world;

import java.util.Random;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.ebonheart.EbonArtsMod.common.blocks.BlockHelper;
import com.ebonheart.EbonArtsMod.configs.EbonArtsConfiguration;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;

public class SacredFruitCrop extends BlockCrops {
	
	public static final PropertyInteger SACREDFRUITAGE = PropertyInteger.create("age", 0, 7);
	
	public SacredFruitCrop()
	{
		BlockHelper.setBlockName(this, "plant/sacred_fruit_crop");
		setCreativeTab(null);
	}
	protected Item getSeed()
    {
        return InitItemsEA.sacred_fruit;
    }

    protected Item getCrop()
    {
        return InitItemsEA.sacred_fruit;
    }

    //public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    //{
    //    return SACREDFRUIT_AABB[((Integer)state.getValue(this.getAgeProperty())).intValue()];
    //}
    
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
    //@SideOnly(Side.CLIENT)
    //public void randomDisplayTick(IBlockState state, World worldIn, BlockPos pos, Random rand)
    //{
    	if(!EbonArtsConfiguration.plantParticle)
		{
    	if(worldIn.getLight(pos) >= 8 || worldIn.canSeeSky(pos))
    	{
    	
    	
    		int d = rand.nextInt(100) + 1;
    	
    	
    		if(d < 2)
    		{
    		
    			//int amount = 20;

    			for (int i = 0; i < 2; ++i)
    			{
    				int j = rand.nextInt(2) * 2 - 1;
    				int k = rand.nextInt(2) * 2 - 1;
    				double d0 = (double)pos.getX() + 0.5D + 0.25D * (double)j;
    				double d1 = (double)((float)pos.getY() + (rand.nextFloat() * 0.5));
    				double d2 = (double)pos.getZ() + 0.5D + 0.25D * (double)k;
    				double d3 = (double)(rand.nextFloat() - (float)j);
    				double d4 = ((double)rand.nextFloat() - 0.5D) * 0.125D;
    				double d5 = (double)(rand.nextFloat() - (float)k);
    				worldIn.spawnParticle(
						EnumParticleTypes.REDSTONE
						, d0, d1, d2, 1D, 3D, 4D, new int[0]);
				
    			}
    		}
    	}
		}
    }
}
