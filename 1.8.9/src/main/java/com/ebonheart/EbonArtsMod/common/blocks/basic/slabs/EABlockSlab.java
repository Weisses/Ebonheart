package com.ebonheart.EbonArtsMod.common.blocks.basic.slabs;

import java.util.List;
import java.util.Random;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockSlab.EnumBlockHalf;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.init.InitBlocksEA;

//Draconium slab/double slab main class.
public abstract class EABlockSlab extends BlockSlab {
	
	//The property used for the variant. Needed for interactions with ItemSlab.
	private static final PropertyBool VARIANT_PROPERTY = PropertyBool.create("variant");
	
	//The bit in metadata used by the half property.
	private static final int HALF_META_BIT = 8;
	
	public EABlockSlab() 
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
	
	
	/**
	//Gets the item dropped when the block is broken
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return Item.getItemFromBlock(InitBlocksEA.draconium_slab);
	}
  
	@SideOnly(Side.CLIENT)
	public Item getItem(World worldIn, BlockPos pos)
	{
		return Item.getItemFromBlock(InitBlocksEA.draconium_slab);
	}
	*/
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return this == InitBlocksEA.double_draconium_slab ? Item.getItemFromBlock(InitBlocksEA.draconium_slab)
		: (this == InitBlocksEA.double_velious_slab ? Item.getItemFromBlock(InitBlocksEA.velious_slab) 
		: (this == InitBlocksEA.double_arcanite_slab ? Item.getItemFromBlock(InitBlocksEA.arcanite_slab) 
		: (this == InitBlocksEA.double_katcheen_slab ? Item.getItemFromBlock(InitBlocksEA.katcheen_slab) 
		: (this == InitBlocksEA.double_necrocite_slab ? Item.getItemFromBlock(InitBlocksEA.necrocite_slab) 
		: (this == InitBlocksEA.double_soularite_slab ? Item.getItemFromBlock(InitBlocksEA.soularite_slab) 
		: (this == InitBlocksEA.double_ebonheart_slab ? Item.getItemFromBlock(InitBlocksEA.ebonheart_slab) 
		: (this == InitBlocksEA.double_obsidian_slab ? Item.getItemFromBlock(InitBlocksEA.obsidian_slab) 
		: (this == InitBlocksEA.double_glowstone_slab ? Item.getItemFromBlock(InitBlocksEA.glowstone_slab) 
		: Item.getItemFromBlock(this)))))))));
	}
	
	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
	{
		return this == InitBlocksEA.double_draconium_slab ? new ItemStack(InitBlocksEA.draconium_slab) 
		: (this == InitBlocksEA.double_velious_slab ? new ItemStack(InitBlocksEA.velious_slab) 
		: (this == InitBlocksEA.double_arcanite_slab ? new ItemStack(InitBlocksEA.arcanite_slab) 
		: (this == InitBlocksEA.double_katcheen_slab ? new ItemStack(InitBlocksEA.katcheen_slab) 
		: (this == InitBlocksEA.double_necrocite_slab ? new ItemStack(InitBlocksEA.necrocite_slab) 
		: (this == InitBlocksEA.double_soularite_slab ? new ItemStack(InitBlocksEA.soularite_slab) 
		: (this == InitBlocksEA.double_ebonheart_slab ? new ItemStack(InitBlocksEA.ebonheart_slab) 
		: (this == InitBlocksEA.double_obsidian_slab ? new ItemStack(InitBlocksEA.obsidian_slab) 
		: (this == InitBlocksEA.double_glowstone_slab ? new ItemStack(InitBlocksEA.glowstone_slab) 
		: new ItemStack(this)))))))));
	}
	
	//Picks the right item with mmb
	//public ItemStack getPickBlock(MovingObjectPosition target, World world, BlockPos pos, EntityPlayer player)
	//{
	//	return new ItemStack(InitBlocksEA.draconium_slab);
	//}
	
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


