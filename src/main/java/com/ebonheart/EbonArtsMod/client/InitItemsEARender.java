package com.ebonheart.EbonArtsMod.client;

import com.ebonheart.EbonArtsMod.references.ItemsEA;
import com.ebonheart.EbonArtsMod.references.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class InitItemsEARender extends ItemsEA {

	public static void registerRenders()
	{
		registerRender(ebon_tome);
		
		registerRender(draconium_dust);
		registerRender(velious);
		registerRender(arcanite);
		registerRender(katcheen);
		registerRender(necrocite);
		registerRender(soularite);
		registerRender(ebonheart);
		
		
		//registerRender(innate_arcanite);
		
		
		//registerRender(arcanite_shard);
		
		registerRender(shimmering_disc);
		
		
		
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
		
		registerRender(empowered_sword);
		registerRender(frostbite);
		registerRender(massacre);
		registerRender(blazefury);
		registerRender(despair);
		registerRender(souleater);
		
		
		registerRender(obsidian_shards);
		registerRender(glowstone_shards);
		
		//registerRender(test_liquid_bucket);
		
		//registerRender(mystic_dust);
		//registerRender(purified_mystic_dust);
		//registerRender(ebon_sigil);
		registerRender(tier_1_catalyst);
		registerRender(tier_2_catalyst);
		registerRender(tier_3_catalyst);
		registerRender(tier_4_catalyst);
		
		registerRender(banana);
		registerRender(dragon_fruit);
		
		
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
