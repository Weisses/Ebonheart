package com.ebonheart.EbonArtsMod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ebonheart.EbonArtsMod.common.entity.EntityEbonheart;
import com.ebonheart.EbonArtsMod.common.items.ItemAlchemicalCompendium;
import com.ebonheart.EbonArtsMod.common.items.ItemMusicDiscEA;
import com.ebonheart.EbonArtsMod.common.items.armor.ItemArmorEAArcanite;
import com.ebonheart.EbonArtsMod.common.items.armor.ItemArmorEAKatcheen;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemArcanite;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemDraconiumDust;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemDragonFruit;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemEbonheart;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemGlowstoneShard;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemKatcheen;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemNecrocite;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemObsidianShard;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemSoularite;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemVelious;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemAxeEA;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemBlazefury;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemDespair;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemEmpoweredSword;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemFrostbite;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemHoeEA;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemMassacre;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemPickaxeEA;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemShovelEA;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemSouleater;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemSwordArcanite;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemSwordKatcheen;
import com.ebonheart.EbonArtsMod.references.ItemsEA;
import com.ebonheart.EbonArtsMod.references.Reference;

public class InitItemsEA extends ItemsEA {
	
	public static final Item.ToolMaterial arcaniteToolMaterial = EnumHelper.addToolMaterial("arcaniteToolMaterial", 2, 315, 6.5F, 2.5F, 15);
	public static final Item.ToolMaterial katcheenToolMaterial = EnumHelper.addToolMaterial("katcheenToolMaterial", 3, 1600, 8.5F, 4.0F, 20);
	public static final Item.ToolMaterial empoweredToolMaterial = EnumHelper.addToolMaterial("empoweredToolMaterial", 3, 1661, 9.5F, 5.0F, 0);
	public static final Item.ToolMaterial specialToolMaterial = EnumHelper.addToolMaterial("specialToolMaterial", 3, 1661, 9.5F, 6.0F, 30);
	
	public static final ItemArmor.ArmorMaterial arcaniteArmorMaterial = EnumHelper.addArmorMaterial("arcaniteArmorMaterial", "ea:arcanite", 18, new int[]{2, 6, 5, 2}, 10);
	public static final ItemArmor.ArmorMaterial katcheenArmorMaterial = EnumHelper.addArmorMaterial("katcheenArmorMaterial", "ea:katcheen", 36, new int[]{3, 8, 6, 3}, 30);
	
	//public static final ItemArmor.ArmorMaterial arcaniteArmorMaterial = EnumHelper.addArmorMaterial(name, textureName, durability, reductionAmounts, enchantability);

