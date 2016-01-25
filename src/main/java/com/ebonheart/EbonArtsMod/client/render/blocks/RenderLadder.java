package com.ebonheart.EbonArtsMod.client.render.blocks;

import org.lwjgl.opengl.GL11;

import com.ebonheart.EbonArtsMod.common.blocks.models.LadderModel;
import com.ebonheart.EbonArtsMod.references.Reference;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderLadder extends TileEntitySpecialRenderer {
	
	public static final ResourceLocation texture = new ResourceLocation(Reference.MOD_ID, "/textures/models/testmodel.png".substring(1));
	
	public LadderModel model;
	
	public RenderLadder()
	{
		this.model = new LadderModel();
	}
	
	@Override
	public void renderTileEntityAt(TileEntity p_180535_1_, double posX,
			double posZ, double posY, float f, int p_180535_9_) 
	{
		GL11.glPushMatrix();
		GL11.glTranslatef((float) posX +.5F, (float) posY + 1.5F, (float) posZ +.5F);
		GL11.glRotatef(180f, 0f, 0f, 1f);
		
		this.bindTexture(texture);
		
		GL11.glPushMatrix();
		this.model.modelRender(.0625f);
		
		GL11.glPopMatrix();
		GL11.glPopMatrix();
		
		
	}

}
