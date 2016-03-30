package com.ebonheart.EbonArtsMod.client;

import com.ebonheart.EbonArtsMod.references.ItemsEA;
import com.ebonheart.EbonArtsMod.references.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
//import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public final class InitItemsEARender extends ItemsEA {

	public static void registerRenders()
	{
		
		registerRender(draconium_dust);
		registerRender(velious);
		registerRender(arcanite);
		registerRender(katcheen);
		registerRender(necrocite);
		registerRender(soularite);
		registerRender(ebonheart);
		
		registerRender(enchanted_ebonheart);
		
		registerRender(empowered_blade);
		
		registerRender(glowing_disc);
		//registerRender(shimmering_disc);
		//registerRender(laminate_disc);
		//registerRender(resilient_disc);
		//registerRender(dismal_disc);
		//registerRender(ethereal_disc);
		
		//registerRender(chrono_disc);
		
		//registerRender(mirroring_disc);
		
		registerRender(arcanite_pickaxe);
		registerRender(arcanite_axe);
		registerRender(arcanite_shovel);
		registerRender(arcanite_hoe);
		registerRender(arcanite_sword);
		registerRender(arcanite_helmet);
		registerRender(arcanite_chestplate);
		registerRender(arcanite_leggings);
		registerRender(arcanite_boots);
		
		registerRender(katcheen_pickaxe);
		registerRender(katcheen_axe);
		registerRender(katcheen_shovel);
		registerRender(katcheen_hoe);
		registerRender(katcheen_sword);
		registerRender(katcheen_helmet);
		registerRender(katcheen_chestplate);
		registerRender(katcheen_leggings);
		registerRender(katcheen_boots);
		
		
		registerRender(deception);
		registerRender(frostbite);
		registerRender(massacre);
		registerRender(blazefury);
		registerRender(despair);
		registerRender(souleater);
		
		//registerRender(test_shield);
		
		registerRender(obsidian_shards);
		registerRender(glowstone_shards);
		
		//registerRender(omniplex);
		//registerRender(banana);
		registerRender(dragon_fruit);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new 
				//ModelResourceLocation
				//net.minecraft.client.renderer.block.model.
				ModelResourceLocation
				(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
