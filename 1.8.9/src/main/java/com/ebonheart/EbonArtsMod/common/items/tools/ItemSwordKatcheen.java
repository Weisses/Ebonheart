package com.ebonheart.EbonArtsMod.common.items.tools;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
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

public class ItemSwordKatcheen extends ItemSword {

	public ItemSwordKatcheen(String unlocalizedName, ToolMaterial material) 
	{
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
		
	}
	
	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	{
		
		if(repair.getItem().equals(InitItemsEA.katcheen))
			return true;
		else
			return false;
	}
	//entity.attackEntityFrom(DamageSource source, float damage)
	
    //public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker)
    //{
        
    	//target.attackEntityFrom(EntityDamageSourceElectric.causeElectricDamage(target, attacker), 50.0f);
        
    	//System.out.println("electric damage");
        //return true;
    //}

}
