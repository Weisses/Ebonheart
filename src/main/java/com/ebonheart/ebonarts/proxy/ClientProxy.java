package com.ebonheart.ebonarts.proxy;

import com.ebonheart.ebonarts.init.EbonArtsBlocks;
import com.ebonheart.ebonarts.init.EbonArtsItems;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerRenders() {
		EbonArtsBlocks.registerRenders();
		EbonArtsItems.registerRenders();
	}
}
