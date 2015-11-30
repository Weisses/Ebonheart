package com.ebonheart.EbonArtsMod.tileentity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBananaPlantAge2 extends ModelBase
{
	// Age 2, Tier 1
    ModelRenderer Age2Tier1_1;
	
    // Age 2, Tier 2
    ModelRenderer Age2Tier2_1;
    
    // Age 2, Tier 3
    ModelRenderer Age2Tier3_1;
    ModelRenderer Age2Tier3_2;
    ModelRenderer Age2Tier3_3;
    ModelRenderer Age2Tier3_4;
    
    // Age 2, Tier 4
    ModelRenderer Age2Tier4_1;
    ModelRenderer Age2Tier4_2;
    ModelRenderer Age2Tier4_3;
    ModelRenderer Age2Tier4_4;
    ModelRenderer Age2Tier4_5;
    ModelRenderer Age2Tier4_6;	
	
	public ModelBananaPlantAge2()
	{
		textureWidth = 32;
		textureHeight = 64;
		
		// Age 2, Tier 1
	    Age2Tier1_1 = new ModelRenderer(this, 0, 44);
	    Age2Tier1_1.addBox(-2F, -16F, -2F, 4, 16, 4);
	    Age2Tier1_1.setRotationPoint(0F, 24F, 0F);
	    Age2Tier1_1.setTextureSize(32, 64);
	    Age2Tier1_1.mirror = true;
	    setRotation(Age2Tier1_1, 0F, 0F, 0F);
	    
	    // Age 2, Tier 2
	    Age2Tier2_1 = new ModelRenderer(this, 16, 44);
	    Age2Tier2_1.addBox(-2F, -16F, -2F, 4, 16, 4);
	    Age2Tier2_1.setRotationPoint(0F, 24F, 0F);
	    Age2Tier2_1.setTextureSize(32, 64);
	    Age2Tier2_1.mirror = true;
	    setRotation(Age2Tier2_1, 0F, 0F, 0F);
	    
	    // Age 2, Tier 3
	    Age2Tier3_1 = new ModelRenderer(this, 0, 16);
	    Age2Tier3_1.addBox(-8F, -16F, -2F, 16, 16, 0);
	    Age2Tier3_1.setRotationPoint(0F, 24F, 0F);
	    Age2Tier3_1.setTextureSize(32, 64);
	    Age2Tier3_1.mirror = true;
	    setRotation(Age2Tier3_1, 0F, 0F, 0F);
	    Age2Tier3_2 = new ModelRenderer(this, 0, 0);
	    Age2Tier3_2.addBox(2F, -16F, -8F, 0, 16, 16);
	    Age2Tier3_2.setRotationPoint(0F, 24F, 0F);
	    Age2Tier3_2.setTextureSize(32, 64);
	    Age2Tier3_2.mirror = true;
	    setRotation(Age2Tier3_2, 0F, 0F, 0F);
	    Age2Tier3_3 = new ModelRenderer(this, 0, 16);
	    Age2Tier3_3.addBox(-8F, -16F, -2F, 16, 16, 0);
	    Age2Tier3_3.setRotationPoint(0F, 24F, 0F);
	    Age2Tier3_3.setTextureSize(32, 64);
	    Age2Tier3_3.mirror = true;
	    setRotation(Age2Tier3_3, 0F, 3.141593F, 0F);
	    Age2Tier3_4 = new ModelRenderer(this, 0, 0);
	    Age2Tier3_4.addBox(2F, -16F, -8F, 0, 16, 16);
	    Age2Tier3_4.setRotationPoint(0F, 24F, 0F);
	    Age2Tier3_4.setTextureSize(32, 64);
	    Age2Tier3_4.mirror = true;
	    setRotation(Age2Tier3_4, 0F, 3.141593F, 0F);
	    
	    // Age 2, Tier 4
	    Age2Tier4_1 = new ModelRenderer(this, 0, -16);
	    Age2Tier4_1.addBox(-2F, -16F, -8F, 0, 16, 16);
	    Age2Tier4_1.setRotationPoint(0F, 24F, 0F);
	    Age2Tier4_1.setTextureSize(32, 64);
	    Age2Tier4_1.mirror = true;
	    setRotation(Age2Tier4_1, 0F, 0F, 0F);
	    Age2Tier4_2 = new ModelRenderer(this, 0, -16);
	    Age2Tier4_2.addBox(-2F, -16F, -8F, 0, 16, 16);
	    Age2Tier4_2.setRotationPoint(0F, 24F, 0F);
	    Age2Tier4_2.setTextureSize(32, 64);
	    Age2Tier4_2.mirror = true;
	    setRotation(Age2Tier4_2, 0F, 3.141593F, 0F);
	    Age2Tier4_3 = new ModelRenderer(this, 0, -16);
	    Age2Tier4_3.addBox(-2F, -16F, -8F, 0, 16, 16);
	    Age2Tier4_3.setRotationPoint(0F, 24F, 0F);
	    Age2Tier4_3.setTextureSize(32, 64);
	    Age2Tier4_3.mirror = true;
	    setRotation(Age2Tier4_3, 0F, 1.570796F, 0F);
	    Age2Tier4_4 = new ModelRenderer(this, 0, -16);
	    Age2Tier4_4.addBox(-2F, -16F, -8F, 0, 16, 16);
	    Age2Tier4_4.setRotationPoint(0F, 24F, 0F);
	    Age2Tier4_4.setTextureSize(32, 64);
	    Age2Tier4_4.mirror = true;
	    setRotation(Age2Tier4_4, 0F, -1.570796F, 0F);
	    Age2Tier4_5 = new ModelRenderer(this, 0, -16);
	    Age2Tier4_5.addBox(0F, -16F, -8F, 0, 16, 16);
	    Age2Tier4_5.setRotationPoint(0F, 24F, 0F);
	    Age2Tier4_5.setTextureSize(32, 64);
	    Age2Tier4_5.mirror = true;
	    setRotation(Age2Tier4_5, 0F, -0.7853982F, 0F);
	    Age2Tier4_6 = new ModelRenderer(this, 0, -16);
	    Age2Tier4_6.addBox(0F, -16F, -8F, 0, 16, 16);
	    Age2Tier4_6.setRotationPoint(0F, 24F, 0F);
	    Age2Tier4_6.setTextureSize(32, 64);
	    Age2Tier4_6.mirror = true;
	    setRotation(Age2Tier4_6, 0F, 0.7853982F, 0F);
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
	
		if(Tier == 1)
		{
		    Age2Tier1_1.render(0.0625F);
		}
		else if(Tier == 2)
		{
		    Age2Tier2_1.render(0.0625F);
		}
		else if(Tier == 3)
		{
		    Age2Tier3_1.render(0.0625F);
		    Age2Tier3_2.render(0.0625F);
		    Age2Tier3_3.render(0.0625F);
		    Age2Tier3_4.render(0.0625F);
		}
		else if(Tier == 4)
		{			    
		    Age2Tier4_1.render(0.0625F);
		    Age2Tier4_2.render(0.0625F);
		    Age2Tier4_3.render(0.0625F);
		    Age2Tier4_4.render(0.0625F);
		    Age2Tier4_5.render(0.0625F);
		    Age2Tier4_6.render(0.0625F);
		}	
    }
}
























