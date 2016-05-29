package com.ebonheart.EbonArtsMod.common.blocks.basic.torches;

import java.util.Random;

import net.minecraft.block.BlockTorch;
import net.minecraft.world.World;

import com.ebonheart.EbonArtsMod.EbonArtsMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EABlockTorchDraconium extends BlockTorch {

	    public EABlockTorchDraconium()
	    {
	        super();
	        //BlockHelperOLDOLDOLD.setBlockName(this, "gem/draconium/draconium_torch");
	        this.setBlockName("gems/draconium/draconium_torch");
			this.setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
	        //this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.UP));
	        this.setTickRandomly(true);
	        this.setLightLevel(0.9375F);
	    }
	    
	    @SideOnly(Side.CLIENT)
	    public void randomDisplayTick(World p_149734_1_, int p_149734_2_, int p_149734_3_, int p_149734_4_, Random p_149734_5_)
	    {
	        int l = p_149734_1_.getBlockMetadata(p_149734_2_, p_149734_3_, p_149734_4_);
	        double d0 = (double)((float)p_149734_2_ + 0.5F);
	        double d1 = (double)((float)p_149734_3_ + 0.7F);
	        double d2 = (double)((float)p_149734_4_ + 0.5F);
	        double d3 = 0.2199999988079071D;
	        double d4 = 0.27000001072883606D;

	        if (l == 1)
	        {
	            p_149734_1_.spawnParticle("spellMobAmbient", d0 - d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
	            p_149734_1_.spawnParticle("reddust", d0 - d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
	        }
	        else if (l == 2)
	        {
	            p_149734_1_.spawnParticle("spellMobAmbient", d0 + d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
	            p_149734_1_.spawnParticle("reddust", d0 + d4, d1 + d3, d2, 0.0D, 0.0D, 0.0D);
	        }
	        else if (l == 3)
	        {
	            p_149734_1_.spawnParticle("spellMobAmbient", d0, d1 + d3, d2 - d4, 0.0D, 0.0D, 0.0D);
	            p_149734_1_.spawnParticle("reddust", d0, d1 + d3, d2 - d4, 0.0D, 0.0D, 0.0D);
	        }
	        else if (l == 4)
	        {
	            p_149734_1_.spawnParticle("spellMobAmbient", d0, d1 + d3, d2 + d4, 0.0D, 0.0D, 0.0D);
	            p_149734_1_.spawnParticle("reddust", d0, d1 + d3, d2 + d4, 0.0D, 0.0D, 0.0D);
	        }
	        else
	        {
	            p_149734_1_.spawnParticle("spellMobAmbient", d0, d1, d2, 0.0D, 0.0D, 0.0D);
	            p_149734_1_.spawnParticle("reddust", d0, d1, d2, 0.0D, 0.0D, 0.0D);
	        }
	    }
	            //pos.spawnParticle(EnumParticleTypes.SPELL_MOB_AMBIENT, d0, d1, d2, 1.0D, -5.0D, 3.0D, new int[0]);
	            //pos.spawnParticle(EnumParticleTypes.reddust, d0, d1, d2, 3.0D, 1.0D, 9.0D, new int[0]);
	        
	    
	}