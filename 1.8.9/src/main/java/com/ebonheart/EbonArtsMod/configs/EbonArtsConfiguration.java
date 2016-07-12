package com.ebonheart.EbonArtsMod.configs;

import net.minecraftforge.common.MinecraftForge;

import com.ebonheart.EbonArtsMod.EbonArtsMod;

public class EbonArtsConfiguration 
{
/**
	public static int draconiumValueVein;
	public static int veliousValueVein;
	public static int arcaniteValueVein;
	public static int katcheenValueVein;
	public static int necrociteValueVein;
	public static int soulariteValueVein;
	public static int ebonheartValueVein;
*/
	public static int draconiumValueChunk;
	public static int veliousValueChunk;
	public static int arcaniteValueChunk;
	public static int katcheenValueChunk;
	public static int necrociteValueChunk;
	public static int soulariteValueChunk;
	public static int ebonheartValueChunk;
	
	
	public static boolean armorWeaponDifficult;
	public static boolean horseRecipe;
	public static boolean vanillaRecipe;
	public static boolean toolRecipe;
	public static boolean weaponRecipe;
	public static boolean armorRecipe;
	public static boolean armorParticle;
	public static boolean musicRecipe;
	public static boolean plantParticle;
	public static boolean decraftRecipe1;
	//public static boolean decraftRecipe2;
	/**
	public static final int DRACONIUMVALUEVEIN_DEFAULT = 8;
	public static final String DRACONIUMVALUEVEIN_NAME = "Max vein size for Draconium Ore.";
	
	public static final int VELIOUSVALUEVEIN_DEFAULT = 6;
	public static final String VELIOUSVALUEVEIN_NAME = "Max vein size for Velious Ore.";
	
	public static final int ARCANITEVALUEVEIN_DEFAULT = 5;
	public static final String ARCANITEVALUEVEIN_NAME = "Max vein size for Arcanite Ore.";
	
	public static final int KATCHEENVALUEVEIN_DEFAULT = 4;
	public static final String KATCHEENVALUEVEIN_NAME = "Max vein size for Katcheen Ore.";
	
	public static final int NECROCITEVALUEVEIN_DEFAULT = 3;
	public static final String NECROCITEVALUEVEIN_NAME = "Max vein size for Necrocite Ore.";
	
	public static final int SOULARITEVALUEVEIN_DEFAULT = 3;
	public static final String SOULARITEVALUEVEIN_NAME = "Max vein size for Soularite Ore.";
	
	public static final int EBONHEARTVALUEVEIN_DEFAULT = 3;
	public static final String EBONHEARTVALUEVEIN_NAME = "Max vein size for Ebonheart Ore.";
	*/
	
	
	public static final int DRACONIUMVALUECHUNK_DEFAULT = 16;
	public static final String DRACONIUMVALUECHUNK_NAME = "Draconium Ore veins per chunk. (1-64)";
	
	public static final int VELIOUSVALUECHUNK_DEFAULT = 8;
	public static final String VELIOUSVALUECHUNK_NAME = "Velious Ore veins per chunk. (1-64)";
	
	public static final int ARCANITEVALUECHUNK_DEFAULT = 6;
	public static final String ARCANITEVALUECHUNK_NAME = "Arcanite Ore veins per chunk. (1-64)";
	
	public static final int KATCHEENVALUECHUNK_DEFAULT = 3;
	public static final String KATCHEENVALUECHUNK_NAME = "Katcheen Ore veins per chunk. (1-64)";
	
	public static final int NECROCITEVALUECHUNK_DEFAULT = 32;
	public static final String NECROCITEVALUECHUNK_NAME = "Necrocite Ore veins per chunk. (1-64)";
	
	public static final int SOULARITEVALUECHUNK_DEFAULT = 32;
	public static final String SOULARITEVALUECHUNK_NAME = "Soularite Ore veins per chunk. (1-64)";
	
	public static final int EBONHEARTVALUECHUNK_DEFAULT = 32;
	public static final String EBONHEARTVALUECHUNK_NAME = "Ebonheart Ore veins per chunk. (1-64)";
	
	
	public static final boolean ARMORWEAPONDIFFICULT_DEFAULT = false;
	public static final String ARMORWEAPONDIFFICULT_NAME = "Disable dense gem use for Weapons/Armor?";
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
	public static final boolean PLANTANIMATION_DEFAULT = false;
	public static final String PLANTANIMATION_NAME = "Disable Mod Crop Particles?";
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
		final String WORLDGEN = EbonArtsMod.config.CATEGORY_GENERAL + EbonArtsMod.config.CATEGORY_SPLITTER + "World Gen";
		
		EbonArtsMod.config.addCustomCategoryComment(RECIPES, "Enable, disable, or modify item and block recipes.");
		armorWeaponDifficult = EbonArtsMod.config.get(RECIPES, ARMORWEAPONDIFFICULT_NAME, ARMORWEAPONDIFFICULT_DEFAULT).getBoolean(ARMORWEAPONDIFFICULT_DEFAULT);
		
		//weaponRecipe = EbonArtsMod.config.get(RECIPES, TextFormatting.GREEN + WEAPONRECIPE_NAME, WEAPONRECIPE_DEFAULT).getBoolean(WEAPONRECIPE_DEFAULT);
		//armorRecipe = EbonArtsMod.config.get(RECIPES, TextFormatting.GREEN + ARMORRECIPE_NAME, ARMORRECIPE_DEFAULT).getBoolean(ARMORRECIPE_DEFAULT);
		//toolRecipe = EbonArtsMod.config.get(RECIPES, TextFormatting.GREEN + TOOLRECIPE_NAME, TOOLRECIPE_DEFAULT).getBoolean(TOOLRECIPE_DEFAULT);
		decraftRecipe1 = EbonArtsMod.config.get(RECIPES, DECRAFTRECIPE1_NAME, DECRAFTRECIPE1_DEFAULT).getBoolean(DECRAFTRECIPE1_DEFAULT);
		
