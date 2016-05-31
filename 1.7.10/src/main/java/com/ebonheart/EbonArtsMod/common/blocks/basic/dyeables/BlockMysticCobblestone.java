package com.ebonheart.EbonArtsMod.common.blocks.basic.dyeables;

import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.api.Reference;
import com.ebonheart.EbonArtsMod.common.blocks.BlockHelperOLDOLDOLD;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockMysticCobblestone extends BlockRotatedPillar {
	
	private IIcon bottomEA;
    private IIcon sideEA;
    private IIcon topEA;
    
	public BlockMysticCobblestone(String unlocalizedName) 
	{
		super(Material.rock);
		
		this.setBlockName(unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsDyeables);
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(5.0F);
		this.setResistance(100.0F);
		this.setStepSound(soundTypeStone);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
		//this.bottomEA = p_149651_1_.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5) + "_bottom");
		this.sideEA = p_149651_1_.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5) + "_side");
		this.topEA = p_149651_1_.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5) + "_top");
    }
	
	@SideOnly(Side.CLIENT)
    protected IIcon getTopIcon(int p_150161_1_)
    {
        return this.topEA;
    }
	
	@Override
	protected IIcon getSideIcon(int p_150163_1_) {
		// TODO Auto-generated method stub
		return this.sideEA;
	}
	//@Override
	//@SideOnly(Side.CLIENT)
    //public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    //{
        
    //    switch(p_149691_1_)
    //    {
    //    	case 0: return this.bottomEA;
    //    	case 1: return this.topEA;
    //    	case 2: return this.sideEA;
    ////    	case 3: return this.sideEA;
    //    	case 4: return this.sideEA;
    //    	case 5: return this.sideEA;
    //    }
	//	return sideEA;
    //}
	
	public boolean isOpaqueCube()
	{
		return false;
	}
	
	public boolean isFullCube()
	{
		return true;
	}
	/**
     * Called when a block is placed using its ItemBlock. Args: World, X, Y, Z, side, hitX, hitY, hitZ, block metadata
     */
    public int onBlockPlaced(World p_149660_1_, int p_149660_2_, int p_149660_3_, int p_149660_4_, int p_149660_5_, float p_149660_6_, float p_149660_7_, float p_149660_8_, int p_149660_9_)
    {
        int j1 = p_149660_9_ & 3;
        byte b0 = 0;

        switch (p_149660_5_)
        {
            case 0:
            case 1:
                b0 = 0;
                break;
            case 2:
            case 3:
                b0 = 8;
                break;
            case 4:
            case 5:
                b0 = 4;
        }

        return j1 | b0;
    }

    /**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        int k = p_149691_2_ & 12;
        int l = p_149691_2_ & 3;
        return k == 0 && (p_149691_1_ == 1 || p_149691_1_ == 0) ? this.getTopIcon(l) : (k == 4 && (p_149691_1_ == 5 || p_149691_1_ == 4) ? this.getTopIcon(l) : (k == 8 && (p_149691_1_ == 2 || p_149691_1_ == 3) ? this.getTopIcon(l) : this.getSideIcon(l)));
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int p_149692_1_)
    {
        return p_149692_1_ & 3;
    }

    
    
    public int func_150162_k(int p_150162_1_)
    {
        return p_150162_1_ & 3;
    }

    /**
     * Returns an item stack containing a single instance of the current block type. 'i' is the block's subtype/damage
     * and is ignored for blocks which do not support subtypes. Blocks which cannot be harvested should return null.
     */
    protected ItemStack createStackedBlock(int p_149644_1_)
    {
        return new ItemStack(Item.getItemFromBlock(this), 1, this.func_150162_k(p_149644_1_));
    }

	
	
}
