package com.ebonheart.EbonArtsMod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.configs.EbonArtsConfiguration;

public class InitRecipesEA 
{
	public static void initShapedRecipe()
	{
		if(!EbonArtsConfiguration.cheapRecipe)
		{
			GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.draconium_block), new Object[]{"DDD", "DDD", "DDD", 'D', InitItemsEA.draconium_dust});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.draconium_dust, 9), new Object[]{"D", 'D', InitBlocksEA.draconium_block});
			GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.velious_block), new Object[]{"VVV", "VVV", "VVV", 'V', InitItemsEA.velious});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.velious, 9), new Object[]{"V", 'V', InitBlocksEA.velious_block});
			GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.arcanite_block), new Object[]{"AAA", "AAA", "AAA", 'A', InitItemsEA.arcanite});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.arcanite, 9), new Object[]{"A", 'A', InitBlocksEA.arcanite_block});
			GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.katcheen_block), new Object[]{"KKK", "KKK", "KKK", 'K', InitItemsEA.katcheen});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.katcheen, 9), new Object[]{"K", 'K', InitBlocksEA.katcheen_block});
			GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.necrocite_block), new Object[]{"NNN", "NNN", "NNN", 'N', InitItemsEA.necrocite});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.necrocite, 9), new Object[]{"N", 'N', InitBlocksEA.necrocite_block});
			GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.soularite_block), new Object[]{"SSS", "SSS", "SSS", 'S', InitItemsEA.soularite});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.soularite, 9), new Object[]{"S", 'S', InitBlocksEA.soularite_block});
		}
		else 
		{
			GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.draconium_block), new Object[]{"DD", "DD", 'D', InitItemsEA.draconium_dust});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.draconium_dust, 4), new Object[]{"D", 'D', InitBlocksEA.draconium_block});
			GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.velious_block), new Object[]{"VV", "VV", 'V', InitItemsEA.velious});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.velious, 4), new Object[]{"V", 'V', InitBlocksEA.velious_block});
			GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.arcanite_block), new Object[]{"AA", "AA", 'A', InitItemsEA.arcanite});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.arcanite, 4), new Object[]{"A", 'A', InitBlocksEA.arcanite_block});
			GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.katcheen_block), new Object[]{"KK", "KK", 'K', InitItemsEA.katcheen});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.katcheen, 4), new Object[]{"K", 'K', InitBlocksEA.katcheen_block});
			GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.necrocite_block), new Object[]{"NN", "NN", 'N', InitItemsEA.necrocite});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.necrocite, 4), new Object[]{"N", 'N', InitBlocksEA.necrocite_block});
			GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.soularite_block), new Object[]{"SS", "SS", 'S', InitItemsEA.soularite});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.soularite, 4), new Object[]{"S", 'S', InitBlocksEA.soularite_block});
		}
		
		
		
		if(!EbonArtsConfiguration.toolRecipe)
		{
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.arcanite_pickaxe), new Object[]{"AAA", " S ", " S ", 'A', InitItemsEA.arcanite, 'S', Items.stick});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.arcanite_axe), new Object[]{"AA ", "AS ", " S ", 'A', InitItemsEA.arcanite, 'S', Items.stick});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.arcanite_shovel), new Object[]{"A", "S", "S", 'A', InitItemsEA.arcanite, 'S', Items.stick});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.arcanite_hoe), new Object[]{"AA", " S", " S", 'A', InitItemsEA.arcanite, 'S', Items.stick});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.arcanite_sword), new Object[]{"A", "A", "S", 'A', InitItemsEA.arcanite, 'S', Items.stick});
			
			
		}
		else
		{
			
			
		}
		
		
		
		if(!EbonArtsConfiguration.musicRecipe)
		{
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.shimmering_disc, 1), new Object[]{"CCC", "CSC", "CCC", 'C', Blocks.cobblestone,'S', InitItemsEA.velious});
		}
		else
		{
			
		}
		
		
		
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.draconium_block), new Object[]{"DD", "DD", 'D', InitItemsEA.draconium_dust});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.draconium_slab, 6), new Object[]{"DDD", 'D', InitBlocksEA.draconium_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.draconium_stairs, 3), new Object[]{"  D", " DD", "DDD", 'D', InitBlocksEA.draconium_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.draconium_stairs, 3), new Object[]{"D  ", "DD ", "DDD", 'D', InitBlocksEA.draconium_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.draconium_stairs, 3), new Object[]{"DDD", " DD", "  D", 'D', InitBlocksEA.draconium_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.draconium_stairs, 3), new Object[]{"DDD", "DD ", "D  ", 'D', InitBlocksEA.draconium_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.draconium_fence, 4), new Object[]{"D#D", "D#D", 'D', InitBlocksEA.draconium_block, '#', InitItemsEA.draconium_dust});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.draconium_wall, 3), new Object[]{"DDD", "DDD", 'D', InitBlocksEA.draconium_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.draconium_block_brick, 4), new Object[]{"DD", "DD", 'D', InitBlocksEA.draconium_block});
		
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.velious_block), new Object[]{"VV", "VV", 'V', InitItemsEA.velious});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.velious_slab, 6), new Object[]{"VVV", 'V', InitBlocksEA.velious_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.velious_stairs, 3), new Object[]{"  V", " VV", "VVV", 'V', InitBlocksEA.velious_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.velious_stairs, 3), new Object[]{"V  ", "VV ", "VVV", 'V', InitBlocksEA.velious_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.velious_stairs, 3), new Object[]{"VVV", " VV", "  V", 'V', InitBlocksEA.velious_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.velious_stairs, 3), new Object[]{"VVV", "VV ", "V  ", 'V', InitBlocksEA.velious_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.velious_fence, 4), new Object[]{"V#V", "V#V", 'V', InitBlocksEA.velious_block, '#', InitItemsEA.velious});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.velious_wall, 3), new Object[]{"VVV", "VVV", 'V', InitBlocksEA.velious_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.velious_block_brick, 4), new Object[]{"VV", "VV", 'V', InitBlocksEA.velious_block});
		
		
		
		
	}
	
	public static void initShapelessRecipe()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.purified_glowstone), InitItemsEA.draconium_dust, Blocks.glowstone);
		
		
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
		
		if(!EbonArtsConfiguration.decraftRecipe)
		{
			
			
			
			
			GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 4), new ItemStack(Blocks.quartz_block, 1, 0));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 4), new ItemStack(Blocks.quartz_block, 1, 1));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 2), new ItemStack(Blocks.stone_slab, 1, 7));
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.quartz_block, 2), new ItemStack(Blocks.quartz_block, 1, 2));
			GameRegistry.addShapelessRecipe(new ItemStack(Blocks.quartz_block, 6), Blocks.quartz_stairs);
			
			
			
			
			
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
		GameRegistry.addSmelting(new ItemStack(InitBlocksEA.draconium_ore), new ItemStack(InitItemsEA.draconium_dust), 10f);
		
		
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
