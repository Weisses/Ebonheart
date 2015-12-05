package com.ebonheart.EbonArtsMod.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.init.InitBlocksEA;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;
import com.ebonheart.EbonArtsMod.tileentity.BlockBananaPlantRoot.HarvestLevelEnum;

public class BlockOreEA extends Block {
	
	public BlockOreEA(Material materialIn, String harvesttool, int harvestlevel, float lightlevel) 
	{
		super(materialIn);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		this.setHarvestLevel(harvesttool, harvestlevel); //("pickaxe", 2) is default
		this.setHardness(5F);
		this.setResistance(1000F);
		this.setStepSound(soundTypeStone);
		this.setLightLevel(lightlevel);
	}

    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
    	return this == InitBlocksEA.arcanite_ore ? InitItemsEA.item_arcanite : Item.getItemFromBlock(this);

        //return this == EbonArtsBlocks.arcanite_ore ? EbonArtsItems.arcanite_shard : (this == Blocks.diamond_ore ? Items.diamond : (this == Blocks.lapis_ore ? Items.dye : (this == Blocks.emerald_ore ? Items.emerald : (this == Blocks.quartz_ore ? Items.quartz : Item.getItemFromBlock(this)))));
    }

    public int quantityDropped(Random random)
    {
        return this == InitBlocksEA.arcanite_ore ? 1 + random.nextInt(4) : 1;
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

    public boolean canSilkHarvest(World world, BlockPos pos, IBlockState state, EntityPlayer player) 
    {
		return true;
    }
}
