package com.ebonheart.EbonArtsMod.common.items.tools;

import java.util.List;
import java.util.Random;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.items.ItemHelper;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemSouleater extends ItemSword {

	public ItemSouleater(String unlocalizedName, ToolMaterial material) 
	{
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
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
			ItemHelper.addPotionEffectToTarget(playerIn, potion, 4, 0);
		
			if(!playerIn.capabilities.isCreativeMode)
			{
				stack.damageItem(1, playerIn);
			}
		}
		return true;
    }
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) {
		toolTip.add(EnumChatFormatting.DARK_PURPLE + "\"Pain and suffering can");
		toolTip.add(EnumChatFormatting.DARK_PURPLE + "heal all wounds.\"");
		toolTip.add(" ");
		toolTip.add(EnumChatFormatting.GOLD + "25% chance on hit:");
		toolTip.add(EnumChatFormatting.GREEN + "Self - Heal for 1/2 to 1 1/2 hearts.");
		toolTip.add(EnumChatFormatting.GREEN + "Self - Absorption for 4 seconds.");
	}
	
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.EPIC;
    }
	
}
