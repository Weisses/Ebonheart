package com.ebonheart.EbonArtsMod.init;

import net.minecraft.entity.Entity;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.entity.EntityEnchantedEbonheart;

import cpw.mods.fml.common.registry.EntityRegistry;

public class InitEntityEA {
	
	private static int entityID = 0;
	
	public static void preInit()
	{

		//throwingRock = new ItemThrowingRock().setUnlocalizedName("throwingRock");
		register(EntityEnchantedEbonheart.class, "Enchanted Ebonheart", 64, 20, true);
		
	}
	
	public static void register(Class<? extends Entity> entityClass, String entityName, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates)
	{
		//int modEntityID = 0;
		//EntityRegistry.registerModEntity(EntityEnchantedEbonheart.class, "Ebonheart", ++modEntityID, Reference.MOD_ID, 64, 10, true);
		
		EntityRegistry.registerModEntity(entityClass, entityName, entityID++, EbonArtsMod.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
		
		
		//EntityRegistry.registerModEntity(EntityEbonheart.class, "Ebonheart", EntityRegistry.findGlobalUniqueEntityId(), Reference.MOD_ID, 64, 10, true);
		
	}
}
