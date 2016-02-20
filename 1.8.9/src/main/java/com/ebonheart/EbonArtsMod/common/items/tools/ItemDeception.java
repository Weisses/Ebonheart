package com.ebonheart.EbonArtsMod.common.items.tools;

import java.util.List;
import java.util.Random;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.items.ItemHelper;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemDeception extends ItemSword {

	protected Minecraft mc;
	
	public ItemDeception(String unlocalizedName, ToolMaterial material) 
	{
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) 
	{
		toolTip.add(EnumChatFormatting.DARK_PURPLE + "\"All minds can bend as");
		toolTip.add(EnumChatFormatting.DARK_PURPLE + "reality shifts.\"");
		toolTip.add(" ");
		toolTip.add(EnumChatFormatting.GOLD + "40% chance on hit:");
		toolTip.add(EnumChatFormatting.RED + "Target - Blinds for 3 seconds.");
		toolTip.add(EnumChatFormatting.GREEN + "Self - Invisibility for 5 seconds.");
	}
	
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    {
		Random rand = new Random();
		int d = rand.nextInt(100) + 1;
		
		if (d < 40)
		{
			Potion potion1 = Potion.blindness;
			Potion potion2 = Potion.invisibility;
			EntityPlayer playerIn = attacker.getEntityWorld().getPlayerEntityByUUID(attacker.getUniqueID());
			ItemHelper.addPotionEffectToTarget(target, potion1, 3, 0);
			ItemHelper.addPotionEffectToTarget(playerIn, potion2, 5, 0);
			stack.damageItem(1, playerIn);
		}
        return true;
    }
	
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.EPIC;
    }
}
