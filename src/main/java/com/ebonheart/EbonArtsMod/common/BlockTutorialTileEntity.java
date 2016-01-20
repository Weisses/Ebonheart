package com.ebonheart.EbonArtsMod.common;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockTutorialTileEntity extends BlockContainer {

	public BlockTutorialTileEntity() {
		super(Material.rock);
		this.setUnlocalizedName("tutorial_tile_entity");
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityTutorial();
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	@Override
	public int getRenderType() {
		return -1;
	}

}
