package com.ebonheart.EbonArtsMod.common.world;

import com.ebonheart.EbonArtsMod.init.InitItemsEA;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class WorldChestHooks extends InitItemsEA {

	
	public static void register()
	{
		//Common
		ChestHookEACommon(draconium_dust);
		ChestHookEACommon(velious);
		ChestHookEACommon(arcanite);
		ChestHookEACommon(dragon_fruit);
		
		//Uncommon
		ChestHookEAUncommon(obsidian_shards);
		ChestHookEAUncommon(glowstone_shards);
		
		//Rare
		ChestHookEARareA(katcheen);
		ChestHookEARareA(necrocite);
		ChestHookEARareA(soularite);
		ChestHookEARareA(ebonheart);
		
		ChestHookEARareB(arcanite_pickaxe);
		ChestHookEARareB(arcanite_axe);
		ChestHookEARareB(arcanite_shovel);
		ChestHookEARareB(arcanite_hoe);
		ChestHookEARareB(arcanite_sword);
		
		ChestHookEARareB(arcanite_helmet);
		ChestHookEARareB(arcanite_chestplate);
		ChestHookEARareB(arcanite_leggings);
		ChestHookEARareB(arcanite_boots);
		
		//Epic
		ChestHookEAEpic(katcheen_pickaxe);
		ChestHookEAEpic(katcheen_axe);
		ChestHookEAEpic(katcheen_shovel);
		ChestHookEAEpic(katcheen_hoe);
		ChestHookEAEpic(katcheen_sword);
		
		ChestHookEAEpic(katcheen_helmet);
		ChestHookEAEpic(katcheen_chestplate);
		ChestHookEAEpic(katcheen_leggings);
		ChestHookEAEpic(katcheen_boots);
		
		ChestHookEAEpic(shimmering_disc);
		ChestHookEAEpic(frostbite);
		ChestHookEAEpic(massacre);
		ChestHookEAEpic(blazefury);
		ChestHookEAEpic(despair);
		ChestHookEAEpic(souleater);
		
	}
	
	public static void ChestHookEACommon(Item item)
	{
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 4, 55));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 4, 55));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 4, 55));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 4, 55));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_DISPENSER).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 4, 55));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 4, 55));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 4, 55));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 4, 55));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 4, 55));
		
		
	}
	
	public static void ChestHookEAUncommon(Item item)
	{
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 1, 35));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 1, 35));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 1, 35));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 1, 35));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_DISPENSER).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 1, 35));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 1, 35));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 1, 35));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 1, 35));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 1, 35));
		
		
	}
	
	public static void ChestHookEARareA(Item item)
	{
		
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 3, 15));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 3, 15));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 3, 15));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 3, 15));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_DISPENSER).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 3, 15));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 3, 15));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 3, 15));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 3, 15));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 3, 15));
		
		
	}
	
	public static void ChestHookEARareB(Item item)
	{
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 1, 15));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 1, 15));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 1, 15));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 1, 15));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_DISPENSER).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 1, 15));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 1, 15));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 1, 15));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 1, 15));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 1, 15));
	}
	
	public static void ChestHookEAEpic(Item item)
	{
		ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 1, 5));
		ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 1, 5));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 1, 5));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 1, 5));
		ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_DISPENSER).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 1, 5));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 1, 5));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 1, 5));
		ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_LIBRARY).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 1, 5));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(new ItemStack(item), 1, 1, 5));
	}
}
