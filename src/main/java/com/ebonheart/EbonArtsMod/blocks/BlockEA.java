package com.ebonheart.EbonArtsMod.blocks;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.compendium.CompendiumUnlockHandler;
import com.google.common.collect.ImmutableSet;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockEA extends Block {

	
	public ImmutableSet<IBlockState> states;
	  
	  public BlockEA(Material material)
	  {
	    super(material);
	    //this.states = BlockStateUtils.getValidStatesForProperties(func_176223_P(), getProperties());
	    //func_149647_a(EbonArtsMod.tabEbonArts);
	    //func_149752_b(2.0F);
	  }
	  
	 

	//@Override
	//public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int face, float interactX, float interactY, float interactZ){
	//	if (!world.isRemote)
	//		CompendiumUnlockHandler.unlockEntry(this.getUnlocalizedName().replace("tile.", "").replace("arsmagica2:", ""));
	//	return super.onBlockActivated(world, x, y, z, player, face, interactX, interactY, interactZ);
	//}
}
