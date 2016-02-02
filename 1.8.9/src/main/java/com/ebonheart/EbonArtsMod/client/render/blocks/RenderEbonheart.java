package com.ebonheart.EbonArtsMod.client.render.blocks;

import org.lwjgl.opengl.GL11;

import com.ebonheart.EbonArtsMod.client.render.models.Ebonheart;
import com.ebonheart.EbonArtsMod.common.blocks.models.LadderModel;
import com.ebonheart.EbonArtsMod.references.Reference;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderEbonheart extends TileEntitySpecialRenderer {
	
	public static final ResourceLocation texture = new ResourceLocation(Reference.MOD_ID, "/textures/models/ebonheart_block.png".substring(1));
	
	public Ebonheart model;
	
	public RenderEbonheart()
	{
		this.model = new Ebonheart();
	}
	
	@Override
	public void renderTileEntityAt(TileEntity entity, double posX,
			double posZ, double posY, float f, int i) 
	{
		GL11.glPushMatrix();
		GL11.glTranslatef((float) posX +.5F, (float) posY + 1.5F, (float) posZ +.5F);
		GL11.glRotatef(180f, 0f, 0f, 1f);
		
		this.bindTexture(texture);
		
		GL11.glPushMatrix();
		this.model.renderModel(.0625f);
		
		GL11.glPopMatrix();
		GL11.glPopMatrix();
		
		
	}
	
	public void doRender(Entity entity, double x, double y, double z,
			float size, float light) {
		doRender((Entity) entity, 0D, 0D, 0D, 0f, 0f);
	}

}
