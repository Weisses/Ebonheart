package com.ebonheart.EbonArtsMod.common.items.armor;

import java.util.List;
import java.util.Random;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
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
	
	Random random = new Random();
	
	public ItemBurnishedArmor(String unlocalizedName, int renderIndexIn, int equipmentSlotIn)
	{
		super(MaterialHelper.BURNISHED, renderIndexIn, equipmentSlotIn);
		
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
		if (player.inventory.armorItemInSlot(3) != null && player.inventory.armorItemInSlot(3).getItem() == InitItemsEA.burnished_helmet
			&& player.inventory.armorItemInSlot(2) != null && player.inventory.armorItemInSlot(2).getItem() == InitItemsEA.burnished_chestplate
			&& player.inventory.armorItemInSlot(1) != null && player.inventory.armorItemInSlot(1).getItem() == InitItemsEA.burnished_leggings
			&& player.inventory.armorItemInSlot(0) != null && player.inventory.armorItemInSlot(0).getItem() == InitItemsEA.burnished_boots) 
		{
			
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
							//world.spawnParticle(EnumParticleTypes.CLOUD, playerPosX, playerPosY, playerPosZ, (double)((random.nextFloat() - 0.5F) * 0.2F), (double)((random.nextFloat() - 0.5F) * 0.2F), (double)((random.nextFloat() - 0.5F) * 0.2F), new int[0]);
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
	
	
	
}
