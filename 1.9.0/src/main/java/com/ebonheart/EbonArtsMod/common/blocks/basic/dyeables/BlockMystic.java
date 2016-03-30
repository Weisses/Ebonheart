package com.ebonheart.EbonArtsMod.common.blocks.basic.dyeables;

import java.util.List;

import com.ebonheart.EbonArtsMod.EbonArtsMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


public class BlockMystic extends Block {

	public BlockMystic() 
	{
		super(Material.rock);
		this.setUnlocalizedName("gem/mystic/mystic_block_normal");
		this.setCreativeTab(EbonArtsMod.tabEbonArtsDyeables);
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(stepSound.STONE);
	}
}
