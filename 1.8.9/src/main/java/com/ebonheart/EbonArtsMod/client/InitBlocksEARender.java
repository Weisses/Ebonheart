package com.ebonheart.EbonArtsMod.client;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.client.registry.ClientRegistry;

import com.ebonheart.EbonArtsMod.client.render.models.Ebonheart;
import com.ebonheart.EbonArtsMod.common.entity.tile.TileEntityTutorial;
import com.ebonheart.EbonArtsMod.init.InitBlocksEA;
import com.ebonheart.EbonArtsMod.references.BlocksEA;
import com.ebonheart.EbonArtsMod.references.Reference;

public final class InitBlocksEARender extends BlocksEA {
	
	public static void preInit() 
	{
		ModelBakery.addVariantName(Item.getItemFromBlock(InitBlocksEA.mystic_block), 
				"ea:gem/mystic/mystic_block_white", 
				"ea:gem/mystic/mystic_block_orange", 
				"ea:gem/mystic/mystic_block_magenta", 
				"ea:gem/mystic/mystic_block_lightblue", 
				"ea:gem/mystic/mystic_block_yellow", 
				"ea:gem/mystic/mystic_block_lime", 
				"ea:gem/mystic/mystic_block_pink", 
				"ea:gem/mystic/mystic_block_gray", 
				"ea:gem/mystic/mystic_block_lightgray", 
				"ea:gem/mystic/mystic_block_cyan", 
				"ea:gem/mystic/mystic_block_purple", 
				"ea:gem/mystic/mystic_block_blue", 
				"ea:gem/mystic/mystic_block_brown", 
				"ea:gem/mystic/mystic_block_green", 
				"ea:gem/mystic/mystic_block_red", 
				"ea:gem/mystic/mystic_block_black");
		
		ModelBakery.addVariantName(Item.getItemFromBlock(InitBlocksEA.innate_mystic_block), 
				"ea:gem/mystic/innate_mystic_block_white", 
				"ea:gem/mystic/innate_mystic_block_orange", 
				"ea:gem/mystic/innate_mystic_block_magenta", 
				"ea:gem/mystic/innate_mystic_block_lightblue", 
				"ea:gem/mystic/innate_mystic_block_yellow", 
				"ea:gem/mystic/innate_mystic_block_lime", 
				"ea:gem/mystic/innate_mystic_block_pink", 
				"ea:gem/mystic/innate_mystic_block_gray", 
				"ea:gem/mystic/innate_mystic_block_lightgray", 
				"ea:gem/mystic/innate_mystic_block_cyan", 
				"ea:gem/mystic/innate_mystic_block_purple", 
				"ea:gem/mystic/innate_mystic_block_blue", 
				"ea:gem/mystic/innate_mystic_block_brown", 
				"ea:gem/mystic/innate_mystic_block_green", 
				"ea:gem/mystic/innate_mystic_block_red", 
				"ea:gem/mystic/innate_mystic_block_black");
		
		
		
		//ModelBakery.addVariantName(Item.getItemFromBlock(InitBlocksEA.arcanite_stairs), 
		//		"ea:gem/arcanite/arcanite_stairs_white", 
		//		"ea:gem/arcanite/arcanite_stairs_orange", 
		//		"ea:gem/arcanite/arcanite_stairs_magenta", 
		//		"ea:gem/arcanite/arcanite_stairs_lightblue", 
		//		"ea:gem/arcanite/arcanite_stairs_yellow", 
		//		"ea:gem/arcanite/arcanite_stairs_lime", 
		//		"ea:gem/arcanite/arcanite_stairs_pink", 
		//		"ea:gem/arcanite/arcanite_stairs_gray", 
		//		"ea:gem/arcanite/arcanite_stairs_lightgray", 
		//		"ea:gem/arcanite/arcanite_stairs_cyan", 
		//		"ea:gem/arcanite/arcanite_stairs_purple", 
		//		"ea:gem/arcanite/arcanite_stairs_blue", 
		//		"ea:gem/arcanite/arcanite_stairs_brown", 
		//		"ea:gem/arcanite/arcanite_stairs_green", 
		//		"ea:gem/arcanite/arcanite_stairs_red", 
		//		"ea:gem/arcanite/arcanite_stairs_black");
	}
	
