package com.ebonheart.EbonArtsMod.common.blocks.basic;

import net.minecraft.block.BlockLadder;
import net.minecraft.util.EnumFacing;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.blocks.BlockHelperOLDOLDOLD;


public class EABlockLadder extends BlockLadder {
    
    public EABlockLadder(String unlocalizedName)
    {
        super();
        this.setBlockName(unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		
        this.useNeighborBrightness = true;
        //this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
        this.setHardness(5.0F);
    }

}
