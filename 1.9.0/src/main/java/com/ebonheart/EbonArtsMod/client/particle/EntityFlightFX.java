package com.ebonheart.EbonArtsMod.client.particle;

import java.util.Random;

import com.ebonheart.EbonArtsMod.common.utils.LogHelper;
import com.ebonheart.EbonArtsMod.references.Reference;

import net.minecraft.client.particle.EntityAuraFX;
import net.minecraft.client.particle.EntityEnchantmentTableParticleFX;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.particle.EntityFlameFX;
import net.minecraft.client.particle.IParticleFactory;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.minecraft.client.renderer.VertexBuffer;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class EntityFlightFX extends EntityEnchantmentTableParticleFX {
	Random random = new Random();

    public EntityFlightFX(World parWorld,
            double parX, double parY, double parZ,
            double parMotionX, double parMotionY, double parMotionZ) 
    {
        super(parWorld, parX, parY, parZ, parMotionX, parMotionY, parMotionZ);
        
        int d = random.nextInt(250) + 1;
        
        //ResourceLocation test = new ResourceLocation(Reference.MOD_ID + ":particles/test.png");
        //setParticleTextureIndex(65); // same as happy villager
        //this.setParticleTexture(particleTexture);
        particleScale = 0.5F;
        
        setRBGColorF(d, d, d);
        
    }
    
}