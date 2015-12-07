package com.ebonheart.EbonArtsMod.init;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFenceGate;
import net.minecraft.block.BlockLog;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.Reference;
import com.ebonheart.EbonArtsMod.api.meta.ItemBlockMeta;
import com.ebonheart.EbonArtsMod.common.blocks.basic.BlockArcaniteFenceNormal;
import com.ebonheart.EbonArtsMod.common.blocks.basic.BlockStairsMetaEA;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EABlockFence;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EABlockMeta;
import com.ebonheart.EbonArtsMod.common.blocks.basic.BlockArcaniteNormal;
import com.ebonheart.EbonArtsMod.common.blocks.basic.BlockInnateArcaniteNormal;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EABlockPillar;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EABlockStairs;
import com.ebonheart.EbonArtsMod.common.blocks.devices.TestBlockFurnaceEA;
import com.ebonheart.EbonArtsMod.common.blocks.world.BlockMultiOre;
import com.ebonheart.EbonArtsMod.common.blocks.world.BlockOreEA;

public class InitBlocksEA 
{
	//basic ore dust; gem; ingot; ingot
	public static Block draconium_ore;
	public static Block velious_ore;
	public static Block arcanite_ore;
	public static Block katchin_ore;
	public static Block ebon_ore;
	
	//advanced ore gem; gem
	public static Block necrocite_ore;
	public static Block soularite_ore;
		
	//public static Block onyxius_ore;
	//public static Block carnelian_ore;
	//public static Block velium_ore;
	//public static Block amplimet_ore;
	//public static Block enstatite_ore;
	//public static Block velium_ore;
	//public static Block infernus_ore;
	//public static Block norn_stone;
	//public static Block mystalite_ore;
	
	
	
	
	
	public static Block arcanite_block;
	public static Block arcanite_block_normal;
	
	public static Block arcanite_fence_normal;
	//public static Block arcanite_fence_gate_normal;
	//public static Block arcanite_wall;
	//public static Block arcanite_wall_gate;
	
	public static Block innate_arcanite_block;
	public static Block innate_arcanite_block_normal;
	
	//public static Block arcanite_column_normal;
	//public static Block arcanite_double_slab;
	//public static Block arcanite_slab;
	
	//public static Block arcanite_stairs;
	public static Block arcanite_stairs_normal;
	
	
	public static Block purified_mystic_block;
	
	//public static Block test_liquid;
	//public static Block flowing_test_liquid;
	
	public static Block mystic_furnace;
	public static Block lit_mystic_furnace;
	
	public static void preInit() 
	{
		ModelBakery.addVariantName(Item.getItemFromBlock(InitBlocksEA.arcanite_block), "ea:gem/arcanite/arcanite_block_white", "ea:gem/arcanite/arcanite_block_orange", "ea:gem/arcanite/arcanite_block_magenta", "ea:gem/arcanite/arcanite_block_lightblue", "ea:gem/arcanite/arcanite_block_yellow", "ea:gem/arcanite/arcanite_block_lime", "ea:gem/arcanite/arcanite_block_pink", "ea:gem/arcanite/arcanite_block_gray", "ea:gem/arcanite/arcanite_block_lightgray", "ea:gem/arcanite/arcanite_block_cyan", "ea:gem/arcanite/arcanite_block_purple", "ea:gem/arcanite/arcanite_block_blue", "ea:gem/arcanite/arcanite_block_brown", "ea:gem/arcanite/arcanite_block_green", "ea:gem/arcanite/arcanite_block_red", "ea:gem/arcanite/arcanite_block_black");
		
		ModelBakery.addVariantName(Item.getItemFromBlock(InitBlocksEA.innate_arcanite_block), 
				"ea:gem/arcanite/innate_arcanite_block_white", 
				"ea:gem/arcanite/innate_arcanite_block_orange", 
				"ea:gem/arcanite/innate_arcanite_block_magenta", 
				"ea:gem/arcanite/innate_arcanite_block_lightblue", 
				"ea:gem/arcanite/innate_arcanite_block_yellow", 
				"ea:gem/arcanite/innate_arcanite_block_lime", 
				"ea:gem/arcanite/innate_arcanite_block_pink", 
				"ea:gem/arcanite/innate_arcanite_block_gray", 
				"ea:gem/arcanite/innate_arcanite_block_lightgray", 
				"ea:gem/arcanite/innate_arcanite_block_cyan", 
				"ea:gem/arcanite/innate_arcanite_block_purple", 
				"ea:gem/arcanite/innate_arcanite_block_blue", 
				"ea:gem/arcanite/innate_arcanite_block_brown", 
				"ea:gem/arcanite/innate_arcanite_block_green", 
				"ea:gem/arcanite/innate_arcanite_block_red", 
				"ea:gem/arcanite/innate_arcanite_block_black");
		
		
		//ModelBakery.addVariantName(Item.getItemFromBlock(InitBlocksEA.arcanite_stairs), 
		//		"ea:gem/arcanite/arcanite_stairs_white", 
		//		"ea:gem/arcanite/arcanite_stairs_orange", 
		//		"ea:gem/arcanite/arcanite_stairs_magenta", 
		//		"ea:gem/arcanite/arcanite_stairs_lightblue", 
		//		"ea:gem/arcanite/arcanite_stairs_yellow", 
		//		"ea:gem/arcanite/arcanite_stairs_lime", 
		//		"ea:gem/arcanite/arcanite_stairs_pink", 
		//		"ea:gem/arcanite/arcanite_stairs_gray", 
		//		"ea:gem/arcanite/arcanite_stairs_lightgray", 
		//		"ea:gem/arcanite/arcanite_stairs_cyan", 
		//		"ea:gem/arcanite/arcanite_stairs_purple", 
		//		"ea:gem/arcanite/arcanite_stairs_blue", 
		//		"ea:gem/arcanite/arcanite_stairs_brown", 
		//		"ea:gem/arcanite/arcanite_stairs_green", 
		//		"ea:gem/arcanite/arcanite_stairs_red", 
		//		"ea:gem/arcanite/arcanite_stairs_black");
		
	}

