package com.ebonheart.EbonArtsMod.common.items.armor;

import java.util.List;
import java.util.Random;

import net.minecraft.client.Minecraft;
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

//Katcheen
public class ItemScalemailArmor extends ItemArmor {
	
	public static boolean isDoubleJumping;
	
	double playerPosX;
	double playerPosY;
	double playerPosZ;
	
	Random random = new Random();
	
	public ItemScalemailArmor(String unlocalizedName, int renderIndexIn, int equipmentSlotIn)
	{
		super(MaterialHelper.SCALEMAIL, renderIndexIn, equipmentSlotIn);
		
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}
	
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        return InitItemsEA.katcheen == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
    }
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) 
	{
		toolTip.add(ChatFormatting.DARK_AQUA + "Strong scales are woven in a flexible");
		toolTip.add(ChatFormatting.DARK_AQUA + "mesh, enhancing acrobatics.");
		toolTip.add(" ");
		toolTip.add(ChatFormatting.WHITE + "Set Bonus:");
		toolTip.add(ChatFormatting.GREEN + "Ability - Double Jump.");
		toolTip.add(ChatFormatting.GREEN + "Ability - Safe Fall.");
		//toolTip.add(ChatFormatting.GREEN + "Speed increased by 110%");
	}
	
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.rare;
    }
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) 
	{
		if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == InitItemsEA.scalemail_helmet
			&& player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == InitItemsEA.scalemail_chestplate
			&& player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == InitItemsEA.scalemail_leggings
			&& player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == InitItemsEA.scalemail_boots) 
		{
			if(player.fallDistance >= 2)
			{
				player.fallDistance = 0;
			}
			
			if(player.onGround) 
			{
				isDoubleJumping = false;
			}
			
			if (world.isRemote)
			{
				
				if (isDoubleJumping)
				{
					
					if(!EbonArtsConfiguration.armorParticle)
					{
						
						if(world.isRemote)
						{
							
							playerPosX = player.posX;
							playerPosY = player.posY;
							playerPosZ = player.posZ;
							
							int d = random.nextInt(100) + 1;
							
							if (d <= 25)
							{
								
								//world.spawnParticle(EnumParticleTypes.FIREWORKS_SPARK, playerPosX, playerPosY, playerPosZ, (double)((random.nextFloat() - 0.5F) * 0.2F), (double)((random.nextFloat() - 0.5F) * 0.2F), (double)((random.nextFloat() - 0.5F) * 0.2F), new int[0]);
								
							}
							
						}
						
					}
					
				}
				
				if(Minecraft.getMinecraft().gameSettings.keyBindJump.isPressed())
				{
					
					if(!player.onGround && !isDoubleJumping)
					{
						isDoubleJumping = true;
						player.addVelocity(0, (-(player.motionY) + 0.6F), 0);
					}
					
				}
				
			}
			
		}
		
	}
	
}
