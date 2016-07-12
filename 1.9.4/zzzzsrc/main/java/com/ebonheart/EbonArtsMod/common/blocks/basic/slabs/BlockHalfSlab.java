package com.ebonheart.EbonArtsMod.common.blocks.basic.slabs;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.blocks.BlockHelper;
import com.ebonheart.EbonArtsMod.init.InitBlocksEA;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStoneSlab;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

//Regular slab.
public class BlockHalfSlab extends EABlockSlab {
	
    public BlockHalfSlab(String unlocalizedName) 
    {
        super();
        //setRegistryName(unlocalizedName);
        //BlockHelper.setBlockName(this, unlocalizedName);
        this.setUnlocalizedName(unlocalizedName);
        //this.setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
    }

    @Override
    public boolean isDouble() 
    {
        return false;
    }
}
