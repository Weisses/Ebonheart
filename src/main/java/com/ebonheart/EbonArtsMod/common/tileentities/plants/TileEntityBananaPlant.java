package com.ebonheart.EbonArtsMod.common.tileentities.plants;

import java.util.List;
import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.server.gui.IUpdatePlayerListBox;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TileEntityBananaPlant extends TileEntity
{
	private int plantAge;
	private int plantTier = 1;
	
	
	public void writeToNBT(NBTTagCompound compound)
    {
		super.writeToNBT(compound);
		compound.setInteger("PlantAge", this.plantAge);
		compound.setInteger("PlantTier", this.plantTier);	
    }
	
	public void readFromNBT(NBTTagCompound compound)
    {
        super.readFromNBT(compound);
        this.plantAge = compound.getShort("PlantAge");
		this.plantTier = compound.getShort("PlantTier");
    }
	
	public void MarkForUpdate()
	{
		worldObj.markBlockForUpdate(this.pos); 
		this.markDirty();
	}
	
	public int getAge()
	{
		return this.plantAge;
	}
	public void setAge(int age)
	{
		this.plantAge = age;  
		this.MarkForUpdate();
	}
	
	public int getTier()
	{
		return this.plantTier;       
	}
	public void setTier(int tier)
	{
		this.plantTier = tier;
		this.MarkForUpdate();
	}
	
	public void setAgeTier(int age, int tier)
	{
		this.plantAge = age;  
		this.plantTier = tier;
		this.MarkForUpdate();
	}
	
	public boolean canRenderBreaking()
    {
		return true;
    }
	
	public Packet getDescriptionPacket()
	{
		NBTTagCompound nbttagcompound = new NBTTagCompound();
		this.writeToNBT(nbttagcompound);
		return new S35PacketUpdateTileEntity(this.pos, 0, nbttagcompound);
	}
	
	public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity pkt)
	{
		readFromNBT(pkt.getNbtCompound());
	}
	
	
	
}
