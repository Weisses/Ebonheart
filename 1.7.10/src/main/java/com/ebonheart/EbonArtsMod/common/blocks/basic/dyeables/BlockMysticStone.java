package com.ebonheart.EbonArtsMod.common.blocks.basic.dyeables;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.api.Reference;
import com.ebonheart.EbonArtsMod.common.blocks.BlockHelperOLDOLDOLD;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockMysticStone extends Block {
	
	private IIcon bottomEA;
    private IIcon sideEA;
    private IIcon topEA;
    
	public BlockMysticStone(String unlocalizedName) 
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
		this.bottomEA = p_149651_1_.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5) + "_bottom");
		this.sideEA = p_149651_1_.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5) + "_side");
		this.topEA = p_149651_1_.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5) + "_top");
    }
	
	@Override
	@SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        
        switch(p_149691_1_)
        {
        	case 0: return this.bottomEA;
        	case 1: return this.topEA;
        	case 2: return this.sideEA;
        	case 3: return this.sideEA;
        	case 4: return this.sideEA;
        	case 5: return this.sideEA;
        }
		return sideEA;
    }
}
