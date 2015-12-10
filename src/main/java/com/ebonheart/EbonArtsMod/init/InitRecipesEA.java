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
			GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.arcanite_block), new Object[]{"AAA", "AAA", "AAA", 'A', InitItemsEA.arcanite});
		}
		else
		{
			GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.arcanite_block), new Object[]{"A", "A", "A", 'A', InitItemsEA.arcanite});
		}
		
		GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.arcanite, 9), new Object[]{"A", 'A', InitBlocksEA.arcanite_block});
		
		
	}
	
	public static void initShapelessRecipe()
	{
		
		
		
	}

	public static void initSmeltingRecipe()
	{
		
		
		
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
