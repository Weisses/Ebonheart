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

public class ItemNecrosis extends ItemTool {

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

	public ItemNecrosis(ToolMaterial toolMaterial) {
		super(BASE_DAMAGE, ATTACK_SPEED, toolMaterial, Collections.emptySet());

		ItemHelper.setItemName(this, "tool/necrosis");

		setHarvestLevel("axe", toolMaterial.getHarvestLevel());
		
		// Waila Harvestability sets the harvest tool of Cobwebs to "sword"
		setHarvestLevel("sword", toolMaterial.getHarvestLevel());

		setCreativeTab(EbonArtsMod.tabEbonArtsItems);
	}
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) {
		toolTip.add(TextFormatting.DARK_PURPLE + "\"Organic matter must yield");
		toolTip.add(TextFormatting.DARK_PURPLE + "to darkness.\"");
		toolTip.add(" ");
		toolTip.add(TextFormatting.GOLD + "Multi-Tool");
		toolTip.add(TextFormatting.GREEN + "Axe");
		toolTip.add(TextFormatting.GREEN + "Shears");
	}
	
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.EPIC;
    }

	/**
	 * The {@link Material}s that this tool is effective on.
	 */
	private static final Set<Material> EFFECTIVE_MATERIALS = ImmutableSet.of(
			
			// Axe
			Material.wood, Material.gourd, Material.plants, Material.vine
			
	);

	/**
	 * The {@link Material}s that Swords are effective on.
	 */
	private static final Set<Material> SWORD_MATERIALS = ImmutableSet.of(
			Material.plants, Material.vine, Material.coral, Material.leaves, Material.gourd
	);

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
		if (state.getBlock() == Blocks.web) {
			return DIG_SPEED_WEB;
		}

		for (String type : getToolClasses(stack)) {
			if (state.getBlock().isToolEffective(type, state))
				return efficiencyOnProperMaterial;
		}

		// Not all blocks have a harvest tool/level set, so we need to fall back to checking the Material like the vanilla tools do
		if (EFFECTIVE_MATERIALS.contains(state.getMaterial())) {
			return efficiencyOnProperMaterial;
		}

		if (SWORD_MATERIALS.contains(state.getMaterial())) {
			return DIG_SPEED_SWORD;
		}

		return DIG_SPEED_DEFAULT;
	}

	
	 /**
     * Called when a Block is destroyed using this Item. Return true to trigger the "Use Item" statistic.
     */
	@Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, IBlockState blockIn, BlockPos pos, EntityLivingBase entityLiving)
    {
        stack.damageItem(1, entityLiving);
        Block block = blockIn.getBlock();
        return blockIn.getMaterial() != Material.leaves && block != Blocks.web && block != Blocks.tallgrass && block != Blocks.vine && block != Blocks.tripwire && block != Blocks.wool && !(blockIn instanceof net.minecraftforge.common.IShearable) ? super.onBlockDestroyed(stack, worldIn, blockIn, pos, entityLiving) : true;
    }

    /**
     * Check whether this Item can harvest the given Block
     */
    public boolean canHarvestBlock(IBlockState blockIn)
    {
        Block block = blockIn.getBlock();
        return block == Blocks.web || block == Blocks.redstone_wire || block == Blocks.tripwire;
    }

    //public float getStrVsBlock(ItemStack stack, IBlockState state)
    //{
    //    Block block = state.getBlock();
    //    return block != Blocks.web && state.getMaterial() != Material.leaves ? (block == Blocks.wool ? 5.0F : super.getStrVsBlock(stack, state)) : 15.0F;
    //}


    /**
     * Returns true if the item can be used on the given entity, e.g. shears on sheep.
     */
    @Override
    public boolean itemInteractionForEntity(ItemStack itemstack, net.minecraft.entity.player.EntityPlayer player, EntityLivingBase entity, net.minecraft.util.EnumHand hand)
    {
        if (entity.worldObj.isRemote)
        {
            return false;
        }
        if (entity instanceof net.minecraftforge.common.IShearable)
        {
            net.minecraftforge.common.IShearable target = (net.minecraftforge.common.IShearable)entity;
            BlockPos pos = new BlockPos(entity.posX, entity.posY, entity.posZ);
            if (target.isShearable(itemstack, entity.worldObj, pos))
            {
                java.util.List<ItemStack> drops = target.onSheared(itemstack, entity.worldObj, pos,
                        net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(net.minecraft.init.Enchantments.fortune, itemstack));

                java.util.Random rand = new java.util.Random();
                for(ItemStack stack : drops)
                {
                    net.minecraft.entity.item.EntityItem ent = entity.entityDropItem(stack, 1.0F);
                    ent.motionY += rand.nextFloat() * 0.05F;
                    ent.motionX += (rand.nextFloat() - rand.nextFloat()) * 0.1F;
                    ent.motionZ += (rand.nextFloat() - rand.nextFloat()) * 0.1F;
                }
                itemstack.damageItem(1, entity);
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean onBlockStartBreak(ItemStack itemstack, BlockPos pos, net.minecraft.entity.player.EntityPlayer player)
    {
        if (player.worldObj.isRemote || player.capabilities.isCreativeMode)
        {
            return false;
        }
        Block block = player.worldObj.getBlockState(pos).getBlock();
        if (block instanceof net.minecraftforge.common.IShearable)
        {
            net.minecraftforge.common.IShearable target = (net.minecraftforge.common.IShearable)block;
            if (target.isShearable(itemstack, player.worldObj, pos))
            {
                java.util.List<ItemStack> drops = target.onSheared(itemstack, player.worldObj, pos,
                        net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(net.minecraft.init.Enchantments.fortune, itemstack));
                java.util.Random rand = new java.util.Random();

                for(ItemStack stack : drops)
                {
                    float f = 0.7F;
                    double d  = (double)(rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
                    double d1 = (double)(rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
                    double d2 = (double)(rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
                    net.minecraft.entity.item.EntityItem entityitem = new net.minecraft.entity.item.EntityItem(player.worldObj, (double)pos.getX() + d, (double)pos.getY() + d1, (double)pos.getZ() + d2, stack);
                    entityitem.setDefaultPickupDelay();
                    player.worldObj.spawnEntityInWorld(entityitem);
                }

                itemstack.damageItem(1, player);
                player.addStat(net.minecraft.stats.StatList.func_188055_a(block));
            }
        }
        return false;
    }
	
	
	//public boolean hitEntity(ItemStack itemStack, EntityLivingBase target, EntityLivingBase attacker) {
	//	itemStack.damageItem(1, attacker); // Only reduce the durability by 1 point (like swords do) instead of 2 (like tools do)
	//	return true;
	}