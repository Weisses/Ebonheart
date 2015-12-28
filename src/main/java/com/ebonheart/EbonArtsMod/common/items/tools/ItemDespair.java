package com.ebonheart.EbonArtsMod.common.items.tools;

import java.util.List;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.items.ItemHelper;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
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
		Potion potion = Potion.wither;
		EntityPlayer playerIn = attacker.getEntityWorld().getPlayerEntityByName(attacker.getName());
		ItemHelper.addPotionEffectToTarget(target, potion, 5, 1);
		stack.damageItem(1, playerIn);
        return true;
        
    }
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) {
		toolTip.add("All things will be reduced");
		toolTip.add("to nothingness.");
	}

}
