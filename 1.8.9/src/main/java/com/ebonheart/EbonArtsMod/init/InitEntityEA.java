package com.ebonheart.EbonArtsMod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemFood;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.ebonheart.EbonArtsMod.client.render.models.RenderEbonheart;
import com.ebonheart.EbonArtsMod.common.entity.EntityEbonheart;
import com.ebonheart.EbonArtsMod.common.items.ItemAlchemicalCompendium;
import com.ebonheart.EbonArtsMod.common.items.ItemMusicDiscEA;
import com.ebonheart.EbonArtsMod.common.items.armor.ItemArmorEAArcanite;
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

public class InitEntityEA extends ItemsEA {
	
	
	public static void preInit()
	{

		//throwingRock = new ItemThrowingRock().setUnlocalizedName("throwingRock");
		
		
	}
	
	public static void register()
	{
		//int modEntityID = 0;
		//EntityRegistry.registerModEntity(EntityEbonheart.class, "Ebonheart", ++modEntityID, this, 64, 10, true);
		
		//EntityRegistry.registerModEntity(EntityEbonheart.class, "Ebonheart", EntityRegistry.findGlobalUniqueEntityId(), Reference.MOD_ID, 64, 10, true);
		
		EntityRegistry.registerModEntity(EntityEbonheart.class, "Ebonheart", EntityRegistry.findGlobalUniqueEntityId(), Reference.MOD_ID, 64, 10, true);
		
	}
}
