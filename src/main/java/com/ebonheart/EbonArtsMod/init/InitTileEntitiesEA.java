package com.ebonheart.EbonArtsMod.init;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ebonheart.EbonArtsMod.common.tileentities.plants.BlockDragonwoodPlantRoot;
import com.ebonheart.EbonArtsMod.common.tileentities.plants.TileEntityDragonwoodPlant;
import com.ebonheart.EbonArtsMod.common.tileentities.plants.TileEntityDragonwoodPlantRenderer;
import com.ebonheart.EbonArtsMod.references.Reference;



public final class InitTileEntitiesEA {
	
	public static Block Test_Block_Tile_Entity;
	public static Block Dragonwood_Plant;
	
	public static void init() {
		
		//GameRegistry.registerBlock(Test_Block_Tile_Entity = new TestBlockTileEntity("tile_entity"), "tile_entity");
		GameRegistry.registerBlock(Dragonwood_Plant = new BlockDragonwoodPlantRoot(InitItemsEA.dragon_fruit, 3, 1, 5, 2, 2, 12, 10, 30, 40, 100, 5, 10, 3, 1, null), "dragonwoodplant");
		
		
	}

	
	public static void register()
	{
		
		//GameRegistry.registerTileEntity(TestTileEntity.class, "tile_entity");
		GameRegistry.registerTileEntity(TileEntityDragonwoodPlant.class, "dragonwoodplant");
	
	}
	
	
	public static void registerRenders()
	{
		
		//registerRender(Test_Block_Tile_Entity);
		registerRender(Dragonwood_Plant);
		
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
	public static void clientRegisterRenders()
	{
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityDragonwoodPlant.class, new TileEntityDragonwoodPlantRenderer());
    	
	}
}
