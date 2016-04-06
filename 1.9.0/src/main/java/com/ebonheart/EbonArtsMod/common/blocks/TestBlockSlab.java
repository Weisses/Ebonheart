package com.ebonheart.EbonArtsMod.common.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.item.ItemStack;

public class TestBlockSlab extends BlockSlabEA {
	public TestBlockSlab(Material material, SlabGroup slabGroup,
			Iterable variants) {
		super(material, slabGroup, variants);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected int getMetadata(Enum variant) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected Enum getVariant(int meta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IProperty getVariantProperty() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUnlocalizedName(int meta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isDouble() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Comparable<?> getTypeForItem(ItemStack stack) {
		// TODO Auto-generated method stub
		return null;
	}

	//public abstract class BlockColoredSlab extends BlockSlabEA
}
