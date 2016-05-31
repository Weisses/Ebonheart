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
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

//Draconium slab/double slab main class.
public abstract class EABlockSlab extends BlockSlab {
	
    private IIcon sideEA;
    private IIcon topEA;
    
	public EABlockSlab(boolean p_i45410_1_) 
	{
		super(p_i45410_1_, Material.rock);
		
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(soundTypePiston);
	}
	
	@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
		this.sideEA = p_149651_1_.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5) + "_side");//"slab/draconium_slab_side");
		this.topEA = p_149651_1_.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5) + "_top");
    }
	
	@SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        int k = p_149691_2_ & 7;
		
        if (this.field_150004_a && (p_149691_2_ & 8) != 0)
        {
            p_149691_1_ = 1;
        }
        
        switch(p_149691_1_)
        {
        	case 0: return this.topEA;
        	case 1: return this.topEA;
        	case 2: return this.sideEA;
        	case 3: return this.sideEA;
        	case 4: return this.sideEA;
        	case 5: return this.sideEA;
        }
		return sideEA;
    }
	
	@SideOnly(Side.CLIENT)
    private static boolean func_150003_a(Block p_150003_0_)
    {
        return p_150003_0_ == Blocks.wooden_slab || p_150003_0_ == Blocks.wooden_slab;
    }
	
	@Override
    protected ItemStack createStackedBlock(int p_149644_1_)
    {
        return new ItemStack(Item.getItemFromBlock(InitBlocksEA.draconium_slab), 2, p_149644_1_ & 7);
    }
	
    @Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.getItemFromBlock(InitBlocksEA.draconium_slab);
    }
	
	@Override
	public String func_150002_b(int p_150002_1_)
	{
	        //if (p_150002_1_ < 0 || p_150002_1_ >= field_150006_b.length)
	        //{
	        //    p_150002_1_ = 0;
	        //}

	    return super.getUnlocalizedName();// + "." + field_150006_b[p_150002_1_];
	}
	
	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_)
	{
	    	
	    p_149666_3_.add(new ItemStack(p_149666_1_, 1, 0));
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
	
	@SideOnly(Side.CLIENT)
	public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
	{
	    return func_150003_a(this) ? Item.getItemFromBlock(this) 
	    	: (this == InitBlocksEA.double_draconium_slab ? Item.getItemFromBlock(InitBlocksEA.draconium_slab) 
	        : (this == InitBlocksEA.double_velious_slab ? Item.getItemFromBlock(InitBlocksEA.velious_slab) 
	    	: (this == InitBlocksEA.double_arcanite_slab ? Item.getItemFromBlock(InitBlocksEA.arcanite_slab) 
	    	: (this == InitBlocksEA.double_katcheen_slab ? Item.getItemFromBlock(InitBlocksEA.velious_slab) 
	    	: (this == InitBlocksEA.double_necrocite_slab ? Item.getItemFromBlock(InitBlocksEA.velious_slab) 
	    	: (this == InitBlocksEA.double_soularite_slab ? Item.getItemFromBlock(InitBlocksEA.velious_slab) 
	    	: (this == InitBlocksEA.double_ebonheart_slab ? Item.getItemFromBlock(InitBlocksEA.velious_slab) 
	    	: (this == InitBlocksEA.double_obsidian_slab ? Item.getItemFromBlock(InitBlocksEA.velious_slab) 
	    	: (this == InitBlocksEA.double_glowstone_slab ? Item.getItemFromBlock(this) 
	        : Item.getItemFromBlock(this))))))))));
	}
}
