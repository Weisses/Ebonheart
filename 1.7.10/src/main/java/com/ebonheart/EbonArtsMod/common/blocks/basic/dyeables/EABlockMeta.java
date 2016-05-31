package com.ebonheart.EbonArtsMod.common.blocks.basic.dyeables;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.utils.meta.IMetaBlockName;


public class EABlockMeta extends Block implements IMetaBlockName {

	//public static final PropertyEnum TYPE = PropertyEnum.create("type", EABlockMeta.EnumType.class);
	
	public EABlockMeta(String unlocalizedName, Material materialIn) 
	{
		super(materialIn);
		//BlockHelper.setBlockName(this, unlocalizedName);
		//this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsDyeables);
		this.setHarvestLevel("pickaxe", 2);
		this.setStepSound(soundTypeStone);
		//this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, EnumType.WHITE));
	}

	@Override
	public String getSpecialName(ItemStack stack) {
		// TODO Auto-generated method stub
		return null;
	}

}
