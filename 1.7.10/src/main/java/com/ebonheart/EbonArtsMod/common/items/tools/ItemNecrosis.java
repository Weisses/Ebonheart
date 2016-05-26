package com.ebonheart.EbonArtsMod.common.items.tools;

import java.util.List;
import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.items.ItemHelper;
import com.google.common.collect.ImmutableSet;
import com.mojang.realmsclient.gui.ChatFormatting;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemNecrosis extends ItemTool {
	
	private static final float DIG_SPEED_WEB = 15.0f;
	private static final float DIG_SPEED_SWORD = 1.5f;
	private static final float DIG_SPEED_DEFAULT = 1.0f;
	private static final float BASE_DAMAGE = 3.0f;
	private static final float ATTACK_SPEED = -2.4f;
	
	public ItemNecrosis(float damageVsEntity, ToolMaterial material, Set<Block> effectiveBlocks) 
	{
		super(damageVsEntity, material, effectiveBlocks);
		ItemHelper.setItemName(this, "tool/necrosis");
		
		setHarvestLevel("axe", material.getHarvestLevel());
		setCreativeTab(EbonArtsMod.tabEbonArtsItems);
		
		// Waila Harvestability sets the harvest tool of Cobwebs to "sword"
		setHarvestLevel("sword", material.getHarvestLevel());
		
	}
	
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) 
	{
		toolTip.add(ChatFormatting.DARK_PURPLE + "\"Organic matter must yield");
		toolTip.add(ChatFormatting.DARK_PURPLE + "to darkness.\"");
		toolTip.add(" ");
		toolTip.add(ChatFormatting.GOLD + "Multi-Tool");
		toolTip.add(ChatFormatting.GREEN + "Axe");
		toolTip.add(ChatFormatting.GREEN + "Shears");
	}
	
	public EnumRarity getRarity(ItemStack stack)
    {
        return EnumRarity.EPIC;
    }
	
	private static final Set<Material> EFFECTIVE_MATERIALS = ImmutableSet.of(
			
			// Axe
			Material.wood, Material.gourd, Material.plants, Material.vine
			
	);
	
	private static final Set<Material> SWORD_MATERIALS = ImmutableSet.of(
			Material.plants, Material.vine, Material.coral, Material.leaves, Material.gourd
	);
	
	@Override
	public float getStrVsBlock(ItemStack stack, Block state) 
	{
		if (state.getBlockState().getBlock() == Blocks.web) 
		{
			return DIG_SPEED_WEB;
		}

		for (String type : getToolClasses(stack)) 
		{
			//if (state.getBlock().isToolEffective(type, state))
				return efficiencyOnProperMaterial;
		}

		// Not all blocks have a harvest tool/level set, so we need to fall back to checking the Material like the vanilla tools do
		if (EFFECTIVE_MATERIALS.contains(state.getMaterial())) 
		{
			return efficiencyOnProperMaterial;
		}

		if (SWORD_MATERIALS.contains(state.getMaterial())) 
		{
			return DIG_SPEED_SWORD;
		}

		return DIG_SPEED_DEFAULT;
	}
	
	@Override
    public boolean onBlockDestroyed(ItemStack stack, World worldIn, Block blockIn, BlockPos pos, EntityLivingBase entityLiving)
    {
        stack.damageItem(1, entityLiving);
        Block block = blockIn.getBlockState().getBlock();
        return blockIn.getMaterial() != Material.leaves && block != Blocks.web && block != Blocks.tallgrass && block != Blocks.vine && block != Blocks.tripwire && block != Blocks.wool && !(blockIn instanceof net.minecraftforge.common.IShearable) ? super.onBlockDestroyed(stack, worldIn, blockIn, pos, entityLiving) : true;
    }
	
    public boolean canHarvestBlock(IBlockState blockIn)
    {
        Block block = blockIn.getBlock();
        return block == Blocks.web || block == Blocks.redstone_wire || block == Blocks.tripwire;
    }
    
    
    
    @Override
    public boolean itemInteractionForEntity(ItemStack itemstack, net.minecraft.entity.player.EntityPlayer player, EntityLivingBase entity)
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
                        net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(net.minecraft.enchantment.Enchantment.fortune.effectId, itemstack));

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
                        net.minecraft.enchantment.EnchantmentHelper.getEnchantmentLevel(net.minecraft.enchantment.Enchantment.fortune.effectId, itemstack));
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
                player.addStat(net.minecraft.stats.StatList.mineBlockStatArray[Block.getIdFromBlock(block)], 1);
            }
        }
        return false;
    }
	
}
