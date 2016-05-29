package com.ebonheart.EbonArtsMod.common.utils.events;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.ItemStack;

import com.ebonheart.EbonArtsMod.common.entity.modifiers.EAAttributeModifier;
import com.ebonheart.EbonArtsMod.common.utils.LogHelper;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;

public class ArmorBuffHandler {
	
    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) 
    {
    	
    	//ItemStack helmet = event.player.inventory.armorItemInSlot(3);
		//ItemStack chestplate = event.player.inventory.armorItemInSlot(2);
		//ItemStack leggings = event.player.inventory.armorItemInSlot(1);
		//ItemStack boots = event.player.inventory.armorItemInSlot(0);
		
    	boolean burnishedBuff = false;
    	boolean vengeanceBuff = false;
    	
    	//if(event.player.getEntityAttribute(SharedMonsterAttributes.movementSpeed).getModifier(EAAttributeModifier.BURNISHED_SPEED_BONUS.getID()) != null)// == null)//.hasModifier(EAAttributeModifier.BURNISHED_SPEED_BONUS))
			//{
			//	LogHelper.info("Burnished buff REMOVED FROM ITEMARMOR.");
			//	player.getEntityAttribute(SharedMonsterAttributes.movementSpeed).removeModifier(EAAttributeModifier.BURNISHED_SPEED_BONUS);
			//}
    	
    	if(event.player.getEntityAttribute(SharedMonsterAttributes.movementSpeed).getModifier(EAAttributeModifier.BURNISHED_SPEED_BONUS.getID()) != null)
    			//event.player.getEntityAttribute(SharedMonsterAttributes.movementSpeed) != null)
    			//event.player.getEntityAttribute(SharedMonsterAttributes.movementSpeed).getModifier(EAAttributeModifier.BURNISHED_SPEED_BONUS.getID()))
    			//player.getEntityAttribute(SharedMonsterAttributes.movementSpeed).hasModifier(EAAttributeModifier.BURNISHED_SPEED_BONUS))
        {
    		burnishedBuff = true;
    		//LogHelper.info("Has Burnished buff. -Event");
        }
    	
    	if(event.player.getEntityAttribute(SharedMonsterAttributes.movementSpeed).getModifier(EAAttributeModifier.VENGEANCE_SPEED_BONUS.getID()) != null
    		|| event.player.getEntityAttribute(SharedMonsterAttributes.maxHealth).getModifier(EAAttributeModifier.VENGEANCE_HP_BONUS.getID()) != null
    		|| event.player.getEntityAttribute(SharedMonsterAttributes.attackDamage).getModifier(EAAttributeModifier.VENGEANCE_ATTACK_BONUS.getID()) != null)
		{
    		vengeanceBuff = true;
		}
		
    	//===================================================================
    	
    	if (burnishedBuff) 
    	{
    		//LogHelper.info("Has Burnished buff and checking armor. -Event " 
    				//+ event.player.inventory.armorItemInSlot(0).getItem()
    		//		);
    		if (event.player.inventory.armorItemInSlot(0) == null || event.player.inventory.armorItemInSlot(0).getItem() == InitItemsEA.burnished_helmet
    			|| event.player.inventory.armorItemInSlot(1) == null || event.player.inventory.armorItemInSlot(1).getItem() == InitItemsEA.burnished_chestplate
    			|| event.player.inventory.armorItemInSlot(2) == null || event.player.inventory.armorItemInSlot(2).getItem() == InitItemsEA.burnished_leggings
    			|| event.player.inventory.armorItemInSlot(3) == null || event.player.inventory.armorItemInSlot(3).getItem() == InitItemsEA.burnished_boots) 
    		{
    			
    			event.player.getEntityAttribute(SharedMonsterAttributes.movementSpeed).removeModifier(EAAttributeModifier.BURNISHED_SPEED_BONUS);
    			//LogHelper.info("Burnished buff removed! -Event");
    			
    	    }
    		
        } 
    	
    	if (vengeanceBuff) 
    	{
    		//LogHelper.info("Has Vengeance buff.");
    		if (event.player.inventory.armorItemInSlot(0) == null || event.player.inventory.armorItemInSlot(0).getItem() != InitItemsEA.vengeance_helmet
    			|| event.player.inventory.armorItemInSlot(1) == null || event.player.inventory.armorItemInSlot(1).getItem() != InitItemsEA.vengeance_chestplate
    			|| event.player.inventory.armorItemInSlot(2) == null || event.player.inventory.armorItemInSlot(2).getItem() != InitItemsEA.vengeance_leggings
    			|| event.player.inventory.armorItemInSlot(3) == null || event.player.inventory.armorItemInSlot(3).getItem() != InitItemsEA.vengeance_boots) 
    		{
    			
    			event.player.getEntityAttribute(SharedMonsterAttributes.movementSpeed).removeModifier(EAAttributeModifier.VENGEANCE_SPEED_BONUS);
    			event.player.getEntityAttribute(SharedMonsterAttributes.maxHealth).removeModifier(EAAttributeModifier.VENGEANCE_HP_BONUS);
    			event.player.getEntityAttribute(SharedMonsterAttributes.attackDamage).removeModifier(EAAttributeModifier.VENGEANCE_ATTACK_BONUS);
    			//LogHelper.info("Vengeance buff removed!");
    			
    	    }
    		
        }
    	
    }
    
}
