package com.ebonheart.EbonArtsMod.configs;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.init.InitRecipesEA;

import net.minecraftforge.fml.common.FMLCommonHandler;

public class EbonArtsConfiguration 
{

	public static boolean cheapRecipe;
	public static boolean toolRecipe;
	public static final boolean CHEAPRECIPE_DEFAULT = false;
	public static final String CHEAPRECIPE_NAME = "Enable cheap crafted blocks?";
	public static final boolean TOOLRECIPE_DEFAULT = false;
	public static final String TOOLRECIPE_NAME = "Disable crafting tools?";
	
	public static void syncConfig()
	{
		FMLCommonHandler.instance().bus().register(EbonArtsMod.instance);
		
		
		//actual config
		final String RECIPES = EbonArtsMod.config.CATEGORY_GENERAL + EbonArtsMod.config.CATEGORY_SPLITTER + "Recipes";
		
		EbonArtsMod.config.addCustomCategoryComment(RECIPES, "Enable, disable, or modify item and block recipes.");
		cheapRecipe = EbonArtsMod.config.get(RECIPES, CHEAPRECIPE_NAME, CHEAPRECIPE_DEFAULT).getBoolean(CHEAPRECIPE_DEFAULT);
		toolRecipe = EbonArtsMod.config.get(RECIPES, TOOLRECIPE_NAME, TOOLRECIPE_DEFAULT).getBoolean(TOOLRECIPE_DEFAULT);
		
		//saves the config
		if(EbonArtsMod.config.hasChanged())
		{
			EbonArtsMod.config.save();
		}
		
		
		
	}
}
