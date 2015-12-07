package com.ebonheart.EbonArtsMod.common.blocks.basic;

import net.minecraft.block.BlockLog;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class EABlockPillar extends BlockLog {

	public EABlockPillar()
    {
        //super(Material.wood);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(2.0F);
        this.setStepSound(soundTypeWood);
    }
	
}
