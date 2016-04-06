package com.ebonheart.EbonArtsMod.client;

import java.util.HashSet;
import java.util.Set;

import com.ebonheart.EbonArtsMod.init.InitItemsEA;
import com.ebonheart.EbonArtsMod.references.ItemsEA;
import com.ebonheart.EbonArtsMod.references.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
//import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public final class InitItemsEARender extends ItemsEA {
	
	public static void registerRenders()
	{
		registerRender(draconium_dust);
		registerRender(velious);
		registerRender(arcanite);
		registerRender(katcheen);
		registerRender(necrocite);
		registerRender(soularite);
		registerRender(ebonheart);
		
		registerRender(enchanted_ebonheart);
		
		registerRender(empowered_blade);
		
		registerRender(glowing_disc);
		registerRender(shimmering_disc);
		registerRender(laminate_disc);
		registerRender(resilient_disc);
		registerRender(dismal_disc);
		registerRender(ethereal_disc);
		
		//registerRender(chrono_disc);
		
		registerRender(mirroring_disc);
		
		registerRender(arcanite_pickaxe);
		registerRender(arcanite_axe);
		registerRender(arcanite_shovel);
		registerRender(arcanite_hoe);
		registerRender(arcanite_sword);
		registerRender(arcanite_helmet);
		registerRender(arcanite_chestplate);
		registerRender(arcanite_leggings);
		registerRender(arcanite_boots);
		
		registerRender(katcheen_pickaxe);
		registerRender(katcheen_axe);
		registerRender(katcheen_shovel);
		registerRender(katcheen_hoe);
		registerRender(katcheen_sword);
		registerRender(katcheen_helmet);
		registerRender(katcheen_chestplate);
		registerRender(katcheen_leggings);
		registerRender(katcheen_boots);
		
		
		registerRender(deception);
		registerRender(frostbite);
		registerRender(massacre);
		registerRender(blazefury);
		registerRender(despair);
		registerRender(souleater);
		
		//registerRender(test_shield);
		
		registerRender(obsidian_shards);
		registerRender(glowstone_shards);
		
		//registerRender(omniplex);
		//registerRender(banana);
		registerRender(dragon_fruit);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation
				(//Reference.MOD_ID + ":" + 
						item
						//.getRegistryName()
						.getRegistryName().toString()
						//.getUnlocalizedName().substring(5)
						, "inventory"));
	}
	/**
	//==========================================================
	
	private final static Set<Item> itemsRegistered = new HashSet<>();
	
	private static void registerItemModels() 
	{
		// Register items with custom model names first
		//registerItemModel(ModItems.snowballLauncher, "minecraft:fishing_rod");
		
		
		// Then register items with default model names
		InitItemsEA.
		//ModItems.
		items.stream().filter(item -> !itemsRegistered.contains(item)).forEach(this::registerItemModel);
	}
		
		
	
	
	private void registerItemModel(Item item) {
		registerItemModel(item, item.getRegistryName().toString());
	}

	private void registerItemModel(Item item, String modelLocation) {
		final ModelResourceLocation fullModelLocation = new ModelResourceLocation(modelLocation, "inventory");
		registerItemModel(item, fullModelLocation);
	}

	private void registerItemModel(Item item, ModelResourceLocation fullModelLocation) {
		ModelBakery.registerItemVariants(item, fullModelLocation); // Ensure the custom model is loaded and prevent the default model from being loaded
		registerItemModel(item, MeshDefinitionFix.create(stack -> fullModelLocation));
	}

	private void registerItemModel(Item item, ItemMeshDefinition meshDefinition) {
		itemsRegistered.add(item);
		ModelLoader.setCustomMeshDefinition(item, meshDefinition);
	}

	private void registerItemModelForMeta(Item item, int metadata, String variant) {
		registerItemModelForMeta(item, metadata, new ModelResourceLocation(item.getRegistryName(), variant));
	}

	private void registerItemModelForMeta(Item item, int metadata, ModelResourceLocation modelResourceLocation) {
		itemsRegistered.add(item);
		ModelLoader.setCustomModelResourceLocation(item, metadata, modelResourceLocation);
	}
	**/
}
