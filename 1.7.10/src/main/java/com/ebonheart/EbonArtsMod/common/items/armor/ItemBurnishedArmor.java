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
import com.ebonheart.EbonArtsMod.common.utils.LogHelper;
import com.ebonheart.EbonArtsMod.configs.EbonArtsConfiguration;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;
import com.mojang.realmsclient.gui.ChatFormatting;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

//Arcanite
public class ItemBurnishedArmor extends ItemArmor {
	
	double playerPosX;
	double playerPosY;
	double playerPosZ;
	public String textureName;
	Random random = new Random();
	
	public ItemBurnishedArmor(String unlocalizedName, int renderIndexIn, int equipmentSlotIn)
	{
		super(MaterialHelper.BURNISHED, renderIndexIn, equipmentSlotIn);
		
		this.textureName = "burnished_layer";
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}
	
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        return InitItemsEA.arcanite == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
    }
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) 
	{
		toolTip.add(ChatFormatting.GOLD + "Polished armor stacked in layers");
		toolTip.add(ChatFormatting.GOLD + "for stealthy speed.");
		toolTip.add(" ");
		toolTip.add(ChatFormatting.WHITE + "Set Bonus:");
		toolTip.add(ChatFormatting.GREEN + "Ability - Sprint Stealth.");
		toolTip.add(ChatFormatting.GREEN + "Speed increased by 120%");
	}
	
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.uncommon;
    }
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) 
	{
		if (player.getCurrentArmor(3) != null && player.getCurrentArmor(3).getItem().equals(InitItemsEA.burnished_helmet)
			&& player.getCurrentArmor(2) != null && player.getCurrentArmor(2).getItem().equals(InitItemsEA.burnished_chestplate)
			&& player.getCurrentArmor(1) != null && player.getCurrentArmor(1).getItem().equals(InitItemsEA.burnished_leggings)
			&& player.getCurrentArmor(0) != null && player.getCurrentArmor(0).getItem().equals(InitItemsEA.burnished_boots)) 
		{
			//LogHelper.info("Burnished armor active.");
			if(player.getEntityAttribute(SharedMonsterAttributes.movementSpeed).getModifier(EAAttributeModifier.BURNISHED_SPEED_BONUS.getID()) == null)// == null)//.hasModifier(EAAttributeModifier.BURNISHED_SPEED_BONUS))
			{
				//LogHelper.info("Burnished buff applied.");
				player.getEntityAttribute(SharedMonsterAttributes.movementSpeed).applyModifier(EAAttributeModifier.BURNISHED_SPEED_BONUS);
			}
			
			if(player.isSprinting())
			{
				
				if(!player.isInvisible())
				{
					player.setInvisible(true);
				}
				
				if(!EbonArtsConfiguration.armorParticle)
				{
					
					if(world.isRemote)
					{
						
						playerPosX = player.posX;//.getPosition().getX();
						playerPosY = player.posY;
						playerPosZ = player.posZ;
						
						int d = random.nextInt(100) + 1;
						
						if (d <= 10)
						{
							EbonArtsMod.proxy.generateSprintParticles(player);
						}
						
						if (d <= 50)
						{
							world.spawnParticle("cloud", playerPosX, playerPosY - 1.4F, playerPosZ, (double)((random.nextFloat() - 0.5F) * 0.2F), (double)((random.nextFloat() - 0.5F) * 0.2F), (double)((random.nextFloat() - 0.5F) * 0.2F));
						}
						
					}
					
				}
				
			}
			else
			{
				player.setInvisible(false);
			}
			
		}
		//else
		//{
			//if(player.getEntityAttribute(SharedMonsterAttributes.movementSpeed).getModifier(EAAttributeModifier.BURNISHED_SPEED_BONUS.getID()) != null)// == null)//.hasModifier(EAAttributeModifier.BURNISHED_SPEED_BONUS))
			//{
			//	LogHelper.info("Burnished buff REMOVED FROM ITEMARMOR.");
			//	player.getEntityAttribute(SharedMonsterAttributes.movementSpeed).removeModifier(EAAttributeModifier.BURNISHED_SPEED_BONUS);
			//}
		//}
		
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
	    return Reference.MOD_ID + ":textures/models/armor/" + this.textureName + "_" + (this.armorType == 2 ? "2" : "1") + ".png";
	}
	
}
