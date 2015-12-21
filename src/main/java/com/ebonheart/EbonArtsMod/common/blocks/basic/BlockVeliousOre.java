package com.ebonheart.EbonArtsMod.common.blocks.basic;

import java.util.Random;

import com.ebonheart.EbonArtsMod.common.blocks.world.BlockOreEA;
import com.ebonheart.EbonArtsMod.init.InitBlocksEA;

public class BlockVeliousOre extends BlockOreEA {

	public BlockVeliousOre(String unlocalizedName, int harvestlevel,
			float lightlevel, float hardness) {
		super(unlocalizedName, harvestlevel, lightlevel, hardness);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public int quantityDropped(Random random)
    {
        return this == InitBlocksEA.velious_ore ? 1 + random.nextInt(4) : 1;
    }
	
}
