package com.bedrockminer.tutorial.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.bedrockminer.tutorial.tileentity.ModTileEntity;

public class ModBlockTileEntity extends BlockContainer {

	protected ModBlockTileEntity(String unlocalizedName) {
		super(Material.iron);
		this.setUnlocalizedName(unlocalizedName);
		this.setHardness(2.0f);
		this.setResistance(6.0f);
		this.setHarvestLevel("pickaxe", 2);
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new ModTileEntity();
	}

	@Override
	public int getRenderType() {
		return 3;
	}
}
