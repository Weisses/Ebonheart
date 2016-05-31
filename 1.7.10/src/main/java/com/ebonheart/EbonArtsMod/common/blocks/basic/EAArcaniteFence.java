package com.ebonheart.EbonArtsMod.common.blocks.basic;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.api.Reference;
import com.ebonheart.EbonArtsMod.common.blocks.BlockHelperOLDOLDOLD;
import com.ebonheart.EbonArtsMod.init.InitBlocksEA;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class EAArcaniteFence extends BlockFence {
	
	private final String field_149827_a;
	protected final Material blockMaterial;
	
	public EAArcaniteFence(String unlocalizedName) 
	{
		super(unlocalizedName, Material.wood);
		this.setBlockName(unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		this.field_149827_a = Reference.MOD_ID + ":" + unlocalizedName;
		this.setHarvestLevel("pickaxe", 2);
		this.setHardness(5.0F);
		this.setStepSound(soundTypeStone);
		this.blockMaterial = Material.wood;
	}
	
	@Override
	public boolean canConnectFenceTo(IBlockAccess p_149826_1_, int p_149826_2_, int p_149826_3_, int p_149826_4_)
	{
		Block block = p_149826_1_.getBlock(p_149826_2_, p_149826_3_, p_149826_4_);
        return block != this && block != Blocks.fence_gate ? (block.renderAsNormalBlock() == false) : true;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon(this.field_149827_a);
    }
	
	@Override
	@SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return InitBlocksEA.arcanite_block.getBlockTextureFromSide(p_149691_1_);
    }
	
	@Override
    public boolean canPlaceTorchOnTop(World world, int x, int y, int z)
    {
            return true;
    }
}
