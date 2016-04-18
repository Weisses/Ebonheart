package com.ebonheart.EbonArtsMod.common.items.armor;

import java.util.List;
import java.util.UUID;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.api.modifiers.EAAttributeModifier;
import com.ebonheart.EbonArtsMod.common.items.ItemHelper;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.ai.attributes.RangedAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

//Arcanite
public class ItemBurnishedArmor extends ItemArmor {
	
	public ItemBurnishedArmor(String unlocalizedName, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn)
	{
		super(EAMaterialHelper.BURNISHED, renderIndexIn, equipmentSlotIn);
		
		ItemHelper.setItemName(this, unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}
	
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
    {
        return InitItemsEA.arcanite == repair.getItem() ? true : super.getIsRepairable(toRepair, repair);
    }
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) 
	{
		toolTip.add(TextFormatting.GOLD + "Polished armor stacked in layers");
		toolTip.add(TextFormatting.GOLD + "for stealthy speed.");
		toolTip.add(" ");
		toolTip.add(TextFormatting.WHITE + "Set Bonus:");
		toolTip.add(TextFormatting.GREEN + "Ability - Sprint Stealth.");
		toolTip.add(TextFormatting.GREEN + "Speed increased by 120%");
	}
	
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.UNCOMMON;
    }
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) 
	{
		if (player.getItemStackFromSlot(EntityEquipmentSlot.HEAD) != null && player.getItemStackFromSlot(EntityEquipmentSlot.HEAD).getItem() == InitItemsEA.burnished_helmet
			&& player.getItemStackFromSlot(EntityEquipmentSlot.CHEST) != null && player.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem() == InitItemsEA.burnished_chestplate
			&& player.getItemStackFromSlot(EntityEquipmentSlot.LEGS) != null && player.getItemStackFromSlot(EntityEquipmentSlot.LEGS).getItem() == InitItemsEA.burnished_leggings
			&& player.getItemStackFromSlot(EntityEquipmentSlot.FEET) != null && player.getItemStackFromSlot(EntityEquipmentSlot.FEET).getItem() == InitItemsEA.burnished_boots) 
		{
			
			if(!player.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(EAAttributeModifier.BURNISHED_SPEED_BONUS))
			{
				player.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).applyModifier(EAAttributeModifier.BURNISHED_SPEED_BONUS);
			}
			
			if(player.isSprinting())
			{
				player.setInvisible(true);
			}
			else
			{
				player.setInvisible(false);
			}
		}
		else
		{
			player.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(EAAttributeModifier.BURNISHED_SPEED_BONUS);
		}
	}
	
	
	
	/**
	private void effectPlayer(EntityPlayer player, Potion potion, int strength, boolean showParticles) {
	    //Always effect for 8 seconds, then refresh
	    if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
	        player.addPotionEffect(new PotionEffect(potion
	        		//.id
	        		, 159, strength, true, showParticles));
	}
	
	*
	*
	if(player.onGround) 
			{
				
				isDoubleJumping = false;
				
			}
			
			if (world.isRemote)
			{
				
				//if(Minecraft.getMinecraft().gameSettings.keyBindJump.isPressed())
				//{
					
				//	if(!player.onGround && !isDoubleJumping)
				//	{
						
				//		player.setVelocity(player.motionX, 0.6F, player.motionZ);
				//		isDoubleJumping = true;
						
				//	}
					
				//}
				
				//if(Minecraft.getMinecraft().gameSettings.keyBindSneak.isKeyDown())
				//{
					
				//	if(!player.onGround && !isDoubleJumping)
				//	{
						
				//		for(tick = 1; tick > 1000; tick++)
				//		{
				//			player.setVelocity(player.motionX, 0.0F, player.motionZ);
							//isDoubleJumping = true;
				//		}
						
						
						
				//	}
	**/
	
}
