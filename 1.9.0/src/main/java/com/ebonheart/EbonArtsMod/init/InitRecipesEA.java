package com.ebonheart.EbonArtsMod.init;

import net.minecraft.block.BlockRedSandstone.EnumType;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.configs.EbonArtsConfiguration;

public class InitRecipesEA {
	
	public static void initShapedRecipe()
	{
		
		GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.enchanted_ebonheart, 1), new Object[]{"EGE", "G#G", "EGE", 'G', Items.glowstone_dust, 'E', Items.ender_pearl, '#', InitItemsEA.ebonheart});
		
		GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.glowing_disc, 1), new Object[]{"DDD", "D#D", "DDD", '#', Items.diamond,'D', InitItemsEA.draconium_dust});
		GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.shimmering_disc, 1), new Object[]{"VVV", "V#V", "VVV", '#', Items.diamond,'V', InitItemsEA.velious});
		GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.laminate_disc, 1), new Object[]{"AAA", "A#A", "AAA", '#', Items.diamond,'A', InitItemsEA.arcanite});
		GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.resilient_disc, 1), new Object[]{"KKK", "K#K", "KKK", '#', Items.diamond,'K', InitItemsEA.katcheen});
		GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.dismal_disc, 1), new Object[]{"NNN", "N#N", "NNN", '#', Items.diamond,'N', InitItemsEA.necrocite});
		GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.ethereal_disc, 1), new Object[]{"SSS", "S#S", "SSS", '#', Items.diamond,'S', InitItemsEA.soularite});
		
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal, 8), new Object[]{"CCC", "CEC", "CCC", 'E', InitItemsEA.ebonheart, 'C', Blocks.cobblestone});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.mystic_block_normal, 8), new Object[]{"SSS", "SES", "SSS", 'E', InitItemsEA.ebonheart, 'S', Blocks.stone});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_normal, 8), new Object[]{"WWW", "WEW", "WWW", 'E', InitItemsEA.ebonheart, 'W', Blocks.planks});
		
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.paper_block), new Object[]{"PPP", "PPP", "PPP", 'P', Items.paper});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.reed_block), new Object[]{"RRR", "RRR", "RRR", 'R', Items.reeds});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.leather_block), new Object[]{"LLL", "LLL", "LLL", 'L', Items.leather});
		
		GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.obsidian_shards), new Object[]{"DGD", "GQG", "DGD", 'D', InitItemsEA.draconium_dust, 'G', Items.gunpowder, 'Q', Items.quartz});
		GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.obsidian_shards, 4), new Object[]{"DGD", "GQG", "DGD", 'D', InitItemsEA.draconium_dust, 'G', Items.gunpowder, 'Q', Blocks.obsidian});
		GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.glowstone_shards), new Object[]{"DGD", "GQG", "DGD", 'D', InitItemsEA.draconium_dust, 'G', Items.gunpowder, 'Q', Items.glowstone_dust});
		GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.glowstone_shards, 4), new Object[]{"DGD", "GQG", "DGD", 'D', InitItemsEA.draconium_dust, 'G', Items.gunpowder, 'Q', Blocks.glowstone});
		
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.draconium_block), new Object[]{"##", "##", '#', InitItemsEA.draconium_dust});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.draconium_slab, 6), new Object[]{"DDD", 'D', InitBlocksEA.draconium_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.draconium_stairs, 4), new Object[]{"  D", " DD", "DDD", 'D', InitBlocksEA.draconium_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.draconium_stairs, 4), new Object[]{"D  ", "DD ", "DDD", 'D', InitBlocksEA.draconium_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.draconium_stairs, 4), new Object[]{"DDD", " DD", "  D", 'D', InitBlocksEA.draconium_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.draconium_stairs, 4), new Object[]{"DDD", "DD ", "D  ", 'D', InitBlocksEA.draconium_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.draconium_fence, 3), new Object[]{"D#D", "D#D", 'D', InitBlocksEA.draconium_block, '#', InitItemsEA.draconium_dust});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.draconium_fence_gate), new Object[]{"#D#", "#D#", 'D', InitBlocksEA.draconium_block, '#', InitItemsEA.draconium_dust});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.draconium_wall, 3), new Object[]{"DDD", "DDD", 'D', InitBlocksEA.draconium_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.draconium_block_brick, 4), new Object[]{"DD", "DD", 'D', InitBlocksEA.draconium_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.draconium_torch, 4), new Object[]{"C", "D", 'D', InitBlocksEA.draconium_block, 'C', Items.coal});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.draconium_torch, 4), new Object[]{"C", "D", 'D', InitBlocksEA.draconium_block, 'C', new ItemStack(Items.coal, 1, 1)});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.draconium_ladder, 4), new Object[]{"D D", "DDD", "D D", 'D', InitBlocksEA.draconium_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.draconium_pillar, 2), new Object[]{"D", "D", 'D', InitBlocksEA.draconium_block});
		
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.velious_block), new Object[]{"##", "##", '#', InitItemsEA.velious});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.velious_slab, 6), new Object[]{"VVV", 'V', InitBlocksEA.velious_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.velious_stairs, 4), new Object[]{"  V", " VV", "VVV", 'V', InitBlocksEA.velious_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.velious_stairs, 4), new Object[]{"V  ", "VV ", "VVV", 'V', InitBlocksEA.velious_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.velious_stairs, 4), new Object[]{"VVV", " VV", "  V", 'V', InitBlocksEA.velious_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.velious_stairs, 4), new Object[]{"VVV", "VV ", "V  ", 'V', InitBlocksEA.velious_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.velious_fence, 3), new Object[]{"V#V", "V#V", 'V', InitBlocksEA.velious_block, '#', InitItemsEA.velious});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.velious_fence_gate), new Object[]{"#V#", "#V#", 'V', InitBlocksEA.velious_block, '#', InitItemsEA.velious});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.velious_wall, 3), new Object[]{"VVV", "VVV", 'V', InitBlocksEA.velious_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.velious_block_brick, 4), new Object[]{"VV", "VV", 'V', InitBlocksEA.velious_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.velious_torch, 4), new Object[]{"C", "V", 'V', InitBlocksEA.velious_block, 'C', Items.coal});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.velious_torch, 4), new Object[]{"C", "V", 'V', InitBlocksEA.velious_block, 'C', new ItemStack(Items.coal, 1, 1)});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.velious_ladder, 4), new Object[]{"V V", "VVV", "V V", 'V', InitBlocksEA.velious_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.velious_pillar, 2), new Object[]{"V", "V", 'V', InitBlocksEA.velious_block});
		
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.arcanite_block), new Object[]{"##", "##", '#', InitItemsEA.arcanite});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.arcanite_slab, 6), new Object[]{"AAA", 'A', InitBlocksEA.arcanite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.arcanite_stairs, 4), new Object[]{"  A", " AA", "AAA", 'A', InitBlocksEA.arcanite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.arcanite_stairs, 4), new Object[]{"A  ", "AA ", "AAA", 'A', InitBlocksEA.arcanite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.arcanite_stairs, 4), new Object[]{"AAA", " AA", "  A", 'A', InitBlocksEA.arcanite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.arcanite_stairs, 4), new Object[]{"AAA", "AA ", "A  ", 'A', InitBlocksEA.arcanite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.arcanite_fence, 3), new Object[]{"A#A", "A#A", 'A', InitBlocksEA.arcanite_block, '#', InitItemsEA.arcanite});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.arcanite_fence_gate), new Object[]{"#A#", "#A#", 'A', InitBlocksEA.arcanite_block, '#', InitItemsEA.arcanite});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.arcanite_wall, 3), new Object[]{"AAA", "AAA", 'A', InitBlocksEA.arcanite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.arcanite_block_brick, 4), new Object[]{"AA", "AA", 'A', InitBlocksEA.arcanite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.arcanite_torch, 4), new Object[]{"C", "A", 'A', InitBlocksEA.arcanite_block, 'C', Items.coal});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.arcanite_torch, 4), new Object[]{"C", "A", 'A', InitBlocksEA.arcanite_block, 'C', new ItemStack(Items.coal, 1, 1)});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.arcanite_ladder, 4), new Object[]{"A A", "AAA", "A A", 'A', InitBlocksEA.arcanite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.arcanite_pillar, 2), new Object[]{"A", "A", 'A', InitBlocksEA.arcanite_block});
		
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.katcheen_block), new Object[]{"##", "##", '#', InitItemsEA.katcheen});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.katcheen_slab, 6), new Object[]{"KKK", 'K', InitBlocksEA.katcheen_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.katcheen_stairs, 4), new Object[]{"  K", " KK", "KKK", 'K', InitBlocksEA.katcheen_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.katcheen_stairs, 4), new Object[]{"K  ", "KK ", "KKK", 'K', InitBlocksEA.katcheen_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.katcheen_stairs, 4), new Object[]{"KKK", " KK", "  K", 'K', InitBlocksEA.katcheen_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.katcheen_stairs, 4), new Object[]{"KKK", "KK ", "K  ", 'K', InitBlocksEA.katcheen_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.katcheen_fence, 3), new Object[]{"K#K", "K#K", 'K', InitBlocksEA.katcheen_block, '#', InitItemsEA.katcheen});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.katcheen_fence_gate), new Object[]{"#K#", "#K#", 'K', InitBlocksEA.katcheen_block, '#', InitItemsEA.katcheen});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.katcheen_wall, 3), new Object[]{"KKK", "KKK", 'K', InitBlocksEA.katcheen_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.katcheen_block_brick, 4), new Object[]{"KK", "KK", 'K', InitBlocksEA.katcheen_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.katcheen_torch, 4), new Object[]{"C", "K", 'K', InitBlocksEA.katcheen_block, 'C', Items.coal});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.katcheen_torch, 4), new Object[]{"C", "K", 'K', InitBlocksEA.katcheen_block, 'C', new ItemStack(Items.coal, 1, 1)});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.katcheen_ladder, 4), new Object[]{"K K", "KKK", "K K", 'K', InitBlocksEA.katcheen_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.katcheen_pillar, 2), new Object[]{"K", "K", 'K', InitBlocksEA.katcheen_block});
		
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.necrocite_block), new Object[]{"##", "##", '#', InitItemsEA.necrocite});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.necrocite_slab, 6), new Object[]{"NNN", 'N', InitBlocksEA.necrocite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.necrocite_stairs, 4), new Object[]{"  N", " NN", "NNN", 'N', InitBlocksEA.necrocite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.necrocite_stairs, 4), new Object[]{"N  ", "NN ", "NNN", 'N', InitBlocksEA.necrocite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.necrocite_stairs, 4), new Object[]{"NNN", " NN", "  N", 'N', InitBlocksEA.necrocite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.necrocite_stairs, 4), new Object[]{"NNN", "NN ", "N  ", 'N', InitBlocksEA.necrocite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.necrocite_fence, 3), new Object[]{"N#N", "N#N", 'N', InitBlocksEA.necrocite_block, '#', InitItemsEA.necrocite});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.necrocite_fence_gate), new Object[]{"#N#", "#N#", 'N', InitBlocksEA.necrocite_block, '#', InitItemsEA.necrocite});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.necrocite_wall, 3), new Object[]{"NNN", "NNN", 'N', InitBlocksEA.necrocite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.necrocite_block_brick, 4), new Object[]{"NN", "NN", 'N', InitBlocksEA.necrocite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.necrocite_torch, 4), new Object[]{"C", "N", 'N', InitBlocksEA.necrocite_block, 'C', Items.coal});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.necrocite_torch, 4), new Object[]{"C", "N", 'N', InitBlocksEA.necrocite_block, 'C', new ItemStack(Items.coal, 1, 1)});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.necrocite_ladder, 4), new Object[]{"N N", "NNN", "N N", 'N', InitBlocksEA.necrocite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.necrocite_pillar, 2), new Object[]{"N", "N", 'N', InitBlocksEA.necrocite_block});
		
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.soularite_block), new Object[]{"##", "##", '#', InitItemsEA.soularite});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.soularite_slab, 6), new Object[]{"SSS", 'S', InitBlocksEA.soularite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.soularite_stairs, 4), new Object[]{"  S", " SS", "SSS", 'S', InitBlocksEA.soularite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.soularite_stairs, 4), new Object[]{"S  ", "SS ", "SSS", 'S', InitBlocksEA.soularite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.soularite_stairs, 4), new Object[]{"SSS", " SS", "  S", 'S', InitBlocksEA.soularite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.soularite_stairs, 4), new Object[]{"SSS", "SS ", "S  ", 'S', InitBlocksEA.soularite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.soularite_fence, 3), new Object[]{"S#S", "S#S", 'S', InitBlocksEA.soularite_block, '#', InitItemsEA.soularite});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.soularite_fence_gate), new Object[]{"#S#", "#S#", 'S', InitBlocksEA.soularite_block, '#', InitItemsEA.soularite});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.soularite_wall, 3), new Object[]{"SSS", "SSS", 'S', InitBlocksEA.soularite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.soularite_block_brick, 4), new Object[]{"SS", "SS", 'S', InitBlocksEA.soularite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.soularite_torch, 4), new Object[]{"C", "S", 'S', InitBlocksEA.soularite_block, 'C', Items.coal});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.soularite_torch, 4), new Object[]{"C", "S", 'S', InitBlocksEA.soularite_block, 'C', new ItemStack(Items.coal, 1, 1)});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.soularite_ladder, 4), new Object[]{"S S", "SSS", "S S", 'S', InitBlocksEA.soularite_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.soularite_pillar, 2), new Object[]{"S", "S", 'S', InitBlocksEA.soularite_block});
		
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.obsidian_block), new Object[]{"##", "##", '#', InitItemsEA.obsidian_shards});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.obsidian_slab, 6), new Object[]{"OOO", 'O', InitBlocksEA.obsidian_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.obsidian_stairs, 4), new Object[]{"  O", " OO", "OOO", 'O', InitBlocksEA.obsidian_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.obsidian_stairs, 4), new Object[]{"O  ", "OO ", "OOO", 'O', InitBlocksEA.obsidian_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.obsidian_stairs, 4), new Object[]{"OOO", " OO", "  O", 'O', InitBlocksEA.obsidian_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.obsidian_stairs, 4), new Object[]{"OOO", "OO ", "O  ", 'O', InitBlocksEA.obsidian_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.obsidian_fence, 3), new Object[]{"O#O", "O#O", 'O', InitBlocksEA.obsidian_block, '#', InitItemsEA.obsidian_shards});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.obsidian_fence_gate), new Object[]{"#O#", "#O#", 'O', InitBlocksEA.obsidian_block, '#', InitItemsEA.obsidian_shards});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.obsidian_wall, 3), new Object[]{"OOO", "OOO", 'O', InitBlocksEA.obsidian_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.obsidian_block_brick, 4), new Object[]{"OO", "OO", 'O', InitBlocksEA.obsidian_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.obsidian_torch, 4), new Object[]{"C", "O", 'O', InitBlocksEA.obsidian_block, 'C', Items.coal});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.obsidian_torch, 4), new Object[]{"C", "O", 'O', InitBlocksEA.obsidian_block, 'C', new ItemStack(Items.coal, 1, 1)});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.obsidian_ladder, 4), new Object[]{"O O", "OOO", "O O", 'O', InitBlocksEA.obsidian_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.obsidian_pillar, 2), new Object[]{"O", "O", 'O', InitBlocksEA.obsidian_block});
		
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.glowstone_block), new Object[]{"##", "##", '#', InitItemsEA.glowstone_shards});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.glowstone_slab, 6), new Object[]{"GGG", 'G', InitBlocksEA.glowstone_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.glowstone_stairs, 4), new Object[]{"  G", " GG", "GGG", 'G', InitBlocksEA.glowstone_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.glowstone_stairs, 4), new Object[]{"G  ", "GG ", "GGG", 'G', InitBlocksEA.glowstone_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.glowstone_stairs, 4), new Object[]{"GGG", " GG", "  G", 'G', InitBlocksEA.glowstone_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.glowstone_stairs, 4), new Object[]{"GGG", "GG ", "G  ", 'G', InitBlocksEA.glowstone_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.glowstone_fence, 3), new Object[]{"G#G", "G#G", 'G', InitBlocksEA.glowstone_block, '#', InitItemsEA.glowstone_shards});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.glowstone_fence_gate), new Object[]{"#G#", "#G#", 'G', InitBlocksEA.glowstone_block, '#', InitItemsEA.glowstone_shards});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.glowstone_wall, 3), new Object[]{"GGG", "GGG", 'G', InitBlocksEA.glowstone_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.glowstone_block_brick, 4), new Object[]{"GG", "GG", 'G', InitBlocksEA.glowstone_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.glowstone_torch, 4), new Object[]{"C", "G", 'G', InitBlocksEA.glowstone_block, 'C', Items.coal});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.glowstone_torch, 4), new Object[]{"C", "G", 'G', InitBlocksEA.glowstone_block, 'C', new ItemStack(Items.coal, 1, 1)});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.glowstone_ladder, 4), new Object[]{"G G", "GGG", "G G", 'G', InitBlocksEA.glowstone_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.glowstone_pillar, 2), new Object[]{"G", "G", 'G', InitBlocksEA.glowstone_block});
		
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.ebonheart_block), new Object[]{"##", "##", '#', InitItemsEA.ebonheart});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.ebonheart_slab, 6), new Object[]{"SSS", 'S', InitBlocksEA.ebonheart_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.ebonheart_stairs, 4), new Object[]{"  S", " SS", "SSS", 'S', InitBlocksEA.ebonheart_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.ebonheart_stairs, 4), new Object[]{"S  ", "SS ", "SSS", 'S', InitBlocksEA.ebonheart_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.ebonheart_stairs, 4), new Object[]{"SSS", " SS", "  S", 'S', InitBlocksEA.ebonheart_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.ebonheart_stairs, 4), new Object[]{"SSS", "SS ", "S  ", 'S', InitBlocksEA.ebonheart_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.ebonheart_fence, 3), new Object[]{"S#S", "S#S", 'S', InitBlocksEA.ebonheart_block, '#', InitItemsEA.ebonheart});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.ebonheart_fence_gate), new Object[]{"#S#", "#S#", 'S', InitBlocksEA.ebonheart_block, '#', InitItemsEA.ebonheart});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.ebonheart_wall, 3), new Object[]{"SSS", "SSS", 'S', InitBlocksEA.ebonheart_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.ebonheart_block_brick, 4), new Object[]{"SS", "SS", 'S', InitBlocksEA.ebonheart_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.ebonheart_torch, 4), new Object[]{"C", "S", 'S', InitBlocksEA.ebonheart_block, 'C', Items.coal});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.ebonheart_torch, 4), new Object[]{"C", "S", 'S', InitBlocksEA.ebonheart_block, 'C', new ItemStack(Items.coal, 1, 1)});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.ebonheart_ladder, 4), new Object[]{"S S", "SSS", "S S", 'S', InitBlocksEA.ebonheart_block});
		GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.ebonheart_pillar, 2), new Object[]{"S", "S", 'S', InitBlocksEA.ebonheart_block});
		
		
		if(!EbonArtsConfiguration.vanillaRecipe)
		{
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.web), new Object[]{"SSS", "S#S", "SSS", 'S', Items.string, '#', Items.slime_ball});
			GameRegistry.addShapedRecipe(new ItemStack(Items.name_tag), new Object[]{"#", "P", "L", '#', Items.lead, 'P', Items.paper, 'L', Items.leather});
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.packed_ice), new Object[]{"III", "III", "III", 'I', Blocks.ice});
			GameRegistry.addShapedRecipe(new ItemStack(Blocks.ice, 9), new Object[]{"I", 'I', Blocks.packed_ice});
			GameRegistry.addShapelessRecipe(new ItemStack(Items.snowball, 4), Blocks.snow);
			GameRegistry.addShapelessRecipe(new ItemStack(Items.clay_ball, 4), Blocks.clay);
		}
		else
		{
			
		}
		
		
		
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
			
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.empowered_blade), new Object[]{" E#", "E#E", "#E ", '#', Items.diamond, 'E', InitItemsEA.ebonheart});
			
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.deception), new Object[]{"DED", "D#D", "DID", 'D', InitItemsEA.draconium_dust, 'E', InitItemsEA.empowered_blade, '#', InitItemsEA.enchanted_ebonheart, 'I', Items.iron_ingot});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.frostbite), new Object[]{"VEV", "V#V", "VIV", 'V', InitItemsEA.velious, 'E', InitItemsEA.empowered_blade, '#', InitItemsEA.enchanted_ebonheart, 'I', Items.iron_ingot});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.massacre), new Object[]{"AEA", "A#A", "AIA", 'A', InitItemsEA.arcanite, 'E', InitItemsEA.empowered_blade, '#', InitItemsEA.enchanted_ebonheart, 'I', Items.iron_ingot});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.blazefury), new Object[]{"KEK", "K#K", "KIK", 'K', InitItemsEA.katcheen, 'E', InitItemsEA.empowered_blade, '#', InitItemsEA.enchanted_ebonheart, 'I', Items.iron_ingot});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.despair), new Object[]{"NEN", "N#N", "NIN", 'N', InitItemsEA.necrocite, 'E', InitItemsEA.empowered_blade, '#', InitItemsEA.enchanted_ebonheart, 'I', Items.iron_ingot});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.souleater), new Object[]{"SES", "S#S", "SIS", 'S', InitItemsEA.soularite, 'E', InitItemsEA.empowered_blade, '#', InitItemsEA.enchanted_ebonheart, 'I', Items.iron_ingot});
		}
		else
		{
			
		}
		
		
		
		if(!EbonArtsConfiguration.armorRecipe)
		{
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.burnished_helmet), new Object[]{"AEA", "A A", 'A', InitItemsEA.arcanite, 'E', InitItemsEA.enchanted_ebonheart});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.burnished_chestplate), new Object[]{"A A", "ACA", "EEE", 'A', InitItemsEA.arcanite, 'E', InitItemsEA.enchanted_ebonheart, 'C', Items.clock});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.burnished_leggings), new Object[]{"EEE", "A A", "A A", 'A', InitItemsEA.arcanite, 'E', InitItemsEA.enchanted_ebonheart});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.burnished_boots), new Object[]{"E E", "A A", 'A', InitItemsEA.arcanite, 'E', InitItemsEA.enchanted_ebonheart});
			
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.scalemail_helmet), new Object[]{"KEK", "K K", 'K', InitItemsEA.katcheen, 'E', InitItemsEA.enchanted_ebonheart});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.scalemail_chestplate), new Object[]{"K K", "KFK", "EEE", 'K', InitItemsEA.katcheen, 'E', InitItemsEA.enchanted_ebonheart, 'F', Items.fire_charge});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.scalemail_leggings), new Object[]{"EEE", "K K", "K K", 'K', InitItemsEA.katcheen, 'E', InitItemsEA.enchanted_ebonheart});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.scalemail_boots), new Object[]{"E E", "K K", 'K', InitItemsEA.katcheen, 'E', InitItemsEA.enchanted_ebonheart});
			
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.vengeance_helmet), new Object[]{"NEN", "N N", 'N', InitItemsEA.necrocite, 'E', InitItemsEA.enchanted_ebonheart});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.vengeance_chestplate), new Object[]{"N N", "NPN", "EEE", 'N', InitItemsEA.necrocite, 'E', InitItemsEA.enchanted_ebonheart, 'P', Items.ender_eye});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.vengeance_leggings), new Object[]{"EEE", "N N", "N N", 'N', InitItemsEA.necrocite, 'E', InitItemsEA.enchanted_ebonheart});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.vengeance_boots), new Object[]{"E E", "N N", 'N', InitItemsEA.necrocite, 'E', InitItemsEA.enchanted_ebonheart});
			
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.celestial_helmet), new Object[]{"SES", "S S", 'S', InitItemsEA.soularite, 'E', InitItemsEA.enchanted_ebonheart});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.celestial_chestplate), new Object[]{"S S", "SCS", "EEE", 'S', InitItemsEA.soularite, 'E', InitItemsEA.enchanted_ebonheart, 'C', Items.end_crystal});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.celestial_leggings), new Object[]{"EEE", "S S", "S S", 'S', InitItemsEA.soularite, 'E', InitItemsEA.enchanted_ebonheart});
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.celestial_boots), new Object[]{"E E", "S S", 'S', InitItemsEA.soularite, 'E', InitItemsEA.enchanted_ebonheart});
		}
		else
		{
			
		}
		
		
		
		if(!EbonArtsConfiguration.musicRecipe)
		{
			GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.mirroring_disc, 1), new Object[]{"GGG", "D#D", "GGG", '#', Items.diamond,'D', InitItemsEA.draconium_dust,'G', Blocks.glass});
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
		//Mystic Cobblestone
		//Recipes that dye the basic block into any color
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_white), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 15));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_orange), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 14));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_magenta), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 13));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_lightblue), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 12));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_yellow), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 11));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_lime), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 10));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_pink), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 9));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_gray), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 8));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_lightgray), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 7));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_cyan), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 6));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_purple), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 5));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_blue), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 4));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_brown), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 3));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_green), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 2));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_red), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_black), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 0));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_glass), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Blocks.glass));		
		
		//Mystic Cobblestone
		//conversion back from dye block to normal block
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block_glass));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block_white));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block_orange));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block_magenta));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block_lightblue));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block_yellow));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block_lime));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block_pink));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block_gray));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block_lightgray));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block_cyan));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block_purple));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block_blue));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block_brown));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block_green));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block_red));		
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block_black));
		
		
		
		//Mystic Stone
		//Recipes that dye the basic block into any color
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_white), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 15));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_orange), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 14));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_magenta), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 13));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_lightblue), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 12));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_yellow), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 11));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_lime), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 10));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_pink), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 9));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_gray), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 8));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_lightgray), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 7));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_cyan), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 6));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_purple), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 5));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_blue), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 4));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_brown), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 3));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_green), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 2));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_red), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_black), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 0));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_glass), InitBlocksEA.mystic_block_normal, new ItemStack(Blocks.glass));		
				
		//Mystic Stone
		//conversion back from dye block to normal block
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block_glass));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block_white));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block_orange));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block_magenta));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block_lightblue));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block_yellow));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block_lime));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block_pink));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block_gray));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block_lightgray));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block_cyan));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block_purple));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block_blue));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block_brown));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block_green));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block_red));		
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block_black));
		
		
		
		//Mystic Wood Planks
		//Recipes that dye the basic block into any color
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_white), InitBlocksEA.wood_mystic_block_normal, new ItemStack(Items.dye, 1, 15));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_orange), InitBlocksEA.wood_mystic_block_normal, new ItemStack(Items.dye, 1, 14));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_magenta), InitBlocksEA.wood_mystic_block_normal, new ItemStack(Items.dye, 1, 13));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_lightblue), InitBlocksEA.wood_mystic_block_normal, new ItemStack(Items.dye, 1, 12));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_yellow), InitBlocksEA.wood_mystic_block_normal, new ItemStack(Items.dye, 1, 11));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_lime), InitBlocksEA.wood_mystic_block_normal, new ItemStack(Items.dye, 1, 10));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_pink), InitBlocksEA.wood_mystic_block_normal, new ItemStack(Items.dye, 1, 9));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_gray), InitBlocksEA.wood_mystic_block_normal, new ItemStack(Items.dye, 1, 8));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_lightgray), InitBlocksEA.wood_mystic_block_normal, new ItemStack(Items.dye, 1, 7));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_cyan), InitBlocksEA.wood_mystic_block_normal, new ItemStack(Items.dye, 1, 6));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_purple), InitBlocksEA.wood_mystic_block_normal, new ItemStack(Items.dye, 1, 5));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_blue), InitBlocksEA.wood_mystic_block_normal, new ItemStack(Items.dye, 1, 4));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_brown), InitBlocksEA.wood_mystic_block_normal, new ItemStack(Items.dye, 1, 3));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_green), InitBlocksEA.wood_mystic_block_normal, new ItemStack(Items.dye, 1, 2));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_red), InitBlocksEA.wood_mystic_block_normal, new ItemStack(Items.dye, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_black), InitBlocksEA.wood_mystic_block_normal, new ItemStack(Items.dye, 1, 0));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_glass), InitBlocksEA.wood_mystic_block_normal, new ItemStack(Blocks.glass));		
		
		//Mystic Wood Planks
		//conversion back from dye block to normal block
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_normal), new ItemStack(InitBlocksEA.wood_mystic_block_glass));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_normal), new ItemStack(InitBlocksEA.wood_mystic_block_white));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_normal), new ItemStack(InitBlocksEA.wood_mystic_block_orange));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_normal), new ItemStack(InitBlocksEA.wood_mystic_block_magenta));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_normal), new ItemStack(InitBlocksEA.wood_mystic_block_lightblue));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_normal), new ItemStack(InitBlocksEA.wood_mystic_block_yellow));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_normal), new ItemStack(InitBlocksEA.wood_mystic_block_lime));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_normal), new ItemStack(InitBlocksEA.wood_mystic_block_pink));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_normal), new ItemStack(InitBlocksEA.wood_mystic_block_gray));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_normal), new ItemStack(InitBlocksEA.wood_mystic_block_lightgray));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_normal), new ItemStack(InitBlocksEA.wood_mystic_block_cyan));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_normal), new ItemStack(InitBlocksEA.wood_mystic_block_purple));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_normal), new ItemStack(InitBlocksEA.wood_mystic_block_blue));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_normal), new ItemStack(InitBlocksEA.wood_mystic_block_brown));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_normal), new ItemStack(InitBlocksEA.wood_mystic_block_green));
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_normal), new ItemStack(InitBlocksEA.wood_mystic_block_red));		
		GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.wood_mystic_block_normal), new ItemStack(InitBlocksEA.wood_mystic_block_black));
		
		
		
		GameRegistry.addRecipe(new ItemStack(Items.paper, 9), new Object[]{"P", 'P', InitBlocksEA.paper_block});
		GameRegistry.addRecipe(new ItemStack(Items.reeds, 9), new Object[]{"R", 'R', InitBlocksEA.reed_block});
		GameRegistry.addRecipe(new ItemStack(Items.leather, 9), new Object[]{"L", 'L', InitBlocksEA.leather_block});
		
		
		if(!EbonArtsConfiguration.musicRecipe)
		{
			
			GameRegistry.addShapelessRecipe(new ItemStack(Items.record_13), InitItemsEA.mirroring_disc, new ItemStack(Items.dye, 1, 11));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.record_cat), InitItemsEA.mirroring_disc, new ItemStack(Items.dye, 1, 2));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.record_blocks), InitItemsEA.mirroring_disc, new ItemStack(Items.dye, 1, 14));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.record_chirp), InitItemsEA.mirroring_disc, new ItemStack(Items.dye, 1, 1));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.record_far), InitItemsEA.mirroring_disc, new ItemStack(Items.dye, 1, 10));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.record_mall), InitItemsEA.mirroring_disc, new ItemStack(Items.dye, 1, 4));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.record_mellohi), InitItemsEA.mirroring_disc, new ItemStack(Items.dye, 1, 5));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.record_stal), InitItemsEA.mirroring_disc, new ItemStack(Items.dye, 1, 0));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.record_strad), InitItemsEA.mirroring_disc, new ItemStack(Items.dye, 1, 15));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.record_ward), InitItemsEA.mirroring_disc, new ItemStack(Items.dye, 1, 6));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.record_11), InitItemsEA.mirroring_disc, new ItemStack(Items.dye, 1, 8));
			GameRegistry.addShapelessRecipe(new ItemStack(Items.record_wait), InitItemsEA.mirroring_disc, new ItemStack(Items.dye, 1, 12));
			
		}
		else
		{
			
		}
		
		
		
		if(!EbonArtsConfiguration.decraftRecipe1)
		{
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.draconium_dust, 4), new ItemStack(InitBlocksEA.draconium_block));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.draconium_dust, 4), new ItemStack(InitBlocksEA.draconium_block_brick));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.draconium_dust, 2), new ItemStack(InitBlocksEA.draconium_slab));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.draconium_dust, 6), new ItemStack(InitBlocksEA.draconium_fence));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.draconium_dust, 12), new ItemStack(InitBlocksEA.draconium_fence_gate));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.draconium_dust, 8), new ItemStack(InitBlocksEA.draconium_wall));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.draconium_dust, 6), new ItemStack(InitBlocksEA.draconium_stairs));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.draconium_dust, 1), new ItemStack(InitBlocksEA.draconium_torch));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.draconium_dust, 7), new ItemStack(InitBlocksEA.draconium_ladder));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.draconium_dust, 4), new ItemStack(InitBlocksEA.draconium_pillar));
			
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.velious, 4), new ItemStack(InitBlocksEA.velious_block));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.velious, 4), new ItemStack(InitBlocksEA.velious_block_brick));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.velious, 2), new ItemStack(InitBlocksEA.velious_slab));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.velious, 6), new ItemStack(InitBlocksEA.velious_fence));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.velious, 12), new ItemStack(InitBlocksEA.velious_fence_gate));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.velious, 8), new ItemStack(InitBlocksEA.velious_wall));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.velious, 6), new ItemStack(InitBlocksEA.velious_stairs));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.velious, 1), new ItemStack(InitBlocksEA.velious_torch));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.velious, 7), new ItemStack(InitBlocksEA.velious_ladder));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.velious, 4), new ItemStack(InitBlocksEA.velious_pillar));
			
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.arcanite, 4), new ItemStack(InitBlocksEA.arcanite_block));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.arcanite, 4), new ItemStack(InitBlocksEA.arcanite_block_brick));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.arcanite, 2), new ItemStack(InitBlocksEA.arcanite_slab));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.arcanite, 6), new ItemStack(InitBlocksEA.arcanite_fence));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.arcanite, 12), new ItemStack(InitBlocksEA.arcanite_fence_gate));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.arcanite, 8), new ItemStack(InitBlocksEA.arcanite_wall));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.arcanite, 6), new ItemStack(InitBlocksEA.arcanite_stairs));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.arcanite, 1), new ItemStack(InitBlocksEA.arcanite_torch));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.arcanite, 7), new ItemStack(InitBlocksEA.arcanite_ladder));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.arcanite, 4), new ItemStack(InitBlocksEA.arcanite_pillar));
			
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.katcheen, 4), new ItemStack(InitBlocksEA.katcheen_block));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.katcheen, 4), new ItemStack(InitBlocksEA.katcheen_block_brick));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.katcheen, 2), new ItemStack(InitBlocksEA.katcheen_slab));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.katcheen, 6), new ItemStack(InitBlocksEA.katcheen_fence));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.katcheen, 12), new ItemStack(InitBlocksEA.katcheen_fence_gate));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.katcheen, 8), new ItemStack(InitBlocksEA.katcheen_wall));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.katcheen, 6), new ItemStack(InitBlocksEA.katcheen_stairs));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.katcheen, 1), new ItemStack(InitBlocksEA.katcheen_torch));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.katcheen, 7), new ItemStack(InitBlocksEA.katcheen_ladder));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.katcheen, 4), new ItemStack(InitBlocksEA.katcheen_pillar));
			
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.necrocite, 4), new ItemStack(InitBlocksEA.necrocite_block));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.necrocite, 4), new ItemStack(InitBlocksEA.necrocite_block_brick));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.necrocite, 2), new ItemStack(InitBlocksEA.necrocite_slab));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.necrocite, 6), new ItemStack(InitBlocksEA.necrocite_fence));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.necrocite, 12), new ItemStack(InitBlocksEA.necrocite_fence_gate));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.necrocite, 8), new ItemStack(InitBlocksEA.necrocite_wall));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.necrocite, 6), new ItemStack(InitBlocksEA.necrocite_stairs));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.necrocite, 1), new ItemStack(InitBlocksEA.necrocite_torch));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.necrocite, 7), new ItemStack(InitBlocksEA.necrocite_ladder));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.necrocite, 4), new ItemStack(InitBlocksEA.necrocite_pillar));
			
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.soularite, 4), new ItemStack(InitBlocksEA.soularite_block));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.soularite, 4), new ItemStack(InitBlocksEA.soularite_block_brick));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.soularite, 2), new ItemStack(InitBlocksEA.soularite_slab));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.soularite, 6), new ItemStack(InitBlocksEA.soularite_fence));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.soularite, 12), new ItemStack(InitBlocksEA.soularite_fence_gate));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.soularite, 8), new ItemStack(InitBlocksEA.soularite_wall));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.soularite, 6), new ItemStack(InitBlocksEA.soularite_stairs));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.soularite, 1), new ItemStack(InitBlocksEA.soularite_torch));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.soularite, 7), new ItemStack(InitBlocksEA.soularite_ladder));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.soularite, 4), new ItemStack(InitBlocksEA.soularite_pillar));
			
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.obsidian_shards, 4), new ItemStack(InitBlocksEA.obsidian_block));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.obsidian_shards, 4), new ItemStack(InitBlocksEA.obsidian_block_brick));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.obsidian_shards, 2), new ItemStack(InitBlocksEA.obsidian_slab));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.obsidian_shards, 6), new ItemStack(InitBlocksEA.obsidian_fence));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.obsidian_shards, 12), new ItemStack(InitBlocksEA.obsidian_fence_gate));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.obsidian_shards, 8), new ItemStack(InitBlocksEA.obsidian_wall));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.obsidian_shards, 6), new ItemStack(InitBlocksEA.obsidian_stairs));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.obsidian_shards, 1), new ItemStack(InitBlocksEA.obsidian_torch));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.obsidian_shards, 7), new ItemStack(InitBlocksEA.obsidian_ladder));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.obsidian_shards, 4), new ItemStack(InitBlocksEA.obsidian_pillar));
			
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.glowstone_shards, 4), new ItemStack(InitBlocksEA.glowstone_block));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.glowstone_shards, 4), new ItemStack(InitBlocksEA.glowstone_block_brick));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.glowstone_shards, 2), new ItemStack(InitBlocksEA.glowstone_slab));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.glowstone_shards, 6), new ItemStack(InitBlocksEA.glowstone_fence));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.glowstone_shards, 12), new ItemStack(InitBlocksEA.glowstone_fence_gate));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.glowstone_shards, 8), new ItemStack(InitBlocksEA.glowstone_wall));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.glowstone_shards, 6), new ItemStack(InitBlocksEA.glowstone_stairs));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.glowstone_shards, 1), new ItemStack(InitBlocksEA.glowstone_torch));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.glowstone_shards, 7), new ItemStack(InitBlocksEA.glowstone_ladder));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.glowstone_shards, 4), new ItemStack(InitBlocksEA.glowstone_pillar));
			
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.ebonheart, 4), new ItemStack(InitBlocksEA.ebonheart_block));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.ebonheart, 4), new ItemStack(InitBlocksEA.ebonheart_block_brick));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.ebonheart, 2), new ItemStack(InitBlocksEA.ebonheart_slab));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.ebonheart, 6), new ItemStack(InitBlocksEA.ebonheart_fence));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.ebonheart, 12), new ItemStack(InitBlocksEA.ebonheart_fence_gate));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.ebonheart, 8), new ItemStack(InitBlocksEA.ebonheart_wall));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.ebonheart, 6), new ItemStack(InitBlocksEA.ebonheart_stairs));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.ebonheart, 1), new ItemStack(InitBlocksEA.ebonheart_torch));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.ebonheart, 7), new ItemStack(InitBlocksEA.ebonheart_ladder));
			GameRegistry.addShapelessRecipe(new ItemStack(InitItemsEA.ebonheart, 4), new ItemStack(InitBlocksEA.ebonheart_pillar));
			
		}
		else
		{
			
		}
		
		
		
		
		
	}
	
	public static void initSmeltingRecipe()
	{
		//GameRegistry.addSmelting(new ItemStack(InitBlocksEA.draconium_ore), new ItemStack(InitItemsEA.draconium_dust), 10f);
		
		
		//smelt stone back into cobblestone.
		//GameRegistry.addSmelting(new ItemStack(Blocks.cobblestone), new ItemStack(Blocks.stone), 0.1f);
		
		
	}
	
}
	
		
		
		//Examples I created
		
		//GameRegistry.addRecipe(new ItemStack(ModBlocks.tutorialBlock),	"##","##",	'#', ModItems.tutorialItem);
		//or: GameRegistry.addRecipe(new ItemStack(ModBlocks.tutorialBlock), new Object[]{"##","##", '#', ModItems.tutorialItem});

		//GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tutorialItem), Items.redstone, new ItemStack(Items.dye, 1, 4));
		//or: GameRegistry.addShapelessRecipe(new ItemStack(ModItems.tutorialItem), new Object[]{Items.redstone, new ItemStack(Items.dye, 1, 4)});

		//GameRegistry.addSmelting(Items.diamond, new ItemStack(ModItems.tutorialItem), 1.0f);
	
	//}
	
	
	/**
	 * 
	 * Archived old code
	 * 
	 * 


	        for (int i = 0; i < 16; ++i)
	        {
	        	GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new Object[] {new ItemStack(InitBlocksEA.cobble_mystic_block, 1, i)});
	        	GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block, 1, i), new Object[] {new ItemStack(Items.dye, 1, 15 - i), new ItemStack(Item.getItemFromBlock(InitBlocksEA.cobble_mystic_block_normal))});
	        	
	        	GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new Object[] {new ItemStack(InitBlocksEA.mystic_block, 1, i)});
	            GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, i), new Object[] {new ItemStack(Items.dye, 1, 15 - i), new ItemStack(Item.getItemFromBlock(InitBlocksEA.mystic_block_normal))});
	            //GameRegistry.addRecipe(new ItemStack(Blocks.stained_hardened_clay, 8, 15 - i), new Object[] {"###", "#X#", "###", '#', new ItemStack(Blocks.hardened_clay), 'X', new ItemStack(Items.dye, 1, i)});
	            //GameRegistry.addRecipe(new ItemStack(Blocks.stained_glass, 8, 15 - i), new Object[] {"###", "#X#", "###", '#', new ItemStack(Blocks.glass), 'X', new ItemStack(Items.dye, 1, i)});
	            //GameRegistry.addRecipe(new ItemStack(Blocks.stained_glass_pane, 16, i), new Object[] {"###", "###", '#', new ItemStack(Blocks.stained_glass, 1, i)});
	            
	            
	        }
	    
		//Mystic Cobblestone
		//conversion back from dye block to normal block
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 0));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 1));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 2));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 3));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 4));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 5));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 6));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 7));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 8));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 9));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 10));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 11));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 12));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 13));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 14));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block_normal), new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 15));
		
		//Recipes that dye the basic block into any color
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 0), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 15));//EnumDyeColor.BLACK.getDyeDamage()
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 1), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 14));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 2), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 13));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 3), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 12));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 4), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 11));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 5), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 10));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 6), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 9));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 7), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 8));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 8), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 7));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 9), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 6));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 10), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 5));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 11), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 4));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 12), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 3));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 13), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 2));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 14), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 1));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.cobble_mystic_block, 1, 15), InitBlocksEA.cobble_mystic_block_normal, new ItemStack(Items.dye, 1, 0));
		
		
		//Mystic Stone
		//conversion back from dye block to normal block
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block, 1, 0));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block, 1, 1));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block, 1, 2));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block, 1, 3));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block, 1, 4));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block, 1, 5));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block, 1, 6));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block, 1, 7));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block, 1, 8));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block, 1, 9));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block, 1, 10));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block, 1, 11));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block, 1, 12));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block, 1, 13));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block, 1, 14));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block_normal), new ItemStack(InitBlocksEA.mystic_block, 1, 15));
				
		//Recipes that dye the basic block into any color
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 0), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 15));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 1), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 14));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 2), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 13));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 3), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 12));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 4), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 11));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 5), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 10));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 6), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 9));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 7), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 8));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 8), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 7));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 9), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 6));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 10), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 5));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 11), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 4));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 12), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 3));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 13), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 2));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 14), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 1));
		//GameRegistry.addShapelessRecipe(new ItemStack(InitBlocksEA.mystic_block, 1, 15), InitBlocksEA.mystic_block_normal, new ItemStack(Items.dye, 1, 0));
		
		
		
		//GameRegistry.addShapedRecipe(new ItemStack(InitTileEntitiesEA.Banana_Plant), new Object[]{"DN", "ND", 'D', InitItemsEA.draconium_dust, 'N', Items.quartz});
		//GameRegistry.addShapedRecipe(new ItemStack(InitBlocksEA.ebonheart_block), new Object[]{"EEE", "EEE", "EEE", 'E', InitItemsEA.ebonheart});
		//GameRegistry.addShapedRecipe(new ItemStack(InitItemsEA.ebonheart, 9), new Object[]{"E", 'E', InitBlocksEA.ebonheart_block});
		

//if(!EbonArtsConfiguration.decraftRecipe2)
		//{
		//	
		//	GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 4), new ItemStack(Blocks.quartz_block, 1, 0));
		//	GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 4), new ItemStack(Blocks.quartz_block, 1, 1));
		//	GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 2), new ItemStack(Blocks.stone_slab, 1, 7));
		//	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.quartz_block, 1), new ItemStack(Blocks.quartz_block, 1, 2));
		//	GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 6), Blocks.quartz_stairs);
			
			
			
			
			
		
			
			
		//	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 4), Blocks.crafting_table);
		//	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 8), Blocks.chest);
		//	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone, 8), Blocks.furnace);
		//	GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 5), Items.minecart);
		//	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 5), Items.boat);
			
		//	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 1), Blocks.wooden_button);
		//	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.stone, 1), Blocks.stone_button);
			
			
			
			
		//	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.stone, 2), Blocks.stone_pressure_plate);
		//	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2), Blocks.wooden_pressure_plate);
		//	GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 2), Blocks.heavy_weighted_pressure_plate);
		//	GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 2), Blocks.light_weighted_pressure_plate);
			
			
			
			
		//	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 3), Blocks.trapdoor);
		//	GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 4), Blocks.iron_trapdoor);
			
			
			
		//	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 0), Items.oak_door);
		//	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 1), Items.spruce_door);
		//	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 2), Items.birch_door);
		//	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 3), Items.jungle_door);
		//	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 4), Items.acacia_door);
		//	GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 5), Items.dark_oak_door);
		//	GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 2), Items.iron_door);
			
			
			
		//	GameRegistry.addShapelessRecipe(new ItemStack(Items.glowstone_dust, 4), Blocks.glowstone);
			
			
		//}
		//else
		//{
			
		//}

	 */
