package com.ebonheart.EbonArtsMod.common.blocks.world;

import java.util.ArrayList;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.blocks.BlockHelper;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;

public class BlockMultiOre extends Block {

	public BlockMultiOre(String unlocalizedName) {
		super(Material.rock);
		BlockHelper.setBlockName(this, unlocalizedName);
		
		this.setStepSound(stepSound.STONE);
		this.setHardness(40.0f);
		this.setResistance(2000f);
		this.setHarvestLevel("pickaxe", 3);
	}
	
	@Override
	public ArrayList<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState blockstate, int fortune) {
		ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
		drops.add(new ItemStack(Items.coal, RANDOM.nextInt(3) + 1));
		drops.add(new ItemStack(Items.iron_ingot, RANDOM.nextInt(2) + 1));
		drops.add(new ItemStack(Items.gold_ingot, RANDOM.nextInt(2) + 1));
		drops.add(new ItemStack(Items.dye, RANDOM.nextInt(3) + 2, 4));
		drops.add(new ItemStack(Items.redstone, RANDOM.nextInt(2) + 2));
		drops.add(new ItemStack(InitItemsEA.ebonheart));
		if (RANDOM.nextFloat() < 0.5F)
			drops.add(new ItemStack(Items.diamond));
		return drops;
	}
}
