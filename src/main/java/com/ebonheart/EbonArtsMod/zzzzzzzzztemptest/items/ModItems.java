package com.bedrockminer.tutorial.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {

	public static Item tutorialItem;
	public static Item metaItem;

	public static void createItems() {
		GameRegistry.registerItem(tutorialItem 	= new BasicItem("tutorial_item"), "tutorial_item");
		GameRegistry.registerItem(metaItem 		= new MetaItem("meta_item"), "meta_item");
	}

}
