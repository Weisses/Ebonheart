package com.ebonheart.EbonArtsMod.common.items.resources;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.minecraft.block.BlockJukebox;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.api.Reference;
import com.ebonheart.EbonArtsMod.common.items.ItemHelper;
import com.mojang.realmsclient.gui.ChatFormatting;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemMusicDiscEA extends ItemRecord {
	
	//public String music;
	//private static final Map RECORDS = new HashMap();
	private static final Map field_150928_b = new HashMap();
    /** The name of the record. */
    public final String recordName;
    public String music;
    private static final String __OBFID = "CL_00000057";

    public ItemMusicDiscEA(String unlocalizedName, String soundIn)
    {
    	super(unlocalizedName
    			//Reference.MOD_ID + ":" + 
    			);
    	
    	this.recordName = unlocalizedName;
    	//ItemHelper.setItemName(this, unlocalizedName);
    	this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
		this.music = soundIn;
		//RECORDS.put("records." + soundIn, this);
		field_150928_b.put("records." + soundIn, this);
    }
    
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) 
	{
		toolTip.add(ChatFormatting.DARK_AQUA + "This "  + stack.getDisplayName().toLowerCase() + " plays the ");
		toolTip.add(ChatFormatting.DARK_AQUA + "record, \"" + this.getRecordNameLocal() + "\".");
	}
    
    /**
     * Gets an icon index based on an item's damage value
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int p_77617_1_)
    {
        return this.itemIcon;
    }

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack p_77648_1_, EntityPlayer p_77648_2_, World p_77648_3_, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_)
    {
        if (p_77648_3_.getBlock(p_77648_4_, p_77648_5_, p_77648_6_) == Blocks.jukebox && p_77648_3_.getBlockMetadata(p_77648_4_, p_77648_5_, p_77648_6_) == 0)
        {
            if (p_77648_3_.isRemote)
            {
                return true;
            }
            else
            {
                ((BlockJukebox)Blocks.jukebox).func_149926_b(p_77648_3_, p_77648_4_, p_77648_5_, p_77648_6_, p_77648_1_);
                p_77648_3_.playAuxSFXAtEntity((EntityPlayer)null, 1005, p_77648_4_, p_77648_5_, p_77648_6_, Item.getIdFromItem(this));
                --p_77648_1_.stackSize;
                return true;
            }
        }
        else
        {
            return false;
        }
    }

    

    @SideOnly(Side.CLIENT)
    public String getRecordNameLocal()
    {
        return StatCollector.translateToLocal(this.getUnlocalizedName() + ".desc"
        		//"item.record." + this.recordName + ".desc"
        		);
    }

    

    /**
     * Return the record item corresponding to the given name.
     */
    @SideOnly(Side.CLIENT)
    public static ItemMusicDiscEA getRecord(String p_150926_0_)
    {
        return (ItemMusicDiscEA)field_150928_b.get(p_150926_0_);
    }

    /**
     * Retrieves the resource location of the sound to play for this record.
     * 
     * @param name The name of the record to play
     * @return The resource location for the audio, null to use default.
     */
    @Override
	public ResourceLocation getRecordResource(String record) {
		ResourceLocation location = super.getRecordResource(Reference.MOD_ID + ":" + this.music);
		return location;
	}
    //public ResourceLocation getRecordResource(String name)
    //{
    //    return new ResourceLocation(name);
    //}

	public EnumRarity getRarity(ItemStack stack)
	    {
	        return EnumRarity.rare;
	    }
	 	
	 
	
}