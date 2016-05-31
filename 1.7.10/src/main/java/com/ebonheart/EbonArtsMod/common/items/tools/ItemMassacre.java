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

public class ItemMassacre extends ItemSword {

	public ItemMassacre(ToolMaterial material) 
	{
		super(material);
		//ItemHelper.setItemName(this, "tool/massacre");
		this.setUnlocalizedName("tools/massacre");
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}
	
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
		Random rand = new Random();
		int d = rand.nextInt(100) + 1;
		
		if (d < 35)
		{
			Potion potion = Potion.resistance;
					//.resistance;
			Potion potion2 = Potion.moveSpeed;
					//.moveSpeed;
			//EntityPlayer playerIn = attacker.getEntityWorld().getPlayerEntityByUUID(attacker.getUniqueID());
			WeaponHelper.addPotionEffectToTarget(attacker, potion, 5, 0);
			WeaponHelper.addPotionEffectToTarget(attacker, potion2, 3, 0);
			stack.damageItem(1, attacker);
		}
		return true;
    }
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) {
		toolTip.add(ChatFormatting.DARK_PURPLE + "\"Strengthen your resolve with");
		toolTip.add(ChatFormatting.DARK_PURPLE + "the blood of your enemies.\"");
		toolTip.add(" ");
		toolTip.add(ChatFormatting.GOLD + "35% chance on hit:");
		toolTip.add(ChatFormatting.GREEN + "Self - Resistance vs All for 5 seconds.");
		toolTip.add(ChatFormatting.GREEN + "Self - Movement Speed for 3 seconds.");
	}
	
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.epic;
    }
	
}
