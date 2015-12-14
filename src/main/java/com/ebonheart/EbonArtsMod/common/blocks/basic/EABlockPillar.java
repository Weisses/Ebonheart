package com.ebonheart.EbonArtsMod.common.blocks.basic;

import java.util.List;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.init.InitBlocksEA;
import com.google.common.base.Predicate;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockNewLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EABlockPillar extends Block {

	
    public EABlockPillar()
    {
        super(Material.rock);
        //this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, EABlockPillar.EnumType.DEFAULT));
        this.setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
        //this.getUnlocalizedName("pillar");
    }

    
}

