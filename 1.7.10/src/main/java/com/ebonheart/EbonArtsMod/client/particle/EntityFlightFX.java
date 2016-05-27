package com.ebonheart.EbonArtsMod.client.particle;

import java.util.Random;

import net.minecraft.client.particle.EntityEnchantmentTableParticleFX;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class EntityFlightFX extends EntityEnchantmentTableParticleFX {
	
	Random random = new Random();

    public EntityFlightFX(World parWorld,
            double parX, double parY, double parZ,
            double parMotionX, double parMotionY, double parMotionZ) 
    {
        super(parWorld, parX, parY, parZ, parMotionX, parMotionY, parMotionZ);
        
        float d1 = random.nextFloat() - (random.nextFloat() * .25F);
        float d2 = random.nextFloat() - (random.nextFloat() * .25F);
        float d3 = random.nextFloat() - (random.nextFloat() * .25F);
        
        
        particleScale = 0.5F;
        //setRBGColorF(d1, d2, d3);
        this.particleRed = d1;
        this.particleGreen = d2;
        this.particleBlue = d3;
        
    }
    
}