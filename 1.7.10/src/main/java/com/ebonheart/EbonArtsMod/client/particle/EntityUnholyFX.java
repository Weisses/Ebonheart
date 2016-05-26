package com.ebonheart.EbonArtsMod.client.particle;

import net.minecraft.client.particle.EntityFlameFX;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class EntityUnholyFX extends EntityFlameFX {
    
    public EntityUnholyFX(World parWorld,
            double parX, double parY, double parZ,
            double parMotionX, double parMotionY, double parMotionZ) 
    {
        super(parWorld, parX, parY, parZ, parMotionX, parMotionY, parMotionZ);
        
        setParticleTextureIndex(65);
        setRBGColorF(0, 135, 0);
    }
    
}