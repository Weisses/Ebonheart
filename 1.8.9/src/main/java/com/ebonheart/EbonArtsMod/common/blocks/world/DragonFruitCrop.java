package com.ebonheart.EbonArtsMod.common.blocks.world;

import java.util.Random;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.ebonheart.EbonArtsMod.common.blocks.BlockHelper;
import com.ebonheart.EbonArtsMod.configs.EbonArtsConfiguration;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;

public class DragonFruitCrop extends BlockCrops {
	
	
	private static Random random = new Random();
	public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 7);
	
	public DragonFruitCrop()
	{
		BlockHelper.setBlockName(this, "plant/dragon_fruit_crop");
		setCreativeTab(null);
	}
	protected Item getSeed()
    {
        return InitItemsEA.dragon_fruit;
    }

    protected Item getCrop()
    {
        return InitItemsEA.dragon_fruit;
    }

    
    
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(IBlockState state, World worldIn, BlockPos pos, Random rand)
    {
    	if(!EbonArtsConfiguration.plantParticle)
		{
    	if(worldIn.getLight(pos) >= 8 || worldIn.canSeeSky(pos))
    	{
    	
    	
    		int d = rand.nextInt(100) + 1;
    	
    	
    		if(d < 2)
    		{
    			//int amount = 20;

    			for (int i = 0; i < 8; ++i)
    			{
    				int j = rand.nextInt(2) * 2 - 1;
    				int k = rand.nextInt(2) * 2 - 1;
    				double d0 = (double)pos.getX() + 0.5D + 0.25D * (double)j;
    				double d1 = (double)((float)pos.getY() + (rand.nextFloat() * 0.25));
    				double d2 = (double)pos.getZ() + 0.5D + 0.25D * (double)k;
    				double d3 = (double)(rand.nextFloat() * (float)j);
    				double d4 = ((double)rand.nextFloat() - 0.5D) * 0.125D;
    				double d5 = (double)(rand.nextFloat() * (float)k);
    				worldIn.spawnParticle(
						EnumParticleTypes.PORTAL
						, d0, d1, d2, 0, 0, 0, new int[0]);
				
    			}
    		}
    	}
		}
    }
}
