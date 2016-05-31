package com.ebonheart.EbonArtsMod.init;

import net.minecraft.block.Block;

import com.ebonheart.EbonArtsMod.api.BlocksEA;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EAArcaniteFence;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EAArcaniteFenceGate;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EAArcaniteWall;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EABlockLadder;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EABlockPillar;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EABlockStairs;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EABlockTrapDoor;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EADraconiumFence;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EADraconiumFenceGate;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EADraconiumWall;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EAEbonheartFence;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EAEbonheartFenceGate;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EAEbonheartWall;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EAGlowstoneFence;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EAGlowstoneFenceGate;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EAGlowstoneWall;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EAKatcheenFence;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EAKatcheenFenceGate;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EAKatcheenWall;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EANecrociteFence;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EANecrociteFenceGate;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EANecrociteWall;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EAObsidianFence;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EAObsidianFenceGate;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EAObsidianWall;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EASoulariteFence;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EASoulariteFenceGate;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EASoulariteWall;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EAVeliousFence;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EAVeliousFenceGate;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EAVeliousWall;
import com.ebonheart.EbonArtsMod.common.blocks.basic.blocks.EABlock;
import com.ebonheart.EbonArtsMod.common.blocks.basic.bricks.EABlockBrick;
import com.ebonheart.EbonArtsMod.common.blocks.basic.dyeables.BlockMysticCobblestone;
import com.ebonheart.EbonArtsMod.common.blocks.basic.dyeables.BlockMysticCobblestoneGlass;
import com.ebonheart.EbonArtsMod.common.blocks.basic.dyeables.BlockMysticStone;
import com.ebonheart.EbonArtsMod.common.blocks.basic.dyeables.BlockMysticStoneGlass;
import com.ebonheart.EbonArtsMod.common.blocks.basic.dyeables.BlockMysticWood;
import com.ebonheart.EbonArtsMod.common.blocks.basic.dyeables.BlockMysticWoodGlass;
import com.ebonheart.EbonArtsMod.common.blocks.basic.slabs.BlockDoubleSlab;
import com.ebonheart.EbonArtsMod.common.blocks.basic.slabs.BlockHalfSlab;
import com.ebonheart.EbonArtsMod.common.blocks.basic.slabs.ItemBlockSlab;
import com.ebonheart.EbonArtsMod.common.blocks.basic.storage.BlockLeather;
import com.ebonheart.EbonArtsMod.common.blocks.basic.storage.BlockPaper;
import com.ebonheart.EbonArtsMod.common.blocks.basic.storage.BlockReed;
import com.ebonheart.EbonArtsMod.common.blocks.basic.torches.EABlockTorchArcanite;
import com.ebonheart.EbonArtsMod.common.blocks.basic.torches.EABlockTorchDraconium;
import com.ebonheart.EbonArtsMod.common.blocks.basic.torches.EABlockTorchEbonheart;
import com.ebonheart.EbonArtsMod.common.blocks.basic.torches.EABlockTorchGlowstone;
import com.ebonheart.EbonArtsMod.common.blocks.basic.torches.EABlockTorchKatcheen;
import com.ebonheart.EbonArtsMod.common.blocks.basic.torches.EABlockTorchNecrocite;
import com.ebonheart.EbonArtsMod.common.blocks.basic.torches.EABlockTorchObsidian;
import com.ebonheart.EbonArtsMod.common.blocks.basic.torches.EABlockTorchSoularite;
import com.ebonheart.EbonArtsMod.common.blocks.basic.torches.EABlockTorchVelious;
import com.ebonheart.EbonArtsMod.common.blocks.world.BlockMultiOre;
import com.ebonheart.EbonArtsMod.common.blocks.world.BlockOreArcanite;
import com.ebonheart.EbonArtsMod.common.blocks.world.BlockOreDraconium;
import com.ebonheart.EbonArtsMod.common.blocks.world.BlockOreEbonheart;
import com.ebonheart.EbonArtsMod.common.blocks.world.BlockOreKatcheen;
import com.ebonheart.EbonArtsMod.common.blocks.world.BlockOreNecrocite;
import com.ebonheart.EbonArtsMod.common.blocks.world.BlockOreSoularite;
import com.ebonheart.EbonArtsMod.common.blocks.world.BlockOreVelious;
import com.ebonheart.EbonArtsMod.common.blocks.world.DragonFruitCrop;
import com.ebonheart.EbonArtsMod.common.blocks.world.HellionFruitCrop;
import com.ebonheart.EbonArtsMod.common.blocks.world.SacredFruitCrop;

