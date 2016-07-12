package com.ebonheart.EbonArtsMod.common.items.tools;

import java.util.List;
import java.util.Random;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.ebonheart.EbonArtsMod.common.items.ItemHelper;
import com.ebonheart.EbonArtsMod.common.items.WeaponHelper;
import com.mojang.realmsclient.gui.ChatFormatting;

public class ItemFrostbite extends ItemSword {

	public ItemFrostbite(ToolMaterial material) 
	{
		super(material);
		ItemHelper.setItemName(this, "tool/frostbite");
	}
	
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
		Random rand = new Random();
		int d = rand.nextInt(100) + 1;
		
		if (d < 38)
		{
			Potion potion1 = Potion.moveSlowdown;
			//.moveSlowdown;
			Potion potion2 = Potion.weakness;
			//.weakness;
			EntityPlayer playerIn = attacker.getEntityWorld().getPlayerEntityByUUID(attacker.getUniqueID());
			WeaponHelper.addPotionEffectToTarget(target, potion1, 3, 2);
			WeaponHelper.addPotionEffectToTarget(target, potion2, 5, 2);
			stack.damageItem(1, playerIn);
		}
        return true;
    }
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) {
		toolTip.add(ChatFormatting.DARK_PURPLE + "\"The grip of frost weakens");
		toolTip.add(ChatFormatting.DARK_PURPLE + "and chills all before it.\"");
		toolTip.add(" ");
		toolTip.add(ChatFormatting.GOLD + "38% chance on hit:");
		toolTip.add(ChatFormatting.RED + "Target - Weakness for 5 seconds.");
		toolTip.add(ChatFormatting.RED + "Target - Slow for 3 seconds.");
	}
	
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.EPIC;
    }
	
}
