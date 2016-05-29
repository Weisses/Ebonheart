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

public class ItemDespair extends ItemSword {

	public ItemDespair(ToolMaterial material) 
	{
		super(material);
		//ItemHelper.setItemName(this, "tool/despair");
		this.setUnlocalizedName("tools/despair");
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}
	
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
		Random rand = new Random();
		int d = rand.nextInt(100) + 1;
		
		if (d < 30)
		{
			Potion potion = Potion.wither;
					//.wither;
			Potion potion2 = Potion.confusion;
					//.confusion;
			//EntityPlayer playerIn = attacker.getEntityWorld().getPlayerEntityByUUID(attacker.getUniqueID());
			//WeaponHelper.addPotionEffectToTarget(target, potion, 4, 1);
			//WeaponHelper.addPotionEffectToTarget(target, potion2, 3, 1);
			//stack.damageItem(1, playerIn);
		}
        return true;
    }
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) {
		toolTip.add(ChatFormatting.DARK_PURPLE + "\"Let all things be reduced");
		toolTip.add(ChatFormatting.DARK_PURPLE + "to nothingness.\"");
		toolTip.add(" ");
		toolTip.add(ChatFormatting.GOLD + "30% chance on hit:");
		toolTip.add(ChatFormatting.RED + "Target - Wither for 4 seconds.");
		toolTip.add(ChatFormatting.RED + "Target - Nausea for 3 seconds.");
	}
	
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.epic;
    }

}
