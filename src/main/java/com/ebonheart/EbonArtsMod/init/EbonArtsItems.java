package com.ebonheart.EbonArtsMod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.Reference;

public class EbonArtsItems {

	public static Item mystic_dust;
	public static Item ebon_sigil;
	
	public static Item ebon_pickaxe;
	public static Item ebon_axe;
	public static Item ebon_shovel;
	public static Item ebon_hoe;
	public static Item ebon_sword;
	
	public static Item ebon_helmet;
	public static Item ebon_chestplate;
	public static Item ebon_leggings;
	public static Item ebon_boots;
	
	public static Item mans_steak;
	
	
	
	public static void init()
	{
		mystic_dust = new Item().setUnlocalizedName("mystic_dust").setCreativeTab(EbonArtsMod.tabEbonArts);
		ebon_sigil = new Item().setUnlocalizedName("ebon_sigil").setCreativeTab(EbonArtsMod.tabEbonArts);
	}
	
	public static void register()
	{
		GameRegistry.registerItem(mystic_dust, mystic_dust.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ebon_sigil, ebon_sigil.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		registerRender(mystic_dust);
		registerRender(ebon_sigil);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
	
}
