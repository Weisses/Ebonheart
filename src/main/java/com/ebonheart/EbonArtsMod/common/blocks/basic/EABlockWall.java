package com.ebonheart.EbonArtsMod.common.blocks.basic;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.proxy.CommonProxy;

public class EABlockWall extends EABlockGenericWall {
	
	public EABlockWall(String unlocalizedName) 
    {
		super(Blocks.brick_block, 0);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(5f);
		this.setResistance(1000f);
		this.setStepSound(soundTypeStone);
	}
}
