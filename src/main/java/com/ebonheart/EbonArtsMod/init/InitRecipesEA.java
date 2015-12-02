package com.ebonheart.EbonArtsMod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ebonheart.EbonArtsMod.EbonArtsMod;

public class InitRecipesEA {

	public static void init()
	{
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.arcanite_block), new Object[]{"MMM", "MMM", "MMM", 'M', InitItemsEA.item_arcanite});
		GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.item_arcanite, 9), new Object[]{"B", 'B', InitBlocksEA.arcanite_block});
		
		
		
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.purified_mystic_block), new Object[]{"MMM", "MMM", "MMM", 'M', InitItemsEA.purified_mystic_dust});
		GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.purified_mystic_dust, 9), new Object[]{"B", 'B', InitBlocksEA.purified_mystic_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.ebon_sigil), new Object[]{"MMM", "MBM", "MDM", 'M', InitItemsEA.mystic_dust, 'B', Items.book, 'D', Items.diamond});
		
		GameRegistry.addSmelting(new ItemStack(InitItemsEA.mystic_dust), new ItemStack(InitItemsEA.purified_mystic_dust), 10);
	
	}
}
