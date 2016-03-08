package com.ebonheart.EbonArtsMod.common.blocks;

import com.ebonheart.EbonArtsMod.api.helper.LogHelper;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;

public class BlockEA extends Block {

	public BlockEA(Material materialIn) 
	{
		super(materialIn);
		
		
		
	}

	
	
	//public int func_180651_a(IBlockState state)
	//{
		//return func_176201_c(state);
	//}
	  
	  public IProperty[] getProperties()
	  {
	    return null;
	  }
	  
	  public boolean hasProperties()
	  {
	    return getProperties() != null;
	  }
	  
	  public String getStateName(IBlockState state, boolean fullName)
	  {
	    String unlocalizedName = state.toString().toLowerCase();
	    		//.func_177230_c().func_149739_a();
	    LogHelper.info(unlocalizedName.substring(unlocalizedName.indexOf(".") + 1));
	    return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	    
	    
	  }
	  
	  public boolean defineVariantsForItemBlock()
	  {
	    return false;
	  }
	
}
