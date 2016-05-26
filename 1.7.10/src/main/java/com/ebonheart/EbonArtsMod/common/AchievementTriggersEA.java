package com.ebonheart.EbonArtsMod.common;

import net.minecraft.item.ItemStack;

import com.ebonheart.EbonArtsMod.init.InitAchievementsEA;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class AchievementTriggersEA extends InitAchievementsEA {

	//Pickup an item achievement
	@SubscribeEvent
	public void onPickup(PlayerEvent.ItemPickupEvent event) 
	{
		
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(InitItemsEA.draconium_dust)))
		{
			event.player.triggerAchievement(mine_draconium_ore);//.triggerAchievement(InitAchievementsEA.mine_draconium_ore);
		}
		
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(InitItemsEA.velious)))
		{
			event.player.triggerAchievement(mine_velious_ore);//.triggerAchievement(InitAchievementsEA.mine_velious_ore);
		}
		
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(InitItemsEA.arcanite)))
		{
			event.player.triggerAchievement(mine_arcanite_ore);//.triggerAchievement(InitAchievementsEA.mine_arcanite_ore);
		}
		
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(InitItemsEA.katcheen)))
		{
			event.player.triggerAchievement(mine_katcheen_ore);//.triggerAchievement(InitAchievementsEA.mine_katcheen_ore);
		}
		
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(InitItemsEA.necrocite)))
		{
			event.player.triggerAchievement(mine_necrocite_ore);//.triggerAchievement(InitAchievementsEA.mine_necrocite_ore);
		}
		
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(InitItemsEA.soularite)))
		{
			event.player.triggerAchievement(mine_soularite_ore);//.triggerAchievement(InitAchievementsEA.mine_soularite_ore);
		}
		
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(InitItemsEA.ebonheart)))
		{
			event.player.triggerAchievement(ebonheart);//.triggerAchievement(InitAchievementsEA.ebonheart);
		}
	}
	
	//Craft an item achievement
	@SubscribeEvent
	public void onCraft(PlayerEvent.ItemCraftedEvent event) 
	{
		if(event.crafting.getItem() == InitItemsEA.obsidian_shards) 
		{
			event.player.triggerAchievement(nether_bound);//.triggerAchievement(InitAchievementsEA.nether_bound);
		}
		
		if(event.crafting.getItem() == InitItemsEA.glowstone_shards) 
		{
			event.player.triggerAchievement(nether_doomed);//.triggerAchievement(InitAchievementsEA.nether_bound);
		}
		
		if(event.crafting.getItem() == InitItemsEA.glowing_disc) 
		{
			event.player.triggerAchievement(glowing_disc);//.triggerAchievement(InitAchievementsEA.glowing_disc);
		}
		
		if(event.crafting.getItem() == InitItemsEA.shimmering_disc) 
		{
			event.player.triggerAchievement(shimmering_disc);//.triggerAchievement(InitAchievementsEA.shimmering_disc);
		}
		
		if(event.crafting.getItem() == InitItemsEA.laminate_disc) 
		{
			event.player.triggerAchievement(laminate_disc);//.triggerAchievement(InitAchievementsEA.laminate_disc);
		}
		
		if(event.crafting.getItem() == InitItemsEA.resilient_disc) 
		{
			event.player.triggerAchievement(resilient_disc);//.triggerAchievement(InitAchievementsEA.resilient_disc);
		}
		
		if(event.crafting.getItem() == InitItemsEA.dismal_disc) 
		{
			event.player.triggerAchievement(dismal_disc);//.triggerAchievement(InitAchievementsEA.dismal_disc);
		}
		
		if(event.crafting.getItem() == InitItemsEA.ethereal_disc) 
		{
			event.player.triggerAchievement(ethereal_disc);//.triggerAchievement(InitAchievementsEA.ethereal_disc);
		}
		
		if(event.crafting.getItem() == InitItemsEA.empowered_blade) 
		{
			event.player.triggerAchievement(empowered_blade);//.triggerAchievement(InitAchievementsEA.empowered_blade);
		}
		
		if(event.crafting.getItem() == InitItemsEA.deception) 
		{
			event.player.triggerAchievement(deception);//.triggerAchievement(InitAchievementsEA.deception);
		}
		
		if(event.crafting.getItem() == InitItemsEA.frostbite) 
		{
			event.player.triggerAchievement(frostbite);//.triggerAchievement(InitAchievementsEA.frostbite);
		}
		
		if(event.crafting.getItem() == InitItemsEA.massacre) 
		{
			event.player.triggerAchievement(massacre);//.triggerAchievement(InitAchievementsEA.massacre);
		}
		
		if(event.crafting.getItem() == InitItemsEA.blazefury) 
		{
			event.player.triggerAchievement(blazefury);//.triggerAchievement(InitAchievementsEA.blazefury);
		}
		
		if(event.crafting.getItem() == InitItemsEA.despair) 
		{
			event.player.triggerAchievement(despair);//.triggerAchievement(InitAchievementsEA.despair);
		}
		
		if(event.crafting.getItem() == InitItemsEA.souleater) 
		{
			event.player.triggerAchievement(souleater);//.triggerAchievement(InitAchievementsEA.souleater);
		}
		
		if(event.crafting.getItem() == InitItemsEA.enchanted_ebonheart) 
		{
			event.player.triggerAchievement(enchanted_ebonheart);//.triggerAchievement(InitAchievementsEA.enchanted_ebonheart);
		}
		
		if(event.crafting.getItem() == InitItemsEA.burnished_helmet
		|| event.crafting.getItem() == InitItemsEA.burnished_chestplate
		|| event.crafting.getItem() == InitItemsEA.burnished_leggings
		|| event.crafting.getItem() == InitItemsEA.burnished_boots) 
		{
			event.player.triggerAchievement(burnished_armor);
		}
		
		if(event.crafting.getItem() == InitItemsEA.scalemail_helmet
		|| event.crafting.getItem() == InitItemsEA.scalemail_chestplate
		|| event.crafting.getItem() == InitItemsEA.scalemail_leggings
		|| event.crafting.getItem() == InitItemsEA.scalemail_boots) 
		{
			event.player.triggerAchievement(scalemail_armor);
		}
		
		if(event.crafting.getItem() == InitItemsEA.vengeance_helmet
		|| event.crafting.getItem() == InitItemsEA.vengeance_chestplate
		|| event.crafting.getItem() == InitItemsEA.vengeance_leggings
		|| event.crafting.getItem() == InitItemsEA.vengeance_boots) 
		{
			event.player.triggerAchievement(vengeance_armor);
		}
		
		if(event.crafting.getItem() == InitItemsEA.celestial_helmet
		|| event.crafting.getItem() == InitItemsEA.celestial_chestplate
		|| event.crafting.getItem() == InitItemsEA.celestial_leggings
		|| event.crafting.getItem() == InitItemsEA.celestial_boots) 
		{
			event.player.triggerAchievement(celestial_armor);
		}
		
		if(event.crafting.getItem() == InitItemsEA.necrosis) 
		{
			event.player.triggerAchievement(necrosis);
		}
		
		if(event.crafting.getItem() == InitItemsEA.consecration) 
		{
			event.player.triggerAchievement(consecration);
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
