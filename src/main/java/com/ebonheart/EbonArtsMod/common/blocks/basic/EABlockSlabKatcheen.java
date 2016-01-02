package com.ebonheart.EbonArtsMod.common.blocks.basic;

import java.util.Random;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.init.InitBlocksEA;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

//Draconium slab/double slab main class.
public abstract class EABlockSlabKatcheen extends BlockSlab {
	
	//The property used for the variant. Needed for interactions with ItemSlab.
	private static final PropertyBool VARIANT_PROPERTY = PropertyBool.create("variant");
	
	//The bit in metadata used by the half property.
	private static final int HALF_META_BIT = 8;
	
	public EABlockSlabKatcheen() 
	{
		super(Material.rock);
		this.useNeighborBrightness = !this.isDouble();
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(soundTypePiston);
		
		if (!this.isDouble()) 
		{
			setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		}
		
		IBlockState blockState = this.blockState.getBaseState();
		blockState = blockState.withProperty(VARIANT_PROPERTY, false);
		
		if (!this.isDouble()) 
		{
			blockState = blockState.withProperty(HALF, EnumBlockHalf.BOTTOM);
		}
		this.setDefaultState(blockState);
	}
	
	public static Item getItemFromBlock(final String name) 
	{
		return GameRegistry.findItem("ea", name);
	}
	
	//Gets the unlocalized name based on metadata/damage
	@Override
	public final String getUnlocalizedName(final int metadata) 
	{
		return this.getUnlocalizedName();
	}
	
	//Gets the value of the variant property based on the item
	@Override
	public final Object getVariant(final ItemStack itemStack) 
	{
		return false;
	}
	
	//Gets the variant property
	@Override
	public final IProperty getVariantProperty() 
	{
		return VARIANT_PROPERTY;
	}
	
	//Gets a block state from metadata
	@Override
	public final IBlockState getStateFromMeta(final int meta) 
	{
		IBlockState blockState = this.getDefaultState();
		blockState = blockState.withProperty(VARIANT_PROPERTY, false);
		
		if (!this.isDouble())
		{
			EnumBlockHalf value = EnumBlockHalf.BOTTOM;
			
			if ((meta & HALF_META_BIT) != 0) 
			{
				value = EnumBlockHalf.TOP;
			}
			blockState = blockState.withProperty(HALF, value);
		}
		return blockState;
	}
	
	//Gets the metadata value from a block state
	@Override
	public final int getMetaFromState(final IBlockState state) 
	{
		if (this.isDouble()) 
		{
			return 0;
		}
		
		if ((EnumBlockHalf) state.getValue(HALF) == EnumBlockHalf.TOP) 
		{
			return HALF_META_BIT;
		} 
		else 
		{
			return 0;
		}
	}
	
	//Gets the damage for the block's item when dropped
	@Override
	public final int damageDropped(final IBlockState state) 
	{
		return 0;
	}
	
	//Gets the item dropped when the block is broken
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return Item.getItemFromBlock(InitBlocksEA.katcheen_slab);
	}
    
	@SideOnly(Side.CLIENT)
	public Item getItem(World worldIn, BlockPos pos)
	{
		return Item.getItemFromBlock(InitBlocksEA.katcheen_slab);
	}
	
	//Picks the right item with mmb
	public ItemStack getPickBlock(MovingObjectPosition target, World world, BlockPos pos, EntityPlayer player)
	{
		return new ItemStack(InitBlocksEA.katcheen_slab);
	}
	
	//Creates the block state object
	@Override
	protected final BlockState createBlockState() 
	{
		if (this.isDouble()) 
		{
			return new BlockState(this, new IProperty[] {VARIANT_PROPERTY});
		} 
		else 
		{
			return new BlockState(this, new IProperty[] {VARIANT_PROPERTY, HALF});
		}
	}
	
	//Gets the ID of the block
	private String innerGetId(final boolean isDoubleStacked) 
	{
		String result = "";
		
		if (isDoubleStacked) 
		{
			result = "double_";
		}
		return result + "slab";
	}
}
