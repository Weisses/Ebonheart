package com.ebonheart.EbonArtsMod.common.utils.events;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;

import com.ebonheart.EbonArtsMod.common.entity.modifiers.EAAttributeModifier;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;

public class ArmorBuffHandler {
	
    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) 
    {
    	
    	ItemStack helmet = event.player.inventory.armorItemInSlot(3);
		ItemStack chestplate = event.player.inventory.armorItemInSlot(2);
		ItemStack leggings = event.player.inventory.armorItemInSlot(1);
		ItemStack boots = event.player.inventory.armorItemInSlot(0);
		
    	boolean burnishedBuff = false;
    	boolean vengeanceBuff = false;
    	boolean celestialBuff = false;
    	
    	if(event.player.getEntityAttribute(SharedMonsterAttributes.movementSpeed).hasModifier(EAAttributeModifier.BURNISHED_SPEED_BONUS))
        {
    		burnishedBuff = true;
        }
    	
    	if(event.player.getEntityAttribute(SharedMonsterAttributes.movementSpeed).hasModifier(EAAttributeModifier.VENGEANCE_SPEED_BONUS)
    		|| event.player.getEntityAttribute(SharedMonsterAttributes.maxHealth).hasModifier(EAAttributeModifier.VENGEANCE_HP_BONUS)
    		|| event.player.getEntityAttribute(SharedMonsterAttributes.attackDamage).hasModifier(EAAttributeModifier.VENGEANCE_ATTACK_BONUS))
		{
    		vengeanceBuff = true;
		}
    	
    	if(event.player.getEntityAttribute(SharedMonsterAttributes.movementSpeed).hasModifier(EAAttributeModifier.CELESTIAL_SPEED_BONUS))
        {
    		celestialBuff = true;
        }
    	
    	//===================================================================
    	
    	if (burnishedBuff) 
    	{
    		//LogHelper.info("Has Burnished buff.");
    		if (event.player.inventory.armorItemInSlot(3) == null || event.player.inventory.armorItemInSlot(3).getItem() != InitItemsEA.burnished_helmet
    			|| event.player.inventory.armorItemInSlot(2) == null || event.player.inventory.armorItemInSlot(2).getItem() != InitItemsEA.burnished_chestplate
    			|| event.player.inventory.armorItemInSlot(1) == null || event.player.inventory.armorItemInSlot(1).getItem() != InitItemsEA.burnished_leggings
    			|| event.player.inventory.armorItemInSlot(0) == null || event.player.inventory.armorItemInSlot(0).getItem() != InitItemsEA.burnished_boots) 
    		{
    			
    			event.player.getEntityAttribute(SharedMonsterAttributes.movementSpeed).removeModifier(EAAttributeModifier.BURNISHED_SPEED_BONUS);
    			//LogHelper.info("Burnished buff removed!");
    			
    	    }
    		
        } 
    	
    	if (vengeanceBuff) 
    	{
    		//LogHelper.info("Has Vengeance buff.");
    		if (event.player.inventory.armorItemInSlot(3) == null || event.player.inventory.armorItemInSlot(3).getItem() != InitItemsEA.vengeance_helmet
    			|| event.player.inventory.armorItemInSlot(2) == null || event.player.inventory.armorItemInSlot(2).getItem() != InitItemsEA.vengeance_chestplate
    			|| event.player.inventory.armorItemInSlot(1) == null || event.player.inventory.armorItemInSlot(1).getItem() != InitItemsEA.vengeance_leggings
    			|| event.player.inventory.armorItemInSlot(0) == null || event.player.inventory.armorItemInSlot(0).getItem() != InitItemsEA.vengeance_boots) 
    		{
    			
    			event.player.getEntityAttribute(SharedMonsterAttributes.movementSpeed).removeModifier(EAAttributeModifier.VENGEANCE_SPEED_BONUS);
    			event.player.getEntityAttribute(SharedMonsterAttributes.maxHealth).removeModifier(EAAttributeModifier.VENGEANCE_HP_BONUS);
    			event.player.getEntityAttribute(SharedMonsterAttributes.attackDamage).removeModifier(EAAttributeModifier.VENGEANCE_ATTACK_BONUS);
    			//LogHelper.info("Vengeance buff removed!");
    			
    	    }
    		
        }
    	
    	if (celestialBuff) 
    	{
    		//LogHelper.info("Has Burnished buff.");
    		if (event.player.inventory.armorItemInSlot(3) == null || event.player.inventory.armorItemInSlot(3).getItem() != InitItemsEA.celestial_helmet
        			|| event.player.inventory.armorItemInSlot(2) == null || event.player.inventory.armorItemInSlot(2).getItem() != InitItemsEA.celestial_chestplate
        			|| event.player.inventory.armorItemInSlot(1) == null || event.player.inventory.armorItemInSlot(1).getItem() != InitItemsEA.celestial_leggings
        			|| event.player.inventory.armorItemInSlot(0) == null || event.player.inventory.armorItemInSlot(0).getItem() != InitItemsEA.celestial_boots) 
        		{
    			event.player.capabilities.allowFlying = false;
    			event.player.capabilities.isFlying = false;
    			
    			event.player.getEntityAttribute(SharedMonsterAttributes.movementSpeed).removeModifier(EAAttributeModifier.CELESTIAL_SPEED_BONUS);
    			//LogHelper.info("Burnished buff removed!");
    			
    	    }
    		
        } 
    	
    }
    
}
