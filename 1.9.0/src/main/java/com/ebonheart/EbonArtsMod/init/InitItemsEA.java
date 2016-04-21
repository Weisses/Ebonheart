package com.ebonheart.EbonArtsMod.init;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemShield;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.api.SoundEventsEA;
import com.ebonheart.EbonArtsMod.common.items.ItemMirroringDisc;
import com.ebonheart.EbonArtsMod.common.items.ItemMusicDiscEA;
import com.ebonheart.EbonArtsMod.common.items.Omniplex;
import com.ebonheart.EbonArtsMod.common.items.armor.EAMaterialHelper;
import com.ebonheart.EbonArtsMod.common.items.armor.ItemBurnishedArmor;
import com.ebonheart.EbonArtsMod.common.items.armor.ItemCelestialArmor;
import com.ebonheart.EbonArtsMod.common.items.armor.ItemInfernalArmor;
import com.ebonheart.EbonArtsMod.common.items.armor.ItemScalemailArmor;
import com.ebonheart.EbonArtsMod.common.items.armor.ItemVengeanceArmor;
import com.ebonheart.EbonArtsMod.common.items.armor.ItemVoidArmor;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemArcanite;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemDraconiumDust;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemDragonFruit;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemEbonheart;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemEnchantedEbonheart;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemEmpoweredBlade;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemGlowstoneShard;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemKatcheen;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemNecrocite;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemObsidianShard;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemSoularite;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemVelious;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemArcaniteAxe;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemArcaniteHoe;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemArcanitePickaxe;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemArcaniteShovel;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemArcaniteSword;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemBlazefury;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemDeception;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemDespair;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemFrostbite;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemKatcheenAxe;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemKatcheenHoe;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemKatcheenPickaxe;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemKatcheenShovel;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemKatcheenSword;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemMassacre;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemSouleater;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemTestShield;
import com.ebonheart.EbonArtsMod.references.ItemsEA;

//@SuppressWarnings("WeakerAccess")
public class InitItemsEA extends ItemsEA {
	
	public static final Set<Item> items = new HashSet<>();
	
	public static final Item.ToolMaterial arcaniteToolMaterial = EnumHelper.addToolMaterial("arcaniteToolMaterial", 2, 315, 6.5F, 2.5F, 15);
	public static final Item.ToolMaterial katcheenToolMaterial = EnumHelper.addToolMaterial("katcheenToolMaterial", 3, 1600, 8.5F, 4.0F, 20);
	
	public static final Item.ToolMaterial legendaryToolMaterial = EnumHelper.addToolMaterial("legendaryToolMaterial", 3, 1661, 9.5F, 6.0F, 30);
	
	public static final ItemArmor.ArmorMaterial arcaniteArmorMaterial = EnumHelper.addArmorMaterial("arcaniteArmorMaterial", "ea:arcanite", 18, new int[]{2, 6, 5, 2}, 10, SoundEvents.item_armor_equip_chain);
	public static final ItemArmor.ArmorMaterial katcheenArmorMaterial = EnumHelper.addArmorMaterial("katcheenArmorMaterial", "ea:katcheen", 36, new int[]{3, 8, 6, 3}, 30, SoundEvents.item_armor_equip_chain);
	
	
	
	//public static final ItemArmor.ArmorMaterial arcaniteArmorMaterial = EnumHelper.addArmorMaterial(name, textureName, durability, reductionAmounts, enchantability);

	
	
	
	
