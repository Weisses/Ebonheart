package com.ebonheart.EbonArtsMod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ebonheart.EbonArtsMod.common.items.ItemAlchemicalCompendium;
import com.ebonheart.EbonArtsMod.common.items.ItemShimmeringDisc;
import com.ebonheart.EbonArtsMod.common.items.armor.ItemArmorEA;
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
import com.ebonheart.EbonArtsMod.common.items.tools.ItemSwordEA;
import com.ebonheart.EbonArtsMod.references.Reference;

public class InitItemsEA 
{
	public static Item ebon_tome;
	
	public static Item draconium_dust;
	public static Item velious;
	public static Item arcanite;
	public static Item katcheen;
	public static Item necrocite;
	public static Item soularite;
	public static Item ebonheart;
	
	public static Item obsidian_shards;
	public static Item glowstone_shards;
	//public static Item innate_arcanite;
	
	
	
	public static Item shimmering_disc;
	
	
	//public static Item arcanite_shard;
	
	
	//public static Item mystic_dust;
	//public static Item purified_mystic_dust;
	
	public static Item tier_1_catalyst;
	public static Item tier_2_catalyst;
	public static Item tier_3_catalyst;
	public static Item tier_4_catalyst;
	//public static Item iron_catalyst;
	//public static Item gold_catalyst;
	//public static Item diamond_catalyst;
	//public static Item emerald_catalyst;
	
	//public static Item ebon_sigil;
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
	
	public static Item katcheen_pickaxe;
	public static Item katcheen_axe;
	public static Item katcheen_shovel;
	public static Item katcheen_hoe;
	public static Item katcheen_sword;
	
	public static Item katcheen_helmet;
	public static Item katcheen_chestplate;
	public static Item katcheen_leggings;
	public static Item katcheen_boots;
	
	public static Item empowered_sword;
	public static Item blazefury;
	public static Item despair;
	public static Item frostbite;
	public static Item massacre;
	public static Item souleater;
	
	public static ItemFood banana;
	public static ItemFood dragon_fruit;
	
	
	//public static Item test_liquid_bucket;
	
	
	//public static Item mans_steak;
	
	public static final Item.ToolMaterial arcaniteToolMaterial = EnumHelper.addToolMaterial("arcaniteToolMaterial", 2, 1000, 7.0F, 2.5F, 15);
	public static final Item.ToolMaterial katcheenToolMaterial = EnumHelper.addToolMaterial("katcheenToolMaterial", 3, 2000, 9.5F, 4.0F, 20);
	public static final Item.ToolMaterial empoweredToolMaterial = EnumHelper.addToolMaterial("empoweredToolMaterial", 3, 2000, 9.5F, 5.0F, 0);
	public static final Item.ToolMaterial specialToolMaterial = EnumHelper.addToolMaterial("specialToolMaterial", 3, 2000, 9.5F, 6.0F, 30);
	
	//public static final Item.ToolMaterial innatearcaniteToolMaterial = EnumHelper.addToolMaterial("innatearcaniteToolMaterial", 3, 1700, 8.5F, 3.5F, 10);
	public static final ItemArmor.ArmorMaterial arcaniteArmorMaterial = EnumHelper.addArmorMaterial("arcaniteArmorMaterial", "ea:arcanite", 33, new int[]{2, 7, 5, 2}, 10);
	public static final ItemArmor.ArmorMaterial katcheenArmorMaterial = EnumHelper.addArmorMaterial("katcheenArmorMaterial", "ea:katcheen", 66, new int[]{3, 8, 6, 3}, 30);
	
	//public static final ItemArmor.ArmorMaterial arcaniteArmorMaterial = EnumHelper.addArmorMaterial(name, textureName, durability, reductionAmounts, enchantability);

