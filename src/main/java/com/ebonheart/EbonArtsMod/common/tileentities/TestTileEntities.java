package com.ebonheart.EbonArtsMod.common.tileentities;

import net.minecraftforge.fml.common.registry.GameRegistry;



public final class TestTileEntities {
	
	public static void init() {
		
		GameRegistry.registerTileEntity(TestTileEntity.class, "tutorial_tile_entity");
		
	}

}
