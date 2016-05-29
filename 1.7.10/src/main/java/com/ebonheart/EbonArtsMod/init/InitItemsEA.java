package com.ebonheart.EbonArtsMod.init;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

import com.ebonheart.EbonArtsMod.api.ItemsEA;
import com.ebonheart.EbonArtsMod.common.items.armor.ItemBurnishedArmor;
import com.ebonheart.EbonArtsMod.common.items.armor.ItemCelestialArmor;
import com.ebonheart.EbonArtsMod.common.items.armor.ItemScalemailArmor;
import com.ebonheart.EbonArtsMod.common.items.armor.ItemVengeanceArmor;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemArcanite;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemDraconiumDust;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemDragonFruit;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemEbonheart;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemEmpoweredBlade;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemEnchantedEbonheart;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemGlowstoneShard;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemHellionFruit;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemKatcheen;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemMirroringDisc;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemMusicDiscEA;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemNecrocite;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemObsidianShard;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemSacredFruit;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemSoularite;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemVelious;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemArcaniteAxe;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemArcaniteHoe;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemArcanitePickaxe;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemArcaniteShovel;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemArcaniteSword;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemBlazefury;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemConsecration;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemDeception;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemDespair;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemFrostbite;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemKatcheenAxe;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemKatcheenHoe;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemKatcheenPickaxe;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemKatcheenShovel;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemKatcheenSword;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemMassacre;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemNecrosis;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemSouleater;

import cpw.mods.fml.common.registry.GameRegistry;

//@SuppressWarnings("WeakerAccess")
public class InitItemsEA extends ItemsEA {
	
	//public static final Set<Item> items = new HashSet<Item>();
	
