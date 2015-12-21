package com.ebonheart.EbonArtsMod.common.items.tools;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.DamageSource;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.api.damagesources.EADamageSources;
import com.ebonheart.EbonArtsMod.api.damagesources.EntityDamageSourceElectric;

public class ItemSwordEA extends ItemSword 
{

	public ItemSwordEA(String unlocalizedName, ToolMaterial material) 
	{
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
		
	}
	//entity.attackEntityFrom(DamageSource source, float damage)
	
    //public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    //{
        
    	//target.attackEntityFrom(EntityDamageSourceElectric.causeElectricDamage(target, attacker), 50.0f);
        
    	//System.out.println("electric damage");
        //return true;
    //}
}
