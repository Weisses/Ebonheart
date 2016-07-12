package com.ebonheart.EbonArtsMod.common.blocks.basic.dyeables;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EABlockPillar;

public class BlockMysticCobblestone extends EABlockPillar {
	
	public BlockMysticCobblestone(String unlocalizedName) 
	{
		super(unlocalizedName);
		
		this.setCreativeTab(EbonArtsMod.tabEbonArtsDyeables);
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(5.0F);
		this.setResistance(100.0F);
		this.setStepSound(soundTypeStone);
	}
}
