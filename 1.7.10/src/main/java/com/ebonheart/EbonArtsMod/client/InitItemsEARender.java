package com.ebonheart.EbonArtsMod.client;

import net.minecraft.client.Minecraft;
//import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.ebonheart.EbonArtsMod.api.ItemsEA;
import com.ebonheart.EbonArtsMod.api.Reference;

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
		
		registerRender(obsidian_shards);
		registerRender(glowstone_shards);
			
		registerRender(enchanted_ebonheart);
		/**	registerRender(empowered_blade);
		
		registerRender(glowing_disc);
		registerRender(shimmering_disc);
		registerRender(laminate_disc);
		registerRender(resilient_disc);
		registerRender(dismal_disc);
		registerRender(ethereal_disc);
		registerRender(mirroring_disc);
		*/
		registerRender(burnished_helmet);
		registerRender(burnished_chestplate);
		registerRender(burnished_leggings);
		registerRender(burnished_boots);
		
		registerRender(scalemail_helmet);
		registerRender(scalemail_chestplate);
		registerRender(scalemail_leggings);
		registerRender(scalemail_boots);
		
		registerRender(vengeance_helmet);
		registerRender(vengeance_chestplate);
		registerRender(vengeance_leggings);
		registerRender(vengeance_boots);
		
		registerRender(celestial_helmet);
		registerRender(celestial_chestplate);
		registerRender(celestial_leggings);
		registerRender(celestial_boots);
		/**
		//registerRender(void_helmet);
		//registerRender(void_chestplate);
		//registerRender(void_leggings);
		//registerRender(void_boots);
		
		//registerRender(infernal_helmet);
		//registerRender(infernal_chestplate);
		//registerRender(infernal_leggings);
		//registerRender(infernal_boots);
		
		registerRender(arcanite_pickaxe);
		registerRender(arcanite_axe);
		registerRender(arcanite_shovel);
		registerRender(arcanite_hoe);
		registerRender(arcanite_sword);
		
		registerRender(katcheen_pickaxe);
		registerRender(katcheen_axe);
		registerRender(katcheen_shovel);
		registerRender(katcheen_hoe);
		registerRender(katcheen_sword);
		
		registerRender(consecration);
		registerRender(necrosis);
		
		registerRender(deception);
		registerRender(frostbite);
		registerRender(massacre);
		registerRender(blazefury);
		registerRender(despair);
		registerRender(souleater);
		
		
		
		
		
		registerRender(hellion_fruit);
		registerRender(sacred_fruit);
		registerRender(dragon_fruit);
		
		//registerRender(test_shield);
		**/
	}
	
	public static void registerRender(Item item)
	{
		//item.setTextureName(Main.MODID + ":tutorialItem");
		item.setTextureName(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5));
		//Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName().toString(), "inventory"));
	}
}