	public static void preInit()
	{
		
		draconium_dust = registerItem(new ItemDraconiumDust());
		velious = registerItem(new ItemVelious());
		arcanite = registerItem(new ItemArcanite());
		katcheen = registerItem(new ItemKatcheen());
		necrocite = registerItem(new ItemNecrocite());
		soularite = registerItem(new ItemSoularite());
		ebonheart = registerItem(new ItemEbonheart());
		obsidian_shards = registerItem(new ItemObsidianShard());
		glowstone_shards = registerItem(new ItemGlowstoneShard());
		
		
		
		
		
		
		
		glowing_disc = registerItem(new ItemMusicDiscEA("disc/glowing_disc", SoundEventsEA.island));
		shimmering_disc = registerItem(new ItemMusicDiscEA("disc/shimmering_disc", SoundEventsEA.dire));
		laminate_disc = registerItem(new ItemMusicDiscEA("disc/laminate_disc", SoundEventsEA.marble));
		resilient_disc = registerItem(new ItemMusicDiscEA("disc/resilient_disc", SoundEventsEA.strength));
		dismal_disc = registerItem(new ItemMusicDiscEA("disc/dismal_disc", SoundEventsEA.castle));
		ethereal_disc = registerItem(new ItemMusicDiscEA("disc/ethereal_disc", SoundEventsEA.timescar));
		
		mirroring_disc = registerItem(new ItemMirroringDisc("disc/mirroring_disc", SoundEventsEA.lostwoods));
		//shimmering_disc = new ItemMusicDiscEA("disc/shimmering_disc", "records.shimmering_disc", null);
		//laminate_disc = new ItemMusicDiscEA("disc/laminate_disc", "records.laminate_disc", null);
		//resilient_disc = new ItemMusicDiscEA("disc/resilient_disc", "records.resilient_disc", null);
		//dismal_disc = new ItemMusicDiscEA("disc/dismal_disc", "records.dismal_disc", null);
		//ethereal_disc = new ItemMusicDiscEA("disc/ethereal_disc", "records.ethereal_disc", null);
		//chrono_disc = new ItemMusicDiscEA("disc/chrono_disc", "records.chrono_disc");
		
		//mirroring_disc = new ItemMirroringDisc("disc/mirroring_disc", "records.mirroring_disc", null);
		
		empowered_blade = registerItem(new ItemEmpoweredBlade());
		
		enchanted_ebonheart = registerItem(new ItemEnchantedEbonheart());
		
		
		arcanite_pickaxe = registerItem(new ItemArcanitePickaxe(arcaniteToolMaterial));
		arcanite_axe = registerItem(new ItemArcaniteAxe(ToolMaterial.IRON));
		arcanite_shovel = registerItem(new ItemArcaniteShovel(arcaniteToolMaterial));
		arcanite_hoe = registerItem(new ItemArcaniteHoe(arcaniteToolMaterial));
		arcanite_sword = registerItem(new ItemArcaniteSword(arcaniteToolMaterial));
		
		
		burnished_helmet = registerItem(new ItemBurnishedArmor("armor/burnished_helmet", 0, EntityEquipmentSlot.HEAD));
		burnished_chestplate = registerItem(new ItemBurnishedArmor("armor/burnished_chestplate", 0, EntityEquipmentSlot.CHEST));
		burnished_leggings = registerItem(new ItemBurnishedArmor("armor/burnished_leggings", 0, EntityEquipmentSlot.LEGS));
		burnished_boots = registerItem(new ItemBurnishedArmor("armor/burnished_boots", 0, EntityEquipmentSlot.FEET));
		
		
		
		katcheen_pickaxe = registerItem(new ItemKatcheenPickaxe(katcheenToolMaterial));
		katcheen_axe = registerItem(new ItemKatcheenAxe(ToolMaterial.DIAMOND));
		katcheen_shovel = registerItem(new ItemKatcheenShovel(katcheenToolMaterial));
		katcheen_hoe = registerItem(new ItemKatcheenHoe(katcheenToolMaterial));
		katcheen_sword = registerItem(new ItemKatcheenSword(katcheenToolMaterial));
		
		
		
		scalemail_helmet = registerItem(new ItemScalemailArmor("armor/scalemail_helmet", 0, EntityEquipmentSlot.HEAD));
		scalemail_chestplate = registerItem(new ItemScalemailArmor("armor/scalemail_chestplate", 0, EntityEquipmentSlot.CHEST));
		scalemail_leggings = registerItem(new ItemScalemailArmor("armor/scalemail_leggings", 0, EntityEquipmentSlot.LEGS));
		scalemail_boots = registerItem(new ItemScalemailArmor("armor/scalemail_boots", 0, EntityEquipmentSlot.FEET));
		
		vengeance_helmet = registerItem(new ItemVengeanceArmor("armor/vengeance_helmet", 0, EntityEquipmentSlot.HEAD));
		vengeance_chestplate = registerItem(new ItemVengeanceArmor("armor/vengeance_chestplate", 0, EntityEquipmentSlot.CHEST));
		vengeance_leggings = registerItem(new ItemVengeanceArmor("armor/vengeance_leggings", 0, EntityEquipmentSlot.LEGS));
		vengeance_boots = registerItem(new ItemVengeanceArmor("armor/vengeance_boots", 0, EntityEquipmentSlot.FEET));
		
		celestial_helmet = registerItem(new ItemCelestialArmor("armor/celestial_helmet", 0, EntityEquipmentSlot.HEAD));
		celestial_chestplate = registerItem(new ItemCelestialArmor("armor/celestial_chestplate", 0, EntityEquipmentSlot.CHEST));
		celestial_leggings = registerItem(new ItemCelestialArmor("armor/celestial_leggings", 0, EntityEquipmentSlot.LEGS));
		celestial_boots = registerItem(new ItemCelestialArmor("armor/celestial_boots", 0, EntityEquipmentSlot.FEET));
		
		void_helmet = registerItem(new ItemVoidArmor("armor/void_helmet", 0, EntityEquipmentSlot.HEAD));
		void_chestplate = registerItem(new ItemVoidArmor("armor/void_chestplate", 0, EntityEquipmentSlot.CHEST));
		void_leggings = registerItem(new ItemVoidArmor("armor/void_leggings", 0, EntityEquipmentSlot.LEGS));
		void_boots = registerItem(new ItemVoidArmor("armor/void_boots", 0, EntityEquipmentSlot.FEET));
		
		infernal_helmet = registerItem(new ItemInfernalArmor("armor/infernal_helmet", 0, EntityEquipmentSlot.HEAD));
		infernal_chestplate = registerItem(new ItemInfernalArmor("armor/infernal_chestplate", 0, EntityEquipmentSlot.CHEST));
		infernal_leggings = registerItem(new ItemInfernalArmor("armor/infernal_leggings", 0, EntityEquipmentSlot.LEGS));
		infernal_boots = registerItem(new ItemInfernalArmor("armor/infernal_boots", 0, EntityEquipmentSlot.FEET));
		
		//burnished_helmet = registerItem(new ItemBurnishedArmor("armor/burnished_helmet", 0, EntityEquipmentSlot.HEAD));
		//burnished_chestplate = registerItem(new ItemBurnishedArmor("armor/burnished_chestplate", 0, EntityEquipmentSlot.CHEST));
		//burnished_leggings = registerItem(new ItemBurnishedArmor("armor/burnished_leggings", 0, EntityEquipmentSlot.LEGS));
		//burnished_boots = registerItem(new ItemBurnishedArmor("armor/burnished_boots", 0, EntityEquipmentSlot.FEET));
		
		
		
		dragon_fruit = (ItemFood) registerItem(new ItemDragonFruit(6, 1.0F, true));
		
		
		
		deception = registerItem(new ItemDeception(legendaryToolMaterial));
		frostbite = registerItem(new ItemFrostbite(legendaryToolMaterial));
		massacre = registerItem(new ItemMassacre(legendaryToolMaterial));
		blazefury = registerItem(new ItemBlazefury(legendaryToolMaterial));
		despair = registerItem(new ItemDespair(legendaryToolMaterial));
		souleater = registerItem(new ItemSouleater(legendaryToolMaterial));
		
		
		
		
		
		//test_shield = registerItem(new ItemTestShield());
		
		//omniplex = new Omniplex().setUnlocalizedName("omniplex");
		
		//banana = (ItemFood) new ItemFood(3, 0.3F, false).setUnlocalizedName("banana");
		
		
	}
	
