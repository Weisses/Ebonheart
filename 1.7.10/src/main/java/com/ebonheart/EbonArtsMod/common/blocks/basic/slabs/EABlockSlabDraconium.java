package com.ebonheart.EbonArtsMod.common.blocks.basic.slabs;

import java.util.List;
import java.util.Random;

import com.ebonheart.EbonArtsMod.api.Reference;
import com.ebonheart.EbonArtsMod.init.InitBlocksEA;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

//Draconium slab/double slab main class.
public abstract class EABlockSlabDraconium extends BlockSlab {
	
	public static final String[] field_150006_b = new String[] {"ea"
		//, "sand", "wood", "cobble", "brick", "smoothStoneBrick", "netherBrick", "quartz"
		};
    @SideOnly(Side.CLIENT)
    private IIcon field_150007_M;
    private static final String __OBFID = "CL_00000320";

	public EABlockSlabDraconium(boolean p_i45410_1_) 
	{
		super(p_i45410_1_, Material.rock);
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(soundTypePiston);
		
		
	}
	
	
	
	/**
     * Returns an item stack containing a single instance of the current block type. 'i' is the block's subtype/damage
     * and is ignored for blocks which do not support subtypes. Blocks which cannot be harvested should return null.
     */
    protected ItemStack createStackedBlock(int p_149644_1_)
    {
        return new ItemStack(Item.getItemFromBlock(InitBlocksEA.draconium_slab), 2, p_149644_1_ & 7);
    }
	 
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.getItemFromBlock(InitBlocksEA.draconium_slab);
    }
	
	 @SideOnly(Side.CLIENT)
	    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
	    {
		 
		 return InitBlocksEA.draconium_block.getBlockTextureFromSide(p_149691_1_);
	     //   int k = p_149691_2_ & 7;

	     //   if (this.field_150004_a && (p_149691_2_ & 8) != 0)
	     //   {
	     //       p_149691_1_ = 1;
	     //   }

	     //   return k == 0 ? (p_149691_1_ != 1 && p_149691_1_ != 0 ? this.field_150007_M : this.blockIcon) : (k == 1 ? Blocks.sandstone.getBlockTextureFromSide(p_149691_1_) : (k == 2 ? Blocks.planks.getBlockTextureFromSide(p_149691_1_) : (k == 3 ? Blocks.cobblestone.getBlockTextureFromSide(p_149691_1_) : (k == 4 ? Blocks.brick_block.getBlockTextureFromSide(p_149691_1_) : (k == 5 ? Blocks.stonebrick.getIcon(p_149691_1_, 0) : (k == 6 ? Blocks.nether_brick.getBlockTextureFromSide(1) : (k == 7 ? Blocks.quartz_block.getBlockTextureFromSide(p_149691_1_) : this.blockIcon)))))));
	    }

	    @SideOnly(Side.CLIENT)
	    public void registerBlockIcons(IIconRegister p_149651_1_)
	    {
	        this.blockIcon = p_149651_1_.registerIcon(Reference.MOD_ID + ":" + "slab/draconium/draconium_slab_top");
	        this.field_150007_M = p_149651_1_.registerIcon(Reference.MOD_ID + ":" + "slab/draconium/draconium_slab_side");
	    }

	    

	    

	    public String func_150002_b(int p_150002_1_)
	    {
	        //if (p_150002_1_ < 0 || p_150002_1_ >= field_150006_b.length)
	        //{
	        //    p_150002_1_ = 0;
	        //}

	        return super.getUnlocalizedName();// + "." + field_150006_b[p_150002_1_];
	    }

	    /**
	     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
	     */
	    @SideOnly(Side.CLIENT)
	    public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_)
	    {
	    	
	    	p_149666_3_.add(new ItemStack(p_149666_1_));
	        //if (p_149666_1_ != Item.getItemFromBlock(Blocks.double_stone_slab))
	        //{
	        //    for (int i = 0; i <= 7; ++i)
	        //    {
	        //        if (i != 2)
	        //        {
	        //            p_149666_3_.add(new ItemStack(p_149666_1_, 1, i));
	        //        }
	        //    }
	        //}
	    }
}
