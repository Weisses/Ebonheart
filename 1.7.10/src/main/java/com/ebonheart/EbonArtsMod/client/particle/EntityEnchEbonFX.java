package com.ebonheart.EbonArtsMod.client.particle;

import java.util.Random;

import net.minecraft.client.particle.EntityFlameFX;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class EntityEnchEbonFX extends EntityFlameFX {
	
	Random random = new Random();

    public EntityEnchEbonFX(World parWorld,
            double parX, double parY, double parZ,
            double parMotionX, double parMotionY, double parMotionZ) 
    {
        super(parWorld, parX, parY, parZ, parMotionX, parMotionY, parMotionZ);
        
        float d1 = random.nextFloat();
        float d2 = random.nextFloat();
        float d3 = random.nextFloat();
        
        particleScale = 0.7F;
        //setRBGColorF(d1, d2, d3);
        this.particleRed = d1;
        this.particleGreen = d2;
        this.particleBlue = d3;
        
    }
    
}