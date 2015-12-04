package com.ebonheart.EbonArtsMod.tileentity;

import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ebonheart.EbonArtsMod.zzzzztesttemp.tileentity.ModTileEntity;

public final class TestTileEntities {
	
	public static void init() {
		
		GameRegistry.registerTileEntity(TestTileEntity.class, "tutorial_tile_entity");
		
	}

}
