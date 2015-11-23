package com.ebonheart.ebonarts.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ebonheart.ebonarts.EbonArtsMod;
import com.ebonheart.ebonarts.Reference;
import com.ebonheart.ebonarts.items.ItemCoordinateCache;
import com.ebonheart.ebonarts.items.ItemEbonSigil;

public class EbonArtsItems {

	public static Item mystic_dust;
	public static Item ebon_sigil;
	public static Item coordinate_cache;

	public static void init() {

		mystic_dust = new Item().setUnlocalizedName("mystic_dust").setCreativeTab(EbonArtsMod.tabEbonArts);
		ebon_sigil = new ItemEbonSigil().setUnlocalizedName("ebon_sigil").setCreativeTab(EbonArtsMod.tabEbonArts);
		coordinate_cache = new ItemCoordinateCache().setUnlocalizedName("coordinate_cache").setCreativeTab(EbonArtsMod.tabEbonArts);

	}

	public static void register() {
		GameRegistry.registerItem(mystic_dust, mystic_dust.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ebon_sigil, ebon_sigil.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(coordinate_cache, coordinate_cache.getUnlocalizedName().substring(5));

	}

	public static void registerRenders() {
		registerRender(mystic_dust);
		registerRender(ebon_sigil);
		registerRender(coordinate_cache);

	}

	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,	new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));

	}

}
