package com.ebonheart.EbonArtsMod.tileentity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBananaPlantAge0 extends ModelBase
{
	ModelRenderer Age0Tier1_1;
    ModelRenderer Age0Tier1_2;
    ModelRenderer Age0Tier1_3;
    ModelRenderer Age0Tier1_4;
    
    public ModelBananaPlantAge0()
    {
    	textureWidth = 8;
        textureHeight = 8;
        
        Age0Tier1_1 = new ModelRenderer(this, 0, 0);
        Age0Tier1_1.addBox(-2F, -8F, 0F, 4, 8, 0);
        Age0Tier1_1.setRotationPoint(0F, 24F, 0F);
        Age0Tier1_1.setTextureSize(8, 8);
        Age0Tier1_1.mirror = true;
        setRotation(Age0Tier1_1, 0F, 1.570796F, 0F);
  	  
        Age0Tier1_2 = new ModelRenderer(this, 0, 0);
        Age0Tier1_2.addBox(-2F, -8F, 0F, 4, 8, 0);
        Age0Tier1_2.setRotationPoint(0F, 24F, 0F);
        Age0Tier1_2.setTextureSize(8, 8);
        Age0Tier1_2.mirror = true;
        setRotation(Age0Tier1_2, 0F, 0F, 0F);
  	  
        Age0Tier1_3 = new ModelRenderer(this, 0, 0);
        Age0Tier1_3.addBox(-2F, -8F, 0F, 4, 8, 0);
        Age0Tier1_3.setRotationPoint(0F, 24F, 0F);
        Age0Tier1_3.setTextureSize(8, 8);
        Age0Tier1_3.mirror = true;
        setRotation(Age0Tier1_3, 0F, 0.7853982F, 0F);
  	  
        Age0Tier1_4 = new ModelRenderer(this, 0, 0);
        Age0Tier1_4.addBox(-2F, -8F, 0F, 4, 8, 0);
        Age0Tier1_4.setRotationPoint(0F, 24F, 0F);
        Age0Tier1_4.setTextureSize(8, 8);
        Age0Tier1_4.mirror = true;
        setRotation(Age0Tier1_4, 0F, -0.7853982F, 0F);
    }
    
    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
      model.rotateAngleX = x;
      model.rotateAngleY = y;
      model.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
    {
      super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }
    
    public void render(Entity entity, int Tier, float f, float f1, float f2, float f3, float f4, float f5)
    {
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Age0Tier1_1.render(0.0625F);
		Age0Tier1_2.render(0.0625F);
		Age0Tier1_3.render(0.0625F);
		Age0Tier1_4.render(0.0625F);			
    }
}
