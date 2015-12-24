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

	//@SubscribeEvent
	//public void onPickup(PlayerEvent.ItemPickupEvent event) 
	//{
	//	if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(Block.getBlockFromItem(InitItemsEA.arcanite)))) 
	//	{
	//		event.player.triggerAchievement(InitAchievementsEA.mine_arcanite_ore);
	//	}
	//}
	
	//Pickup an item achievement
	@SubscribeEvent
	public void onPickup(PlayerEvent.ItemPickupEvent event) 
	{
		
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(InitItemsEA.ebon_tome)))
		{
			event.player.triggerAchievement(InitAchievementsEA.alchemical_compendium);
		}
		
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(InitItemsEA.draconium_dust)))
		{
			event.player.triggerAchievement(InitAchievementsEA.mine_draconium_ore);
		}
		
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(InitItemsEA.velious)))
		{
			event.player.triggerAchievement(InitAchievementsEA.mine_velious_ore);
		}
		
		
		
		//if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(InitItemsEA.shimmering_disc)))
		//{
		//	event.player.triggerAchievement(InitAchievementsEA.shimmering_disc);
		//}
		
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
			event.player.triggerAchievement(InitAchievementsEA.mine_ebon_ore);
		}
		
		
		
		//if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(Item.getItemFromBlock(InitBlocksEA.ebon_ore))))
		//{
		//	event.player.triggerAchievement(InitAchievementsEA.mine_ebon_ore);
		//}
		
		
		
		
		

	}
	
	@SubscribeEvent
	public void onCraft(PlayerEvent.ItemCraftedEvent event) {
	if(event.crafting.getItem() == InitItemsEA.shimmering_disc) {
		
		event.player.triggerAchievement(InitAchievementsEA.shimmering_disc);
		
		}
	}
	//Pickup an item achievement
	//@SubscribeEvent
	//public void onPickup(PlayerEvent.ItemPickupEvent event) {
	//	if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(Item.getItemFromBlock(EbonArtsBlocks.arcanite_ore)))) {
		
	//		event.player.triggerAchievement(EbonArtsAchievements.mineMysticDust);
		
	//	}
	//}
		
	
	
	//Smelt an item achievement
	//@SubscribeEvent
	//public void onSmelt(PlayerEvent.ItemSmeltedEvent event) {
	//	if(event.smelting.getItem() == EbonArtsItems.purified_mystic_dust) {

	//		event.player.triggerAchievement(EbonArtsAchievements.smeltMysticDust);
		
	//	}
	//}
	
	
	
	//Craft an item achievement
	//@SubscribeEvent
	//public void onCraft(PlayerEvent.ItemCraftedEvent event) {
	//	if(event.crafting.getItem() == EbonArtsItems.ebon_sigil) {
		
	//		event.player.triggerAchievement(EbonArtsAchievements.craftEbonSigil);
		
	//	}
	//}
}
