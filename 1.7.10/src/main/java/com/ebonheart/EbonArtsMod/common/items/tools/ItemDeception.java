package com.ebonheart.EbonArtsMod.common.items.tools;

import java.util.List;
import java.util.Random;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.items.ItemHelper;
import com.ebonheart.EbonArtsMod.common.items.WeaponHelper;
import com.mojang.realmsclient.gui.ChatFormatting;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemDeception extends ItemSword {
	
	public ItemDeception(ToolMaterial material) 
	{
		super(material);
		//ItemHelper.setItemName(this, "tool/deception");
		this.setUnlocalizedName("tools/deception");
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}
	
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
		Random rand = new Random();
		int d = rand.nextInt(100) + 1;
		
		if (d < 40)
		{
			Potion potion1 = Potion.blindness;
					//.blindness;
			Potion potion2 = Potion.invisibility;
					//.invisibility;
			//EntityPlayer playerIn = attacker.getEntityWorld().getPlayerEntityByUUID(attacker.getUniqueID());
			WeaponHelper.addPotionEffectToTarget(target, potion1, 3, 0);
			WeaponHelper.addPotionEffectToTarget(attacker, potion2, 5, 0);
			stack.damageItem(1, attacker);
		}
        return true;
    }
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) 
	{
		toolTip.add(ChatFormatting.DARK_PURPLE + "\"All minds can bend as");
		toolTip.add(ChatFormatting.DARK_PURPLE + "reality shifts.\"");
		toolTip.add(" ");
		toolTip.add(ChatFormatting.GOLD + "40% chance on hit:");
		toolTip.add(ChatFormatting.RED + "Target - Blinds for 3 seconds.");
		toolTip.add(ChatFormatting.GREEN + "Self - Invisibility for 5 seconds.");
	}
	
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.epic;
    }
	
}
