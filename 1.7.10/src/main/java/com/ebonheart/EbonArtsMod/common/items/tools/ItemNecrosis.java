package com.ebonheart.EbonArtsMod.common.items.tools;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.stats.StatList;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.common.items.ItemHelper;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.mojang.realmsclient.gui.ChatFormatting;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemNecrosis  extends ItemAxe  {
	
	private static final float DIG_SPEED_WEB = 15.0f;
	private static final float DIG_SPEED_SWORD = 1.5f;
	private static final float DIG_SPEED_DEFAULT = 1.0f;
	private static final float BASE_DAMAGE = 3.0f;
	private static final float ATTACK_SPEED = -2.4f;
	
	public ItemNecrosis(ToolMaterial material) 
	{
		super(material);
		
		this.setUnlocalizedName("tools/necrosis");
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems);
		setHarvestLevel("axe", material.getHarvestLevel());
		
		
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
        return EnumRarity.epic;
    }
	
	@Override
	public Set<String> getToolClasses(ItemStack stack) {
	    return ImmutableSet.of("axe");
	}
	
	private static Set effectiveAgainst = Sets.newHashSet(new Block[] {
		    Blocks.web, Blocks.leaves, Blocks.tallgrass, Blocks.vine, 
		    Blocks.tripwire, Blocks.wool, Blocks.redstone_wire}
	
			);
	
	//@Override
	//public float func_150893_a(ItemStack stack, Block block) {
	//    if (block.getMaterial() == Material.plants || block.getMaterial() == Material.vine || block.getMaterial() == Material.coral	
	//    ||	block.getMaterial() == Material.leaves || block.getMaterial() == Material.gourd || block.getMaterial() == Material.wood
	//    		)
	//        return this.efficiencyOnProperMaterial;
	//    return effectiveAgainst.contains(block) ? this.efficiencyOnProperMaterial : super.func_150893_a(stack, block);
	//}
	@Override
	public boolean func_150897_b(Block p_150897_1_)
    {
        return p_150897_1_ == Blocks.web || p_150897_1_ == Blocks.redstone_wire || p_150897_1_ == Blocks.tripwire;
    }
	@Override
    public float func_150893_a(ItemStack p_150893_1_, Block p_150893_2_)
    {
        return p_150893_2_ != Blocks.web && p_150893_2_.getMaterial() != Material.leaves ? (p_150893_2_ == Blocks.wool ? 5.0F : super.func_150893_a(p_150893_1_, p_150893_2_)) : 15.0F;
    }
	
	@Override
    public boolean itemInteractionForEntity(ItemStack itemstack, EntityPlayer player, EntityLivingBase entity)
    {
        if (entity.worldObj.isRemote)
        {
            return false;
        }
        if (entity instanceof IShearable)
        {
            IShearable target = (IShearable)entity;
            if (target.isShearable(itemstack, entity.worldObj, (int)entity.posX, (int)entity.posY, (int)entity.posZ))
            {
                ArrayList<ItemStack> drops = target.onSheared(itemstack, entity.worldObj, (int)entity.posX, (int)entity.posY, (int)entity.posZ,
                        EnchantmentHelper.getEnchantmentLevel(Enchantment.fortune.effectId, itemstack));

                Random rand = new Random();
                for(ItemStack stack : drops)
                {
                    EntityItem ent = entity.entityDropItem(stack, 1.0F);
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
    public boolean onBlockStartBreak(ItemStack itemstack, int x, int y, int z, EntityPlayer player)
    {
        if (player.worldObj.isRemote)
        {
            return false;
        }
        Block block = player.worldObj.getBlock(x, y, z);
        if (block instanceof IShearable)
        {
            IShearable target = (IShearable)block;
            if (target.isShearable(itemstack, player.worldObj, x, y, z))
            {
                ArrayList<ItemStack> drops = target.onSheared(itemstack, player.worldObj, x, y, z,
                        EnchantmentHelper.getEnchantmentLevel(Enchantment.fortune.effectId, itemstack));
                Random rand = new Random();

                for(ItemStack stack : drops)
                {
                    float f = 0.7F;
                    double d  = (double)(rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
                    double d1 = (double)(rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
                    double d2 = (double)(rand.nextFloat() * f) + (double)(1.0F - f) * 0.5D;
                    EntityItem entityitem = new EntityItem(player.worldObj, (double)x + d, (double)y + d1, (double)z + d2, stack);
                    entityitem.delayBeforeCanPickup = 10;
                    player.worldObj.spawnEntityInWorld(entityitem);
                }

                itemstack.damageItem(1, player);
                player.addStat(StatList.mineBlockStatArray[Block.getIdFromBlock(block)], 1);
            }
        }
        return false;
    }
}
