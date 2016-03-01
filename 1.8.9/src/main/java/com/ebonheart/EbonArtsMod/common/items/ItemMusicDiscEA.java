package com.ebonheart.EbonArtsMod.common.items;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;
import com.ebonheart.EbonArtsMod.references.Reference;
import com.google.common.collect.Maps;

import net.minecraft.block.BlockJukebox;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemMusicDiscEA extends ItemRecord {

	public String music;
	private static final Map RECORDS = new HashMap();
	
	public ItemMusicDiscEA(String name, String music) 
	{
		super(music);
        this.maxStackSize = 1;
        this.setUnlocalizedName(name);
        this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	 
        
        this.music = music;
        RECORDS.put("records." + music, this);
	}
	
	
	/**
     * Called when a Block is right-clicked with this Item
     */
    public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        IBlockState iblockstate = worldIn.getBlockState(pos);

        if (iblockstate.getBlock() == Blocks.jukebox && !((Boolean)iblockstate.getValue(BlockJukebox.HAS_RECORD)).booleanValue())
        {
            if (worldIn.isRemote)
            {
                return true;
            }
            else
            {
                ((BlockJukebox)Blocks.jukebox).insertRecord(worldIn, pos, iblockstate, stack);
                worldIn.playAuxSFXAtEntity((EntityPlayer)null, 1005, pos, Item.getIdFromItem(this));
                
                --stack.stackSize;
                return true;
            }
        }
        else
        {
            return false;
        }
    }
    
    

	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) 
	{

		toolTip.add(EnumChatFormatting.DARK_AQUA + "This "  + stack.getDisplayName().toLowerCase() + " plays the ");
		toolTip.add(EnumChatFormatting.DARK_AQUA + "record " + this.getRecordNameLocal() + ".");
		
	}
	
    
    
    @SideOnly(Side.CLIENT)
    public String getRecordNameLocal() {
        return StatCollector.translateToLocal(this.getUnlocalizedName() + ".desc");
    }

    @Override
	public ResourceLocation getRecordResource(String record) {
		ResourceLocation location = super.getRecordResource(Reference.MOD_ID + ":" + this.music);
		return location;
	}
	
	
	 
	 @SideOnly(Side.CLIENT)
	 public static ItemMusicDiscEA getRecord(String name) {
		 return (ItemMusicDiscEA)RECORDS.get(name);
     }
    
  

	 public EnumRarity getRarity(ItemStack stack)
	    {
	        return EnumRarity.RARE;
	    }
	 	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	//Simple Enum enclosed class.
		public enum EnumType implements IStringSerializable 
		{
		    GLOWING(0, "glowing"),
		    SHIMMERING(1, "shimmering");
		    

		    private int ID;
		    private String name;
		    
		    private EnumType(int ID, String name) 
		    {
		        this.ID = ID;
		        this.name = name;
		    }
		    
		    @Override
		    public String getName() 
		    {
		        return name;
		    }

		    public int getID() 
		    {
		        return ID;
		    }
		    
		    @Override
		    public String toString() 
		    {
		        return getName();
		    }
		}
	 
	 
	 
	 
}
