package com.ebonheart.EbonArtsMod.client.entity;

import com.ebonheart.EbonArtsMod.api.helper.LogHelper;
import com.ebonheart.EbonArtsMod.references.Reference;

import net.minecraft.client.particle.EntityAuraFX;
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
public class EntityUnholyFX extends EntityFlameFX
{
    

    public EntityUnholyFX(World parWorld,
            double parX, double parY, double parZ,
            double parMotionX, double parMotionY, double parMotionZ) 
    {
        super(parWorld, parX, parY, parZ, parMotionX, parMotionY, parMotionZ);
        //ResourceLocation test = new ResourceLocation(Reference.MOD_ID + ":particles/test.png");
        setParticleTextureIndex(65); // same as happy villager
        //this.setParticleTexture(particleTexture);
        particleScale = 2.0F;
        setRBGColorF(0, 25, 0);
    }
    
    
    
    //@Override
	public ResourceLocation getFXResource() 
	{
		
		ResourceLocation location = new ResourceLocation(Reference.MOD_ID + ":" + "particles/test.png");
		
		LogHelper.info("Location - " + location);
		
		return location;
	}
    
}