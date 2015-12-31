package com.ebonheart.EbonArtsMod.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ebonheart.EbonArtsMod.api.meta.ItemBlockMeta;
import com.ebonheart.EbonArtsMod.common.blocks.basic.BlockArcanite;
import com.ebonheart.EbonArtsMod.common.blocks.basic.BlockDoubleSlab;
import com.ebonheart.EbonArtsMod.common.blocks.basic.BlockDraconium;
import com.ebonheart.EbonArtsMod.common.blocks.basic.BlockGlowstone;
import com.ebonheart.EbonArtsMod.common.blocks.basic.BlockHalfSlab;
import com.ebonheart.EbonArtsMod.common.blocks.basic.BlockInnateMysticNormal;
import com.ebonheart.EbonArtsMod.common.blocks.basic.BlockKatcheen;
import com.ebonheart.EbonArtsMod.common.blocks.basic.BlockMystic;
import com.ebonheart.EbonArtsMod.common.blocks.basic.BlockNecrocite;
import com.ebonheart.EbonArtsMod.common.blocks.basic.BlockObsidian;
import com.ebonheart.EbonArtsMod.common.blocks.basic.BlockPaper;
import com.ebonheart.EbonArtsMod.common.blocks.basic.BlockSoularite;
import com.ebonheart.EbonArtsMod.common.blocks.basic.BlockVelious;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EABlockFence;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EABlockFenceGate;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EABlockMeta;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EABlockPillar;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EABlockStairs;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EABlockWall;
import com.ebonheart.EbonArtsMod.common.blocks.basic.ItemBlockSlab;
import com.ebonheart.EbonArtsMod.common.blocks.world.BlockMultiOre;
import com.ebonheart.EbonArtsMod.common.blocks.world.BlockOreArcanite;
import com.ebonheart.EbonArtsMod.common.blocks.world.BlockOreDraconium;
import com.ebonheart.EbonArtsMod.common.blocks.world.BlockOreKatcheen;
import com.ebonheart.EbonArtsMod.common.blocks.world.BlockOreNecrocite;
import com.ebonheart.EbonArtsMod.common.blocks.world.BlockOreSoularite;
import com.ebonheart.EbonArtsMod.common.blocks.world.BlockOreVelious;
import com.ebonheart.EbonArtsMod.references.Reference;

public class InitBlocksEA 
{
	public static Block draconium_ore;
	public static Block velious_ore;
	public static Block arcanite_ore;
	public static Block katcheen_ore;
	public static Block ebon_ore;
	public static Block necrocite_ore;
	public static Block soularite_ore;
	public static Block ebon_ore_nether;
	
	//public static Block onyxius_ore;
	//public static Block carnelian_ore;
	//public static Block velium_ore;
	//public static Block amplimet_ore;
	//public static Block enstatite_ore;
	//public static Block velium_ore;
	//public static Block infernus_ore;
	//public static Block norn_stone;
	//public static Block mystalite_ore;
	
	public static Block double_draconium_slab;
	public static Block double_velious_slab;
	public static Block double_arcanite_slab;
	public static Block double_katcheen_slab;
	public static Block double_necrocite_slab;
	public static Block double_soularite_slab;
	
	public static Block draconium_slab;
	public static Block velious_slab;
	public static Block arcanite_slab;
	public static Block katcheen_slab;
	public static Block necrocite_slab;
	public static Block soularite_slab;
	
	public static Block draconium_fence;
	public static Block velious_fence;
	public static Block arcanite_fence;
	public static Block katcheen_fence;
	public static Block necrocite_fence;
	public static Block soularite_fence;
	
	public static Block draconium_fence_gate;
	public static Block velious_fence_gate;
	public static Block arcanite_fence_gate;
	public static Block katcheen_fence_gate;
	public static Block necrocite_fence_gate;
	public static Block soularite_fence_gate;
	
	public static Block draconium_wall;
	public static Block velious_wall;
	public static Block arcanite_wall;
	public static Block katcheen_wall;
	public static Block necrocite_wall;
	public static Block soularite_wall;
	
	public static Block innate_mystic_block;
	public static Block innate_mystic_block_normal;
	
	public static Block draconium_stairs;
	public static Block velious_stairs;
	public static Block arcanite_stairs;
	public static Block katcheen_stairs;
	public static Block necrocite_stairs;
	public static Block soularite_stairs;
	
