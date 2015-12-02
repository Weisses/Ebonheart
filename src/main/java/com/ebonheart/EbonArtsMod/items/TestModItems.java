package com.ebonheart.EbonArtsMod.items;

import com.ebonheart.EbonArtsMod.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class TestModItems {
	
	public static Item item_arcanite;
	
	public static void createItems()
	{
		item_arcanite = new ItemArcanite().setUnlocalizedName("gem/item_arcanite").setCreativeTab(EbonArtsMod.tabEbonArtsItems);
		//GameRegistry.registerItem(item_arcanite = new ItemArcanite("item_arcanite"), "gem/item_arcanite");
		
	}

	public static void registerRenders()
	{
		
		registerRender(item_arcanite);
		//registerRender(arcanite_shard);
		//registerRender(innate_arcanite);
		
		//registerRender(arcanite_pickaxe);
		//registerRender(arcanite_axe);
		//registerRender(arcanite_shovel);
		//registerRender(arcanite_hoe);
		//registerRender(arcanite_sword);
		
		//registerRender(arcanite_helmet);
		//registerRender(arcanite_chestplate);
		//registerRender(arcanite_leggings);
		//registerRender(arcanite_boots);
		
		
		//registerRender(mystic_dust);
		//registerRender(purified_mystic_dust);
		//registerRender(ebon_sigil);
		//registerRender(tier_1_catalyst);
		//registerRender(tier_2_catalyst);
		//registerRender(tier_3_catalyst);
		//registerRender(tier_4_catalyst);
		
		//registerRender(banana);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
