package com.ebonheart.EbonArtsMod.common.blocks.basic;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.api.Reference;
import com.ebonheart.EbonArtsMod.common.blocks.BlockHelperOLDOLDOLD;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class EABlockStairs extends BlockStairs {
	
	private IIcon sideEA;
	
	public EABlockStairs(Block block, String unlocalizedName) 
	{
		super(block, 0);
		this.setBlockName(unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		
		this.useNeighborBrightness = true;
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(5.0F);
		this.setStepSound(soundTypeStone);
	}
	
	@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
		this.sideEA = p_149651_1_.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
    }
	
	@SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return this.sideEA;
    }
}
