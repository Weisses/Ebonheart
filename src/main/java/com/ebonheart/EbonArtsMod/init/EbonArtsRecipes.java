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
		GameRegistry.addShapedRecipe(new ItemStack(EbonArtsBlocks.mystic_block), new Object[]{"MMM", "MMM", "MMM", 'M', EbonArtsItems.mystic_dust});
		GameRegistry.addShapedRecipe(new ItemStack(EbonArtsItems.mystic_dust, 9), new Object[]{"B", 'B', EbonArtsBlocks.mystic_block});
		GameRegistry.addShapedRecipe(new ItemStack(EbonArtsItems.ebon_sigil), new Object[]{"MMM", "MBM", "MDM", 'M', EbonArtsItems.mystic_dust, 'B', Items.book, 'D', Items.diamond});
		
	}
}
