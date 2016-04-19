package com.ebonheart.EbonArtsMod.common;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
//import net.minecraftforge.event.entity.player.PlayerEvent;
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
			event.player.addStat(InitAchievementsEA.mine_draconium_ore);//.triggerAchievement(InitAchievementsEA.mine_draconium_ore);
		}
		
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(InitItemsEA.velious)))
		{
			event.player.addStat(InitAchievementsEA.mine_velious_ore);//.triggerAchievement(InitAchievementsEA.mine_velious_ore);
		}
		
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(InitItemsEA.arcanite)))
		{
			event.player.addStat(InitAchievementsEA.mine_arcanite_ore);//.triggerAchievement(InitAchievementsEA.mine_arcanite_ore);
		}
		
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(InitItemsEA.katcheen)))
		{
			event.player.addStat(InitAchievementsEA.mine_katcheen_ore);//.triggerAchievement(InitAchievementsEA.mine_katcheen_ore);
		}
		
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(InitItemsEA.necrocite)))
		{
			event.player.addStat(InitAchievementsEA.mine_necrocite_ore);//.triggerAchievement(InitAchievementsEA.mine_necrocite_ore);
		}
		
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(InitItemsEA.soularite)))
		{
			event.player.addStat(InitAchievementsEA.mine_soularite_ore);//.triggerAchievement(InitAchievementsEA.mine_soularite_ore);
		}
		
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(InitItemsEA.ebonheart)))
		{
			event.player.addStat(InitAchievementsEA.ebonheart);//.triggerAchievement(InitAchievementsEA.ebonheart);
		}
	}
	
	//Craft an item achievement
	@SubscribeEvent
	public void onCraft(PlayerEvent.ItemCraftedEvent event) 
	{
		if(event.crafting.getItem() == InitItemsEA.obsidian_shards) 
		{
			event.player.addStat(InitAchievementsEA.nether_bound);//.triggerAchievement(InitAchievementsEA.nether_bound);
		}
		
		if(event.crafting.getItem() == InitItemsEA.glowstone_shards) 
		{
			event.player.addStat(InitAchievementsEA.nether_doomed);//.triggerAchievement(InitAchievementsEA.nether_bound);
		}
		
		if(event.crafting.getItem() == InitItemsEA.glowing_disc) 
		{
			event.player.addStat(InitAchievementsEA.glowing_disc);//.triggerAchievement(InitAchievementsEA.glowing_disc);
		}
		
		if(event.crafting.getItem() == InitItemsEA.shimmering_disc) 
		{
			event.player.addStat(InitAchievementsEA.shimmering_disc);//.triggerAchievement(InitAchievementsEA.shimmering_disc);
		}
		
		if(event.crafting.getItem() == InitItemsEA.laminate_disc) 
		{
			event.player.addStat(InitAchievementsEA.laminate_disc);//.triggerAchievement(InitAchievementsEA.laminate_disc);
		}
		
		if(event.crafting.getItem() == InitItemsEA.resilient_disc) 
		{
			event.player.addStat(InitAchievementsEA.resilient_disc);//.triggerAchievement(InitAchievementsEA.resilient_disc);
		}
		
		if(event.crafting.getItem() == InitItemsEA.dismal_disc) 
		{
			event.player.addStat(InitAchievementsEA.dismal_disc);//.triggerAchievement(InitAchievementsEA.dismal_disc);
		}
		
		if(event.crafting.getItem() == InitItemsEA.ethereal_disc) 
		{
			event.player.addStat(InitAchievementsEA.ethereal_disc);//.triggerAchievement(InitAchievementsEA.ethereal_disc);
		}
		
		if(event.crafting.getItem() == InitItemsEA.empowered_blade) 
		{
			event.player.addStat(InitAchievementsEA.empowered_blade);//.triggerAchievement(InitAchievementsEA.empowered_blade);
		}
		
		if(event.crafting.getItem() == InitItemsEA.deception) 
		{
			event.player.addStat(InitAchievementsEA.deception);//.triggerAchievement(InitAchievementsEA.deception);
		}
		
		if(event.crafting.getItem() == InitItemsEA.frostbite) 
		{
			event.player.addStat(InitAchievementsEA.frostbite);//.triggerAchievement(InitAchievementsEA.frostbite);
		}
		
		if(event.crafting.getItem() == InitItemsEA.massacre) 
		{
			event.player.addStat(InitAchievementsEA.massacre);//.triggerAchievement(InitAchievementsEA.massacre);
		}
		
		if(event.crafting.getItem() == InitItemsEA.blazefury) 
		{
			event.player.addStat(InitAchievementsEA.blazefury);//.triggerAchievement(InitAchievementsEA.blazefury);
		}
		
		if(event.crafting.getItem() == InitItemsEA.despair) 
		{
			event.player.addStat(InitAchievementsEA.despair);//.triggerAchievement(InitAchievementsEA.despair);
		}
		
		if(event.crafting.getItem() == InitItemsEA.souleater) 
		{
			event.player.addStat(InitAchievementsEA.souleater);//.triggerAchievement(InitAchievementsEA.souleater);
		}
		
		if(event.crafting.getItem() == InitItemsEA.enchanted_ebonheart) 
		{
			event.player.addStat(InitAchievementsEA.enchanted_ebonheart);//.triggerAchievement(InitAchievementsEA.enchanted_ebonheart);
		}
		
		if(event.crafting.getItem() == InitItemsEA.burnished_helmet
		|| event.crafting.getItem() == InitItemsEA.burnished_chestplate
		|| event.crafting.getItem() == InitItemsEA.burnished_leggings
		|| event.crafting.getItem() == InitItemsEA.burnished_boots) 
		{
			event.player.addStat(InitAchievementsEA.burnished_armor);
		}
		
		if(event.crafting.getItem() == InitItemsEA.scalemail_helmet
		|| event.crafting.getItem() == InitItemsEA.scalemail_chestplate
		|| event.crafting.getItem() == InitItemsEA.scalemail_leggings
		|| event.crafting.getItem() == InitItemsEA.scalemail_boots) 
		{
			event.player.addStat(InitAchievementsEA.scalemail_armor);
		}
		
		if(event.crafting.getItem() == InitItemsEA.vengeance_helmet
		|| event.crafting.getItem() == InitItemsEA.vengeance_chestplate
		|| event.crafting.getItem() == InitItemsEA.vengeance_leggings
		|| event.crafting.getItem() == InitItemsEA.vengeance_boots) 
		{
			event.player.addStat(InitAchievementsEA.vengeance_armor);
		}
		
		if(event.crafting.getItem() == InitItemsEA.celestial_helmet
		|| event.crafting.getItem() == InitItemsEA.celestial_chestplate
		|| event.crafting.getItem() == InitItemsEA.celestial_leggings
		|| event.crafting.getItem() == InitItemsEA.celestial_boots) 
		{
			event.player.addStat(InitAchievementsEA.celestial_armor);
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
