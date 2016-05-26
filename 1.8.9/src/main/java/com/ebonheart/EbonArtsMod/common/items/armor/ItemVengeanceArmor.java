package com.ebonheart.EbonArtsMod.common.items.armor;

import java.util.List;
import java.util.Random;
import java.util.UUID;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.entity.modifiers.EAAttributeModifier;
import com.ebonheart.EbonArtsMod.common.items.MaterialHelper;
import com.ebonheart.EbonArtsMod.common.items.ItemHelper;
import com.ebonheart.EbonArtsMod.common.utils.LogHelper;
import com.ebonheart.EbonArtsMod.common.utils.damagesources.EntityDamageSourceElectric;
import com.ebonheart.EbonArtsMod.configs.EbonArtsConfiguration;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;
import com.mojang.realmsclient.gui.ChatFormatting;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

//Necrocite
public class ItemVengeanceArmor extends ItemArmor {
	
	double playerPosX;
	double playerPosY;
	double playerPosZ;
	
	Random random = new Random();
	
	public ItemVengeanceArmor(String unlocalizedName, int renderIndexIn, int equipmentSlotIn)
	{
		super(MaterialHelper.VENGEANCE, renderIndexIn, equipmentSlotIn);
		
		ItemHelper.setItemName(this, unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
		
	}
	
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        return InitItemsEA.necrocite == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
    }
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) 
	{
		toolTip.add(ChatFormatting.DARK_PURPLE + "Unholy power courses through");
		toolTip.add(ChatFormatting.DARK_PURPLE + "this cursed armor.");
		toolTip.add(" ");
		toolTip.add(ChatFormatting.WHITE + "Set Bonus:");
		toolTip.add(ChatFormatting.GREEN + "Max Health increased by +4.");
		toolTip.add(ChatFormatting.GREEN + "All Attacks increased by +1.");
		toolTip.add(ChatFormatting.GREEN + "Speed increased by 110%");
		
	}
	
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.EPIC;
    }
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) 
	{
		if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == InitItemsEA.vengeance_helmet
			&& player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == InitItemsEA.vengeance_chestplate
			&& player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == InitItemsEA.vengeance_leggings
			&& player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == InitItemsEA.vengeance_boots) 
		{
			
			if(!player.getEntityAttribute(SharedMonsterAttributes.movementSpeed).hasModifier(EAAttributeModifier.VENGEANCE_SPEED_BONUS))
			{
				player.getEntityAttribute(SharedMonsterAttributes.movementSpeed).applyModifier(EAAttributeModifier.VENGEANCE_SPEED_BONUS);
			}
			
			if(!player.getEntityAttribute(SharedMonsterAttributes.maxHealth).hasModifier(EAAttributeModifier.VENGEANCE_HP_BONUS))
			{
				player.getEntityAttribute(SharedMonsterAttributes.maxHealth).applyModifier(EAAttributeModifier.VENGEANCE_HP_BONUS);
			}
			
			if(!player.getEntityAttribute(SharedMonsterAttributes.attackDamage).hasModifier(EAAttributeModifier.VENGEANCE_ATTACK_BONUS))
			{
				player.getEntityAttribute(SharedMonsterAttributes.attackDamage).applyModifier(EAAttributeModifier.VENGEANCE_ATTACK_BONUS);
			}
			
			if(!EbonArtsConfiguration.armorParticle)
			{
				if(world.isRemote)
				{
					
					if(player.getHeldItem() != null)
					{
						
						int d = random.nextInt(100) + 1;
						
						if (d <= 2)
						{
							EbonArtsMod.proxy.generateUnholyParticles(player);
						}
						
					}
					
					//Blocking with shield
					//if (player.isHandActive())
					//{
						
					//	int d = random.nextInt(100) + 1;
						
					//	if (d <= 25)
					//	{
							
					//		playerPosX = player.getPositionVector().xCoord;
					//		playerPosY = player.getPositionVector().yCoord;
					//		playerPosZ = player.getPositionVector().zCoord;
							
					//		world.spawnParticle(EnumParticleTypes.SPELL_WITCH, playerPosX, playerPosY, playerPosZ, (double)((random.nextFloat() - 0.5F) * 0.2F), (double)((random.nextFloat() - 0.5F) * 0.2F), (double)((random.nextFloat() - 0.5F) * 0.2F), new int[0]);
							
					//	}
					
					//}
				
				}
				
			}
			
		}
		
	}
	
}
