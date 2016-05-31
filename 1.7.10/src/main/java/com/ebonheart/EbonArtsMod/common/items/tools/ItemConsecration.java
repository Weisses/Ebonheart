package com.ebonheart.EbonArtsMod.common.items.tools;

import java.util.List;
import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.UseHoeEvent;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.items.ItemHelper;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.realmsclient.gui.ChatFormatting;

import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class ItemConsecration extends ItemPickaxe {
	
	private static final float DIG_SPEED_WEB = 15.0f;
	private static final float DIG_SPEED_SWORD = 1.5f;
	private static final float DIG_SPEED_DEFAULT = 1.0f;
	private static final float BASE_DAMAGE = 3.0f;
	private static final float ATTACK_SPEED = -2.4f;
	
	public ItemConsecration(float damageVsEntity, ToolMaterial material, Set<Block> effectiveBlocks) 
	{
		super(material);
		
		this.setUnlocalizedName("tools/consecration");
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
		setHarvestLevel("pickaxe", material.getHarvestLevel());
		setHarvestLevel("shovel", material.getHarvestLevel());
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
        return EnumRarity.epic;
    }
	
	@Override
	public Set<String> getToolClasses(ItemStack stack) {
	    return ImmutableSet.of("pickaxe", "spade");
	}
	
	private static Set effectiveAgainst = Sets.newHashSet(new Block[] {
		    Blocks.grass, Blocks.dirt, Blocks.sand, Blocks.gravel, 
		    Blocks.snow_layer, Blocks.snow, Blocks.clay, Blocks.farmland, 
		    Blocks.soul_sand, Blocks.mycelium}
	
			);
	
	@Override
	public boolean func_150897_b(Block block) {
	    return effectiveAgainst.contains(block) ? true : super.func_150897_b(block);
	}
	
	@Override
	public float func_150893_a(ItemStack stack, Block block) {
	    if (block.getMaterial() == Material.rock || block.getMaterial() == Material.iron || block.getMaterial() == Material.ice	
	    ||	block.getMaterial() == Material.glass || block.getMaterial() == Material.piston || block.getMaterial() == Material.anvil || block.getMaterial() == Material.circuits
	    ||	block.getMaterial() == Material.grass || block.getMaterial() == Material.ground || block.getMaterial() == Material.sand
	    ||	block.getMaterial() == Material.snow || block.getMaterial() == Material.craftedSnow || block.getMaterial() == Material.clay	
	    		)
	        return this.efficiencyOnProperMaterial;
	    return effectiveAgainst.contains(block) ? this.efficiencyOnProperMaterial : super.func_150893_a(stack, block);
	}
	
}
