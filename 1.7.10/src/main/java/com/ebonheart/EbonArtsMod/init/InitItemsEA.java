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
	
	public static final Set<Item> items = new HashSet<Item>();
	
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
		/**	
		glowing_disc = registerItem(new ItemMusicDiscEA("disc/glowing_disc", "records.glowing_disc"));
		shimmering_disc = registerItem(new ItemMusicDiscEA("disc/shimmering_disc", "records.shimmering_disc"));
		laminate_disc = registerItem(new ItemMusicDiscEA("disc/laminate_disc", "records.laminate_disc"));
		resilient_disc = registerItem(new ItemMusicDiscEA("disc/resilient_disc", "records.resilient_disc"));
		dismal_disc = registerItem(new ItemMusicDiscEA("disc/dismal_disc", "records.dismal_disc"));
		ethereal_disc = registerItem(new ItemMusicDiscEA("disc/ethereal_disc", "records.ethereal_disc"));
		mirroring_disc = registerItem(new ItemMirroringDisc("disc/mirroring_disc", "records.mirroring_disc"));
		
		empowered_blade = registerItem(new ItemEmpoweredBlade());
		
		enchanted_ebonheart = registerItem(new ItemEnchantedEbonheart());
		
		arcanite_pickaxe = registerItem(new ItemArcanitePickaxe(arcaniteToolMaterial));
		arcanite_axe = registerItem(new ItemArcaniteAxe(ToolMaterial.IRON));
		arcanite_shovel = registerItem(new ItemArcaniteShovel(arcaniteToolMaterial));
		arcanite_hoe = registerItem(new ItemArcaniteHoe(arcaniteToolMaterial));
		arcanite_sword = registerItem(new ItemArcaniteSword(arcaniteToolMaterial));
		
		burnished_helmet = registerItem(new ItemBurnishedArmor("armor/burnished_helmet", 0, 0));
		burnished_chestplate = registerItem(new ItemBurnishedArmor("armor/burnished_chestplate", 0, 1));
		burnished_leggings = registerItem(new ItemBurnishedArmor("armor/burnished_leggings", 0, 2));
		burnished_boots = registerItem(new ItemBurnishedArmor("armor/burnished_boots", 0, 3));
		
		katcheen_pickaxe = registerItem(new ItemKatcheenPickaxe(katcheenToolMaterial));
		katcheen_axe = registerItem(new ItemKatcheenAxe(katcheenToolMaterial));
		katcheen_shovel = registerItem(new ItemKatcheenShovel(katcheenToolMaterial));
		katcheen_hoe = registerItem(new ItemKatcheenHoe(katcheenToolMaterial));
		katcheen_sword = registerItem(new ItemKatcheenSword(katcheenToolMaterial));
		
		scalemail_helmet = registerItem(new ItemScalemailArmor("armor/scalemail_helmet", 0, 0));
		scalemail_chestplate = registerItem(new ItemScalemailArmor("armor/scalemail_chestplate", 0, 1));
		scalemail_leggings = registerItem(new ItemScalemailArmor("armor/scalemail_leggings", 0, 2));
		scalemail_boots = registerItem(new ItemScalemailArmor("armor/scalemail_boots", 0, 3));
		
		hellion_fruit = registerItem(new ItemHellionFruit(6, 0.6F));
		sacred_fruit = registerItem(new ItemSacredFruit(3, 0.8F));
		dragon_fruit = registerItem(new ItemDragonFruit(6, 0.8F));
				//, InitBlocksEA.dragon_fruit//, Blocks.farmland
				//));
						
		
		vengeance_helmet = registerItem(new ItemVengeanceArmor("armor/vengeance_helmet", 0, 0));
		vengeance_chestplate = registerItem(new ItemVengeanceArmor("armor/vengeance_chestplate", 0, 1));
		vengeance_leggings = registerItem(new ItemVengeanceArmor("armor/vengeance_leggings", 0, 2));
		vengeance_boots = registerItem(new ItemVengeanceArmor("armor/vengeance_boots", 0, 3));
		
		celestial_helmet = registerItem(new ItemCelestialArmor("armor/celestial_helmet", 0, 0));
		celestial_chestplate = registerItem(new ItemCelestialArmor("armor/celestial_chestplate", 0, 1));
		celestial_leggings = registerItem(new ItemCelestialArmor("armor/celestial_leggings", 0, 2));
		celestial_boots = registerItem(new ItemCelestialArmor("armor/celestial_boots", 0, 3));
		
		//void_helmet = registerItem(new ItemVoidArmor("armor/void_helmet", 0, EntityEquipmentSlot.HEAD));
		//void_chestplate = registerItem(new ItemVoidArmor("armor/void_chestplate", 0, EntityEquipmentSlot.CHEST));
		//void_leggings = registerItem(new ItemVoidArmor("armor/void_leggings", 0, EntityEquipmentSlot.LEGS));
		//void_boots = registerItem(new ItemVoidArmor("armor/void_boots", 0, EntityEquipmentSlot.FEET));
		
		//infernal_helmet = registerItem(new ItemInfernalArmor("armor/infernal_helmet", 0, EntityEquipmentSlot.HEAD));
		//infernal_chestplate = registerItem(new ItemInfernalArmor("armor/infernal_chestplate", 0, EntityEquipmentSlot.CHEST));
		//infernal_leggings = registerItem(new ItemInfernalArmor("armor/infernal_leggings", 0, EntityEquipmentSlot.LEGS));
		//infernal_boots = registerItem(new ItemInfernalArmor("armor/infernal_boots", 0, EntityEquipmentSlot.FEET));
		
		
		
		deception = registerItem(new ItemDeception(legendaryWeaponMaterial));
		frostbite = registerItem(new ItemFrostbite(legendaryWeaponMaterial));
		massacre = registerItem(new ItemMassacre(legendaryWeaponMaterial));
		blazefury = registerItem(new ItemBlazefury(legendaryWeaponMaterial));
		despair = registerItem(new ItemDespair(legendaryWeaponMaterial));
		souleater = registerItem(new ItemSouleater(legendaryWeaponMaterial));
		
		//test_shield = registerItem(new ItemTestShield());
		//omniplex = new Omniplex().setUnlocalizedName("omniplex");
		//banana = (ItemFood) new ItemFood(3, 0.3F, false).setUnlocalizedName("banana");
		
		consecration = registerItem(new ItemConsecration(0, legendaryToolMaterial, null));
		necrosis = registerItem(new ItemNecrosis(0, legendaryToolMaterial, null));
		
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
