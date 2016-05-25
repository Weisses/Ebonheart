package com.ebonheart.EbonArtsMod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.api.ItemsEA;
import com.ebonheart.EbonArtsMod.api.Reference;
import com.ebonheart.EbonArtsMod.client.projectile.RenderEnchantedEbonheart;
import com.ebonheart.EbonArtsMod.common.entity.EntityEnchantedEbonheart;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemArcanite;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemDraconiumDust;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemDragonFruit;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemEnchantedEbonheart;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemEmpoweredBlade;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemGlowstoneShard;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemKatcheen;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemMusicDiscEA;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemNecrocite;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemObsidianShard;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemSoularite;
import com.ebonheart.EbonArtsMod.common.items.resources.ItemVelious;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemArcaniteAxe;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemBlazefury;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemDespair;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemFrostbite;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemArcaniteHoe;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemMassacre;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemArcanitePickaxe;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemArcaniteShovel;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemSouleater;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemArcaniteSword;
import com.ebonheart.EbonArtsMod.common.items.tools.ItemKatcheenSword;

public class InitEntityEA {
	
	private static int entityID = 0;
	
	public static void preInit()
	{

		//throwingRock = new ItemThrowingRock().setUnlocalizedName("throwingRock");
		register(EntityEnchantedEbonheart.class, "Enchanted Ebonheart", 64, 20, true);
		
	}
	
	public static void register(Class<? extends Entity> entityClass, String entityName, int trackingRange, int updateFrequency, boolean sendsVelocityUpdates)
	{
		//int modEntityID = 0;
		//EntityRegistry.registerModEntity(EntityEnchantedEbonheart.class, "Ebonheart", ++modEntityID, Reference.MOD_ID, 64, 10, true);
		
		EntityRegistry.registerModEntity(entityClass, entityName, entityID++, EbonArtsMod.instance, trackingRange, updateFrequency, sendsVelocityUpdates);
		
		
		//EntityRegistry.registerModEntity(EntityEbonheart.class, "Ebonheart", EntityRegistry.findGlobalUniqueEntityId(), Reference.MOD_ID, 64, 10, true);
		
	}
}
