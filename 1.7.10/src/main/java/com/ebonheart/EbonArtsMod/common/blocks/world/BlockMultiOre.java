package com.ebonheart.EbonArtsMod.common.blocks.world;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.blocks.BlockHelper;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;

public class BlockMultiOre extends Block {

	public BlockMultiOre(String unlocalizedName) {
		super(Material.rock);
		//BlockHelper.setBlockName(this, unlocalizedName);
		this.setBlockName(unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		this.setStepSound(soundTypeStone);
		this.setHardness(40.0f);
		this.setResistance(2000f);
		this.setHarvestLevel("pickaxe", 3);
	}
	
	@Override
	public ArrayList <ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune) 
	{	
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		Random rand = new Random();
		
		drops.add(new ItemStack(Items.coal, rand.nextInt(3) + 1));
		drops.add(new ItemStack(Items.iron_ingot, rand.nextInt(2) + 1));
		drops.add(new ItemStack(Items.gold_ingot, rand.nextInt(2) + 1));
		drops.add(new ItemStack(Items.dye, rand.nextInt(3) + 2, 4));
		drops.add(new ItemStack(Items.redstone, rand.nextInt(2) + 2));
		drops.add(new ItemStack(InitItemsEA.ebonheart));
		if (rand.nextFloat() < 0.5F)
			drops.add(new ItemStack(Items.diamond));
		return drops;
	}
}
