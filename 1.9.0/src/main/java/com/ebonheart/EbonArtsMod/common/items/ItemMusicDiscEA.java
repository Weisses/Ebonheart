package com.ebonheart.EbonArtsMod.common.items;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.api.SoundEventsEA;
import com.ebonheart.EbonArtsMod.api.helper.LogHelper;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;
import com.ebonheart.EbonArtsMod.references.Reference;
import com.google.common.collect.Maps;

import net.minecraft.block.BlockJukebox;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemMusicDiscEA extends ItemRecord {
	
    private static final Map<SoundEvent, ItemMusicDiscEA> RECORDS = Maps.<SoundEvent, ItemMusicDiscEA>newHashMap();
    private final SoundEvent sound;
    //private final String field_185077_c;
    private final String music;

    public ItemMusicDiscEA(
    		String unlocalizedName, 
    		String name, SoundEvent soundIn)
    {
    	super(name, soundIn);
        this.music = "item.record." + name + ".desc";
        this.sound = soundIn;
        this.maxStackSize = 1;
        this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
        RECORDS.put(this.sound, this);
        
        
        this.setUnlocalizedName(unlocalizedName);
        
        //LogHelper.info("ItemMusicDiscEA : " + field_185077_c);
    }

}