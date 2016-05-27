package com.ebonheart.EbonArtsMod.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.entity.Entity;

import com.ebonheart.EbonArtsMod.api.ItemsEA;
import com.ebonheart.EbonArtsMod.client.projectile.RenderEnchantedEbonheart;
import com.ebonheart.EbonArtsMod.common.entity.EntityEnchantedEbonheart;

import cpw.mods.fml.client.registry.RenderingRegistry;

public final class InitEntityEARender extends ItemsEA {
	
	public static IResourceManager EARender;
	
	public static void registerRenders()
	{
		
		registerRender(EntityEnchantedEbonheart.class
				//, RenderEnchantedEbonheart::new
				);
		
	}
	
	public static void registerRender(Class<? extends Entity> classIn
			//, IRenderFactory renderFactory
			)
	{
		
		EARender = Minecraft.getMinecraft().getResourceManager(); 
		
		//RenderingRegistry.registerEntityRenderingHandler(classIn, renderFactory);
		
		RenderingRegistry//.registerEntityRenderingHandler(entityClass, renderFactory);
		.registerEntityRenderingHandler
		(classIn, new RenderEnchantedEbonheart(EARender));
		
		
		
	}
}