	public static void registerRenders()
	{
		registerRender(draconium_ore);
		registerRender(velious_ore);
		registerRender(arcanite_ore);
		registerRender(katcheen_ore);
		registerRender(necrocite_ore);
		registerRender(soularite_ore);
		registerRender(ebon_ore);
		registerRender(ebon_ore_nether);
		
		registerRender(mystic_block_normal);
		registerRender(mystic_block);
		registerRender(InitBlocksEA.mystic_block, 0, "gem/mystic/mystic_block_white");
		registerRender(InitBlocksEA.mystic_block, 1, "gem/mystic/mystic_block_orange");
		registerRender(InitBlocksEA.mystic_block, 2, "gem/mystic/mystic_block_magenta");
		registerRender(InitBlocksEA.mystic_block, 3, "gem/mystic/mystic_block_lightblue");
		registerRender(InitBlocksEA.mystic_block, 4, "gem/mystic/mystic_block_yellow");
		registerRender(InitBlocksEA.mystic_block, 5, "gem/mystic/mystic_block_lime");
		registerRender(InitBlocksEA.mystic_block, 6, "gem/mystic/mystic_block_pink");
		registerRender(InitBlocksEA.mystic_block, 7, "gem/mystic/mystic_block_gray");
		registerRender(InitBlocksEA.mystic_block, 8, "gem/mystic/mystic_block_lightgray");
		registerRender(InitBlocksEA.mystic_block, 9, "gem/mystic/mystic_block_cyan");
		registerRender(InitBlocksEA.mystic_block, 10, "gem/mystic/mystic_block_purple");
		registerRender(InitBlocksEA.mystic_block, 11, "gem/mystic/mystic_block_blue");
		registerRender(InitBlocksEA.mystic_block, 12, "gem/mystic/mystic_block_brown");
		registerRender(InitBlocksEA.mystic_block, 13, "gem/mystic/mystic_block_green");
		registerRender(InitBlocksEA.mystic_block, 14, "gem/mystic/mystic_block_red");
		registerRender(InitBlocksEA.mystic_block, 15, "gem/mystic/mystic_block_black");
		
		registerRender(innate_mystic_block_normal);
		registerRender(innate_mystic_block);
		registerRender(InitBlocksEA.innate_mystic_block, 0, "gem/mystic/innate_mystic_block_white");
		registerRender(InitBlocksEA.innate_mystic_block, 1, "gem/mystic/innate_mystic_block_orange");
		registerRender(InitBlocksEA.innate_mystic_block, 2, "gem/mystic/innate_mystic_block_magenta");
		registerRender(InitBlocksEA.innate_mystic_block, 3, "gem/mystic/innate_mystic_block_lightblue");
		registerRender(InitBlocksEA.innate_mystic_block, 4, "gem/mystic/innate_mystic_block_yellow");
		registerRender(InitBlocksEA.innate_mystic_block, 5, "gem/mystic/innate_mystic_block_lime");
		registerRender(InitBlocksEA.innate_mystic_block, 6, "gem/mystic/innate_mystic_block_pink");
		registerRender(InitBlocksEA.innate_mystic_block, 7, "gem/mystic/innate_mystic_block_gray");
		registerRender(InitBlocksEA.innate_mystic_block, 8, "gem/mystic/innate_mystic_block_lightgray");
		registerRender(InitBlocksEA.innate_mystic_block, 9, "gem/mystic/innate_mystic_block_cyan");
		registerRender(InitBlocksEA.innate_mystic_block, 10, "gem/mystic/innate_mystic_block_purple");
		registerRender(InitBlocksEA.innate_mystic_block, 11, "gem/mystic/innate_mystic_block_blue");
		registerRender(InitBlocksEA.innate_mystic_block, 12, "gem/mystic/innate_mystic_block_brown");
		registerRender(InitBlocksEA.innate_mystic_block, 13, "gem/mystic/innate_mystic_block_green");
		registerRender(InitBlocksEA.innate_mystic_block, 14, "gem/mystic/innate_mystic_block_red");
		registerRender(InitBlocksEA.innate_mystic_block, 15, "gem/mystic/innate_mystic_block_black");
		
		registerRender(draconium_block);
		registerRender(velious_block);
		registerRender(arcanite_block);
		registerRender(katcheen_block);
		registerRender(necrocite_block);
		registerRender(soularite_block);
		registerRender(obsidian_block);
		registerRender(glowstone_block);
		registerRender(ebonheart_block);
		
		registerRender(draconium_block_brick);
		registerRender(velious_block_brick);
		registerRender(arcanite_block_brick);
		registerRender(katcheen_block_brick);
		registerRender(necrocite_block_brick);
		registerRender(soularite_block_brick);
		registerRender(obsidian_block_brick);
		registerRender(glowstone_block_brick);
		registerRender(ebonheart_block_brick);
		
		registerRender(double_draconium_slab);
		registerRender(double_velious_slab);
		registerRender(double_arcanite_slab);
		registerRender(double_katcheen_slab);
		registerRender(double_necrocite_slab);
		registerRender(double_soularite_slab);
		registerRender(double_obsidian_slab);
		registerRender(double_glowstone_slab);
		registerRender(double_ebonheart_slab);
		
		registerRender(draconium_slab);
		registerRender(velious_slab);
		registerRender(arcanite_slab);
		registerRender(katcheen_slab);
		registerRender(necrocite_slab);
		registerRender(soularite_slab);
		registerRender(obsidian_slab);
		registerRender(glowstone_slab);
		registerRender(ebonheart_slab);
		
		registerRender(draconium_stairs);
		registerRender(velious_stairs);
		registerRender(arcanite_stairs);
		registerRender(katcheen_stairs);
		registerRender(necrocite_stairs);
		registerRender(soularite_stairs);
		registerRender(obsidian_stairs);
		registerRender(glowstone_stairs);
		registerRender(ebonheart_stairs);
		
		registerRender(draconium_fence);
		registerRender(velious_fence);
		registerRender(arcanite_fence);
		registerRender(katcheen_fence);
		registerRender(necrocite_fence);
		registerRender(soularite_fence);
		registerRender(obsidian_fence);
		registerRender(glowstone_fence);
		registerRender(ebonheart_fence);
		
		registerRender(draconium_fence_gate);
		registerRender(velious_fence_gate);
		registerRender(arcanite_fence_gate);
		registerRender(katcheen_fence_gate);
		registerRender(necrocite_fence_gate);
		registerRender(soularite_fence_gate);
		registerRender(obsidian_fence_gate);
		registerRender(glowstone_fence_gate);
		registerRender(ebonheart_fence_gate);
		
		registerRender(draconium_wall);
		registerRender(velious_wall);
		registerRender(arcanite_wall);
		registerRender(katcheen_wall);
		registerRender(necrocite_wall);
		registerRender(soularite_wall);
		registerRender(obsidian_wall);
		registerRender(glowstone_wall);
		registerRender(ebonheart_wall);
		
		registerRender(draconium_torch);
		registerRender(velious_torch);
		registerRender(arcanite_torch);
		registerRender(katcheen_torch);
		registerRender(necrocite_torch);
		registerRender(soularite_torch);
		registerRender(obsidian_torch);
		registerRender(glowstone_torch);
		registerRender(ebonheart_torch);
		
		//registerRender(draconium_door);
		//registerRender(velious_door);
		//registerRender(arcanite_door);
		//registerRender(katcheen_door);
		//registerRender(necrocite_door);
		//registerRender(soularite_door);
		
		registerRender(draconium_ladder);
		registerRender(velious_ladder);
		registerRender(arcanite_ladder);
		registerRender(katcheen_ladder);
		registerRender(necrocite_ladder);
		registerRender(soularite_ladder);
		registerRender(obsidian_ladder);
		registerRender(glowstone_ladder);
		registerRender(ebonheart_ladder);
		
		registerRender(draconium_pillar);
		registerRender(velious_pillar);
		registerRender(arcanite_pillar);
		registerRender(katcheen_pillar);
		registerRender(necrocite_pillar);
		registerRender(soularite_pillar);
		registerRender(obsidian_pillar);
		registerRender(glowstone_pillar);
		registerRender(ebonheart_pillar);
		
		registerRender(paper_block);
		registerRender(leather_block);
		registerRender(reed_block);
		
		//registerRender(color_atrium);
		//registerRender(lit_color_atrium);
		
		//registerRender(test_liquid);
		//registerRender(flowing_test_liquid);
		
		//registerRender(InitBlocksEA.arcanite_stairs, 0, "gem/arcanite/arcanite_stairs_white");
		//registerRender(InitBlocksEA.arcanite_stairs, 1, "gem/arcanite/arcanite_stairs_orange");
		//registerRender(InitBlocksEA.arcanite_stairs, 2, "gem/arcanite/arcanite_stairs_magenta");
		//registerRender(InitBlocksEA.arcanite_stairs, 3, "gem/arcanite/arcanite_stairs_lightblue");
		//registerRender(InitBlocksEA.arcanite_stairs, 4, "gem/arcanite/arcanite_stairs_yellow");
		//registerRender(InitBlocksEA.arcanite_stairs, 5, "gem/arcanite/arcanite_stairs_lime");
		//registerRender(InitBlocksEA.arcanite_stairs, 6, "gem/arcanite/arcanite_stairs_pink");
		//registerRender(InitBlocksEA.arcanite_stairs, 7, "gem/arcanite/arcanite_stairs_gray");
		//registerRender(InitBlocksEA.arcanite_stairs, 8, "gem/arcanite/arcanite_stairs_lightgray");
		//registerRender(InitBlocksEA.arcanite_stairs, 9, "gem/arcanite/arcanite_stairs_cyan");
		//registerRender(InitBlocksEA.arcanite_stairs, 10, "gem/arcanite/arcanite_stairs_purple");
		//registerRender(InitBlocksEA.arcanite_stairs, 11, "gem/arcanite/arcanite_stairs_blue");
		//registerRender(InitBlocksEA.arcanite_stairs, 12, "gem/arcanite/arcanite_stairs_brown");
		//registerRender(InitBlocksEA.arcanite_stairs, 13, "gem/arcanite/arcanite_stairs_green");
		//registerRender(InitBlocksEA.arcanite_stairs, 14, "gem/arcanite/arcanite_stairs_red");
		//registerRender(InitBlocksEA.arcanite_stairs, 15, "gem/arcanite/arcanite_stairs_black");
		
		
		//registerRender(purified_mystic_block);
	}
	
	public static void registerSpecialRenders()
	{
		//registerRender(tutorialTileEntity);
		//ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTutorial.class, new RenderEbonheart());
		
		
		
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
	public static void registerRender(Block block, int meta, String file) 
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), meta, new ModelResourceLocation(Reference.MOD_ID + ":" + file, "inventory"));
	}
	
	
}
