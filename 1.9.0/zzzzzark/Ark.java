package com.ebonheart.EbonArtsMod.zzztest;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Archived Code
 */

public class Ark {
	
	
	
//EventHandler
    	/**	
        if (boots.getItem() == Items.iron_boots //SlurpiesDonglesItems.topaz_boots 
            && chestplate.getItem() == Items.iron_chestplate //SlurpiesDonglesItems.topaz_chestplate 
            && leggings.getItem() == Items.iron_leggings //SlurpiesDonglesItems.topaz_leggings 
            && helmet.getItem() == Items.iron_helmet //SlurpiesDonglesItems.topaz_helmet
            ) {
                allowFlying = true;
            } }
        if (allowFlying) {
            event.player.capabilities.allowFlying = true;
            event.player.fallDistance = 0.0F;
        } else if (flytime == 0 && !event.player.capabilities.isCreativeMode){
            event.player.capabilities.isFlying = false;
            event.player.capabilities.allowFlying = false;
        }
    }
 
}

*/

	
	
//EntitySprintFX
	/**
	 * 

    //ResourceLocation test = new ResourceLocation(Reference.MOD_ID + ":particles/test.png");
    //setParticleTextureIndex(65); // same as happy villager
    //this.setParticleTexture(particleTexture);
    //particleScale = 2.0F;
   	 */ 
	
	
	
//InitBlocksEARender

/**
public static void preInit() 
{
	
	ModelBakery.registerItemVariants(Item.getItemFromBlock(InitBlocksEA.cobble_mystic_block), 
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/cobblestone/cobble_mystic_block_white"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/cobblestone/cobble_mystic_block_orange"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/cobblestone/cobble_mystic_block_magenta"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/cobblestone/cobble_mystic_block_lightblue"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/cobblestone/cobble_mystic_block_yellow"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/cobblestone/cobble_mystic_block_lime"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/cobblestone/cobble_mystic_block_pink"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/cobblestone/cobble_mystic_block_gray"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/cobblestone/cobble_mystic_block_lightgray"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/cobblestone/cobble_mystic_block_cyan"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/cobblestone/cobble_mystic_block_purple"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/cobblestone/cobble_mystic_block_blue"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/cobblestone/cobble_mystic_block_brown"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/cobblestone/cobble_mystic_block_green"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/cobblestone/cobble_mystic_block_red"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/cobblestone/cobble_mystic_block_black"));
			
	
	ModelBakery.registerItemVariants(Item.getItemFromBlock(InitBlocksEA.mystic_block), 
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/stone/mystic_block_white"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/stone/mystic_block_orange"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/stone/mystic_block_magenta"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/stone/mystic_block_lightblue"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/stone/mystic_block_yellow"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/stone/mystic_block_lime"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/stone/mystic_block_pink"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/stone/mystic_block_gray"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/stone/mystic_block_lightgray"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/stone/mystic_block_cyan"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/stone/mystic_block_purple"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/stone/mystic_block_blue"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/stone/mystic_block_brown"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/stone/mystic_block_green"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/stone/mystic_block_red"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/stone/mystic_block_black"));
			
	/**
	ModelBakery.registerItemVariants(Item.getItemFromBlock(InitBlocksEA.wood_mystic_block), 
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/wood/wood_mystic_block_white"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/wood/wood_mystic_block_orange"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/wood/wood_mystic_block_magenta"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/wood/wood_mystic_block_lightblue"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/wood/wood_mystic_block_yellow"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/wood/wood_mystic_block_lime"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/wood/wood_mystic_block_pink"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/wood/wood_mystic_block_gray"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/wood/wood_mystic_block_lightgray"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/wood/wood_mystic_block_cyan"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/wood/wood_mystic_block_purple"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/wood/wood_mystic_block_blue"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/wood/wood_mystic_block_brown"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/wood/wood_mystic_block_green"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/wood/wood_mystic_block_red"),
			new ResourceLocation(Reference.MOD_ID + ":gem/mystic/wood/wood_mystic_block_black"));
			
	
}



//registerRender(cobble_mystic_block_normal);

registerRender(cobble_mystic_block);
registerRender(InitBlocksEA.cobble_mystic_block, 0, "gem/mystic/cobblestone/cobble_mystic_block_white");
registerRender(InitBlocksEA.cobble_mystic_block, 1, "gem/mystic/cobblestone/cobble_mystic_block_orange");
registerRender(InitBlocksEA.cobble_mystic_block, 2, "gem/mystic/cobblestone/cobble_mystic_block_magenta");
registerRender(InitBlocksEA.cobble_mystic_block, 3, "gem/mystic/cobblestone/cobble_mystic_block_lightblue");
registerRender(InitBlocksEA.cobble_mystic_block, 4, "gem/mystic/cobblestone/cobble_mystic_block_yellow");
registerRender(InitBlocksEA.cobble_mystic_block, 5, "gem/mystic/cobblestone/cobble_mystic_block_lime");
registerRender(InitBlocksEA.cobble_mystic_block, 6, "gem/mystic/cobblestone/cobble_mystic_block_pink");
registerRender(InitBlocksEA.cobble_mystic_block, 7, "gem/mystic/cobblestone/cobble_mystic_block_gray");
registerRender(InitBlocksEA.cobble_mystic_block, 8, "gem/mystic/cobblestone/cobble_mystic_block_lightgray");
registerRender(InitBlocksEA.cobble_mystic_block, 9, "gem/mystic/cobblestone/cobble_mystic_block_cyan");
registerRender(InitBlocksEA.cobble_mystic_block, 10, "gem/mystic/cobblestone/cobble_mystic_block_purple");
registerRender(InitBlocksEA.cobble_mystic_block, 11, "gem/mystic/cobblestone/cobble_mystic_block_blue");
registerRender(InitBlocksEA.cobble_mystic_block, 12, "gem/mystic/cobblestone/cobble_mystic_block_brown");
registerRender(InitBlocksEA.cobble_mystic_block, 13, "gem/mystic/cobblestone/cobble_mystic_block_green");
registerRender(InitBlocksEA.cobble_mystic_block, 14, "gem/mystic/cobblestone/cobble_mystic_block_red");
registerRender(InitBlocksEA.cobble_mystic_block, 15, "gem/mystic/cobblestone/cobble_mystic_block_black");
		
registerRender(mystic_block_normal);
		registerRender(mystic_block);
registerRender(InitBlocksEA.mystic_block, 0, "gem/mystic/stone/mystic_block_white");
registerRender(InitBlocksEA.mystic_block, 1, "gem/mystic/stone/mystic_block_orange");
registerRender(InitBlocksEA.mystic_block, 2, "gem/mystic/stone/mystic_block_magenta");
registerRender(InitBlocksEA.mystic_block, 3, "gem/mystic/stone/mystic_block_lightblue");
registerRender(InitBlocksEA.mystic_block, 4, "gem/mystic/stone/mystic_block_yellow");
registerRender(InitBlocksEA.mystic_block, 5, "gem/mystic/stone/mystic_block_lime");
registerRender(InitBlocksEA.mystic_block, 6, "gem/mystic/stone/mystic_block_pink");
registerRender(InitBlocksEA.mystic_block, 7, "gem/mystic/stone/mystic_block_gray");
registerRender(InitBlocksEA.mystic_block, 8, "gem/mystic/stone/mystic_block_lightgray");
registerRender(InitBlocksEA.mystic_block, 9, "gem/mystic/stone/mystic_block_cyan");
registerRender(InitBlocksEA.mystic_block, 10, "gem/mystic/stone/mystic_block_purple");
registerRender(InitBlocksEA.mystic_block, 11, "gem/mystic/stone/mystic_block_blue");
registerRender(InitBlocksEA.mystic_block, 12, "gem/mystic/stone/mystic_block_brown");
registerRender(InitBlocksEA.mystic_block, 13, "gem/mystic/stone/mystic_block_green");
registerRender(InitBlocksEA.mystic_block, 14, "gem/mystic/stone/mystic_block_red");
registerRender(InitBlocksEA.mystic_block, 15, "gem/mystic/stone/mystic_block_black");
		



registerRender(wood_mystic_block);
registerRender(InitBlocksEA.wood_mystic_block, 0, "gem/mystic/wood/wood_mystic_block_white");
registerRender(InitBlocksEA.wood_mystic_block, 1, "gem/mystic/wood/wood_mystic_block_orange");
registerRender(InitBlocksEA.wood_mystic_block, 2, "gem/mystic/wood/wood_mystic_block_magenta");
registerRender(InitBlocksEA.wood_mystic_block, 3, "gem/mystic/wood/wood_mystic_block_lightblue");
registerRender(InitBlocksEA.wood_mystic_block, 4, "gem/mystic/wood/wood_mystic_block_yellow");
registerRender(InitBlocksEA.wood_mystic_block, 5, "gem/mystic/wood/wood_mystic_block_lime");
registerRender(InitBlocksEA.wood_mystic_block, 6, "gem/mystic/wood/wood_mystic_block_pink");
registerRender(InitBlocksEA.wood_mystic_block, 7, "gem/mystic/wood/wood_mystic_block_gray");
registerRender(InitBlocksEA.wood_mystic_block, 8, "gem/mystic/wood/wood_mystic_block_lightgray");
registerRender(InitBlocksEA.wood_mystic_block, 9, "gem/mystic/wood/wood_mystic_block_cyan");
registerRender(InitBlocksEA.wood_mystic_block, 10, "gem/mystic/wood/wood_mystic_block_purple");
registerRender(InitBlocksEA.wood_mystic_block, 11, "gem/mystic/wood/wood_mystic_block_blue");
registerRender(InitBlocksEA.wood_mystic_block, 12, "gem/mystic/wood/wood_mystic_block_brown");
registerRender(InitBlocksEA.wood_mystic_block, 13, "gem/mystic/wood/wood_mystic_block_green");
registerRender(InitBlocksEA.wood_mystic_block, 14, "gem/mystic/wood/wood_mystic_block_red");
registerRender(InitBlocksEA.wood_mystic_block, 15, "gem/mystic/wood/wood_mystic_block_black");



//registerRender(stainedClaySlabs);
//registerRender(double_test_slab);
//registerRender(test_slab);

//registerRender(OmniTool);
**/
	
	
	
//InitItemsEARender

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

//InitBlocksEA
	/**
	 * 

	public static void register()
	{
		//GameRegistry.register(draconium_ore);//.setRegistryName(Reference.MOD_ID, "draconium_ore");
		
		///GameRegistry.registerBlock(draconium_ore, draconium_ore.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(velious_ore, velious_ore.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(arcanite_ore, arcanite_ore.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(katcheen_ore, katcheen_ore.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(necrocite_ore, necrocite_ore.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(soularite_ore, soularite_ore.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(ebonheart_ore, ebonheart_ore.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(ebon_ore, ebon_ore.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(ebon_ore_nether, ebon_ore_nether.getUnlocalizedName().substring(5));
		
		///GameRegistry.registerBlock(draconium_block, draconium_block.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(velious_block, velious_block.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(arcanite_block, arcanite_block.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(katcheen_block, katcheen_block.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(necrocite_block, necrocite_block.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(soularite_block, soularite_block.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(ebonheart_block, ebonheart_block.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(obsidian_block, obsidian_block.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(glowstone_block, glowstone_block.getUnlocalizedName().substring(5));
		
		///GameRegistry.registerBlock(draconium_block_brick, draconium_block_brick.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(velious_block_brick, velious_block_brick.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(arcanite_block_brick, arcanite_block_brick.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(katcheen_block_brick, katcheen_block_brick.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(necrocite_block_brick, necrocite_block_brick.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(soularite_block_brick, soularite_block_brick.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(ebonheart_block_brick, ebonheart_block_brick.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(obsidian_block_brick, obsidian_block_brick.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(glowstone_block_brick, glowstone_block_brick.getUnlocalizedName().substring(5));
		
		GameRegistry.registerBlock(double_draconium_slab, ItemBlockSlabDraconium.class, "slab/draconium/double_draconium_slab", draconium_slab, double_draconium_slab, true);
		GameRegistry.registerBlock(double_velious_slab, ItemBlockSlabVelious.class, "slab/velious/double_velious_slab", velious_slab, double_velious_slab, true);
		GameRegistry.registerBlock(double_arcanite_slab, ItemBlockSlabArcanite.class, "slab/arcanite/double_arcanite_slab", arcanite_slab, double_arcanite_slab, true);
		GameRegistry.registerBlock(double_katcheen_slab, ItemBlockSlabKatcheen.class, "slab/katcheen/double_katcheen_slab", katcheen_slab, double_katcheen_slab, true);
		GameRegistry.registerBlock(double_necrocite_slab, ItemBlockSlabNecrocite.class, "slab/necrocite/double_necrocite_slab", necrocite_slab, double_necrocite_slab, true);
		GameRegistry.registerBlock(double_soularite_slab, ItemBlockSlabSoularite.class, "slab/soularite/double_soularite_slab", soularite_slab, double_soularite_slab, true);
		GameRegistry.registerBlock(double_ebonheart_slab, ItemBlockSlabEbonheart.class, "slab/ebonheart/double_ebonheart_slab", ebonheart_slab, double_ebonheart_slab, true);
		GameRegistry.registerBlock(double_obsidian_slab, ItemBlockSlabObsidian.class, "slab/obsidian/double_obsidian_slab", obsidian_slab, double_obsidian_slab, true);
		GameRegistry.registerBlock(double_glowstone_slab, ItemBlockSlabGlowstone.class, "slab/glowstone/double_glowstone_slab", glowstone_slab, double_glowstone_slab, true);
		
		GameRegistry.registerBlock(draconium_slab, ItemBlockSlabDraconium.class, "slab/draconium/draconium_slab", draconium_slab, double_draconium_slab, false);
		GameRegistry.registerBlock(velious_slab, ItemBlockSlabVelious.class, "slab/velious/velious_slab", velious_slab, double_velious_slab, false);
		GameRegistry.registerBlock(arcanite_slab, ItemBlockSlabArcanite.class, "slab/arcanite/arcanite_slab", arcanite_slab, double_arcanite_slab, false);
		GameRegistry.registerBlock(katcheen_slab, ItemBlockSlabKatcheen.class, "slab/katcheen/katcheen_slab", katcheen_slab, double_katcheen_slab, false);
		GameRegistry.registerBlock(necrocite_slab, ItemBlockSlabNecrocite.class, "slab/necrocite/necrocite_slab", necrocite_slab, double_necrocite_slab, false);
		GameRegistry.registerBlock(soularite_slab, ItemBlockSlabSoularite.class, "slab/soularite/soularite_slab", soularite_slab, double_soularite_slab, false);
		GameRegistry.registerBlock(ebonheart_slab, ItemBlockSlabEbonheart.class, "slab/ebonheart/ebonheart_slab", ebonheart_slab, double_ebonheart_slab, false);
		GameRegistry.registerBlock(obsidian_slab, ItemBlockSlabObsidian.class, "slab/obsidian/obsidian_slab", obsidian_slab, double_obsidian_slab, false);
		GameRegistry.registerBlock(glowstone_slab, ItemBlockSlabGlowstone.class, "slab/glowstone/glowstone_slab", glowstone_slab, double_glowstone_slab, false);
		
		///GameRegistry.registerBlock(draconium_stairs, draconium_stairs.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(velious_stairs, velious_stairs.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(arcanite_stairs, arcanite_stairs.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(katcheen_stairs, katcheen_stairs.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(necrocite_stairs, necrocite_stairs.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(soularite_stairs, soularite_stairs.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(ebonheart_stairs, ebonheart_stairs.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(obsidian_stairs, obsidian_stairs.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(glowstone_stairs, glowstone_stairs.getUnlocalizedName().substring(5));
		
		///GameRegistry.registerBlock(draconium_fence, draconium_fence.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(velious_fence, velious_fence.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(arcanite_fence, arcanite_fence.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(katcheen_fence, katcheen_fence.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(necrocite_fence, necrocite_fence.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(soularite_fence, soularite_fence.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(ebonheart_fence, ebonheart_fence.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(obsidian_fence, obsidian_fence.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(glowstone_fence, glowstone_fence.getUnlocalizedName().substring(5));
		
		///GameRegistry.registerBlock(draconium_fence_gate, draconium_fence_gate.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(velious_fence_gate, velious_fence_gate.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(arcanite_fence_gate, arcanite_fence_gate.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(katcheen_fence_gate, katcheen_fence_gate.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(necrocite_fence_gate, necrocite_fence_gate.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(soularite_fence_gate, soularite_fence_gate.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(ebonheart_fence_gate, ebonheart_fence_gate.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(obsidian_fence_gate, obsidian_fence_gate.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(glowstone_fence_gate, glowstone_fence_gate.getUnlocalizedName().substring(5));
		
		///GameRegistry.registerBlock(draconium_wall, draconium_wall.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(velious_wall, velious_wall.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(arcanite_wall, arcanite_wall.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(katcheen_wall, katcheen_wall.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(necrocite_wall, necrocite_wall.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(soularite_wall, soularite_wall.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(ebonheart_wall, ebonheart_wall.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(obsidian_wall, obsidian_wall.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(glowstone_wall, glowstone_wall.getUnlocalizedName().substring(5));
		
		///GameRegistry.registerBlock(draconium_torch, draconium_torch.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(velious_torch, velious_torch.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(arcanite_torch, arcanite_torch.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(katcheen_torch, katcheen_torch.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(necrocite_torch, necrocite_torch.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(soularite_torch, soularite_torch.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(ebonheart_torch, ebonheart_torch.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(obsidian_torch, obsidian_torch.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(glowstone_torch, glowstone_torch.getUnlocalizedName().substring(5));
		
		
		//GameRegistry.registerBlock(draconium_door, draconium_door.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(velious_door, velious_door.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(arcanite_door, arcanite_door.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(katcheen_door, katcheen_door.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(necrocite_door, necrocite_door.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(soularite_door, soularite_door.getUnlocalizedName().substring(5));
		
		
		///GameRegistry.registerBlock(draconium_ladder, draconium_ladder.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(velious_ladder, velious_ladder.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(arcanite_ladder, arcanite_ladder.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(katcheen_ladder, katcheen_ladder.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(necrocite_ladder, necrocite_ladder.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(soularite_ladder, soularite_ladder.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(ebonheart_ladder, ebonheart_ladder.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(obsidian_ladder, obsidian_ladder.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(glowstone_ladder, glowstone_ladder.getUnlocalizedName().substring(5));
		
		///GameRegistry.registerBlock(draconium_pillar, draconium_pillar.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(velious_pillar, velious_pillar.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(arcanite_pillar, arcanite_pillar.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(katcheen_pillar, katcheen_pillar.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(necrocite_pillar, necrocite_pillar.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(soularite_pillar, soularite_pillar.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(ebonheart_pillar, ebonheart_pillar.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(obsidian_pillar, obsidian_pillar.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(glowstone_pillar, glowstone_pillar.getUnlocalizedName().substring(5));
		
		///GameRegistry.registerBlock(cobble_mystic_block_normal, cobble_mystic_block_normal.getUnlocalizedName().substring(5));
	//GameRegistry.registerBlock(cobble_mystic_block = new EABlockMeta("gem/mystic/cobblestone/cobble_mystic_block", Material.rock), ItemBlockMeta.class, "gem/mystic/cobblestone/cobble_mystic_block");
		
		///GameRegistry.registerBlock(mystic_block_normal, mystic_block_normal.getUnlocalizedName().substring(5));
	///GameRegistry.registerBlock(mystic_block = new EABlockMeta("gem/mystic/stone/mystic_block", Material.rock), ItemBlockMeta.class, "gem/mystic/stone/mystic_block");
		
		///GameRegistry.registerBlock(wood_mystic_block_normal, wood_mystic_block_normal.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(wood_mystic_block_white, wood_mystic_block_white.getUnlocalizedName().substring(5));
		
		//GameRegistry.registerBlock(wood_mystic_block = new EABlockMeta("gem/mystic/wood/wood_mystic_block", Material.wood), ItemBlockMeta.class, "gem/mystic/wood/wood_mystic_block");
		
		///GameRegistry.registerBlock(paper_block, paper_block.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(leather_block, leather_block.getUnlocalizedName().substring(5));
		///GameRegistry.registerBlock(reed_block, reed_block.getUnlocalizedName().substring(5));
		
		
		
		//GameRegistry.registerBlock(color_atrium, color_atrium.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(lit_color_atrium, lit_color_atrium.getUnlocalizedName().substring(5));
		
		//GameRegistry.registerBlock(test_liquid, test_liquid.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(flowing_test_liquid, flowing_test_liquid.getUnlocalizedName().substring(5));
		
		//GameRegistry.registerBlock(purified_mystic_block, purified_mystic_block.getUnlocalizedName().substring(5));
		
		//GameRegistry.registerBlock(tutorialTileEntity, tutorialTileEntity.getUnlocalizedName().substring(5));
		
	
	}
	 */

	
	
//InitItemsEA
	/**
	//public static final ItemArmor.ArmorMaterial arcaniteArmorMaterial = EnumHelper.addArmorMaterial("arcaniteArmorMaterial", "ea:arcanite", 18, new int[]{2, 6, 5, 2}, 10, SoundEvents.item_armor_equip_chain);
	//public static final ItemArmor.ArmorMaterial katcheenArmorMaterial = EnumHelper.addArmorMaterial("katcheenArmorMaterial", "ea:katcheen", 36, new int[]{3, 8, 6, 3}, 30, SoundEvents.item_armor_equip_chain);
	//public static final ItemArmor.ArmorMaterial arcaniteArmorMaterial = EnumHelper.addArmorMaterial(name, textureName, durability, reductionAmounts, enchantability);

	public static void register()
	{
		//GameRegistry.registerItem(ebon_tome, ebon_tome.getUnlocalizedName().substring(5));
		
		///GameRegistry.register(draconium_dust);
		///.registerItem(draconium_dust, draconium_dust.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(velious, velious.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(arcanite, arcanite.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(katcheen, katcheen.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(necrocite, necrocite.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(soularite, soularite.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(ebonheart, ebonheart.getUnlocalizedName().substring(5));
		
		///GameRegistry.registerItem(obsidian_shards, obsidian_shards.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(glowstone_shards, glowstone_shards.getUnlocalizedName().substring(5));
		
		///GameRegistry.registerItem(glowing_disc, glowing_disc.getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(shimmering_disc, shimmering_disc.getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(laminate_disc, laminate_disc.getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(resilient_disc, resilient_disc.getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(dismal_disc, dismal_disc.getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(ethereal_disc, ethereal_disc.getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(chrono_disc, chrono_disc.getUnlocalizedName().substring(5));
		
		//GameRegistry.registerItem(mirroring_disc, mirroring_disc.getUnlocalizedName().substring(5));
		
		///GameRegistry.registerItem(empowered_blade, empowered_blade.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(enchanted_ebonheart, enchanted_ebonheart.getUnlocalizedName().substring(5));
		
		///GameRegistry.registerItem(arcanite_pickaxe, arcanite_pickaxe.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(arcanite_axe, arcanite_axe.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(arcanite_shovel, arcanite_shovel.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(arcanite_hoe, arcanite_hoe.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(arcanite_sword, arcanite_sword.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(arcanite_helmet, arcanite_helmet.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(arcanite_chestplate, arcanite_chestplate.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(arcanite_leggings, arcanite_leggings.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(arcanite_boots, arcanite_boots.getUnlocalizedName().substring(5));
		
		///GameRegistry.registerItem(katcheen_pickaxe, katcheen_pickaxe.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(katcheen_axe, katcheen_axe.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(katcheen_shovel, katcheen_shovel.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(katcheen_hoe, katcheen_hoe.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(katcheen_sword, katcheen_sword.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(katcheen_helmet, katcheen_helmet.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(katcheen_chestplate, katcheen_chestplate.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(katcheen_leggings, katcheen_leggings.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(katcheen_boots, katcheen_boots.getUnlocalizedName().substring(5));
		
		///GameRegistry.registerItem(deception, deception.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(frostbite, frostbite.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(massacre, massacre.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(blazefury, blazefury.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(despair, despair.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(souleater, souleater.getUnlocalizedName().substring(5));
		
		//GameRegistry.registerItem(test_shield, test_shield.getUnlocalizedName().substring(5));
		
		///GameRegistry.registerItem(dragon_fruit, dragon_fruit.getUnlocalizedName().substring(5));
		
		//GameRegistry.registerItem(omniplex, omniplex.getUnlocalizedName().substring(5));
		
		//GameRegistry.registerItem(banana, banana.getUnlocalizedName().substring(5));
		
	}
	
	 */

	
	
//InitRecipesEA
	
	
	
