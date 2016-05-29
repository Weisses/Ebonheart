package com.ebonheart.EbonArtsMod.common.blocks.world;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.blocks.BlockHelperOLDOLDOLD;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;

public class BlockOreDraconium extends Block {
	private Item drop;
	public BlockOreDraconium(int harvestlevel, float lightlevel, float hardness) 
	{
		super(Material.rock);
		//BlockHelper.setBlockName(this, "ore/draconium_ore");
		this.setBlockName("ores/draconium_ore");
		this.setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		this.setHarvestLevel("pickaxe", harvestlevel); //("pickaxe", 2) is iron
		this.setHardness(hardness);
		this.setResistance(5f);
		this.setStepSound(soundTypeStone);
		this.setLightLevel(lightlevel);
		//this.drop = drop;
	}
	@Override
    public ArrayList <ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) 
    {
        //return super.getDrops(world, x, y, z, metadata, fortune);
    //}
	//@Override
	//public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    //{
	//@Override
	//public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
	//{
		Random rand = new Random();
		int d = rand.nextInt(100) + 1;
		
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		drops.add(new ItemStack(InitItemsEA.draconium_dust));
		if (d < 50)
			drops.add(new ItemStack(InitItemsEA.ebonheart));
		return drops;
	}
    
    //public int quantityDroppedWithBonus(int fortune, Random random)
    //{
    //    if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped((IBlockState)this.getBlockState().getValidStates().iterator().next(), random, fortune))
    //    {
    //        int j = random.nextInt(fortune + 2) - 1;

    //        if (j < 0)
    //        {
    //            j = 0;
    //        }
    //        return this.quantityDropped(random) * (j + 1);
    //    }
    //    else
    //    {
    //        return this.quantityDropped(random);
    //    }
    //}
	
	public int quantityDroppedWithBonus(int p_149679_1_, Random p_149679_2_)
    {
        if (p_149679_1_ > 0 && Item.getItemFromBlock(this) != this.getItemDropped(0, p_149679_2_, p_149679_1_))
        {
            int j = p_149679_2_.nextInt(p_149679_1_ + 2) - 1;

            if (j < 0)
            {
                j = 0;
            }

            return this.quantityDropped(p_149679_2_) * (j + 1);
        }
        else
        {
            return this.quantityDropped(p_149679_2_);
        }
    }
    
    //public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player) 
    //{
	////	return true;
    //}
    //*/
}
