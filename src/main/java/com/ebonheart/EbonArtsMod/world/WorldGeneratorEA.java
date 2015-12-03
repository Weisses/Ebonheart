package com.ebonheart.EbonArtsMod.world;

import java.util.Random;

import com.ebonheart.EbonArtsMod.init.InitBlocksEA;

import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class WorldGeneratorEA implements IWorldGenerator
{
	
	private WorldGenerator gen_arcanite_ore; //Generates Arcanite Ore (used in Overworld)

	//private WorldGenerator gen_multi_ore; //Generates Multi Ore (used in Overworld)
	
	//create a new instance of a WorldGenMinable which can generate a bunch of tutorial ores (up to 8 in one call)
	public WorldGeneratorEA() 
	{
	    
		this.gen_arcanite_ore = new WorldGenMinable(InitBlocksEA.arcanite_ore.getDefaultState(), 8, BlockHelper.forBlock(Blocks.stone));
	
		//for single ore gens
		//this.gen_multi_ore = new WorldGenSingleMinable(InitBlocksEA.arcanite_ore.getDefaultState());
	}
	
	
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch (world.provider.getDimensionId()) 
		{
		//Overworld
		case 0: 
			this.runGenerator(this.gen_arcanite_ore, world, random, chunkX, chunkZ, 20, 0, 64);
	        
			//for single ore gen
			//this.runGenerator(this.gen_multi_ore, world, random, chunkX, chunkZ, 10, 0, 16);
			break;
	        
	    //Nether
		case -1: 
			
	        break;
	        
	    //End
		case 1: 
			
	        break;
	    }
	}

	
	
	//standard method for running world generators at a random position within a chunk
	private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) 
	{
	    if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
	    {
	        throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");
	    }
	    
	    int heightDiff = maxHeight - minHeight + 1;
	    for (int i = 0; i < chancesToSpawn; i ++) 
	    {
	        int x = chunk_X * 16 + rand.nextInt(16);
	        int y = minHeight + rand.nextInt(heightDiff);
	        int z = chunk_Z * 16 + rand.nextInt(16);
	        generator.generate(world, rand, new BlockPos(x, y, z));
	    }
	}
}
	