	//Examples I created
	
	//GameRegistry.addRecipe(new ItemStack(ModBlocks.tutorialBlock),	"##","##",	'#', ModItems.tutorialItem);
	//or: GameRegistry.addRecipe(new ItemStack(ModBlocks.tutorialBlock), new Object[]{"##","##", '#', ModItems.tutorialItem});

	//GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tutorialItem), Items.redstone, new ItemStack(Items.dye, 1, 4));
	//or: GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tutorialItem), new Object[]{Items.redstone, new ItemStack(Items.dye, 1, 4)});

	//GameRegistry.addSmelting(Items.diamond, new ItemStack(ModItems.tutorialItem), 1.0f);

//}


/**
 * 
 * Archived old code
 * 
 * 


        for (int i = 0; i < 16; ++i)
        {
        	GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new Object[] {new ItemStack(InitBlocksEA.cobble_mystic_block, 1, i)});
        	GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block, 1, i), new Object[] {new ItemStack(Items.dye, 1, 15 - i), new ItemStack(Item.getItemFromBlock(InitBlocksEA.cobble_mystic_block_normal))});
        	
        	GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new Object[] {new ItemStack(InitBlocksEA.mystic_block, 1, i)});
            GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, i), new Object[] {new ItemStack(Items.dye, 1, 15 - i), new ItemStack(Item.getItemFromBlock(InitBlocksEA.mystic_block_normal))});
            //GameRegistry.addRecipe(new ItemStack(Blocks.stained_hardened_clay, 8, 15 - i), new Object[] {"###", "#X#", "###", '#', new ItemStack(Blocks.hardened_clay), 'X', new ItemStack(Items.dye, 1, i)});
            //GameRegistry.addRecipe(new ItemStack(Blocks.stained_glass, 8, 15 - i), new Object[] {"###", "#X#", "###", '#', new ItemStack(Blocks.glass), 'X', new ItemStack(Items.dye, 1, i)});
            //GameRegistry.addRecipe(new ItemStack(Blocks.stained_glass_pane, 16, i), new Object[] {"###", "###", '#', new ItemStack(Blocks.stained_glass, 1, i)});
            
            
        }
    
	//Mystic Cobblestone
	//conversion back from dye block to normal block
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 0));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 1));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 2));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 3));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 4));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 5));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 6));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 7));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 8));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 9));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 10));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 11));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 12));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 13));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 14));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 15));
	
	//Recipes that dye the basic block into any color
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 0), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 15));//EnumDyeColor.BLACK.getDyeDamage()
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 1), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 14));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 2), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 13));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 3), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 12));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 4), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 11));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 5), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 10));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 6), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 9));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 7), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 8));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 8), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 7));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 9), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 6));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 10), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 5));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 11), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 4));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 12), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 3));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 13), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 2));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 14), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 1));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 15), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 0));
	
	
	//Mystic Stone
	//conversion back from dye block to normal block
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block, 1, 0));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block, 1, 1));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block, 1, 2));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block, 1, 3));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block, 1, 4));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block, 1, 5));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block, 1, 6));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block, 1, 7));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block, 1, 8));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block, 1, 9));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block, 1, 10));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block, 1, 11));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block, 1, 12));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block, 1, 13));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block, 1, 14));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block, 1, 15));
			
	//Recipes that dye the basic block into any color
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 0), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 15));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 1), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 14));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 2), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 13));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 3), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 12));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 4), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 11));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 5), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 10));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 6), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 9));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 7), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 8));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 8), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 7));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 9), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 6));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 10), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 5));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 11), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 4));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 12), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 3));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 13), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 2));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 14), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 1));
	//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 15), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 0));
	
	
	
	//GameRegistry.addShapedRecipe(new ItemStack(InitTileEntitiesEA.Banana_Plant), new Object[]{"DN", "ND", 'D', InitItemsEA.draconium_dust, 'N', Items.quartz});
	//GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.ebonheart_block), new Object[]{"EEE", "EEE", "EEE", 'E', InitItemsEA.ebonheart});
	//GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.ebonheart, 9), new Object[]{"E", 'E', InitBlocksEA.ebonheart_block});
	

//if(!EbonArtsConfiguration.decraftRecipe2)
	//{
	//	
	//	GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 4), new ItemStack(Blocks.quartz_block, 1, 0));
	//	GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 4), new ItemStack(Blocks.quartz_block, 1, 1));
	//	GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 2), new ItemStack(Blocks.stone_slab, 1, 7));
	//	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.quartz_block, 1), new ItemStack(Blocks.quartz_block, 1, 2));
	//	GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 6), Blocks.quartz_stairs);
		
		
		
		
		
	
		
		
	//	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 4), Blocks.crafting_table);
	//	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 8), Blocks.chest);
	//	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone, 8), Blocks.furnace);
	//	GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 5), Items.minecart);
	//	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 5), Items.boat);
		
	//	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 1), Blocks.wooden_button);
	//	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.stone, 1), Blocks.stone_button);
		
		
		
		
	//	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.stone, 2), Blocks.stone_pressure_plate);
	//	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2), Blocks.wooden_pressure_plate);
	//	GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 2), Blocks.heavy_weighted_pressure_plate);
	//	GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 2), Blocks.light_weighted_pressure_plate);
		
		
		
		
	//	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 3), Blocks.trapdoor);
	//	GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 4), Blocks.iron_trapdoor);
		
		
		
	//	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 0), Items.oak_door);
	//	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 1), Items.spruce_door);
	//	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 2), Items.birch_door);
	//	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 3), Items.jungle_door);
	//	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 4), Items.acacia_door);
	//	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 5), Items.dark_oak_door);
	//	GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 2), Items.iron_door);
		
		
		
	//	GameRegistry.addShapelessRecipe(new ItemStack(Items.glowstone_dust, 4), Blocks.glowstone);
		
		
	//}
	//else
	//{
		
	//}

 */

	
	
//ItemBurnishedArmor
	/**
	private void effectPlayer(EntityPlayer player, Potion potion, int strength, boolean showParticles) {
	    //Always effect for 8 seconds, then refresh
	    if (player.getActivePotionEffect(potion) == null || player.getActivePotionEffect(potion).getDuration() <= 1)
	        player.addPotionEffect(new PotionEffect(potion
	        		//.id
	        		, 159, strength, true, showParticles));
	}
	
			//if(player.capabilities.isCreativeMode)
			//{
			//	if(player.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(EAAttributeModifier.BURNISHED_SPEED_BONUS))
			//	{
			//		player.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(EAAttributeModifier.BURNISHED_SPEED_BONUS);
			//	}
			//}

			//playerPosX = player.getPositionVector().xCoord;
			//playerPosY = player.getPositionVector().yCoord;
			//playerPosZ = player.getPositionVector().zCoord;
	**/
	
	
	
//ItemVengeanceArmor
/**
	//if(player.capabilities.isCreativeMode)
	//{
		
	//	if(player.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(EAAttributeModifier.VENGEANCE_SPEED_BONUS))
	//	{
	//		player.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(EAAttributeModifier.VENGEANCE_SPEED_BONUS);
	//	}
		
	//	if(player.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).hasModifier(EAAttributeModifier.VENGEANCE_HP_BONUS))
	//	{
	//		player.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).removeModifier(EAAttributeModifier.VENGEANCE_HP_BONUS);
	//	}
		
	//	if(player.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).hasModifier(EAAttributeModifier.VENGEANCE_ATTACK_BONUS))
	//	{
	//		player.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).removeModifier(EAAttributeModifier.VENGEANCE_ATTACK_BONUS);
	//	}
		
	//}
	
	//LogHelper.info("held item: " + player.getHeldItem(EnumHand.MAIN_HAND).getMaxDamage());
	 * 
	 * //else
		//{
			
		//	if(player.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).hasModifier(EAAttributeModifier.VENGEANCE_SPEED_BONUS))
		//	{
		//		player.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).removeModifier(EAAttributeModifier.VENGEANCE_SPEED_BONUS);
		//	}
			
		//	if(player.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).hasModifier(EAAttributeModifier.VENGEANCE_HP_BONUS))
		//	{
		//		player.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).removeModifier(EAAttributeModifier.VENGEANCE_HP_BONUS);
		//	}
			
		//	if(player.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).hasModifier(EAAttributeModifier.VENGEANCE_ATTACK_BONUS))
		//	{
		//		player.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).removeModifier(EAAttributeModifier.VENGEANCE_ATTACK_BONUS);
		//	}
			
		//}
	*/
	
	
	
//InitEntityEARender
	/**
	 * public static void registerParticle(World worldIn, BlockPos pos)
	{
		//double d0 = (double)pos.getX() + 0.5D;
        //double d1 = (double)pos.getY() + 0.7D;
        ////double d2 = (double)pos.getZ() + 0.5D;
		//EntityFX candleFlame = new EntityCandleFX(worldIn, d0, d1, d2, 0.0D, 0.0D, 0.0D);
		//Minecraft.getMinecraft().effectRenderer.addEffect(candleFlame);
		
		
	}
	 */

}