import cpw.mods.fml.common.registry.GameRegistry;
//import net.minecraft.block.BlockPurpurSlab;

public class InitBlocksEA extends BlocksEA {
	
	//public static final Set<Block> blocks = new HashSet<Block>();
	
	public static void preInit()
	{
		registerBlock(draconium_ore = new BlockOreDraconium(2, 0.4f, 10f));
		registerBlock(velious_ore = new BlockOreVelious(2, 15f));
		registerBlock(arcanite_ore = new BlockOreArcanite(2, 20f));
		registerBlock(katcheen_ore = new BlockOreKatcheen(3, 30f));
		registerBlock(necrocite_ore = new BlockOreNecrocite(3, 30f));
		registerBlock(soularite_ore = new BlockOreSoularite(3, 30f));
		registerBlock(ebonheart_ore = new BlockOreEbonheart(3, 30f));
		registerBlock(ebon_ore = new BlockMultiOre("ores/ebon_ore"));
		registerBlock(ebon_ore_nether = new BlockMultiOre("ores/ebon_ore_nether"));
			
		registerBlock(draconium_block = new EABlock("block/draconium_block").setResistance(4.0F));
		registerBlock(velious_block = new EABlock("block/velious_block").setResistance(15.0F));
		registerBlock(arcanite_block = new EABlock("block/arcanite_block").setResistance(30.0F));
		registerBlock(katcheen_block = new EABlock("block/katcheen_block").setResistance(100.0F));
		registerBlock(necrocite_block = new EABlock("block/necrocite_block").setResistance(45.0F));
		registerBlock(soularite_block = new EABlock("block/soularite_block").setResistance(45.0F));
		registerBlock(ebonheart_block = new EABlock("block/ebonheart_block").setResistance(2000.0F));
		registerBlock(obsidian_block = new EABlock("block/obsidian_block").setResistance(2000.0F));
		registerBlock(glowstone_block = new EABlock("block/glowstone_block").setResistance(45.0F).setLightLevel(1.0f));
			
		registerBlock(draconium_block_brick = new EABlockBrick("block/draconium_brick").setResistance(4.0F));
		registerBlock(velious_block_brick = new EABlockBrick("block/velious_brick").setResistance(15.0F));
		registerBlock(arcanite_block_brick = new EABlockBrick("block/arcanite_brick").setResistance(30.0F));
		registerBlock(katcheen_block_brick = new EABlockBrick("block/katcheen_brick").setResistance(100.0F));
		registerBlock(necrocite_block_brick = new EABlockBrick("block/necrocite_brick").setResistance(45.0F));
		registerBlock(soularite_block_brick = new EABlockBrick("block/soularite_brick").setResistance(45.0F));
		registerBlock(ebonheart_block_brick = new EABlockBrick("block/ebonheart_brick").setResistance(2000.0F));
		registerBlock(obsidian_block_brick = new EABlockBrick("block/obsidian_brick").setResistance(2000.0F));
		registerBlock(glowstone_block_brick = new EABlockBrick("block/glowstone_brick").setResistance(45.0F).setLightLevel(1.0f));
		
		
		
		registerBlock(double_draconium_slab = new BlockDoubleSlab(true, "slab/draconium_slab").setResistance(4.0F));
		registerBlock(double_velious_slab = new BlockDoubleSlab(true, "slab/velious_slab").setResistance(15.0F));
		registerBlock(double_arcanite_slab = new BlockDoubleSlab(true, "slab/arcanite_slab").setResistance(30.0F));
		registerBlock(double_katcheen_slab = new BlockDoubleSlab(true, "slab/katcheen_slab").setResistance(100.0F));
		registerBlock(double_necrocite_slab = new BlockDoubleSlab(true, "slab/necrocite_slab").setResistance(45.0F));
		registerBlock(double_soularite_slab = new BlockDoubleSlab(true, "slab/soularite_slab").setResistance(45.0F));
		registerBlock(double_ebonheart_slab = new BlockDoubleSlab(true, "slab/ebonheart_slab").setResistance(2000.0F));
		registerBlock(double_obsidian_slab = new BlockDoubleSlab(true, "slab/obsidian_slab").setResistance(2000.0F));
		registerBlock(double_glowstone_slab = new BlockDoubleSlab(true, "slab/glowstone_slab").setResistance(45.0F).setLightLevel(1.0f));
		
		draconium_slab = new BlockHalfSlab(false, "slab/draconium_slab").setResistance(4.0F);
		velious_slab = new BlockHalfSlab(false, "slab/velious_slab").setResistance(15.0F);
		arcanite_slab = new BlockHalfSlab(false, "slab/arcanite_slab").setResistance(30.0F);
		katcheen_slab = new BlockHalfSlab(false, "slab/katcheen_slab").setResistance(100.0F);
		necrocite_slab = new BlockHalfSlab(false, "slab/necrocite_slab").setResistance(45.0F);
		soularite_slab = new BlockHalfSlab(false, "slab/soularite_slab").setResistance(45.0F);
		ebonheart_slab = new BlockHalfSlab(false, "slab/ebonheart_slab").setResistance(2000.0F);
		obsidian_slab = new BlockHalfSlab(false, "slab/obsidian_slab").setResistance(2000.0F);
		glowstone_slab = new BlockHalfSlab(false, "slab/glowstone_slab").setResistance(45.0F).setLightLevel(1.0f);
		
		GameRegistry.registerBlock(draconium_slab, ItemBlockSlab.class, "slab/draconium/draconium_slab", draconium_slab, double_draconium_slab, false);
		GameRegistry.registerBlock(velious_slab, ItemBlockSlab.class, "slab/velious/velious_slab", velious_slab, double_velious_slab, false);
		GameRegistry.registerBlock(arcanite_slab, ItemBlockSlab.class, "slab/arcanite/arcanite_slab", arcanite_slab, double_arcanite_slab, false);
		GameRegistry.registerBlock(katcheen_slab, ItemBlockSlab.class, "slab/katcheen/katcheen_slab", katcheen_slab, double_katcheen_slab, false);
		GameRegistry.registerBlock(necrocite_slab, ItemBlockSlab.class, "slab/necrocite/necrocite_slab", necrocite_slab, double_necrocite_slab, false);
		GameRegistry.registerBlock(soularite_slab, ItemBlockSlab.class, "slab/soularite/soularite_slab", soularite_slab, double_soularite_slab, false);
		GameRegistry.registerBlock(ebonheart_slab, ItemBlockSlab.class, "slab/ebonheart/ebonheart_slab", ebonheart_slab, double_ebonheart_slab, false);
		GameRegistry.registerBlock(obsidian_slab, ItemBlockSlab.class, "slab/obsidian/obsidian_slab", obsidian_slab, double_obsidian_slab, false);
		GameRegistry.registerBlock(glowstone_slab, ItemBlockSlab.class, "slab/glowstone/glowstone_slab", glowstone_slab, double_glowstone_slab, false);
		
		
		
		registerBlock(draconium_stairs = new EABlockStairs(draconium_block, "stairs/draconium_stairs").setResistance(4.0F));
		registerBlock(velious_stairs = new EABlockStairs(velious_block, "stairs/velious_stairs").setResistance(15.0F));
		registerBlock(arcanite_stairs = new EABlockStairs(arcanite_block, "stairs/arcanite_stairs").setResistance(30.0F));
		registerBlock(katcheen_stairs = new EABlockStairs(katcheen_block, "stairs/katcheen_stairs").setResistance(100.0F));
		registerBlock(necrocite_stairs = new EABlockStairs(necrocite_block, "stairs/necrocite_stairs").setResistance(45.0F));
		registerBlock(soularite_stairs = new EABlockStairs(soularite_block, "stairs/soularite_stairs").setResistance(45.0F));
		registerBlock(ebonheart_stairs = new EABlockStairs(ebonheart_block, "stairs/ebonheart_stairs").setResistance(2000.0F));
		registerBlock(obsidian_stairs = new EABlockStairs(obsidian_block, "stairs/obsidian_stairs").setResistance(2000.0F));
		registerBlock(glowstone_stairs = new EABlockStairs(glowstone_block, "stairs/glowstone_stairs").setResistance(45.0F).setLightLevel(1.0f));
		
		registerBlock(draconium_fence = new EADraconiumFence("fence/draconium_fence").setResistance(4.0F));
		registerBlock(velious_fence = new EAVeliousFence("fence/velious_fence").setResistance(15.0F));
		registerBlock(arcanite_fence = new EAArcaniteFence("fence/arcanite_fence").setResistance(30.0F));
		registerBlock(katcheen_fence = new EAKatcheenFence("fence/katcheen_fence").setResistance(100.0F));
		registerBlock(necrocite_fence = new EANecrociteFence("fence/necrocite_fence").setResistance(45.0F));
		registerBlock(soularite_fence = new EASoulariteFence("fence/soularite_fence").setResistance(45.0F));
		registerBlock(ebonheart_fence = new EAEbonheartFence("fence/ebonheart_fence").setResistance(2000.0F));
		registerBlock(obsidian_fence = new EAObsidianFence("fence/obsidian_fence").setResistance(2000.0F));
		registerBlock(glowstone_fence = new EAGlowstoneFence("fence/glowstone_fence").setResistance(45.0F).setLightLevel(1.0f));
		
		registerBlock(draconium_fence_gate = new EADraconiumFenceGate("fence/draconium_fence_gate", draconium_block).setResistance(4.0F));
		registerBlock(velious_fence_gate = new EAVeliousFenceGate("fence/velious_fence_gate", velious_block).setResistance(15.0F));
		registerBlock(arcanite_fence_gate = new EAArcaniteFenceGate("fence/arcanite_fence_gate", arcanite_block).setResistance(30.0F));
		registerBlock(katcheen_fence_gate = new EAKatcheenFenceGate("fence/katcheen_fence_gate", katcheen_block).setResistance(100.0F));
		registerBlock(necrocite_fence_gate = new EANecrociteFenceGate("fence/necrocite_fence_gate", necrocite_block).setResistance(45.0F));
		registerBlock(soularite_fence_gate = new EASoulariteFenceGate("fence/soularite_fence_gate", soularite_block).setResistance(45.0F));
		registerBlock(ebonheart_fence_gate = new EAEbonheartFenceGate("fence/ebonheart_fence_gate", ebonheart_block).setResistance(2000.0F));
		registerBlock(obsidian_fence_gate = new EAObsidianFenceGate("fence/obsidian_fence_gate", obsidian_block).setResistance(2000.0F));
		registerBlock(glowstone_fence_gate = new EAGlowstoneFenceGate("fence/glowstone_fence_gate", glowstone_block).setResistance(45.0F).setLightLevel(1.0f));
		
		registerBlock(draconium_wall = new EADraconiumWall("wall/draconium_wall").setResistance(4.0F));
		registerBlock(velious_wall = new EAVeliousWall("wall/velious_wall").setResistance(15.0F));
		registerBlock(arcanite_wall = new EAArcaniteWall("wall/arcanite_wall").setResistance(30.0F));
		registerBlock(katcheen_wall = new EAKatcheenWall("wall/katcheen_wall").setResistance(100.0F));
		registerBlock(necrocite_wall = new EANecrociteWall("wall/necrocite_wall").setResistance(45.0F));
		registerBlock(soularite_wall = new EASoulariteWall("wall/soularite_wall").setResistance(45.0F));
		registerBlock(ebonheart_wall = new EAEbonheartWall("wall/ebonheart_wall").setResistance(2000.0F));
		registerBlock(obsidian_wall = new EAObsidianWall("wall/obsidian_wall").setResistance(2000.0F));
		registerBlock(glowstone_wall = new EAGlowstoneWall("wall/glowstone_wall").setResistance(45.0F).setLightLevel(1.0f));
		
		registerBlock(draconium_torch = new EABlockTorchDraconium().setResistance(4.0F));
		registerBlock(velious_torch = new EABlockTorchVelious().setResistance(15.0F));
		registerBlock(arcanite_torch = new EABlockTorchArcanite().setResistance(30.0F));
		registerBlock(katcheen_torch = new EABlockTorchKatcheen().setResistance(100.0F));
		registerBlock(necrocite_torch = new EABlockTorchNecrocite().setResistance(45.0F));
		registerBlock(soularite_torch = new EABlockTorchSoularite().setResistance(45.0F));
		registerBlock(ebonheart_torch = new EABlockTorchEbonheart().setResistance(2000.0F));
		registerBlock(obsidian_torch = new EABlockTorchObsidian().setResistance(2000.0F));
		registerBlock(glowstone_torch = new EABlockTorchGlowstone().setResistance(45.0F));
		
		registerBlock(draconium_trapdoor = new EABlockTrapDoor("door/draconium_trapdoor").setResistance(4.0F));
		registerBlock(velious_trapdoor = new EABlockTrapDoor("door/velious_trapdoor").setResistance(4.0F));
		registerBlock(arcanite_trapdoor = new EABlockTrapDoor("door/arcanite_trapdoor").setResistance(4.0F));
		registerBlock(katcheen_trapdoor = new EABlockTrapDoor("door/katcheen_trapdoor").setResistance(4.0F));
		registerBlock(necrocite_trapdoor = new EABlockTrapDoor("door/necrocite_trapdoor").setResistance(4.0F));
		registerBlock(soularite_trapdoor = new EABlockTrapDoor("door/soularite_trapdoor").setResistance(4.0F));
		registerBlock(ebonheart_trapdoor = new EABlockTrapDoor("door/ebonheart_trapdoor").setResistance(4.0F));
		registerBlock(obsidian_trapdoor = new EABlockTrapDoor("door/obsidian_trapdoor").setResistance(4.0F));
		registerBlock(glowstone_trapdoor = new EABlockTrapDoor("door/glowstone_trapdoor").setResistance(4.0F));
		
		//draconium_door = new EABlockDoor("door/draconium_door").setHardness(5.0F).setResistance(4.0F);
		//velious_door = new EABlockDoor("door/velious_door").setHardness(5.0F).setResistance(15.0F);
		//arcanite_door = new EABlockDoor("door/arcanite_door").setHardness(5.0F).setResistance(30.0F);
		//katcheen_door = new EABlockDoor("door/katcheen_door").setHardness(5.0F).setResistance(2000.0F);
		//necrocite_door = new EABlockDoor("door/necrocite_door").setHardness(5.0F).setResistance(45.0F);
		//soularite_door = new EABlockDoor("door/soularite_door").setHardness(5.0F).setResistance(45.0F);
		
		registerBlock(draconium_ladder = new EABlockLadder("ladder/draconium_ladder"));
		registerBlock(velious_ladder = new EABlockLadder("ladder/velious_ladder"));
		registerBlock(arcanite_ladder = new EABlockLadder("ladder/arcanite_ladder"));
		registerBlock(katcheen_ladder = new EABlockLadder("ladder/katcheen_ladder"));
		registerBlock(necrocite_ladder = new EABlockLadder("ladder/necrocite_ladder"));
		registerBlock(soularite_ladder = new EABlockLadder("ladder/soularite_ladder"));
		registerBlock(ebonheart_ladder = new EABlockLadder("ladder/ebonheart_ladder"));
		registerBlock(obsidian_ladder = new EABlockLadder("ladder/obsidian_ladder"));
		registerBlock(glowstone_ladder = new EABlockLadder("ladder/glowstone_ladder").setLightLevel(1.0f));
		
		registerBlock(draconium_pillar = new EABlockPillar("pillar/draconium_pillar").setResistance(4.0F));
		registerBlock(velious_pillar = new EABlockPillar("pillar/velious_pillar").setResistance(15.0F));
		registerBlock(arcanite_pillar = new EABlockPillar("pillar/arcanite_pillar").setResistance(30.0F));
		registerBlock(katcheen_pillar = new EABlockPillar("pillar/katcheen_pillar").setResistance(100.0F));
		registerBlock(necrocite_pillar = new EABlockPillar("pillar/necrocite_pillar").setResistance(45.0F));
		registerBlock(soularite_pillar = new EABlockPillar("pillar/soularite_pillar").setResistance(45.0F));
		registerBlock(ebonheart_pillar = new EABlockPillar("pillar/ebonheart_pillar").setResistance(2000.0F));
		registerBlock(obsidian_pillar = new EABlockPillar("pillar/obsidian_pillar").setResistance(2000.0F));
		registerBlock(glowstone_pillar = new EABlockPillar("pillar/glowstone_pillar").setResistance(45.0F).setLightLevel(1.0f));
		
		
		
		
		registerBlock(cobble_mystic_block_normal = new BlockMysticCobblestone("dyeable/cobblestone/cobble_mystic_block_normal"));
		registerBlock(cobble_mystic_block_glass = new BlockMysticCobblestoneGlass("dyeable/cobblestone/cobble_mystic_block_glass"));
		registerBlock(cobble_mystic_block_white = new BlockMysticCobblestone("dyeable/cobblestone/cobble_mystic_block_white"));
		registerBlock(cobble_mystic_block_orange = new BlockMysticCobblestone("dyeable/cobblestone/cobble_mystic_block_orange"));
		registerBlock(cobble_mystic_block_magenta = new BlockMysticCobblestone("dyeable/cobblestone/cobble_mystic_block_magenta"));
		registerBlock(cobble_mystic_block_lightblue = new BlockMysticCobblestone("dyeable/cobblestone/cobble_mystic_block_lightblue"));
		registerBlock(cobble_mystic_block_yellow = new BlockMysticCobblestone("dyeable/cobblestone/cobble_mystic_block_yellow"));
		registerBlock(cobble_mystic_block_lime = new BlockMysticCobblestone("dyeable/cobblestone/cobble_mystic_block_lime"));
		registerBlock(cobble_mystic_block_pink = new BlockMysticCobblestone("dyeable/cobblestone/cobble_mystic_block_pink"));
		registerBlock(cobble_mystic_block_gray = new BlockMysticCobblestone("dyeable/cobblestone/cobble_mystic_block_gray"));
		registerBlock(cobble_mystic_block_lightgray = new BlockMysticCobblestone("dyeable/cobblestone/cobble_mystic_block_lightgray"));
		registerBlock(cobble_mystic_block_cyan = new BlockMysticCobblestone("dyeable/cobblestone/cobble_mystic_block_cyan"));
		registerBlock(cobble_mystic_block_purple = new BlockMysticCobblestone("dyeable/cobblestone/cobble_mystic_block_purple"));
		registerBlock(cobble_mystic_block_blue = new BlockMysticCobblestone("dyeable/cobblestone/cobble_mystic_block_blue"));
		registerBlock(cobble_mystic_block_brown = new BlockMysticCobblestone("dyeable/cobblestone/cobble_mystic_block_brown"));
		registerBlock(cobble_mystic_block_green = new BlockMysticCobblestone("dyeable/cobblestone/cobble_mystic_block_green"));
		registerBlock(cobble_mystic_block_red = new BlockMysticCobblestone("dyeable/cobblestone/cobble_mystic_block_red"));
		registerBlock(cobble_mystic_block_black = new BlockMysticCobblestone("dyeable/cobblestone/cobble_mystic_block_black"));
		
		registerBlock(mystic_block_normal = new BlockMysticStone("dyeable/stone/mystic_block_normal"));
		registerBlock(mystic_block_glass = new BlockMysticStoneGlass("dyeable/stone/mystic_block_glass"));
		registerBlock(mystic_block_white = new BlockMysticStone("dyeable/stone/mystic_block_white"));
		registerBlock(mystic_block_orange = new BlockMysticStone("dyeable/stone/mystic_block_orange"));
		registerBlock(mystic_block_magenta = new BlockMysticStone("dyeable/stone/mystic_block_magenta"));
		registerBlock(mystic_block_lightblue = new BlockMysticStone("dyeable/stone/mystic_block_lightblue"));
		registerBlock(mystic_block_yellow = new BlockMysticStone("dyeable/stone/mystic_block_yellow"));
		registerBlock(mystic_block_lime = new BlockMysticStone("dyeable/stone/mystic_block_lime"));
		registerBlock(mystic_block_pink = new BlockMysticStone("dyeable/stone/mystic_block_pink"));
		registerBlock(mystic_block_gray = new BlockMysticStone("dyeable/stone/mystic_block_gray"));
		registerBlock(mystic_block_lightgray = new BlockMysticStone("dyeable/stone/mystic_block_lightgray"));
		registerBlock(mystic_block_cyan = new BlockMysticStone("dyeable/stone/mystic_block_cyan"));
		registerBlock(mystic_block_purple = new BlockMysticStone("dyeable/stone/mystic_block_purple"));
		registerBlock(mystic_block_blue = new BlockMysticStone("dyeable/stone/mystic_block_blue"));
		registerBlock(mystic_block_brown = new BlockMysticStone("dyeable/stone/mystic_block_brown"));
		registerBlock(mystic_block_green = new BlockMysticStone("dyeable/stone/mystic_block_green"));
		registerBlock(mystic_block_red = new BlockMysticStone("dyeable/stone/mystic_block_red"));
		registerBlock(mystic_block_black = new BlockMysticStone("dyeable/stone/mystic_block_black"));
		
		registerBlock(wood_mystic_block_normal = new BlockMysticWood("dyeable/wood/wood_mystic_block_normal"));
		registerBlock(wood_mystic_block_glass = new BlockMysticWoodGlass("dyeable/wood/wood_mystic_block_glass"));
		registerBlock(wood_mystic_block_white = new BlockMysticWood("dyeable/wood/wood_mystic_block_white"));
		registerBlock(wood_mystic_block_orange = new BlockMysticWood("dyeable/wood/wood_mystic_block_orange"));
		registerBlock(wood_mystic_block_magenta = new BlockMysticWood("dyeable/wood/wood_mystic_block_magenta"));
		registerBlock(wood_mystic_block_lightblue = new BlockMysticWood("dyeable/wood/wood_mystic_block_lightblue"));
		registerBlock(wood_mystic_block_yellow = new BlockMysticWood("dyeable/wood/wood_mystic_block_yellow"));
		registerBlock(wood_mystic_block_lime = new BlockMysticWood("dyeable/wood/wood_mystic_block_lime"));
		registerBlock(wood_mystic_block_pink = new BlockMysticWood("dyeable/wood/wood_mystic_block_pink"));
		registerBlock(wood_mystic_block_gray = new BlockMysticWood("dyeable/wood/wood_mystic_block_gray"));
		registerBlock(wood_mystic_block_lightgray = new BlockMysticWood("dyeable/wood/wood_mystic_block_lightgray"));
		registerBlock(wood_mystic_block_cyan = new BlockMysticWood("dyeable/wood/wood_mystic_block_cyan"));
		registerBlock(wood_mystic_block_purple = new BlockMysticWood("dyeable/wood/wood_mystic_block_purple"));
		registerBlock(wood_mystic_block_blue = new BlockMysticWood("dyeable/wood/wood_mystic_block_blue"));
		registerBlock(wood_mystic_block_brown = new BlockMysticWood("dyeable/wood/wood_mystic_block_brown"));
		registerBlock(wood_mystic_block_green = new BlockMysticWood("dyeable/wood/wood_mystic_block_green"));
		registerBlock(wood_mystic_block_red = new BlockMysticWood("dyeable/wood/wood_mystic_block_red"));
		registerBlock(wood_mystic_block_black = new BlockMysticWood("dyeable/wood/wood_mystic_block_black"));
		
		
		
		
		registerBlock(paper_block = new BlockPaper(false).setResistance(4.0F));
		registerBlock(leather_block = new BlockLeather().setResistance(4.0F));
		registerBlock(reed_block = new BlockReed().setResistance(4.0F));
		
		
		
		//mystic_furnace = new TestBlockFurnaceEA(false).setUnlocalizedName("machine/mystic_furnace").setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		//lit_mystic_furnace = new TestBlockFurnaceEA(true).setUnlocalizedName("machine/lit_mystic_furnace").setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		//color_atrium = new BlockColorAtrium(false).setUnlocalizedName("machine/color_atrium");
		//lit_color_atrium = new BlockColorAtrium(true).setUnlocalizedName("machine/lit_color_atrium");
		//test_liquid = new TestBlockStaticLiquidEA(Material.water);
		//flowing_test_liquid = new TestBlockDynamicLiquidEA(Material.water);
		//purified_mystic_block = new GeneralModBlocks(Material.rock).setUnlocalizedName("purified_mystic_block").setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
		//tutorialTileEntity = new BlockTutorialTileEntity().setHardness(1.0F).setResistance(4.0F);
		//GameRegistry.registerBlock(tutorialTileEntity = new BlockTutorialTileEntity(), "tutorial_tile_entity");
		//GameRegistry.registerBlock(double_draconium_slab, ItemBlockSlabDraconium.class, "slab/draconium/double_draconium_slab", draconium_slab, double_draconium_slab, true);
		//testSlabs = new BlockColoredSlab.ColouredSlabGroup("testSlabs", Material.rock);
		//registerSlabGroup(testSlabs.low);
		//registerSlabGroup(testSlabs.high);
		
		//stainedClaySlabs = new BlockColouredSlab.ColouredSlabGroup("stainedClaySlab", Material.rock);
		//registerSlabGroup(stainedClaySlabs.low);
		//registerSlabGroup(stainedClaySlabs.high);
		
		//double_test_slab = registerBlockx(new BlockDoubleSlabTest("dtestslab").setResistance(4.0F));
		//test_slab = registerBlockx(new BlockHalfSlabTest("htestslab").setResistance(4.0F));
		
		//registerBlock(204, "purpur_double_slab", (new BlockPurpurSlab.Double()).setHardness(2.0F).setResistance(10.0F).setStepSound(SoundType.STONE).setUnlocalizedName("purpurSlab"));
        //registerBlock(205, "purpur_slab", (new BlockPurpurSlab.Half()).setHardness(2.0F).setResistance(10.0F).setStepSound(SoundType.STONE).setUnlocalizedName("purpurSlab"));
        
		registerBlock(hellion_fruit = new HellionFruitCrop());
		registerBlock(sacred_fruit = new SacredFruitCrop());
		registerBlock(dragon_fruit = new DragonFruitCrop());
		
	}
	/**
	protected static <V extends Block> V registerBlock(V block)
	{
		return registerBlock(block, ItemBlock::new);
	}
	*/
	/**
	 * Register a Block with a custom ItemBlock class.
	 *
	 * @param <BLOCK>     The Block type
	 * @param block       The Block instance
	 * @param itemFactory A function that creates the ItemBlock instance, or null if no ItemBlock should be created
	 * @return The Block instance
	 */
	//protected static <BLOCK extends Block> BLOCK registerBlock(BLOCK block, @Nullable Function<BLOCK, ItemBlock> itemFactory) {
	//	GameRegistry.registerBlock(block, block.getUnlocalizedName());

