package com.ebonheart.EbonArtsMod.tileentity;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockBananaPlantSection extends Block implements ITileEntityProvider
{
	public static Item fruit;
	public static int fruitfallheight;
	public static int fruitminamount;
	public static int fruitmaxamount;
	public static BlockBananaPlantRoot RootBlock;	
	
	public BlockBananaPlantSection(BlockBananaPlantRoot rootblock, Item Fruit, int FruitFallHeight, int FruitMinAmount, int FruitMaxAmount, float PlantHardness, float PlantResistance, BlockBananaPlantRoot.HarvestToolEnum harvesttool, BlockBananaPlantRoot.HarvestLevelEnum harvestlevel)
	{
		super(Material.leaves);
		
		Blocks.fire.setFireInfo(this, 5, 5);
		this.isBlockContainer = true;
		this.setTickRandomly(true);
		
		this.setUnlocalizedName("bananaplantsection");
		this.setHardness(PlantHardness);
		this.setResistance(PlantResistance);
		this.setStepSound(soundTypeGrass);
		this.setHarvestLevel(harvesttool, harvestlevel);
		
		this.fruit = Fruit;
    	this.fruitfallheight = FruitFallHeight;
    	this.fruitminamount = FruitMinAmount;
    	this.fruitmaxamount = FruitMaxAmount;
    	this.RootBlock = rootblock;
    	
    	GameRegistry.registerBlock(this, "bananaplantsection");
	}
	
	public boolean hasTileEntity()
	{
        return true;
    }
	
	public TileEntity createNewTileEntity(World world, int meta) 
	{		
		return new TileEntityBananaPlant();
	}
	
	public void KillSelf(World world, BlockPos pos)
    {
    	world.setBlockToAir(pos);
    }
	
	public BlockPos findRootBlock(World world, BlockPos pos)
    {
    	for(int i = 0; i < 4; i++)
    	{
    		if(world.getBlockState(pos.down(i)).getBlock() instanceof BlockBananaPlantRoot)
    		{
    			return pos.down(i);
    		}
    	}
    	return null;
    }
	
	public void DropPlantItems(World world, BlockPos parentpos, TileEntityBananaPlant parenttileentity)
	{
		spawnAsEntity(world, parentpos, new ItemStack(Item.getItemFromBlock(this.RootBlock),1));
    	if(parenttileentity != null)
		{
			if(parenttileentity.getAge() == 7)
			{
				Random rand = world.rand;
				int amount = MathHelper.getRandomIntegerInRange(rand, this.fruitminamount, this.fruitmaxamount);
				spawnAsEntity(world, parentpos.up(this.fruitfallheight-1), new ItemStack(this.fruit, amount));				
			}
		}
	}
	
	public void KillPlant(World world, BlockPos pos, boolean dropitems)
    {
    	this.KillSelf(world, pos);
    	BlockPos parentpos = this.findRootBlock(world, pos);      	
    	if(parentpos != null)
    	{    	
    		if(dropitems)
    		{
    			this.DropPlantItems(world, parentpos, (TileEntityBananaPlant)world.getTileEntity(parentpos));
    		}		
	    	for(int i = 0; i < 4; i++)
			{			 
				if(world.getBlockState(parentpos.up(i)).getBlock() == this.RootBlock || world.getBlockState(parentpos.up(i)).getBlock() == this)
				{
					world.setBlockToAir(parentpos.up(i));
				}
			}	    	
    	}
    }
	
	public void KillIfInvalid(World world, BlockPos pos)
    {
    	if(this.findRootBlock(world, pos) == null)
		{
			this.KillSelf(world, pos);
		}
    }
	
	public boolean canPlaceBlockOn(Block ground)
    {
    	return ground == this.RootBlock || ground == this;
    }
	
	public void setPlantAge(World world, BlockPos pos, int age)
	{		
		BlockPos parentpos = this.findRootBlock(world, pos);
		if(parentpos != null)
		{
			for (int i = 1; i <= 3; i++)
			{
				if(world.getBlockState(parentpos.up(i)).getBlock() == this)
				{
					world.setBlockToAir(parentpos.up(i));
				}					
			}
			
			if(age == 0)
	    	{
				world.setBlockState(parentpos, this.RootBlock.getDefaultState());
	        	TileEntity tileentity = world.getTileEntity(parentpos);
				if(tileentity instanceof TileEntityBananaPlant)
				{
					((TileEntityBananaPlant) tileentity).setAge(0);
				}
	    	}
	    	if(age == 1)
	    	{
	    		world.setBlockState(parentpos, this.RootBlock.getDefaultState());
	        	TileEntity tileentity = world.getTileEntity(parentpos);
				if(tileentity instanceof TileEntityBananaPlant)
				{
					((TileEntityBananaPlant) tileentity).setAge(1);
				}
	    		world.setBlockState(parentpos.up(1), this.getDefaultState());
	        	TileEntity childtileentity = world.getTileEntity(parentpos.up(1));
				if(childtileentity instanceof TileEntityBananaPlant)
				{
					((TileEntityBananaPlant) childtileentity).setAgeTier(1,2);
				}
	    	}
	    	else if(age >= 2)
	    	{
	    		world.setBlockState(parentpos, this.RootBlock.getDefaultState());
	        	TileEntity tileentity = world.getTileEntity(parentpos);
				if(tileentity instanceof TileEntityBananaPlant)
				{
					((TileEntityBananaPlant) tileentity).setAge(age);					
				}
	    		world.setBlockState(parentpos.up(1), this.getDefaultState());
	        	TileEntity childtileentity = world.getTileEntity(parentpos.up(1));
				if(childtileentity instanceof TileEntityBananaPlant)
				{
					((TileEntityBananaPlant) childtileentity).setAgeTier(age,2);
				}
				world.setBlockState(parentpos.up(2), this.getDefaultState());
	        	childtileentity = world.getTileEntity(parentpos.up(2));
				if(childtileentity instanceof TileEntityBananaPlant)
				{
					((TileEntityBananaPlant) childtileentity).setAgeTier(age,3);
				}
				world.setBlockState(parentpos.up(3), this.getDefaultState());
	        	childtileentity = world.getTileEntity(parentpos.up(3));
				if(childtileentity instanceof TileEntityBananaPlant)
				{
					((TileEntityBananaPlant) childtileentity).setAgeTier(age,4);
				}
	    	}   
		}
	}
	
	public void updateTick(World world, BlockPos pos, IBlockState state, Random rand)
	{
		this.KillIfInvalid(world, pos);
	}
	
	public boolean canHarvestBlock(IBlockAccess world, BlockPos pos, EntityPlayer player)
    {
        return false;
    }
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
    	return null;
    }
	
	public void dropBlockAsItemWithChance(World world, BlockPos pos, IBlockState state, float chance, int fortune){}
	
	public boolean canPlaceBlockAt(World world, BlockPos pos)
    {
        return super.canPlaceBlockAt(world, pos) && this.canPlaceBlockOn(world.getBlockState(pos.offset(EnumFacing.DOWN)).getBlock());
    }
	
	public boolean isReplaceable(World world, BlockPos pos)
    {
        return false;
    }
	
	public boolean isOpaqueCube() 
    {
    	return false;
    }
	
	public boolean isFullCube()
    {
        return false;
    }
	
	public void onBlockHarvested(World world, BlockPos pos, IBlockState state, EntityPlayer player){}
	
	public void harvestBlock(World world, EntityPlayer player, BlockPos pos, IBlockState state, TileEntity te){}
	
	public boolean removedByPlayer(World world, BlockPos pos, EntityPlayer player, boolean willHarvest)
    {
    	this.KillPlant(world, pos, true);
        return true;
    }
	
	public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack){}
	
	public int getRenderType() 
    {
    	return -1;
    }
	
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ)
	{			
		if(!world.isRemote)
		{
			TileEntityBananaPlant BananaPlant = (TileEntityBananaPlant)world.getTileEntity(pos);
			if(BananaPlant != null)
			{				
				if(BananaPlant.getAge() == 7 && BananaPlant.getTier() == this.fruitfallheight)
				{				
					Random rand = world.rand;
					int amount = MathHelper.getRandomIntegerInRange(rand, this.fruitminamount, this.fruitmaxamount);
								
					this.setPlantAge(world, pos, 4);
					spawnAsEntity(world, pos, new ItemStack(this.fruit, amount));
				}
			}
		}
		return true;
	}
	
	public void setBlockBoundsBasedOnState(IBlockAccess world, BlockPos pos) 
	{
		TileEntityBananaPlant BananaPlant = (TileEntityBananaPlant)world.getTileEntity(pos);
		if(BananaPlant != null)
		{
			if(((TileEntityBananaPlant) BananaPlant).getTier() == 2)
			{
				world.getBlockState(pos).getBlock().setBlockBounds(0.35F, 0.0F, 0.35F, 0.65F, 1.0F, 0.65F);
			}
			else if(((TileEntityBananaPlant) BananaPlant).getTier() == 3)
			{
				if(((TileEntityBananaPlant) BananaPlant).getAge() == 5)
				{
					world.getBlockState(pos).getBlock().setBlockBounds(0.2F, 0.0F, 0.2F, 0.8F, 1.0F, 0.8F);
				}
				else if(((TileEntityBananaPlant) BananaPlant).getAge() == 6 || ((TileEntityBananaPlant) BananaPlant).getAge() == 7)
				{
					world.getBlockState(pos).getBlock().setBlockBounds(0.1F, 0.0F, 0.1F, 0.9F, 1.0F, 0.9F);
				}
				else
				{
					world.getBlockState(pos).getBlock().setBlockBounds(0.35F, 0.0F, 0.35F, 0.65F, 1.0F, 0.65F);
				}
			}
			else if(((TileEntityBananaPlant) BananaPlant).getTier() == 4)
			{
				if(((TileEntityBananaPlant) BananaPlant).getAge() == 2)
				{
					world.getBlockState(pos).getBlock().setBlockBounds(0.2F, 0.0F, 0.2F, 0.8F, 0.9F, 0.8F);
				}
				else
				{
					world.getBlockState(pos).getBlock().setBlockBounds(-1.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F);
				}
			}
		}	
	}
	
	
	
	public void setHarvestLevel(BlockBananaPlantRoot.HarvestToolEnum harvesttool, BlockBananaPlantRoot.HarvestLevelEnum harvestlevel)
    {
		int level;
		String tool;
		
		switch(harvesttool)
		{
			case PICKAXE:
				tool = "pickaxe";
				break;
			case SHOVEL:
				tool = "shovel";
				break;
			case AXE:
				tool = "axe";
				break;
			default:
				tool = "pickaxe";
		}
		switch(harvestlevel)
		{
			case WOOD:
				level = 0;
				break;
			case STONE:
				level = 1;
				break;
			case IRON:
				level = 2;
				break;
			case DIAMOND:
				level = 3;
				break;
			case GOLD:
				level = 0;
				break;
			default:
				level = 0;
		}
		super.setHarvestLevel(tool, level);
    }
	
}
