package com.ebonheart.EbonArtsMod.configs;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.init.InitRecipesEA;
import com.mojang.realmsclient.gui.ChatFormatting;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class EbonArtsConfiguration 
{

	public static boolean horseRecipe;
	public static boolean vanillaRecipe;
	public static boolean toolRecipe;
	public static boolean weaponRecipe;
	public static boolean armorRecipe;
	public static boolean armorParticle;
	public static boolean musicRecipe;
	public static boolean decraftRecipe1;
	//public static boolean decraftRecipe2;
	public static final boolean HORSERECIPE_DEFAULT = false;
	public static final String HORSERECIPE_NAME = "Disable crafting Horse Armor/Saddles?";
	public static final boolean VANILLARECIPE_DEFAULT = false;
	public static final String VANILLARECIPE_NAME = "Disable crafting special vanilla items?";
	public static final boolean TOOLRECIPE_DEFAULT = false;
	public static final String TOOLRECIPE_NAME = "Disable crafting Mod Tools?";
	public static final boolean WEAPONRECIPE_DEFAULT = false;
	public static final String WEAPONRECIPE_NAME = "Disable crafting Mod Weapons?";
	public static final boolean ARMORRECIPE_DEFAULT = false;
	public static final String ARMORRECIPE_NAME = "Disable crafting Mod Armor?";
	public static final boolean ARMORANIMATION_DEFAULT = false;
	public static final String ARMORANIMATION_NAME = "Disable Mod Armor Particles?";
	public static final boolean MUSICRECIPE_DEFAULT = false;
	public static final String MUSICRECIPE_NAME = "Disable crafting Music Discs?";
	public static final boolean DECRAFTRECIPE1_DEFAULT = false;
	public static final String DECRAFTRECIPE1_NAME = "Disable decrafting Mod Items?";
	
	//public static final boolean DECRAFTRECIPE2_DEFAULT = false;
	//public static final String DECRAFTRECIPE2_NAME = "Disable decrafting Vanilla Items?";
	
	public static void syncConfig()
	{
		
		MinecraftForge.EVENT_BUS.register(EbonArtsMod.instance);
		
		//FMLCommonHandler.instance().bus().register(EbonArtsMod.instance);
		
		//actual config
		final String RECIPES = EbonArtsMod.config.CATEGORY_GENERAL + EbonArtsMod.config.CATEGORY_SPLITTER + "Recipes";
		final String PARTICLES = EbonArtsMod.config.CATEGORY_GENERAL + EbonArtsMod.config.CATEGORY_SPLITTER + "Particles";
		
		EbonArtsMod.config.addCustomCategoryComment(RECIPES, "Enable, disable, or modify item and block recipes.");
		weaponRecipe = EbonArtsMod.config.get(RECIPES,   WEAPONRECIPE_NAME, WEAPONRECIPE_DEFAULT).getBoolean(WEAPONRECIPE_DEFAULT);
		armorRecipe = EbonArtsMod.config.get(RECIPES,  ARMORRECIPE_NAME, ARMORRECIPE_DEFAULT).getBoolean(ARMORRECIPE_DEFAULT);
		toolRecipe = EbonArtsMod.config.get(RECIPES,  TOOLRECIPE_NAME, TOOLRECIPE_DEFAULT).getBoolean(TOOLRECIPE_DEFAULT);
		decraftRecipe1 = EbonArtsMod.config.get(RECIPES,  DECRAFTRECIPE1_NAME, DECRAFTRECIPE1_DEFAULT).getBoolean(DECRAFTRECIPE1_DEFAULT);
		
		vanillaRecipe = EbonArtsMod.config.get(RECIPES,  VANILLARECIPE_NAME, VANILLARECIPE_DEFAULT).getBoolean(VANILLARECIPE_DEFAULT);
		horseRecipe = EbonArtsMod.config.get(RECIPES,  HORSERECIPE_NAME, HORSERECIPE_DEFAULT).getBoolean(HORSERECIPE_DEFAULT);
		musicRecipe = EbonArtsMod.config.get(RECIPES,  MUSICRECIPE_NAME, MUSICRECIPE_DEFAULT).getBoolean(MUSICRECIPE_DEFAULT);
		
		
		//decraftRecipe2 = EbonArtsMod.config.get(RECIPES, DECRAFTRECIPE2_NAME, DECRAFTRECIPE2_DEFAULT).getBoolean(DECRAFTRECIPE2_DEFAULT);
		
		
		EbonArtsMod.config.addCustomCategoryComment(PARTICLES, "Enable or disable mod armor animations.");
		armorParticle = EbonArtsMod.config.get(PARTICLES,  ARMORANIMATION_NAME, ARMORANIMATION_DEFAULT).getBoolean(ARMORANIMATION_DEFAULT);
		
		//saves the config
		if(EbonArtsMod.config.hasChanged())
		{
			EbonArtsMod.config.save();
		}
	}
}
