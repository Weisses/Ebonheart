package com.ebonheart.EbonArtsMod.common.blocks.basic;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.api.Reference;
import com.ebonheart.EbonArtsMod.common.blocks.BlockHelperOLDOLDOLD;
import com.ebonheart.EbonArtsMod.init.InitBlocksEA;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EABlockPillar extends BlockRotatedPillar {
	
	private IIcon sideEA;
	private IIcon topEA;
	
	public EABlockPillar(String unlocalizedName)
	{
		super(Material.rock);
		this.setBlockName(unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		//this.setBlockTextureName(Reference.MOD_ID + ":" + unlocalizedName);
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(5.0F);
		this.setStepSound(soundTypeStone);
		this.useNeighborBrightness = true;
		
		
	}
	
	@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
		
		this.sideEA = p_149651_1_.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
		this.topEA = p_149651_1_.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5) + "_top");
		
    }
	
	public boolean isOpaqueCube()
	{
		return false;
	}
	
	public boolean isFullCube()
	{
		return true;
	}

	@Override
	protected IIcon getSideIcon(int p_150163_1_) 
	{
		return sideEA;
	}
	
    @SideOnly(Side.CLIENT)
    protected IIcon getTopIcon(int p_150161_1_)
    {
    	return topEA; 
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        int k = p_149691_2_ & 12;
        int l = p_149691_2_ & 3;
        return k == 0 && (p_149691_1_ == 1 || p_149691_1_ == 0) ? this.getTopIcon(l) : (k == 4 && (p_149691_1_ == 5 || p_149691_1_ == 4) ? this.getTopIcon(l) : (k == 8 && (p_149691_1_ == 2 || p_149691_1_ == 3) ? this.getTopIcon(l) : this.getSideIcon(l)));
    }
	
}