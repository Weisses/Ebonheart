package com.ebonheart.EbonArtsMod.common.items.tools;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.items.ItemHelper;
import com.google.common.collect.ImmutableSet;


public class ItemConsecration extends ItemTool {

	/**
	 * The speed at which Cobwebs are harvested
	 */
	private static final float DIG_SPEED_WEB = 15.0f;

	/**
	 * The speed at which Sword-effective {@link Material}s are harvested
	 */
	private static final float DIG_SPEED_SWORD = 1.5f;

	/**
	 * The speed at which blocks are harvested if this isn't their correct tool
	 */
	private static final float DIG_SPEED_DEFAULT = 1.0f;

	/**
	 * The base attack damage before the {@link net.minecraft.item.Item.ToolMaterial}'s attack damage is factored in
	 */
	private static final float BASE_DAMAGE = 3.0f;

	/**
	 * The attack speed
	 */
	private static final float ATTACK_SPEED = -2.4f;

	public ItemConsecration(ToolMaterial toolMaterial) {
		super(BASE_DAMAGE, ATTACK_SPEED, toolMaterial, Collections.emptySet());

		ItemHelper.setItemName(this, "tool/consecration");

		setHarvestLevel("pickaxe", toolMaterial.getHarvestLevel());
		//setHarvestLevel("axe", toolMaterial.getHarvestLevel());
		setHarvestLevel("shovel", toolMaterial.getHarvestLevel());

		// Waila Harvestability sets the harvest tool of Cobwebs to "sword"
		//setHarvestLevel("sword", toolMaterial.getHarvestLevel());

		setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) {
		toolTip.add(TextFormatting.DARK_PURPLE + "\"Divine might rules over");
		toolTip.add(TextFormatting.DARK_PURPLE + "all of creation.\"");
		toolTip.add(" ");
		toolTip.add(TextFormatting.GOLD + "Multi-Tool");
		toolTip.add(TextFormatting.GREEN + "Pickaxe");
		toolTip.add(TextFormatting.GREEN + "Shovel");
	}
	
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.EPIC;
    }

	/**
	 * The {@link Material}s that this tool is effective on.
	 */
	private static final Set<Material> EFFECTIVE_MATERIALS = ImmutableSet.of(
			// Pickaxe
			Material.rock, Material.iron, Material.ice, Material.glass, Material.piston, Material.anvil, Material.circuits,

			// Axe
			//Material.wood, Material.gourd, Material.plants, Material.vine,

			// Shovel
			Material.grass, Material.ground, Material.sand, Material.snow, Material.craftedSnow, Material.clay
	);

	/**
	 * The {@link Material}s that Swords are effective on.
	 */
	//private static final Set<Material> SWORD_MATERIALS = ImmutableSet.of(
	//		Material.plants, Material.vine, Material.coral, Material.leaves, Material.gourd
	//);

	/**
	 * Can this tool harvest the {@link IBlockState}?
	 * <p>
	 * This should only be used by {@link ForgeHooks#canHarvestBlock(Block, EntityPlayer, IBlockAccess, BlockPos)},
	 * use the tool class/harvest level system where possible.
	 *
	 * @param state The IBlockState
	 * @param stack The tool
	 * @return Is this tool effective on the {@link IBlockState}'s {@link Material}?
	 */
	//@Override
	//public boolean canHarvestBlock(IBlockState state, ItemStack stack) {
	//	return EFFECTIVE_MATERIALS.contains(state.getMaterial()) || state.getBlock() == Blocks.web;
	//}

	@Override
	public float getStrVsBlock(ItemStack stack, IBlockState state) {
		//if (state.getBlock() == Blocks.web) {
		//	return DIG_SPEED_WEB;
		//}

		for (String type : getToolClasses(stack)) {
			if (state.getBlock().isToolEffective(type, state))
				return efficiencyOnProperMaterial;
		}

		// Not all blocks have a harvest tool/level set, so we need to fall back to checking the Material like the vanilla tools do
		if (EFFECTIVE_MATERIALS.contains(state.getMaterial())) {
			return efficiencyOnProperMaterial;
		}

		//if (SWORD_MATERIALS.contains(state.getMaterial())) {
		//	return DIG_SPEED_SWORD;
		//}

		return DIG_SPEED_DEFAULT;
	}
	
	
	
	
	
	//public boolean hitEntity(ItemStack itemStack, EntityLivingBase target, EntityLivingBase attacker) {
	//	itemStack.damageItem(1, attacker); // Only reduce the durability by 1 point (like swords do) instead of 2 (like tools do)
	//	return true;
	}