//Slab main class.
//public abstract class EABlockSlab extends BlockSlab {
	
	
	/**
	public static final PropertyBool SEAMLESS = PropertyBool.create("seamless");
	public static final PropertyEnum<EABlockSlab.EnumType> VARIANT = PropertyEnum.<EABlockSlab.EnumType>create("variant", EABlockSlab.EnumType.class);
	
	public EABlockSlab()
	{
		super(Material.rock);
		this.useNeighborBrightness = !this.isDouble();
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(5.0F);
		this.setStepSound(soundTypeStone);
		
		IBlockState iblockstate = this.blockState.getBaseState();
      
		if (this.isDouble())
		{
			iblockstate = iblockstate.withProperty(SEAMLESS, Boolean.valueOf(false));
		}
		else
		{
			iblockstate = iblockstate.withProperty(HALF, EABlockSlab.EnumBlockHalf.BOTTOM);
		}
		
		this.setDefaultState(iblockstate.withProperty(VARIANT, EABlockSlab.EnumType.STONE));
		
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return this == InitBlocksEA.double_draconium_slab ? Item.getItemFromBlock(InitBlocksEA.draconium_slab)
		: (this == InitBlocksEA.double_velious_slab ? Item.getItemFromBlock(InitBlocksEA.velious_slab) 
		: (this == InitBlocksEA.double_arcanite_slab ? Item.getItemFromBlock(InitBlocksEA.arcanite_slab) 
		: (this == InitBlocksEA.double_katcheen_slab ? Item.getItemFromBlock(InitBlocksEA.katcheen_slab) 
		: (this == InitBlocksEA.double_necrocite_slab ? Item.getItemFromBlock(InitBlocksEA.necrocite_slab) 
		: (this == InitBlocksEA.double_soularite_slab ? Item.getItemFromBlock(InitBlocksEA.soularite_slab) 
		: (this == InitBlocksEA.double_ebonheart_slab ? Item.getItemFromBlock(InitBlocksEA.ebonheart_slab) 
		: (this == InitBlocksEA.double_obsidian_slab ? Item.getItemFromBlock(InitBlocksEA.obsidian_slab) 
		: (this == InitBlocksEA.double_glowstone_slab ? Item.getItemFromBlock(InitBlocksEA.glowstone_slab) 
		: Item.getItemFromBlock(this)))))))));
	}
	
	public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
	{
		return this == InitBlocksEA.double_draconium_slab ? new ItemStack(InitBlocksEA.draconium_slab) 
		: (this == InitBlocksEA.double_velious_slab ? new ItemStack(InitBlocksEA.velious_slab) 
		: (this == InitBlocksEA.double_arcanite_slab ? new ItemStack(InitBlocksEA.arcanite_slab) 
		: (this == InitBlocksEA.double_katcheen_slab ? new ItemStack(InitBlocksEA.katcheen_slab) 
		: (this == InitBlocksEA.double_necrocite_slab ? new ItemStack(InitBlocksEA.necrocite_slab) 
		: (this == InitBlocksEA.double_soularite_slab ? new ItemStack(InitBlocksEA.soularite_slab) 
		: (this == InitBlocksEA.double_ebonheart_slab ? new ItemStack(InitBlocksEA.ebonheart_slab) 
		: (this == InitBlocksEA.double_obsidian_slab ? new ItemStack(InitBlocksEA.obsidian_slab) 
		: (this == InitBlocksEA.double_glowstone_slab ? new ItemStack(InitBlocksEA.glowstone_slab) 
		: new ItemStack(this)))))))));
	}
	
	public String getUnlocalizedName(int meta)
	{
		return this.getUnlocalizedName();
	}
	
	public IProperty<?> getVariantProperty()
	{
		return VARIANT;
	}
	
	public Comparable<?> getTypeForItem(ItemStack stack)
	{
		return EABlockSlab.EnumType.byMetadata(stack.getMetadata() & 0);
	}
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list)
	{
		list.add(new ItemStack(itemIn, 1, 0));
	}
	
	public IBlockState getStateFromMeta(int meta)
	{
		IBlockState iblockstate = this.getDefaultState().withProperty(VARIANT, EABlockSlab.EnumType.byMetadata(meta & 0));
		
		if (this.isDouble())
		{
			iblockstate = iblockstate.withProperty(SEAMLESS, Boolean.valueOf((meta & 8) != 0));
		}
		else
		{
			iblockstate = iblockstate.withProperty(HALF, (meta & 8) == 0 ? EABlockSlab.EnumBlockHalf.BOTTOM : EABlockSlab.EnumBlockHalf.TOP);
     	}
		
		return iblockstate;
	}
	
	public int getMetaFromState(IBlockState state)
	{
		int i = 0;
		i = i | ((EABlockSlab.EnumType)state.getValue(VARIANT)).getMetadata();
		
		if (this.isDouble())
		{
			if (((Boolean)state.getValue(SEAMLESS)).booleanValue())
			{
				i |= 8;
			}
		}
		else if (state.getValue(HALF) == EABlockSlab.EnumBlockHalf.TOP)
		{
			i |= 8;
		}
		
		return i;
	}
	
	protected BlockStateContainer createBlockState()
	{
		return this.isDouble() ? new BlockStateContainer(this, new IProperty[] {SEAMLESS, VARIANT}): new BlockStateContainer(this, new IProperty[] {HALF, VARIANT});
	}
	
	public int damageDropped(IBlockState state)
	{
		return ((EABlockSlab.EnumType)state.getValue(VARIANT)).getMetadata();
	}
	
	public static enum EnumType implements IStringSerializable
	{
		STONE(0, null, //MapColor.stoneColor, 
      		"stone");
      //,
      //SAND(1, MapColor.sandColor, "sandstone", "sand"),
      //WOOD(2, MapColor.woodColor, "wood_old", "wood"),
      //COBBLESTONE(3, MapColor.stoneColor, "cobblestone", "cobble"),
      //BRICK(4, MapColor.redColor, "brick"),
      //SMOOTHBRICK(5, MapColor.stoneColor, "stone_brick", "smoothStoneBrick"),
      //NETHERBRICK(6, MapColor.netherrackColor, "nether_brick", "netherBrick"),
      //QUARTZ(7, MapColor.quartzColor, "quartz");

		private static final EABlockSlab.EnumType[] META_LOOKUP = new EABlockSlab.EnumType[values().length];
		private final int meta;
		private final MapColor mapColorIn;
		private final String name;
		private final String unlocalizedName;
		
		
		private EnumType(int p_i46381_3_, MapColor p_i46381_4_, String p_i46381_5_)
		{
			this(p_i46381_3_, p_i46381_4_, p_i46381_5_, p_i46381_5_);
		}
		
		private EnumType(int p_i46382_3_, MapColor p_i46382_4_, String p_i46382_5_, String p_i46382_6_)
		{
			this.meta = p_i46382_3_;
			this.mapColorIn = p_i46382_4_;
			this.name = p_i46382_5_;
			this.unlocalizedName = p_i46382_6_;
		}
		
		public int getMetadata()
		{
			return this.meta;
		}
		
		public MapColor func_181074_c()
		{
			return this.mapColorIn;
		}
		
		public String toString()
		{
			return this.name;
		}
		
		public static EABlockSlab.EnumType byMetadata(int meta)
		{
			if (meta < 0 || meta >= META_LOOKUP.length)
			{
				meta = 0;
			}
     	    return META_LOOKUP[meta];
		}
		
		public String getName()
		{
			return this.name;
		}
		
		public String getUnlocalizedName()
		{
			return this.unlocalizedName;
		}
		
		static
		{
			for (EABlockSlab.EnumType EABlockSlab$enumtype : values())
			{
				META_LOOKUP[EABlockSlab$enumtype.getMetadata()] = EABlockSlab$enumtype;
			}
		}
	}
}
*/