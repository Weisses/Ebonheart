package com.ebonheart.EbonArtsMod.common.tileentities.plants;

import java.util.Random;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BlockBananaPlantRoot extends Block implements ITileEntityProvider
{
	public static Item fruit;
	public static int fruitfallheight;
	public static int fruitminamount;
	public static int fruitmaxamount;
	public static int minimumlightleveltogrow;
	public static int growchancepercentage;
	public static int updatetickinterval;
	public static int spawnchildchancepercentage;
	public static int spawnchildmaxdistance;
	
	public static BlockBananaPlantSection bananaplantsection;
	
	public BlockBananaPlantRoot(Item Fruit, int FruitFallHeight, int FruitMinAmount, int FruitMaxAmount, float PlantHardness, float PlantResistance, int MinimumGrowLightLevel, int GrowChancePercentage, int UpdateTickInterval, int MinGenHeight, int MaxGenHeight, int MaxGenAmountPerChunk, int GenChancePercentage, int SpawnChildChancePercentage, int SpawnChildMaxDistance, BiomeGenBase[] GenBiomes)
	{
		super(Material.leaves);
		
		Blocks.fire.setFireInfo(this, 5, 5);
		
		this.isBlockContainer = true;
		this.setTickRandomly(true);
		this.setUnlocalizedName("bananaplant");
		this.setHardness(PlantHardness);
		this.setResistance(PlantResistance);
		this.setStepSound(soundTypeGrass);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		this.setHarvestLevel(HarvestToolEnum.AXE, HarvestLevelEnum.WOOD);
		
		this.fruit = Fruit;
    	this.fruitfallheight = FruitFallHeight;
    	this.fruitminamount = FruitMinAmount;
    	this.fruitmaxamount = FruitMaxAmount;
    	this.minimumlightleveltogrow = MinimumGrowLightLevel;  
    	this.growchancepercentage = GrowChancePercentage;
    	this.spawnchildchancepercentage = SpawnChildChancePercentage;
    	this.spawnchildmaxdistance = SpawnChildMaxDistance;
    	this.updatetickinterval = UpdateTickInterval;
    	
    	this.bananaplantsection = new BlockBananaPlantSection(this, Fruit, FruitFallHeight, FruitMinAmount, FruitMaxAmount, PlantHardness, PlantResistance, BlockBananaPlantRoot.HarvestToolEnum.AXE, BlockBananaPlantRoot.HarvestLevelEnum.WOOD);
    	
    	GameRegistry.registerBlock(this, "bananaplant");
    	ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBananaPlant.class, new TileEntityBananaPlantRenderer());
    	GameRegistry.registerTileEntity(TileEntityBananaPlant.class, "TileEntityBananaPlant");
	}
	
	public boolean hasTileEntity()
	{
        return true;
    }
	
	public TileEntity createNewTileEntity(World world, int meta) 
	{		
		return new TileEntityBananaPlant();
	}
	
	public void RegisterRenderers()
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(this), 0, new ModelResourceLocation(Reference.MOD_ID +":" + "bananaplant", "inventory"));
	}
	
	public int tickRate(World world)
    {
        return this.updatetickinterval;
    }
	
	public boolean canHarvestBlock(IBlockAccess world, BlockPos pos, EntityPlayer player)
    {
        return false;
    }
	
	public void dropBlockAsItemWithChance(World world, BlockPos pos, IBlockState state, float chance, int fortune){}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
    	return null;
    }
	
	public boolean canPlaceBlockOn(Block ground)
    {
    	return ground == Blocks.dirt || ground == Blocks.grass;
    }
	
	public boolean canPlaceBlockAt(World world, BlockPos pos)
    {     
        return super.canPlaceBlockAt(world, pos) && this.canPlaceBlockOn(world.getBlockState(pos.down()).getBlock());
    }
	
	public boolean canStay(World world, BlockPos pos, IBlockState state)
	{
		return world.getLight(pos) >= 8 && this.canPlaceBlockOn(world.getBlockState(pos.down()).getBlock());
	}
	
	public void DropPlantItems(World world, BlockPos pos)
	{
		spawnAsEntity(world, pos, new ItemStack(Item.getItemFromBlock(this),1));		
		TileEntityBananaPlant BananaPlant = (TileEntityBananaPlant)world.getTileEntity(pos);		
    	if(BananaPlant != null)
		{
			if(BananaPlant.getAge() == 7)
			{
				Random rand = world.rand;
				int amount = MathHelper.getRandomIntegerInRange(rand, this.fruitminamount, this.fruitmaxamount);
				spawnAsEntity(world, pos.up(this.fruitfallheight-1), new ItemStack(this.fruit, amount));
			}
		}
	}
	
	public void setBlockBoundsBasedOnState(IBlockAccess world, BlockPos pos) 
	{		
		TileEntityBananaPlant BananaPlant = (TileEntityBananaPlant)world.getTileEntity(pos);
		if(BananaPlant != null)
		{			
			if(BananaPlant.getAge() == 0)
			{
				world.getBlockState(pos).getBlock().setBlockBounds(0.35F, 0.0F, 0.35F, 0.65F, 0.5F, 0.65F);
			}
			else if(BananaPlant.getAge() == 1)
			{
				world.getBlockState(pos).getBlock().setBlockBounds(0.4F, 0.0F, 0.4F, 0.6F, 1.0F, 0.6F);
			}
			else
			{
				world.getBlockState(pos).getBlock().setBlockBounds(0.35F, 0.0F, 0.35F, 0.65F, 1.0F, 0.65F);
			}
		}	
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
	
	public void onBlockPlacedBy(World world, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack)
    {		
        super.onBlockPlacedBy(world, pos, state, placer, stack);
    }
	
	public int getRenderType()
    {
    	return -1;
    }
	
	public boolean canGrowThrough(Block block)
    {
    	return (block == Blocks.air || block == this.bananaplantsection);
    }
	
	public boolean hasRoomForAge(World world, BlockPos pos, int newAge)
    {
    	if(newAge == 0)
    	{
    		return true;
    	}
    	else if(newAge == 1)
    	{
    		if(this.canGrowThrough(world.getBlockState(pos.up(1)).getBlock()))
    		{
    			return true;
    		}
    	}
    	else if(newAge >= 2)
    	{
    		if(this.canGrowThrough(world.getBlockState(pos.up(1)).getBlock()) && this.canGrowThrough(world.getBlockState(pos.up(2)).getBlock()) && this.canGrowThrough(world.getBlockState(pos.up(3)).getBlock()))
    		{
    			return true;
    		}
    	}
    	return false;
    }
	
	public void KillPlant(World world, BlockPos pos, boolean dropitems)
    {
		if(dropitems)
		{
			this.DropPlantItems(world, pos);
		}		
		for(int i = 0; i <= 3; i++)
		{
			if(world.getBlockState(pos.up(i)).getBlock() == this || world.getBlockState(pos.up(i)).getBlock() == this.bananaplantsection)
			{				
				world.setBlockToAir(pos.up(i));				
			}
		}		
    }
	
	public boolean isBaby(World world, BlockPos pos)
    {
    	TileEntityBananaPlant BananaPlant = (TileEntityBananaPlant)world.getTileEntity(pos);
		if(BananaPlant != null)
		{
			if(BananaPlant.getAge() == 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}		
		return true;
    }
	
	public void setPlantAge(World world, BlockPos pos, int age)
	{				
		if(this.hasRoomForAge(world, pos, age))
		{
			for (int i = 1; i < 4; i++)
			{
				if(world.getBlockState(pos.up(i)).getBlock() == this.bananaplantsection)
				{
					world.setBlockToAir(pos.up(i));
				}				
			}
			
			if(age == 0)
	    	{
				world.setBlockState(pos, this.getDefaultState());
	        	TileEntity tileentity = world.getTileEntity(pos);
				if(tileentity instanceof TileEntityBananaPlant)
				{
					((TileEntityBananaPlant) tileentity).setAge(0);
				}
	    	}
			else if(age == 1)
	    	{
				world.setBlockState(pos, this.getDefaultState());
	        	TileEntity tileentity = world.getTileEntity(pos);
				if(tileentity instanceof TileEntityBananaPlant)
				{
					((TileEntityBananaPlant) tileentity).setAge(1);				
				}
	    		world.setBlockState(pos.up(1), this.bananaplantsection.getDefaultState());
	        	TileEntity childtileentity = world.getTileEntity(pos.up(1));
				if(childtileentity instanceof TileEntityBananaPlant)
				{
					((TileEntityBananaPlant) childtileentity).setAgeTier(1,2);
				}
	    	}
	    	else if(age >= 2)
	    	{
	    		world.setBlockState(pos, this.getDefaultState());
	        	TileEntity tileentity = world.getTileEntity(pos);
				if(tileentity instanceof TileEntityBananaPlant)
				{
					((TileEntityBananaPlant) tileentity).setAge(age);
				}
	    		world.setBlockState(pos.up(1), this.bananaplantsection.getDefaultState());
	        	TileEntity childtileentity = world.getTileEntity(pos.up(1));
				if(childtileentity instanceof TileEntityBananaPlant)
				{
					((TileEntityBananaPlant) childtileentity).setAgeTier(age,2);
				}
				world.setBlockState(pos.up(2), this.bananaplantsection.getDefaultState());
	        	childtileentity = world.getTileEntity(pos.up(2));
				if(childtileentity instanceof TileEntityBananaPlant)
				{
					((TileEntityBananaPlant) childtileentity).setAgeTier(age,3);
				}
				world.setBlockState(pos.up(3), this.bananaplantsection.getDefaultState());
	        	childtileentity = world.getTileEntity(pos.up(3));
				if(childtileentity instanceof TileEntityBananaPlant)
				{
					((TileEntityBananaPlant) childtileentity).setAgeTier(age,4);
				}
	    	}
		}
	}
	
	public boolean refreshstate(World world, BlockPos pos, IBlockState state)
    {
    	if(!this.canStay(world, pos, state))
		{
			this.KillPlant(world, pos, true);
			return true;
		}	
    	return false;
    }
	
	public boolean removedByPlayer(World world, BlockPos pos, EntityPlayer player, boolean willHarvest)
    {
    	this.KillPlant(world, pos, true);
        return true;
    }
	
	public AxisAlignedBB getCollisionBoundingBox(World world, BlockPos pos, IBlockState state)
    {		
        if(this.isBaby(world, pos))
        {
        	return null;
        }
        else
        {
        	return super.getCollisionBoundingBox(world, pos, state);
        }
    }
	
	public void KillIfInvalid(World world, BlockPos pos)
    {
    	TileEntityBananaPlant BananaPlant = (TileEntityBananaPlant)world.getTileEntity(pos);
		if(BananaPlant != null)
		{		
	    	if(BananaPlant.getAge() == 1)
	    	{
	    		if(world.getBlockState(pos.up(1)).getBlock() != this.bananaplantsection)
	    		{
	    			this.KillPlant(world, pos, false);
	    		}
	    	}
	    	else if(BananaPlant.getAge() >= 2)
	    	{    		
	    		if(world.getBlockState(pos.up(1)).getBlock() != this.bananaplantsection || world.getBlockState(pos.up(2)).getBlock() != this.bananaplantsection || world.getBlockState(pos.up(3)).getBlock() != this.bananaplantsection)
	    		{
	    			this.KillPlant(world, pos, false);
	    		}
	    	}
		}			
    }
	
	public void SproutChildNearby(World world, BlockPos pos, Random rand)
	{
		if (world.getLightFromNeighbors(pos.up()) >= 15)
		{		
			int randval = MathHelper.getRandomIntegerInRange(rand, 0, 100);
			if (randval <= this.spawnchildchancepercentage)
			{				
				TileEntityBananaPlant BananaPlant = (TileEntityBananaPlant)world.getTileEntity(pos);
				if(BananaPlant != null)
				{
					if(BananaPlant.getAge() == 7)
					{						
						int xRand = MathHelper.getRandomIntegerInRange(rand, -this.spawnchildmaxdistance, this.spawnchildmaxdistance);
						int yRand = MathHelper.getRandomIntegerInRange(rand, -this.spawnchildmaxdistance, this.spawnchildmaxdistance);
						int zRand = MathHelper.getRandomIntegerInRange(rand, -this.spawnchildmaxdistance, this.spawnchildmaxdistance);
						
						if (xRand == 0 && yRand == 0 && zRand == 0)
						{
							return;
						}
						
						BlockPos blockpos = pos.add(xRand, yRand, zRand);						
						if(world.getBlockState(blockpos).getBlock() == Blocks.air && world.getBlockState(blockpos.down()).getBlock() == Blocks.grass)
						{
							world.setBlockState(blockpos, this.getDefaultState());
						}
					}
				}		
			}
		}
	}
	
	public void AgeUp(World world, BlockPos pos, Random rand)
	{
		if(!this.refreshstate(world, pos, world.getBlockState(pos)))			
		{			
			TileEntityBananaPlant BananaPlant = (TileEntityBananaPlant)world.getTileEntity(pos);
			if(BananaPlant != null)
			{
				if(BananaPlant.getAge() < 7)
				{
					if (world.getLightFromNeighbors(pos.up()) >= this.minimumlightleveltogrow)
					{		
						int randval = MathHelper.getRandomIntegerInRange(rand, 0, 100);
						if (randval <= this.growchancepercentage)
						{				
							this.setPlantAge(world, pos, BananaPlant.getAge()+1);
						}
					}		
				}
				else
				{
					this.SproutChildNearby(world, pos, rand);
				}
			}
		}
	}
	
	public void onNeighborBlockChange(World world, BlockPos pos, IBlockState state, Block neighborBlock)
    {
        super.onNeighborBlockChange(world, pos, state, neighborBlock);
        this.refreshstate(world, pos, state);
    }
	
	public void updateTick(World world, BlockPos pos, IBlockState state, Random rand)
    {			
		if(!world.isRemote)
		{			
			this.KillIfInvalid(world, pos);
			this.AgeUp(world, pos, rand);
		}
    }
	
	public void onBlockAdded(World world, BlockPos pos, IBlockState state) 
	{
	}
	
	
	public void setHarvestLevel(HarvestToolEnum harvesttool, HarvestLevelEnum harvestlevel)
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
	
	
	
	public static enum HarvestToolEnum
	{
		PICKAXE,
		SHOVEL,
		AXE;		
	}	
	public static enum HarvestLevelEnum
	{
		WOOD,
		STONE,
		IRON,
		DIAMOND,
		GOLD;
	}
	
	
}
