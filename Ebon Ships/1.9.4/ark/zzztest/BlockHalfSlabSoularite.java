package com.ebonheart.EbonArtsMod.common.blocks.basic.slabs;

import com.ebonheart.EbonArtsMod.init.InitBlocksEA;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

//Regular slab.
public class BlockHalfSlabSoularite extends EABlockSlabSoularite {
	
    public BlockHalfSlabSoularite(String unlocalizedName) 
    {
        super();
        this.setUnlocalizedName(unlocalizedName);
    }

    @Override
    public final boolean isDouble() 
    {
        return false;
    }
}
