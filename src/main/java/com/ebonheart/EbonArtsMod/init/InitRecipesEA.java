package com.ebonheart.EbonArtsMod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
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
		
		
		//GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.arcanite, 9), new Object[]{"A", 'A', InitBlocksEA.arcanite_block});
		
		
	}
	
	public static void initShapelessRecipe()
	{
		
		
		
	}

	public static void initSmeltingRecipe()
	{
		GameRegistry.addSmelting(new ItemStack(InitBlocksEA.draconium_ore), new ItemStack(InitItemsEA.draconium_dust), 10f);
		
		
		
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
