package com.ebonheart.EbonArtsMod.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ebonheart.EbonArtsMod.EbonArtsMod;

public class EbonArtsRecipes {

	public static void init()
	{
		GameRegistry.addShapedRecipe(new ItemStack(EbonArtsBlocks.arcanite_block), new Object[]{"MMM", "MMM", "MMM", 'M', EbonArtsItems.mystic_dust});
		GameRegistry.addShapedRecipe(new ItemStack(EbonArtsItems.mystic_dust, 9), new Object[]{"B", 'B', EbonArtsBlocks.arcanite_block});
		GameRegistry.addShapedRecipe(new ItemStack(EbonArtsBlocks.purified_mystic_block), new Object[]{"MMM", "MMM", "MMM", 'M', EbonArtsItems.purified_mystic_dust});
		GameRegistry.addShapedRecipe(new ItemStack(EbonArtsItems.purified_mystic_dust, 9), new Object[]{"B", 'B', EbonArtsBlocks.purified_mystic_block});
		GameRegistry.addShapedRecipe(new ItemStack(EbonArtsItems.ebon_sigil), new Object[]{"MMM", "MBM", "MDM", 'M', EbonArtsItems.mystic_dust, 'B', Items.book, 'D', Items.diamond});
		
		GameRegistry.addSmelting(new ItemStack(EbonArtsItems.mystic_dust), new ItemStack(EbonArtsItems.purified_mystic_dust), 10);
	}
}
