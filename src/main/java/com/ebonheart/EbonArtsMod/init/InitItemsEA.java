package com.ebonheart.EbonArtsMod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.Reference;
import com.ebonheart.EbonArtsMod.items.ItemArcanite;
import com.ebonheart.EbonArtsMod.items.ItemArcaniteAxe;
import com.ebonheart.EbonArtsMod.items.ItemArcaniteHoe;
import com.ebonheart.EbonArtsMod.items.ItemArcanitePickaxe;
import com.ebonheart.EbonArtsMod.items.ItemArcaniteShard;
import com.ebonheart.EbonArtsMod.items.ItemArcaniteShovel;
import com.ebonheart.EbonArtsMod.items.ItemArcaniteSword;
import com.ebonheart.EbonArtsMod.items.ItemArmorArcanite;
import com.ebonheart.EbonArtsMod.items.ItemInnateArcanite;

public class InitItemsEA 
{

	public static Item item_arcanite;
	public static Item arcanite_shard;
	public static Item innate_arcanite;
	
	public static Item mystic_dust;
	public static Item purified_mystic_dust;
	
	public static Item tier_1_catalyst;
	public static Item tier_2_catalyst;
	public static Item tier_3_catalyst;
	public static Item tier_4_catalyst;
	//public static Item iron_catalyst;
	//public static Item gold_catalyst;
	//public static Item diamond_catalyst;
	//public static Item emerald_catalyst;
	
	public static Item ebon_sigil;
	//public static Item dragons_catalyst;
	
	public static Item arcanite_pickaxe;
	public static Item arcanite_axe;
	public static Item arcanite_shovel;
	public static Item arcanite_hoe;
	public static Item arcanite_sword;
	
	public static Item arcanite_helmet;
	public static Item arcanite_chestplate;
	public static Item arcanite_leggings;
	public static Item arcanite_boots;
	
	public static ItemFood banana;
	
	//public static Item mans_steak;
	
	public static final Item.ToolMaterial arcaniteToolMaterial = EnumHelper.addToolMaterial("arcaniteToolMaterial", 2, 1500, 7.0F, 2.5F, 10);
	public static final Item.ToolMaterial innatearcaniteToolMaterial = EnumHelper.addToolMaterial("innatearcaniteToolMaterial", 3, 1700, 8.5F, 3.5F, 10);
	public static final ItemArmor.ArmorMaterial arcaniteArmorMaterial = EnumHelper.addArmorMaterial("arcaniteArmorMaterial", "ea:arcanite", 1500, new int[]{2, 7, 5, 3}, 10);
	//public static final ItemArmor.ArmorMaterial arcaniteArmorMaterial = EnumHelper.addArmorMaterial(name, textureName, durability, reductionAmounts, enchantability);

	public static void init()
	{
		
		item_arcanite = new ItemArcanite("item_arcanite");
		arcanite_shard = new ItemArcaniteShard("arcanite_shard");
		innate_arcanite = new ItemInnateArcanite("innate_arcanite");
		
		arcanite_pickaxe = new ItemArcanitePickaxe(arcaniteToolMaterial);
		arcanite_axe = new ItemArcaniteAxe(arcaniteToolMaterial);
		arcanite_shovel = new ItemArcaniteShovel(arcaniteToolMaterial);
		arcanite_hoe = new ItemArcaniteHoe(arcaniteToolMaterial);
		arcanite_sword = new ItemArcaniteSword(arcaniteToolMaterial);
		
		arcanite_helmet = new ItemArmorArcanite(arcaniteArmorMaterial, 0, 0).setUnlocalizedName("armor/arcanite_helmet");
		arcanite_chestplate = new ItemArmorArcanite(arcaniteArmorMaterial, 0, 1).setUnlocalizedName("armor/arcanite_chestplate");
		arcanite_leggings = new ItemArmorArcanite(arcaniteArmorMaterial, 0, 2).setUnlocalizedName("armor/arcanite_leggings");
		arcanite_boots = new ItemArmorArcanite(arcaniteArmorMaterial, 0, 3).setUnlocalizedName("armor/arcanite_boots");
		
		
		mystic_dust = new Item().setUnlocalizedName("mystic_dust").setCreativeTab(EbonArtsMod.tabEbonArtsItems);
		purified_mystic_dust = new Item().setUnlocalizedName("purified_mystic_dust").setCreativeTab(EbonArtsMod.tabEbonArtsItems);
		ebon_sigil = new Item().setUnlocalizedName("ebon_sigil").setCreativeTab(EbonArtsMod.tabEbonArtsItems);
		tier_1_catalyst = new Item().setUnlocalizedName("tier_1_catalyst").setCreativeTab(EbonArtsMod.tabEbonArtsItems);
		tier_2_catalyst = new Item().setUnlocalizedName("tier_2_catalyst").setCreativeTab(EbonArtsMod.tabEbonArtsItems);
		tier_3_catalyst = new Item().setUnlocalizedName("tier_3_catalyst").setCreativeTab(EbonArtsMod.tabEbonArtsItems);
		tier_4_catalyst = new Item().setUnlocalizedName("tier_4_catalyst").setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	
	
		banana = (ItemFood) new ItemFood(3, 0.3F, false).setUnlocalizedName("banana").setCreativeTab(EbonArtsMod.tabEbonArtsItems);;
	
	}
	
	public static void register()
	{
		
		GameRegistry.registerItem(item_arcanite, item_arcanite.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(arcanite_shard, arcanite_shard.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(innate_arcanite, innate_arcanite.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(arcanite_pickaxe, arcanite_pickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(arcanite_axe, arcanite_axe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(arcanite_shovel, arcanite_shovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(arcanite_hoe, arcanite_hoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(arcanite_sword, arcanite_sword.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(arcanite_helmet, arcanite_helmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(arcanite_chestplate, arcanite_chestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(arcanite_leggings, arcanite_leggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(arcanite_boots, arcanite_boots.getUnlocalizedName().substring(5));
		
		
		
		
		GameRegistry.registerItem(mystic_dust, mystic_dust.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(purified_mystic_dust, purified_mystic_dust.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ebon_sigil, ebon_sigil.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tier_1_catalyst, tier_1_catalyst.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tier_2_catalyst, tier_2_catalyst.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tier_3_catalyst, tier_3_catalyst.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tier_4_catalyst, tier_4_catalyst.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(banana, banana.getUnlocalizedName().substring(5));
	}
	
	public static void registerRenders()
	{
		
		registerRender(item_arcanite);
		registerRender(arcanite_shard);
		registerRender(innate_arcanite);
		
		registerRender(arcanite_pickaxe);
		registerRender(arcanite_axe);
		registerRender(arcanite_shovel);
		registerRender(arcanite_hoe);
		registerRender(arcanite_sword);
		
		registerRender(arcanite_helmet);
		registerRender(arcanite_chestplate);
		registerRender(arcanite_leggings);
		registerRender(arcanite_boots);
		
		
		registerRender(mystic_dust);
		registerRender(purified_mystic_dust);
		registerRender(ebon_sigil);
		registerRender(tier_1_catalyst);
		registerRender(tier_2_catalyst);
		registerRender(tier_3_catalyst);
		registerRender(tier_4_catalyst);
		
		registerRender(banana);
	}
	
	public static void registerRender(Item item)
	{
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
