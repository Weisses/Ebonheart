package com.ebonheart.EbonArtsMod.common.blocks.basic;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.BlockWall;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.proxy.CommonProxy;


public class EABlockWall extends BlockWall
//EABlockFence 
{
	
	//The UP property to render the wall at full height.
		private static final PropertyBool UP = PropertyBool.create("up");
		
		//lower bounds for the post.
		private static final float POST_MIN = 0.25f;
		
		//upper bounds for the post.
		private static final float POST_MAX = 0.75f;
		
		//lower bounds for wall.
		private static final float WALL_MIN = 0.3125f;
		
		//upper bounds for wall.
		private static final float WALL_MAX = 0.6875f;
		
		//Wall height without post.
		private static final float WALL_HEIGHT = 0.8125f;
		
		//The block on which the wall is based.
		private Block sourceBlock;
		
		//metadata on the source block.
		private int sourceMetadata;
		
		
	public EABlockWall(String unlocalizedName, Block blockIn) 
    {
		super(blockIn);
		//super(Blocks.brick_block, 0);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(stepSound.STONE);
	}
	
	


}