	public static void init()
	{
		
		draconium_ore = new BlockOreEA(Material.rock, "ore/draconium_ore", "pickaxe", 2, 0.4f, 5f);
		velious_ore = new BlockOreEA(Material.rock, "ore/velious_ore", "pickaxe", 2, 0.4f, 7f);
		arcanite_ore = new BlockOreEA(Material.rock, "ore/arcanite_ore", "pickaxe", 3, 0f, 10f);
		katchin_ore = new BlockOreEA(Material.rock, "ore/katchin_ore", "pickaxe", 3, 0f, 18f);
		necrocite_ore = new BlockOreEA(Material.rock, "ore/necrocite_ore", "pickaxe", 3, 0f, 15f);
		soularite_ore = new BlockOreEA(Material.rock, "ore/soularite_ore", "pickaxe", 3, 0f, 15f);
		ebon_ore = new BlockMultiOre(Material.rock);
		
		//carnelian_ore = new BlockOreEA(Material.rock).setUnlocalizedName("ore/carnelian_ore");
		
		
		arcanite_block_normal = new BlockArcaniteNormal(Material.rock);
		innate_arcanite_block_normal = new BlockInnateArcaniteNormal(Material.rock);
		
		arcanite_stairs_normal = new EABlockStairs(Blocks.oak_stairs.getStateFromMeta(0)).setUnlocalizedName("arcanite_stairs_normal").setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		
		
		
		
		arcanite_fence_normal = new BlockArcaniteFenceNormal(Material.rock);
		//arcanite_fence_gate_normal = new EABlockFence("fence/arcanite_fence_gate_normal", Material.rock);
		
		//arcanite_wall = new BlockWall(EbonArtsBlocks.arcanite_block).setUnlocalizedName("wall/arcanite_wall").setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		//arcanite_wall_gate = new BlockFenceGate().setUnlocalizedName("wall/arcanite_wall_gate").setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		
		
		mystic_furnace = new TestBlockFurnaceEA(false).setUnlocalizedName("machine/mystic_furnace").setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		lit_mystic_furnace = new TestBlockFurnaceEA(true).setUnlocalizedName("machine/lit_mystic_furnace").setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		
		//test_liquid = new TestBlockStaticLiquidEA(Material.water);
		//flowing_test_liquid = new TestBlockDynamicLiquidEA(Material.water);
		
		
		//arcanite_column_normal = new EABlockPillar().setUnlocalizedName("gem/arcanite/arcanite_column_normal").setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		//arcanite_double_slab = new BlockDoubleStoneSlab().setUnlocalizedName("gem/arcanite_double_slab").setCreativeTab(EbonArtsMod.tabEbonArts);
		//arcanite_slab = new BlockHalfStoneSlab().setUnlocalizedName("gem/arcanite_slab").setCreativeTab(EbonArtsMod.tabEbonArts);
		
		//purified_mystic_block = new GeneralModBlocks(Material.rock).setUnlocalizedName("purified_mystic_block").setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		
		
	}
	
	
	public static void register()
	{
		
		GameRegistry.registerBlock(draconium_ore, draconium_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(velious_ore, velious_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(arcanite_ore, arcanite_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(katchin_ore, katchin_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(necrocite_ore, necrocite_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(soularite_ore, soularite_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ebon_ore, ebon_ore.getUnlocalizedName().substring(5));
		
		//GameRegistry.registerBlock(carnelian_ore, carnelian_ore.getUnlocalizedName().substring(5));
		
		
		GameRegistry.registerBlock(arcanite_block = new EABlockMeta("gem/arcanite/arcanite_block", Material.rock), ItemBlockMeta.class, "gem/arcanite/arcanite_block");
		GameRegistry.registerBlock(innate_arcanite_block = new EABlockMeta("gem/arcanite/innate_arcanite_block", Material.rock), ItemBlockMeta.class, "gem/arcanite/innate_arcanite_block");
		//GameRegistry.registerBlock(arcanite_stairs = new BlockStairsMetaEA(Blocks.oak_stairs.getStateFromMeta(0), "gem/arcanite/arcanite_stairs", Material.rock), ItemBlockMeta.class, "gem/arcanite/arcanite_stairs");
		
		
		GameRegistry.registerBlock(arcanite_block_normal, arcanite_block_normal.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(innate_arcanite_block_normal, innate_arcanite_block_normal.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(arcanite_stairs_normal, arcanite_stairs_normal.getUnlocalizedName().substring(5));
		
		GameRegistry.registerBlock(arcanite_fence_normal, arcanite_fence_normal.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(arcanite_fence_gate_normal, arcanite_fence_gate_normal.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(arcanite_wall, arcanite_wall.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(arcanite_wall_gate, arcanite_wall_gate.getUnlocalizedName().substring(5));
		
		
		GameRegistry.registerBlock(mystic_furnace, mystic_furnace.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(lit_mystic_furnace, lit_mystic_furnace.getUnlocalizedName().substring(5));
		
		//GameRegistry.registerBlock(test_liquid, test_liquid.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(flowing_test_liquid, flowing_test_liquid.getUnlocalizedName().substring(5));
		
		
		//GameRegistry.registerBlock(arcanite_column_normal, arcanite_column_normal.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(arcanite_double_slab, arcanite_double_slab.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(arcanite_slab, arcanite_slab.getUnlocalizedName().substring(5));
		
		//GameRegistry.registerBlock(purified_mystic_block, purified_mystic_block.getUnlocalizedName().substring(5));
		

	}
	
	public static void registerRenders()
	{
		
		registerRender(draconium_ore);
		registerRender(velious_ore);
		registerRender(arcanite_ore);
		registerRender(katchin_ore);
		registerRender(necrocite_ore);
		registerRender(soularite_ore);
		registerRender(ebon_ore);
		
		//registerRender(carnelian_ore);
		
		registerRender(arcanite_block_normal);
		registerRender(arcanite_block);
		registerRender(InitBlocksEA.arcanite_block, 0, "gem/arcanite/arcanite_block_white");
		registerRender(InitBlocksEA.arcanite_block, 1, "gem/arcanite/arcanite_block_orange");
		registerRender(InitBlocksEA.arcanite_block, 2, "gem/arcanite/arcanite_block_magenta");
		registerRender(InitBlocksEA.arcanite_block, 3, "gem/arcanite/arcanite_block_lightblue");
		registerRender(InitBlocksEA.arcanite_block, 4, "gem/arcanite/arcanite_block_yellow");
		registerRender(InitBlocksEA.arcanite_block, 5, "gem/arcanite/arcanite_block_lime");
		registerRender(InitBlocksEA.arcanite_block, 6, "gem/arcanite/arcanite_block_pink");
		registerRender(InitBlocksEA.arcanite_block, 7, "gem/arcanite/arcanite_block_gray");
		registerRender(InitBlocksEA.arcanite_block, 8, "gem/arcanite/arcanite_block_lightgray");
		registerRender(InitBlocksEA.arcanite_block, 9, "gem/arcanite/arcanite_block_cyan");
		registerRender(InitBlocksEA.arcanite_block, 10, "gem/arcanite/arcanite_block_purple");
		registerRender(InitBlocksEA.arcanite_block, 11, "gem/arcanite/arcanite_block_blue");
		registerRender(InitBlocksEA.arcanite_block, 12, "gem/arcanite/arcanite_block_brown");
		registerRender(InitBlocksEA.arcanite_block, 13, "gem/arcanite/arcanite_block_green");
		registerRender(InitBlocksEA.arcanite_block, 14, "gem/arcanite/arcanite_block_red");
		registerRender(InitBlocksEA.arcanite_block, 15, "gem/arcanite/arcanite_block_black");
		

		
		
		registerRender(arcanite_fence_normal);
		//registerRender(arcanite_fence_gate_normal);
		
		//registerRender(arcanite_wall);
		//registerRender(arcanite_wall_gate);
		
		registerRender(innate_arcanite_block_normal);
		registerRender(innate_arcanite_block);
		registerRender(InitBlocksEA.innate_arcanite_block, 0, "gem/arcanite/innate_arcanite_block_white");
		registerRender(InitBlocksEA.innate_arcanite_block, 1, "gem/arcanite/innate_arcanite_block_orange");
		registerRender(InitBlocksEA.innate_arcanite_block, 2, "gem/arcanite/innate_arcanite_block_magenta");
		registerRender(InitBlocksEA.innate_arcanite_block, 3, "gem/arcanite/innate_arcanite_block_lightblue");
		registerRender(InitBlocksEA.innate_arcanite_block, 4, "gem/arcanite/innate_arcanite_block_yellow");
		registerRender(InitBlocksEA.innate_arcanite_block, 5, "gem/arcanite/innate_arcanite_block_lime");
		registerRender(InitBlocksEA.innate_arcanite_block, 6, "gem/arcanite/innate_arcanite_block_pink");
		registerRender(InitBlocksEA.innate_arcanite_block, 7, "gem/arcanite/innate_arcanite_block_gray");
		registerRender(InitBlocksEA.innate_arcanite_block, 8, "gem/arcanite/innate_arcanite_block_lightgray");
		registerRender(InitBlocksEA.innate_arcanite_block, 9, "gem/arcanite/innate_arcanite_block_cyan");
		registerRender(InitBlocksEA.innate_arcanite_block, 10, "gem/arcanite/innate_arcanite_block_purple");
		registerRender(InitBlocksEA.innate_arcanite_block, 11, "gem/arcanite/innate_arcanite_block_blue");
		registerRender(InitBlocksEA.innate_arcanite_block, 12, "gem/arcanite/innate_arcanite_block_brown");
		registerRender(InitBlocksEA.innate_arcanite_block, 13, "gem/arcanite/innate_arcanite_block_green");
		registerRender(InitBlocksEA.innate_arcanite_block, 14, "gem/arcanite/innate_arcanite_block_red");
		registerRender(InitBlocksEA.innate_arcanite_block, 15, "gem/arcanite/innate_arcanite_block_black");
		registerRender(mystic_furnace);
		registerRender(lit_mystic_furnace);
		
		//registerRender(test_liquid);
		//registerRender(flowing_test_liquid);
		
		//registerRender(arcanite_column_normal);
		//registerRender(arcanite_double_slab);
		//registerRender(arcanite_slab);
		registerRender(arcanite_stairs_normal);
		//registerRender(arcanite_stairs);
		//registerRender(InitBlocksEA.arcanite_stairs, 0, "gem/arcanite/arcanite_stairs_white");
		//registerRender(InitBlocksEA.arcanite_stairs, 1, "gem/arcanite/arcanite_stairs_orange");
		//registerRender(InitBlocksEA.arcanite_stairs, 2, "gem/arcanite/arcanite_stairs_magenta");
		//registerRender(InitBlocksEA.arcanite_stairs, 3, "gem/arcanite/arcanite_stairs_lightblue");
		//registerRender(InitBlocksEA.arcanite_stairs, 4, "gem/arcanite/arcanite_stairs_yellow");
		//registerRender(InitBlocksEA.arcanite_stairs, 5, "gem/arcanite/arcanite_stairs_lime");
		//registerRender(InitBlocksEA.arcanite_stairs, 6, "gem/arcanite/arcanite_stairs_pink");
		//registerRender(InitBlocksEA.arcanite_stairs, 7, "gem/arcanite/arcanite_stairs_gray");
		//registerRender(InitBlocksEA.arcanite_stairs, 8, "gem/arcanite/arcanite_stairs_lightgray");
		//registerRender(InitBlocksEA.arcanite_stairs, 9, "gem/arcanite/arcanite_stairs_cyan");
		//registerRender(InitBlocksEA.arcanite_stairs, 10, "gem/arcanite/arcanite_stairs_purple");
		//registerRender(InitBlocksEA.arcanite_stairs, 11, "gem/arcanite/arcanite_stairs_blue");
		//registerRender(InitBlocksEA.arcanite_stairs, 12, "gem/arcanite/arcanite_stairs_brown");
		//registerRender(InitBlocksEA.arcanite_stairs, 13, "gem/arcanite/arcanite_stairs_green");
		//registerRender(InitBlocksEA.arcanite_stairs, 14, "gem/arcanite/arcanite_stairs_red");
		//registerRender(InitBlocksEA.arcanite_stairs, 15, "gem/arcanite/arcanite_stairs_black");
		
		//registerRender(purified_mystic_block);
		
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
