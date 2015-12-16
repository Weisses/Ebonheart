package com.ebonheart.EbonArtsMod.api.damagesources;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.StatCollector;

public class EntityDamageSourceElectric extends EntityDamageSourceIndirect {
	
	public EntityDamageSourceElectric(String name, Entity transmitter, Entity indirectSource) 
	{
		super(name, transmitter, indirectSource);
	    this.setDamageBypassesArmor();
	}
	
	
	@Override
	public IChatComponent getDeathMessage(EntityLivingBase target) 
	{
		String s = "death.attack." + this.damageType;
	    IChatComponent source = getEntity() == null ? getSourceOfDamage().getDisplayName() : getEntity().getDisplayName();
	    ItemStack stack = (getEntity() != null && getEntity() instanceof EntityLivingBase) ? ((EntityLivingBase)getEntity()).getHeldItem() : null;
	    String s1 = s + ".item";
	    
	    return stack != null && stack.hasDisplayName() && StatCollector.canTranslate(s1) ? 
	    		new ChatComponentTranslation(s1, target.getDisplayName(), source, stack.getChatComponent()) :
	            new ChatComponentTranslation(s, target.getDisplayName(), source);
	}
	
	public static EntityDamageSourceElectric causeElectricDamage(Entity source, Entity transmitter) 
	{
		return new EntityDamageSourceElectric("electric.entity", transmitter, source);
	}
}
