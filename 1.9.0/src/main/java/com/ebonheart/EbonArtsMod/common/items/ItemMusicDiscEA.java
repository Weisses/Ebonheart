package com.ebonheart.EbonArtsMod.common.items;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.api.SoundEventsEA;
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
    private final String field_185077_c;

    public ItemMusicDiscEA(String unlocalizedName, String p_i46742_1_, SoundEvent soundIn)
    {
    	super(p_i46742_1_, soundIn);
        this.field_185077_c = "item.record." + p_i46742_1_ + ".desc";
        this.sound = soundIn;
        this.maxStackSize = 1;
        this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
        RECORDS.put(this.sound, this);
        this.setUnlocalizedName(unlocalizedName);
    }

    /**
     * Called when a Block is right-clicked with this Item
     */
    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ)
    {
        IBlockState iblockstate = worldIn.getBlockState(pos);

        if (iblockstate.getBlock() == Blocks.jukebox && !((Boolean)iblockstate.getValue(BlockJukebox.HAS_RECORD)).booleanValue())
        {
            if (!worldIn.isRemote)
            {
                ((BlockJukebox)Blocks.jukebox).insertRecord(worldIn, pos, iblockstate, stack);
                worldIn.playAuxSFXAtEntity((EntityPlayer)null, 1010, pos, Item.getIdFromItem(this));
                --stack.stackSize;
                playerIn.addStat(StatList.recordPlayed);
            }

            return EnumActionResult.SUCCESS;
        }
        else
        {
            return EnumActionResult.PASS;
        }
    }

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced)
    {
        tooltip.add(this.getRecordNameLocal());
    }

    @SideOnly(Side.CLIENT)
    public String getRecordNameLocal()
    {
        return I18n.translateToLocal(this.field_185077_c);
    }

    /**
     * Return an item rarity from EnumRarity
     */
    public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.RARE;
    }

    /**
     * Retrieves the resource location of the sound to play for this record.
     *
     * @param name The name of the record to play
     * @return The resource location for the audio, null to use default.
     */
    //public net.minecraft.util.ResourceLocation getRecordResource(String name)
    //{
        
        //ResourceLocation location = super.getRecordResource(Reference.MOD_ID + ":");
        //return location;
    //	return new net.minecraft.util.ResourceLocation(name);
    //}

    @Override
	public ResourceLocation getRecordResource(String record) {
		ResourceLocation location = super.getRecordResource(Reference.MOD_ID + ":" + this.field_185077_c);
		return location;
	}
    
    @SideOnly(Side.CLIENT)
    public static ItemMusicDiscEA getBySound(SoundEvent soundIn)
    {
        return (ItemMusicDiscEA)RECORDS.get(soundIn);
    }

    @SideOnly(Side.CLIENT)
    public SoundEvent getSound()
    {
        return this.sound;
    }
}