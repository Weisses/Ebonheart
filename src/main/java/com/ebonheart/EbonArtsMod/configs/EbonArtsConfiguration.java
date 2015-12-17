package com.ebonheart.EbonArtsMod.configs;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.init.InitRecipesEA;

import net.minecraftforge.fml.common.FMLCommonHandler;

public class EbonArtsConfiguration 
{

	public static boolean horseRecipe;
	public static boolean toolRecipe;
	public static boolean musicRecipe;
	public static boolean decraftRecipe;
	public static final boolean HORSERECIPE_DEFAULT = false;
	public static final String HORSERECIPE_NAME = "Disable crafting Horse Armor/Saddles?";
	public static final boolean TOOLRECIPE_DEFAULT = false;
	public static final String TOOLRECIPE_NAME = "Disable crafting tools?";
	public static final boolean MUSICRECIPE_DEFAULT = false;
	public static final String MUSICRECIPE_NAME = "Disable crafting music discs?";
	public static final boolean DECRAFTRECIPE_DEFAULT = false;
	public static final String DECRAFTRECIPE_NAME = "Disable decrafting recipes?";
	
	public static void syncConfig()
	{
		FMLCommonHandler.instance().bus().register(EbonArtsMod.instance);
		
		
		//actual config
		final String RECIPES = EbonArtsMod.config.CATEGORY_GENERAL + EbonArtsMod.config.CATEGORY_SPLITTER + "Recipes";
		
		EbonArtsMod.config.addCustomCategoryComment(RECIPES, "Enable, disable, or modify item and block recipes.");
		horseRecipe = EbonArtsMod.config.get(RECIPES, HORSERECIPE_NAME, HORSERECIPE_DEFAULT).getBoolean(HORSERECIPE_DEFAULT);
		toolRecipe = EbonArtsMod.config.get(RECIPES, TOOLRECIPE_NAME, TOOLRECIPE_DEFAULT).getBoolean(TOOLRECIPE_DEFAULT);
		musicRecipe = EbonArtsMod.config.get(RECIPES, MUSICRECIPE_NAME, MUSICRECIPE_DEFAULT).getBoolean(MUSICRECIPE_DEFAULT);
		decraftRecipe = EbonArtsMod.config.get(RECIPES, DECRAFTRECIPE_NAME, DECRAFTRECIPE_DEFAULT).getBoolean(DECRAFTRECIPE_DEFAULT);
		
		//saves the config
		if(EbonArtsMod.config.hasChanged())
		{
			EbonArtsMod.config.save();
		}
		
		
		
	}
}
