package com.ebonheart.EbonArtsMod.common.items.armor;

import java.util.List;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.api.modifiers.EAAttributeModifier;
import com.ebonheart.EbonArtsMod.common.items.ItemHelper;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.PlayerCapabilities;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

//Soularite
public class ItemCelestialArmor extends ItemArmor {
	
	public ItemCelestialArmor(String unlocalizedName, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
	{
		super(EAMaterialHelper.CELESTIAL, renderIndexIn, equipmentSlotIn);
		
		ItemHelper.setItemName(this, unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}
	
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        return InitItemsEA.soularite == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
    }
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) 
	{
		toolTip.add(TextFormatting.DARK_PURPLE + "Divine armor with the soul");
		toolTip.add(TextFormatting.DARK_PURPLE + "of an Archangel.");
		toolTip.add(" ");
		toolTip.add(TextFormatting.WHITE + "Set Bonus:");
		toolTip.add(TextFormatting.GREEN + "Ability - Flight.");
		toolTip.add(TextFormatting.GREEN + "Ability - Safe Fall.");
		//toolTip.add(TextFormatting.GREEN + "Speed increased by 120%");
	}
	
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.EPIC;
    }
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) 
	{
		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD) != null && player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == InitItemsEA.celestial_helmet
			&& player.getItemStackFromSlot(EntityEquipmentSlot.CHEST) != null && player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == InitItemsEA.celestial_chestplate
			&& player.getItemStackFromSlot(EntityEquipmentSlot.LEGS) != null && player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == InitItemsEA.celestial_leggings
			&& player.getItemStackFromSlot(EntityEquipmentSlot.FEET) != null && player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == InitItemsEA.celestial_boots) 
		{
			if (!player.capabilities.isCreativeMode)
			{
				if (!player.capabilities.allowFlying)
				{
					player.capabilities.allowFlying = true;
				}
				
				if (player.capabilities.isFlying)
				{
					if(!player.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(EAAttributeModifier.CELESTIAL_FLY_BONUS))
					{
						player.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).applyModifier(EAAttributeModifier.CELESTIAL_FLY_BONUS);
					}
				}
				if (!player.capabilities.isFlying)
				{
					player.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(EAAttributeModifier.CELESTIAL_FLY_BONUS);
				}
			}
		}
		else
		{
			if (!player.capabilities.isCreativeMode)
			{
				player.capabilities.isFlying = false;
				player.capabilities.allowFlying = false;
			}
			
			if(player.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(EAAttributeModifier.CELESTIAL_FLY_BONUS))
			{
				player.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(EAAttributeModifier.CELESTIAL_FLY_BONUS);
			}
		}
	}
}
