package com.ebonheart.EbonArtsMod.common.items.armor;

import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EAMaterialHelper {
	
	public static final ItemArmor.ArmorMaterial BURNISHED = EnumHelper.addArmorMaterial("burnished", "ea:burnished", 14, new int[]{2, 5, 6, 2}, 30, SoundEvents.item_armor_equip_iron);
	public static final ItemArmor.ArmorMaterial SCALEMAIL = EnumHelper.addArmorMaterial("scalemail", "ea:scalemail", 30, new int[]{3, 6, 8, 3}, 30, SoundEvents.item_armor_equip_chain);
	public static final ItemArmor.ArmorMaterial VENGEANCE = EnumHelper.addArmorMaterial("vengeance", "ea:vengeance", 30, new int[]{3, 6, 8, 3}, 30, SoundEvents.item_armor_equip_gold);
	public static final ItemArmor.ArmorMaterial CELESTIAL = EnumHelper.addArmorMaterial("celestial", "ea:celestial", 30, new int[]{3, 6, 8, 3}, 30, SoundEvents.item_armor_equip_diamond);
	//public static final ItemArmor.ArmorMaterial EBONHEART = EnumHelper.addArmorMaterial("katcheenArmorMaterial", "ea:katcheen", 36, new int[]{3, 8, 6, 3}, 30, SoundEvents.item_armor_equip_diamond);
	
}
