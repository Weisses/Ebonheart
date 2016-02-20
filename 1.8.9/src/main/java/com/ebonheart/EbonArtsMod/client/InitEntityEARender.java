package com.ebonheart.EbonArtsMod.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

import com.ebonheart.EbonArtsMod.client.entity.EntityCandleFX;
import com.ebonheart.EbonArtsMod.client.render.projectile.RenderEbonheart;
import com.ebonheart.EbonArtsMod.common.entity.EntityEbonheart;
import com.ebonheart.EbonArtsMod.references.ItemsEA;

public final class InitEntityEARender extends ItemsEA {
	
	public static RenderManager EARender;
	
	public static void registerParticle(World worldIn, BlockPos pos)
	{
		double d0 = (double)pos.getX() + 0.5D;
        double d1 = (double)pos.getY() + 0.7D;
        double d2 = (double)pos.getZ() + 0.5D;
		EntityFX candleFlame = new EntityCandleFX(worldIn, d0, d1, d2, 0.0D, 0.0D, 0.0D);
		Minecraft.getMinecraft().effectRenderer.addEffect(candleFlame);
		
		
	}
	
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
