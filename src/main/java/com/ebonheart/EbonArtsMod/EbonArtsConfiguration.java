package com.ebonheart.EbonArtsMod;

import net.minecraftforge.fml.common.FMLCommonHandler;

public class EbonArtsConfiguration {

	public static boolean cheapRecipe;
	public static final boolean CHEAPRECIPE_DEFAULT = false;
	public static final String CHEAPRECIPE_NAME = "Enable the cheap recipe for Test Block";
	
	public static void syncConfig()
	{
		FMLCommonHandler.instance().bus().register(EbonArtsMod.instance);
		
		final String RECIPES = EbonArtsMod.config.CATEGORY_GENERAL + EbonArtsMod.config.CATEGORY_SPLITTER + "Recipes";
		EbonArtsMod.config.addCustomCategoryComment(RECIPES, "Enable or disable recipes TEST");
		cheapRecipe = EbonArtsMod.config.get(RECIPES, CHEAPRECIPE_NAME, CHEAPRECIPE_DEFAULT).getBoolean(CHEAPRECIPE_DEFAULT);
		if(EbonArtsMod.config.hasChanged())
		{
			EbonArtsMod.config.save();
		}
		
	}
}
