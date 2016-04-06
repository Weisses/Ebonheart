package com.ebonheart.EbonArtsMod.common.items.armor;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.items.ItemHelper;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;

public class ItemArcaniteArmor extends ItemArmor {
	
	public ItemArcaniteArmor(String unlocalizedName, ArmorMaterial material, int renderIndex, EntityEquipmentSlot armorType) 
	{
		super(material, renderIndex, armorType);
		ItemHelper.setItemName(this, unlocalizedName);
		canRepair = true;
	}
/**
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		//if (itemStack.getItem() == InitItemsEA.katcheen_helmet) {
	    //    effectPlayer(player, Potion.waterBreathing, 0, false);
	    //}
	    //if (itemStack.getItem() == InitItemsEA.katcheen_chestplate) {
	    //    effectPlayer(player, Potion.digSpeed, 0, false);
	    //}
	    //if (itemStack.getItem() == InitItemsEA.katcheen_leggings) {
	    //    effectPlayer(player, Potion.moveSpeed, 0, false);
	    //}
		//if (itemStack.getItem() == InitItemsEA.katcheen_boots) {
		//	effectPlayer(player, Potion.jump, 1, false);
		//} 
		
		if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == InitItemsEA.arcanite_helmet
				&& player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == InitItemsEA.arcanite_chestplate
		        && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == InitItemsEA.arcanite_leggings
		        && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == InitItemsEA.arcanite_boots) 
		{
		        //this.effectPlayer(player, Potion.resistance, 0, true);
			this.effectPlayer(player, Potion.getPotionById(3)
					//.digSpeed
					, 0, false);
			this.effectPlayer(player, Potion.getPotionById(1)
					//.moveSpeed
					, 0, false);
			this.effectPlayer(player, Potion.getPotionById(8)
					//.jump
					, 1, true);
		}
		
		//if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == InitItemsEA.katcheen_helmet
		//        && player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == InitItemsEA.katcheen_chestplate
		//        && player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == InitItemsEA.katcheen_leggings
		//        && player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == InitItemsEA.katcheen_boots) 
		//{
		        //this.effectPlayer(player, Potion.resistance, 0, true);
		//	this.effectPlayer(player, Potion.digSpeed, 1, true);
		//	this.effectPlayer(player, Potion.moveSpeed, 1, true);
		//	this.effectPlayer(player, Potion.jump, 2, true);
		//}
	}   

	private void effectPlayer(EntityPlayer player, Potion potion, int strength, boolean showParticles) {
	    //Always effect for 8 seconds, then refresh
	    if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
	        player.addPotionEffect(new PotionEffect(potion
	        		//.id
	        		, 159, strength, true, showParticles));
	} 
	
	**/

	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.UNCOMMON;
    }
	
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
	{
	        return InitItemsEA.arcanite == par2ItemStack.getItem() ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
	}
}
