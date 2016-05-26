package com.ebonheart.EbonArtsMod.client.particle;

import net.minecraft.client.particle.EntitySpellParticleFX;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class EntitySprintFX extends EntitySpellParticleFX {
    
	public EntitySprintFX(World parWorld,
            double parX, double parY, double parZ,
            double parMotionX, double parMotionY, double parMotionZ) 
    {
        super(parWorld, parX, parY, parZ, parMotionX, parMotionY, parMotionZ);
        setRBGColorF(0, 15, 25);
    }
    
}