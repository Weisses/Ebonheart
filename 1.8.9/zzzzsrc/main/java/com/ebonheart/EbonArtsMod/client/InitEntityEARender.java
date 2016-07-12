package com.ebonheart.EbonArtsMod.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import com.ebonheart.EbonArtsMod.api.ItemsEA;
import com.ebonheart.EbonArtsMod.client.projectile.RenderEnchantedEbonheart;
import com.ebonheart.EbonArtsMod.common.entity.EntityEnchantedEbonheart;

public final class InitEntityEARender extends ItemsEA {
	
	public static RenderManager EARender;
	
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
		
		EARender = Minecraft.getMinecraft().getRenderManager(); 
		
		//RenderingRegistry.registerEntityRenderingHandler(classIn, renderFactory);
		
		RenderingRegistry//.registerEntityRenderingHandler(entityClass, renderFactory);
		.registerEntityRenderingHandler
		(classIn, new RenderEnchantedEbonheart(EARender));
		
		
		
	}
}
