package com.ebonheart.EbonArtsMod.client.entity;

import net.minecraft.client.particle.EntityAuraFX;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.particle.IParticleFactory;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.client.renderer.VertexBuffer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class EntityCandleFX extends EntityAuraFX
{
    

    public EntityCandleFX(World parWorld,
            double parX, double parY, double parZ,
            double parMotionX, double parMotionY, double parMotionZ) 
    {
        super(parWorld, parX, parY, parZ, parMotionX, parMotionY, parMotionZ);
        setParticleTextureIndex(82); // same as happy villager
        particleScale = 2.0F;
        setRBGColorF(0x88, 0x00, 0x88);
    }

}