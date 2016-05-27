package com.ebonheart.EbonArtsMod.common.blocks.world;

import java.util.Random;

import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.blocks.BlockHelper;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class HellionFruitCrop extends BlockCrops{
	
	Random random = new Random();
	
	public static final PropertyInteger HELLIONFRUITAGE = PropertyInteger.create("age", 0, 7);
	
	public HellionFruitCrop()
	{
		BlockHelper.setBlockName(this, "plant/hellion_fruit_crop");
		setCreativeTab(null);
		this.setBlockName("ores/draconium_ore");
		//this.setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
	}
	protected Item getSeed()
    {
        return InitItemsEA.hellion_fruit;
    }

    protected Item getCrop()
    {
        return InitItemsEA.hellion_fruit;
    }

    //public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    //{
    //    return HELLIONFRUIT_AABB[((Integer)state.getValue(this.getAgeProperty())).intValue()];
    //}
    
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
    //@SideOnly(Side.CLIENT)
    //public void randomDisplayTick(IBlockState state, World worldIn, BlockPos pos, Random rand)
    //{
    	
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
						EnumParticleTypes.FLAME
						, d0, d1, d2, 0, 0, 0, new int[0]);
				
    			}
    		}
    	}
    }
}
