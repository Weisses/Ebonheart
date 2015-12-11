/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * 
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 * 
 * File Created @ [Jan 14, 2014, 9:12:15 PM (GMT)]
 */
package com.ebonheart.EbonArtsMod.common.omnibus;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import vazkii.botania.api.BotaniaAPI;
import vazkii.botania.api.brew.IBrewContainer;
import vazkii.botania.api.lexicon.LexiconCategory;
import vazkii.botania.api.lexicon.LexiconEntry;
import vazkii.botania.api.lexicon.LexiconPage;
import vazkii.botania.api.lexicon.LexiconRecipeMappings;
import vazkii.botania.client.lib.LibResources;
import vazkii.botania.common.Botania;
import vazkii.botania.common.achievement.ModAchievements;
import vazkii.botania.common.block.ModBlocks;
import vazkii.botania.common.block.ModMultiblocks;
import vazkii.botania.common.brew.ModBrews;
import vazkii.botania.common.core.handler.ConfigHandler;
import vazkii.botania.common.core.handler.SheddingHandler;
import vazkii.botania.common.crafting.ModBrewRecipes;
import vazkii.botania.common.crafting.ModCraftingRecipes;
import vazkii.botania.common.crafting.ModElvenTradeRecipes;
import vazkii.botania.common.crafting.ModManaAlchemyRecipes;
import vazkii.botania.common.crafting.ModManaConjurationRecipes;
import vazkii.botania.common.crafting.ModManaInfusionRecipes;
import vazkii.botania.common.crafting.ModPetalRecipes;
import vazkii.botania.common.crafting.ModRuneRecipes;
import vazkii.botania.common.item.ModItems;
import vazkii.botania.common.item.block.ItemBlockSpecialFlower;
import vazkii.botania.common.lexicon.page.PageBrew;
import vazkii.botania.common.lexicon.page.PageCraftingRecipe;
import vazkii.botania.common.lexicon.page.PageElvenRecipe;
import vazkii.botania.common.lexicon.page.PageImage;
import vazkii.botania.common.lexicon.page.PageLoreText;
import vazkii.botania.common.lexicon.page.PageManaInfusionRecipe;
import vazkii.botania.common.lexicon.page.PageMultiblock;
import vazkii.botania.common.lexicon.page.PagePetalRecipe;
import vazkii.botania.common.lexicon.page.PageRuneRecipe;
import vazkii.botania.common.lexicon.page.PageTerrasteel;
import vazkii.botania.common.lexicon.page.PageText;
import vazkii.botania.common.lib.LibBlockNames;
import vazkii.botania.common.lib.LibLexicon;

public final class LexiconData {

	public static OmnibusEntry welcome;
	public static OmnibusEntry tutorial;

	public static OmnibusEntry flowers;
	public static OmnibusEntry apothecary;
	public static OmnibusEntry lexicon;
	public static OmnibusEntry wand;
	public static OmnibusEntry pureDaisy;
	public static OmnibusEntry runicAltar;
	public static OmnibusEntry terrasteel;
	public static OmnibusEntry blackLotus;
	public static OmnibusEntry flowerBag;
	public static OmnibusEntry gardenOfGlass;

	public static OmnibusEntry manaIntro;
	public static OmnibusEntry spreader;
	public static OmnibusEntry pool;
	public static OmnibusEntry lenses;
	public static OmnibusEntry distributor;
	public static OmnibusEntry manaVoid;
	public static OmnibusEntry manaTablet;
	public static OmnibusEntry manaMirror;
	public static OmnibusEntry manaDetector;
	public static OmnibusEntry redstoneSpreader;
	public static OmnibusEntry manastar;
	public static OmnibusEntry dreamwoodSpreader;
	public static OmnibusEntry elvenLenses;
	public static OmnibusEntry sparks;
	public static OmnibusEntry sparkUpgrades;
	public static OmnibusEntry rfGenerator;
	public static OmnibusEntry prism;
	public static OmnibusEntry poolCart;
	public static OmnibusEntry sparkChanger;
	public static OmnibusEntry bellows;

	public static OmnibusEntry functionalIntro;
	public static OmnibusEntry flowerShrinking;
	public static OmnibusEntry jadedAmaranthus;
	public static OmnibusEntry bellethorne;
	public static OmnibusEntry dreadthorne;
	public static OmnibusEntry heiseiDream;
	public static OmnibusEntry tigerseye;
	public static OmnibusEntry orechid;
	public static OmnibusEntry orechidIgnem;
	public static OmnibusEntry fallenKanade;
	public static OmnibusEntry exoflame;
	public static OmnibusEntry agricarnation;
	public static OmnibusEntry hopperhock;
	public static OmnibusEntry tangleberrie;
	public static OmnibusEntry jiyuulia;
	public static OmnibusEntry rannuncarpus;
	public static OmnibusEntry hyacidus;
	public static OmnibusEntry pollidisiac;
	public static OmnibusEntry clayconia;
	public static OmnibusEntry loonium;
	public static OmnibusEntry daffomill;
	public static OmnibusEntry vinculotus;
	public static OmnibusEntry spectranthemum;
	public static OmnibusEntry medumone;
	public static OmnibusEntry marimorphosis;
	public static OmnibusEntry bubbell;
	public static OmnibusEntry solegnolia;

	public static OmnibusEntry generatingIntro;
	public static OmnibusEntry passiveGen;
	public static OmnibusEntry primusLoci;
	public static OmnibusEntry daybloom;
	public static OmnibusEntry nightshade;
	public static OmnibusEntry endoflame;
	public static OmnibusEntry hydroangeas;
	public static OmnibusEntry thermalily;
	public static OmnibusEntry arcaneRose;
	public static OmnibusEntry munchdew;
	public static OmnibusEntry entropinnyum;
	public static OmnibusEntry kekimurus;
	public static OmnibusEntry gourmaryllis;
	public static OmnibusEntry narslimmus;
	public static OmnibusEntry spectrolus;
	public static OmnibusEntry rafflowsia;
	public static OmnibusEntry dandelifeon;

	public static OmnibusEntry pylon;
	public static OmnibusEntry manaEnchanting;
	public static OmnibusEntry turntable;
	public static OmnibusEntry alchemy;
	public static OmnibusEntry openCrate;
	public static OmnibusEntry forestEye;
	public static OmnibusEntry forestDrum;
	public static OmnibusEntry platform;
	public static OmnibusEntry conjurationCatalyst;
	public static OmnibusEntry spectralPlatform;
	public static OmnibusEntry gatherDrum;
	public static OmnibusEntry craftCrate;
	public static OmnibusEntry brewery;
	public static OmnibusEntry flasks;
	public static OmnibusEntry complexBrews;
	public static OmnibusEntry incense;
	public static OmnibusEntry hourglass;
	public static OmnibusEntry ghostRail;
	public static OmnibusEntry canopyDrum;
	public static OmnibusEntry cocoon;
	public static OmnibusEntry manaBomb;
	public static OmnibusEntry teruTeruBozu;
	public static OmnibusEntry avatar;
	public static OmnibusEntry felPumpkin;

	public static OmnibusEntry manaBlaster;
	public static OmnibusEntry grassSeeds;
	public static OmnibusEntry dirtRod;
	public static OmnibusEntry terraformRod;
	public static OmnibusEntry manasteelGear;
	public static OmnibusEntry terrasteelArmor;
	public static OmnibusEntry grassHorn;
	public static OmnibusEntry terraBlade;
	public static OmnibusEntry terraPick;
	public static OmnibusEntry waterRod;
	public static OmnibusEntry elfGear;
	public static OmnibusEntry openBucket;
	public static OmnibusEntry rainbowRod;
	public static OmnibusEntry tornadoRod;
	public static OmnibusEntry fireRod;
	public static OmnibusEntry vineBall;
	public static OmnibusEntry laputaShard;
	public static OmnibusEntry virus;
	public static OmnibusEntry skyDirtRod;
	public static OmnibusEntry glassPick;
	public static OmnibusEntry diviningRod;
	public static OmnibusEntry gravityRod;
	public static OmnibusEntry regenIvy;
	public static OmnibusEntry missileRod;
	public static OmnibusEntry craftingHalo;
	public static OmnibusEntry clip;
	public static OmnibusEntry cobbleRod;
	public static OmnibusEntry smeltRod;
	public static OmnibusEntry worldSeed;
	public static OmnibusEntry spellCloth;
	public static OmnibusEntry thornChakram;
	public static OmnibusEntry fireChakram;
	public static OmnibusEntry overgrowthSeed;
	public static OmnibusEntry livingwoodBow;
	public static OmnibusEntry crystalBow;
	public static OmnibusEntry temperanceStone;
	public static OmnibusEntry terraAxe;
	public static OmnibusEntry obedienceStick;
	public static OmnibusEntry slimeBottle;
	public static OmnibusEntry exchangeRod;
	public static OmnibusEntry manaweave;
	public static OmnibusEntry autocraftingHalo;
	public static OmnibusEntry sextant;

	public static OmnibusEntry enderAir;
	public static OmnibusEntry enderEyeBlock;
	public static OmnibusEntry pistonRelay;
	public static OmnibusEntry enderHand;
	public static OmnibusEntry enderDagger;
	public static OmnibusEntry spawnerClaw;
	public static OmnibusEntry redString;
	public static OmnibusEntry flightTiara;
	public static OmnibusEntry corporea;
	public static OmnibusEntry corporeaIndex;
	public static OmnibusEntry corporeaFunnel;
	public static OmnibusEntry corporeaInterceptor;
	public static OmnibusEntry endStoneDecor;
	public static OmnibusEntry spawnerMover;
	public static OmnibusEntry keepIvy;
	public static OmnibusEntry blackHoleTalisman;
	public static OmnibusEntry corporeaCrystalCube;
	public static OmnibusEntry luminizerTransport;
	public static OmnibusEntry starSword;
	public static OmnibusEntry thunderSword;
	public static OmnibusEntry corporeaRetainer;

	public static OmnibusEntry baublesIntro;
	public static OmnibusEntry cosmeticBaubles;
	public static OmnibusEntry tinyPlanet;
	public static OmnibusEntry manaRing;
	public static OmnibusEntry auraRing;
	public static OmnibusEntry travelBelt;
	public static OmnibusEntry knockbacklBelt;
	public static OmnibusEntry icePendant;
	public static OmnibusEntry lavaPendant;
	public static OmnibusEntry goldLaurel;
	public static OmnibusEntry waterRing;
	public static OmnibusEntry miningRing;
	public static OmnibusEntry magnetRing;
	public static OmnibusEntry divaCharm;
	public static OmnibusEntry pixieRing;
	public static OmnibusEntry superTravelBelt;
	public static OmnibusEntry reachRing;
	public static OmnibusEntry itemFinder;
	public static OmnibusEntry superLavaPendant;
	public static OmnibusEntry bloodPendant;
	public static OmnibusEntry judgementCloaks;
	public static OmnibusEntry monocle;
	public static OmnibusEntry swapRing;
	public static OmnibusEntry speedUpBelt;
	public static OmnibusEntry baubleBox;

	public static OmnibusEntry alfhomancyIntro;
	public static OmnibusEntry elvenMessage;
	public static OmnibusEntry elvenResources;
	public static OmnibusEntry gaiaRitual;
	public static OmnibusEntry gaiaRitualHardmode;
	public static OmnibusEntry elvenLore;
	public static OmnibusEntry relics;
	public static OmnibusEntry relicInfo;
	public static OmnibusEntry infiniteFruit;
	public static OmnibusEntry kingKey;
	public static OmnibusEntry flugelEye;
	public static OmnibusEntry thorRing;
	public static OmnibusEntry lokiRing;
	public static OmnibusEntry odinRing;

