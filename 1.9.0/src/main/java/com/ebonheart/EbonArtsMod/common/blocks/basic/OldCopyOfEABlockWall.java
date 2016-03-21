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


public class OldCopyOfEABlockWall extends BlockWall
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
		
		
	public OldCopyOfEABlockWall(String unlocalizedName, Block blockIn) 
    {
		super(blockIn);
		//super(Blocks.brick_block, 0);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(stepSound.STONE);
	}
	
	
	
	
	//@Override
	public final void setBlockBoundsBasedOnState(final IBlockAccess blockAccess, final BlockPos pos) 
	{
		boolean north = this.canConnectTo(blockAccess, pos.north());
		boolean south = this.canConnectTo(blockAccess, pos.south());
		boolean west = this.canConnectTo(blockAccess, pos.west());
		boolean east = this.canConnectTo(blockAccess, pos.east());
		boolean up = this.canConnectUp(blockAccess, pos);
		float f = POST_MIN;
		float f1 = POST_MAX;
		float f2 = POST_MIN;
		float f3 = POST_MAX;
		float f4 = 1.0f;
		
		if (north) 
		{
			f2 = 0.0f;
		}
		
		if (south) 
		{
			f3 = 1.0f;
		}
		
		if (west) 
		{
			f = 0.0f;
		}
		
		if (east) 
		{
			f1 = 1.0f;
		}
		
		if (north && south && !west && !east) 
		{
			if (up) 
			{
				f4 = 1.0f;
				f = POST_MIN;
				f1 = POST_MAX;
			} 
			else 
			{
				f4 = WALL_HEIGHT;
				f = WALL_MIN;
				f1 = WALL_MAX;
			}
		} 
		else if (!north && !south && west && east) 
		{
			if (up) 
			{
				f4 = 1.0f;
				f2 = POST_MIN;
				f3 = POST_MAX;
			} 
			else 
			{
				f4 = WALL_HEIGHT;
				f2 = WALL_MIN;
				f3 = WALL_MAX;
			}
		}
		this.setBlockBoundsBasedOnState(f, pos);
		//.setBlockBounds(f, 0.0f, f2, f1, f4, f3);
	}
	
	//@Override
	public final boolean canConnectTo(final IBlockAccess blockAccess, final BlockPos pos) 
	{
		IBlockState blockState = blockAccess.getBlockState(pos);
		Block block = blockState.getBlock();
		
		if (block instanceof BlockWall || block instanceof net.minecraft.block.BlockFenceGate) 
		{
			return true;
		}
		
		if (block instanceof OldCopyOfEABlockWall || block instanceof com.ebonheart.EbonArtsMod.common.blocks.basic.EABlockFenceGate) 
		{
			return true;
		}
		
		if (block.getMaterial(getDefaultState())
				//.getMaterial()
				.isOpaque() && block.isFullCube(getDefaultState())
				//.isFullCube()
				) 
		{
			return block.getMaterial(getDefaultState()) != Material.gourd;
		}
		return false;
	}
	
	@Override
	public final IBlockState getActualState(final IBlockState state, final IBlockAccess blockAccess, final BlockPos pos) 
	{
		boolean isUp = this.canConnectUp(blockAccess, pos);
		return state
            .withProperty(
                BlockFence.NORTH,
                this.canConnectTo(blockAccess, pos.north()))
            .withProperty(
                BlockFence.SOUTH,
                this.canConnectTo(blockAccess, pos.south()))
            .withProperty(
                BlockFence.WEST,
                this.canConnectTo(blockAccess, pos.west()))
            .withProperty(
                BlockFence.EAST,
                this.canConnectTo(blockAccess, pos.east()))
            .withProperty(UP, isUp);
	}
	
	protected final BlockStateContainer createBlockState() 
	{
		IProperty[] props = new IProperty[] {BlockFence.NORTH, BlockFence.EAST,	BlockFence.WEST, BlockFence.SOUTH, UP};
		return new BlockStateContainer(this, props);
	}
	
	private boolean canConnectUp(final IBlockAccess blockAccess, final BlockPos pos) 
	{
		// draw the wall at full height if a torch is on top, but not if a
		// torch is anywhere else.
		BlockPos upPos = pos.up();
		IBlockState upState = blockAccess.getBlockState(upPos);
		Block upBlock = upState.getBlock();
		return upBlock instanceof net.minecraft.block.BlockTorch || upBlock instanceof com.ebonheart.EbonArtsMod.common.blocks.basic.torches.OldEABlockTorchArcanite
				 ||
				this.canConnectTo(blockAccess, upPos);
	}
}
