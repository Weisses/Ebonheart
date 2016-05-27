package com.ebonheart.EbonArtsMod.common.items.armor;

import java.util.List;
import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.items.ItemHelper;
import com.ebonheart.EbonArtsMod.common.items.MaterialHelper;
import com.ebonheart.EbonArtsMod.configs.EbonArtsConfiguration;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;
import com.mojang.realmsclient.gui.ChatFormatting;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

//Soularite
public class ItemCelestialArmor extends ItemArmor {
	
	double playerPosX;
	double playerPosY;
	double playerPosZ;
	
	Random random = new Random();
	
	public ItemCelestialArmor(String unlocalizedName, int renderIndexIn, int equipmentSlotIn)
	{
		super(MaterialHelper.CELESTIAL, renderIndexIn, equipmentSlotIn);
		
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}
	
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        return InitItemsEA.soularite == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
    }
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) 
	{
		toolTip.add(ChatFormatting.DARK_PURPLE + "Divine armor with the soul");
		toolTip.add(ChatFormatting.DARK_PURPLE + "of an Archangel.");
		toolTip.add(" ");
		toolTip.add(ChatFormatting.WHITE + "Set Bonus:");
		toolTip.add(ChatFormatting.GREEN + "Ability - Flight.");
		toolTip.add(ChatFormatting.GREEN + "Ability - Safe Fall.");
		//toolTip.add(TextFormatting.GREEN + "Speed increased by 120%");
	}
	
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.epic;
    }
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) 
	{
		if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == InitItemsEA.celestial_helmet
			&& player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == InitItemsEA.celestial_chestplate
			&& player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == InitItemsEA.celestial_leggings
			&& player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == InitItemsEA.celestial_boots) 
		{
			
			if (!player.capabilities.isCreativeMode)
			{
				
				if (!player.capabilities.allowFlying)
				{
					player.capabilities.allowFlying = true;
				}
				
				if (world.isRemote)
				{
					if (player.capabilities.isFlying)
					{
						
						player.addVelocity(-(player.motionX * .1), -(player.motionY * .15), -(player.motionZ * .1));
						
					}
					
				}
				
			}
			
			if(!EbonArtsConfiguration.armorParticle)
			{
				if (world.isRemote)
				{
					if (player.capabilities.isFlying)
					{
						if(player.motionX != 0 || player.motionY != 0 || player.motionX != 0)
						{
							int d = random.nextInt(100) + 1;
							
							if (d <= 25)
							{
									
								EbonArtsMod.proxy.generateFlightParticles(player);
									
							}
								
						}
							
					}
						
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
		}
	}
}
