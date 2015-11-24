package com.ebonheart.EbonArtsMod.proxy;

import com.ebonheart.EbonArtsMod.init.EbonArtsBlocks;
import com.ebonheart.EbonArtsMod.init.EbonArtsItems;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenders()
	{
		EbonArtsBlocks.registerRenders();
		EbonArtsItems.registerRenders();
		
	}
}