	//	if (itemFactory != null) {
	//		final ItemBlock itemBlock = itemFactory.apply(block);

			//GameRegistry.registerBlock(itemBlock.setRegistryName(block.getRegistryName()));
	//	}

	//	blocks.add(block);
	//	return block;
	//}
	
	public static void registerBlock(Block block)
	{
		GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(5));
		
	}
	/**
	//public static void register()
	//{
		//GameRegistry.registerBlock(item, item.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(double_draconium_slab, ItemBlockSlabDraconium.class, "slab/draconium/double_draconium_slab", draconium_slab, double_draconium_slab, true);
		GameRegistry.registerBlock(double_velious_slab, ItemBlockSlabVelious.class, "slab/velious/double_velious_slab", velious_slab, double_velious_slab, true);
		GameRegistry.registerBlock(double_arcanite_slab, ItemBlockSlabArcanite.class, "slab/arcanite/double_arcanite_slab", arcanite_slab, double_arcanite_slab, true);
		GameRegistry.registerBlock(double_katcheen_slab, ItemBlockSlabKatcheen.class, "slab/katcheen/double_katcheen_slab", katcheen_slab, double_katcheen_slab, true);
		GameRegistry.registerBlock(double_necrocite_slab, ItemBlockSlabNecrocite.class, "slab/necrocite/double_necrocite_slab", necrocite_slab, double_necrocite_slab, true);
		GameRegistry.registerBlock(double_soularite_slab, ItemBlockSlabSoularite.class, "slab/soularite/double_soularite_slab", soularite_slab, double_soularite_slab, true);
		GameRegistry.registerBlock(double_ebonheart_slab, ItemBlockSlabEbonheart.class, "slab/ebonheart/double_ebonheart_slab", ebonheart_slab, double_ebonheart_slab, true);
		GameRegistry.registerBlock(double_obsidian_slab, ItemBlockSlabObsidian.class, "slab/obsidian/double_obsidian_slab", obsidian_slab, double_obsidian_slab, true);
		GameRegistry.registerBlock(double_glowstone_slab, ItemBlockSlabGlowstone.class, "slab/glowstone/double_glowstone_slab", glowstone_slab, double_glowstone_slab, true);
		
		GameRegistry.registerBlock(draconium_slab, ItemBlockSlabDraconium.class, "slab/draconium/draconium_slab", draconium_slab, double_draconium_slab, false);
		GameRegistry.registerBlock(velious_slab, ItemBlockSlabVelious.class, "slab/velious/velious_slab", velious_slab, double_velious_slab, false);
		GameRegistry.registerBlock(arcanite_slab, ItemBlockSlabArcanite.class, "slab/arcanite/arcanite_slab", arcanite_slab, double_arcanite_slab, false);
		GameRegistry.registerBlock(katcheen_slab, ItemBlockSlabKatcheen.class, "slab/katcheen/katcheen_slab", katcheen_slab, double_katcheen_slab, false);
		GameRegistry.registerBlock(necrocite_slab, ItemBlockSlabNecrocite.class, "slab/necrocite/necrocite_slab", necrocite_slab, double_necrocite_slab, false);
		GameRegistry.registerBlock(soularite_slab, ItemBlockSlabSoularite.class, "slab/soularite/soularite_slab", soularite_slab, double_soularite_slab, false);
		GameRegistry.registerBlock(ebonheart_slab, ItemBlockSlabEbonheart.class, "slab/ebonheart/ebonheart_slab", ebonheart_slab, double_ebonheart_slab, false);
		GameRegistry.registerBlock(obsidian_slab, ItemBlockSlabObsidian.class, "slab/obsidian/obsidian_slab", obsidian_slab, double_obsidian_slab, false);
		GameRegistry.registerBlock(glowstone_slab, ItemBlockSlabGlowstone.class, "slab/glowstone/glowstone_slab", glowstone_slab, double_glowstone_slab, false);
		
	}
	*/
}
