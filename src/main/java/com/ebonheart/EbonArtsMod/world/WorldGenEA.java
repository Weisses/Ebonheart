package com.ebonheart.EbonArtsMod.world;

import java.util.Random;

import com.ebonheart.EbonArtsMod.init.InitBlocksEA;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenEA implements IWorldGenerator
{
	
	private WorldGenerator gen_arcanite_ore; //Generates Arcanite Ore (used in Overworld)

	public WorldGenEA() {
	    this.gen_arcanite_ore = new WorldGenMinable(InitBlocksEA.arcanite_ore.getDefaultState(), 8);
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) 
	{
		switch (world.provider.getDimensionId()) {
		//Overworld
		case 0: 
			
	        break;
	    //Nether
		case -1: 
			
	        break;
	    //End
		case 1: 
			
	        break;
	    }
		

		
		
	}

	
	
}
