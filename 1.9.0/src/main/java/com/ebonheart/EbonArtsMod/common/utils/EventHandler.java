package com.ebonheart.EbonArtsMod.common.utils;

import com.ebonheart.EbonArtsMod.common.entity.modifiers.EAAttributeModifier;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

public class EventHandler {
	 private static int flytime = 0;
	
	
    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event, EntityPlayer player) 
    {
    	boolean allowFlying = false;
    	
    	if (event.player.getItemStackFromSlot(EntityEquipmentSlot.HEAD) != null 
    			&& event.player.getItemStackFromSlot(EntityEquipmentSlot.CHEST) != null 
    			&& event.player.getItemStackFromSlot(EntityEquipmentSlot.LEGS) != null 
    			&& event.player.getItemStackFromSlot(EntityEquipmentSlot.FEET) != null) 
    	{
    	
    		ItemStack helmet = event.player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
    		ItemStack chestplate = event.player.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
    		ItemStack leggings = event.player.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
    		ItemStack boots = event.player.getItemStackFromSlot(EntityEquipmentSlot.FEET);
        
    		if (helmet.getItem() == InitItemsEA.burnished_helmet
    		        && chestplate.getItem() == InitItemsEA.burnished_chestplate
    		        && leggings.getItem() == InitItemsEA.burnished_leggings
    		        && boots.getItem() == InitItemsEA.burnished_boots) 
    		{
    			
    		}
    		
    	}
        //if(event.player.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(EAAttributeModifier.BURNISHED_SPEED_BONUS))
    	//{
    		
        //	LogHelper.info("True!!!!");
        	
        	
        	
        	
        //	event.player.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(EAAttributeModifier.BURNISHED_SPEED_BONUS);
    	//}
        
        
    	//if (helmet != null && chestplate != null && leggings != null && boots != null) 
    	//{
    		
    	//	if (helmet.getItem() != InitItemsEA.burnished_helmet
        //			&& chestplate.getItem() != InitItemsEA.burnished_chestplate
        //			&& leggings.getItem() != InitItemsEA.burnished_leggings
        //			&& boots.getItem() != InitItemsEA.burnished_boots) 
        //	{
        //if (event.player.getItemStackFromSlot(EntityEquipmentSlot.HEAD) != null && event.player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == InitItemsEA.burnished_helmet
    	//		&& event.player.getItemStackFromSlot(EntityEquipmentSlot.CHEST) != null && event.player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == InitItemsEA.burnished_chestplate
    	//		&& event.player.getItemStackFromSlot(EntityEquipmentSlot.LEGS) != null && event.player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == InitItemsEA.burnished_leggings
    	//		&& event.player.getItemStackFromSlot(EntityEquipmentSlot.FEET) != null && event.player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == InitItemsEA.burnished_boots) 
    	//{		
    	//	event.player.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(EAAttributeModifier.BURNISHED_SPEED_BONUS);
    			
    		//if(event.player.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(EAAttributeModifier.BURNISHED_SPEED_BONUS))
    		//{
    		//		event.player.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(EAAttributeModifier.BURNISHED_SPEED_BONUS);
    		//}
        //}

    		
    	//	if (boots.getItem() == Items.iron_boots //SlurpiesDonglesItems.topaz_boots 
        //    		&& chestplate.getItem() == Items.iron_chestplate //SlurpiesDonglesItems.topaz_chestplate 
        //    		&& leggings.getItem() == Items.iron_leggings //SlurpiesDonglesItems.topaz_leggings 
        //    		&& helmet.getItem() == Items.iron_helmet //SlurpiesDonglesItems.topaz_helmet
        //    		) {
        //        allowFlying = true;
        //   	} 
    	//if (allowFlying) {
        //    event.player.capabilities.allowFlying = true;
        //    event.player.fallDistance = 0.0F;
        //} else if (flytime == 0 && !event.player.capabilities.isCreativeMode){
        //    event.player.capabilities.isFlying = false;
        //    event.player.capabilities.allowFlying = false;
        //}
    		
    }
}

    		/**	
            if (boots.getItem() == Items.iron_boots //SlurpiesDonglesItems.topaz_boots 
            		&& chestplate.getItem() == Items.iron_chestplate //SlurpiesDonglesItems.topaz_chestplate 
            		&& leggings.getItem() == Items.iron_leggings //SlurpiesDonglesItems.topaz_leggings 
            		&& helmet.getItem() == Items.iron_helmet //SlurpiesDonglesItems.topaz_helmet
            		) {
                allowFlying = true;
            } }
        if (allowFlying) {
            event.player.capabilities.allowFlying = true;
            event.player.fallDistance = 0.0F;
        } else if (flytime == 0 && !event.player.capabilities.isCreativeMode){
            event.player.capabilities.isFlying = false;
            event.player.capabilities.allowFlying = false;
        }
    }
 
}

*/