	private static <T extends Item> T registerItem(T item) {
		GameRegistry.register(item);
		items.add(item);

		return item;
	}
	
	public static void register()
	{
		
		//GameRegistry.registerItem(ebon_tome, ebon_tome.getUnlocalizedName().substring(5));
		
		///GameRegistry.register(draconium_dust);
		///.registerItem(draconium_dust, draconium_dust.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(velious, velious.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(arcanite, arcanite.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(katcheen, katcheen.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(necrocite, necrocite.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(soularite, soularite.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(ebonheart, ebonheart.getUnlocalizedName().substring(5));
		
		///GameRegistry.registerItem(obsidian_shards, obsidian_shards.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(glowstone_shards, glowstone_shards.getUnlocalizedName().substring(5));
		
		
		
		
		
		///GameRegistry.registerItem(glowing_disc, glowing_disc.getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(shimmering_disc, shimmering_disc.getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(laminate_disc, laminate_disc.getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(resilient_disc, resilient_disc.getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(dismal_disc, dismal_disc.getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(ethereal_disc, ethereal_disc.getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(chrono_disc, chrono_disc.getUnlocalizedName().substring(5));
		
		//GameRegistry.registerItem(mirroring_disc, mirroring_disc.getUnlocalizedName().substring(5));
		
		///GameRegistry.registerItem(empowered_blade, empowered_blade.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(enchanted_ebonheart, enchanted_ebonheart.getUnlocalizedName().substring(5));
		
		
		
		
		///GameRegistry.registerItem(arcanite_pickaxe, arcanite_pickaxe.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(arcanite_axe, arcanite_axe.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(arcanite_shovel, arcanite_shovel.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(arcanite_hoe, arcanite_hoe.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(arcanite_sword, arcanite_sword.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(arcanite_helmet, arcanite_helmet.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(arcanite_chestplate, arcanite_chestplate.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(arcanite_leggings, arcanite_leggings.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(arcanite_boots, arcanite_boots.getUnlocalizedName().substring(5));
		
		///GameRegistry.registerItem(katcheen_pickaxe, katcheen_pickaxe.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(katcheen_axe, katcheen_axe.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(katcheen_shovel, katcheen_shovel.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(katcheen_hoe, katcheen_hoe.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(katcheen_sword, katcheen_sword.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(katcheen_helmet, katcheen_helmet.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(katcheen_chestplate, katcheen_chestplate.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(katcheen_leggings, katcheen_leggings.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(katcheen_boots, katcheen_boots.getUnlocalizedName().substring(5));
		
		///GameRegistry.registerItem(deception, deception.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(frostbite, frostbite.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(massacre, massacre.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(blazefury, blazefury.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(despair, despair.getUnlocalizedName().substring(5));
		///GameRegistry.registerItem(souleater, souleater.getUnlocalizedName().substring(5));
		
		//GameRegistry.registerItem(test_shield, test_shield.getUnlocalizedName().substring(5));
		
		
		///GameRegistry.registerItem(dragon_fruit, dragon_fruit.getUnlocalizedName().substring(5));
		
		
		//GameRegistry.registerItem(omniplex, omniplex.getUnlocalizedName().substring(5));
		
		//GameRegistry.registerItem(banana, banana.getUnlocalizedName().substring(5));
		
	}
}
