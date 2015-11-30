package com.ebonheart.EbonArtsMod.compendium;

import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry.EntityRegistration;

public class CompendiumUnlockHandler {

	/**
	 * This is a general method to catch all actions and unlock the compendium for anything the player picks up.
	 *
	 * @param event
	 */
	@SubscribeEvent
	public void onPlayerPickupItem(EntityItemPickupEvent event){
		
	}
	
	
	
	/**
	 * This should handle all mobs and the Astral Barrier
	 *
	 * @param event
	 */
	//@SubscribeEvent
	//public void onEntityDeath(LivingDeathEvent event){
	//	if (event.entityLiving.worldObj.isRemote && event.source.getSourceOfDamage() instanceof EntityPlayer){
	//		if (event.entity instanceof EntityEnderman){
	//			AlchemicalCompendium.instance.unlockEntry("blockastralbarrier");
	//		}else{
	//			EntityRegistration reg = EntityRegistry.instance().lookupModSpawn(event.entityLiving.getClass(), true);
	//			if (reg != null && reg.getContainer().matches(AMCore.instance)){
	//				String id = reg.getEntityName();
	//				AlchemicalCompendium.instance.unlockEntry(id);
	//			}
	//		}
	//	}
	//}
	
	
	
	/**
	 * This is another genericized method, which attempts to unlock any entry for something the player crafts
	 */
	@SubscribeEvent
	public void onCrafting(ItemCraftedEvent event){
		if (event.player.worldObj.isRemote){
			AlchemicalCompendium.instance.unlockRelatedItems(event.crafting);
		}
	}
	
	
	
	
	
	
	
	
	
}
