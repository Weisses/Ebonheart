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

public class ItemBlazefury extends ItemSword {

	public ItemBlazefury(ToolMaterial material) 
	{
		super(material);
		
		
		//ItemHelper.setItemName(this, "tool/blazefury");
		this.setUnlocalizedName("tools/blazefury");
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}
	
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
		Random rand = new Random();
		int d = rand.nextInt(100) + 1;
		
		if (d < 30)
		{
			Potion potion = Potion.fireResistance;
					//.fireResistance;
			//EntityPlayer playerIn = (EntityPlayer) attacker;
			
			//EntityPlayer playerIn = (EntityPlayer) attacker.get//;.getPlayerEntityByUUID(attacker.getUniqueID());
			target.setFire(4);
			WeaponHelper.addPotionEffectToTarget(attacker, potion, 5, 0);
			stack.damageItem(1, attacker);
		}
        return true;
    }
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) {
		toolTip.add(ChatFormatting.DARK_PURPLE + "\"Let the flames consume all");
		toolTip.add(ChatFormatting.DARK_PURPLE + "that stand before you.\"");
		toolTip.add(" ");
		toolTip.add(ChatFormatting.GOLD + "30% chance on hit:");
		toolTip.add(ChatFormatting.RED + "Target - Set on fire for 4 seconds.");
		toolTip.add(ChatFormatting.GREEN + "Self - Fire Resistance for 5 seconds.");
	}
	
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.epic;
    }
	
}
