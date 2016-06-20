package com.ebonheart.EbonArtsMod.common.entity;

import java.util.List;

import javax.annotation.Nullable;

import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityWaterMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.network.play.client.CPacketSteerBoat;
import net.minecraft.stats.AchievementList;
import net.minecraft.stats.StatBase;
import net.minecraft.stats.StatList;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.EntitySelectors;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.ebonheart.EbonArtsMod.common.entity.EntityAirship.Type;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;
import com.google.common.collect.Lists;

public class EntityAirshipEA extends EntityBoat implements IInventory {

	private static final DataParameter<Integer> BOAT_TYPE = EntityDataManager.<Integer>createKey(EntityAirshipEA.class, DataSerializers.VARINT);
    
	private boolean leftInputDown;
    private boolean rightInputDown;
    private boolean forwardInputDown;
    private boolean backInputDown;
    private boolean upInputDown;
    private float deltaRotation;
    
    private int lerpSteps;
    private double boatPitch;
    private double lerpY;
    private double lerpZ;
    private double boatYaw;
    private double lerpXRot;
    
    private float[] paddlePositions;
    private float momentum;
    
    
	public EntityAirshipEA(World worldIn)
    {
        super(worldIn);
        //this.paddlePositions = new float[2];
        this.preventEntitySpawning = true;
        this.setSize(1.375F, 0.5625F);
    }

    public EntityAirshipEA(World worldIn, double x, double y, double z)
    {
        this(worldIn);
        this.setPosition(x, y, z);
        this.motionX = 0.0D;
        this.motionY = 0.0D;
        this.motionZ = 0.0D;
        this.prevPosX = x;
        this.prevPosY = y;
        this.prevPosZ = z;
    }
    
    @Override
    public Item getItemBoat()
    {
        switch (this.getBoatType())
        {
            case OAK:
            default:
                return InitItemsEA.ebon_airship;
            //case SPRUCE:
            //    return Items.SPRUCE_BOAT;
            //case BIRCH:
            //    return Items.BIRCH_BOAT;
            //case JUNGLE:
            //    return Items.JUNGLE_BOAT;
            //case ACACIA:
            //    return Items.ACACIA_BOAT;
            //case DARK_OAK:
            //    return Items.DARK_OAK_BOAT;
        }
    }
    
    @Override
    public void onUpdate()
    {
        
    }
    
    
    
    
    protected void updateFallState(double y, boolean onGroundIn, IBlockState state, BlockPos pos)
    {
    	
        if (!this.isRiding())
        {
        	this.fallDistance = 0.0F;
        	
            if (onGroundIn)
            {
                

                this.fallDistance = 0.0F;
            }
            else if (this.worldObj.getBlockState((new BlockPos(this)).down()).getMaterial() != Material.WATER && y < 0.0D)
            {
            	this.fallDistance = 0.0F;
            }
        }
    }
    
    public void setBoatType(EntityAirship.Type boatType)
    {
        this.dataManager.set(BOAT_TYPE, Integer.valueOf(boatType.ordinal()));
    }
    
    public EntityAirshipEA.Type getBoatType()
    {
        return EntityAirshipEA.Type.byId(((Integer)this.dataManager.get(BOAT_TYPE)).intValue());
    }
    
    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    protected void writeEntityToNBT(NBTTagCompound compound)
    {
        compound.setString("Type", this.getBoatType().getName());
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    protected void readEntityFromNBT(NBTTagCompound compound)
    {
        if (compound.hasKey("Type", 8))
        {
            this.setBoatType(EntityBoat.Type.getTypeFromString(compound.getString("Type")));
        }
    }
    
    //=====================================================
    
    
    
    
    

	@Override
	public int getSizeInventory() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ItemStack getStackInSlot(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemStack decrStackSize(int index, int count) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemStack removeStackFromSlot(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setInventorySlotContents(int index, ItemStack stack) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getInventoryStackLimit() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void markDirty() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void openInventory(EntityPlayer player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeInventory(EntityPlayer player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isItemValidForSlot(int index, ItemStack stack) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getField(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setField(int id, int value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFieldCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	


}