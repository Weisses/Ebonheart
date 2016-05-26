package com.ebonheart.EbonArtsMod.common.items.tools;

import java.util.List;
import java.util.Random;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.items.ItemHelper;
import com.ebonheart.EbonArtsMod.common.items.WeaponHelper;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;
import com.mojang.realmsclient.gui.ChatFormatting;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemSouleater extends ItemSword {

	public ItemSouleater(ToolMaterial material) 
	{
		super(material);
		ItemHelper.setItemName(this, "tool/souleater");
	}
	
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
		Random rand = new Random();
		int d = rand.nextInt(100) + 1;
		
		if (d < 25)
		{
			EntityPlayer playerIn = attacker.getEntityWorld().getPlayerEntityByUUID(attacker.getUniqueID());
			int heal = rand.nextInt(3) + 1;
			attacker.heal(heal);
			Potion potion = Potion.absorption;
					//.absorption;
			WeaponHelper.addPotionEffectToTarget(playerIn, potion, 4, 0);
		
			if(!playerIn.capabilities.isCreativeMode)
			{
				stack.damageItem(1, playerIn);
			}
		}
		return true;
    }
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) {
		toolTip.add(ChatFormatting.DARK_PURPLE + "\"Pain and suffering can");
		toolTip.add(ChatFormatting.DARK_PURPLE + "heal all wounds.\"");
		toolTip.add(" ");
		toolTip.add(ChatFormatting.GOLD + "25% chance on hit:");
		toolTip.add(ChatFormatting.GREEN + "Self - Heal for 1/2 to 1 1/2 hearts.");
		toolTip.add(ChatFormatting.GREEN + "Self - Absorption for 4 seconds.");
	}
	
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.EPIC;
    }
	
}
