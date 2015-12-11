package com.ebonheart.EbonArtsMod.init;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ebonheart.EbonArtsMod.Reference;
import com.ebonheart.EbonArtsMod.common.blocks.BlockStainedBrickSlab;
import com.ebonheart.EbonArtsMod.common.tileentities.TestBlockTileEntity;
import com.ebonheart.EbonArtsMod.common.tileentities.TestTileEntity;
import com.ebonheart.EbonArtsMod.common.tileentities.plants.BlockBananaPlantRoot;
import com.ebonheart.EbonArtsMod.common.tileentities.plants.TileEntityBananaPlant;
import com.ebonheart.EbonArtsMod.common.tileentities.plants.TileEntityBananaPlantRenderer;



public final class InitTileEntitiesEA {
	
	public static Block Test_Block_Tile_Entity;
	public static Block Banana_Plant;
	public static Block Test_slab;
	
	public static void init() {
		
		GameRegistry.registerBlock(Test_Block_Tile_Entity = new TestBlockTileEntity("tile_entity"), "tile_entity");
		GameRegistry.registerBlock(Banana_Plant = new BlockBananaPlantRoot(InitItemsEA.banana, 3, 1, 5, 2, 2, 12, 10, 30, 40, 100, 5, 10, 3, 1, null), "bananaplant");
		//Banana_Plant = new BlockBananaPlantRoot(InitItemsEA.banana, 3, 1, 5, 2, 2, 12, 10, 30, 40, 100, 5, 10, 3, 1, null);
		
		//GameRegistry.registerBlock(Test_slab = new BlockStainedBrickSlab(), "Test_slab");
		
	}

	
	public static void register()
	{
		
		GameRegistry.registerTileEntity(TestTileEntity.class, "tile_entity");
		GameRegistry.registerTileEntity(TileEntityBananaPlant.class, "bananaplant");
	
		//GameRegistry.registerTileEntity(BlockStainedBrickSlab.class, "Test_slab");
	}
	
	
	public static void registerRenders()
	{
		
		registerRender(Test_Block_Tile_Entity);
		registerRender(Banana_Plant);
		
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
	public static void clientRegisterRenders()
	{
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityBananaPlant.class, new TileEntityBananaPlantRenderer());
    	
	}
}
