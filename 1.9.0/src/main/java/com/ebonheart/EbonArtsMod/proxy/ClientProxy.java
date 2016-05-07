package com.ebonheart.EbonArtsMod.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.ebonheart.EbonArtsMod.api.SoundEventsEA;
import com.ebonheart.EbonArtsMod.client.InitBlocksEARender;
import com.ebonheart.EbonArtsMod.client.InitEntityEARender;
import com.ebonheart.EbonArtsMod.client.InitItemsEARender;
import com.ebonheart.EbonArtsMod.client.entity.EntityCandleFX;
import com.ebonheart.EbonArtsMod.client.particle.EntityFlightFX;
import com.ebonheart.EbonArtsMod.client.particle.EntitySprintFX;
import com.ebonheart.EbonArtsMod.client.particle.EntityUnholyFX;
import com.ebonheart.EbonArtsMod.init.InitEntityEA;
import com.ebonheart.EbonArtsMod.init.InitTileEntitiesEA;

public class ClientProxy extends CommonProxy {
	public float fovModifierHand = 0F;
	@Override
	public void preInit(FMLPreInitializationEvent event) 
	{
		super.preInit(event);
		
		InitBlocksEARender.preInit();
		
		
		
		//---------------------------
		//InitTileEntitiesEA.registerRenders();
	}
	
	@Override
	public void init(FMLInitializationEvent event) 
	{
		super.init(event);
		
		InitItemsEARender.registerRenders();
		InitBlocksEARender.registerRenders();
		InitEntityEARender.registerRenders();
		
		
		//---------------------------
		//InitEntityEARender.registerParticle(null, null);
		//InitBlocksEARender.registerSpecialRenders();
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent event) 
	{
		super.postInit(event);
		
	}
	
	/**
	 * Particles
	 */
	
	@Override
	public void generateSprintParticles(Entity theEntity)
	{
	    double motionX = theEntity.worldObj.rand.nextGaussian() * 0.02D;
	    double motionY = theEntity.worldObj.rand.nextGaussian() * 0.02D;
	    double motionZ = theEntity.worldObj.rand.nextGaussian() * 0.02D;
	    EntityFX particleSprint = new EntitySprintFX(
	          theEntity.worldObj, 
	          theEntity.posX + theEntity.worldObj.rand.nextFloat() * theEntity.width 
	                * 2.0F - theEntity.width, 
	          theEntity.posY + 0.5D + theEntity.worldObj.rand.nextFloat() 
	                * theEntity.height, 
	          theEntity.posZ + theEntity.worldObj.rand.nextFloat() * theEntity.width 
	                * 2.0F - theEntity.width, 
	          motionX, 
	          motionY, 
	          motionZ);
	    Minecraft.getMinecraft().effectRenderer.addEffect(particleSprint);        
	}
	
	@Override
	public void generateUnholyParticles(Entity theEntity)
	{
	    double motionX = theEntity.worldObj.rand.nextGaussian() * 0.02D;
	    double motionY = theEntity.worldObj.rand.nextGaussian() * 0.02D;
	    double motionZ = theEntity.worldObj.rand.nextGaussian() * 0.02D;
	    EntityFX particleUnholy = new EntityUnholyFX(
	          theEntity.worldObj, 
	          theEntity.posX + theEntity.worldObj.rand.nextFloat() * theEntity.width 
	                * 2.0F - theEntity.width, 
	          theEntity.posY + 0.5D + theEntity.worldObj.rand.nextFloat() 
	                * theEntity.height, 
	          theEntity.posZ + theEntity.worldObj.rand.nextFloat() * theEntity.width 
	                * 2.0F - theEntity.width, 
	          motionX, 
	          motionY, 
	          motionZ);
	    Minecraft.getMinecraft().effectRenderer.addEffect(particleUnholy);        
	}
	
	@Override
	public void generateFlightParticles(Entity theEntity)
	{
	    double motionX = theEntity.worldObj.rand.nextGaussian() * 0.02D;
	    double motionY = theEntity.worldObj.rand.nextGaussian() * 0.02D;
	    double motionZ = theEntity.worldObj.rand.nextGaussian() * 0.02D;
	    EntityFX particleFlight = new EntityFlightFX(
	          theEntity.worldObj, 
	          theEntity.posX + theEntity.worldObj.rand.nextFloat() * theEntity.width 
	                * 2.0F - theEntity.width, 
	          theEntity.posY + 0.5D + theEntity.worldObj.rand.nextFloat() 
	                * theEntity.height, 
	          theEntity.posZ + theEntity.worldObj.rand.nextFloat() * theEntity.width 
	                * 2.0F - theEntity.width, 
	          motionX, 
	          motionY, 
	          motionZ);
	    Minecraft.getMinecraft().effectRenderer.addEffect(particleFlight);        
	}
	
}
