package com.ebonheart.EbonArtsMod.common.items.tools;

import java.util.List;
import java.util.Random;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.items.ItemHelper;

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

public class ItemDespair extends ItemSword {

	public ItemDespair(String unlocalizedName, ToolMaterial material) 
	{
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}
	
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
		Random rand = new Random();
		int d = rand.nextInt(100) + 1;
		
		if (d < 30)
		{
			Potion potion = Potion.wither;
			Potion potion2 = Potion.confusion;
			EntityPlayer playerIn = attacker.getEntityWorld().getPlayerEntityByUUID(attacker.getUniqueID());
			ItemHelper.addPotionEffectToTarget(target, potion, 4, 1);
			ItemHelper.addPotionEffectToTarget(target, potion2, 3, 1);
			stack.damageItem(1, playerIn);
		}
        return true;
    }
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) {
		toolTip.add(EnumChatFormatting.DARK_PURPLE + "\"Let all things be reduced");
		toolTip.add(EnumChatFormatting.DARK_PURPLE + "to nothingness.\"");
		toolTip.add(" ");
		toolTip.add(EnumChatFormatting.GOLD + "30% chance on hit:");
		toolTip.add(EnumChatFormatting.RED + "Target - Wither for 4 seconds.");
		toolTip.add(EnumChatFormatting.RED + "Target - Nausea for 3 seconds.");
	}
	
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.EPIC;
    }

}