	public static void preInit()
	{
		ebon_tome = new ItemAlchemicalCompendium("ebon_tome");
		
		draconium_dust = new ItemDraconiumDust();
		velious = new ItemVelious();
		arcanite = new ItemArcanite();
		katcheen = new ItemKatcheen();
		necrocite = new ItemNecrocite();
		soularite = new ItemSoularite();
		ebonheart = new ItemEbonheart();
		
		
		//innate_arcanite = new ItemInnateArcanite("gem/innate_arcanite");
		
		
		
		shimmering_disc = new ItemShimmeringDisc();
		
		
		
		
		//arcanite_shard = new ItemArcaniteShard("arcanite_shard");
		
		arcanite_pickaxe = new ItemPickaxeEA("tool/arcanite_pickaxe", arcaniteToolMaterial);
		arcanite_axe = new ItemAxeEA("tool/arcanite_axe", arcaniteToolMaterial);
		arcanite_shovel = new ItemShovelEA("tool/arcanite_shovel", arcaniteToolMaterial);
		arcanite_hoe = new ItemHoeEA("tool/arcanite_hoe", arcaniteToolMaterial);
		arcanite_sword = new ItemSwordEA("tool/arcanite_sword", arcaniteToolMaterial);
		
		arcanite_helmet = new ItemArmorEA("armor/arcanite_helmet", arcaniteArmorMaterial, 0, 0);
		arcanite_chestplate = new ItemArmorEA("armor/arcanite_chestplate", arcaniteArmorMaterial, 0, 1);
		arcanite_leggings = new ItemArmorEA("armor/arcanite_leggings", arcaniteArmorMaterial, 0, 2);
		arcanite_boots = new ItemArmorEA("armor/arcanite_boots", arcaniteArmorMaterial, 0, 3);
		
		
		katcheen_pickaxe = new ItemPickaxeEA("tool/katcheen_pickaxe", katcheenToolMaterial);
		katcheen_axe = new ItemAxeEA("tool/katcheen_axe", katcheenToolMaterial);
		katcheen_shovel = new ItemShovelEA("tool/katcheen_shovel", katcheenToolMaterial);
		katcheen_hoe = new ItemHoeEA("tool/katcheen_hoe", katcheenToolMaterial);
		katcheen_sword = new ItemSwordEA("tool/katcheen_sword", katcheenToolMaterial);
		
		katcheen_helmet = new ItemArmorEA("armor/katcheen_helmet", katcheenArmorMaterial, 0, 0);
		katcheen_chestplate = new ItemArmorEA("armor/katcheen_chestplate", katcheenArmorMaterial, 0, 1);
		katcheen_leggings = new ItemArmorEA("armor/katcheen_leggings", katcheenArmorMaterial, 0, 2);
		katcheen_boots = new ItemArmorEA("armor/katcheen_boots", katcheenArmorMaterial, 0, 3);
		
		empowered_sword = new ItemEmpoweredSword("tool/empowered_sword", empoweredToolMaterial);
		frostbite = new ItemFrostbite("tool/frostbite", specialToolMaterial);
		massacre = new ItemMassacre("tool/massacre", specialToolMaterial);
		blazefury = new ItemBlazefury("tool/blazefury", specialToolMaterial);
		despair = new ItemDespair("tool/despair", specialToolMaterial);
		souleater = new ItemSouleater("tool/souleater", specialToolMaterial);
		
		obsidian_shards = new ItemObsidianShard();
		glowstone_shards = new ItemGlowstoneShard();
		
		//test_liquid_bucket = new ItemBucket(InitBlocksEA.test_liquid).setUnlocalizedName("test_liquid_bucket").setCreativeTab(EbonArtsMod.tabEbonArtsItems).setContainerItem(test_liquid_bucket);
		
		
		//mystic_dust = new Item().setUnlocalizedName("mystic_dust").setCreativeTab(EbonArtsMod.tabEbonArtsItems);
		//purified_mystic_dust = new Item().setUnlocalizedName("purified_mystic_dust").setCreativeTab(EbonArtsMod.tabEbonArtsItems);
		//ebon_sigil = new Omniplex().setUnlocalizedName("ebon_sigil");
		tier_1_catalyst = new Item().setUnlocalizedName("tier_1_catalyst");
		tier_2_catalyst = new Item().setUnlocalizedName("tier_2_catalyst");
		tier_3_catalyst = new Item().setUnlocalizedName("tier_3_catalyst");
		tier_4_catalyst = new Item().setUnlocalizedName("tier_4_catalyst");
	
	
		banana = (ItemFood) new ItemFood(3, 0.3F, false).setUnlocalizedName("banana");
		
		dragon_fruit = (ItemFood) new ItemDragonFruit(3, 0.3F, true);
		
	}
	
	public static void register()
	{
		GameRegistry.registerItem(ebon_tome, ebon_tome.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(draconium_dust, draconium_dust.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(velious, velious.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(arcanite, arcanite.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(katcheen, katcheen.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(necrocite, necrocite.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(soularite, soularite.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ebonheart, ebonheart.getUnlocalizedName().substring(5));
		
		
		//GameRegistry.registerItem(innate_arcanite, innate_arcanite.getUnlocalizedName().substring(5));
		
		//GameRegistry.registerItem(arcanite_shard, arcanite_shard.getUnlocalizedName().substring(5));
		
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
		
		
		//GameRegistry.registerItem(test_liquid_bucket, test_liquid_bucket.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(empowered_sword, empowered_sword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(frostbite, frostbite.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(massacre, massacre.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(blazefury, blazefury.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(despair, despair.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(souleater, souleater.getUnlocalizedName().substring(5));
		
		
		GameRegistry.registerItem(obsidian_shards, obsidian_shards.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(glowstone_shards, glowstone_shards.getUnlocalizedName().substring(5));
		
		
		//GameRegistry.registerItem(mystic_dust, mystic_dust.getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(purified_mystic_dust, purified_mystic_dust.getUnlocalizedName().substring(5));
		//GameRegistry.registerItem(ebon_sigil, ebon_sigil.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tier_1_catalyst, tier_1_catalyst.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tier_2_catalyst, tier_2_catalyst.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tier_3_catalyst, tier_3_catalyst.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tier_4_catalyst, tier_4_catalyst.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(banana, banana.getUnlocalizedName().substring(5));
	
		GameRegistry.registerItem(dragon_fruit, dragon_fruit.getUnlocalizedName().substring(5));
		
	
	}
	
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
