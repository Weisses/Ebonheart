package com.ebonheart.EbonArtsMod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

import com.ebonheart.EbonArtsMod.init.EbonArtsAchievements;
import com.ebonheart.EbonArtsMod.init.EbonArtsBlocks;
import com.ebonheart.EbonArtsMod.init.EbonArtsItems;

public class AchievementHelper {

	@SubscribeEvent
	public void onPickup(PlayerEvent.ItemPickupEvent event) {
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(Item.getItemFromBlock(EbonArtsBlocks.arcanite_ore)))) {
		
			event.player.triggerAchievement(EbonArtsAchievements.mineMysticDust);
		
		}
	}
		
	@SubscribeEvent
	public void onSmelt(PlayerEvent.ItemSmeltedEvent event) {
		if(event.smelting.getItem() == EbonArtsItems.purified_mystic_dust) {

			event.player.triggerAchievement(EbonArtsAchievements.smeltMysticDust);
		
		}
	}
	@SubscribeEvent
	public void onCraft(PlayerEvent.ItemCraftedEvent event) {
		if(event.crafting.getItem() == EbonArtsItems.ebon_sigil) {
		
			event.player.triggerAchievement(EbonArtsAchievements.craftEbonSigil);
		
		}
	}
				
		

}
