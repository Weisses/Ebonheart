package com.ebonheart.EbonArtsMod.common.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.ebonheart.EbonArtsMod.compendium.CompendiumUnlockHandler;

public class EABlockContainer extends BlockContainer {

	protected EABlockContainer(Material materialIn) {
		super(materialIn);
		
	}
	
	//public EABlockContainer setUnlocalizedNameAndID(String name){
	//	setBlockTextureName(name);
	//	setBlockName(name);
	//	return this;
	//}
	
	//@Override
	//public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int face, float interactX, float interactY, float interactZ){
	//	if (world.isRemote)
	//		CompendiumUnlockHandler.unlockEntry(this.getUnlocalizedName().replace("tile.", "").replace("arsmagica2:", ""));
	//	return super.onBlockActivated(world, x, y, z, player, face, interactX, interactY, interactZ);
	//}
	
	
	
	
	
	
	
	
	
	

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
	
}
