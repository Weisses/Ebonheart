package com.ebonheart.EbonArtsMod.common.blocks.world;

import java.util.Random;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.blocks.BlockHelperOLDOLDOLD;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DragonFruitCrop extends BlockCrops {
	
	
	private static Random random = new Random();
	//public static final PropertyInteger DRAGONFRUITAGE = PropertyInteger.create("age", 0, 7);
	public DragonFruitCrop()
	{
		//BlockHelperOLDOLDOLD.setBlockName(this, "plant/dragon_fruit_crop");
		setCreativeTab(null);
		this.setBlockName("plants/dragon_fruit_crop");
		//this.setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
	}
	
	@Override
	protected Item func_149866_i()
	//protected Item getSeed()
    {
        return InitItemsEA.dragon_fruit;
    }

	@Override
	protected Item func_149865_P()
    //protected Item getCrop()
    {
        return InitItemsEA.dragon_fruit;
    }

	
    //public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    ///{
    //	return DRAGONFRUIT_AABB[((Integer)state.getValue(this.getAgeProperty())).intValue()];
    //}
    
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World p_149734_1_, int p_149734_2_, int p_149734_3_, int p_149734_4_, Random p_149734_5_)
    //public void randomDisplayTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
    
    //@SideOnly(Side.CLIENT)
    //public void randomDisplayTick(IBlockState state, World worldIn, BlockPos pos, Random rand)
    //{
    	
    	if(p_149734_1_.getBlockLightValue(p_149734_2_, p_149734_3_ + 1, p_149734_4_) >= 9)
    	{
    	
    	
    		int d = p_149734_5_.nextInt(100) + 1;
    	
    	
    		if(d < 2)
    		{
    			//int amount = 20;

    			for (int i = 0; i < 8; ++i)
    			{
    				int j = p_149734_5_.nextInt(2) * 2 - 1;
    				int k = p_149734_5_.nextInt(2) * 2 - 1;
    				double d0 = (double)p_149734_2_ + 0.5D + 0.25D * (double)j;
    				double d1 = (double)((float)p_149734_3_ + (p_149734_5_.nextFloat() * 0.25));
    				double d2 = (double)p_149734_4_ + 0.5D + 0.25D * (double)k;
    				double d3 = (double)(p_149734_5_.nextFloat() * (float)j);
    				double d4 = ((double)p_149734_5_.nextFloat() - 0.5D) * 0.125D;
    				double d5 = (double)(p_149734_5_.nextFloat() * (float)k);
    				p_149734_1_.spawnParticle("portal"
						//EnumParticleTypes.PORTAL
						, d0, d1, d2, 0, 0, 0);
				
    			}
    		}
    	}
    }
}
