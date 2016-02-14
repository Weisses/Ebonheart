package com.ebonheart.EbonArtsMod.client;

import com.ebonheart.EbonArtsMod.client.render.projectile.RenderEbonheart;
import com.ebonheart.EbonArtsMod.common.entity.EntityEbonheart;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;
import com.ebonheart.EbonArtsMod.references.ItemsEA;
import com.ebonheart.EbonArtsMod.references.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public final class InitEntityEARender extends ItemsEA {

	public static void registerRenders()
	{
		
		//new RenderSnowball(this, Items.experience_bottle, itemRendererIn)
		//RenderingRegistry.registerEntityRenderingHandler(EntityEbonheart.class, new RenderEbonheart(Minecraft.getMinecraft().getRenderManager(), null));
		
		//registerRender(ebonheart);
		//registerRender(dragon_fruit);
	}
	
	public static void registerRender()
	{
		//Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
		//Item item = Item.getItemFromBlock(block);
		//Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
		
		
	}
}
