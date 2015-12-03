package com.ebonheart.EbonArtsMod.api;

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

public class AchievementHelper {

	@SubscribeEvent
	public void onPickup(PlayerEvent.ItemPickupEvent event) 
	{
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(Block.getBlockFromItem(InitItemsEA.arcanite_shard)))) 
		{
			event.player.triggerAchievement(InitAchievementsEA.mine_arcanite_shard);
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