	public static void preInit()
	{
		
		draconium_dust = new ItemDraconiumDust();
		velious = new ItemVelious();
		arcanite = new ItemArcanite();
		katcheen = new ItemKatcheen();
		necrocite = new ItemNecrocite();
		soularite = new ItemSoularite();
		ebonheart = new ItemEbonheart();
		
		shimmering_disc = new ItemMusicDiscEA("shimmering_disc", "records.shimmering_disc");
		
		arcanite_pickaxe = new ItemPickaxeEA("tool/arcanite_pickaxe", arcaniteToolMaterial);
		arcanite_axe = new ItemAxeEA("tool/arcanite_axe", arcaniteToolMaterial);
		arcanite_shovel = new ItemShovelEA("tool/arcanite_shovel", arcaniteToolMaterial);
		arcanite_hoe = new ItemHoeEA("tool/arcanite_hoe", arcaniteToolMaterial);
		arcanite_sword = new ItemSwordArcanite("tool/arcanite_sword", arcaniteToolMaterial);
		arcanite_helmet = new ItemArmorEAArcanite("armor/arcanite_helmet", arcaniteArmorMaterial, 0, 0);
		arcanite_chestplate = new ItemArmorEAArcanite("armor/arcanite_chestplate", arcaniteArmorMaterial, 0, 1);
		arcanite_leggings = new ItemArmorEAArcanite("armor/arcanite_leggings", arcaniteArmorMaterial, 0, 2);
		arcanite_boots = new ItemArmorEAArcanite("armor/arcanite_boots", arcaniteArmorMaterial, 0, 3);
		
		katcheen_pickaxe = new ItemPickaxeEA("tool/katcheen_pickaxe", katcheenToolMaterial);
		katcheen_axe = new ItemAxeEA("tool/katcheen_axe", katcheenToolMaterial);
		katcheen_shovel = new ItemShovelEA("tool/katcheen_shovel", katcheenToolMaterial);
		katcheen_hoe = new ItemHoeEA("tool/katcheen_hoe", katcheenToolMaterial);
		katcheen_sword = new ItemSwordKatcheen("tool/katcheen_sword", katcheenToolMaterial);
		katcheen_helmet = new ItemArmorEAKatcheen("armor/katcheen_helmet", katcheenArmorMaterial, 0, 0);
		katcheen_chestplate = new ItemArmorEAKatcheen("armor/katcheen_chestplate", katcheenArmorMaterial, 0, 1);
		katcheen_leggings = new ItemArmorEAKatcheen("armor/katcheen_leggings", katcheenArmorMaterial, 0, 2);
		katcheen_boots = new ItemArmorEAKatcheen("armor/katcheen_boots", katcheenArmorMaterial, 0, 3);
		
		empowered_sword = new ItemEmpoweredSword("tool/empowered_sword", empoweredToolMaterial);
		frostbite = new ItemFrostbite("tool/frostbite", specialToolMaterial);
		massacre = new ItemMassacre("tool/massacre", specialToolMaterial);
		blazefury = new ItemBlazefury("tool/blazefury", specialToolMaterial);
		despair = new ItemDespair("tool/despair", specialToolMaterial);
		souleater = new ItemSouleater("tool/souleater", specialToolMaterial);
		
		obsidian_shards = new ItemObsidianShard();
		glowstone_shards = new ItemGlowstoneShard();
		
		
		banana = (ItemFood) new ItemFood(3, 0.3F, false).setUnlocalizedName("banana");
		dragon_fruit = (ItemFood) new ItemDragonFruit(3, 0.3F, true);
		
	}
	
	public static void register()
	{
		//GameRegistry.registerItem(ebon_tome, ebon_tome.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(draconium_dust, draconium_dust.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(velious, velious.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(arcanite, arcanite.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(katcheen, katcheen.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(necrocite, necrocite.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(soularite, soularite.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ebonheart, ebonheart.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(shimmering_disc, shimmering_disc.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(arcanite_pickaxe, arcanite_pickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(arcanite_axe, arcanite_axe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(arcanite_shovel, arcanite_shovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(arcanite_hoe, arcanite_hoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(arcanite_sword, arcanite_sword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(arcanite_helmet, arcanite_helmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(arcanite_chestplate, arcanite_chestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(arcanite_leggings, arcanite_leggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(arcanite_boots, arcanite_boots.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(katcheen_pickaxe, katcheen_pickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(katcheen_axe, katcheen_axe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(katcheen_shovel, katcheen_shovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(katcheen_hoe, katcheen_hoe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(katcheen_sword, katcheen_sword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(katcheen_helmet, katcheen_helmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(katcheen_chestplate, katcheen_chestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(katcheen_leggings, katcheen_leggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(katcheen_boots, katcheen_boots.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(empowered_sword, empowered_sword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(frostbite, frostbite.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(massacre, massacre.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(blazefury, blazefury.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(despair, despair.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(souleater, souleater.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(obsidian_shards, obsidian_shards.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(glowstone_shards, glowstone_shards.getUnlocalizedName().substring(5));
		
		
		
		GameRegistry.registerItem(banana, banana.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(dragon_fruit, dragon_fruit.getUnlocalizedName().substring(5));
	}
}
