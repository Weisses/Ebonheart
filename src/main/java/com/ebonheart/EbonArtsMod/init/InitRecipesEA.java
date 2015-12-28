package com.ebonheart.EbonArtsMod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.configs.EbonArtsConfiguration;

public class InitRecipesEA {
	
	public static void initShapedRecipe()
	{
		
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new Object[]{"CCC", "CDC", "CCC", 'D', InitItemsEA.draconium_dust, 'C', Blocks.cobblestone});
		//GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.necrocite_block, InitBlocksEA.arcanite_block), new Object[]{"NN", "NN", 'N', InitItemsEA.necrocite});
		
		//GameRegistry.addShapedRecipe(new ItemStack(InitTileEntitiesEA.Banana_Plant), new Object[]{"DN", "ND", 'D', InitItemsEA.draconium_dust, 'N', Items.quartz});
		
		
		
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.draconium_block), new Object[]{"DD", "DD", 'D', InitItemsEA.draconium_dust});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.draconium_slab, 6), new Object[]{"DDD", 'D', InitBlocksEA.draconium_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.draconium_stairs, 3), new Object[]{"  D", " DD", "DDD", 'D', InitBlocksEA.draconium_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.draconium_stairs, 3), new Object[]{"D  ", "DD ", "DDD", 'D', InitBlocksEA.draconium_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.draconium_stairs, 3), new Object[]{"DDD", " DD", "  D", 'D', InitBlocksEA.draconium_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.draconium_stairs, 3), new Object[]{"DDD", "DD ", "D  ", 'D', InitBlocksEA.draconium_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.draconium_fence, 3), new Object[]{"D#D", "D#D", 'D', InitBlocksEA.draconium_block, '#', InitItemsEA.draconium_dust});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.draconium_wall, 3), new Object[]{"DDD", "DDD", 'D', InitBlocksEA.draconium_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.draconium_block_brick, 4), new Object[]{"DD", "DD", 'D', InitBlocksEA.draconium_block});
		
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.velious_block), new Object[]{"VV", "VV", 'V', InitItemsEA.velious});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.velious_slab, 6), new Object[]{"VVV", 'V', InitBlocksEA.velious_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.velious_stairs, 3), new Object[]{"  V", " VV", "VVV", 'V', InitBlocksEA.velious_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.velious_stairs, 3), new Object[]{"V  ", "VV ", "VVV", 'V', InitBlocksEA.velious_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.velious_stairs, 3), new Object[]{"VVV", " VV", "  V", 'V', InitBlocksEA.velious_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.velious_stairs, 3), new Object[]{"VVV", "VV ", "V  ", 'V', InitBlocksEA.velious_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.velious_fence, 3), new Object[]{"V#V", "V#V", 'V', InitBlocksEA.velious_block, '#', InitItemsEA.velious});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.velious_wall, 3), new Object[]{"VVV", "VVV", 'V', InitBlocksEA.velious_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.velious_block_brick, 4), new Object[]{"VV", "VV", 'V', InitBlocksEA.velious_block});
		
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.arcanite_block), new Object[]{"AA", "AA", 'A', InitItemsEA.arcanite});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.arcanite_slab, 6), new Object[]{"AAA", 'A', InitBlocksEA.arcanite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.arcanite_stairs, 3), new Object[]{"  A", " AA", "AAA", 'A', InitBlocksEA.arcanite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.arcanite_stairs, 3), new Object[]{"A  ", "AA ", "AAA", 'A', InitBlocksEA.arcanite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.arcanite_stairs, 3), new Object[]{"AAA", " AA", "  A", 'A', InitBlocksEA.arcanite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.arcanite_stairs, 3), new Object[]{"AAA", "AA ", "A  ", 'A', InitBlocksEA.arcanite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.arcanite_fence, 3), new Object[]{"A#A", "A#A", 'A', InitBlocksEA.arcanite_block, '#', InitItemsEA.arcanite});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.arcanite_wall, 3), new Object[]{"AAA", "AAA", 'A', InitBlocksEA.arcanite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.arcanite_block_brick, 4), new Object[]{"AA", "AA", 'A', InitBlocksEA.arcanite_block});
		
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.katcheen_block), new Object[]{"KK", "KK", 'K', InitItemsEA.katcheen});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.katcheen_slab, 6), new Object[]{"KKK", 'K', InitBlocksEA.katcheen_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.katcheen_stairs, 3), new Object[]{"  K", " KK", "KKK", 'K', InitBlocksEA.katcheen_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.katcheen_stairs, 3), new Object[]{"K  ", "KK ", "KKK", 'K', InitBlocksEA.katcheen_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.katcheen_stairs, 3), new Object[]{"KKK", " KK", "  K", 'K', InitBlocksEA.katcheen_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.katcheen_stairs, 3), new Object[]{"KKK", "KK ", "K  ", 'K', InitBlocksEA.katcheen_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.katcheen_fence, 3), new Object[]{"K#K", "K#K", 'K', InitBlocksEA.katcheen_block, '#', InitItemsEA.katcheen});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.katcheen_wall, 3), new Object[]{"KKK", "KKK", 'K', InitBlocksEA.katcheen_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.katcheen_block_brick, 4), new Object[]{"KK", "KK", 'K', InitBlocksEA.katcheen_block});
		
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.necrocite_block), new Object[]{"NN", "NN", 'N', InitItemsEA.necrocite});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.necrocite_slab, 6), new Object[]{"NNN", 'N', InitBlocksEA.necrocite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.necrocite_stairs, 3), new Object[]{"  N", " NN", "NNN", 'N', InitBlocksEA.necrocite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.necrocite_stairs, 3), new Object[]{"N  ", "NN ", "NNN", 'N', InitBlocksEA.necrocite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.necrocite_stairs, 3), new Object[]{"NNN", " NN", "  N", 'N', InitBlocksEA.necrocite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.necrocite_stairs, 3), new Object[]{"NNN", "NN ", "N  ", 'N', InitBlocksEA.necrocite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.necrocite_fence, 3), new Object[]{"N#N", "N#N", 'N', InitBlocksEA.necrocite_block, '#', InitItemsEA.necrocite});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.necrocite_wall, 3), new Object[]{"NNN", "NNN", 'N', InitBlocksEA.necrocite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.necrocite_block_brick, 4), new Object[]{"NN", "NN", 'N', InitBlocksEA.necrocite_block});
		
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.soularite_block), new Object[]{"SS", "SS", 'S', InitItemsEA.soularite});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.soularite_slab, 6), new Object[]{"SSS", 'S', InitBlocksEA.soularite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.soularite_stairs, 3), new Object[]{"  S", " SS", "SSS", 'S', InitBlocksEA.soularite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.soularite_stairs, 3), new Object[]{"S  ", "SS ", "SSS", 'S', InitBlocksEA.soularite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.soularite_stairs, 3), new Object[]{"SSS", " SS", "  S", 'S', InitBlocksEA.soularite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.soularite_stairs, 3), new Object[]{"SSS", "SS ", "S  ", 'S', InitBlocksEA.soularite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.soularite_fence, 3), new Object[]{"S#S", "S#S", 'S', InitBlocksEA.soularite_block, '#', InitItemsEA.soularite});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.soularite_wall, 3), new Object[]{"SSS", "SSS", 'S', InitBlocksEA.soularite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.soularite_block_brick, 4), new Object[]{"SS", "SS", 'S', InitBlocksEA.soularite_block});
		
		
		
		if(!EbonArtsConfiguration.toolRecipe)
		{
			
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.arcanite_pickaxe), new Object[]{"AAA", " S ", " S ", 'A', InitItemsEA.arcanite, 'S', Items.stick});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.arcanite_axe), new Object[]{"AA ", "AS ", " S ", 'A', InitItemsEA.arcanite, 'S', Items.stick});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.arcanite_shovel), new Object[]{"A", "S", "S", 'A', InitItemsEA.arcanite, 'S', Items.stick});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.arcanite_hoe), new Object[]{"AA", " S", " S", 'A', InitItemsEA.arcanite, 'S', Items.stick});
			
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.katcheen_pickaxe), new Object[]{"KKK", " S ", " S ", 'K', InitItemsEA.katcheen, 'S', Items.stick});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.katcheen_axe), new Object[]{"KK ", "KS ", " S ", 'K', InitItemsEA.katcheen, 'S', Items.stick});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.katcheen_shovel), new Object[]{"K", "S", "S", 'K', InitItemsEA.katcheen, 'S', Items.stick});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.katcheen_hoe), new Object[]{"KK", " S", " S", 'K', InitItemsEA.katcheen, 'S', Items.stick});
			
		}
		else
		{
			
		}
		
		
		
		if(!EbonArtsConfiguration.weaponRecipe)
		{
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.arcanite_sword), new Object[]{"A", "A", "S", 'A', InitItemsEA.arcanite, 'S', Items.stick});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.katcheen_sword), new Object[]{"K", "K", "S", 'K', InitItemsEA.katcheen, 'S', Items.stick});
			
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.empowered_sword), new Object[]{"DDD", "D#D", "DDD", 'D', InitItemsEA.draconium_dust, '#', Items.diamond_sword});
			
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.frostbite), new Object[]{"VVV", "V#V", "VVV", 'V', InitItemsEA.velious, '#', InitItemsEA.empowered_sword});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.massacre), new Object[]{"AAA", "A#A", "AAA", 'A', InitItemsEA.arcanite, '#', InitItemsEA.empowered_sword});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.blazefury), new Object[]{"KKK", "K#K", "KKK", 'K', InitItemsEA.katcheen, '#', InitItemsEA.empowered_sword});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.despair), new Object[]{"NNN", "N#N", "NNN", 'N', InitItemsEA.necrocite, '#', InitItemsEA.empowered_sword});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.souleater), new Object[]{"SSS", "S#S", "SSS", 'S', InitItemsEA.soularite, '#', InitItemsEA.empowered_sword});
			
			
		}
		else
		{
			
		}
		
		
		
		if(!EbonArtsConfiguration.armorRecipe)
		{
			
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.arcanite_helmet), new Object[]{"AAA", "A A", 'A', InitItemsEA.arcanite});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.arcanite_chestplate), new Object[]{"A A", "AAA", "AAA", 'A', InitItemsEA.arcanite});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.arcanite_leggings), new Object[]{"AAA", "A A", "A A", 'A', InitItemsEA.arcanite});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.arcanite_boots), new Object[]{"A A", "A A", 'A', InitItemsEA.arcanite});
			
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.katcheen_helmet), new Object[]{"KKK", "K K", 'K', InitItemsEA.katcheen});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.katcheen_chestplate), new Object[]{"K K", "KKK", "KKK", 'K', InitItemsEA.katcheen});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.katcheen_leggings), new Object[]{"KKK", "K K", "K K", 'K', InitItemsEA.katcheen});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.katcheen_boots), new Object[]{"K K", "K K", 'K', InitItemsEA.katcheen});
			
		}
		else
		{
			
		}
		
		
		
		if(!EbonArtsConfiguration.musicRecipe)
		{
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.shimmering_disc, 1), new Object[]{"CCC", "CVC", "CCC", 'C', Blocks.cobblestone,'V', InitItemsEA.velious});
		}
		else
		{
			
		}
		
		
		
		if(!EbonArtsConfiguration.horseRecipe)
		{
			
			GameRegistry.addShapedRecipe(new ItemStack(Items.saddle), new Object[]{"LLL", "LIL", "I I", 'L', Items.leather, 'I', Items.iron_ingot});
			GameRegistry.addShapedRecipe(new ItemStack(Items.iron_horse_armor), new Object[]{"  I", "ISI", "III", 'I', Items.iron_ingot, 'S', Items.saddle});
			GameRegistry.addShapedRecipe(new ItemStack(Items.golden_horse_armor), new Object[]{"  G", "GSG", "GGG", 'G', Items.gold_ingot, 'S', Items.saddle});
			GameRegistry.addShapedRecipe(new ItemStack(Items.diamond_horse_armor), new Object[]{"  D", "DSD", "DDD", 'D', Items.diamond, 'S', Items.saddle});
			
		}
		else
		{
			
		}
		
	}
	
	public static void initShapelessRecipe()
	{
		
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 0), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 15));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 1), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 14));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 2), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 13));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 3), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 12));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 4), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 11));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 5), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 10));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 6), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 9));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 7), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 8));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 8), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 7));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 9), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 6));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 10), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 5));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 11), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 4));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 12), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 3));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 13), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 2));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 14), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 15), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 0));
		
		//GameRegistry.addShapelessRecipe(new ItemStack(InitTileEntitiesEA.Banana_Plant), new Object[] {InitItemsEA.draconium_dust, new ItemStack(Blocks.sapling)});
		//GameRegistry.addShapelessRecipe(new ItemStack(InitTileEntitiesEA.Banana_Plant), InitItemsEA.draconium_dust, new ItemStack(Blocks.sapling, 1, 1));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitTileEntitiesEA.Banana_Plant), InitItemsEA.draconium_dust, new ItemStack(Blocks.sapling, 1, 2));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitTileEntitiesEA.Banana_Plant), InitItemsEA.draconium_dust, new ItemStack(Blocks.sapling, 1, 3));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitTileEntitiesEA.Banana_Plant), InitItemsEA.draconium_dust, new ItemStack(Blocks.sapling, 1, 4));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitTileEntitiesEA.Banana_Plant), InitItemsEA.draconium_dust, new ItemStack(Blocks.sapling, 1, 5));
		
		//GameRegistry.addRecipe(new ItemStack(InitTileEntitiesEA.Banana_Plant), new Object[] {"S", 'S', Blocks.sapling});
		
		
		
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.purified_glowstone), InitItemsEA.draconium_dust, Blocks.glowstone);
		
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), InitItemsEA.draconium_dust, Blocks.glowstone);
		
		
		
		
		
		
		
		
		if(!EbonArtsConfiguration.musicRecipe)
		{
			
			GameRegistry.addShapelessRecipe(new ItemStack(Items.record_13), InitItemsEA.shimmering_disc, new ItemStack(Items.dye, 1, 11));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.record_cat), InitItemsEA.shimmering_disc, new ItemStack(Items.dye, 1, 2));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.record_blocks), InitItemsEA.shimmering_disc, new ItemStack(Items.dye, 1, 14));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.record_chirp), InitItemsEA.shimmering_disc, new ItemStack(Items.dye, 1, 1));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.record_far), InitItemsEA.shimmering_disc, new ItemStack(Items.dye, 1, 10));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.record_mall), InitItemsEA.shimmering_disc, new ItemStack(Items.dye, 1, 4));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.record_mellohi), InitItemsEA.shimmering_disc, new ItemStack(Items.dye, 1, 5));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.record_stal), InitItemsEA.shimmering_disc, new ItemStack(Items.dye, 1, 0));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.record_strad), InitItemsEA.shimmering_disc, new ItemStack(Items.dye, 1, 15));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.record_ward), InitItemsEA.shimmering_disc, new ItemStack(Items.dye, 1, 6));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.record_11), InitItemsEA.shimmering_disc, new ItemStack(Items.dye, 1, 8));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.record_wait), InitItemsEA.shimmering_disc, new ItemStack(Items.dye, 1, 12));
			
		}
		else
		{
			
		}
		
		
		
		if(!EbonArtsConfiguration.decraftRecipe1)
		{
			
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.draconium_dust, 4), new ItemStack(InitBlocksEA.draconium_block));
			GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.draconium_block), new ItemStack(InitBlocksEA.draconium_block_brick));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.draconium_dust, 2), new ItemStack(InitBlocksEA.draconium_slab));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.draconium_dust, 6), new ItemStack(InitBlocksEA.draconium_fence));
			GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.draconium_block, 2), new ItemStack(InitBlocksEA.draconium_wall));
			GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.draconium_block, 2), InitBlocksEA.draconium_stairs);
			
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.soularite, 4), new ItemStack(InitBlocksEA.soularite_block));
			GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.soularite_block), new ItemStack(InitBlocksEA.soularite_block_brick));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.soularite, 2), new ItemStack(InitBlocksEA.soularite_slab));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.soularite, 6), new ItemStack(InitBlocksEA.soularite_fence));
			GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.soularite_block, 2), new ItemStack(InitBlocksEA.soularite_wall));
			GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.soularite_block, 2), InitBlocksEA.soularite_stairs);
			
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.arcanite, 4), new ItemStack(InitBlocksEA.arcanite_block));
			GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.arcanite_block), new ItemStack(InitBlocksEA.arcanite_block_brick));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.arcanite, 2), new ItemStack(InitBlocksEA.arcanite_slab));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.arcanite, 6), new ItemStack(InitBlocksEA.arcanite_fence));
			GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.arcanite_block, 2), new ItemStack(InitBlocksEA.arcanite_wall));
			GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.arcanite_block, 2), InitBlocksEA.arcanite_stairs);
			
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.katcheen, 4), new ItemStack(InitBlocksEA.katcheen_block));
			GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.katcheen_block), new ItemStack(InitBlocksEA.katcheen_block_brick));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.katcheen, 2), new ItemStack(InitBlocksEA.katcheen_slab));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.katcheen, 6), new ItemStack(InitBlocksEA.katcheen_fence));
			GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.katcheen_block, 2), new ItemStack(InitBlocksEA.katcheen_wall));
			GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.katcheen_block, 2), InitBlocksEA.katcheen_stairs);
			
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.necrocite, 4), new ItemStack(InitBlocksEA.necrocite_block));
			GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.necrocite_block), new ItemStack(InitBlocksEA.necrocite_block_brick));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.necrocite, 2), new ItemStack(InitBlocksEA.necrocite_slab));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.necrocite, 6), new ItemStack(InitBlocksEA.necrocite_fence));
			GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.necrocite_block, 2), new ItemStack(InitBlocksEA.necrocite_wall));
			GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.necrocite_block, 2), InitBlocksEA.necrocite_stairs);
			
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.soularite, 4), new ItemStack(InitBlocksEA.soularite_block));
			GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.soularite_block), new ItemStack(InitBlocksEA.soularite_block_brick));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.soularite, 2), new ItemStack(InitBlocksEA.soularite_slab));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.soularite, 6), new ItemStack(InitBlocksEA.soularite_fence));
			GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.soularite_block, 2), new ItemStack(InitBlocksEA.soularite_wall));
			GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.soularite_block, 2), InitBlocksEA.soularite_stairs);
			
		}
		else
		{
			
		}
		
		
		
		if(!EbonArtsConfiguration.decraftRecipe2)
		{
			
			GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 4), new ItemStack(Blocks.quartz_block, 1, 0));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 4), new ItemStack(Blocks.quartz_block, 1, 1));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 2), new ItemStack(Blocks.stone_slab, 1, 7));
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.quartz_block, 1), new ItemStack(Blocks.quartz_block, 1, 2));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 6), Blocks.quartz_stairs);
			
			
			
			
			
			GameRegistry.addShapelessRecipe(new ItemStack(Items.clay_ball, 4), Blocks.clay);
			GameRegistry.addShapelessRecipe(new ItemStack(Items.snowball, 4), Blocks.snow);
			
			
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 4), Blocks.crafting_table);
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 8), Blocks.chest);
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone, 8), Blocks.furnace);
			GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 5), Items.minecart);
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 5), Items.boat);
			
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 1), Blocks.wooden_button);
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.stone, 1), Blocks.stone_button);
			
			
			
			
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.stone, 2), Blocks.stone_pressure_plate);
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2), Blocks.wooden_pressure_plate);
			GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 2), Blocks.heavy_weighted_pressure_plate);
			GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 2), Blocks.light_weighted_pressure_plate);
			
			
			
			
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 3), Blocks.trapdoor);
			GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 4), Blocks.iron_trapdoor);
			
			
			
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 0), Items.oak_door);
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 1), Items.spruce_door);
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 2), Items.birch_door);
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 3), Items.jungle_door);
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 4), Items.acacia_door);
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 5), Items.dark_oak_door);
			GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 2), Items.iron_door);
			
			
			
			GameRegistry.addShapelessRecipe(new ItemStack(Items.glowstone_dust, 4), Blocks.glowstone);
			
			
		}
		else
		{
			
		}
		
	}
	
	public static void initSmeltingRecipe()
	{
		//GameRegistry.addSmelting(new ItemStack(InitBlocksEA.draconium_ore), new ItemStack(InitItemsEA.draconium_dust), 10f);
		
		
		//smelting stone back into cobblestone.
		//GameRegistry.addSmelting(new ItemStack(Blocks.cobblestone), new ItemStack(Blocks.stone), 0.1f);
		
		
	}
	
	
	
	
	//public static void init()
	//{
		//if(!EbonArtsConfiguration.cheapRecipe)
		//{
		//	GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.arcanite_block_normal), new Object[]{"AAA", "AAA", "AAA", 'A', InitItemsEA.arcanite});
		//}
		//else
		//{
		//	GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.arcanite_block_normal), new Object[]{"A", "A", "A", 'A', InitItemsEA.arcanite});
		//}
		
		
		
		//GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.arcanite_block_normal), new Object[]{"AAA", "AAA", "AAA", 'A', InitItemsEA.arcanite});
		//GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.arcanite, 9), new Object[]{"A", 'A', InitBlocksEA.arcanite_block_normal});
		
		
		
		//GameRegistry.addRecipe(new ItemStack(InitBlocksEA.purified_mystic_block), new Object[]{"MMM", "MMM", "MMM", 'M', InitItemsEA.purified_mystic_dust});
		//GameRegistry.addRecipe(new ItemStack(InitItemsEA.purified_mystic_dust, 9), new Object[]{"B", 'B', InitBlocksEA.purified_mystic_block});
		//GameRegistry.addRecipe(new ItemStack(InitItemsEA.ebon_sigil), new Object[]{"MMM", "MBM", "MDM", 'M', InitItemsEA.mystic_dust, 'B', Items.book, 'D', Items.diamond});
		
		
		
		//GameRegistry.addSmelting(new ItemStack(InitBlocksEA.draconium_ore), new ItemStack(InitItemsEA.draconium_dust), 10f);
		
		
		
		
		//Examples I created
		
		//GameRegistry.addRecipe(new ItemStack(ModBlocks.tutorialBlock),	"##","##",	'#', ModItems.tutorialItem);
		//or: GameRegistry.addRecipe(new ItemStack(ModBlocks.tutorialBlock), new Object[]{"##","##", '#', ModItems.tutorialItem});

		//GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tutorialItem), Items.redstone, new ItemStack(Items.dye, 1, 4));
		//or: GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tutorialItem), new Object[]{Items.redstone, new ItemStack(Items.dye, 1, 4)});

		//GameRegistry.addSmelting(Items.diamond, new ItemStack(ModItems.tutorialItem), 1.0f);
	
	//}
}
