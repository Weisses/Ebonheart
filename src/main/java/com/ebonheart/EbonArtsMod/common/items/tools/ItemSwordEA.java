package com.ebonheart.EbonArtsMod.common.items.tools;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.DamageSource;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.api.damagesources.EADamageSources;

public class ItemSwordEA extends ItemSword 
{

	public ItemSwordEA(ToolMaterial material, String unlocalizedName) 
	{
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
		
	}
	
	
    //public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    //{
        //stack.damageItem(1, attacker);
    	//target.attackEntityFrom(DamageSource electricDamage , 1);
        //target.setFire(5);
        //return true;
    //}
}