	public static Block draconium_block;
	public static Block velious_block;
	public static Block arcanite_block;
	public static Block katcheen_block;
	public static Block necrocite_block;
	public static Block soularite_block;
	
	public static Block draconium_block_brick;
	public static Block velious_block_brick;
	public static Block arcanite_block_brick;
	public static Block katcheen_block_brick;
	public static Block necrocite_block_brick;
	public static Block soularite_block_brick;
	
	public static Block mystic_block;
	public static Block mystic_block_normal;
	
	public static Block paper_block;
	
	public static Block obsidian_block;
	public static Block obsidian_block_brick;
	public static Block double_obsidian_slab;
	public static Block obsidian_slab;
	public static Block obsidian_fence;
	public static Block obsidian_fence_gate;
	public static Block obsidian_wall;
	public static Block obsidian_stairs;
	
	public static Block glowstone_block;
	public static Block glowstone_block_brick;
	public static Block double_glowstone_slab;
	public static Block glowstone_slab;
	public static Block glowstone_fence;
	public static Block glowstone_fence_gate;
	public static Block glowstone_wall;
	public static Block glowstone_stairs;
	
	//public static Block column;
	
	//public static Block purified_mystic_block;
	
	//public static Block test_liquid;
	//public static Block flowing_test_liquid;
	
	//public static Block mystic_furnace;
	//public static Block lit_mystic_furnace;
	
