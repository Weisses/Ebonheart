package com.ebonheart.EbonArtsMod.tileentity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBananaPlantAge1 extends ModelBase
{
	// Age 1, Tier 1
	ModelRenderer Age1Tier1_1;
    
    // Age 1, Tier 2
    ModelRenderer Age1Tier2_1;
    ModelRenderer Age1Tier2_2;
    ModelRenderer Age1Tier2_3;
    ModelRenderer Age1Tier2_4;
	    
	public ModelBananaPlantAge1()
	{
		textureWidth = 32;
	    textureHeight = 32;
	    
	 // Age 1, Tier 1
	    Age1Tier1_1 = new ModelRenderer(this, 12, 14);
	    Age1Tier1_1.addBox(-1F, -16F, -1F, 2, 16, 2);
	    Age1Tier1_1.setRotationPoint(0F, 24F, 0F);
	    Age1Tier1_1.setTextureSize(32, 32);
	    Age1Tier1_1.mirror = true;
	    setRotation(Age1Tier1_1, 0F, 0F, 0F);
		
	    // Age 1, Tier 2	    
	    Age1Tier2_1 = new ModelRenderer(this, 0, -16);
	    Age1Tier2_1.addBox(-1F, -16F, -8F, 0, 16, 16);
	    Age1Tier2_1.setRotationPoint(0F, 24F, 0F);
	    Age1Tier2_1.setTextureSize(32, 32);
	    Age1Tier2_1.mirror = true;
	    setRotation(Age1Tier2_1, 0F, 0F, 0F);
	    Age1Tier2_2 = new ModelRenderer(this, 0, 0);
	    Age1Tier2_2.addBox(-8F, -16F, 1F, 16, 16, 0);
	    Age1Tier2_2.setRotationPoint(0F, 24F, 0F);
	    Age1Tier2_2.setTextureSize(32, 32);
	    Age1Tier2_2.mirror = true;
	    setRotation(Age1Tier2_2, 0F, 0F, 0F);
	    Age1Tier2_3 = new ModelRenderer(this, 0, 0);
	    Age1Tier2_3.addBox(-8F, -16F, -1F, 16, 16, 0);
	    Age1Tier2_3.setRotationPoint(0F, 24F, 0F);
	    Age1Tier2_3.setTextureSize(32, 32);
	    Age1Tier2_3.mirror = true;
	    setRotation(Age1Tier2_3, 0F, 0F, 0F);
	    Age1Tier2_4 = new ModelRenderer(this, 0, -16);
	    Age1Tier2_4.addBox(1F, -16F, -8F, 0, 16, 16);
	    Age1Tier2_4.setRotationPoint(0F, 24F, 0F);
	    Age1Tier2_4.setTextureSize(32, 32);
	    Age1Tier2_4.mirror = true;
	    setRotation(Age1Tier2_4, 0F, 0F, 0F);	    
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
			Age1Tier1_1.render(0.0625F);
		}
		else if(Tier == 2)
		{
		    Age1Tier2_1.render(0.0625F);
		    Age1Tier2_2.render(0.0625F);
		    Age1Tier2_3.render(0.0625F);
		    Age1Tier2_4.render(0.0625F);
		}	
    }
}