	public static final Item.ToolMaterial arcaniteToolMaterial = EnumHelper.addToolMaterial("arcaniteToolMaterial", 2, 315, 6.5F, 2.5F, 15);
	public static final Item.ToolMaterial katcheenToolMaterial = EnumHelper.addToolMaterial("katcheenToolMaterial", 3, 1400, 8.5F, 4.0F, 20);
	public static final Item.ToolMaterial legendaryWeaponMaterial = EnumHelper.addToolMaterial("legendaryWeaponMaterial", 3, 1661, 9.5F, 6.0F, 30);
	public static final Item.ToolMaterial legendaryToolMaterial = EnumHelper.addToolMaterial("legendaryToolMaterial", 4, 1500, 9.5F, 2.5F, 30);
	
	
	public static void preInit()
	{
		
		register(draconium_dust = new ItemDraconiumDust());
		register(velious = new ItemVelious());
		register(arcanite = new ItemArcanite());
		register(katcheen = new ItemKatcheen());
		register(necrocite = new ItemNecrocite());
		register(soularite = new ItemSoularite());
		register(ebonheart = new ItemEbonheart());
		register(obsidian_shards = new ItemObsidianShard());
		register(glowstone_shards = new ItemGlowstoneShard());
			
		register(glowing_disc = new ItemMusicDiscEA("discs/glowing_disc"));
		/**shimmering_disc = new ItemMusicDiscEA("disc/shimmering_disc", "records.shimmering_disc"));
		laminate_disc = new ItemMusicDiscEA("disc/laminate_disc", "records.laminate_disc"));
		resilient_disc = new ItemMusicDiscEA("disc/resilient_disc", "records.resilient_disc"));
		dismal_disc = new ItemMusicDiscEA("disc/dismal_disc", "records.dismal_disc"));
		ethereal_disc = new ItemMusicDiscEA("disc/ethereal_disc", "records.ethereal_disc"));
		mirroring_disc = new ItemMirroringDisc("disc/mirroring_disc", "records.mirroring_disc"));
		
		empowered_blade = new ItemEmpoweredBlade());
		*/
		register(enchanted_ebonheart = new ItemEnchantedEbonheart());
		/**
		arcanite_pickaxe = new ItemArcanitePickaxe(arcaniteToolMaterial));
		arcanite_axe = new ItemArcaniteAxe(ToolMaterial.IRON));
		arcanite_shovel = new ItemArcaniteShovel(arcaniteToolMaterial));
		arcanite_hoe = new ItemArcaniteHoe(arcaniteToolMaterial));
		arcanite_sword = new ItemArcaniteSword(arcaniteToolMaterial));
		*/
		register(burnished_helmet = new ItemBurnishedArmor("armor/burnished_helmet", 0, 0));
		register(burnished_chestplate = new ItemBurnishedArmor("armor/burnished_chestplate", 0, 1));
		register(burnished_leggings = new ItemBurnishedArmor("armor/burnished_leggings", 0, 2));
		register(burnished_boots = new ItemBurnishedArmor("armor/burnished_boots", 0, 3));
		/**
		katcheen_pickaxe = new ItemKatcheenPickaxe(katcheenToolMaterial));
		katcheen_axe = new ItemKatcheenAxe(katcheenToolMaterial));
		katcheen_shovel = new ItemKatcheenShovel(katcheenToolMaterial));
		katcheen_hoe = new ItemKatcheenHoe(katcheenToolMaterial));
		katcheen_sword = new ItemKatcheenSword(katcheenToolMaterial));
		*/
		register(scalemail_helmet = new ItemScalemailArmor("armor/scalemail_helmet", 0, 0));
		register(scalemail_chestplate = new ItemScalemailArmor("armor/scalemail_chestplate", 0, 1));
		register(scalemail_leggings = new ItemScalemailArmor("armor/scalemail_leggings", 0, 2));
		register(scalemail_boots = new ItemScalemailArmor("armor/scalemail_boots", 0, 3));
		
		register(hellion_fruit = new ItemHellionFruit(6, 0.6F));
		register(sacred_fruit = new ItemSacredFruit(3, 0.8F));
		register(dragon_fruit = new ItemDragonFruit(6, 0.8F, InitBlocksEA.dragon_fruit));
				//, InitBlocksEA.dragon_fruit//, Blocks.farmland
				//));
						
		
		register(vengeance_helmet = new ItemVengeanceArmor("armor/vengeance_helmet", 0, 0));
		register(vengeance_chestplate = new ItemVengeanceArmor("armor/vengeance_chestplate", 0, 1));
		register(vengeance_leggings = new ItemVengeanceArmor("armor/vengeance_leggings", 0, 2));
		register(vengeance_boots = new ItemVengeanceArmor("armor/vengeance_boots", 0, 3));
		
		register(celestial_helmet = new ItemCelestialArmor("armor/celestial_helmet", 0, 0));
		register(celestial_chestplate = new ItemCelestialArmor("armor/celestial_chestplate", 0, 1));
		register(celestial_leggings = new ItemCelestialArmor("armor/celestial_leggings", 0, 2));
		register(celestial_boots = new ItemCelestialArmor("armor/celestial_boots", 0, 3));
		/**
		//void_helmet = new ItemVoidArmor("armor/void_helmet", 0, EntityEquipmentSlot.HEAD));
		//void_chestplate = new ItemVoidArmor("armor/void_chestplate", 0, EntityEquipmentSlot.CHEST));
		//void_leggings = new ItemVoidArmor("armor/void_leggings", 0, EntityEquipmentSlot.LEGS));
		//void_boots = new ItemVoidArmor("armor/void_boots", 0, EntityEquipmentSlot.FEET));
		
		//infernal_helmet = new ItemInfernalArmor("armor/infernal_helmet", 0, EntityEquipmentSlot.HEAD));
		//infernal_chestplate = new ItemInfernalArmor("armor/infernal_chestplate", 0, EntityEquipmentSlot.CHEST));
		//infernal_leggings = new ItemInfernalArmor("armor/infernal_leggings", 0, EntityEquipmentSlot.LEGS));
		//infernal_boots = new ItemInfernalArmor("armor/infernal_boots", 0, EntityEquipmentSlot.FEET));
		
		
		
		deception = new ItemDeception(legendaryWeaponMaterial));
		frostbite = new ItemFrostbite(legendaryWeaponMaterial));
		massacre = new ItemMassacre(legendaryWeaponMaterial));
		blazefury = new ItemBlazefury(legendaryWeaponMaterial));
		despair = new ItemDespair(legendaryWeaponMaterial));
		souleater = new ItemSouleater(legendaryWeaponMaterial));
		
		//test_shield = new ItemTestShield());
		//omniplex = new Omniplex().setUnlocalizedName("omniplex");
		//banana = (ItemFood) new ItemFood(3, 0.3F, false).setUnlocalizedName("banana");
		
		consecration = new ItemConsecration(0, legendaryToolMaterial, null));
		necrosis = new ItemNecrosis(0, legendaryToolMaterial, null));
		
	}
	
	private static <V extends Item> V registerItem(V item) 
	{
		GameRegistry.registerItem(item, item.getUnlocalizedName());
		items.add(item);

		return item;
		*/
		
		//GameRegistry.registerItem(draconium_dust, "gem/draconium_dust");
	}
	
	public static void register(Item item)
	{
		
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(draconium_dust, "gem/draconium_dust");
	}
}
