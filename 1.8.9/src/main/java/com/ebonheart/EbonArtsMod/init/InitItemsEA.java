package com.ebonheart.EbonArtsMod.init;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.api.ItemsEA;
import com.ebonheart.EbonArtsMod.common.items.MaterialHelper;
import com.ebonheart.EbonArtsMod.common.items.armor.ItemBurnishedArmor;
import com.ebonheart.EbonArtsMod.common.items.armor.ItemCelestialArmor;
import com.ebonheart.EbonArtsMod.common.items.armor.ItemScalemailArmor;
import com.ebonheart.EbonArtsMod.common.items.armor.ItemVengeanceArmor;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemArcanite;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemDraconiumDust;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemDragonFruit;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemEbonheart;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemEnchantedEbonheart;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemEmpoweredBlade;
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
import com.ebonheart.EbonArtsMod.common.utils.SoundEventsEA;

//@SuppressWarnings("WeakerAccess")
public class InitItemsEA extends ItemsEA {
	
	//public static final Set<Item> items = new HashSet<Item>();
	
	public static final Item.ToolMaterial arcaniteToolMaterial = EnumHelper.addToolMaterial("arcaniteToolMaterial", 2, 315, 6.5F, 2.5F, 15);
	public static final Item.ToolMaterial katcheenToolMaterial = EnumHelper.addToolMaterial("katcheenToolMaterial", 3, 1400, 8.5F, 4.0F, 20);
	public static final Item.ToolMaterial legendaryWeaponMaterial = EnumHelper.addToolMaterial("legendaryWeaponMaterial", 3, 1661, 9.5F, 6.0F, 30);
	public static final Item.ToolMaterial legendaryToolMaterial = EnumHelper.addToolMaterial("legendaryToolMaterial", 4, 1500, 9.5F, 2.5F, 30);
	
	
	public static void preInit()
	{
		
		registerItem(draconium_dust = new ItemDraconiumDust());
		registerItem(velious = new ItemVelious());
		registerItem(arcanite = new ItemArcanite());
		registerItem(katcheen = new ItemKatcheen());
		registerItem(necrocite = new ItemNecrocite());
		registerItem(soularite = new ItemSoularite());
		registerItem(ebonheart = new ItemEbonheart());
		registerItem(obsidian_shards = new ItemObsidianShard());
		registerItem(glowstone_shards = new ItemGlowstoneShard());
		
		registerItem(glowing_disc = new ItemMusicDiscEA("disc/glowing_disc", "records.glowing_disc"));
		registerItem(shimmering_disc = new ItemMusicDiscEA("disc/shimmering_disc", "records.shimmering_disc"));
		registerItem(laminate_disc = new ItemMusicDiscEA("disc/laminate_disc", "records.laminate_disc"));
		registerItem(resilient_disc = new ItemMusicDiscEA("disc/resilient_disc", "records.resilient_disc"));
		registerItem(dismal_disc = new ItemMusicDiscEA("disc/dismal_disc", "records.dismal_disc"));
		registerItem(ethereal_disc = new ItemMusicDiscEA("disc/ethereal_disc", "records.ethereal_disc"));
		registerItem(mirroring_disc = new ItemMirroringDisc("disc/mirroring_disc", "records.mirroring_disc"));
		
		registerItem(empowered_blade = new ItemEmpoweredBlade());
		
		registerItem(enchanted_ebonheart = new ItemEnchantedEbonheart());
		
		registerItem(arcanite_pickaxe = new ItemArcanitePickaxe(arcaniteToolMaterial));
		registerItem(arcanite_axe = new ItemArcaniteAxe(ToolMaterial.IRON));
		registerItem(arcanite_shovel = new ItemArcaniteShovel(arcaniteToolMaterial));
		registerItem(arcanite_hoe = new ItemArcaniteHoe(arcaniteToolMaterial));
		registerItem(arcanite_sword = new ItemArcaniteSword(arcaniteToolMaterial));
		
		registerItem(burnished_helmet = new ItemBurnishedArmor("armor/burnished_helmet", 0, 0));
		registerItem(burnished_chestplate = new ItemBurnishedArmor("armor/burnished_chestplate", 0, 1));
		registerItem(burnished_leggings = new ItemBurnishedArmor("armor/burnished_leggings", 0, 2));
		registerItem(burnished_boots = new ItemBurnishedArmor("armor/burnished_boots", 0, 3));
		
		registerItem(katcheen_pickaxe = new ItemKatcheenPickaxe(katcheenToolMaterial));
		registerItem(katcheen_axe = new ItemKatcheenAxe(katcheenToolMaterial));
		registerItem(katcheen_shovel = new ItemKatcheenShovel(katcheenToolMaterial));
		registerItem(katcheen_hoe = new ItemKatcheenHoe(katcheenToolMaterial));
		registerItem(katcheen_sword = new ItemKatcheenSword(katcheenToolMaterial));
		
		registerItem(scalemail_helmet = new ItemScalemailArmor("armor/scalemail_helmet", 0, 0));
		registerItem(scalemail_chestplate = new ItemScalemailArmor("armor/scalemail_chestplate", 0, 1));
		registerItem(scalemail_leggings = new ItemScalemailArmor("armor/scalemail_leggings", 0, 2));
		registerItem(scalemail_boots = new ItemScalemailArmor("armor/scalemail_boots", 0, 3));
		
		registerItem(hellion_fruit = new ItemHellionFruit(6, 0.6F));
		registerItem(sacred_fruit = new ItemSacredFruit(3, 0.8F));
		registerItem(dragon_fruit = new ItemDragonFruit(6, 0.8F));
				//, InitBlocksEA.dragon_fruit//, Blocks.farmland
				//));
						
		
		registerItem(vengeance_helmet = new ItemVengeanceArmor("armor/vengeance_helmet", 0, 0));
		registerItem(vengeance_chestplate = new ItemVengeanceArmor("armor/vengeance_chestplate", 0, 1));
		registerItem(vengeance_leggings = new ItemVengeanceArmor("armor/vengeance_leggings", 0, 2));
		registerItem(vengeance_boots = new ItemVengeanceArmor("armor/vengeance_boots", 0, 3));
		
		registerItem(celestial_helmet = new ItemCelestialArmor("armor/celestial_helmet", 0, 0));
		registerItem(celestial_chestplate = new ItemCelestialArmor("armor/celestial_chestplate", 0, 1));
		registerItem(celestial_leggings = new ItemCelestialArmor("armor/celestial_leggings", 0, 2));
		registerItem(celestial_boots = new ItemCelestialArmor("armor/celestial_boots", 0, 3));
		
		//void_helmet = new ItemVoidArmor("armor/void_helmet", 0, EntityEquipmentSlot.HEAD));
		//void_chestplate = new ItemVoidArmor("armor/void_chestplate", 0, EntityEquipmentSlot.CHEST));
		//void_leggings = new ItemVoidArmor("armor/void_leggings", 0, EntityEquipmentSlot.LEGS));
		//void_boots = new ItemVoidArmor("armor/void_boots", 0, EntityEquipmentSlot.FEET));
		
		//infernal_helmet = new ItemInfernalArmor("armor/infernal_helmet", 0, EntityEquipmentSlot.HEAD));
		//infernal_chestplate = new ItemInfernalArmor("armor/infernal_chestplate", 0, EntityEquipmentSlot.CHEST));
		//infernal_leggings = new ItemInfernalArmor("armor/infernal_leggings", 0, EntityEquipmentSlot.LEGS));
		//infernal_boots = new ItemInfernalArmor("armor/infernal_boots", 0, EntityEquipmentSlot.FEET));
		
		
		
		registerItem(deception = new ItemDeception(legendaryWeaponMaterial));
		registerItem(frostbite = new ItemFrostbite(legendaryWeaponMaterial));
		registerItem(massacre = new ItemMassacre(legendaryWeaponMaterial));
		registerItem(blazefury = new ItemBlazefury(legendaryWeaponMaterial));
		registerItem(despair = new ItemDespair(legendaryWeaponMaterial));
		registerItem(souleater = new ItemSouleater(legendaryWeaponMaterial));
		
		//test_shield = new ItemTestShield());
		//omniplex = new Omniplex().setUnlocalizedName("omniplex");
		//banana = (ItemFood) new ItemFood(3, 0.3F, false).setUnlocalizedName("banana");
		
		registerItem(consecration = new ItemConsecration(0, legendaryToolMaterial, null));
		registerItem(necrosis = new ItemNecrosis(0, legendaryToolMaterial, null));
		
	}
	
	public static void registerItem(Item item)
	{
		GameRegistry.registerItem(item, item.getRegistryName());
	}
	//private static <V extends Item> V registerItem(V item) 
	//{
		//GameRegistry.registerItem(item);
		//items.add(item);

	//	return item;
	//}
	
}
