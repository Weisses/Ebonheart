package com.ebonheart.EbonArtsMod.init;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.Reference;
import com.ebonheart.EbonArtsMod.blocks.BlockArcanite;
import com.ebonheart.EbonArtsMod.blocks.BlockOreEA;
import com.ebonheart.EbonArtsMod.blocks.GeneralModBlocks;
import com.ebonheart.EbonArtsMod.tileentity.BlockBananaPlantRoot;
import com.ebonheart.EbonArtsMod.tileentity.TileEntityBananaPlant;

public class InitTileEntitiesEA {

	public static BlockBananaPlantRoot bananaplant;
	
	public static void init()
	{
		
		bananaplant = new BlockBananaPlantRoot(InitItemsEA.banana, 3, 1, 5, 2, 2, 12, 10, 30, 40, 100, 5, 10, 3, 1, null);
		
		
	}
	
	
	public static void register()
	{
		
		GameRegistry.registerTileEntity(TileEntityBananaPlant.class, "TileEntityBananaPlant");
		
	}
	
	public static void registerRenders()
	{

		bananaplant.RegisterRenderers();
		
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		//Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + "bananaplant", "inventory"));
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
