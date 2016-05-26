package com.ebonheart.EbonArtsMod.common.items.tools;

import java.util.List;
import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.items.ItemHelper;
import com.google.common.collect.ImmutableSet;
import com.mojang.realmsclient.gui.ChatFormatting;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class ItemConsecration extends ItemTool {
	
	private static final float DIG_SPEED_WEB = 15.0f;
	private static final float DIG_SPEED_SWORD = 1.5f;
	private static final float DIG_SPEED_DEFAULT = 1.0f;
	private static final float BASE_DAMAGE = 3.0f;
	private static final float ATTACK_SPEED = -2.4f;
	
	public ItemConsecration(float damageVsEntity, ToolMaterial material, Set<Block> effectiveBlocks) 
	{
		super(damageVsEntity, material, effectiveBlocks);
		//super(BASE_DAMAGE, ATTACK_SPEED, material, Collections.emptySet());
		ItemHelper.setItemName(this, "tool/consecration");

		setHarvestLevel("pickaxe", material.getHarvestLevel());
		setHarvestLevel("shovel", material.getHarvestLevel());
		setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) 
	{
		toolTip.add(ChatFormatting.DARK_PURPLE + "\"Divine might rules over");
		toolTip.add(ChatFormatting.DARK_PURPLE + "all of creation.\"");
		toolTip.add(" ");
		toolTip.add(ChatFormatting.GOLD + "Multi-Tool");
		toolTip.add(ChatFormatting.GREEN + "Pickaxe");
		toolTip.add(ChatFormatting.GREEN + "Shovel");
	}
	
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.EPIC;
    }
	
	private static final Set<Material> EFFECTIVE_MATERIALS = ImmutableSet.of(
			// Pickaxe
			Material.rock, Material.iron, Material.ice, Material.glass, Material.piston, Material.anvil, Material.circuits,
			
			// Shovel
			Material.grass, Material.ground, Material.sand, Material.snow, Material.craftedSnow, Material.clay
	);
	
	@Override
	public float getStrVsBlock(ItemStack stack, Block state) 
	{
		for (String type : getToolClasses(stack)) {
			//if (state.getBlockState().getBlock().isToolEffective(type, state))
				return efficiencyOnProperMaterial;
		}

		// Not all blocks have a harvest tool/level set, so we need to fall back to checking the Material like the vanilla tools do
		if (EFFECTIVE_MATERIALS.contains(state.getMaterial())) {
			return efficiencyOnProperMaterial;
		}

		return DIG_SPEED_DEFAULT;
	}
	
}
