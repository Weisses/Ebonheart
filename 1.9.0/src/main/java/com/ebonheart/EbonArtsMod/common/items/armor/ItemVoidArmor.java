package com.ebonheart.EbonArtsMod.common.items.armor;

import java.util.List;
import java.util.Vector;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.api.helper.LogHelper;
import com.ebonheart.EbonArtsMod.api.modifiers.EAAttributeModifier;
import com.ebonheart.EbonArtsMod.common.items.ItemHelper;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.Vector3d;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
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
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.Vec4b;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

//Ender
public class ItemVoidArmor extends ItemArmor {
	
	public static boolean isTeleported;
	
	public ItemVoidArmor(String unlocalizedName, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
	{
		super(EAMaterialHelper.VOID, renderIndexIn, equipmentSlotIn);
		
		ItemHelper.setItemName(this, unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}
	
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        return Items.ender_eye == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
    }
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) 
	{
		toolTip.add(TextFormatting.DARK_AQUA + "Strong scales are woven in a flexible");
		toolTip.add(TextFormatting.DARK_AQUA + "mesh, enhancing acrobatics.");
		toolTip.add(" ");
		toolTip.add(TextFormatting.WHITE + "Set Bonus:");
		toolTip.add(TextFormatting.GREEN + "Ability - Double Jump.");
		toolTip.add(TextFormatting.GREEN + "Ability - Safe Fall.");
		//toolTip.add(TextFormatting.GREEN + "Speed increased by 110%");
	}
	
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.RARE;
    }
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) 
	{
		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD) != null && player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == InitItemsEA.void_helmet
			&& player.getItemStackFromSlot(EntityEquipmentSlot.CHEST) != null && player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == InitItemsEA.void_chestplate
			&& player.getItemStackFromSlot(EntityEquipmentSlot.LEGS) != null && player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == InitItemsEA.void_leggings
			&& player.getItemStackFromSlot(EntityEquipmentSlot.FEET) != null && player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == InitItemsEA.void_boots) 
		{
			player.fallDistance = 0;
			if(!player.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(EAAttributeModifier.SCALEMAIL_SPEED_BONUS))
			{
				player.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).applyModifier(EAAttributeModifier.SCALEMAIL_SPEED_BONUS);
				player.fallDistance = 0;
			}
			
			if(player.onGround) 
			{
				isTeleported = false;
			}
			
			if (world.isRemote)
			{
				if(Minecraft.getMinecraft().gameSettings.keyBindJump.isPressed())
				{
					if(!player.onGround && !isTeleported)
					{
						int blockReachDistance = 10;
						float partialTicks = 1.0F;
						double posX = 0;
						double posY = 0;
						double posZ = 0;
						
						double playerPosX;
						double playerPosY;
						double playerPosZ;
						
						double test1;
						double test2;
						double test3;
						
						//player.posX = posX;
						//player.posY = posY;
						//player.posZ = posZ;
						
						//;
						playerPosX = player.getPosition().getX();
						playerPosY = player.getPosition().getY();
						playerPosZ = player.getPosition().getZ();
						
						
						//player.rayTrace(blockReachDistance, partialTicks);
						BlockPos pos = new BlockPos(player.rayTrace(10, 1).getBlockPos());
						//BlockPos pos = new BlockPos(player.rayTrace(10, 1).sideHit.getDirectionVec());
						//BlockPos pos = new BlockPos(player.rayTrace(10, 1).getBlockPos().getDistance(this.getX(), p_185332_2_, p_185332_3_));
						
						posX = pos.getX();
						posY = pos.getY();
						posZ = pos.getZ();
						
						
						//if (//playerPosX + 10 <= posX
						//		posX != null
								//posX <= playerPosX + 10 || posX >= playerPosX - 10
						 //&& posY <= playerPosY + 10 || posY >= playerPosY - 10
						 //&& posZ <= playerPosZ + 10 || posZ >= playerPosZ - 10
						//		)
						//{
						/**
						//test = (posD - posY);
						//test1 = posX >= 10 || posX <= -10; 
						if (posX <= playerPosX + 10 || posX >= playerPosX - 10
						 && posY <= playerPosY + 10 || posY >= playerPosY - 10
						 && posZ <= playerPosZ + 10 || posZ >= playerPosZ - 10)
						{
						**/
						
						player.addVelocity((posX - playerPosX) * 0.1, (posY - playerPosY) * 0.1, (posZ - playerPosZ) * 0.1);
						
						
						//player.addVelocity((posX - playerPosX), (posY - playerPosY), (posZ - playerPosZ));
							//player.teleportTo_(posX, posY, posZ);
							LogHelper.info("Teleport SUCCESS!");
							LogHelper.info("Player  Coors:" +  "X: " + playerPosX + " | Y: " + playerPosY + " | Z: " + playerPosZ);
							LogHelper.info("Raycast Coors:" +  "X: " + posX + " | Y: " + posY + " | Z: " + posZ);
							
							isTeleported = true;
							
							
						//}
						//else
						//{
						//	LogHelper.info("Teleport FAILED!");
						//	LogHelper.info("Player  Coors:" +  "X: " + playerPosX + " | Y: " + playerPosY + " | Z: " + playerPosZ);
						//	LogHelper.info("Raycast Coors:" +  "X: " + posX + " | Y: " + posY + " | Z: " + posZ);
							
						//}
						
						
						//player.teleportTo_(posX, posY, posZ);
						//LogHelper.info("Teleported!");
						//LogHelper.info("Player  Coors:" +  "X: " + playerPosX + " | Y: " + playerPosY + " | Z: " + playerPosZ);
						//LogHelper.info("Raycast Coors:" +  "X: " + posX + " | Y: " + posY + " | Z: " + posZ);
						
						
						//player.teleportTo_(posX, posY, posZ);
						//isTeleported = true;
						//LogHelper.info("Coors:" +  "X: " + posX + " | Y: " + pos.getY() + " | Z: " + posZ);
					}
				}
			}
		}
		else
		{
			player.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(EAAttributeModifier.SCALEMAIL_SPEED_BONUS);
		}
	}
}
