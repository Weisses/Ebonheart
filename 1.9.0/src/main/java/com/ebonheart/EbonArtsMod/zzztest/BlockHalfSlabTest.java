package com.ebonheart.EbonArtsMod.zzztest;

import com.ebonheart.EbonArtsMod.common.blocks.BlockHelper;
import com.ebonheart.EbonArtsMod.init.InitBlocksEA;

import net.minecraft.block.Block;
import net.minecraft.block.properties.IProperty;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

//Regular slab.
public class BlockHalfSlabTest extends BlockPurpurSlab {
	
    public BlockHalfSlabTest(String unlocalizedName) 
    {
        super();
        BlockHelper.setBlockName(this, unlocalizedName);
        //this.setUnlocalizedName(unlocalizedName);
    }

    @Override
    public final boolean isDouble() 
    {
        return false;
    }
    
}
