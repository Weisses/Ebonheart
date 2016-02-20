package com.ebonheart.EbonArtsMod.common.items.tools;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.api.damagesources.EADamageSources;
import com.ebonheart.EbonArtsMod.api.damagesources.EntityDamageSourceElectric;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;

public class ItemKatcheenSword extends ItemSword {
	
	public ItemKatcheenSword(String unlocalizedName, ToolMaterial material) 
	{
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}
	
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
	{
		return InitItemsEA.katcheen == par2ItemStack.getItem() ? true : super.getIsRepairable(par1ItemStack, par2ItemStack);
	}
	
	public EnumRarity getRarity(ItemStack stack)
    {
		return EnumRarity.RARE;
    }
	
	//entity.attackEntityFrom(DamageSource source, float damage)
	
    //public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    //{
        
    	//target.attackEntityFrom(EntityDamageSourceElectric.causeElectricDamage(target, attacker), 50.0f);
        
    	//System.out.println("electric damage");
        //return true;
    //}
	
}