	public static void clientInit() 
	{
		ModelBakery.addVariantName(Item.getItemFromBlock(InitBlocksEA.mystic_block), "ea:gem/mystic/mystic_block_white", "ea:gem/mystic/mystic_block_orange", "ea:gem/mystic/mystic_block_magenta", "ea:gem/mystic/mystic_block_lightblue", "ea:gem/mystic/mystic_block_yellow", "ea:gem/mystic/mystic_block_lime", "ea:gem/mystic/mystic_block_pink", "ea:gem/mystic/mystic_block_gray", "ea:gem/mystic/mystic_block_lightgray", "ea:gem/mystic/mystic_block_cyan", "ea:gem/mystic/mystic_block_purple", "ea:gem/mystic/mystic_block_blue", "ea:gem/mystic/mystic_block_brown", "ea:gem/mystic/mystic_block_green", "ea:gem/mystic/mystic_block_red", "ea:gem/mystic/mystic_block_black");
		
		ModelBakery.addVariantName(Item.getItemFromBlock(InitBlocksEA.innate_mystic_block), 
				"ea:gem/mystic/innate_mystic_block_white", 
				"ea:gem/mystic/innate_mystic_block_orange", 
				"ea:gem/mystic/innate_mystic_block_magenta", 
				"ea:gem/mystic/innate_mystic_block_lightblue", 
				"ea:gem/mystic/innate_mystic_block_yellow", 
				"ea:gem/mystic/innate_mystic_block_lime", 
				"ea:gem/mystic/innate_mystic_block_pink", 
				"ea:gem/mystic/innate_mystic_block_gray", 
				"ea:gem/mystic/innate_mystic_block_lightgray", 
				"ea:gem/mystic/innate_mystic_block_cyan", 
				"ea:gem/mystic/innate_mystic_block_purple", 
				"ea:gem/mystic/innate_mystic_block_blue", 
				"ea:gem/mystic/innate_mystic_block_brown", 
				"ea:gem/mystic/innate_mystic_block_green", 
				"ea:gem/mystic/innate_mystic_block_red", 
				"ea:gem/mystic/innate_mystic_block_black");
		
		
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

	public static void preInit()
	{
		draconium_ore = new BlockOreDraconium(2, 0.4f, 10f);
		velious_ore = new BlockOreVelious(2, 15f);
		arcanite_ore = new BlockOreArcanite(2, 20f);
		katcheen_ore = new BlockOreKatcheen(3, 30f);
		necrocite_ore = new BlockOreNecrocite(3, 30f);
		soularite_ore = new BlockOreSoularite(3, 30f);
		ebon_ore = new BlockMultiOre("ore/ebon_ore");
		ebon_ore_nether = new BlockMultiOre("ore/ebon_ore_nether");
		
		draconium_block = new BlockDraconium("gem/draconium/draconium_block");
		velious_block = new BlockVelious("gem/velious/velious_block");
		arcanite_block = new BlockArcanite("gem/arcanite/arcanite_block");
		katcheen_block = new BlockKatcheen("gem/katcheen/katcheen_block");
		necrocite_block = new BlockNecrocite("gem/necrocite/necrocite_block");
		soularite_block = new BlockSoularite("gem/soularite/soularite_block");
		
		draconium_block_brick = new BlockDraconium("gem/draconium/draconium_block_brick");
		velious_block_brick = new BlockVelious("gem/velious/velious_block_brick");
		arcanite_block_brick = new BlockArcanite("gem/arcanite/arcanite_block_brick");
		katcheen_block_brick = new BlockKatcheen("gem/katcheen/katcheen_block_brick");
		necrocite_block_brick = new BlockNecrocite("gem/necrocite/necrocite_block_brick");
		soularite_block_brick = new BlockSoularite("gem/soularite/soularite_block_brick");
		
		double_draconium_slab = new BlockDoubleSlab("slab/draconium/double_draconium_slab");
		double_velious_slab = new BlockDoubleSlab("slab/velious/double_velious_slab");
		double_arcanite_slab = new BlockDoubleSlab("slab/arcanite/double_arcanite_slab");
		double_katcheen_slab = new BlockDoubleSlab("slab/katcheen/double_katcheen_slab");
		double_necrocite_slab = new BlockDoubleSlab("slab/necrocite/double_necrocite_slab");
		double_soularite_slab = new BlockDoubleSlab("slab/soularite/double_soularite_slab");
		
		draconium_slab = new BlockHalfSlab("slab/draconium/draconium_slab");
		velious_slab = new BlockHalfSlab("slab/velious/velious_slab");
		arcanite_slab = new BlockHalfSlab("slab/arcanite/arcanite_slab");
		katcheen_slab = new BlockHalfSlab("slab/katcheen/katcheen_slab");
		necrocite_slab = new BlockHalfSlab("slab/necrocite/necrocite_slab");
		soularite_slab = new BlockHalfSlab("slab/soularite/soularite_slab");
		
		draconium_stairs = new EABlockStairs("stairs/draconium_stairs");
		velious_stairs = new EABlockStairs("stairs/velious_stairs");
		arcanite_stairs = new EABlockStairs("stairs/arcanite_stairs");
		katcheen_stairs = new EABlockStairs("stairs/katcheen_stairs");
		necrocite_stairs = new EABlockStairs("stairs/necrocite_stairs");
		soularite_stairs = new EABlockStairs("stairs/soularite_stairs");
		
		draconium_fence = new EABlockFence("fence/draconium_fence");
		velious_fence = new EABlockFence("fence/velious_fence");
		arcanite_fence = new EABlockFence("fence/arcanite_fence");
		katcheen_fence = new EABlockFence("fence/katcheen_fence");
		necrocite_fence = new EABlockFence("fence/necrocite_fence");
		soularite_fence = new EABlockFence("fence/soularite_fence");
		
		draconium_fence_gate = new EABlockFenceGate("fence/draconium_fence_gate");
		velious_fence_gate = new EABlockFenceGate("fence/velious_fence_gate");
		arcanite_fence_gate = new EABlockFenceGate("fence/arcanite_fence_gate");
		katcheen_fence_gate = new EABlockFenceGate("fence/katcheen_fence_gate");
		necrocite_fence_gate = new EABlockFenceGate("fence/necrocite_fence_gate");
		soularite_fence_gate = new EABlockFenceGate("fence/soularite_fence_gate");
		
		draconium_wall = new EABlockWall("wall/draconium_wall");
		velious_wall = new EABlockWall("wall/velious_wall");
		arcanite_wall = new EABlockWall("wall/arcanite_wall");
		katcheen_wall = new EABlockWall("wall/katcheen_wall");
		necrocite_wall = new EABlockWall("wall/necrocite_wall");
		soularite_wall = new EABlockWall("wall/soularite_wall");
		
		mystic_block_normal = new BlockMystic();
		innate_mystic_block_normal = new BlockInnateMysticNormal();
		
		obsidian_block = new BlockObsidian("gem/obsidian/obsidian_block");
		obsidian_block_brick = new BlockObsidian("gem/obsidian/obsidian_block_brick").setHardness(50.0F).setResistance(2000.0F);
		double_obsidian_slab = new BlockDoubleSlab("slab/obsidian/double_obsidian_slab").setHardness(50.0F).setResistance(2000.0F);
		obsidian_slab = new BlockHalfSlab("slab/obsidian/obsidian_slab").setHardness(50.0F).setResistance(2000.0F);
		obsidian_stairs = new EABlockStairs("stairs/obsidian_stairs").setHardness(50.0F).setResistance(2000.0F);
		obsidian_fence = new EABlockFence("fence/obsidian_fence").setHardness(50.0F).setResistance(2000.0F);
		obsidian_fence_gate = new EABlockFenceGate("fence/obsidian_fence_gate").setHardness(50.0F).setResistance(2000.0F);
		obsidian_wall = new EABlockWall("wall/obsidian_wall").setHardness(50.0F).setResistance(2000.0F);
		
		glowstone_block = new BlockGlowstone("gem/glowstone/glowstone_block");
		glowstone_block_brick = new BlockGlowstone("gem/glowstone/glowstone_block_brick").setLightLevel(1.0f);
		double_glowstone_slab = new BlockDoubleSlab("slab/glowstone/double_glowstone_slab").setLightLevel(1.0f);
		glowstone_slab = new BlockHalfSlab("slab/glowstone/glowstone_slab").setLightLevel(1.0f);
		glowstone_stairs = new EABlockStairs("stairs/glowstone_stairs").setLightLevel(1.0f);
		glowstone_fence = new EABlockFence("fence/glowstone_fence").setLightLevel(1.0f);
		glowstone_fence_gate = new EABlockFenceGate("fence/glowstone_fence_gate").setLightLevel(1.0f);
		glowstone_wall = new EABlockWall("wall/glowstone_wall").setLightLevel(1.0f);
		
		
		
		
		paper_block = new BlockPaper();
		
		//pillar = new EABlockPillar().setUnlocalizedName("pillar");
		
		//mystic_furnace = new TestBlockFurnaceEA(false).setUnlocalizedName("machine/mystic_furnace").setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		//lit_mystic_furnace = new TestBlockFurnaceEA(true).setUnlocalizedName("machine/lit_mystic_furnace").setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		
		//test_liquid = new TestBlockStaticLiquidEA(Material.water);
		//flowing_test_liquid = new TestBlockDynamicLiquidEA(Material.water);
		
		
		//column = new EABlockPillar();
		
		//purified_mystic_block = new GeneralModBlocks(Material.rock).setUnlocalizedName("purified_mystic_block").setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		
		
	}
	
	
	public static void register()
	{
		GameRegistry.registerBlock(draconium_ore, draconium_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(velious_ore, velious_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(arcanite_ore, arcanite_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(katcheen_ore, katcheen_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(necrocite_ore, necrocite_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(soularite_ore, soularite_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ebon_ore, ebon_ore.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(ebon_ore_nether, ebon_ore_nether.getUnlocalizedName().substring(5));
		
		GameRegistry.registerBlock(mystic_block_normal, mystic_block_normal.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(mystic_block = new EABlockMeta("gem/mystic/mystic_block", Material.rock), ItemBlockMeta.class, "gem/mystic/mystic_block");
		
		GameRegistry.registerBlock(innate_mystic_block_normal, innate_mystic_block_normal.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(innate_mystic_block = new EABlockMeta("gem/mystic/innate_mystic_block", Material.rock), ItemBlockMeta.class, "gem/mystic/innate_mystic_block");
		
		GameRegistry.registerBlock(draconium_block, draconium_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(velious_block, velious_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(arcanite_block, arcanite_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(katcheen_block, katcheen_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(necrocite_block, necrocite_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(soularite_block, soularite_block.getUnlocalizedName().substring(5));
		
		GameRegistry.registerBlock(draconium_block_brick, draconium_block_brick.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(velious_block_brick, velious_block_brick.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(arcanite_block_brick, arcanite_block_brick.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(katcheen_block_brick, katcheen_block_brick.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(necrocite_block_brick, necrocite_block_brick.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(soularite_block_brick, soularite_block_brick.getUnlocalizedName().substring(5));
		
		GameRegistry.registerBlock(double_draconium_slab, ItemBlockSlab.class, "slab/draconium/double_draconium_slab", draconium_slab, double_draconium_slab, true);
		GameRegistry.registerBlock(double_velious_slab, ItemBlockSlab.class, "slab/velious/double_velious_slab", velious_slab, double_velious_slab, true);
		GameRegistry.registerBlock(double_arcanite_slab, ItemBlockSlab.class, "slab/arcanite/double_arcanite_slab", arcanite_slab, double_arcanite_slab, true);
		GameRegistry.registerBlock(double_katcheen_slab, ItemBlockSlab.class, "slab/katcheen/double_katcheen_slab", katcheen_slab, double_katcheen_slab, true);
		GameRegistry.registerBlock(double_necrocite_slab, ItemBlockSlab.class, "slab/necrocite/double_necrocite_slab", necrocite_slab, double_necrocite_slab, true);
		GameRegistry.registerBlock(double_soularite_slab, ItemBlockSlab.class, "slab/soularite/double_soularite_slab", soularite_slab, double_soularite_slab, true);
		
		GameRegistry.registerBlock(draconium_slab, ItemBlockSlab.class, "slab/draconium/draconium_slab", draconium_slab, double_draconium_slab, false);
		GameRegistry.registerBlock(velious_slab, ItemBlockSlab.class, "slab/velious/velious_slab", velious_slab, double_velious_slab, false);
		GameRegistry.registerBlock(arcanite_slab, ItemBlockSlab.class, "slab/arcanite/arcanite_slab", arcanite_slab, double_arcanite_slab, false);
		GameRegistry.registerBlock(katcheen_slab, ItemBlockSlab.class, "slab/katcheen/katcheen_slab", katcheen_slab, double_katcheen_slab, false);
		GameRegistry.registerBlock(necrocite_slab, ItemBlockSlab.class, "slab/necrocite/necrocite_slab", necrocite_slab, double_necrocite_slab, false);
		GameRegistry.registerBlock(soularite_slab, ItemBlockSlab.class, "slab/soularite/soularite_slab", soularite_slab, double_soularite_slab, false);
		
		GameRegistry.registerBlock(draconium_stairs, draconium_stairs.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(velious_stairs, velious_stairs.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(arcanite_stairs, arcanite_stairs.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(katcheen_stairs, katcheen_stairs.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(necrocite_stairs, necrocite_stairs.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(soularite_stairs, soularite_stairs.getUnlocalizedName().substring(5));
		
		GameRegistry.registerBlock(draconium_fence, draconium_fence.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(velious_fence, velious_fence.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(arcanite_fence, arcanite_fence.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(katcheen_fence, katcheen_fence.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(necrocite_fence, necrocite_fence.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(soularite_fence, soularite_fence.getUnlocalizedName().substring(5));
		
		GameRegistry.registerBlock(draconium_fence_gate, draconium_fence_gate.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(velious_fence_gate, velious_fence_gate.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(arcanite_fence_gate, arcanite_fence_gate.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(katcheen_fence_gate, katcheen_fence_gate.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(necrocite_fence_gate, necrocite_fence_gate.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(soularite_fence_gate, soularite_fence_gate.getUnlocalizedName().substring(5));
		
		GameRegistry.registerBlock(draconium_wall, draconium_wall.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(velious_wall, velious_wall.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(arcanite_wall, arcanite_wall.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(katcheen_wall, katcheen_wall.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(necrocite_wall, necrocite_wall.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(soularite_wall, soularite_wall.getUnlocalizedName().substring(5));
		
		GameRegistry.registerBlock(obsidian_block, obsidian_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(obsidian_block_brick, obsidian_block_brick.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(double_obsidian_slab, ItemBlockSlab.class, "slab/obsidian/double_obsidian_slab", obsidian_slab, double_obsidian_slab, true);
		GameRegistry.registerBlock(obsidian_slab, ItemBlockSlab.class, "slab/obsidian/obsidian_slab", obsidian_slab, double_obsidian_slab, false);
		GameRegistry.registerBlock(obsidian_stairs, obsidian_stairs.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(obsidian_fence, obsidian_fence.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(obsidian_fence_gate, obsidian_fence_gate.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(obsidian_wall, obsidian_wall.getUnlocalizedName().substring(5));
		
		GameRegistry.registerBlock(glowstone_block, glowstone_block.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(glowstone_block_brick, glowstone_block_brick.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(double_glowstone_slab, ItemBlockSlab.class, "slab/glowstone/double_glowstone_slab", glowstone_slab, double_glowstone_slab, true);
		GameRegistry.registerBlock(glowstone_slab, ItemBlockSlab.class, "slab/glowstone/glowstone_slab", glowstone_slab, double_glowstone_slab, false);
		GameRegistry.registerBlock(glowstone_stairs, glowstone_stairs.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(glowstone_fence, glowstone_fence.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(glowstone_fence_gate, glowstone_fence_gate.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(glowstone_wall, glowstone_wall.getUnlocalizedName().substring(5));
		
		GameRegistry.registerBlock(paper_block, paper_block.getUnlocalizedName().substring(5));
		
		
		
		
		
		
		
		//GameRegistry.registerBlock(pillar, pillar.getUnlocalizedName().substring(5));
		
		//GameRegistry.registerBlock(mystic_furnace, mystic_furnace.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(lit_mystic_furnace, lit_mystic_furnace.getUnlocalizedName().substring(5));
		
		//GameRegistry.registerBlock(test_liquid, test_liquid.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(flowing_test_liquid, flowing_test_liquid.getUnlocalizedName().substring(5));
		
		
		//GameRegistry.registerBlock(column, column.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(arcanite_double_slab, arcanite_double_slab.getUnlocalizedName().substring(5));
		//GameRegistry.registerBlock(arcanite_slab, arcanite_slab.getUnlocalizedName().substring(5));
		
		//GameRegistry.registerBlock(purified_mystic_block, purified_mystic_block.getUnlocalizedName().substring(5));
		

	}
	
	public static void registerRenders()
	{
		registerRender(draconium_ore);
		registerRender(velious_ore);
		registerRender(arcanite_ore);
		registerRender(katcheen_ore);
		registerRender(necrocite_ore);
		registerRender(soularite_ore);
		registerRender(ebon_ore);
		registerRender(ebon_ore_nether);
		
		registerRender(mystic_block_normal);
		registerRender(mystic_block);
		registerRender(InitBlocksEA.mystic_block, 0, "gem/mystic/mystic_block_white");
		registerRender(InitBlocksEA.mystic_block, 1, "gem/mystic/mystic_block_orange");
		registerRender(InitBlocksEA.mystic_block, 2, "gem/mystic/mystic_block_magenta");
		registerRender(InitBlocksEA.mystic_block, 3, "gem/mystic/mystic_block_lightblue");
		registerRender(InitBlocksEA.mystic_block, 4, "gem/mystic/mystic_block_yellow");
		registerRender(InitBlocksEA.mystic_block, 5, "gem/mystic/mystic_block_lime");
		registerRender(InitBlocksEA.mystic_block, 6, "gem/mystic/mystic_block_pink");
		registerRender(InitBlocksEA.mystic_block, 7, "gem/mystic/mystic_block_gray");
		registerRender(InitBlocksEA.mystic_block, 8, "gem/mystic/mystic_block_lightgray");
		registerRender(InitBlocksEA.mystic_block, 9, "gem/mystic/mystic_block_cyan");
		registerRender(InitBlocksEA.mystic_block, 10, "gem/mystic/mystic_block_purple");
		registerRender(InitBlocksEA.mystic_block, 11, "gem/mystic/mystic_block_blue");
		registerRender(InitBlocksEA.mystic_block, 12, "gem/mystic/mystic_block_brown");
		registerRender(InitBlocksEA.mystic_block, 13, "gem/mystic/mystic_block_green");
		registerRender(InitBlocksEA.mystic_block, 14, "gem/mystic/mystic_block_red");
		registerRender(InitBlocksEA.mystic_block, 15, "gem/mystic/mystic_block_black");
		
		registerRender(innate_mystic_block_normal);
		registerRender(innate_mystic_block);
		registerRender(InitBlocksEA.innate_mystic_block, 0, "gem/mystic/innate_mystic_block_white");
		registerRender(InitBlocksEA.innate_mystic_block, 1, "gem/mystic/innate_mystic_block_orange");
		registerRender(InitBlocksEA.innate_mystic_block, 2, "gem/mystic/innate_mystic_block_magenta");
		registerRender(InitBlocksEA.innate_mystic_block, 3, "gem/mystic/innate_mystic_block_lightblue");
		registerRender(InitBlocksEA.innate_mystic_block, 4, "gem/mystic/innate_mystic_block_yellow");
		registerRender(InitBlocksEA.innate_mystic_block, 5, "gem/mystic/innate_mystic_block_lime");
		registerRender(InitBlocksEA.innate_mystic_block, 6, "gem/mystic/innate_mystic_block_pink");
		registerRender(InitBlocksEA.innate_mystic_block, 7, "gem/mystic/innate_mystic_block_gray");
		registerRender(InitBlocksEA.innate_mystic_block, 8, "gem/mystic/innate_mystic_block_lightgray");
		registerRender(InitBlocksEA.innate_mystic_block, 9, "gem/mystic/innate_mystic_block_cyan");
		registerRender(InitBlocksEA.innate_mystic_block, 10, "gem/mystic/innate_mystic_block_purple");
		registerRender(InitBlocksEA.innate_mystic_block, 11, "gem/mystic/innate_mystic_block_blue");
		registerRender(InitBlocksEA.innate_mystic_block, 12, "gem/mystic/innate_mystic_block_brown");
		registerRender(InitBlocksEA.innate_mystic_block, 13, "gem/mystic/innate_mystic_block_green");
		registerRender(InitBlocksEA.innate_mystic_block, 14, "gem/mystic/innate_mystic_block_red");
		registerRender(InitBlocksEA.innate_mystic_block, 15, "gem/mystic/innate_mystic_block_black");
		
		registerRender(draconium_block);
		registerRender(velious_block);
		registerRender(arcanite_block);
		registerRender(katcheen_block);
		registerRender(necrocite_block);
		registerRender(soularite_block);
		
		registerRender(draconium_block_brick);
		registerRender(velious_block_brick);
		registerRender(arcanite_block_brick);
		registerRender(katcheen_block_brick);
		registerRender(necrocite_block_brick);
		registerRender(soularite_block_brick);
		
		registerRender(double_draconium_slab);
		registerRender(double_velious_slab);
		registerRender(double_arcanite_slab);
		registerRender(double_katcheen_slab);
		registerRender(double_necrocite_slab);
		registerRender(double_soularite_slab);
		
		registerRender(draconium_slab);
		registerRender(velious_slab);
		registerRender(arcanite_slab);
		registerRender(katcheen_slab);
		registerRender(necrocite_slab);
		registerRender(soularite_slab);
		
		registerRender(draconium_stairs);
		registerRender(velious_stairs);
		registerRender(arcanite_stairs);
		registerRender(katcheen_stairs);
		registerRender(necrocite_stairs);
		registerRender(soularite_stairs);
		
		registerRender(draconium_fence);
		registerRender(velious_fence);
		registerRender(arcanite_fence);
		registerRender(katcheen_fence);
		registerRender(necrocite_fence);
		registerRender(soularite_fence);
		
		registerRender(draconium_fence_gate);
		registerRender(velious_fence_gate);
		registerRender(arcanite_fence_gate);
		registerRender(katcheen_fence_gate);
		registerRender(necrocite_fence_gate);
		registerRender(soularite_fence_gate);
		
		registerRender(draconium_wall);
		registerRender(velious_wall);
		registerRender(arcanite_wall);
		registerRender(katcheen_wall);
		registerRender(necrocite_wall);
		registerRender(soularite_wall);
		
		registerRender(obsidian_block);
		registerRender(obsidian_block_brick);
		registerRender(double_obsidian_slab);
		registerRender(obsidian_slab);
		registerRender(obsidian_stairs);
		registerRender(obsidian_fence);
		registerRender(obsidian_fence_gate);
		registerRender(obsidian_wall);
		
		registerRender(glowstone_block);
		registerRender(glowstone_block_brick);
		registerRender(double_glowstone_slab);
		registerRender(glowstone_slab);
		registerRender(glowstone_stairs);
		registerRender(glowstone_fence);
		registerRender(glowstone_fence_gate);
		registerRender(glowstone_wall);
		
		registerRender(paper_block);
		
		//registerRender(column);
		
		//registerRender(pillar);
		
		
		
		
		//registerRender(mystic_furnace);
		//registerRender(lit_mystic_furnace);
				
		//registerRender(test_liquid);
		//registerRender(flowing_test_liquid);
		
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
