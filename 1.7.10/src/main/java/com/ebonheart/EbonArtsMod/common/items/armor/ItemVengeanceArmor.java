package com.ebonheart.EbonArtsMod.common.items.armor;

import java.util.List;
import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.api.Reference;
import com.ebonheart.EbonArtsMod.common.entity.modifiers.EAAttributeModifier;
import com.ebonheart.EbonArtsMod.common.items.ItemHelper;
import com.ebonheart.EbonArtsMod.common.items.MaterialHelper;
import com.ebonheart.EbonArtsMod.configs.EbonArtsConfiguration;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;
import com.mojang.realmsclient.gui.ChatFormatting;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

//Necrocite
public class ItemVengeanceArmor extends ItemArmor {
	
	double playerPosX;
	double playerPosY;
	double playerPosZ;
	public String textureName;
	Random random = new Random();
	
	public ItemVengeanceArmor(String unlocalizedName, int renderIndexIn, int equipmentSlotIn)
	{
		super(MaterialHelper.VENGEANCE, renderIndexIn, equipmentSlotIn);
		this.textureName = "vengeance_layer";
		this.setUnlocalizedName(unlocalizedName);
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
        return EnumRarity.epic;
    }
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) 
	{
		if (player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem().equals(InitItemsEA.vengeance_helmet)
				&& player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem().equals(InitItemsEA.vengeance_chestplate)
				&& player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem().equals(InitItemsEA.vengeance_leggings)
				&& player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem().equals(InitItemsEA.vengeance_boots)) 
			{
				
		//		player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == InitItemsEA.vengeance_helmet
		//	&& player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == InitItemsEA.vengeance_chestplate
		//	&& player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == InitItemsEA.vengeance_leggings
		//	&& player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == InitItemsEA.vengeance_boots) 
		//{
			if(player.getEntityAttribute(SharedMonsterAttributes.movementSpeed).getModifier(EAAttributeModifier.VENGEANCE_SPEED_BONUS.getID()) == null)
			{
				player.getEntityAttribute(SharedMonsterAttributes.movementSpeed).applyModifier(EAAttributeModifier.VENGEANCE_SPEED_BONUS);
			}
			
			if(player.getEntityAttribute(SharedMonsterAttributes.maxHealth).getModifier(EAAttributeModifier.VENGEANCE_HP_BONUS.getID()) == null)
			{
				player.getEntityAttribute(SharedMonsterAttributes.maxHealth).applyModifier(EAAttributeModifier.VENGEANCE_HP_BONUS);
			}
			
			if(player.getEntityAttribute(SharedMonsterAttributes.attackDamage).getModifier(EAAttributeModifier.VENGEANCE_ATTACK_BONUS.getID()) == null)
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
	

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
	    return Reference.MOD_ID + ":textures/models/armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}
	
}
