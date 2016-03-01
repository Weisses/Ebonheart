package com.ebonheart.EbonArtsMod.common;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

import com.ebonheart.EbonArtsMod.init.InitAchievementsEA;
import com.ebonheart.EbonArtsMod.init.InitBlocksEA;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;

public class AchievementsEA {

	//Pickup an item achievement
	@SubscribeEvent
	public void onPickup(PlayerEvent.ItemPickupEvent event) 
	{
		//if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(InitItemsEA.ebon_tome)))
		//{
		//	event.player.triggerAchievement(InitAchievementsEA.alchemical_compendium);
		//}
		
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(InitItemsEA.draconium_dust)))
		{
			event.player.triggerAchievement(InitAchievementsEA.mine_draconium_ore);
		}
		
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(InitItemsEA.velious)))
		{
			event.player.triggerAchievement(InitAchievementsEA.mine_velious_ore);
		}
		
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(InitItemsEA.arcanite)))
		{
			event.player.triggerAchievement(InitAchievementsEA.mine_arcanite_ore);
		}
		
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(InitItemsEA.katcheen)))
		{
			event.player.triggerAchievement(InitAchievementsEA.mine_katcheen_ore);
		}
		
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(InitItemsEA.necrocite)))
		{
			event.player.triggerAchievement(InitAchievementsEA.mine_necrocite_ore);
		}
		
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(InitItemsEA.soularite)))
		{
			event.player.triggerAchievement(InitAchievementsEA.mine_soularite_ore);
		}
		
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(InitItemsEA.ebonheart)))
		{
			event.player.triggerAchievement(InitAchievementsEA.ebonheart);
		}
	}
	
	//Craft an item achievement
	@SubscribeEvent
	public void onCraft(PlayerEvent.ItemCraftedEvent event) 
	{
		if(event.crafting.getItem() == InitItemsEA.obsidian_shards) 
		{
			event.player.triggerAchievement(InitAchievementsEA.nether_bound);
		}
		if(event.crafting.getItem() == InitItemsEA.glowstone_shards) 
		{
			event.player.triggerAchievement(InitAchievementsEA.nether_bound);
		}
		
		if(event.crafting.getItem() == InitItemsEA.glowing_disc) 
		{
			event.player.triggerAchievement(InitAchievementsEA.glowing_disc);
		}
		
		if(event.crafting.getItem() == InitItemsEA.shimmering_disc) 
		{
			event.player.triggerAchievement(InitAchievementsEA.shimmering_disc);
		}
		
		if(event.crafting.getItem() == InitItemsEA.laminate_disc) 
		{
			event.player.triggerAchievement(InitAchievementsEA.laminate_disc);
		}
		
		if(event.crafting.getItem() == InitItemsEA.resilient_disc) 
		{
			event.player.triggerAchievement(InitAchievementsEA.resilient_disc);
		}
		
		if(event.crafting.getItem() == InitItemsEA.dismal_disc) 
		{
			event.player.triggerAchievement(InitAchievementsEA.dismal_disc);
		}
		
		if(event.crafting.getItem() == InitItemsEA.ethereal_disc) 
		{
			event.player.triggerAchievement(InitAchievementsEA.ethereal_disc);
		}
		
		if(event.crafting.getItem() == InitItemsEA.empowered_blade) 
		{
			event.player.triggerAchievement(InitAchievementsEA.empowered_blade);
		}
		
		if(event.crafting.getItem() == InitItemsEA.deception) 
		{
			event.player.triggerAchievement(InitAchievementsEA.deception);
		}
		
		if(event.crafting.getItem() == InitItemsEA.frostbite) 
		{
			event.player.triggerAchievement(InitAchievementsEA.frostbite);
		}
		
		if(event.crafting.getItem() == InitItemsEA.massacre) 
		{
			event.player.triggerAchievement(InitAchievementsEA.massacre);
		}
		
		if(event.crafting.getItem() == InitItemsEA.blazefury) 
		{
			event.player.triggerAchievement(InitAchievementsEA.blazefury);
		}
		
		if(event.crafting.getItem() == InitItemsEA.despair) 
		{
			event.player.triggerAchievement(InitAchievementsEA.despair);
		}
		
		if(event.crafting.getItem() == InitItemsEA.souleater) 
		{
			event.player.triggerAchievement(InitAchievementsEA.souleater);
		}
	}
	
	
	
	//Smelt an item achievement
	//@SubscribeEvent
	//public void onSmelt(PlayerEvent.ItemSmeltedEvent event) {
	//	if(event.smelting.getItem() == EbonArtsItems.purified_mystic_dust) {

	//		event.player.triggerAchievement(EbonArtsAchievements.smeltMysticDust);
		
	//	}
	//}
}
