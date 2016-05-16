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

import com.ebonheart.EbonArtsMod.api.BlocksEA;
import com.ebonheart.EbonArtsMod.api.Reference;
import com.ebonheart.EbonArtsMod.client.projectile.RenderEnchantedEbonheart;
import com.ebonheart.EbonArtsMod.common.entity.tile.TileEntityTutorial;
import com.ebonheart.EbonArtsMod.init.InitBlocksEA;

public final class InitBlocksEARender extends BlocksEA {
	
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
		
		registerRender(cobble_mystic_block_normal);
		registerRender(cobble_mystic_block_glass);
		registerRender(cobble_mystic_block_white);
		registerRender(cobble_mystic_block_orange);
		registerRender(cobble_mystic_block_magenta);
		registerRender(cobble_mystic_block_lightblue);
		registerRender(cobble_mystic_block_yellow);
		registerRender(cobble_mystic_block_lime);
		registerRender(cobble_mystic_block_pink);
		registerRender(cobble_mystic_block_gray);
		registerRender(cobble_mystic_block_lightgray);
		registerRender(cobble_mystic_block_cyan);
		registerRender(cobble_mystic_block_purple);
		registerRender(cobble_mystic_block_blue);
		registerRender(cobble_mystic_block_brown);
		registerRender(cobble_mystic_block_green);
		registerRender(cobble_mystic_block_red);
		registerRender(cobble_mystic_block_black);
		
		registerRender(mystic_block_normal);
		registerRender(mystic_block_glass);
		registerRender(mystic_block_white);
		registerRender(mystic_block_orange);
		registerRender(mystic_block_magenta);
		registerRender(mystic_block_lightblue);
		registerRender(mystic_block_yellow);
		registerRender(mystic_block_lime);
		registerRender(mystic_block_pink);
		registerRender(mystic_block_gray);
		registerRender(mystic_block_lightgray);
		registerRender(mystic_block_cyan);
		registerRender(mystic_block_purple);
		registerRender(mystic_block_blue);
		registerRender(mystic_block_brown);
		registerRender(mystic_block_green);
		registerRender(mystic_block_red);
		registerRender(mystic_block_black);
		
		registerRender(wood_mystic_block_normal);
		registerRender(wood_mystic_block_glass);
		registerRender(wood_mystic_block_white);
		registerRender(wood_mystic_block_orange);
		registerRender(wood_mystic_block_magenta);
		registerRender(wood_mystic_block_lightblue);
		registerRender(wood_mystic_block_yellow);
		registerRender(wood_mystic_block_lime);
		registerRender(wood_mystic_block_pink);
		registerRender(wood_mystic_block_gray);
		registerRender(wood_mystic_block_lightgray);
		registerRender(wood_mystic_block_cyan);
		registerRender(wood_mystic_block_purple);
		registerRender(wood_mystic_block_blue);
		registerRender(wood_mystic_block_brown);
		registerRender(wood_mystic_block_green);
		registerRender(wood_mystic_block_red);
		registerRender(wood_mystic_block_black);
		
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
		
		registerRender(dragon_fruit);
		
	}
	
	public static void registerSpecialRenders()
	{
		
		//registerRender(tutorialTileEntity);
		//ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTutorial.class, new RenderEbonheart());
		
	}
	
	public static void registerRender(Block block)
	{
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(block.getRegistryName().toString(), "inventory"));
	}
	
	public static void registerRender(Block block, int meta, String file) 
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), meta, new ModelResourceLocation(Reference.MOD_ID + ":" + file, "inventory"));
	}
}
