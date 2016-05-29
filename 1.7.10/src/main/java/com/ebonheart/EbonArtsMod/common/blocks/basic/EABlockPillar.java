package com.ebonheart.EbonArtsMod.common.blocks.basic;

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
	
	//public static final PropertyEnum LOG_AXIS = PropertyEnum.create("axis", EABlockPillar.EnumAxis.class);
	public IIcon[] icons = new IIcon[6];
	public EABlockPillar(String unlocalizedName)
	{
		super(Material.rock);
		this.setBlockName(unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		this.setBlockTextureName(Reference.MOD_ID + ":" + unlocalizedName);
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(5.0F);
		this.setStepSound(soundTypeStone);
		this.useNeighborBrightness = true;
	}
	
	public boolean isOpaqueCube()
	{
		return false;
	}
	
	public boolean isFullCube()
	{
		return true;
	}

	//@Override
	//public void registerBlockIcons(IIconRegister reg) {
	//    for (int i = 0; i < 6; i ++) {
	//        this.icons[i] = reg.registerIcon(this.textureName + "_" + i);
	//    }
	//}
	
	@Override
	protected IIcon getSideIcon(int p_150163_1_) {
		// TODO Auto-generated method stub
		return InitBlocksEA.velious_block.getBlockTextureFromSide(p_150163_1_);
	}
	
    @SideOnly(Side.CLIENT)
    protected IIcon getTopIcon(int p_150161_1_)
    {
    	return  InitBlocksEA.draconium_block_brick.getBlockTextureFromSide(p_150161_1_);
    	//return this.field_150164_N;
    }
    
    @Override
    //public IIcon getIcon(int side, int meta) {
    //    return this.icons[side];
    //}
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        int k = p_149691_2_ & 12;
        int l = p_149691_2_ & 3;
        return k == 0 && (p_149691_1_ == 1 || p_149691_1_ == 0) ? this.getTopIcon(l) : (k == 4 && (p_149691_1_ == 5 || p_149691_1_ == 4) ? this.getTopIcon(l) : (k == 8 && (p_149691_1_ == 2 || p_149691_1_ == 3) ? this.getTopIcon(l) : this.getSideIcon(l)));
    }
	
	
	
}