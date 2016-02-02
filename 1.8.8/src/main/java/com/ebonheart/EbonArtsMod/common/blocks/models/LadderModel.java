package com.ebonheart.EbonArtsMod.common.blocks.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class LadderModel extends ModelBase
{
  //fields
    ModelRenderer VLadder1;
    ModelRenderer VLadder2;
  
  public LadderModel()
  {
    textureWidth = 16;
    textureHeight = 16;
    
      VLadder1 = new ModelRenderer(this, 0, -1);
      VLadder1.addBox(0F, 0F, 0F, 2, 16, 1);
      VLadder1.setRotationPoint(-7F, 8F, 6F);
      VLadder1.setTextureSize(16, 16);
      VLadder1.mirror = true;
      setRotation(VLadder1, 0F, 0F, 0F);
      VLadder2 = new ModelRenderer(this, 10, -1);
      VLadder2.addBox(0F, 0F, 0F, 2, 16, 1);
      VLadder2.setRotationPoint(5F, 8F, 6F);
      VLadder2.setTextureSize(16, 16);
      VLadder2.mirror = true;
      setRotation(VLadder2, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    VLadder1.render(f5);
    VLadder2.render(f5);
  }
  
  public void modelRender(float f5)
  {
	  VLadder1.render(f5);
	  VLadder2.render(f5);
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

}
