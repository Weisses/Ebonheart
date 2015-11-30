package com.ebonheart.EbonArtsMod.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import com.ebonheart.EbonArtsMod.init.EbonArtsBlocks;
import com.ebonheart.EbonArtsMod.init.EbonArtsItems;

public class BlockOreEA extends Block {
	
	public BlockOreEA(Material materialIn) {
		super(materialIn);
		this.setHardness(4.5F);

	}
	
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
    	return this == EbonArtsBlocks.arcanite_ore ? EbonArtsItems.arcanite_shard : Item.getItemFromBlock(this);

        //return this == EbonArtsBlocks.arcanite_ore ? EbonArtsItems.arcanite_shard : (this == Blocks.diamond_ore ? Items.diamond : (this == Blocks.lapis_ore ? Items.dye : (this == Blocks.emerald_ore ? Items.emerald : (this == Blocks.quartz_ore ? Items.quartz : Item.getItemFromBlock(this)))));

        
    }
    
    public int quantityDropped(Random random)
    {
        return this == EbonArtsBlocks.arcanite_ore ? 1 + random.nextInt(4) : 1;
    }

    public int quantityDroppedWithBonus(int fortune, Random random)
    {
        if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped((IBlockState)this.getBlockState().getValidStates().iterator().next(), random, fortune))
        {
            int j = random.nextInt(fortune + 2) - 1;

            if (j < 0)
            {
                j = 0;
            }

            return this.quantityDropped(random) * (j + 1);
        }
        else
        {
            return this.quantityDropped(random);
        }
    }
}