		vanillaRecipe = EbonArtsMod.config.get(RECIPES, VANILLARECIPE_NAME, VANILLARECIPE_DEFAULT).getBoolean(VANILLARECIPE_DEFAULT);
		horseRecipe = EbonArtsMod.config.get(RECIPES, HORSERECIPE_NAME, HORSERECIPE_DEFAULT).getBoolean(HORSERECIPE_DEFAULT);
		musicRecipe = EbonArtsMod.config.get(RECIPES, MUSICRECIPE_NAME, MUSICRECIPE_DEFAULT).getBoolean(MUSICRECIPE_DEFAULT);
		
		
		//decraftRecipe2 = EbonArtsMod.config.get(RECIPES, DECRAFTRECIPE2_NAME, DECRAFTRECIPE2_DEFAULT).getBoolean(DECRAFTRECIPE2_DEFAULT);
		
		
		EbonArtsMod.config.addCustomCategoryComment(PARTICLES, "Enable or disable mod armor animations.");
		armorParticle = EbonArtsMod.config.get(PARTICLES, ARMORANIMATION_NAME, ARMORANIMATION_DEFAULT).getBoolean(ARMORANIMATION_DEFAULT);
		plantParticle = EbonArtsMod.config.get(PARTICLES, PLANTANIMATION_NAME, PLANTANIMATION_DEFAULT).getBoolean(PLANTANIMATION_DEFAULT);
		
		
		EbonArtsMod.config.addCustomCategoryComment(WORLDGEN, "Adjust resource world generation weight.");
		
		//draconiumValueVein = EbonArtsMod.config.get(WORLDGEN, TextFormatting.YELLOW + DRACONIUMVALUEVEIN_NAME, DRACONIUMVALUEVEIN_DEFAULT).getInt(DRACONIUMVALUEVEIN_DEFAULT);
		draconiumValueChunk = EbonArtsMod.config.get(WORLDGEN, DRACONIUMVALUECHUNK_NAME, DRACONIUMVALUECHUNK_DEFAULT).getInt(DRACONIUMVALUECHUNK_DEFAULT);
		
		//veliousValueVein = EbonArtsMod.config.get(WORLDGEN, TextFormatting.YELLOW + VELIOUSVALUEVEIN_NAME, VELIOUSVALUEVEIN_DEFAULT).getInt(VELIOUSVALUEVEIN_DEFAULT);
		veliousValueChunk = EbonArtsMod.config.get(WORLDGEN, VELIOUSVALUECHUNK_NAME, VELIOUSVALUECHUNK_DEFAULT).getInt(VELIOUSVALUECHUNK_DEFAULT);
		
		//arcaniteValueVein = EbonArtsMod.config.get(WORLDGEN, TextFormatting.YELLOW + ARCANITEVALUEVEIN_NAME, ARCANITEVALUEVEIN_DEFAULT).getInt(ARCANITEVALUEVEIN_DEFAULT);
		arcaniteValueChunk = EbonArtsMod.config.get(WORLDGEN, ARCANITEVALUECHUNK_NAME, ARCANITEVALUECHUNK_DEFAULT).getInt(ARCANITEVALUECHUNK_DEFAULT);
		
		//katcheenValueVein = EbonArtsMod.config.get(WORLDGEN, TextFormatting.YELLOW + KATCHEENVALUEVEIN_NAME, KATCHEENVALUEVEIN_DEFAULT).getInt(KATCHEENVALUEVEIN_DEFAULT);
		katcheenValueChunk = EbonArtsMod.config.get(WORLDGEN, KATCHEENVALUECHUNK_NAME, KATCHEENVALUECHUNK_DEFAULT).getInt(KATCHEENVALUECHUNK_DEFAULT);
		
		//necrociteValueVein = EbonArtsMod.config.get(WORLDGEN, TextFormatting.YELLOW + NECROCITEVALUEVEIN_NAME, NECROCITEVALUEVEIN_DEFAULT).getInt(NECROCITEVALUEVEIN_DEFAULT);
		necrociteValueChunk = EbonArtsMod.config.get(WORLDGEN, NECROCITEVALUECHUNK_NAME, NECROCITEVALUECHUNK_DEFAULT).getInt(NECROCITEVALUECHUNK_DEFAULT);
		
		//soulariteValueVein = EbonArtsMod.config.get(WORLDGEN, TextFormatting.YELLOW + SOULARITEVALUEVEIN_NAME, SOULARITEVALUEVEIN_DEFAULT).getInt(SOULARITEVALUEVEIN_DEFAULT);
		soulariteValueChunk = EbonArtsMod.config.get(WORLDGEN, SOULARITEVALUECHUNK_NAME, SOULARITEVALUECHUNK_DEFAULT).getInt(SOULARITEVALUECHUNK_DEFAULT);
		
		//ebonheartValueVein = EbonArtsMod.config.get(WORLDGEN, TextFormatting.YELLOW + EBONHEARTVALUEVEIN_NAME, EBONHEARTVALUEVEIN_DEFAULT).getInt(EBONHEARTVALUEVEIN_DEFAULT);
		ebonheartValueChunk = EbonArtsMod.config.get(WORLDGEN, EBONHEARTVALUECHUNK_NAME, EBONHEARTVALUECHUNK_DEFAULT).getInt(EBONHEARTVALUECHUNK_DEFAULT);

		
		
		//saves the config
		if(EbonArtsMod.config.hasChanged())
		{
			EbonArtsMod.config.save();
		}
	}
}
