package com.ebonheart.EbonArtsMod.client;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
//import net.minecraft.client.resources.model.ModelBakery;
//import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.ClientRegistry;

import com.ebonheart.EbonArtsMod.client.render.projectile.RenderEnchantedEbonheart;
import com.ebonheart.EbonArtsMod.common.entity.tile.TileEntityTutorial;
import com.ebonheart.EbonArtsMod.init.InitBlocksEA;
import com.ebonheart.EbonArtsMod.references.BlocksEA;
import com.ebonheart.EbonArtsMod.references.Reference;

public final class InitBlocksEARender extends BlocksEA {
	
	public static void preInit() 
	{
		
		ModelBakery.registerItemVariants(Item.getItemFromBlock(InitBlocksEA.cobble_mystic_block), 
				new ResourceLocation(Reference.MOD_ID + ":gem/mystic/cobble_mystic_block_white"),
				new ResourceLocation(Reference.MOD_ID + ":gem/mystic/cobble_mystic_block_orange"),
				new ResourceLocation(Reference.MOD_ID + ":gem/mystic/cobble_mystic_block_magenta"),
				new ResourceLocation(Reference.MOD_ID + ":gem/mystic/cobble_mystic_block_lightblue"),
				new ResourceLocation(Reference.MOD_ID + ":gem/mystic/cobble_mystic_block_yellow"),
				new ResourceLocation(Reference.MOD_ID + ":gem/mystic/cobble_mystic_block_lime"),
				new ResourceLocation(Reference.MOD_ID + ":gem/mystic/cobble_mystic_block_pink"),
				new ResourceLocation(Reference.MOD_ID + ":gem/mystic/cobble_mystic_block_gray"),
				new ResourceLocation(Reference.MOD_ID + ":gem/mystic/cobble_mystic_block_lightgray"),
				new ResourceLocation(Reference.MOD_ID + ":gem/mystic/cobble_mystic_block_cyan"),
				new ResourceLocation(Reference.MOD_ID + ":gem/mystic/cobble_mystic_block_purple"),
				new ResourceLocation(Reference.MOD_ID + ":gem/mystic/cobble_mystic_block_blue"),
				new ResourceLocation(Reference.MOD_ID + ":gem/mystic/cobble_mystic_block_brown"),
				new ResourceLocation(Reference.MOD_ID + ":gem/mystic/cobble_mystic_block_green"),
				new ResourceLocation(Reference.MOD_ID + ":gem/mystic/cobble_mystic_block_red"),
				new ResourceLocation(Reference.MOD_ID + ":gem/mystic/cobble_mystic_block_black"));
				
		
		ModelBakery.registerItemVariants(Item.getItemFromBlock(InitBlocksEA.mystic_block), 
				new ResourceLocation(Reference.MOD_ID + ":gem/mystic/mystic_block_white"),
				new ResourceLocation(Reference.MOD_ID + ":gem/mystic/mystic_block_orange"),
				new ResourceLocation(Reference.MOD_ID + ":gem/mystic/mystic_block_magenta"),
				new ResourceLocation(Reference.MOD_ID + ":gem/mystic/mystic_block_lightblue"),
				new ResourceLocation(Reference.MOD_ID + ":gem/mystic/mystic_block_yellow"),
				new ResourceLocation(Reference.MOD_ID + ":gem/mystic/mystic_block_lime"),
				new ResourceLocation(Reference.MOD_ID + ":gem/mystic/mystic_block_pink"),
				new ResourceLocation(Reference.MOD_ID + ":gem/mystic/mystic_block_gray"),
				new ResourceLocation(Reference.MOD_ID + ":gem/mystic/mystic_block_lightgray"),
				new ResourceLocation(Reference.MOD_ID + ":gem/mystic/mystic_block_cyan"),
				new ResourceLocation(Reference.MOD_ID + ":gem/mystic/mystic_block_purple"),
				new ResourceLocation(Reference.MOD_ID + ":gem/mystic/mystic_block_blue"),
				new ResourceLocation(Reference.MOD_ID + ":gem/mystic/mystic_block_brown"),
				new ResourceLocation(Reference.MOD_ID + ":gem/mystic/mystic_block_green"),
				new ResourceLocation(Reference.MOD_ID + ":gem/mystic/mystic_block_red"),
				new ResourceLocation(Reference.MOD_ID + ":gem/mystic/mystic_block_black"));
		
		
		
	}
	
	public static void registerRenders()
	{
		registerRender(draconium_ore);
		registerRender(velious_ore);
		registerRender(arcanite_ore);
		registerRender(katcheen_ore);
		registerRender(necrocite_ore);
		registerRender(soularite_ore);
		registerRender(ebonheart_ore);
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
		
		registerRender(cobble_mystic_block_normal);
		registerRender(cobble_mystic_block);
		registerRender(InitBlocksEA.cobble_mystic_block, 0, "gem/mystic/cobble_mystic_block_white");
		registerRender(InitBlocksEA.cobble_mystic_block, 1, "gem/mystic/cobble_mystic_block_orange");
		registerRender(InitBlocksEA.cobble_mystic_block, 2, "gem/mystic/cobble_mystic_block_magenta");
		registerRender(InitBlocksEA.cobble_mystic_block, 3, "gem/mystic/cobble_mystic_block_lightblue");
		registerRender(InitBlocksEA.cobble_mystic_block, 4, "gem/mystic/cobble_mystic_block_yellow");
		registerRender(InitBlocksEA.cobble_mystic_block, 5, "gem/mystic/cobble_mystic_block_lime");
		registerRender(InitBlocksEA.cobble_mystic_block, 6, "gem/mystic/cobble_mystic_block_pink");
		registerRender(InitBlocksEA.cobble_mystic_block, 7, "gem/mystic/cobble_mystic_block_gray");
		registerRender(InitBlocksEA.cobble_mystic_block, 8, "gem/mystic/cobble_mystic_block_lightgray");
		registerRender(InitBlocksEA.cobble_mystic_block, 9, "gem/mystic/cobble_mystic_block_cyan");
		registerRender(InitBlocksEA.cobble_mystic_block, 10, "gem/mystic/cobble_mystic_block_purple");
		registerRender(InitBlocksEA.cobble_mystic_block, 11, "gem/mystic/cobble_mystic_block_blue");
		registerRender(InitBlocksEA.cobble_mystic_block, 12, "gem/mystic/cobble_mystic_block_brown");
		registerRender(InitBlocksEA.cobble_mystic_block, 13, "gem/mystic/cobble_mystic_block_green");
		registerRender(InitBlocksEA.cobble_mystic_block, 14, "gem/mystic/cobble_mystic_block_red");
		registerRender(InitBlocksEA.cobble_mystic_block, 15, "gem/mystic/cobble_mystic_block_black");
		
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