	public static OmnibusEntry unstableBlocks;
	public static OmnibusEntry decorativeBlocks;
	public static OmnibusEntry dispenserTweaks;
	public static OmnibusEntry shinyFlowers;
	public static OmnibusEntry prismarine;
	public static OmnibusEntry shedding;
	public static OmnibusEntry tinyPotato;
	public static OmnibusEntry headCreating;
	public static OmnibusEntry azulejo;
	public static OmnibusEntry starfield;
	public static OmnibusEntry dirtPath;
	public static OmnibusEntry mushrooms;
	public static OmnibusEntry phantomInk;
	public static OmnibusEntry stoneAlchemy;
	public static OmnibusEntry blazeBlock;
	public static OmnibusEntry challenges;
	public static OmnibusEntry cacophonium;
	public static OmnibusEntry pavement;

	public static OmnibusEntry tcIntegration;
	public static OmnibusEntry bcIntegration;
	public static OmnibusEntry banners;

	public static void init() {
		EbonArtsAPI.addCategory(EbonArtsAPI.categoryBasics = new BLexiconCategory(LibLexicon.CATEGORY_BASICS, 9));
		EbonArtsAPI.addCategory(EbonArtsAPI.categoryMana = new BLexiconCategory(LibLexicon.CATEGORY_MANA, 5));
		EbonArtsAPI.addCategory(EbonArtsAPI.categoryGenerationFlowers = new BLexiconCategory(LibLexicon.CATEGORY_GENERATION_FLOWERS, 5));
		EbonArtsAPI.addCategory(EbonArtsAPI.categoryFunctionalFlowers = new BLexiconCategory(LibLexicon.CATEGORY_FUNCTIONAL_FLOWERS, 5));
		EbonArtsAPI.addCategory(EbonArtsAPI.categoryDevices = new BLexiconCategory(LibLexicon.CATEGORY_DEVICES, 5));
		EbonArtsAPI.addCategory(EbonArtsAPI.categoryTools = new BLexiconCategory(LibLexicon.CATEGORY_TOOLS, 5));
		EbonArtsAPI.addCategory(EbonArtsAPI.categoryBaubles = new BLexiconCategory(LibLexicon.CATEGORY_BAUBLES, 5));
		EbonArtsAPI.addCategory(EbonArtsAPI.categoryEnder = new BLexiconCategory(LibLexicon.CATEGORY_ENDER, 5));
		EbonArtsAPI.addCategory(EbonArtsAPI.categoryAlfhomancy = new BLexiconCategory(LibLexicon.CATEGORY_ALFHOMANCY, 5));
		EbonArtsAPI.addCategory(EbonArtsAPI.categoryMisc = new BLexiconCategory(LibLexicon.CATEGORY_MISC, 0));

		OmnibusCategory categoryBasics = EbonArtsAPI.categoryBasics;
		OmnibusCategory categoryMana = EbonArtsAPI.categoryMana;
		OmnibusCategory categoryGenerationFlowers = EbonArtsAPI.categoryGenerationFlowers;
		OmnibusCategory categoryFunctionalFlowers = EbonArtsAPI.categoryFunctionalFlowers;
		OmnibusCategory categoryDevices = EbonArtsAPI.categoryDevices;
		OmnibusCategory categoryTools = EbonArtsAPI.categoryTools;
		OmnibusCategory categoryBaubles = EbonArtsAPI.categoryBaubles;
		OmnibusCategory categoryEnder = EbonArtsAPI.categoryEnder;
		OmnibusCategory categoryAlfhomancy = EbonArtsAPI.categoryAlfhomancy;
		OmnibusCategory categoryMisc = EbonArtsAPI.categoryMisc;

		// BASICS ENTRIES
		welcome = new WLexiconEntry();
		tutorial = new TLexiconEntry();

		flowers = new BLexiconEntry(LibLexicon.BASICS_FLOWERS, categoryBasics);
		flowers.setPriority().setLexiconPages(new PageText("0"), new PageImage("1", LibResources.ENTRY_FLOWERS), new PageText("2"), new PageCraftingRecipe("3", ModCraftingRecipes.recipesPetals), new PageCraftingRecipe("4", ModCraftingRecipes.recipePestleAndMortar), new PageCraftingRecipe("5", ModCraftingRecipes.recipesDyes),
				new PageText("6"), new PageCraftingRecipe("7", ModCraftingRecipes.recipeFertilizerPowder), new PageCraftingRecipe("8", ModCraftingRecipes.recipeFerilizerDye), new PageText("10"), new PageText("12"), new PageCraftingRecipe("11", ModCraftingRecipes.recipesPetalsDouble), new PageCraftingRecipe("9", ModCraftingRecipes.recipesPetalBlocks)).setIcon(new ItemStack(ModBlocks.flower, 1, 6));

		apothecary = new BLexiconEntry(LibLexicon.BASICS_APOTHECARY, categoryBasics);
		apothecary.setPriority().setLexiconPages(new PageText("0"), new PageImage("1", LibResources.ENTRY_APOTHECARY), new PageText("2"), new PageText("3"), new PageText("4"), new PageText("7"), new PageText("6"), new PageCraftingRecipe("5", ModCraftingRecipes.recipesApothecary));

		lexicon = new BLexiconEntry(LibLexicon.BASICS_LEXICON, categoryBasics);
		lexicon.setPriority().setLexiconPages(new PageText("0"), new PageText("3"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeLexicon), new PageText("2"));

		wand = new BLexiconEntry(LibLexicon.BASICS_WAND, categoryBasics);
		wand.setPriority().setLexiconPages(new PageText("0"), new PageText("1"), new PageText("2"), new PageCraftingRecipe("3", ModCraftingRecipes.recipesTwigWand));

		pureDaisy = new BLexiconEntry(LibLexicon.BASICS_PURE_DAISY, categoryBasics);
		pureDaisy.setPriority().setLexiconPages(new PageText("0"), new PageImage("1", LibResources.ENTRY_PURE_DAISY), new PageCraftingRecipe("2", ModCraftingRecipes.recipeLivingwoodTwig), new PageText("4"), new PagePetalRecipe("3", ModPetalRecipes.pureDaisyRecipe)).setIcon(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_PUREDAISY));
		OmnibusRecipeMappings.map(new ItemStack(ModBlocks.livingwood), pureDaisy, 1);
		OmnibusRecipeMappings.map(new ItemStack(ModBlocks.livingrock), pureDaisy, 1);

		runicAltar = new BLexiconEntry(LibLexicon.BASICS_RUNE_ALTAR, categoryBasics);
		runicAltar.setPriority().setLexiconPages(new PageText("21"), new PageText("0"), new PageText("1"), new PageCraftingRecipe("2", ModCraftingRecipes.recipesRuneAltar), new PageText("3"), new PageText("20"), new PageText("22"), new PageRuneRecipe("4", ModRuneRecipes.recipeWaterRune), new PageRuneRecipe("5", ModRuneRecipes.recipesEarthRune), new PageRuneRecipe("6", ModRuneRecipes.recipesAirRune), new PageRuneRecipe("7", ModRuneRecipes.recipeFireRune),
				new PageRuneRecipe("8", ModRuneRecipes.recipeSpringRune), new PageRuneRecipe("9", ModRuneRecipes.recipeSummerRune), new PageRuneRecipe("10", ModRuneRecipes.recipeAutumnRune), new PageRuneRecipe("11", ModRuneRecipes.recipesWinterRune),  new PageRuneRecipe("12", ModRuneRecipes.recipeManaRune),
				new PageRuneRecipe("13", ModRuneRecipes.recipeLustRune), new PageRuneRecipe("14", ModRuneRecipes.recipeGluttonyRune), new PageRuneRecipe("15", ModRuneRecipes.recipeGreedRune), new PageRuneRecipe("16", ModRuneRecipes.recipeSlothRune), new PageRuneRecipe("17", ModRuneRecipes.recipeWrathRune), new PageRuneRecipe("18", ModRuneRecipes.recipeEnvyRune), new PageRuneRecipe("19", ModRuneRecipes.recipePrideRune));

