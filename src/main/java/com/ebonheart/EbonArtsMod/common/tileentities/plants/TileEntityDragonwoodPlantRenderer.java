package com.ebonheart.EbonArtsMod.common.tileentities.plants;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class TileEntityDragonwoodPlantRenderer extends TileEntitySpecialRenderer
{
	private final ModelDragonwoodPlantAge0 Age0_model;
    private final ModelDragonwoodPlantAge1 Age1_model;
    private final ModelDragonwoodPlantAge2 Age2_model;
    private final ModelDragonwoodPlantAge37 Age37_model;
	
	
	public TileEntityDragonwoodPlantRenderer()
	{
		this.Age0_model = new ModelDragonwoodPlantAge0();
        this.Age1_model = new ModelDragonwoodPlantAge1();
        this.Age2_model = new ModelDragonwoodPlantAge2();
        this.Age37_model = new ModelDragonwoodPlantAge37();
	}
	
	public void renderNow(TileEntityDragonwoodPlant te, double x, double y, double z)
    {
		this.bindTexture(new ResourceLocation("ea:textures/blocks/dragonwoodplant_"+ te.getAge() +".png")); 
		
		GlStateManager.pushMatrix();
		GlStateManager.translate((float)x + 0.5F, (float)y + 1.5F, (float)z + 0.5F);				
        GlStateManager.rotate(180F, 0.0F, 0.0F, 1.0F);
		
        if(te.getTier() == 1)
    	{
        	if(te.getAge() == 0)
           	{
        		this.Age0_model.render((Entity)null, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0f);
           	}
           	else if(te.getAge() == 1)
			{
           		this.Age1_model.render((Entity)null, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0f);
			}
			else if(te.getAge() == 2)
			{
				this.Age2_model.render((Entity)null, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0f);
			}
			else
			{
				this.Age37_model.render((Entity)null, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0f);
			}
    	}
    	else
    	{
    		if(te.getAge() == 1)
			{
    			this.Age1_model.render((Entity)null, te.getTier(), 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
			}
			else if(te.getAge() == 2)
			{
				this.Age2_model.render((Entity)null, te.getTier(), 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
			}
			else
			{
				this.Age37_model.render((Entity)null, te.getTier(), 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
			}
    	}        
        GlStateManager.popMatrix();
    }
	
	
	public void renderTileEntityAt(TileEntity te, double posX, double posY, double posZ, float p_180535_8_, int p_180535_9_)
    {
		if(te instanceof TileEntityDragonwoodPlant)
    	{
			this.renderNow((TileEntityDragonwoodPlant)te, posX, posY, posZ);
    	}
    }
}
