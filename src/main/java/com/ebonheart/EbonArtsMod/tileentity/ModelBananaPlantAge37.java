package com.ebonheart.EbonArtsMod.tileentity;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelBananaPlantAge37 extends ModelBase
{
	// Age 3-7, Tier 1
    ModelRenderer Age37Tier1_1;
    ModelRenderer Age37Tier1_2;
    
    // Age 3-7, Tier 2
    ModelRenderer Age37Tier2_1;
    ModelRenderer Age37Tier2_2;
    ModelRenderer Age37Tier2_3;
    ModelRenderer Age37Tier2_4;
    
    // Age 3-7, Tier 3
    ModelRenderer Age37Tier3_1;
    ModelRenderer Age37Tier3_2;
    ModelRenderer Age37Tier3_3;
    ModelRenderer Age37Tier3_4;
    ModelRenderer Age37Tier3_5;
    ModelRenderer Age37Tier3_6;
    ModelRenderer Age37Tier3_7;
    ModelRenderer Age37Tier3_8;
    
    // Age 3-7, Tier 4
    ModelRenderer Age37Tier4_1;
    ModelRenderer Age37Tier4_2;
    ModelRenderer Age37Tier4_3;
    ModelRenderer Age37Tier4_4;
    ModelRenderer Age37Tier4_5;
    ModelRenderer Age37Tier4_6;
    ModelRenderer Age37Tier4_7;
    ModelRenderer Age37Tier4_8;
	
	public ModelBananaPlantAge37()
	{
		textureWidth = 96;
		textureHeight = 80;
		
		// Age 3-7, Tier 1
	    Age37Tier1_1 = new ModelRenderer(this, 0, 60);
	    Age37Tier1_1.addBox(-2F, -16F, -2F, 4, 16, 4);
	    Age37Tier1_1.setRotationPoint(0F, 24F, 0F);
	    Age37Tier1_1.setTextureSize(96, 80);
	    Age37Tier1_1.mirror = true;
	    setRotation(Age37Tier1_1, 0F, 0F, 0F);
	    Age37Tier1_2 = new ModelRenderer(this, 19, 64);
	    Age37Tier1_2.addBox(-7F, -16F, 2F, 5, 16, 0);
	    Age37Tier1_2.setRotationPoint(0F, 24F, 0F);
	    Age37Tier1_2.setTextureSize(96, 80);
	    Age37Tier1_2.mirror = true;
	    setRotation(Age37Tier1_2, 0F, 3.141593F, 0F);
	    
	 // Age 3-7, Tier 2
	    Age37Tier2_1 = new ModelRenderer(this, 32, 60);
	    Age37Tier2_1.addBox(-2F, -16F, -2F, 4, 16, 4);
	    Age37Tier2_1.setRotationPoint(0F, 24F, 0F);
	    Age37Tier2_1.setTextureSize(96, 80);
	    Age37Tier2_1.mirror = true;
	    setRotation(Age37Tier2_1, 0F, 0F, 0F);
	    Age37Tier2_2 = new ModelRenderer(this, 67, 48);
	    Age37Tier2_2.addBox(-7F, -16F, -2F, 5, 16, 0);
	    Age37Tier2_2.setRotationPoint(0F, 24F, 0F);
	    Age37Tier2_2.setTextureSize(96, 80);
	    Age37Tier2_2.mirror = true;
	    setRotation(Age37Tier2_2, 0F, 0F, 0F);
	    Age37Tier2_3 = new ModelRenderer(this, 19, 48);
	    Age37Tier2_3.addBox(-7F, -16F, 2F, 5, 16, 0);
	    Age37Tier2_3.setRotationPoint(0F, 24F, 0F);
	    Age37Tier2_3.setTextureSize(96, 80);
	    Age37Tier2_3.mirror = true;
	    setRotation(Age37Tier2_3, 0F, 3.141593F, 0F);
	    Age37Tier2_4 = new ModelRenderer(this, 67, 43);
	    Age37Tier2_4.addBox(2F, -16F, 2F, 0, 16, 5);
	    Age37Tier2_4.setRotationPoint(0F, 24F, 0F);
	    Age37Tier2_4.setTextureSize(96, 80);
	    Age37Tier2_4.mirror = true;
	    setRotation(Age37Tier2_4, 0F, 0F, 0F);
	    
	 // Age 3-7, Tier 3
	    Age37Tier3_1 = new ModelRenderer(this, 48, 60);
	    Age37Tier3_1.addBox(-2F, -16F, -2F, 4, 16, 4);
	    Age37Tier3_1.setRotationPoint(0F, 24F, 0F);
	    Age37Tier3_1.setTextureSize(96, 80);
	    Age37Tier3_1.mirror = true;
	    setRotation(Age37Tier3_1, 0F, 0F, 0F);
	    Age37Tier3_2 = new ModelRenderer(this, 67, 32);
	    Age37Tier3_2.addBox(-7F, -16F, -2F, 5, 16, 0);
	    Age37Tier3_2.setRotationPoint(0F, 24F, 0F);
	    Age37Tier3_2.setTextureSize(96, 80);
	    Age37Tier3_2.mirror = true;
	    setRotation(Age37Tier3_2, 0F, 0F, 0F);
	    Age37Tier3_3 = new ModelRenderer(this, 19, 32);
	    Age37Tier3_3.addBox(-7F, -16F, 2F, 5, 16, 0);
	    Age37Tier3_3.setRotationPoint(0F, 24F, 0F);
	    Age37Tier3_3.setTextureSize(96, 80);
	    Age37Tier3_3.mirror = true;
	    setRotation(Age37Tier3_3, 0F, 3.141593F, 0F);
	    Age37Tier3_4 = new ModelRenderer(this, 67, 27);
	    Age37Tier3_4.addBox(2F, -16F, 2F, 0, 16, 5);
	    Age37Tier3_4.setRotationPoint(0F, 24F, 0F);
	    Age37Tier3_4.setTextureSize(96, 80);
	    Age37Tier3_4.mirror = true;
	    setRotation(Age37Tier3_4, 0F, 0F, 0F);
	    Age37Tier3_5 = new ModelRenderer(this, 32, 16);
	    Age37Tier3_5.addBox(2F, -16F, -8F, 0, 16, 16);
	    Age37Tier3_5.setRotationPoint(0F, 24F, 0F);
	    Age37Tier3_5.setTextureSize(96, 80);
	    Age37Tier3_5.mirror = true;
	    setRotation(Age37Tier3_5, 0F, 0.7853982F, 0F);
	    Age37Tier3_6 = new ModelRenderer(this, 32, 16);
	    Age37Tier3_6.addBox(2F, -16F, -8F, 0, 16, 16);
	    Age37Tier3_6.setRotationPoint(0F, 24F, 0F);
	    Age37Tier3_6.setTextureSize(96, 80);
	    Age37Tier3_6.mirror = true;
	    setRotation(Age37Tier3_6, 0F, -0.7853982F, 0F);
	    Age37Tier3_7 = new ModelRenderer(this, 32, 16);
	    Age37Tier3_7.addBox(-2F, -16F, -8F, 0, 16, 16);
	    Age37Tier3_7.setRotationPoint(0F, 24F, 0F);
	    Age37Tier3_7.setTextureSize(96, 80);
	    Age37Tier3_7.mirror = true;
	    setRotation(Age37Tier3_7, 0F, -0.7853982F, 0F);
	    Age37Tier3_8 = new ModelRenderer(this, 32, 16);
	    Age37Tier3_8.addBox(-2F, -16F, -8F, 0, 16, 16);
	    Age37Tier3_8.setRotationPoint(0F, 24F, 0F);
	    Age37Tier3_8.setTextureSize(96, 80);
	    Age37Tier3_8.mirror = true;
	    setRotation(Age37Tier3_8, 0F, 0.7853982F, 0F);
	    
	 // Age 3-7, Tier 4
	    Age37Tier4_1 = new ModelRenderer(this, 0, -48);
	    Age37Tier4_1.addBox(-2F, -32F, -24F, 0, 32, 48);
	    Age37Tier4_1.setRotationPoint(0F, 24F, 0F);
	    Age37Tier4_1.setTextureSize(96, 80);
	    Age37Tier4_1.mirror = true;
	    setRotation(Age37Tier4_1, 0F, 0F, 0F);
	    Age37Tier4_2 = new ModelRenderer(this, 0, 0);
	    Age37Tier4_2.addBox(-24F, -32F, 2F, 48, 32, 0);
	    Age37Tier4_2.setRotationPoint(0F, 24F, 0F);
	    Age37Tier4_2.setTextureSize(96, 80);
	    Age37Tier4_2.mirror = true;
	    setRotation(Age37Tier4_2, 0F, 0F, 0F);
	    Age37Tier4_3 = new ModelRenderer(this, 0, -48);
	    Age37Tier4_3.addBox(-2F, -32F, -24F, 0, 32, 48);
	    Age37Tier4_3.setRotationPoint(0F, 24F, 0F);
	    Age37Tier4_3.setTextureSize(96, 80);
	    Age37Tier4_3.mirror = true;
	    setRotation(Age37Tier4_3, 0F, 3.141593F, 0F);
	    Age37Tier4_4 = new ModelRenderer(this, 0, 0);
	    Age37Tier4_4.addBox(-24F, -32F, 2F, 48, 32, 0);
	    Age37Tier4_4.setRotationPoint(0F, 24F, 0F);
	    Age37Tier4_4.setTextureSize(96, 80);
	    Age37Tier4_4.mirror = true;
	    setRotation(Age37Tier4_4, 0F, 3.141593F, 0F);
	    Age37Tier4_5 = new ModelRenderer(this, 0, 0);
	    Age37Tier4_5.addBox(-24F, -32F, 2F, 48, 32, 0);
	    Age37Tier4_5.setRotationPoint(0F, 24F, 0F);
	    Age37Tier4_5.setTextureSize(96, 80);
	    Age37Tier4_5.mirror = true;
	    setRotation(Age37Tier4_5, 0F, -2.356194F, 0F);
	    Age37Tier4_6 = new ModelRenderer(this, 0, 0);
	    Age37Tier4_6.addBox(-24F, -32F, 2F, 48, 32, 0);
	    Age37Tier4_6.setRotationPoint(0F, 24F, 0F);
	    Age37Tier4_6.setTextureSize(96, 80);
	    Age37Tier4_6.mirror = true;
	    setRotation(Age37Tier4_6, 0F, 0.7853982F, 0F);
	    Age37Tier4_7 = new ModelRenderer(this, 0, -48);
	    Age37Tier4_7.addBox(-2F, -32F, -24F, 0, 32, 48);
	    Age37Tier4_7.setRotationPoint(0F, 24F, 0F);
	    Age37Tier4_7.setTextureSize(96, 80);
	    Age37Tier4_7.mirror = true;
	    setRotation(Age37Tier4_7, 0F, 0.7853982F, 0F);
	    Age37Tier4_8 = new ModelRenderer(this, 0, -48);
	    Age37Tier4_8.addBox(-2F, -32F, -24F, 0, 32, 48);
	    Age37Tier4_8.setRotationPoint(0F, 24F, 0F);
	    Age37Tier4_8.setTextureSize(96, 80);
	    Age37Tier4_8.mirror = true;
	    setRotation(Age37Tier4_8, 0F, -2.356194F, 0F);
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
		    Age37Tier1_1.render(0.0625F);
		    Age37Tier1_2.render(0.0625F);
		}
		else if(Tier == 2)
		{
		    Age37Tier2_1.render(0.0625F);
		    Age37Tier2_2.render(0.0625F);
		    Age37Tier2_3.render(0.0625F);
		    Age37Tier2_4.render(0.0625F);
		}
		else if(Tier == 3)
		{
		    Age37Tier3_1.render(0.0625F);
		    Age37Tier3_2.render(0.0625F);
		    Age37Tier3_3.render(0.0625F);
		    Age37Tier3_4.render(0.0625F);
		    Age37Tier3_5.render(0.0625F);
		    Age37Tier3_6.render(0.0625F);
		    Age37Tier3_7.render(0.0625F);
		    Age37Tier3_8.render(0.0625F);
		}
		else if(Tier == 4)
		{			    
		    Age37Tier4_1.render(0.0625F);
		    Age37Tier4_2.render(0.0625F);
		    Age37Tier4_3.render(0.0625F);
		    Age37Tier4_4.render(0.0625F);
		    Age37Tier4_5.render(0.0625F);
		    Age37Tier4_6.render(0.0625F);
		    Age37Tier4_7.render(0.0625F);
		    Age37Tier4_8.render(0.0625F);
		}
    }
}

































