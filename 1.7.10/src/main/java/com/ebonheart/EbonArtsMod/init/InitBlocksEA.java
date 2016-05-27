package com.ebonheart.EbonArtsMod.init;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

import com.ebonheart.EbonArtsMod.api.BlocksEA;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EABlockFence;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EABlockFenceGate;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EABlockLadder;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EABlockPillar;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EABlockStairs;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EABlockTrapDoor;
import com.ebonheart.EbonArtsMod.common.blocks.basic.EABlockWall;
import com.ebonheart.EbonArtsMod.common.blocks.basic.blocks.BlockArcanite;
import com.ebonheart.EbonArtsMod.common.blocks.basic.blocks.BlockDraconium;
import com.ebonheart.EbonArtsMod.common.blocks.basic.blocks.BlockEbonheart;
import com.ebonheart.EbonArtsMod.common.blocks.basic.blocks.BlockGlowstone;
import com.ebonheart.EbonArtsMod.common.blocks.basic.blocks.BlockKatcheen;
import com.ebonheart.EbonArtsMod.common.blocks.basic.blocks.BlockNecrocite;
import com.ebonheart.EbonArtsMod.common.blocks.basic.blocks.BlockObsidian;
import com.ebonheart.EbonArtsMod.common.blocks.basic.blocks.BlockSoularite;
import com.ebonheart.EbonArtsMod.common.blocks.basic.blocks.BlockVelious;
import com.ebonheart.EbonArtsMod.common.blocks.basic.bricks.BlockBrickArcanite;
import com.ebonheart.EbonArtsMod.common.blocks.basic.bricks.BlockBrickDraconium;
import com.ebonheart.EbonArtsMod.common.blocks.basic.bricks.BlockBrickEbonheart;
import com.ebonheart.EbonArtsMod.common.blocks.basic.bricks.BlockBrickGlowstone;
import com.ebonheart.EbonArtsMod.common.blocks.basic.bricks.BlockBrickKatcheen;
import com.ebonheart.EbonArtsMod.common.blocks.basic.bricks.BlockBrickNecrocite;
import com.ebonheart.EbonArtsMod.common.blocks.basic.bricks.BlockBrickObsidian;
import com.ebonheart.EbonArtsMod.common.blocks.basic.bricks.BlockBrickSoularite;
import com.ebonheart.EbonArtsMod.common.blocks.basic.bricks.BlockBrickVelious;
import com.ebonheart.EbonArtsMod.common.blocks.basic.dyeables.BlockMysticCobblestone;
import com.ebonheart.EbonArtsMod.common.blocks.basic.dyeables.BlockMysticCobblestoneGlass;
import com.ebonheart.EbonArtsMod.common.blocks.basic.dyeables.BlockMysticStone;
import com.ebonheart.EbonArtsMod.common.blocks.basic.dyeables.BlockMysticStoneGlass;
import com.ebonheart.EbonArtsMod.common.blocks.basic.dyeables.BlockMysticWood;
import com.ebonheart.EbonArtsMod.common.blocks.basic.dyeables.BlockMysticWoodGlass;
import com.ebonheart.EbonArtsMod.common.blocks.basic.slabs.BlockDoubleSlabArcanite;
import com.ebonheart.EbonArtsMod.common.blocks.basic.slabs.BlockDoubleSlabDraconium;
import com.ebonheart.EbonArtsMod.common.blocks.basic.slabs.BlockDoubleSlabEbonheart;
import com.ebonheart.EbonArtsMod.common.blocks.basic.slabs.BlockDoubleSlabGlowstone;
import com.ebonheart.EbonArtsMod.common.blocks.basic.slabs.BlockDoubleSlabKatcheen;
import com.ebonheart.EbonArtsMod.common.blocks.basic.slabs.BlockDoubleSlabNecrocite;
import com.ebonheart.EbonArtsMod.common.blocks.basic.slabs.BlockDoubleSlabObsidian;
import com.ebonheart.EbonArtsMod.common.blocks.basic.slabs.BlockDoubleSlabSoularite;
import com.ebonheart.EbonArtsMod.common.blocks.basic.slabs.BlockDoubleSlabVelious;
import com.ebonheart.EbonArtsMod.common.blocks.basic.slabs.BlockHalfSlabArcanite;
import com.ebonheart.EbonArtsMod.common.blocks.basic.slabs.BlockHalfSlabDraconium;
import com.ebonheart.EbonArtsMod.common.blocks.basic.slabs.BlockHalfSlabEbonheart;
import com.ebonheart.EbonArtsMod.common.blocks.basic.slabs.BlockHalfSlabGlowstone;
import com.ebonheart.EbonArtsMod.common.blocks.basic.slabs.BlockHalfSlabKatcheen;
import com.ebonheart.EbonArtsMod.common.blocks.basic.slabs.BlockHalfSlabNecrocite;
import com.ebonheart.EbonArtsMod.common.blocks.basic.slabs.BlockHalfSlabObsidian;
import com.ebonheart.EbonArtsMod.common.blocks.basic.slabs.BlockHalfSlabSoularite;
import com.ebonheart.EbonArtsMod.common.blocks.basic.slabs.BlockHalfSlabVelious;
import com.ebonheart.EbonArtsMod.common.blocks.basic.slabs.ItemBlockSlabArcanite;
import com.ebonheart.EbonArtsMod.common.blocks.basic.slabs.ItemBlockSlabDraconium;
import com.ebonheart.EbonArtsMod.common.blocks.basic.slabs.ItemBlockSlabEbonheart;
import com.ebonheart.EbonArtsMod.common.blocks.basic.slabs.ItemBlockSlabGlowstone;
import com.ebonheart.EbonArtsMod.common.blocks.basic.slabs.ItemBlockSlabKatcheen;
import com.ebonheart.EbonArtsMod.common.blocks.basic.slabs.ItemBlockSlabNecrocite;
import com.ebonheart.EbonArtsMod.common.blocks.basic.slabs.ItemBlockSlabObsidian;
import com.ebonheart.EbonArtsMod.common.blocks.basic.slabs.ItemBlockSlabSoularite;
import com.ebonheart.EbonArtsMod.common.blocks.basic.slabs.ItemBlockSlabVelious;
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
			
		registerBlock(draconium_block = new BlockDraconium().setResistance(4.0F));
		registerBlock(velious_block = new BlockVelious().setResistance(15.0F));
		registerBlock(arcanite_block = new BlockArcanite().setResistance(30.0F));
		registerBlock(katcheen_block = new BlockKatcheen().setResistance(100.0F));
		registerBlock(necrocite_block = new BlockNecrocite().setResistance(45.0F));
		registerBlock(soularite_block = new BlockSoularite().setResistance(45.0F));
		registerBlock(ebonheart_block = new BlockEbonheart().setResistance(2000.0F));
		registerBlock(obsidian_block = new BlockObsidian().setResistance(2000.0F));
		registerBlock(glowstone_block = new BlockGlowstone().setResistance(45.0F).setLightLevel(1.0f));
		/**	
		draconium_block_brick = new BlockBrickDraconium().setResistance(4.0F));
		velious_block_brick = new BlockBrickVelious().setResistance(15.0F));
		arcanite_block_brick = new BlockBrickArcanite().setResistance(30.0F));
		katcheen_block_brick = new BlockBrickKatcheen().setResistance(100.0F));
		necrocite_block_brick = new BlockBrickNecrocite().setResistance(45.0F));
		soularite_block_brick = new BlockBrickSoularite().setResistance(45.0F));
		ebonheart_block_brick = new BlockBrickEbonheart().setResistance(2000.0F));
		obsidian_block_brick = new BlockBrickObsidian().setResistance(2000.0F));
		glowstone_block_brick = new BlockBrickGlowstone().setResistance(45.0F).setLightLevel(1.0f));
		
		
		//testSlabs = new BlockColouredSlab.ColouredSlabGroup("stainedClaySlab", Material.rock);
		
		
		double_draconium_slab = new BlockDoubleSlabDraconium("slab/draconium/double_draconium_slab").setResistance(4.0F);
		double_velious_slab = new BlockDoubleSlabVelious("slab/velious/double_velious_slab").setResistance(15.0F);
		double_arcanite_slab = new BlockDoubleSlabArcanite("slab/arcanite/double_arcanite_slab").setResistance(30.0F);
		double_katcheen_slab = new BlockDoubleSlabKatcheen("slab/katcheen/double_katcheen_slab").setResistance(100.0F);
		double_necrocite_slab = new BlockDoubleSlabNecrocite("slab/necrocite/double_necrocite_slab").setResistance(45.0F);
		double_soularite_slab = new BlockDoubleSlabSoularite("slab/soularite/double_soularite_slab").setResistance(45.0F);
		double_ebonheart_slab = new BlockDoubleSlabEbonheart("slab/ebonheart/double_ebonheart_slab").setResistance(2000.0F);
		double_obsidian_slab = new BlockDoubleSlabObsidian("slab/obsidian/double_obsidian_slab").setResistance(2000.0F);
		double_glowstone_slab = new BlockDoubleSlabGlowstone("slab/glowstone/double_glowstone_slab").setResistance(45.0F).setLightLevel(1.0f);
		
		draconium_slab = new BlockHalfSlabDraconium("slab/draconium/draconium_slab").setResistance(4.0F);
		velious_slab = new BlockHalfSlabVelious("slab/velious/velious_slab").setResistance(15.0F);
		arcanite_slab = new BlockHalfSlabArcanite("slab/arcanite/arcanite_slab").setResistance(30.0F);
		katcheen_slab = new BlockHalfSlabKatcheen("slab/katcheen/katcheen_slab").setResistance(100.0F);
		necrocite_slab = new BlockHalfSlabNecrocite("slab/necrocite/necrocite_slab").setResistance(45.0F);
		soularite_slab = new BlockHalfSlabSoularite("slab/soularite/soularite_slab").setResistance(45.0F);
		ebonheart_slab = new BlockHalfSlabEbonheart("slab/ebonheart/ebonheart_slab").setResistance(2000.0F);
		obsidian_slab = new BlockHalfSlabObsidian("slab/obsidian/obsidian_slab").setResistance(2000.0F);
		glowstone_slab = new BlockHalfSlabGlowstone("slab/glowstone/glowstone_slab").setResistance(45.0F).setLightLevel(1.0f);
		
		draconium_stairs = new EABlockStairs("stairs/draconium_stairs").setResistance(4.0F));
		velious_stairs = new EABlockStairs("stairs/velious_stairs").setResistance(15.0F));
		arcanite_stairs = new EABlockStairs("stairs/arcanite_stairs").setResistance(30.0F));
		katcheen_stairs = new EABlockStairs("stairs/katcheen_stairs").setResistance(100.0F));
		necrocite_stairs = new EABlockStairs("stairs/necrocite_stairs").setResistance(45.0F));
		soularite_stairs = new EABlockStairs("stairs/soularite_stairs").setResistance(45.0F));
		ebonheart_stairs = new EABlockStairs("stairs/ebonheart_stairs").setResistance(2000.0F));
		obsidian_stairs = new EABlockStairs("stairs/obsidian_stairs").setResistance(2000.0F));
		glowstone_stairs = new EABlockStairs("stairs/glowstone_stairs").setResistance(45.0F).setLightLevel(1.0f));
		
		draconium_fence = new EABlockFence("fence/draconium_fence").setResistance(4.0F));
		velious_fence = new EABlockFence("fence/velious_fence").setResistance(15.0F));
		arcanite_fence = new EABlockFence("fence/arcanite_fence").setResistance(30.0F));
		katcheen_fence = new EABlockFence("fence/katcheen_fence").setResistance(100.0F));
		necrocite_fence = new EABlockFence("fence/necrocite_fence").setResistance(45.0F));
		soularite_fence = new EABlockFence("fence/soularite_fence").setResistance(45.0F));
		ebonheart_fence = new EABlockFence("fence/ebonheart_fence").setResistance(2000.0F));
		obsidian_fence = new EABlockFence("fence/obsidian_fence").setResistance(2000.0F));
		glowstone_fence = new EABlockFence("fence/glowstone_fence").setResistance(45.0F).setLightLevel(1.0f));
		
		draconium_fence_gate = new EABlockFenceGate("fence/draconium_fence_gate").setResistance(4.0F));
		velious_fence_gate = new EABlockFenceGate("fence/velious_fence_gate").setResistance(15.0F));
		arcanite_fence_gate = new EABlockFenceGate("fence/arcanite_fence_gate").setResistance(30.0F));
		katcheen_fence_gate = new EABlockFenceGate("fence/katcheen_fence_gate").setResistance(100.0F));
		necrocite_fence_gate = new EABlockFenceGate("fence/necrocite_fence_gate").setResistance(45.0F));
		soularite_fence_gate = new EABlockFenceGate("fence/soularite_fence_gate").setResistance(45.0F));
		ebonheart_fence_gate = new EABlockFenceGate("fence/ebonheart_fence_gate").setResistance(2000.0F));
		obsidian_fence_gate = new EABlockFenceGate("fence/obsidian_fence_gate").setResistance(2000.0F));
		glowstone_fence_gate = new EABlockFenceGate("fence/glowstone_fence_gate").setResistance(45.0F).setLightLevel(1.0f));
		
		draconium_wall = new EABlockWall("wall/draconium_wall").setResistance(4.0F));
		velious_wall = new EABlockWall("wall/velious_wall").setResistance(15.0F));
		arcanite_wall = new EABlockWall("wall/arcanite_wall").setResistance(30.0F));
		katcheen_wall = new EABlockWall("wall/katcheen_wall").setResistance(100.0F));
		necrocite_wall = new EABlockWall("wall/necrocite_wall").setResistance(45.0F));
		soularite_wall = new EABlockWall("wall/soularite_wall").setResistance(45.0F));
		ebonheart_wall = new EABlockWall("wall/ebonheart_wall").setResistance(2000.0F));
		obsidian_wall = new EABlockWall("wall/obsidian_wall").setResistance(2000.0F));
		glowstone_wall = new EABlockWall("wall/glowstone_wall").setResistance(45.0F).setLightLevel(1.0f));
		
		draconium_torch = new EABlockTorchDraconium().setResistance(4.0F));
		velious_torch = new EABlockTorchVelious().setResistance(15.0F));
		arcanite_torch = new EABlockTorchArcanite().setResistance(30.0F));
		katcheen_torch = new EABlockTorchKatcheen().setResistance(100.0F));
		necrocite_torch = new EABlockTorchNecrocite().setResistance(45.0F));
		soularite_torch = new EABlockTorchSoularite().setResistance(45.0F));
		ebonheart_torch = new EABlockTorchEbonheart().setResistance(2000.0F));
		obsidian_torch = new EABlockTorchObsidian().setResistance(2000.0F));
		glowstone_torch = new EABlockTorchGlowstone().setResistance(45.0F));
		
		draconium_trapdoor = new EABlockTrapDoor("door/draconium_trapdoor").setResistance(4.0F));
		velious_trapdoor = new EABlockTrapDoor("door/velious_trapdoor").setResistance(4.0F));
		arcanite_trapdoor = new EABlockTrapDoor("door/arcanite_trapdoor").setResistance(4.0F));
		katcheen_trapdoor = new EABlockTrapDoor("door/katcheen_trapdoor").setResistance(4.0F));
		necrocite_trapdoor = new EABlockTrapDoor("door/necrocite_trapdoor").setResistance(4.0F));
		soularite_trapdoor = new EABlockTrapDoor("door/soularite_trapdoor").setResistance(4.0F));
		ebonheart_trapdoor = new EABlockTrapDoor("door/ebonheart_trapdoor").setResistance(4.0F));
		obsidian_trapdoor = new EABlockTrapDoor("door/obsidian_trapdoor").setResistance(4.0F));
		glowstone_trapdoor = new EABlockTrapDoor("door/glowstone_trapdoor").setResistance(4.0F));
		
		//draconium_door = new EABlockDoor("door/draconium_door").setHardness(5.0F).setResistance(4.0F);
		//velious_door = new EABlockDoor("door/velious_door").setHardness(5.0F).setResistance(15.0F);
		//arcanite_door = new EABlockDoor("door/arcanite_door").setHardness(5.0F).setResistance(30.0F);
		//katcheen_door = new EABlockDoor("door/katcheen_door").setHardness(5.0F).setResistance(2000.0F);
		//necrocite_door = new EABlockDoor("door/necrocite_door").setHardness(5.0F).setResistance(45.0F);
		//soularite_door = new EABlockDoor("door/soularite_door").setHardness(5.0F).setResistance(45.0F);
		
		draconium_ladder = new EABlockLadder("ladder/draconium_ladder"));
		velious_ladder = new EABlockLadder("ladder/velious_ladder"));
		arcanite_ladder = new EABlockLadder("ladder/arcanite_ladder"));
		katcheen_ladder = new EABlockLadder("ladder/katcheen_ladder"));
		necrocite_ladder = new EABlockLadder("ladder/necrocite_ladder"));
		soularite_ladder = new EABlockLadder("ladder/soularite_ladder"));
		ebonheart_ladder = new EABlockLadder("ladder/ebonheart_ladder"));
		obsidian_ladder = new EABlockLadder("ladder/obsidian_ladder"));
		glowstone_ladder = new EABlockLadder("ladder/glowstone_ladder").setLightLevel(1.0f));
		
		draconium_pillar = new EABlockPillar("pillar/draconium_pillar").setResistance(4.0F));
		velious_pillar = new EABlockPillar("pillar/velious_pillar").setResistance(15.0F));
		arcanite_pillar = new EABlockPillar("pillar/arcanite_pillar").setResistance(30.0F));
		katcheen_pillar = new EABlockPillar("pillar/katcheen_pillar").setResistance(100.0F));
		necrocite_pillar = new EABlockPillar("pillar/necrocite_pillar").setResistance(45.0F));
		soularite_pillar = new EABlockPillar("pillar/soularite_pillar").setResistance(45.0F));
		ebonheart_pillar = new EABlockPillar("pillar/ebonheart_pillar").setResistance(2000.0F));
		obsidian_pillar = new EABlockPillar("pillar/obsidian_pillar").setResistance(2000.0F));
		glowstone_pillar = new EABlockPillar("pillar/glowstone_pillar").setResistance(45.0F).setLightLevel(1.0f));
		
		cobble_mystic_block_normal = new BlockMysticCobblestone("gem/mystic/cobblestone/cobble_mystic_block_normal"));
		cobble_mystic_block_glass = new BlockMysticCobblestoneGlass("gem/mystic/cobblestone/cobble_mystic_block_glass"));
		cobble_mystic_block_white = new BlockMysticCobblestone("gem/mystic/cobblestone/cobble_mystic_block_white"));
		cobble_mystic_block_orange = new BlockMysticCobblestone("gem/mystic/cobblestone/cobble_mystic_block_orange"));
		cobble_mystic_block_magenta = new BlockMysticCobblestone("gem/mystic/cobblestone/cobble_mystic_block_magenta"));
		cobble_mystic_block_lightblue = new BlockMysticCobblestone("gem/mystic/cobblestone/cobble_mystic_block_lightblue"));
		cobble_mystic_block_yellow = new BlockMysticCobblestone("gem/mystic/cobblestone/cobble_mystic_block_yellow"));
		cobble_mystic_block_lime = new BlockMysticCobblestone("gem/mystic/cobblestone/cobble_mystic_block_lime"));
		cobble_mystic_block_pink = new BlockMysticCobblestone("gem/mystic/cobblestone/cobble_mystic_block_pink"));
		cobble_mystic_block_gray = new BlockMysticCobblestone("gem/mystic/cobblestone/cobble_mystic_block_gray"));
		cobble_mystic_block_lightgray = new BlockMysticCobblestone("gem/mystic/cobblestone/cobble_mystic_block_lightgray"));
		cobble_mystic_block_cyan = new BlockMysticCobblestone("gem/mystic/cobblestone/cobble_mystic_block_cyan"));
		cobble_mystic_block_purple = new BlockMysticCobblestone("gem/mystic/cobblestone/cobble_mystic_block_purple"));
		cobble_mystic_block_blue = new BlockMysticCobblestone("gem/mystic/cobblestone/cobble_mystic_block_blue"));
		cobble_mystic_block_brown = new BlockMysticCobblestone("gem/mystic/cobblestone/cobble_mystic_block_brown"));
		cobble_mystic_block_green = new BlockMysticCobblestone("gem/mystic/cobblestone/cobble_mystic_block_green"));
		cobble_mystic_block_red = new BlockMysticCobblestone("gem/mystic/cobblestone/cobble_mystic_block_red"));
		cobble_mystic_block_black = new BlockMysticCobblestone("gem/mystic/cobblestone/cobble_mystic_block_black"));
		
		mystic_block_normal = new BlockMysticStone("gem/mystic/stone/mystic_block_normal"));
		mystic_block_glass = new BlockMysticStoneGlass("gem/mystic/stone/mystic_block_glass"));
		mystic_block_white = new BlockMysticStone("gem/mystic/stone/mystic_block_white"));
		mystic_block_orange = new BlockMysticStone("gem/mystic/stone/mystic_block_orange"));
		mystic_block_magenta = new BlockMysticStone("gem/mystic/stone/mystic_block_magenta"));
		mystic_block_lightblue = new BlockMysticStone("gem/mystic/stone/mystic_block_lightblue"));
		mystic_block_yellow = new BlockMysticStone("gem/mystic/stone/mystic_block_yellow"));
		mystic_block_lime = new BlockMysticStone("gem/mystic/stone/mystic_block_lime"));
		mystic_block_pink = new BlockMysticStone("gem/mystic/stone/mystic_block_pink"));
		mystic_block_gray = new BlockMysticStone("gem/mystic/stone/mystic_block_gray"));
		mystic_block_lightgray = new BlockMysticStone("gem/mystic/stone/mystic_block_lightgray"));
		mystic_block_cyan = new BlockMysticStone("gem/mystic/stone/mystic_block_cyan"));
		mystic_block_purple = new BlockMysticStone("gem/mystic/stone/mystic_block_purple"));
		mystic_block_blue = new BlockMysticStone("gem/mystic/stone/mystic_block_blue"));
		mystic_block_brown = new BlockMysticStone("gem/mystic/stone/mystic_block_brown"));
		mystic_block_green = new BlockMysticStone("gem/mystic/stone/mystic_block_green"));
		mystic_block_red = new BlockMysticStone("gem/mystic/stone/mystic_block_red"));
		mystic_block_black = new BlockMysticStone("gem/mystic/stone/mystic_block_black"));
		
		wood_mystic_block_normal = new BlockMysticWood("gem/mystic/wood/wood_mystic_block_normal"));
		wood_mystic_block_glass = new BlockMysticWoodGlass("gem/mystic/wood/wood_mystic_block_glass"));
		wood_mystic_block_white = new BlockMysticWood("gem/mystic/wood/wood_mystic_block_white"));
		wood_mystic_block_orange = new BlockMysticWood("gem/mystic/wood/wood_mystic_block_orange"));
		wood_mystic_block_magenta = new BlockMysticWood("gem/mystic/wood/wood_mystic_block_magenta"));
		wood_mystic_block_lightblue = new BlockMysticWood("gem/mystic/wood/wood_mystic_block_lightblue"));
		wood_mystic_block_yellow = new BlockMysticWood("gem/mystic/wood/wood_mystic_block_yellow"));
		wood_mystic_block_lime = new BlockMysticWood("gem/mystic/wood/wood_mystic_block_lime"));
		wood_mystic_block_pink = new BlockMysticWood("gem/mystic/wood/wood_mystic_block_pink"));
		wood_mystic_block_gray = new BlockMysticWood("gem/mystic/wood/wood_mystic_block_gray"));
		wood_mystic_block_lightgray = new BlockMysticWood("gem/mystic/wood/wood_mystic_block_lightgray"));
		wood_mystic_block_cyan = new BlockMysticWood("gem/mystic/wood/wood_mystic_block_cyan"));
		wood_mystic_block_purple = new BlockMysticWood("gem/mystic/wood/wood_mystic_block_purple"));
		wood_mystic_block_blue = new BlockMysticWood("gem/mystic/wood/wood_mystic_block_blue"));
		wood_mystic_block_brown = new BlockMysticWood("gem/mystic/wood/wood_mystic_block_brown"));
		wood_mystic_block_green = new BlockMysticWood("gem/mystic/wood/wood_mystic_block_green"));
		wood_mystic_block_red = new BlockMysticWood("gem/mystic/wood/wood_mystic_block_red"));
		wood_mystic_block_black = new BlockMysticWood("gem/mystic/wood/wood_mystic_block_black"));
		
		paper_block = new BlockPaper().setResistance(4.0F));
		leather_block = new BlockLeather().setResistance(4.0F));
		reed_block = new BlockReed().setResistance(4.0F));
		
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
        
		hellion_fruit = new HellionFruitCrop());
		sacred_fruit = new SacredFruitCrop());
		dragon_fruit = new DragonFruitCrop());
	*/	
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