		terrasteel = new BLexiconEntry(LibLexicon.BASICS_TERRASTEEL, categoryBasics);
		terrasteel.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeTerraPlate), new PageText("2"), new PageMultiblock("4", ModMultiblocks.terrasteelPlate), new PageTerrasteel("3")).setIcon(new ItemStack(ModItems.manaResource, 1, 4));

		blackLotus = new BLexiconEntry(LibLexicon.BASICS_BLACK_LOTUS, categoryBasics);
		blackLotus.setLexiconPages(new PageText("0")).setIcon(new ItemStack(ModItems.blackLotus));

		flowerBag = new BLexiconEntry(LibLexicon.BASICS_FLOWER_BAG, categoryBasics);
		flowerBag.setLexiconPages(new PageText("0"), new PageText("2"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeFlowerBag));

		if(Botania.gardenOfGlassLoaded) {
			gardenOfGlass = new BLexiconEntry(LibLexicon.BASICS_GARDEN_OF_GLASS, categoryBasics);
			gardenOfGlass.setLexiconPages(new PageText("0"), new PageText("1"), new PageText("2"), new PageCraftingRecipe("3", ModCraftingRecipes.recipeRootToSapling), new PageCraftingRecipe("4", ModCraftingRecipes.recipeRootToFertilizer), new PageCraftingRecipe("5", ModCraftingRecipes.recipePebbleCobblestone), new PageText("6"), new PageManaInfusionRecipe("7", ModManaInfusionRecipes.sugarCaneRecipe), new PageCraftingRecipe("8", ModCraftingRecipes.recipeMagmaToSlimeball), new PageText("9"), new PageText("11"), new PageCraftingRecipe("12", ModCraftingRecipes.recipeEndPortal));
			gardenOfGlass.setPriority().setIcon(new ItemStack(ModItems.manaResource, 1, 20));
		}

		if(Botania.thaumcraftLoaded)
			new CLexiconEntry("wrap", categoryBasics, "Thaumcraft").setLexiconPages(new PageText("0")); // lel

		// MANA ENTRIES
		manaIntro = new BLexiconEntry(LibLexicon.MANA_INTRO, categoryMana);
		manaIntro.setPriority().setLexiconPages(new PageText("0"), new PageText("1"), new PageText("2"));

		spreader = new BLexiconEntry(LibLexicon.MANA_SPREADER, categoryMana);
		spreader.setPriority().setLexiconPages(new PageText("0"), new PageImage("1", LibResources.ENTRY_SPREADER), new PageText("2"), new PageText("3"), new PageText("4"), new PageText("11"), new PageCraftingRecipe("5", ModCraftingRecipes.recipesSpreader), new PageText("10"));

		pool = new BLexiconEntry(LibLexicon.MANA_POOL, categoryMana);
		pool.setPriority().setLexiconPages(new PageText("0"), new PageText("9"), new PageCraftingRecipe("1", ModCraftingRecipes.recipePool), new PageCraftingRecipe("10", ModCraftingRecipes.recipePoolDiluted), new PageText("14"), new PageText("2"), new PageText("8"), new PageManaInfusionRecipe("3", ModManaInfusionRecipes.manasteelRecipes), new PageManaInfusionRecipe("4", ModManaInfusionRecipes.manaPearlRecipe), new PageManaInfusionRecipe("5", ModManaInfusionRecipes.manaDiamondRecipes), new PageManaInfusionRecipe("6", ModManaInfusionRecipes.manaPowderRecipes), new PageManaInfusionRecipe("11", ModManaInfusionRecipes.managlassRecipe), new PageManaInfusionRecipe("12", ModManaInfusionRecipes.manaStringRecipe), new PageCraftingRecipe("13", ModCraftingRecipes.recipeCobweb), new PageManaInfusionRecipe("7", ModManaInfusionRecipes.manaCookieRecipe)).setIcon(new ItemStack(ModBlocks.pool));

		sparks = new BLexiconEntry(LibLexicon.MANA_SPARKS, categoryMana);
		sparks.setPriority().setLexiconPages(new PageText("0"), new PageText("1"), new PageText("3"), new PageCraftingRecipe("2", ModCraftingRecipes.recipesSpark));

		sparkUpgrades = new ALexiconEntry(LibLexicon.MANA_SPARK_UPGRADES, categoryMana);
		sparkUpgrades.setLexiconPages(new PageText("0"), new PageText("1"), new PageText("2"), new PageText("3"), new PageText("4"), new PageCraftingRecipe("5", ModCraftingRecipes.recipesSparkUpgrades));

		if(ConfigHandler.fluxfieldEnabled) {
			rfGenerator = new BLexiconEntry(LibLexicon.MANA_RF_GENERATOR, categoryMana);
			rfGenerator.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeRFGenerator));
		}

		lenses = new BLexiconEntry(LibLexicon.MANA_LENSES, categoryMana);
		lenses.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipesManaLens), new PageText("4"), new PageText("5"),
				new PageText("6"), new PageCraftingRecipe("7", ModCraftingRecipes.recipeLensVelocity),
				new PageText("8"), new PageCraftingRecipe("9", ModCraftingRecipes.recipeLensPotency),
				new PageText("10"), new PageCraftingRecipe("11", ModCraftingRecipes.recipeLensResistance),
				new PageText("12"), new PageCraftingRecipe("13", ModCraftingRecipes.recipeLensEfficiency),
				new PageText("14"), new PageCraftingRecipe("15", ModCraftingRecipes.recipeLensBounce),
				new PageText("16"), new PageCraftingRecipe("17", ModCraftingRecipes.recipeLensGravity),
				new PageText("18"), new PageCraftingRecipe("19", ModCraftingRecipes.recipeLensBore),
				new PageText("20"), new PageCraftingRecipe("21", ModCraftingRecipes.recipeLensDamaging),
				new PageText("22"), new PageCraftingRecipe("23", ModCraftingRecipes.recipeLensPhantom),
				new PageText("24"), new PageCraftingRecipe("25", ModCraftingRecipes.recipeLensMagnet),
				new PageText("26"), new PageCraftingRecipe("27", ModCraftingRecipes.recipeLensExplosive),
				new PageText("28"), new PageCraftingRecipe("29", ModCraftingRecipes.recipeLensInfluence),
				new PageText("30"), new PageCraftingRecipe("31", ModCraftingRecipes.recipeLensWeight),
				new PageText("32"), new PageCraftingRecipe("33", ModCraftingRecipes.recipeLensFire),
				new PageText("34"), new PageCraftingRecipe("35", ModCraftingRecipes.recipeLensPiston),
				new PageText("36"), new PageCraftingRecipe("37", ModCraftingRecipes.recipesLensFlash));

		distributor = new BLexiconEntry(LibLexicon.MANA_DISTRIBUTOR, categoryMana);
		distributor.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeDistributor));

		manaVoid = new BLexiconEntry(LibLexicon.MANA_VOID, categoryMana);
		manaVoid.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeManaVoid));

		manaTablet = new BLexiconEntry(LibLexicon.MANA_TABLET, categoryMana);
		manaTablet.setPriority().setLexiconPages(new PageText("0"), new PageText("1"), new PageCraftingRecipe("2", ModCraftingRecipes.recipesManaTablet));

		manaMirror = new BLexiconEntry(LibLexicon.MANA_MIRROR, categoryMana);
		manaMirror.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeManaMirror));

		manaDetector = new BLexiconEntry(LibLexicon.MANA_DETECTOR, categoryMana);
		manaDetector.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeManaDetector));

		redstoneSpreader = new BLexiconEntry(LibLexicon.MANA_REDSTONE_SPREADER, categoryMana);
		redstoneSpreader.setPriority().setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeRedstoneSpreader));

		manastar = new BLexiconEntry(LibLexicon.MANA_MANASTAR, categoryMana);
		manastar.setPriority().setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipes.manastarRecipe));

		dreamwoodSpreader = new ALexiconEntry(LibLexicon.MANA_DREAMWOOD_SPREADER, categoryMana);
		dreamwoodSpreader.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipesDreamwoodSpreader), new PageText("2"), new PageCraftingRecipe("3", ModCraftingRecipes.recipeUltraSpreader));

		elvenLenses = new ALexiconEntry(LibLexicon.MANA_ELVEN_LENSES, categoryMana);
		elvenLenses.setLexiconPages(new PageText("0"), new PageText("1"), new PageCraftingRecipe("2", ModCraftingRecipes.recipeLensPaint), new PageText("3"), new PageCraftingRecipe("4", ModCraftingRecipes.recipeLensWarp), new PageText("5"), new PageCraftingRecipe("6", ModCraftingRecipes.recipeLensRedirect),
				new PageText("7"), new PageCraftingRecipe("8", ModCraftingRecipes.recipeLensFirework), new PageText("9"), new PageCraftingRecipe("10", ModCraftingRecipes.recipeLensFlare));

		prism = new ALexiconEntry(LibLexicon.MANA_PRISM, categoryMana);
		prism.setLexiconPages(new PageText("0"), new PageText("1"), new PageText("2"), new PageCraftingRecipe("3", ModCraftingRecipes.recipePrism));

		poolCart = new BLexiconEntry(LibLexicon.MANA_POOL_CART, categoryMana);
		poolCart.setLexiconPages(new PageText("0"), new PageText("1"), new PageText("2"), new PageCraftingRecipe("3", ModCraftingRecipes.recipePoolCart), new PageCraftingRecipe("4", ModCraftingRecipes.recipePump));

		sparkChanger = new ALexiconEntry(LibLexicon.MANA_SPARK_CHANGER, categoryMana);
		sparkChanger.setLexiconPages(new PageText("0"), new PageText("1"), new PageCraftingRecipe("2", ModCraftingRecipes.recipeSparkChanger));

		bellows = new BLexiconEntry(LibLexicon.MANA_BELLOWS, categoryMana);
		bellows.setLexiconPages(new PageText("0"), new PageText("1"), new PageCraftingRecipe("2", ModCraftingRecipes.recipeBellows));

		// FUNCTIONAL FLOWERS ENTRIES
		functionalIntro = new BLexiconEntry(LibLexicon.FFLOWER_INTRO, categoryFunctionalFlowers);
		functionalIntro.setPriority().setLexiconPages(new PageText("0"), new PageText("1"), new PageText("2"), new PageText("3"), new PageCraftingRecipe("4", ModCraftingRecipes.recipeRedstoneRoot)).setIcon(null);;

		flowerShrinking = new BLexiconEntry(LibLexicon.FFLOWER_SHRINKING, categoryFunctionalFlowers);
		flowerShrinking.setPriority().setLexiconPages(new PageText("0"), new PageManaInfusionRecipe("1", EbonArtsAPI.miniFlowerRecipes)).setIcon(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_BELLETHORN + "Chibi"));

		jadedAmaranthus = new BLexiconEntry(LibLexicon.FFLOWER_JADED_AMARANTHUS, categoryFunctionalFlowers);
		jadedAmaranthus.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipes.jadedAmaranthusRecipe), new PageText("2"));

		bellethorne = new BLexiconEntry(LibLexicon.FFLOWER_BELLETHORNE, categoryFunctionalFlowers);
		bellethorne.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipes.bellethorneRecipe));

		dreadthorne = new BLexiconEntry(LibLexicon.FFLOWER_DREADTHORNE, categoryFunctionalFlowers);
		dreadthorne.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipes.dreadthorneRecipe));

		heiseiDream = new ALexiconEntry(LibLexicon.FFLOWER_HEISEI_DREAM, categoryFunctionalFlowers);
		heiseiDream.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipes.heiseiDreamRecipe));

		tigerseye = new BLexiconEntry(LibLexicon.FFLOWER_TIGERSEYE, categoryFunctionalFlowers);
		tigerseye.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipes.tigerseyeRecipe));

		orechid = Botania.gardenOfGlassLoaded ? new BLexiconEntry(LibLexicon.FFLOWER_ORECHID, categoryFunctionalFlowers) : new ALexiconEntry(LibLexicon.FFLOWER_ORECHID, categoryFunctionalFlowers);
		orechid.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipes.orechidRecipe));
		if(Botania.gardenOfGlassLoaded)
			orechid.setPriority();

		orechidIgnem = new ALexiconEntry(LibLexicon.FFLOWER_ORECHID_IGNEM, categoryFunctionalFlowers);
		orechidIgnem.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipes.orechidIgnemRecipe));

		if(ConfigHandler.fallenKanadeEnabled) {
			fallenKanade = new BLexiconEntry(LibLexicon.FFLOWER_FALLEN_KANADE, categoryFunctionalFlowers);
			fallenKanade.setLexiconPages(new PageText(Botania.bloodMagicLoaded ? "0a" : "0"), new PagePetalRecipe("1", ModPetalRecipes.fallenKanadeRecipe));
		}

		exoflame = new BLexiconEntry(LibLexicon.FFLOWER_EXOFLAME, categoryFunctionalFlowers);
		exoflame.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipes.exoflameRecipe));

		agricarnation = new BLexiconEntry(LibLexicon.FFLOWER_AGRICARNATION, categoryFunctionalFlowers);
		agricarnation.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipes.agricarnationRecipe));

		hopperhock = new BLexiconEntry(LibLexicon.FFLOWER_HOPPERHOCK, categoryFunctionalFlowers);
		hopperhock.setLexiconPages(new PageText("0"), new PageText("1"), new PagePetalRecipe("2", ModPetalRecipes.hopperhockRecipe));

		tangleberrie = new BLexiconEntry(LibLexicon.FFLOWER_TANGLEBERRIE, categoryFunctionalFlowers);
		tangleberrie.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipes.tangleberrieRecipe));

		jiyuulia = new BLexiconEntry(LibLexicon.FFLOWER_JIYUULIA, categoryFunctionalFlowers);
		jiyuulia.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipes.jiyuuliaRecipe));

		rannuncarpus = new BLexiconEntry(LibLexicon.FFLOWER_RANNUNCARPUS, categoryFunctionalFlowers);
		rannuncarpus.setLexiconPages(new PageText("0"), new PageText("1"), new PagePetalRecipe("2", ModPetalRecipes.rannuncarpusRecipe));

		hyacidus = new BLexiconEntry(LibLexicon.FFLOWER_HYACIDUS, categoryFunctionalFlowers);
		hyacidus.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipes.hyacidusRecipe));

		pollidisiac = new BLexiconEntry(LibLexicon.FFLOWER_POLLIDISIAC, categoryFunctionalFlowers);
		pollidisiac.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipes.pollidisiacRecipe));

		clayconia = new BLexiconEntry(LibLexicon.FFLOWER_CLAYCONIA, categoryFunctionalFlowers);
		clayconia.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipes.clayconiaRecipe));

		loonium = new ALexiconEntry(LibLexicon.FFLOWER_LOONIUM, categoryFunctionalFlowers);
		loonium.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipes.looniumRecipe));

		daffomill = new BLexiconEntry(LibLexicon.FFLOWER_DAFFOMILL, categoryFunctionalFlowers);
		daffomill.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipes.daffomillRecipe));

		vinculotus = new BLexiconEntry(LibLexicon.FFLOWER_VINCULOTUS, categoryFunctionalFlowers);
		vinculotus.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipes.vinculotusRecipe));

		spectranthemum = new ALexiconEntry(LibLexicon.FFLOWER_SPECTRANTHEMUN, categoryFunctionalFlowers);
		spectranthemum.setLexiconPages(new PageText("0"), new PageText("1"), new PageText("2"), new PagePetalRecipe("3", ModPetalRecipes.spectranthemumRecipe));

		medumone = new BLexiconEntry(LibLexicon.FFLOWER_MEDUMONE, categoryFunctionalFlowers);
		medumone.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipes.medumoneRecipe));

		marimorphosis = new BLexiconEntry(LibLexicon.FFLOWER_MARIMORPHOSIS, categoryFunctionalFlowers);
		marimorphosis.setLexiconPages(new PageText("0"), new PageImage("1", LibResources.ENTRY_METAMORPHIC_STONES), new PagePetalRecipe("2", ModPetalRecipes.marimorphosisRecipe), new PageCraftingRecipe("3", ModCraftingRecipes.recipesAltarMeta));

		bubbell = new ALexiconEntry(LibLexicon.FFLOWER_BUBBELL, categoryFunctionalFlowers);
		bubbell.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipes.bubbellRecipe));

		solegnolia = new BLexiconEntry(LibLexicon.FFLOWER_SOLEGNOLIA, categoryFunctionalFlowers);
		solegnolia.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipes.solegnoliaRecipe));

		// GENERATING FLOWERS ENTRIES
		generatingIntro = new BLexiconEntry(LibLexicon.GFLOWER_INTRO, categoryGenerationFlowers);
		generatingIntro.setPriority().setLexiconPages(new PageText("0"), new PageText("1"), new PageText("2"));

		passiveGen = new BLexiconEntry(LibLexicon.GFLOWER_PASSIVE_GENERATION, categoryGenerationFlowers);
		passiveGen.setPriority().setLexiconPages(new PageText("0"), new PageText("1")).setIcon(new ItemStack(Blocks.deadbush));

		primusLoci = new BLexiconEntry(LibLexicon.GFLOWER_PRIMUS_LOCI, categoryGenerationFlowers);
		primusLoci.setPriority().setLexiconPages(new PageText("0"), new PageText("1"));
		primusLoci.setIcon(ItemBlockSpecialFlower.ofType(LibBlockNames.SUBTILE_DAYBLOOM_PRIME));

		daybloom = new BLexiconEntry(LibLexicon.GFLOWER_DAYBLOOM, categoryGenerationFlowers);
		daybloom.setPriority().setLexiconPages(new PageText("0"), new PageText("1"), new PagePetalRecipe("2", ModPetalRecipes.daybloomRecipe));

		nightshade = new BLexiconEntry(LibLexicon.GFLOWER_NIGHTSHADE, categoryGenerationFlowers);
		nightshade.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipes.nightshadeRecipe));

		endoflame = new BLexiconEntry(LibLexicon.GFLOWER_ENDOFLAME, categoryGenerationFlowers);
		endoflame.setLexiconPages(new PageText("0"), new PageText("1"), new PageText("3"), new PagePetalRecipe("2", ModPetalRecipes.endoflameRecipe));

		hydroangeas = new BLexiconEntry(LibLexicon.GFLOWER_HYDROANGEAS, categoryGenerationFlowers);
		hydroangeas.setLexiconPages(new PageText("0"), new PageImage("2", LibResources.ENTRY_HYDROANGEAS), new PagePetalRecipe("1", ModPetalRecipes.hydroangeasRecipe));

		thermalily = new BLexiconEntry(LibLexicon.GFLOWER_THERMALILY, categoryGenerationFlowers);
		thermalily.setLexiconPages(new PageText("0"), new PageText("2"), new PageText("3"), new PagePetalRecipe("1", ModPetalRecipes.thermalilyRecipe));

		arcaneRose = new BLexiconEntry(LibLexicon.GFLOWER_ARCANE_ROSE, categoryGenerationFlowers);
		arcaneRose.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipes.arcaneRoseRecipe));

		munchdew = new BLexiconEntry(LibLexicon.GFLOWER_MUNCHDEW, categoryGenerationFlowers);
		munchdew.setLexiconPages(new PageText("0"), new PageText("1"), new PagePetalRecipe("2", ModPetalRecipes.munchdewRecipe));

		entropinnyum = new BLexiconEntry(LibLexicon.GFLOWER_ENTROPINNYUM, categoryGenerationFlowers);
		entropinnyum.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipes.entropinnyumRecipe));

		kekimurus = new ALexiconEntry(LibLexicon.GFLOWER_KEKIMURUS, categoryGenerationFlowers);
		kekimurus.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipes.kekimurusRecipe));

		gourmaryllis = new BLexiconEntry(LibLexicon.GFLOWER_GOURMARYLLIS, categoryGenerationFlowers);
		gourmaryllis.setLexiconPages(new PageText("0"), new PageText("1"), new PageText("2"), new PagePetalRecipe("3", ModPetalRecipes.gourmaryllisRecipe));

		narslimmus = new BLexiconEntry(LibLexicon.GFLOWER_NARSLIMMUS, categoryGenerationFlowers);
		narslimmus.setLexiconPages(new PageText("0"), new PagePetalRecipe("1", ModPetalRecipes.narslimmusRecipe));

		spectrolus = new ALexiconEntry(LibLexicon.GFLOWER_SPECTROLUS, categoryGenerationFlowers);
		spectrolus.setLexiconPages(new PageText("0"), new PageText("1"), new PagePetalRecipe("2", ModPetalRecipes.spectrolusRecipe));

		rafflowsia = new ALexiconEntry(LibLexicon.GFLOWER_RAFFLOWSIA, categoryGenerationFlowers);
		rafflowsia.setLexiconPages(new PageText("0"), new PageText("1"), new PageText("2"), new PageText("3"), new PagePetalRecipe("4", ModPetalRecipes.rafflowsiaRecipe));

		dandelifeon = new ALexiconEntry(LibLexicon.GFLOWER_DANDELIFEON, categoryGenerationFlowers);
		dandelifeon.setLexiconPages(new PageText("_w"), new PageText("0"), new PageText("1"), new PageText("2"), new PageText("3"), new PageText("4"), new PageText("5"), new PageText("6"), new PageText("10"), new PageText("7"), new PagePetalRecipe("8", ModPetalRecipes.dandelifeonRecipe), new PageCraftingRecipe("9", ModCraftingRecipes.recipeCellBlock));

		// DEVICES ENTRIES
		pylon = new BLexiconEntry(LibLexicon.DEVICE_PYLON, categoryDevices);
		pylon.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipePylon));

		if(ConfigHandler.enchanterEnabled) {
			manaEnchanting = new BLexiconEntry(LibLexicon.DEVICE_MANA_ENCHANTING, categoryDevices);
			manaEnchanting.setLexiconPages(new PageText("0"), new PageText("1"), new PageMultiblock("2", ModMultiblocks.enchanter), new PageText("5"), new PageText("6"), new PageText("7"), new PageText("8"), new PageText("9")).setIcon(new ItemStack(ModBlocks.enchanter));
		}

		turntable = new BLexiconEntry(LibLexicon.DEVICE_TURNTABLE, categoryDevices);
		turntable.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeTurntable));

		alchemy = new BLexiconEntry(LibLexicon.DEVICE_ALCHEMY, categoryDevices);
		alchemy.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeAlchemyCatalyst),
				new PageManaInfusionRecipe("2", ModManaAlchemyRecipes.leatherRecipe), new PageManaInfusionRecipe("3", ModManaAlchemyRecipes.woodRecipes), new PageManaInfusionRecipe("4", ModManaAlchemyRecipes.saplingRecipes), new PageManaInfusionRecipe("5", ModManaAlchemyRecipes.glowstoneDustRecipe),
				new PageManaInfusionRecipe("6", ModManaAlchemyRecipes.quartzRecipes).setSkipRegistry(), new PageManaInfusionRecipe("7", ModManaAlchemyRecipes.chiseledBrickRecipe), new PageManaInfusionRecipe("8", ModManaAlchemyRecipes.iceRecipe), new PageManaInfusionRecipe("9", ModManaAlchemyRecipes.swampFolliageRecipes),
				new PageManaInfusionRecipe("10", ModManaAlchemyRecipes.fishRecipes), new PageManaInfusionRecipe("11", ModManaAlchemyRecipes.cropRecipes), new PageManaInfusionRecipe("12", ModManaAlchemyRecipes.potatoRecipe), new PageManaInfusionRecipe("13", ModManaAlchemyRecipes.netherWartRecipe),
				new PageManaInfusionRecipe("14", ModManaAlchemyRecipes.gunpowderAndFlintRecipes), new PageManaInfusionRecipe("15", ModManaAlchemyRecipes.nameTagRecipe), new PageManaInfusionRecipe("16", ModManaAlchemyRecipes.stringRecipes), new PageManaInfusionRecipe("17", ModManaAlchemyRecipes.slimeballCactusRecipes),
				new PageManaInfusionRecipe("18", ModManaAlchemyRecipes.enderPearlRecipe), new PageManaInfusionRecipe("19", ModManaAlchemyRecipes.redstoneToGlowstoneRecipes), new PageManaInfusionRecipe("20", ModManaAlchemyRecipes.sandRecipe), new PageManaInfusionRecipe("21", ModManaAlchemyRecipes.redSandRecipe),
				new PageManaInfusionRecipe("22", ModManaAlchemyRecipes.clayBreakdownRecipes), new PageManaInfusionRecipe("24", ModManaAlchemyRecipes.tallgrassRecipes), new PageManaInfusionRecipe("25", ModManaAlchemyRecipes.flowersRecipes), new PageManaInfusionRecipe("23", ModManaAlchemyRecipes.coarseDirtRecipe));

		openCrate = new BLexiconEntry(LibLexicon.DEVICE_OPEN_CRATE, categoryDevices);
		openCrate.setPriority().setLexiconPages(new PageText("0"), new PageText("1"), new PageCraftingRecipe("2", ModCraftingRecipes.recipeOpenCrate));

		forestEye = new BLexiconEntry(LibLexicon.DEVICE_FOREST_EYE, categoryDevices);
		forestEye.setLexiconPages(new PageText("0"), new PageText("1"), new PageCraftingRecipe("2", ModCraftingRecipes.recipeForestEye));

		forestDrum = new BLexiconEntry(LibLexicon.DEVICE_FOREST_DRUM, categoryDevices);
		forestDrum.setLexiconPages(new PageText("0"), new PageText("1"), new PageCraftingRecipe("2", ModCraftingRecipes.recipeForestDrum));

		platform = new BLexiconEntry(LibLexicon.DEVICE_PLATFORM, categoryDevices);
		platform.setLexiconPages(new PageText("0"), new PageText("2"), new PageCraftingRecipe("1", ModCraftingRecipes.recipePlatform));

		conjurationCatalyst = new ALexiconEntry(LibLexicon.DEVICE_MANA_CONJURATION, categoryDevices);
		conjurationCatalyst.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeConjurationCatalyst), new PageManaInfusionRecipe("2", ModManaConjurationRecipes.redstoneRecipe), new PageManaInfusionRecipe("3", ModManaConjurationRecipes.glowstoneRecipe), new PageManaInfusionRecipe("4", ModManaConjurationRecipes.quartzRecipe),
				new PageManaInfusionRecipe("5", ModManaConjurationRecipes.coalRecipe), new PageManaInfusionRecipe("6", ModManaConjurationRecipes.snowballRecipe), new PageManaInfusionRecipe("7", ModManaConjurationRecipes.netherrackRecipe), new PageManaInfusionRecipe("8", ModManaConjurationRecipes.soulSandRecipe), new PageManaInfusionRecipe("9", ModManaConjurationRecipes.gravelRecipe),
				new PageManaInfusionRecipe("10", ModManaConjurationRecipes.leavesRecipes), new PageManaInfusionRecipe("11", ModManaConjurationRecipes.grassRecipe));

		spectralPlatform = new ALexiconEntry(LibLexicon.DEVICE_SPECTRAL_PLATFORM, categoryDevices);
		spectralPlatform.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeSpectralPlatform));

		gatherDrum = new ALexiconEntry(LibLexicon.DEVICE_GATHER_DRUM, categoryDevices);
		gatherDrum.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeGatherDrum));

		craftCrate = new ALexiconEntry(LibLexicon.DEVICE_CRAFT_CRATE, categoryDevices);
		craftCrate.setLexiconPages(new PageText("0"), new PageText("1"), new PageCraftingRecipe("2", ModCraftingRecipes.recipePlaceholder), new PageText("3"), new PageText("4"), new PageText("7"), new PageImage("5", LibResources.ENTRY_CRAFT_CRATE), new PageCraftingRecipe("6", ModCraftingRecipes.recipeCraftCrate), new PageText("8"), new PageCraftingRecipe("9", ModCraftingRecipes.recipesPatterns)).setIcon(new ItemStack(ModBlocks.openCrate, 1, 1));

		brewery = new BLexiconEntry(LibLexicon.DEVICE_BREWERY, categoryDevices);
		brewery.setLexiconPages(new PageText("0"), new PageText("1"), new PageCraftingRecipe("2", ModCraftingRecipes.recipeBrewery), new PageCraftingRecipe("3", ModCraftingRecipes.recipeVial), new PageText("4"),
				new PageBrew(ModBrewRecipes.speedBrew, "5a", "5b"), new PageBrew(ModBrewRecipes.strengthBrew, "6a", "6b"),
				new PageBrew(ModBrewRecipes.hasteBrew, "7a", "7b"), new PageBrew(ModBrewRecipes.healingBrew, "8a", "8b"),
				new PageBrew(ModBrewRecipes.jumpBoostBrew, "9a", "9b"), new PageBrew(ModBrewRecipes.regenerationBrew, "10a", "10b"),
				new PageBrew(ModBrewRecipes.weakRegenerationBrew, "17a", "17b"),
				new PageBrew(ModBrewRecipes.resistanceBrew, "11a", "11b"), new PageBrew(ModBrewRecipes.fireResistanceBrew, "12a", "12b"),
				new PageBrew(ModBrewRecipes.waterBreathingBrew, "13a", "13b"), new PageBrew(ModBrewRecipes.invisibilityBrew, "14a", "14b"),
				new PageBrew(ModBrewRecipes.nightVisionBrew, "15a", "15b"), new PageBrew(ModBrewRecipes.absorptionBrew, "16a", "16b"));

		flasks = new ALexiconEntry(LibLexicon.DEVICE_FLASKS, categoryDevices);
		flasks.setLexiconPages(new PageText("0"), new PageText("1"), new PageCraftingRecipe("2", ModCraftingRecipes.recipeFlask));

		complexBrews = new BLexiconEntry(LibLexicon.DEVICE_COMPLEX_BREWS, categoryDevices);
		complexBrews.setLexiconPages(new PageText("0"),
				new PageBrew(ModBrewRecipes.overloadBrew, "1a", "1b"), new PageBrew(ModBrewRecipes.soulCrossBrew, "2a", "2b"),
				new PageBrew(ModBrewRecipes.featherFeetBrew, "3a", "3b"), new PageBrew(ModBrewRecipes.emptinessBrew, "4a", "4b"),
				new PageBrew(ModBrewRecipes.bloodthirstBrew, "5a", "5b"), new PageBrew(ModBrewRecipes.allureBrew, "6a", "6b"),
				new PageBrew(ModBrewRecipes.clearBrew, "7a", "7b")).setIcon(((IBrewContainer) ModItems.vial).getItemForBrew(ModBrews.jumpBoost, new ItemStack(ModItems.vial)));

		incense = new BLexiconEntry(LibLexicon.DEVICE_INCENSE, categoryDevices);
		incense.setLexiconPages(new PageText("0"), new PageText("1"), new PageText("2"), new PageText("5"), new PageCraftingRecipe("3", ModCraftingRecipes.recipeIncenseStick), new PageCraftingRecipe("4", ModCraftingRecipes.recipeIncensePlate));

		hourglass = new BLexiconEntry(LibLexicon.DEVICE_HOURGLASS, categoryDevices);
		hourglass.setPriority().setLexiconPages(new PageText("0"), new PageText("1"), new PageText("2"), new PageText("3"), new PageText("4"), new PageCraftingRecipe("5", ModCraftingRecipes.recipeHourglass));

		ghostRail = new ALexiconEntry(LibLexicon.DEVICE_GHOST_RAIL, categoryDevices);
		ghostRail.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeGhostRail));

		canopyDrum = new BLexiconEntry(LibLexicon.DEVICE_CANOPY_DRUM, categoryDevices);
		canopyDrum.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeCanopyDrum));

		cocoon = Botania.gardenOfGlassLoaded ? new BLexiconEntry(LibLexicon.DEVICE_COCOON, categoryDevices) : new ALexiconEntry(LibLexicon.DEVICE_COCOON, categoryDevices);
		cocoon.setLexiconPages(new PageText("0"), new PageText("1"), new PageCraftingRecipe("2", ModCraftingRecipes.recipeCocoon));

		manaBomb = new ALexiconEntry(LibLexicon.DEVICE_MANA_BOMB, categoryDevices);
		manaBomb.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeManaBomb));

		teruTeruBozu = new BLexiconEntry(LibLexicon.DEVICE_TERU_TERU_BOZU, categoryDevices);
		teruTeruBozu.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeTeruTeruBozu));

		avatar = new BLexiconEntry(LibLexicon.DEVICE_AVATAR, categoryDevices);
		avatar.setLexiconPages(new PageText("0"), new PageText("1"), new PageCraftingRecipe("2", ModCraftingRecipes.recipeAvatar));

		felPumpkin = new BLexiconEntry(LibLexicon.DEVICE_FEL_PUMPKIN, categoryDevices);
		felPumpkin.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeFelPumpkin));

		// TOOLS ENTRIES
		manaBlaster = new BLexiconEntry(LibLexicon.TOOL_MANA_BLASTER, categoryTools);
		manaBlaster.setLexiconPages(new PageText("0"), new PageText("1"), new PageText("2"), new PageCraftingRecipe("3", ModCraftingRecipes.recipeManaBlaster));

		grassSeeds = new BLexiconEntry(LibLexicon.TOOL_GRASS_SEEDS, categoryTools);
		grassSeeds.setLexiconPages(new PageText("0"), new PageManaInfusionRecipe("1", ModManaInfusionRecipes.grassSeedsRecipe), new PageManaInfusionRecipe("2", ModManaInfusionRecipes.podzolSeedsRecipe), new PageManaInfusionRecipe("3", ModManaInfusionRecipes.mycelSeedsRecipes), new PageText("4"), new PageCraftingRecipe("5", ModCraftingRecipes.recipesAltGrassSeeds));

		dirtRod = new BLexiconEntry(LibLexicon.TOOL_DIRT_ROD, categoryTools);
		dirtRod.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeDirtRod));

		terraformRod = new BLexiconEntry(LibLexicon.TOOL_TERRAFORM_ROD, categoryTools);
		terraformRod.setLexiconPages(new PageText("0"), new PageText("1"), new PageText("2"), new PageCraftingRecipe("3", ModCraftingRecipes.recipeTerraformRod));

		manasteelGear = new BLexiconEntry(LibLexicon.TOOL_MANASTEEL_GEAR, categoryTools);
		manasteelGear.setPriority().setLexiconPages(new PageText("0"), new PageText("10"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeManasteelPick), new PageCraftingRecipe("2", ModCraftingRecipes.recipeManasteelShovel), new PageCraftingRecipe("3", ModCraftingRecipes.recipeManasteelAxe),
				new PageCraftingRecipe("4", ModCraftingRecipes.recipeManasteelShears), new PageCraftingRecipe("5", ModCraftingRecipes.recipeManasteelSword),
				new PageCraftingRecipe("6", ModCraftingRecipes.recipeManasteelHelm), new PageCraftingRecipe("7", ModCraftingRecipes.recipeManasteelChest), new PageCraftingRecipe("8", ModCraftingRecipes.recipeManasteelLegs), new PageCraftingRecipe("9", ModCraftingRecipes.recipeManasteelBoots));

		terrasteelArmor = new BLexiconEntry(LibLexicon.TOOL_TERRASTEEL_ARMOR, categoryTools);
		terrasteelArmor.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeTerrasteelHelm), new PageCraftingRecipe("2", ModCraftingRecipes.recipeTerrasteelChest), new PageCraftingRecipe("3", ModCraftingRecipes.recipeTerrasteelLegs), new PageCraftingRecipe("4", ModCraftingRecipes.recipeTerrasteelBoots));

		grassHorn = new BLexiconEntry(LibLexicon.TOOL_GRASS_HORN, categoryTools);
		grassHorn.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeGrassHorn), new PageCraftingRecipe("2", ModCraftingRecipes.recipeLeafHorn), new PageCraftingRecipe("3", ModCraftingRecipes.recipeSnowHorn));

		terraBlade = new BLexiconEntry(LibLexicon.TOOL_TERRA_SWORD, categoryTools);
		terraBlade.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeTerraSword));

		terraPick = new BLexiconEntry(LibLexicon.TOOL_TERRA_PICK, categoryTools);
		terraPick.setLexiconPages(new PageText("0"), new PageText("1"), new PageText("2"), new PageText("3"), new PageText("4"), new PageCraftingRecipe("5", ModCraftingRecipes.recipeTerraPick));

		waterRod = new BLexiconEntry(LibLexicon.TOOL_WATER_ROD, categoryTools);
		waterRod.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeWaterRod));

		elfGear = new ALexiconEntry(LibLexicon.TOOL_ELF_GEAR, categoryTools);
		elfGear.setLexiconPages(new PageText("0"), new PageText("1"), new PageText("2"), new PageCraftingRecipe("3", ModCraftingRecipes.recipeElementiumPick), new PageText("4"), new PageCraftingRecipe("5", ModCraftingRecipes.recipeElementiumShovel),
				new PageText("6"), new PageCraftingRecipe("7", ModCraftingRecipes.recipeElementiumAxe), new PageText("8"), new PageCraftingRecipe("9", ModCraftingRecipes.recipeElementiumShears), new PageText("10"), new PageCraftingRecipe("11", ModCraftingRecipes.recipeElementiumSword),
				new PageCraftingRecipe("12", ModCraftingRecipes.recipeElementiumHelm), new PageCraftingRecipe("13", ModCraftingRecipes.recipeElementiumChest), new PageCraftingRecipe("14", ModCraftingRecipes.recipeElementiumLegs), new PageCraftingRecipe("15", ModCraftingRecipes.recipeElementiumBoots));

		openBucket = new ALexiconEntry(LibLexicon.TOOL_OPEN_BUCKET, categoryTools);
		openBucket.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeOpenBucket));

		rainbowRod = new ALexiconEntry(LibLexicon.TOOL_RAINBOW_ROD, categoryTools);
		rainbowRod.setLexiconPages(new PageText("0"), new PageText("1"), new PageText("6"), new PageCraftingRecipe("2", ModCraftingRecipes.recipeRainbowRod), new PageCraftingRecipe("3", ModCraftingRecipes.recipeBifrost), new PageCraftingRecipe("4", ModCraftingRecipes.recipeShimmerrock), new PageCraftingRecipe("5", ModCraftingRecipes.recipeShimmerwoodPlanks), new PageCraftingRecipe("7", ModCraftingRecipes.recipePoolFabulous));

		tornadoRod = new BLexiconEntry(LibLexicon.TOOL_TORNADO_ROD, categoryTools);
		tornadoRod.setLexiconPages(new PageText("0"), new PageText("2"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeTornadoRod));

		fireRod = new BLexiconEntry(LibLexicon.TOOL_FIRE_ROD, categoryTools);
		fireRod.setLexiconPages(new PageText("0"), new PageText("2"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeFireRod));

		vineBall = new BLexiconEntry(LibLexicon.TOOL_VINE_BALL, categoryTools);
		vineBall.setLexiconPages(new PageText("0"), new PageText("1"), new PageCraftingRecipe("2", ModCraftingRecipes.recipeVineBall), new PageCraftingRecipe("3", ModCraftingRecipes.recipeSlingshot), new PageCraftingRecipe("4", ModCraftingRecipes.recipeMossStone));

		laputaShard = new ALexiconEntry(LibLexicon.TOOL_LAPUTA_SHARD, categoryTools);
		laputaShard.setLexiconPages(new PageText("0"), new PageText("2"), new PageCraftingRecipe("1", ModCraftingRecipes.recipesLaputaShard), new PageCraftingRecipe("3", ModCraftingRecipes.recipesLaputaShardUpgrade));

		virus = new ALexiconEntry(LibLexicon.TOOL_VIRUS, categoryTools);
		virus.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeVirusZombie), new PageCraftingRecipe("2", ModCraftingRecipes.recipeVirusSkeleton));

		skyDirtRod = new ALexiconEntry(LibLexicon.TOOL_SKY_DIRT_ROD, categoryTools);
		skyDirtRod.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeSkyDirtRod));

		glassPick = new BLexiconEntry(LibLexicon.TOOL_GLASS_PICK, categoryTools);
		glassPick.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeGlassPick));

		diviningRod = new BLexiconEntry(LibLexicon.TOOL_DIVINING_ROD, categoryTools);
		diviningRod.setLexiconPages(new PageText("0"), new PageText("2"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeDiviningRod));

		gravityRod = new ALexiconEntry(LibLexicon.TOOL_GRAVITY_ROD, categoryTools);
		gravityRod.setLexiconPages(new PageText("0"), new PageText("1"), new PageCraftingRecipe("2", ModCraftingRecipes.recipeGravityRod));

		regenIvy = new ALexiconEntry(LibLexicon.TOOL_REGEN_IVY, categoryTools);
		regenIvy.setLexiconPages(new PageText("0"), new PageText("1"), new PageCraftingRecipe("2", ModCraftingRecipes.recipeRegenIvy));

		missileRod = new ALexiconEntry(LibLexicon.TOOL_MISSILE_ROD, categoryTools);
		missileRod.setLexiconPages(new PageText("0"), new PageText("2"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeMissileRod));

		craftingHalo = new BLexiconEntry(LibLexicon.TOOL_CRAFTING_HALO, categoryTools);
		craftingHalo.setLexiconPages(new PageText("0"), new PageText("1"), new PageCraftingRecipe("2", ModCraftingRecipes.recipeCraftingHalo));

		clip = new ALexiconEntry(LibLexicon.TOOL_CLIP, categoryTools);
		clip.setLexiconPages(new PageText("0"), new PageText("1"), new PageCraftingRecipe("2", ModCraftingRecipes.recipeClip));

		cobbleRod = new BLexiconEntry(LibLexicon.TOOL_COBBLE_ROD, categoryTools);
		cobbleRod.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeCobbleRod));

		smeltRod = new BLexiconEntry(LibLexicon.TOOL_SMELT_ROD, categoryTools);
		smeltRod.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeSmeltRod));

		worldSeed = new ALexiconEntry(LibLexicon.TOOL_WORLD_SEED, categoryTools);
		worldSeed.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeWorldSeed));

		spellCloth = new BLexiconEntry(LibLexicon.TOOL_SPELL_CLOTH, categoryTools);
		spellCloth.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeSpellCloth));

		thornChakram = new BLexiconEntry(LibLexicon.TOOL_THORN_CHAKRAM, categoryTools);
		thornChakram.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeThornChakram));

		fireChakram = new ALexiconEntry(LibLexicon.TOOL_FIRE_CHAKRAM, categoryTools);
		fireChakram.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeFireChakram));

		overgrowthSeed = new BLexiconEntry(LibLexicon.TOOL_OVERGROWTH_SEED, categoryTools);
		overgrowthSeed.setPriority().setLexiconPages(new PageText("0"), new PageText("1")).setIcon(new ItemStack(ModItems.overgrowthSeed));

		livingwoodBow = new BLexiconEntry(LibLexicon.TOOL_LIVINGWOOD_BOW, categoryTools);
		livingwoodBow.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeLivingwoodBow));

		crystalBow = new ALexiconEntry(LibLexicon.TOOL_CRYSTAL_BOW, categoryTools);
		crystalBow.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeCrystalBow));

		temperanceStone = new BLexiconEntry(LibLexicon.TOOL_TEMPERANCE_STONE, categoryTools);
		temperanceStone.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeTemperanceStone));

		terraAxe = new BLexiconEntry(LibLexicon.TOOL_TERRA_AXE, categoryTools);
		terraAxe.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeTerraAxe));

		obedienceStick = new BLexiconEntry(LibLexicon.TOOL_OBEDIENCE_STICK, categoryTools);
		obedienceStick.setPriority().setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeObedienceStick));

		slimeBottle = new ALexiconEntry(LibLexicon.TOOL_SLIME_BOTTLE, categoryTools);
		slimeBottle.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeSlimeBottle));

		exchangeRod = new BLexiconEntry(LibLexicon.TOOL_EXCHANGE_ROD, categoryTools);
		exchangeRod.setLexiconPages(new PageText("0"), new PageText("1"), new PageText("2"), new PageCraftingRecipe("3", ModCraftingRecipes.recipeExchangeRod));

		manaweave = new BLexiconEntry(LibLexicon.TOOL_MANAWEAVE, categoryTools);
		manaweave.setLexiconPages(new PageText("0"), new PageText("1"), new PageCraftingRecipe("2", ModCraftingRecipes.recipeManaweaveCloth), new PageCraftingRecipe("3", ModCraftingRecipes.recipeManaweaveHelm), new PageCraftingRecipe("4", ModCraftingRecipes.recipeManaweaveChest), new PageCraftingRecipe("5", ModCraftingRecipes.recipeManaweaveLegs), new PageCraftingRecipe("6", ModCraftingRecipes.recipeManaweaveBoots));

		autocraftingHalo = new BLexiconEntry(LibLexicon.TOOL_AUTOCRAFTING_HALO, categoryTools);
		autocraftingHalo.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeAutocraftingHalo));

		sextant = new BLexiconEntry(LibLexicon.TOOL_SEXTANT, categoryTools);
		sextant.setLexiconPages(new PageText("0"), new PageText("1"), new PageCraftingRecipe("2", ModCraftingRecipes.recipeSextant));

		// ENDER ENTRIES
		enderAir = new BLexiconEntry(LibLexicon.ENDER_AIR, categoryEnder);
		enderAir.setPriority().setLexiconPages(new PageText("0"));
		OmnibusRecipeMappings.map(new ItemStack(ModItems.manaResource, 1, 15), enderAir, 0);

		enderEyeBlock = new BLexiconEntry(LibLexicon.ENDER_ENDER_EYE_BLOCK, categoryEnder);
		enderEyeBlock.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeEnderEyeBlock));

		pistonRelay = new BLexiconEntry(LibLexicon.ENDER_PISTON_RELAY, categoryEnder);
		pistonRelay.setLexiconPages(new PageText("0"), new PageText("1"), new PageManaInfusionRecipe("2", ModManaInfusionRecipes.pistonRelayRecipe));

		enderHand = new BLexiconEntry(LibLexicon.ENDER_ENDER_HAND, categoryEnder);
		enderHand.setLexiconPages(new PageText(ConfigHandler.enderPickpocketEnabled ? "0" : "0a"), new PageText("2"), new PageCraftingRecipe(ConfigHandler.enderPickpocketEnabled ? "1" : "1a", ModCraftingRecipes.recipeEnderHand));

		enderDagger = new BLexiconEntry(LibLexicon.ENDER_ENDER_DAGGER, categoryEnder);
		enderDagger.setLexiconPages(new PageText("0"), new PageText("1"), new PageCraftingRecipe("2", ModCraftingRecipes.recipeEnderDagger));

		spawnerClaw = new ALexiconEntry(LibLexicon.ENDER_SPAWNER_CLAW, categoryEnder);
		spawnerClaw.setLexiconPages(new PageText("0"), new PageText("1"), new PageCraftingRecipe("2", ModCraftingRecipes.recipeSpawnerClaw));

		redString = new ALexiconEntry(LibLexicon.ENDER_RED_STRING, categoryEnder);
		redString.setLexiconPages(new PageText("0"), new PageText("1"), new PageCraftingRecipe("2", ModCraftingRecipes.recipeRedString),
				new PageText("3"), new PageCraftingRecipe("4", ModCraftingRecipes.recipeRedStringContainer),
				new PageText("5"), new PageCraftingRecipe("6", ModCraftingRecipes.recipeRedStringDispenser),
				new PageText("7"), new PageCraftingRecipe("8", ModCraftingRecipes.recipeRedStringFertilizer),
				new PageText("9"), new PageCraftingRecipe("10", ModCraftingRecipes.recipeRedStringComparator),
				new PageText("11"), new PageCraftingRecipe("12", ModCraftingRecipes.recipeRedStringRelay),
				new PageText("13"), new PageCraftingRecipe("14", ModCraftingRecipes.recipeRedStringInterceptor));

		flightTiara = new ALexiconEntry(LibLexicon.ENDER_FLIGHT_TIARA, categoryEnder);
		flightTiara.setLexiconPages(new PageText("0"), new PageText("4"), new PageText("5"), new PageText("6"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeFlightTiara), new PageText("2"), new PageCraftingRecipe("3", ModCraftingRecipes.recipesWings));

		corporea = new ALexiconEntry(LibLexicon.ENDER_CORPOREA, categoryEnder);
		corporea.setLexiconPages(new PageText("0"), new PageText("1"), new PageText("2"), new PageText("3"), new PageText("4"), new PageText("5"), new PageText("6"), new PageCraftingRecipe("7", ModCraftingRecipes.recipeCorporeaSpark), new PageCraftingRecipe("8", ModCraftingRecipes.recipeMasterCorporeaSpark));

		corporeaIndex = new ALexiconEntry(LibLexicon.ENDER_CORPOREA_INDEX, categoryEnder);
		corporeaIndex.setLexiconPages(new PageText("0"), new PageText("1"), new PageText("2"), new PageText("3"), new PageText("4"), new PageText("5"), new PageText("6"), new PageCraftingRecipe("7", ModCraftingRecipes.recipeCorporeaIndex));

		corporeaFunnel = new ALexiconEntry(LibLexicon.ENDER_CORPOREA_FUNNEL, categoryEnder);
		corporeaFunnel.setLexiconPages(new PageText("0"), new PageText("1"), new PageCraftingRecipe("2", ModCraftingRecipes.recipeCorporeaFunnel));

		corporeaInterceptor = new ALexiconEntry(LibLexicon.ENDER_CORPOREA_INTERCEPTOR, categoryEnder);
		corporeaInterceptor.setLexiconPages(new PageText("0"), new PageText("1"), new PageCraftingRecipe("2", ModCraftingRecipes.recipeCorporeaInterceptor));

		if(ConfigHandler.enderStuff19Enabled) {
			endStoneDecor = new BLexiconEntry(LibLexicon.ENDER_END_STONE_DECOR, categoryEnder);
			endStoneDecor.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeEndStoneBricks), new PageCraftingRecipe("2", ModCraftingRecipes.recipeEndStoneChiseledBricks), new PageCraftingRecipe("3", ModCraftingRecipes.recipeEnderBricks), new PageCraftingRecipe("4", ModCraftingRecipes.recipePillarEnderBricks));
		}

		spawnerMover = new ALexiconEntry(LibLexicon.ENDER_SPAWNER_MOVER, categoryEnder);
		spawnerMover.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeSpawnerMover));

		keepIvy = new ALexiconEntry(LibLexicon.ENDER_KEEP_IVY, categoryEnder);
		keepIvy.setLexiconPages(new PageText("0"), new PageText("2"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeKeepIvy));

		blackHoleTalisman = new ALexiconEntry(LibLexicon.ENDER_BLACK_HOLE_TALISMAN, categoryEnder);
		blackHoleTalisman.setLexiconPages(new PageText("0"), new PageText("1"), new PageText("2"), new PageCraftingRecipe("3", ModCraftingRecipes.recipeBlackHoleTalisman));

		corporeaCrystalCube = new ALexiconEntry(LibLexicon.ENDER_CORPOREA_CRYSTAL_CUBE, categoryEnder);
		corporeaCrystalCube.setLexiconPages(new PageText("0"), new PageText("1"), new PageText("3"), new PageCraftingRecipe("2", ModCraftingRecipes.recipeCorporeaCrystalCube));

		luminizerTransport = new ALexiconEntry(LibLexicon.ENDER_LUMINIZER_TRANSPORT, categoryEnder);
		luminizerTransport.setLexiconPages(new PageText("0"), new PageText("1"), new PageCraftingRecipe("2", ModCraftingRecipes.recipeLuminizer), new PageText("3"), new PageCraftingRecipe("4", ModCraftingRecipes.recipeDetectorLuminizer), new PageText("5"), new PageCraftingRecipe("6", ModCraftingRecipes.recipeLuminizerLauncher));

		starSword = new ALexiconEntry(LibLexicon.ENDER_STAR_SWORD, categoryEnder);
		starSword.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeStarSword));

		thunderSword = new ALexiconEntry(LibLexicon.ENDER_THUNDER_SWORD, categoryEnder);
		thunderSword.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeThunderSword));

		corporeaRetainer = new ALexiconEntry(LibLexicon.ENDER_CORPOREA_RETAINER, categoryEnder);
		corporeaRetainer.setLexiconPages(new PageText("0"), new PageText("1"), new PageText("2"), new PageCraftingRecipe("3", ModCraftingRecipes.recipeCorporeaRetainer));

		// BAUBLES ENTRIES
		baublesIntro = new BLexiconEntry(LibLexicon.BAUBLE_INTRO, categoryBaubles);
		baublesIntro.setPriority().setLexiconPages(new PageText("0"), new PageImage("1", LibResources.ENTRY_BAUBLES), new PageText("2"));

		cosmeticBaubles = new BLexiconEntry(LibLexicon.BAUBLE_COSMETIC, categoryBaubles);
		{
			List<OmnibusPage> pages = new ArrayList();
			pages.add(new PageText("0"));
			pages.add(new PageText("1"));
			for(int i = 0; i < 32; i++)
				pages.add(new PageCraftingRecipe("" + (i + 2), ModCraftingRecipes.recipesCosmeticItems.get(i)));
			cosmeticBaubles.setPriority().setLexiconPages(pages.toArray(new OmnibusPage[pages.size()]));
		}

		tinyPlanet = new BLexiconEntry(LibLexicon.BAUBLE_TINY_PLANET, categoryBaubles);
		tinyPlanet.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeTinyPlanet), new PageCraftingRecipe("2", ModCraftingRecipes.recipeTinyPlanetBlock));

		manaRing = new BLexiconEntry(LibLexicon.BAUBLE_MANA_RING, categoryBaubles);
		manaRing.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeManaRing), new PageCraftingRecipe("2", ModCraftingRecipes.recipeGreaterManaRing));

		auraRing = new BLexiconEntry(LibLexicon.BAUBLE_AURA_RING, categoryBaubles);
		auraRing.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeAuraRing), new PageCraftingRecipe("2", ModCraftingRecipes.recipeGreaterAuraRing));

		travelBelt = new BLexiconEntry(LibLexicon.BAUBLE_TRAVEL_BELT, categoryBaubles);
		travelBelt.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeTravelBelt));

		knockbacklBelt = new BLexiconEntry(LibLexicon.BAUBLE_KNOCKBACK_BELT, categoryBaubles);
		knockbacklBelt.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeKnocbackBelt));

		icePendant = new BLexiconEntry(LibLexicon.BAUBLE_ICE_PENDANT, categoryBaubles);
		icePendant.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeIcePendant));

		lavaPendant = new BLexiconEntry(LibLexicon.BAUBLE_LAVA_PENDANT, categoryBaubles);
		lavaPendant.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeFirePendant));

		goldLaurel = new ALexiconEntry(LibLexicon.BAUBLE_GOLDEN_LAUREL, categoryBaubles);
		goldLaurel.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeGoldenLaurel));

		waterRing = new BLexiconEntry(LibLexicon.BAUBLE_WATER_RING, categoryBaubles);
		waterRing.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeWaterRing));

		miningRing = new BLexiconEntry(LibLexicon.BAUBLE_MINING_RING, categoryBaubles);
		miningRing.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeMiningRing));

		magnetRing = new BLexiconEntry(LibLexicon.BAUBLE_MAGNET_RING, categoryBaubles);
		magnetRing.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeMagnetRing), new PageCraftingRecipe("2", ModCraftingRecipes.recipeGreaterMagnetRing));

		divaCharm = new ALexiconEntry(LibLexicon.BAUBLE_DIVA_CHARM, categoryBaubles);
		divaCharm.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeDivaCharm));

		pixieRing = new ALexiconEntry(LibLexicon.BAUBLE_PIXIE_RING, categoryBaubles);
		pixieRing.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipePixieRing));

		superTravelBelt = new ALexiconEntry(LibLexicon.BAUBLE_SUPER_TRAVEL_BELT, categoryBaubles);
		superTravelBelt.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeSuperTravelBelt));

		reachRing = new ALexiconEntry(LibLexicon.BAUBLE_REACH_RING, categoryBaubles);
		reachRing.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeReachRing));

		itemFinder = new BLexiconEntry(LibLexicon.BAUBLE_ITEM_FINDER, categoryBaubles);
		itemFinder.setLexiconPages(new PageText("0"), new PageText("1"), new PageCraftingRecipe("2", ModCraftingRecipes.recipeItemFinder));

		superLavaPendant = new ALexiconEntry(LibLexicon.BAUBLE_SUPER_LAVA_PENDANT, categoryBaubles);
		superLavaPendant.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeSuperLavaPendant));

		bloodPendant = new BLexiconEntry(LibLexicon.BAUBLE_BLOOD_PENDANT, categoryBaubles);
		bloodPendant.setLexiconPages(new PageText("0"), new PageText("1"), new PageCraftingRecipe("2", ModCraftingRecipes.recipeBloodPendant));

		judgementCloaks = new ALexiconEntry(LibLexicon.BAUBLE_JUDGEMENT_CLOAKS, categoryBaubles);
		judgementCloaks.setLexiconPages(new PageText("0"), new PageText("1"), new PageCraftingRecipe("2", ModCraftingRecipes.recipeHolyCloak), new PageCraftingRecipe("3", ModCraftingRecipes.recipeUnholyCloak));

		monocle = new BLexiconEntry(LibLexicon.BAUBLE_MONOCLE, categoryBaubles);
		monocle.setPriority().setLexiconPages(new PageText("0"), new PageText("2"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeMonocle));

		swapRing = new BLexiconEntry(LibLexicon.BAUBLE_SWAP_RING, categoryBaubles);
		swapRing.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeSwapRing));

		speedUpBelt = new BLexiconEntry(LibLexicon.BAUBLE_SPEED_UP_BELT, categoryBaubles);
		speedUpBelt.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeSpeedUpBelt));

		baubleBox = new BLexiconEntry(LibLexicon.BAUBLE_BOX, categoryBaubles);
		baubleBox.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeBaubleCase)).setPriority();

		// ALFHOMANCY ENTRIES
		alfhomancyIntro = new BLexiconEntry(LibLexicon.ALF_INTRO, categoryAlfhomancy);
		alfhomancyIntro.setPriority().setLexiconPages(new PageText("0"), new PageText("1"), new PageCraftingRecipe("2", ModCraftingRecipes.recipeAlfPortal), new PageCraftingRecipe("3", ModCraftingRecipes.recipeNaturaPylon), new PageMultiblock("4", ModMultiblocks.alfPortal),
				new PageText("5"), new PageText("6"), new PageText("7")).setIcon(new ItemStack(ModItems.lexicon));

		elvenMessage = new ALexiconEntry(LibLexicon.ALF_MESSAGE, categoryAlfhomancy);
		elvenMessage.setPriority().setLexiconPages(new PageImage("0", LibResources.ENTRY_ELVEN_GARDE), new PageLoreText("1"), new PageLoreText("2"), new PageLoreText("3"), new PageLoreText("4"), new PageLoreText("5"), new PageLoreText("6")).setIcon(new ItemStack(Items.writable_book));

		elvenResources = new ALexiconEntry(LibLexicon.ALF_RESOURCES, categoryAlfhomancy);
		elvenResources.setPriority().setLexiconPages(new PageText("0"), new PageElvenRecipe("1", ModElvenTradeRecipes.dreamwoodRecipe), new PageText("2"), new PageCraftingRecipe("10", ModCraftingRecipes.recipeDreamwoodTwig), new PageElvenRecipe("3", ModElvenTradeRecipes.elementiumRecipes), new PageElvenRecipe("4", ModElvenTradeRecipes.pixieDustRecipe), new PageElvenRecipe("5", ModElvenTradeRecipes.dragonstoneRecipes), new PageText("6"), new PageElvenRecipe("7", ModElvenTradeRecipes.elvenQuartzRecipe), new PageText("8"), new PageElvenRecipe("9", ModElvenTradeRecipes.alfglassRecipe)).setIcon(new ItemStack(ModItems.manaResource, 1, 9));

		gaiaRitual = new ALexiconEntry(LibLexicon.ALF_GAIA_RITUAL, categoryAlfhomancy);
		gaiaRitual.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeGaiaPylon), new PageMultiblock("2", ModMultiblocks.gaiaRitual), new PageText("3"), new PageText("4"), new PageText("5")).setIcon(new ItemStack(ModItems.manaResource, 1, 5));
		OmnibusRecipeMappings.map(new ItemStack(ModItems.manaResource, 1, 5), gaiaRitual, 0);

		gaiaRitualHardmode = new ALexiconEntry(LibLexicon.ALF_GAIA_RITUAL_HARDMODE, categoryAlfhomancy);
		gaiaRitualHardmode.setLexiconPages(new PageText("0"), new PageText("1"), new PageCraftingRecipe("2", ModCraftingRecipes.recipeGaiaIngot)).setIcon(new ItemStack(ModItems.manaResource, 1, 14));

		elvenLore = new ALexiconEntry(LibLexicon.ALF_LORE, categoryAlfhomancy);
		elvenLore.setLexiconPages(new PageText("0"), new PageLoreText("1"), new PageLoreText("2"), new PageLoreText("3"), new PageLoreText("4"), new PageLoreText("5"), new PageLoreText("6"), new PageLoreText("7")).setIcon(new ItemStack(Items.writable_book));

		if(ConfigHandler.relicsEnabled) {
			relics = new ALexiconEntry(LibLexicon.ALF_RELICS, categoryAlfhomancy);
			relics.setLexiconPages(new PageText("0")).setIcon(new ItemStack(ModItems.dice));

			relicInfo = new RLexiconEntry(LibLexicon.ALF_RELIC_INFO, categoryAlfhomancy, null);
			relicInfo.setLexiconPages(new PageText("0"), new PageText("1")).setIcon(new ItemStack(ModItems.dice));

			infiniteFruit = new RLexiconEntry(LibLexicon.ALF_INFINITE_FRUIT, categoryAlfhomancy, ModAchievements.relicInfiniteFruit);
			infiniteFruit.setLexiconPages(new PageText("0"));

			kingKey = new RLexiconEntry(LibLexicon.ALF_KING_KEY, categoryAlfhomancy, ModAchievements.relicKingKey);
			kingKey.setLexiconPages(new PageText("0"));

			flugelEye = new RLexiconEntry(LibLexicon.ALF_FLUGEL_EYE, categoryAlfhomancy, ModAchievements.relicFlugelEye);
			flugelEye.setLexiconPages(new PageText("0"), new PageText("1"));

			thorRing = new RLexiconEntry(LibLexicon.ALF_THOR_RING, categoryAlfhomancy, ModAchievements.relicThorRing);
			thorRing.setLexiconPages(new PageText("0"));

			lokiRing = new RLexiconEntry(LibLexicon.ALF_LOKI_RING, categoryAlfhomancy, ModAchievements.relicLokiRing);
			lokiRing.setLexiconPages(new PageText("0"), new PageText("1"), new PageText("2"), new PageText("3"));

			odinRing = new RLexiconEntry(LibLexicon.ALF_ODIN_RING, categoryAlfhomancy, ModAchievements.relicOdinRing);
			odinRing.setLexiconPages(new PageText("0"));
		}

		// MISCLENAEOUS ENTRIES
		unstableBlocks = new BLexiconEntry(LibLexicon.MISC_UNSTABLE_BLOCKS, categoryMisc);
		unstableBlocks.setLexiconPages(new PageText("0"), new PageImage("1", LibResources.ENTRY_UNSTABLE_BLOCK), new PageCraftingRecipe("2", ModCraftingRecipes.recipesUnstableBlocks), new PageText("3"), new PageImage("4", LibResources.ENTRY_UNSTABLE_BEACON), new PageCraftingRecipe("5", ModCraftingRecipes.recipesManaBeacons), new PageText("6"), new PageCraftingRecipe("7", ModCraftingRecipes.recipesSignalFlares));

		decorativeBlocks = new BLexiconEntry(LibLexicon.MISC_DECORATIVE_BLOCKS, categoryMisc);
		if(ConfigHandler.darkQuartzEnabled)
			decorativeBlocks.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeLivingrockDecor1), new PageCraftingRecipe("2", ModCraftingRecipes.recipeLivingrockDecor2), new PageCraftingRecipe("3", ModCraftingRecipes.recipeLivingrockDecor3), new PageCraftingRecipe("4", ModCraftingRecipes.recipeLivingrockDecor4),
					new PageCraftingRecipe("5", ModCraftingRecipes.recipeLivingwoodDecor1), new PageCraftingRecipe("6", ModCraftingRecipes.recipeLivingwoodDecor2), new PageCraftingRecipe("7", ModCraftingRecipes.recipeLivingwoodDecor3), new PageCraftingRecipe("8", ModCraftingRecipes.recipeLivingwoodDecor4), new PageCraftingRecipe("9", ModCraftingRecipes.recipeLivingwoodDecor5),
					new PageText("10"), new PageCraftingRecipe("11", ModCraftingRecipes.recipeDarkQuartz), new PageManaInfusionRecipe("12", ModManaInfusionRecipes.manaQuartzRecipe), new PageCraftingRecipe("13", ModCraftingRecipes.recipeBlazeQuartz), new PageCraftingRecipe("14", ModCraftingRecipes.recipesLavenderQuartz), new PageCraftingRecipe("15", ModCraftingRecipes.recipeRedQuartz), new PageCraftingRecipe("23", ModCraftingRecipes.recipeSunnyQuartz),
					new PageText("16"), new PageCraftingRecipe("17", ModCraftingRecipes.recipeReedBlock), new PageCraftingRecipe("18", ModCraftingRecipes.recipeThatch), new PageCraftingRecipe("19", ModCraftingRecipes.recipeRoofTile), new PageCraftingRecipe("20", ModCraftingRecipes.recipeNetherBrick), new PageCraftingRecipe("21", ModCraftingRecipes.recipeSoulBrick), new PageCraftingRecipe("22", ModCraftingRecipes.recipeSnowBrick));
		else decorativeBlocks.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeLivingrockDecor1), new PageCraftingRecipe("2", ModCraftingRecipes.recipeLivingrockDecor2), new PageCraftingRecipe("3", ModCraftingRecipes.recipeLivingrockDecor3), new PageCraftingRecipe("4", ModCraftingRecipes.recipeLivingrockDecor4),
				new PageCraftingRecipe("5", ModCraftingRecipes.recipeLivingwoodDecor1), new PageCraftingRecipe("6", ModCraftingRecipes.recipeLivingwoodDecor2), new PageCraftingRecipe("7", ModCraftingRecipes.recipeLivingwoodDecor3), new PageCraftingRecipe("8", ModCraftingRecipes.recipeLivingwoodDecor4), new PageCraftingRecipe("9", ModCraftingRecipes.recipeLivingwoodDecor5),
				new PageText("10"), new PageManaInfusionRecipe("12", ModManaInfusionRecipes.manaQuartzRecipe), new PageCraftingRecipe("13", ModCraftingRecipes.recipeBlazeQuartz), new PageCraftingRecipe("14", ModCraftingRecipes.recipesLavenderQuartz), new PageCraftingRecipe("15", ModCraftingRecipes.recipeRedQuartz), new PageCraftingRecipe("23", ModCraftingRecipes.recipeSunnyQuartz),
				new PageText("16"), new PageCraftingRecipe("17", ModCraftingRecipes.recipeReedBlock), new PageCraftingRecipe("18", ModCraftingRecipes.recipeThatch), new PageCraftingRecipe("19", ModCraftingRecipes.recipeRoofTile), new PageCraftingRecipe("20", ModCraftingRecipes.recipeNetherBrick), new PageCraftingRecipe("21", ModCraftingRecipes.recipeSoulBrick), new PageCraftingRecipe("22", ModCraftingRecipes.recipeSnowBrick));

		dispenserTweaks = new BLexiconEntry(LibLexicon.MISC_DISPENSER_TWEAKS, categoryMisc);
		dispenserTweaks.setLexiconPages(new PageText("0")).setPriority().setIcon(new ItemStack(Blocks.dispenser));

		shinyFlowers = new BLexiconEntry(LibLexicon.MISC_SHINY_FLOWERS, categoryMisc);
		shinyFlowers.setLexiconPages(new PageText("0"), new PageText("3"), new PageCraftingRecipe("1", ModCraftingRecipes.recipesShinyFlowers), new PageCraftingRecipe("2", ModCraftingRecipes.recipesMiniIsland));

		prismarine = new BLexiconEntry(LibLexicon.MISC_PRISMARINE, categoryMisc);
		prismarine.setLexiconPages(new PageText("0"), new PageText("1"), new PageManaInfusionRecipe("2", ModManaAlchemyRecipes.prismarineRecipe), new PageCraftingRecipe("3", ModCraftingRecipes.recipePrismarine), new PageCraftingRecipe("4", ModCraftingRecipes.recipePrismarineBrick), new PageCraftingRecipe("5", ModCraftingRecipes.recipeDarkPrismarine), new PageCraftingRecipe("6", ModCraftingRecipes.recipeSeaLamp));

		tinyPotato = new BLexiconEntry(LibLexicon.MISC_TINY_POTATO, categoryMisc);
		tinyPotato.setLexiconPages(new PageText("0"), new PageManaInfusionRecipe("1", ModManaInfusionRecipes.tinyPotatoRecipe));

		headCreating = new HLexiconEntry(LibLexicon.MISC_HEAD_CREATING, categoryMisc);
		headCreating.setLexiconPages(new PageText("0"), new PageText("2"), new PageRuneRecipe("1", ModRuneRecipes.recipeHead));

		azulejo = new BLexiconEntry(LibLexicon.MISC_AZULEJO, categoryMisc);
		azulejo.setLexiconPages(new PageText("0"), new PageImage("1", LibResources.ENTRY_AZULEJOS), new PageCraftingRecipe("2", ModCraftingRecipes.recipeAzulejo), new PageCraftingRecipe("3", ModCraftingRecipes.recipesAzulejoCycling));

		starfield = new ALexiconEntry(LibLexicon.MISC_STARFIELD, categoryMisc);
		starfield.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeStarfield));

		dirtPath = new BLexiconEntry(LibLexicon.MISC_DIRT_PATH, categoryMisc);
		dirtPath.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeDirtPath), new PageCraftingRecipe("2", ModCraftingRecipes.recipeDirtPathSlab));

		mushrooms = new BLexiconEntry(LibLexicon.MISC_MUSHROOMS, categoryMisc);
		mushrooms.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipesMushrooms));

		phantomInk = new BLexiconEntry(LibLexicon.MISC_PHANTOM_INK, categoryMisc);
		phantomInk.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipePhantomInk));

		if(ConfigHandler.stones18Enabled) {
			stoneAlchemy = new BLexiconEntry(LibLexicon.MISC_STONE_ALCHEMY, categoryMisc);
			stoneAlchemy.setLexiconPages(new PageText("0"), new PageManaInfusionRecipe("1", ModManaAlchemyRecipes.stoneRecipes), new PageCraftingRecipe("2", ModCraftingRecipes.recipe18StonePolish), new PageCraftingRecipe("3", ModCraftingRecipes.recipe18StoneBrick), new PageCraftingRecipe("4", ModCraftingRecipes.recipe18StoneChisel));
		}

		blazeBlock = new BLexiconEntry(LibLexicon.MISC_BLAZE_BLOCK, categoryMisc);
		blazeBlock.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeBlazeBlock));
		OmnibusRecipeMappings.map(new ItemStack(Blocks.obsidian), blazeBlock, 0);

		challenges = new BLexiconEntry(LibLexicon.MISC_CHALLENGES, categoryMisc);
		challenges.setLexiconPages(new PageText("0"), new PageText("1"), new PageText("2")).setPriority().setIcon(new ItemStack(ModItems.cosmetic, 1, 31));

		cacophonium = new BLexiconEntry(LibLexicon.MISC_CACOPHONIUM, categoryMisc);
		cacophonium.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipeCacophonium), new PageText("2"));

		pavement = new BLexiconEntry(LibLexicon.MISC_PAVEMENT, categoryMisc);
		pavement.setLexiconPages(new PageText("0"), new PageCraftingRecipe("1", ModCraftingRecipes.recipesPavement));

		if(Botania.bcTriggersLoaded) {
			bcIntegration = new CLexiconEntry(LibLexicon.MISC_BC_INTEGRATION, categoryMisc, "BuildCraft");
			bcIntegration.setLexiconPages(new PageText("0")).setIcon(new ItemStack(Items.redstone));
		}
	}

	public static void postInit() {
		if(SheddingHandler.hasShedding()) {
			shedding = new BLexiconEntry(LibLexicon.MISC_SHEDDING, EbonArtsAPI.categoryMisc);
			shedding.setLexiconPages(new PageText("0")).setPriority().setIcon(new ItemStack(Items.feather));
			SheddingHandler.addToLexicon();
		}

		if(Botania.thaumcraftLoaded) {
			tcIntegration = new CLexiconEntry(LibLexicon.MISC_TC_INTEGRATION, EbonArtsAPI.categoryMisc, "Thaumcraft");
			tcIntegration.setLexiconPages(new PageText("0"), new PageText("1"), new PageCraftingRecipe("2", ModCraftingRecipes.recipeHelmetOfRevealing), new PageText("3"), new PageManaInfusionRecipe("4", ModManaInfusionRecipes.manaInkwellRecipe), new PageText("5"), new PageBrew(ModBrewRecipes.warpWardBrew, "6a", "6b")).setIcon(new ItemStack(ModItems.manaInkwell));
		}

		if(Botania.etFuturumLoaded) {
			banners = new CLexiconEntry(LibLexicon.MISC_BANNERS, EbonArtsAPI.categoryMisc, "EtFuturum");
			banners.setLexiconPages(new PageText("0"), new PageImage("1", LibResources.ENTRY_BANNERS)).setIcon(new ItemStack(ModItems.lexicon));
		}
	}
}

