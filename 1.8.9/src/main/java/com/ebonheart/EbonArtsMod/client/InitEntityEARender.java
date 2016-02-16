package com.ebonheart.EbonArtsMod.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import com.ebonheart.EbonArtsMod.client.render.models.RenderEbonheart;
import com.ebonheart.EbonArtsMod.common.entity.EntityEbonheart;
import com.ebonheart.EbonArtsMod.references.ItemsEA;

public final class InitEntityEARender extends ItemsEA {
	
	public static RenderManager EARender;
	
	public static void registerRenders()
	{
			
		
		registerRender(EntityEbonheart.class);
		
		
	}
	
	public static void registerRender(Class<? extends Entity> classIn)
	{
		
		EARender = Minecraft.getMinecraft().getRenderManager(); 

		RenderingRegistry.registerEntityRenderingHandler(classIn, new RenderEbonheart(EARender, 0.5f));
		
		
		
	}
}
