package com.ebonheart.EbonArtsMod.configs;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.init.InitRecipesEA;

import net.minecraftforge.fml.common.FMLCommonHandler;

public class EbonArtsConfiguration 
{

	public static boolean horseRecipe;
	public static boolean toolRecipe;
	public static boolean armorRecipe;
	public static boolean musicRecipe;
	public static boolean decraftRecipe1;
	public static boolean decraftRecipe2;
	public static final boolean HORSERECIPE_DEFAULT = false;
	public static final String HORSERECIPE_NAME = "Disable crafting Horse Armor/Saddles?";
	public static final boolean TOOLRECIPE_DEFAULT = false;
	public static final String TOOLRECIPE_NAME = "Disable crafting Mod Tools?";
	public static final boolean ARMORRECIPE_DEFAULT = false;
	public static final String ARMORRECIPE_NAME = "Disable crafting Mod Armor?";
	public static final boolean MUSICRECIPE_DEFAULT = false;
	public static final String MUSICRECIPE_NAME = "Disable crafting Music Discs?";
	public static final boolean DECRAFTRECIPE1_DEFAULT = false;
	public static final String DECRAFTRECIPE1_NAME = "Disable decrafting Mod Items?";
	public static final boolean DECRAFTRECIPE2_DEFAULT = false;
	public static final String DECRAFTRECIPE2_NAME = "Disable decrafting Vanilla Items?";
	
	public static void syncConfig()
	{
		FMLCommonHandler.instance().bus().register(EbonArtsMod.instance);
		
		
		//actual config
		final String RECIPES = EbonArtsMod.config.CATEGORY_GENERAL + EbonArtsMod.config.CATEGORY_SPLITTER + "Recipes";
		
		EbonArtsMod.config.addCustomCategoryComment(RECIPES, "Enable, disable, or modify item and block recipes.");
		horseRecipe = EbonArtsMod.config.get(RECIPES, HORSERECIPE_NAME, HORSERECIPE_DEFAULT).getBoolean(HORSERECIPE_DEFAULT);
		toolRecipe = EbonArtsMod.config.get(RECIPES, TOOLRECIPE_NAME, TOOLRECIPE_DEFAULT).getBoolean(TOOLRECIPE_DEFAULT);
		armorRecipe = EbonArtsMod.config.get(RECIPES, ARMORRECIPE_NAME, ARMORRECIPE_DEFAULT).getBoolean(ARMORRECIPE_DEFAULT);
		musicRecipe = EbonArtsMod.config.get(RECIPES, MUSICRECIPE_NAME, MUSICRECIPE_DEFAULT).getBoolean(MUSICRECIPE_DEFAULT);
		decraftRecipe1 = EbonArtsMod.config.get(RECIPES, DECRAFTRECIPE1_NAME, DECRAFTRECIPE1_DEFAULT).getBoolean(DECRAFTRECIPE1_DEFAULT);
		decraftRecipe2 = EbonArtsMod.config.get(RECIPES, DECRAFTRECIPE2_NAME, DECRAFTRECIPE2_DEFAULT).getBoolean(DECRAFTRECIPE2_DEFAULT);
		
		
		//saves the config
		if(EbonArtsMod.config.hasChanged())
		{
			EbonArtsMod.config.save();
		}
		
		
		
	}
}
